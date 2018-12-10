// $ANTLR null C:\\Repos\\school\\ProjLang\\ProjLang.g 2018-12-09 22:21:07

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
	@Override public String getGrammarFileName() { return "C:\\Repos\\school\\ProjLang\\ProjLang.g"; }



	// $ANTLR start "input"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:33:1: input returns [Expr value] : expr SEMI EOF ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr expr1 =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:34:5: ( expr SEMI EOF )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:34:7: expr SEMI EOF
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:36:1: expr returns [Expr value] : ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr );
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
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:37:5: ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr )
			int alt2=7;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				alt2=2;
				}
				break;
			case WHILE:
				{
				alt2=3;
				}
				break;
			case LCURLY:
				{
				alt2=4;
				}
				break;
			case NOT:
				{
				alt2=5;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGN) ) {
					alt2=6;
				}
				else if ( (LA2_6==ADDOP||LA2_6==BIND||(LA2_6 >= DO && LA2_6 <= END)||LA2_6==IN||LA2_6==LESS||LA2_6==MULOP||LA2_6==RCURLY||(LA2_6 >= SEMI && LA2_6 <= THEN)) ) {
					alt2=7;
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
			case NUM:
			case TRUE:
				{
				alt2=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:37:7: IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr
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
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:38:8: LET VAL ID BIND binding= expr IN in= expr END
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
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:40:8: WHILE condition= expr DO action= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr435); 
					pushFollow(FOLLOW_expr_in_expr439);
					condition=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr441); 
					pushFollow(FOLLOW_expr_in_expr445);
					action=expr();
					state._fsp--;

					value = new WhileExpr(condition, action);
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:41:8: LCURLY first= expr ( SEMI second= expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr456); 
					pushFollow(FOLLOW_expr_in_expr460);
					first=expr();
					state._fsp--;

					value = first;
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:41:51: ( SEMI second= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Repos\\school\\ProjLang\\ProjLang.g:41:52: SEMI second= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr465); 
							pushFollow(FOLLOW_expr_in_expr469);
							second=expr();
							state._fsp--;

							value = new SeqExpr(first, second);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr475); 
					}
					break;
				case 5 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:8: NOT e= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr484); 
					pushFollow(FOLLOW_expr_in_expr488);
					e=expr();
					state._fsp--;

					value = new NotExpr(e);
					}
					break;
				case 6 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:8: ID ASSIGN e= expr
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_expr499); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr501); 
					pushFollow(FOLLOW_expr_in_expr505);
					e=expr();
					state._fsp--;

					value = new AssnExpr((ID3!=null?ID3.getText():null), e);
					}
					break;
				case 7 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:8: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr516);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:46:1: relexpr returns [Expr value] : left= arithexpr (op= ( LESS | BIND ) right= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:5: (left= arithexpr (op= ( LESS | BIND ) right= arithexpr )? )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:7: left= arithexpr (op= ( LESS | BIND ) right= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr542);
			left=arithexpr();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:46: (op= ( LESS | BIND ) right= arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BIND||LA3_0==LESS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:47: op= ( LESS | BIND ) right= arithexpr
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
					pushFollow(FOLLOW_arithexpr_in_relexpr559);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:50:1: arithexpr returns [Expr value] : left= term (op= ADDOP right= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:51:6: (left= term (op= ADDOP right= term )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:51:8: left= term (op= ADDOP right= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr593);
			left=term();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:51:42: (op= ADDOP right= term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:51:43: op= ADDOP right= term
					{
					op=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr600); 
					pushFollow(FOLLOW_term_in_arithexpr604);
					right=term();
					state._fsp--;

					switch ((op!=null?op.getText():null)) {
								            case "+":
								                value = new BinExpr(left, BinOp.PLUS, right);
								                break;
								            case "-":
								                value = new BinExpr(left, BinOp.MINUS, right);
								                break;			            
								            case "|":
								                value = new BinExpr(left, BinOp.OR, right);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:64:1: term returns [Expr value] : left= factor (op= MULOP right= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:65:5: (left= factor (op= MULOP right= factor )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:65:7: left= factor (op= MULOP right= factor )*
			{
			pushFollow(FOLLOW_factor_in_term647);
			left=factor();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:65:43: (op= MULOP right= factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:65:44: op= MULOP right= factor
					{
					op=(Token)match(input,MULOP,FOLLOW_MULOP_in_term654); 
					pushFollow(FOLLOW_factor_in_term658);
					right=factor();
					state._fsp--;

					switch ((op!=null?op.getText():null)) {
								            case "&":
								                value = new BinExpr(left, BinOp.AND, right);
								                break;
								            case "/":
								                value = new BinExpr(left, BinOp.DIV, right);
								                break;			            
								            case "*":
								                value = new BinExpr(left, BinOp.TIMES, right);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:78:1: factor returns [Expr value] : ( NUM | TRUE | FALSE | ID );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token NUM5=null;
		Token ID6=null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:79:5: ( NUM | TRUE | FALSE | ID )
			int alt6=4;
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
				alt6=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:79:7: NUM
					{
					NUM5=(Token)match(input,NUM,FOLLOW_NUM_in_factor696); 
					value = new IntConst(Integer.parseInt((NUM5!=null?NUM5.getText():null)));
					}
					break;
				case 2 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:80:8: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor707); 
					value = new BoolConst(true);
					}
					break;
				case 3 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:81:8: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor718); 
					value = new BoolConst(false);
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:82:8: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_factor729); 
					value = new VarExpr((ID6!=null?ID6.getText():null));
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
	public static final BitSet FOLLOW_IF_in_expr373 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr379 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr385 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr400 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr402 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr404 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr406 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr412 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr416 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr435 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr441 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr456 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr460 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMI_in_expr465 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr469 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr484 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr499 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr501 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr542 = new BitSet(new long[]{0x0000000000020042L});
	public static final BitSet FOLLOW_set_in_relexpr549 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr593 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr600 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_term_in_arithexpr604 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term647 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term654 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_factor_in_term658 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor729 = new BitSet(new long[]{0x0000000000000002L});
}
