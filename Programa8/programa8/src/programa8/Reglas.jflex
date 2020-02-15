package programa8;
import static fes.aragon.Tokens.*;
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
"Programa" {return PROGRAMA;}
"programa" {return PROGRAMA;}
"PROGRAMA" {return PROGRAMA;}
"Sentencia" {return SENTENCIA;}
"sentencia" {return SENTENCIA;}
"SENTENCIA" {return SENTENCIA;}
"Asignacion" {return ASIGNACION;}
"asignacion" {return ASIGNACION;}
"ASIGNACION" {return ASIGNACION;}
"Expresion" {return EXPRESION;}
"expresion" {return EXPRESION;}
"EXPRESION" {return EXPRESION;}
"Identificador" {return ID;}
"identificador" {return ID;}
"IDENTIFICADOR" {return ID;}
"numero" {return NUM;}
"(" {return PARENIZQ;}
")" {return PARENDER;}
"+" {return SUMA;}
"-" {return RESTA;}
";" {return PUNTOCOMA;}
{L}({L}|{D})* {lexema=yytext();
                System.out.println("Codigo");
                return ID;}
 ("(-"{D}+")")|{D}+ {lexema=yytext(); return NUM;}
. {return ERROR;}