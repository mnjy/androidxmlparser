grammar Dimens;

@header {
package dimens;
}

/* Lexical rules */
/*  example:  <dimen name="review_scrubber_large">12dp</dimen> */
SIZE : [0-9][0-9]* ;
NAME : [A-Za-z_][A-Za-z_]* ;
EQUALS : '=' ;
QUOTE : '"' ;
OPENBRACKET : '<' ;
CLOSEBRACKET : '>' ;
SLASH : '/' ;
COMMENT : '<!--' .*? [\r\n] -> skip ;
NEWLINE : [\r\n]+ ;
WS : [ \t]+ -> skip ;

/* Parser rules */
root : file EOF ;
file : open (NEWLINE line?)* close ;
line : OPENBRACKET 'dimen' 'name' EQUALS QUOTE NAME QUOTE CLOSEBRACKET QUOTE SIZE 'dp' OPENBRACKET SLASH 'dimen' CLOSEBRACKET ;
open : OPENBRACKET 'resources' CLOSEBRACKET ;
close : OPENBRACKET SLASH 'resources' CLOSEBRACKET ;