grammar CalculatorLanguage;

start
    :
    | expression EOF
    ;

expression
    : number
    | openParenthese expression closeParenthese (operator expression)?
    | number (operator expression)*
    ;

operator : (power | multiply | divide | add | subtract);
//extra
WHITESPACE : ' ' -> skip;

//math things
add : '+';
subtract : '-';
multiply : '*';
divide : '/';
power : '^';
decimal : '.';
openParenthese : '(';
closeParenthese : ')';

//datatype names
number
    :
    |   DIGIT (decimal)? (DIGIT)*?
    ;

DIGIT : '0'..'9'+;