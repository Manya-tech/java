#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

// Enumeration for token types
typedef enum {
    TOKEN_VAR,
    TOKEN_COLON,
    TOKEN_TYPE,
    TOKEN_NEWLINE,
    TOKEN_UNKNOWN
} TokenType;

// Structure to represent a token
typedef struct {
    TokenType type;
    char value[50];
} Token;

// Function to tokenize the input specification
Token* tokenize(const char* input_specification, int* numTokens) {
    Token* tokens = malloc(100 * sizeof(Token));
    *numTokens = 0;

    char* token = strtok((char*)input_specification, " \t\n");
    while (token != NULL) {
        Token t;
        if (strcmp(token, "var") == 0) {
            t.type = TOKEN_VAR;
        } else if (strcmp(token, ":") == 0) {
            t.type = TOKEN_COLON;
        } else if (strcmp(token, "int") == 0 || strcmp(token, "float") == 0) {
            t.type = TOKEN_TYPE;
        } else if (strcmp(token, "\n") == 0) {
            t.type = TOKEN_NEWLINE;
        } else {
            t.type = TOKEN_UNKNOWN;
        }
        strcpy(t.value, token);
        tokens[(*numTokens)++] = t;

        token = strtok(NULL, " \t\n");
    }

    return tokens;
}

// Function to check for duplicate variable declarations
int checkDuplicateVariables(Token* tokens, int numTokens) {
    for (int i = 0; i < numTokens; ++i) {
        if (tokens[i].type == TOKEN_VAR && i + 2 < numTokens && tokens[i + 2].type == TOKEN_VAR) {
            printf("Syntax error: Duplicate variable '%s'\n", tokens[i + 1].value);
            return 1; // Duplicate variable found
        }
    }
    return 0; // No duplicate variable found
}

// Function to check if the type of a variable is declared correctly
int checkVariableType(Token* tokens, int numTokens) {
    for (int i = 0; i < numTokens; ++i) {
        if (tokens[i].type == TOKEN_VAR && i + 2 < numTokens && tokens[i + 2].type == TOKEN_UNKNOWN) {
            if (strcmp(tokens[i + 2].value, "int") != 0 && strcmp(tokens[i + 2].value, "float") != 0) {
                printf("Syntax error: Invalid variable type '%s' for variable '%s'\n", tokens[i + 2].value, tokens[i + 1].value);
                return 1; // Invalid variable type
            }
        }
    }
    return 0; // No invalid variable type found
}

int validateSpecification(const char* input_specification) {
    int numTokens;
    Token* tokens = tokenize(input_specification, &numTokens);

    // Check for duplicate variables
    if (checkDuplicateVariables(tokens, numTokens)) {
        free(tokens);
        return 1;
    }

    // Check for variable types
    if (checkVariableType(tokens, numTokens)) {
        free(tokens);
        return 1;
    }

    printf("No syntax errors found.\n");

    free(tokens);
    return 0;
}

int main() {
    const char* input_specification = "var x: int\nvar y: float\nvar z: string\nvar x: int\nvar y: float";
    
    if (validateSpecification(input_specification) != 0) {
        return 1;
    }

    return 0;
}


    

