package programa10;
import static programa10.Tokens.*;
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
"a" {return TERMINALa;}
"A" {return NOTERMINALA;}
"b" {return TERMINALb;}
"c" {return TERMINALc;}
";" {return PUNTOCOMA;}
{L}({L}|{D})* {lexema=yytext();
                System.out.println("Codigo");
                return ID;}
 ("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}