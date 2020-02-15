package programa7;
import static programa7.Tokens.*;
%%
%class Lexico
%type Tokens
L = [a-zA-Z_]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"(" {return PARENT IZQ;}
")" {return PARENT DER;}
"NOT" {return NOT;}
"not" {return NOT;}
"Not" {return NOT;}
"And" {return AND;}
"and" {return AND;}
"AND" {return AND;}
"or" {return SI;}
"Or" {return SI;}
"OR" {return SII;}
"True" {return TRUE;}
"TRUE" {return TRUE;}
"true" {return TRUE;}
"FALSE" {return FALSE;}
"False" {return FALSE;}
"false" {return FALSE;}
{L}({L}|{D})* {lexema=yytext();
                System.out.println("Codigo");
                return ID;}
 ("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}