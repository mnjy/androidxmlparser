grammar Colors;

@header {
package colors;
}

/* Lexical rules */
/*  example:      <color name="tab_title">#a5a1a2</color> */
HEX : '#'[A-Za-z0-9][A-Za-z0-9]* ;
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
line : OPENBRACKET 'color' 'name' EQUALS QUOTE NAME QUOTE CLOSEBRACKET QUOTE HEX OPENBRACKET SLASH 'color' CLOSEBRACKET ;
open : OPENBRACKET 'resources' CLOSEBRACKET ;
close : OPENBRACKET SLASH 'resources' CLOSEBRACKET ;