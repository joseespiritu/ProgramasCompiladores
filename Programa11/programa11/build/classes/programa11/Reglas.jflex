package programa11;
import static programa11.Tokens.*;
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
"(" {return PARENTIZQ;}
")" {return PARENDER;}
"Numero" {return NUM;}
"numero" {return NUM;}
"NUMERO" {return NUM;}
"+" {return MAS;}
"*" {return POR;}
"-" {return MENOS;}
";" {return PUNTOCOMA;}
{L}({L}|{D})* {lexema=yytext();
                System.out.println("Codigo");
                return ID;}
 ("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}