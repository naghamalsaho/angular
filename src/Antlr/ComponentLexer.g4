 lexer grammar ComponentLexer;

IMPORT          : 'import'  ;
FROM            : 'from'   ;
EXPORT          : 'export'   ;
//TYPE SCRIPT
AT_COMPONENT    : '@Component' ;
SELECTOR_KEYWORD: 'selector' ;
STANDALONE      : 'standalone' ;
IMPORTS         :'imports';
TEMPLATE        : 'template'  ;
CLASS           : 'class'  ;
STYLES          : 'styles'  ;
FUNCTION        : 'function'  ;
STRING_TYPE     : 'string' ;
NUMBER_TYPE     : 'number' ;
ANY_TYPE        : 'any'  ;
BOOLEAN_LITERAL : 'true' | 'false'  ;
NUMBER_LITERAL  : [0-9]+ ('.' [0-9]+)? ;
STRING_LITERAL
    : '"' ( ~["\\] | '\\' . )* '"'
    | '\'' ( ~['\\] | '\\' . )* '\''
    ;



COMMA           : ',' ;
COLON           : ':' ;
DOT             : '.' ;
SEMICOLON       : ';' ;
EQUAL           : '=' ;
THIS            :'this';


LEFT_CURLY      : '{'  ;
RIGHT_CURLY     : '}'  ;
LEFT_PAREN      : '('  ;
RIGHT_PAREN     : ')' ;
LEFT_BRACKET  : '['   ;
RIGHT_BRACKET : ']'   ;
LESS_THAN : '<';
GREAND_THAN:'>';

WS              : [ \t\r\n]+ -> skip ;
IDENTIFIER      : [a-zA-Z_][a-zA-Z_0-9]*  ;
HHTML_COMMENT
     : '<!--' .*? '-->' -> skip
     ;
SPACE   : [ \t\r\n]+ -> skip ;

SRC_ATTRIBUTE : 'src' '=' STRING_LITERAL ;

HTML_TAG_OPEN_DIV
    : '<div' (SPACE (ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE | DYNAMIC_ATTRIBUTE | CUSTOM_DIRECTIVE | EVENT_BINDING))* '>'
    ;

HTML_TAG_CLOSE_DIV     : '</div>';
// تعريفات HTML الخاصة
HTML_TAG_OPEN_H2      : '<h2>';
HTML_TAG_CLOSE_H2     : '</h2>';
HTML_TAG_OPEN_IMG
    : '<img'
    ;

HTML_TAG_CLOSE_IMG     : '/>';
HTML_TAG_OPEN_P
    : '<p>'
    ;

HTML_TAG_CLOSE_P
    : '</p>'
    ;
HTML_TAG_OPEN_BUTTON
        : '<button' (SPACE (ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE | DYNAMIC_ATTRIBUTE | EVENT_BINDING))* '>'
        ;
HTML_TAG_CLOSE_BUTTON
        : '</button>'
        ;
HTML_TAG_OPEN_SPAN
    : '<span' (SPACE (ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE | DYNAMIC_ATTRIBUTE))* '>'
    ;

HTML_TAG_CLOSE_SPAN
    : '</span>'
    ;

CUSTOM_DIRECTIVE
    : '*' IDENTIFIER '=' ATTRIBUTE_VALUE
    ;
EVENT_BINDING
    : '(' IDENTIFIER ')' '=' ATTRIBUTE_VALUE
    ;

ALT_ATTRIBUTE          : 'alt' '=' STRING_LITERAL;
HTML_TAG_OPEN
    : '<' IDENTIFIER (SPACE (ATTRIBUTE_NAME '=' ATTRIBUTE_VALUE | DYNAMIC_ATTRIBUTE))* '>'
    ;

HTML_TAG_CLOSE      : '</' IDENTIFIER '>' ;
HTML_SELF_CLOSING_TAG : '<' IDENTIFIER (SPACE (IDENTIFIER | STRING_LITERAL))* '/>' ;

DYNAMIC_CONTENT
    : '{{' (~[{}])* ~[ \t\r\n]+ (~[{}])* '}}'
    ;

PLUS : '+' ;
MINUS : '-' ;
MULTIPLY : '*';
DIV :'/' ;
MODULUS: '%';

ATTRIBUTE_NAME  : IDENTIFIER ;
ATTRIBUTE_VALUE : '"' ( ~["\\] | '\\' . )* '"'
                      | '\'' ( ~['\\] | '\\' . )* '\'';

STYLE_ATTRIBUTE : 'style' '=' ATTRIBUTE_VALUE ;
HTML_ATTRIBUTE
    : IDENTIFIER EQUAL (STRING_LITERAL | IDENTIFIER)
    ;
BACKTICK
    : '`' ;

DYNAMIC_ATTRIBUTE
    : '[' IDENTIFIER ']' '=' STRING_LITERAL
    ; 