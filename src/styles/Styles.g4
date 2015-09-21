grammar Styles;

@header {
package styles;
}

/* Lexical rules */
/*  example:      
	<style name="Sing.Text.Share.Icon" parent="Sing.Text.Body">
	    <item name="fontPath">fonts/ProximaNova-Regular.ttf</item>
        <item name="android:textColor">@color/body_text_grey</item>
        <item name="android:textSize">@dimen/share_icon_label</item>
        <item name="android:layout_width">@dimen/share_icon_width</item>
        <item name="android:layout_height">match_parent</item>
        <item name="android:drawablePadding">@dimen/margin_small</item>
        <item name="android:gravity">center_horizontal</item>
    </style> */
SIZE : [0-9][0-9]* ;
NAME : [A-Za-z_][A-Za-z_]* ;
STYLE_NAME : (NAME|'.')+ ;
EQUALS : '=' ;
QUOTE : '"' ;
OPENBRACKET : '<' ;
CLOSEBRACKET : '>' ;
COLON : ':' ;
SLASH : '/' ;
ATSIGN : '@' ;
COMMENT : '<!--' .*? [\r\n] -> skip ;
NEWLINE : [\r\n]+ ;
WS : [ \t]+ -> skip ;

/* Parser rules */
root : file EOF ;
file : open (NEWLINE | style_def)* close ;

style_def : start_style_phrase NEWLINE? ( font_phrase | color_phrase | dimen_phrase | ignore_phrase | NEWLINE )* NEWLINE? end_style_phrase ;

start_style_phrase : OPENBRACKET 'style' name_info parent_info? CLOSEBRACKET ;
font_phrase : OPENBRACKET 'item' 'name' EQUALS QUOTE 'android' COLON 'fontPath' CLOSEBRACKET 'fonts' SLASH NAME OPENBRACKET SLASH 'item' CLOSEBRACKET ;
color_phrase : OPENBRACKET 'item' 'name' EQUALS QUOTE 'android' COLON 'textColor' CLOSEBRACKET ATSIGN 'color' SLASH NAME OPENBRACKET SLASH 'item' CLOSEBRACKET ;
dimen_phrase : OPENBRACKET 'item' 'name' EQUALS QUOTE 'android' COLON 'textSize' CLOSEBRACKET ATSIGN 'dimen' SLASH NAME OPENBRACKET SLASH 'item' CLOSEBRACKET ;
ignore_phrase : OPENBRACKET 'item' 'name' EQUALS QUOTE 'android' COLON NAME CLOSEBRACKET NAME OPENBRACKET SLASH 'item' CLOSEBRACKET ;
end_style_phrase : OPENBRACKET SLASH 'style' CLOSEBRACKET ;

open : OPENBRACKET 'resources' CLOSEBRACKET ;
close : OPENBRACKET SLASH 'resources' CLOSEBRACKET ;
name_info : 'name' EQUALS QUOTE STYLE_NAME QUOTE ;
parent_info : 'parent' EQUALS QUOTE STYLE_NAME QUOTE ;