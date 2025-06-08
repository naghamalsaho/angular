

parser grammar ComponentParser;

options {
  tokenVocab = ComponentLexer;
}

component
   : importStatements?
     AT_COMPONENT LEFT_PAREN componentConfig                              #ComponentDefinition
   ;

importStatements
    : (importStatement SEMICOLON)+
    ;

importStatement
    : IMPORT LEFT_CURLY IDENTIFIER RIGHT_CURLY FROM STRING_LITERAL
    ;

componentConfig
   : LEFT_CURLY
     SELECTOR_KEYWORD COLON STRING_LITERAL
     COMMA STANDALONE COLON BOOLEAN_LITERAL
     COMMA IMPORTS COLON LEFT_BRACKET (STRING_LITERAL | IDENTIFIER(COMMA STRING_LITERAL)*)? RIGHT_BRACKET
     COMMA TEMPLATE COLON BACKTICK htmlElement+ BACKTICK COMMA
     RIGHT_CURLY RIGHT_PAREN
     (classDeclaration)+                                                 #ComponentConfigg
   ;

classDeclaration
    : EXPORT CLASS className LEFT_CURLY classBody RIGHT_CURLY           #ClassDecl
    ;

classBody
    : (fieldDeclaration | methodDeclaration | assignment)*              #ClassBodyy
    ;

    assignment
    : THIS DOT IDENTIFIER EQUAL expression SEMICOLON                    #ThisAssignment
    | IDENTIFIER EQUAL expression SEMICOLON                             #VarAssignment
    ;

expression
    : primaryExpression ((PLUS | MINUS) primaryExpression)*             #BinaryExpr
    ;

primaryExpression
    : IDENTIFIER                                                        #IdentifierExpr
    | literal                                                           #LiteralExpr
    | arrayAccess                                                       #ArrayAccessExpr
    | LEFT_PAREN expression RIGHT_PAREN                                                #ParenExpr
    ;

arrayAccess
    : IDENTIFIER LEFT_BRACKET expression RIGHT_BRACKET                 #ArrayAccesss
    ;

literal
    : STRING_LITERAL                                                    #StringLiteral
    | NUMBER_LITERAL                                                    #NumberLiteral
    | BOOLEAN_LITERAL                                                   #BooleanLiteral
    ;

fieldDeclaration
   : variableName EQUAL array SEMICOLON                                #FieldDecl
   ;

variableDeclaration
    : type variableName EQUAL value SEMICOLON                          #VarDecl
    ;

methodDeclaration
    : IDENTIFIER LEFT_PAREN parameterList? RIGHT_PAREN block           #MethodDecl
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : IDENTIFIER COLON ANY_TYPE
    | IDENTIFIER COLON STRING_TYPE
    | IDENTIFIER COLON NUMBER_TYPE
    ;

type
    : ANY_TYPE
    | STRING_TYPE
    | NUMBER_TYPE
    ;

block
    : LEFT_CURLY statement* RIGHT_CURLY
    ;

value
    : STRING_LITERAL
    | BACKTICK_STRING
    | BOOLEAN_LITERAL
    | NUMBER_LITERAL
    | IDENTIFIER
    | thisAccess
    ;

parameters
    : (type variableName (COMMA  type variableName)*)?
    ;

variableName
    : IDENTIFIER
    ;

methodName
    : IDENTIFIER
    ;

className
    : IDENTIFIER
    ;


array
    : LEFT_BRACKET (jsonObject (COMMA jsonObject)*)? RIGHT_BRACKET
    | thisAccess
    ;

jsonObject
    : LEFT_CURLY pair (COMMA pair)* RIGHT_CURLY
    ;

pair
    : (STRING_LITERAL | IDENTIFIER) COLON value
    ;

statement
    : assignment SEMICOLON
    | (value | IDENTIFIER) SEMICOLON
    | assignment
    ;

thisAccess
    : THIS DOT IDENTIFIER (LEFT_BRACKET value RIGHT_BRACKET)?
      ( PLUS PLUS
      | MINUS MINUS
      | PLUS_ASSIGN expression
      | MINUS_ASSIGN expression
      | EQUAL expression
      )?
    ;
componentHTMLContent
    : elements+=htmlElement+                         #ComponentHTMLGroup
    ;



htmlElement
    : openTagElement                                                    #OpenTag
    | divElement                                                        #Div
    | h2Element                                                         #H2
    | imgElement                                                        #Img
    | pElement                                                          #P
    | genericElement                                                    #Generic
    | HTML_TAG_SELF_CLOSING                                             #SelfClosingTag
    | DYNAMIC_CONTENT                                                   #DynamicHtmlContent
    | buttonElement                                                     #Button
    | spanElement                                                       #Span
    ;

openTagElement
    : HTML_TAG_OPEN componentHTMLContent? HTML_TAG_CLOSE
    ;

divElement
    : HTML_TAG_OPEN_DIV (htmlAttributes)* htmlContent HTML_TAG_CLOSE_DIV
    ;

h2Element
    : HTML_TAG_OPEN_H2 dynamicContent HTML_TAG_CLOSE_H2
    ;

imgElement
    : HTML_TAG_OPEN_IMG (htmlAttributes | dynamicAttribute)* HTML_TAG_CLOSE_IMG
    ;

pElement
    : HTML_TAG_OPEN_P (DYNAMIC_CONTENT | STRING_LITERAL)* HTML_TAG_CLOSE_P
    ;

genericElement
    : HTML_TAG_OPEN IDENTIFIER (htmlAttributes)* HTML_TAG_CLOSE
    ;
buttonElement
    : HTML_TAG_OPEN_BUTTON htmlAttribute* GREAND_THAN
      (htmlElement)*

      HTML_TAG_CLOSE_BUTTON
    ;


spanElement
    : HTML_TAG_OPEN_SPAN (CUSTOM_DIRECTIVE | EVENT_BINDING)* (DYNAMIC_CONTENT | STRING_LITERAL)* HTML_TAG_CLOSE_SPAN
    ;

dynamicAttribute
    : LEFT_BRACKET IDENTIFIER RIGHT_BRACKET EQUAL STRING_LITERAL
    ;

htmlAttribute
    : EVENT_BINDING
    | DYNAMIC_ATTRIBUTE
    | CUSTOM_DIRECTIVE
    | ATTRIBUTE_NAME EQUAL ATTRIBUTE_VALUE
    ;


dynamicContent
    : DYNAMIC_CONTENT (PLUS STRING_LITERAL)*
    ;


htmlContent
    : (htmlElement
       | DYNAMIC_CONTENT
       | CUSTOM_DIRECTIVE
       | STRING_LITERAL
       | IDENTIFIER
       | EVENT_BINDING)*
    ;

htmlAttributes
    : SRC_ATTRIBUTE
    | ALT_ATTRIBUTE
    | DYNAMIC_ATTRIBUTE
    | eventBinding

    ;

    customDirective
        : MULTIPLY IDENTIFIER EQUAL  ATTRIBUTE_VALUE
        ;
eventBinding
    : LEFT_PAREN IDENTIFIER RIGHT_PAREN EQUAL  (
          ATTRIBUTE_VALUE
        | IDENTIFIER LEFT_PAREN IDENTIFIER (COMMA IDENTIFIER)* RIGHT_PAREN
      )
    ;

