/* 1.- User code */

package mx.com.mont.murcielago.lexer;
import java.io.Reader;
import java_cup.runtime.*;
import mx.com.mont.murcielago.grammar.sym;
import mx.com.mont.murcielago.view.Table;
import mx.com.mont.murcielago.view.model.Data;


/* 2.- lexial states, and macros) */
%%
%{
		private Table table;
		public LexerF(Reader in, Table table){
			this(in);
			this.table = table;
		}
		private void save(Data data){
			table.put(data);
		}
			
        private Symbol symbol(int type){
	  		return new Symbol(type, yyline, yycolumn);
		}
		private Symbol symbol(int type, Object value){
	  		return new Symbol(type, yyline, yycolumn, value);
		}	
%}
%class LexerF
%public 
%line
%column
%cup
%eofval{
  return new java_cup.runtime.Symbol(sym.EOF);
%eofval}
%eofclose
%unicode


NEW_LINE		= [\n|\r|\r\n]
WHITE_SPACE 	= {NEW_LINE} | [ \t\f]
IDE 			= [a-zA-Z][a-zA-Z0-9]*
INTNUM 			= 0|[1-9][0-9]*

%%

/* 3.- Lexical Rules */
<YYINITIAL> "public"				{ save(new Data("public: Tipo de acceso",yytext(),"Palabra reservada ",1));									return symbol(sym.PUBLIC); }
<YYINITIAL> "void"				{ save(new Data("void: Tipo de retorno",yytext(),"Palabra reserverda",1));										return symbol(sym.VOID); }
<YYINITIAL> "float"				{ save(new Data("float: Tipo de dato",yytext(),"Palabra reservada",1));											return new Symbol(sym.FLOAT, yyline+1, yycolumn+1); }
<YYINITIAL> "m"				{ save(new Data("M: Tipo de acceso",yytext(),"Palabra reservada ",1,0));								 	return symbol(sym.M, new Integer(0)); }
<YYINITIAL> "u"				{ save(new Data("U: Tipo de acceso",yytext(),"Palabra reservada ",1,1));									return symbol(sym.U, new Integer(1)); }
<YYINITIAL> "r"				{ save(new Data("R: Tipo de acceso",yytext(),"Palabra reservada ",1,2));									return symbol(sym.R, new Integer(2)); }
<YYINITIAL> "c"				{ save(new Data("C: Tipo de acceso",yytext(),"Palabra reservada ",1,3));									return symbol(sym.C, new Integer(3)); }
<YYINITIAL> "i"				{ save(new Data("I: Tipo de acceso",yytext(),"Palabra reservada ",1,4));									return symbol(sym.I, new Integer(4)); }
<YYINITIAL> "e"				{ save(new Data("E: Tipo de acceso",yytext(),"Palabra reservada ",1,5));									return symbol(sym.E, new Integer(5)); }
<YYINITIAL> "l"				{ save(new Data("L: Tipo de acceso",yytext(),"Palabra reservada ",1,6));									return symbol(sym.L, new Integer(6)); }
<YYINITIAL> "a"				{ save(new Data("A: Tipo de acceso",yytext(),"Palabra reservada ",1,7));									return symbol(sym.A, new Integer(7)); }
<YYINITIAL> "g"				{ save(new Data("G: Tipo de acceso",yytext(),"Palabra reservada ",1,8));									return symbol(sym.G, new Integer(8)); }
<YYINITIAL> "o"				{ save(new Data("O: Tipo de acceso",yytext(),"Palabra reservada ",1,9));									return symbol(sym.O, new Integer(9)); }
<YYINITIAL> "System"		{ save(new Data("System: Imprime",yytext(),"Palabra reservada ",1));									return symbol(sym.SYSTEM); }
<YYINITIAL> "out"			{ save(new Data("out: Imprime",yytext(),"Palabra reservada ",1));									return symbol(sym.OUT); }
<YYINITIAL> "println"		{ save(new Data("println: Imprime",yytext(),"Palabra reservada ",1));									return symbol(sym.PRINTLN); }
<YYINITIAL> {
	"="					{ save(new Data("Asignacion: Asigna un valor",yytext(),"Simbolo",1));												return symbol(sym.ASIGNACION); }
	"+"					{ save(new Data("Suma: Es un operador",yytext(),"Operador",1));													return symbol(sym.SUMA); }
	"-"					{ save(new Data("Resta: Es un operador",yytext(),"Operador",1));												return symbol(sym.RESTA); }
	"*"					{ save(new Data("Multiplicación: Es un operador",yytext(),"Operador",1));										return symbol(sym.MULT); }
	"/"					{ save(new Data("Division: Es un operador",yytext(),"Operador",1));												return symbol(sym.DIVI); }
	"."					{ save(new Data("Punto",yytext(),"Indicador decimal",1));							return symbol(sym.PUNTO); }
	","					{ save(new Data("Coma: Separador de parametros",yytext(),"Separador de parametros",1));							return symbol(sym.COMA); }	
	";"					{ save(new Data("Punto y coma: Finaliza una declaracion",yytext(),"Simbolo",1));								return symbol(sym.SEMICOLON); }
	"{"					{ save(new Data("Llave izq: Abre una declaracion ",yytext(),"Simbolo",1));										return symbol(sym.LL_IZQ); }
	"}"					{ save(new Data("Llave der: Cierra una declaracion",yytext(),"Simbolo",1));										return symbol(sym.LL_DER); }
	"("					{ save(new Data("Parentesis izq: Separador de variables",yytext(),"Simbolo",1));								return symbol(sym.PAR_IZQ); }
	")"					{ save(new Data("Parentesis der: Separador de variables",yytext(),"Simbolo",1));								return symbol(sym.PAR_DER); }
	{IDE}               { save(new Data("Identificador: Identifica una variable o método",yytext(), "Identificador",1,0));			return symbol(sym.IDE, yytext()); }
	{INTNUM}            { save(new Data("Numero tipo entero: Entero","Numero",yytext(), new Integer(yytext()),1,new Integer(yytext())));					return symbol(sym.NUMI, new Integer(yytext())); }
	{WHITE_SPACE}		{ /*Nothing to do*/ }
}	
[^]						{ return null; }