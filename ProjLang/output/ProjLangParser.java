// $ANTLR 3.5.1 D:\\Repos\\school\\ProjLang\\ProjLang.g 2018-12-11 17:41:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "ASSIGN", "BIND", "DIGIT", 
		"DO", "ELSE", "END", "FALSE", "FUN", "ID", "IF", "IN", "LCURLY", "LESS", 
		"LET", "LETTER", "LPAREN", "MULOP", "NOT", "NUM", "RCURLY", "RPAREN", 
		"SEMI", "THEN", "TRUE", "VAL", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ADDOP=4;
	public static final int ASSIGN=5;
	public static final int BIND=6;
	public static final int DIGIT=7;
	public static final int DO=8;
	public static final int ELSE=9;
	public static final int END=10;
	public static final int FALSE=11;
	public static final int FUN=12;
	public static final int ID=13;
	public static final int IF=14;
	public static final int IN=15;
	public static final int LCURLY=16;
	public static final int LESS=17;
	public static final int LET=18;
	public static final int LETTER=19;
	public static final int LPAREN=20;
	public static final int MULOP=21;
	public static final int NOT=22;
	public static final int NUM=23;
	public static final int RCURLY=24;
	public static final int RPAREN=25;
	public static final int SEMI=26;
	public static final int THEN=27;
	public static final int TRUE=28;
	public static final int VAL=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Repos\\school\\ProjLang\\ProjLang.g"; }



	// $ANTLR start "input"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:33:1: input returns [Expr value] : expr SEMI EOF ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr expr1 =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:34:5: ( expr SEMI EOF )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:34:7: expr SEMI EOF
			{
			pushFollow(FOLLOW_expr_in_input344);
			expr1=expr();
			state._fsp--;

			value = expr1;
			match(input,SEMI,FOLLOW_SEMI_in_input348); 
			match(input,EOF,FOLLOW_EOF_in_input350); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:36:1: expr returns [Expr value] : ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr );
	public final Expr expr() throws RecognitionException {
		Expr value = null;


		Token ID2=null;
		Token ID3=null;
		Expr condition =null;
		Expr trueExpr =null;
		Expr falseExpr =null;
		Expr binding =null;
		Expr in =null;
		Expr action =null;
		Expr first =null;
		Expr second =null;
		Expr e =null;
		Expr relexpr4 =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:37:5: ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUN) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LCURLY:
				{
				alt2=5;
				}
				break;
			case NOT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGN) ) {
					alt2=7;
				}
				else if ( (LA2_6==ADDOP||LA2_6==BIND||(LA2_6 >= DO && LA2_6 <= END)||LA2_6==IN||LA2_6==LESS||(LA2_6 >= LPAREN && LA2_6 <= MULOP)||(LA2_6 >= RCURLY && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAREN:
			case NUM:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:37:7: IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr
					{
					match(input,IF,FOLLOW_IF_in_expr373); 
					pushFollow(FOLLOW_expr_in_expr377);
					condition=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr379); 
					pushFollow(FOLLOW_expr_in_expr383);
					trueExpr=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr385); 
					pushFollow(FOLLOW_expr_in_expr389);
					falseExpr=expr();
					state._fsp--;

					value = new IfExpr(condition, trueExpr, falseExpr);
					}
					break;
				case 2 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:38:8: LET VAL ID BIND binding= expr IN in= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr400); 
					match(input,VAL,FOLLOW_VAL_in_expr402); 
					ID2=(Token)match(input,ID,FOLLOW_ID_in_expr404); 
					match(input,BIND,FOLLOW_BIND_in_expr406); 
					pushFollow(FOLLOW_expr_in_expr410);
					binding=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr412); 
					pushFollow(FOLLOW_expr_in_expr416);
					in=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr418); 
					value = new LetValExpr((ID2!=null?ID2.getText():null), binding, in);
					}
					break;
				case 3 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:39:8: LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr429); 
					match(input,FUN,FOLLOW_FUN_in_expr431); 
					match(input,ID,FOLLOW_ID_in_expr433); 
					match(input,LPAREN,FOLLOW_LPAREN_in_expr435); 
					match(input,ID,FOLLOW_ID_in_expr437); 
					match(input,RPAREN,FOLLOW_RPAREN_in_expr439); 
					match(input,BIND,FOLLOW_BIND_in_expr441); 
					pushFollow(FOLLOW_expr_in_expr443);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr445); 
					pushFollow(FOLLOW_expr_in_expr447);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr449); 
					}
					break;
				case 4 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:40:8: WHILE condition= expr DO action= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr458); 
					pushFollow(FOLLOW_expr_in_expr462);
					condition=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr464); 
					pushFollow(FOLLOW_expr_in_expr468);
					action=expr();
					state._fsp--;

					value = new WhileExpr(condition, action);
					}
					break;
				case 5 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:41:8: LCURLY first= expr ( SEMI second= expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr479); 
					pushFollow(FOLLOW_expr_in_expr483);
					first=expr();
					state._fsp--;

					value = first;
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:41:51: ( SEMI second= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\Repos\\school\\ProjLang\\ProjLang.g:41:52: SEMI second= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr488); 
							pushFollow(FOLLOW_expr_in_expr492);
							second=expr();
							state._fsp--;

							value = new SeqExpr(value, second);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr498); 
					}
					break;
				case 6 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:42:8: NOT e= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr507); 
					pushFollow(FOLLOW_expr_in_expr511);
					e=expr();
					state._fsp--;

					value = new NotExpr(e);
					}
					break;
				case 7 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:43:8: ID ASSIGN e= expr
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_expr522); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr524); 
					pushFollow(FOLLOW_expr_in_expr528);
					e=expr();
					state._fsp--;

					value = new AssnExpr((ID3!=null?ID3.getText():null), e);
					}
					break;
				case 8 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:44:8: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr539);
					relexpr4=relexpr();
					state._fsp--;

					value = relexpr4;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:46:1: relexpr returns [Expr value] : left= arithexpr (op= ( LESS | BIND ) right= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:47:5: (left= arithexpr (op= ( LESS | BIND ) right= arithexpr )? )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:47:7: left= arithexpr (op= ( LESS | BIND ) right= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr565);
			left=arithexpr();
			state._fsp--;

			value = left;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:47:46: (op= ( LESS | BIND ) right= arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BIND||LA3_0==LESS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:47:47: op= ( LESS | BIND ) right= arithexpr
					{
					op=input.LT(1);
					if ( input.LA(1)==BIND||input.LA(1)==LESS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithexpr_in_relexpr582);
					right=arithexpr();
					state._fsp--;

					value = ((op!=null?op.getText():null).equals("<")) ? new BinExpr(left, BinOp.LT, right) : new BinExpr(left, BinOp.EQ, right);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:50:1: arithexpr returns [Expr value] : left= term (op= ADDOP right= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:51:6: (left= term (op= ADDOP right= term )* )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:51:8: left= term (op= ADDOP right= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr616);
			left=term();
			state._fsp--;

			value = left;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:51:42: (op= ADDOP right= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:51:43: op= ADDOP right= term
					{
					op=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr623); 
					pushFollow(FOLLOW_term_in_arithexpr627);
					right=term();
					state._fsp--;

					switch ((op!=null?op.getText():null)) {
								            case "+":
								                value = new BinExpr(value, BinOp.PLUS, right);
								                break;
								            case "-":
								                value = new BinExpr(value, BinOp.MINUS, right);
								                break;			            
								            case "|":
								                value = new BinExpr(value, BinOp.OR, right);
								                break;
								        }
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:64:1: term returns [Expr value] : left= factor (op= MULOP right= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:65:5: (left= factor (op= MULOP right= factor )* )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:65:7: left= factor (op= MULOP right= factor )*
			{
			pushFollow(FOLLOW_factor_in_term670);
			left=factor();
			state._fsp--;

			value = left;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:65:43: (op= MULOP right= factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:65:44: op= MULOP right= factor
					{
					op=(Token)match(input,MULOP,FOLLOW_MULOP_in_term677); 
					pushFollow(FOLLOW_factor_in_term681);
					right=factor();
					state._fsp--;

					switch ((op!=null?op.getText():null)) {
								            case "&":
								                value = new BinExpr(value, BinOp.AND, right);
								                break;
								            case "/":
								                value = new BinExpr(value, BinOp.DIV, right);
								                break;			            
								            case "*":
								                value = new BinExpr(value, BinOp.TIMES, right);
								                break;
								        }
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// D:\\Repos\\school\\ProjLang\\ProjLang.g:78:1: factor returns [Expr value] : ( NUM | TRUE | FALSE | ID | ID LPAREN expr RPAREN | LPAREN expr RPAREN );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token NUM5=null;
		Token ID6=null;
		Expr expr7 =null;

		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:79:5: ( NUM | TRUE | FALSE | ID | ID LPAREN expr RPAREN | LPAREN expr RPAREN )
			int alt6=6;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt6=1;
				}
				break;
			case TRUE:
				{
				alt6=2;
				}
				break;
			case FALSE:
				{
				alt6=3;
				}
				break;
			case ID:
				{
				int LA6_4 = input.LA(2);
				if ( (LA6_4==LPAREN) ) {
					alt6=5;
				}
				else if ( (LA6_4==ADDOP||LA6_4==BIND||(LA6_4 >= DO && LA6_4 <= END)||LA6_4==IN||LA6_4==LESS||LA6_4==MULOP||(LA6_4 >= RCURLY && LA6_4 <= THEN)) ) {
					alt6=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAREN:
				{
				alt6=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:79:7: NUM
					{
					NUM5=(Token)match(input,NUM,FOLLOW_NUM_in_factor719); 
					value = new IntConst(Integer.parseInt((NUM5!=null?NUM5.getText():null)));
					}
					break;
				case 2 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:80:8: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor730); 
					value = new BoolConst(true);
					}
					break;
				case 3 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:81:8: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor741); 
					value = new BoolConst(false);
					}
					break;
				case 4 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:82:8: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_factor752); 
					value = new VarExpr((ID6!=null?ID6.getText():null));
					}
					break;
				case 5 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:83:8: ID LPAREN expr RPAREN
					{
					match(input,ID,FOLLOW_ID_in_factor768); 
					match(input,LPAREN,FOLLOW_LPAREN_in_factor770); 
					pushFollow(FOLLOW_expr_in_factor772);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_factor774); 
					}
					break;
				case 6 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:84:8: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_factor783); 
					pushFollow(FOLLOW_expr_in_factor785);
					expr7=expr();
					state._fsp--;

					value = expr7;
					match(input,RPAREN,FOLLOW_RPAREN_in_factor789); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input344 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SEMI_in_input348 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr373 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr379 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr385 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr400 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr402 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr404 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr406 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr412 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr429 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr431 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr433 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_expr435 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr437 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr439 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr441 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr443 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr445 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr447 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr458 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr462 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr464 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr479 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr483 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMI_in_expr488 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr492 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr507 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr522 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr524 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_expr528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr565 = new BitSet(new long[]{0x0000000000020042L});
	public static final BitSet FOLLOW_set_in_relexpr572 = new BitSet(new long[]{0x0000000010902800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr616 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr623 = new BitSet(new long[]{0x0000000010902800L});
	public static final BitSet FOLLOW_term_in_arithexpr627 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term670 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term677 = new BitSet(new long[]{0x0000000010902800L});
	public static final BitSet FOLLOW_factor_in_term681 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor768 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_factor770 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_factor772 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor783 = new BitSet(new long[]{0x0000000050D56800L});
	public static final BitSet FOLLOW_expr_in_factor785 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor789 = new BitSet(new long[]{0x0000000000000002L});
}
