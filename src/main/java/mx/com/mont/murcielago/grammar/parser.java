
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Tue May 15 20:58:33 CDT 2018
//----------------------------------------------------

package mx.com.mont.murcielago.grammar;

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Tue May 15 20:58:33 CDT 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\002\004\000\002\003\013\000\002\005" +
    "\006\000\002\005\006\000\002\005\004\000\002\005\004" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\003\000\002\006\003\000\002\006\003\000\002" +
    "\006\003\000\002\006\003\000\002\006\003\000\002\006" +
    "\003\000\002\004\006\000\002\004\007\000\002\011\006" +
    "\000\002\011\003\000\002\012\003\000\002\012\005\000" +
    "\002\012\007\000\002\010\003\000\002\010\005\000\002" +
    "\007\003\000\002\007\003\000\002\007\003\000\002\007" +
    "\003\000\002\017\003\000\002\017\003\000\002\017\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\004\020\004\001\002\000\004\021\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\035\010\001\002\000\004\005\011\001\002\000" +
    "\004\022\013\001\002\000\004\004\034\001\002\000\030" +
    "\023\023\024\017\025\021\026\014\027\025\030\027\031" +
    "\024\032\015\033\026\034\022\035\016\001\002\000\020" +
    "\004\ufff8\010\ufff8\011\ufff8\014\ufff8\015\ufff8\016\ufff8\017" +
    "\ufff8\001\002\000\020\004\ufff4\010\ufff4\011\ufff4\014\ufff4" +
    "\015\ufff4\016\ufff4\017\ufff4\001\002\000\006\004\ufffc\010" +
    "\032\001\002\000\020\004\ufffa\010\ufffa\011\ufffa\014\ufffa" +
    "\015\ufffa\016\ufffa\017\ufffa\001\002\000\006\004\ufffd\010" +
    "\030\001\002\000\020\004\ufff9\010\ufff9\011\ufff9\014\ufff9" +
    "\015\ufff9\016\ufff9\017\ufff9\001\002\000\020\004\ufff2\010" +
    "\ufff2\011\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\001\002" +
    "\000\020\004\ufffb\010\ufffb\011\ufffb\014\ufffb\015\ufffb\016" +
    "\ufffb\017\ufffb\001\002\000\020\004\ufff5\010\ufff5\011\ufff5" +
    "\014\ufff5\015\ufff5\016\ufff5\017\ufff5\001\002\000\020\004" +
    "\ufff7\010\ufff7\011\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7" +
    "\001\002\000\020\004\ufff3\010\ufff3\011\ufff3\014\ufff3\015" +
    "\ufff3\016\ufff3\017\ufff3\001\002\000\020\004\ufff6\010\ufff6" +
    "\011\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6\001\002\000" +
    "\004\022\013\001\002\000\004\004\ufffe\001\002\000\004" +
    "\022\013\001\002\000\004\004\uffff\001\002\000\004\006" +
    "\035\001\002\000\004\035\037\001\002\000\004\007\071" +
    "\001\002\000\004\013\040\001\002\000\034\005\047\023" +
    "\023\024\017\025\021\026\014\027\025\030\027\031\024" +
    "\032\015\033\026\034\022\035\042\036\043\001\002\000" +
    "\016\004\uffe4\011\uffe4\014\uffe4\015\uffe4\016\uffe4\017\uffe4" +
    "\001\002\000\016\004\uffe2\011\uffe2\014\uffe2\015\uffe2\016" +
    "\uffe2\017\uffe2\001\002\000\016\004\uffe3\011\uffe3\014\uffe3" +
    "\015\uffe3\016\uffe3\017\uffe3\001\002\000\004\011\067\001" +
    "\002\000\004\011\uffee\001\002\000\016\004\uffea\011\uffea" +
    "\014\063\015\062\016\060\017\061\001\002\000\034\022" +
    "\052\023\023\024\017\025\021\026\014\027\025\030\027" +
    "\031\024\032\015\033\026\034\022\035\042\036\043\001" +
    "\002\000\004\011\uffed\001\002\000\004\004\056\001\002" +
    "\000\004\004\053\001\002\000\034\005\055\023\023\024" +
    "\017\025\021\026\014\027\025\030\027\031\024\032\015" +
    "\033\026\034\022\035\042\036\043\001\002\000\004\011" +
    "\uffef\001\002\000\032\023\023\024\017\025\021\026\014" +
    "\027\025\030\027\031\024\032\015\033\026\034\022\035" +
    "\042\036\043\001\002\000\014\011\uffec\014\063\015\062" +
    "\016\060\017\061\001\002\000\034\005\055\023\023\024" +
    "\017\025\021\026\014\027\025\030\027\031\024\032\015" +
    "\033\026\034\022\035\042\036\043\001\002\000\034\005" +
    "\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7\027\uffe7\030\uffe7" +
    "\031\uffe7\032\uffe7\033\uffe7\034\uffe7\035\uffe7\036\uffe7\001" +
    "\002\000\034\005\uffe5\023\uffe5\024\uffe5\025\uffe5\026\uffe5" +
    "\027\uffe5\030\uffe5\031\uffe5\032\uffe5\033\uffe5\034\uffe5\035" +
    "\uffe5\036\uffe5\001\002\000\034\005\uffe8\023\uffe8\024\uffe8" +
    "\025\uffe8\026\uffe8\027\uffe8\030\uffe8\031\uffe8\032\uffe8\033" +
    "\uffe8\034\uffe8\035\uffe8\036\uffe8\001\002\000\034\005\uffe6" +
    "\023\uffe6\024\uffe6\025\uffe6\026\uffe6\027\uffe6\030\uffe6\031" +
    "\uffe6\032\uffe6\033\uffe6\034\uffe6\035\uffe6\036\uffe6\001\002" +
    "\000\004\011\uffeb\001\002\000\032\023\023\024\017\025" +
    "\021\026\014\027\025\030\027\031\024\032\015\033\026" +
    "\034\022\035\042\036\043\001\002\000\006\004\uffe9\011" +
    "\uffe9\001\002\000\006\007\ufff1\035\037\001\002\000\004" +
    "\007\ufff0\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\067\000\004\003\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\005\011\001\001\000\002\001\001\000" +
    "\004\006\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\005\030\001\001\000\002\001\001\000\004" +
    "\005\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\035\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\006\040\010\047\011\043\012\044\017\045\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\007\064\001" +
    "\001\000\010\006\040\010\050\017\045\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\006" +
    "\040\010\047\012\053\017\045\001\001\000\002\001\001" +
    "\000\010\006\040\010\050\017\045\001\001\000\004\007" +
    "\056\001\001\000\012\006\040\010\047\012\063\017\045" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\006\040" +
    "\010\065\017\045\001\001\000\002\001\001\000\004\004" +
    "\067\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	 /* Change the method report_error so it will display the line and
       column of where the error occurred in the input as well as the
       reason for the error which is passed into the method in the
       String 'message'. */
	private javax.swing.JTextPane console;
	private boolean hasError;
	public void setError(boolean e){ this.hasError=e;}
	public boolean hasError(){ return this.hasError; }
	public void setConsole(javax.swing.JTextPane comp){
		this.console=comp;
	}
    public void report_error(String message, Object info) {
   
        /* Create a StringBuilder called 'm' with the string 'Error' in it. */
        StringBuilder m = new StringBuilder("Error");
   
        /* Check if the information passed to the method is the same
           type as the type java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the
               information in the object info that is being typecasted
               as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or
               equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuilder error message
                   the line number of the error in the input. */
                m.append(" in line "+(s.left+1));   
                /* Check if the column number in the input is greater
                   or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuilder error message
                       the column number of the error in the input. */
                    m.append(", column "+(s.right));
            }
        }
   
        /* Add to the end of the StringBuilder error message created in
           this method the message that was passed into this method. */
        m.append(" : "+message);
        console.setText(m.toString());
		hasError=true;
        System.err.println(m);
    }

    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // dato ::= IDE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*dato*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // dato ::= NUMI 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*dato*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // dato ::= murcielago 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*dato*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // operador ::= MULT 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*operador*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // operador ::= DIVI 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*operador*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // operador ::= RESTA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*operador*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // operador ::= SUMA 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*operador*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // operacion ::= dato operador operacion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*operacion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // operacion ::= dato 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*operacion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // asignar ::= PAR_IZQ operacion PAR_DER operador asignar 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*asignar*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // asignar ::= PAR_IZQ operacion PAR_DER 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*asignar*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // asignar ::= operacion 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*asignar*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // asignacion ::= asignar 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*asignacion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // asignacion ::= PAR_IZQ FLOAT PAR_DER asignar 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*asignacion*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // body ::= IDE ASIGNACION asignacion SEMICOLON body 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // body ::= IDE ASIGNACION asignacion SEMICOLON 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // murcielago ::= O 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // murcielago ::= G 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // murcielago ::= A 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // murcielago ::= L 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // murcielago ::= E 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // murcielago ::= I 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // murcielago ::= C 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // murcielago ::= R 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // murcielago ::= U 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // murcielago ::= M 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*murcielago*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // param ::= FLOAT IDE 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*param*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // param ::= FLOAT murcielago 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*param*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // param ::= FLOAT murcielago COMA param 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*param*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // param ::= FLOAT IDE COMA param 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*param*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= PUBLIC VOID IDE PAR_IZQ param PAR_DER LL_IZQ body LL_DER 
            {
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*inicio*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-8)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

