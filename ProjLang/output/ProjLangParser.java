// $ANTLR null C:\\Repos\\school\\ProjLang\\ProjLang.g 2018-12-09 20:22:09

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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:35:1: expr returns [Expr value] : ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr );
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
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:36:5: ( IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr | LET VAL ID BIND binding= expr IN in= expr END | WHILE condition= expr DO action= expr | LCURLY first= expr ( SEMI second= expr )* RCURLY | NOT e= expr | ID ASSIGN e= expr | relexpr )
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
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:36:7: IF condition= expr THEN trueExpr= expr ELSE falseExpr= expr
					{
					match(input,IF,FOLLOW_IF_in_expr367); 
					pushFollow(FOLLOW_expr_in_expr371);
					condition=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr373); 
					pushFollow(FOLLOW_expr_in_expr377);
					trueExpr=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr379); 
					pushFollow(FOLLOW_expr_in_expr383);
					falseExpr=expr();
					state._fsp--;

					value = new IfExpr(condition, trueExpr, falseExpr);
					}
					break;
				case 2 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:37:8: LET VAL ID BIND binding= expr IN in= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr394); 
					match(input,VAL,FOLLOW_VAL_in_expr396); 
					ID2=(Token)match(input,ID,FOLLOW_ID_in_expr398); 
					match(input,BIND,FOLLOW_BIND_in_expr400); 
					pushFollow(FOLLOW_expr_in_expr404);
					binding=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr406); 
					pushFollow(FOLLOW_expr_in_expr410);
					in=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr412); 
					value = new LetValExpr((ID2!=null?ID2.getText():null), binding, in);
					}
					break;
				case 3 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:39:8: WHILE condition= expr DO action= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr429); 
					pushFollow(FOLLOW_expr_in_expr433);
					condition=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr435); 
					pushFollow(FOLLOW_expr_in_expr439);
					action=expr();
					state._fsp--;

					value = new WhileExpr(condition, action);
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:40:8: LCURLY first= expr ( SEMI second= expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr450); 
					pushFollow(FOLLOW_expr_in_expr454);
					first=expr();
					state._fsp--;

					value = first;
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:40:51: ( SEMI second= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Repos\\school\\ProjLang\\ProjLang.g:40:52: SEMI second= expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr459); 
							pushFollow(FOLLOW_expr_in_expr463);
							second=expr();
							state._fsp--;

							value = new SeqExpr(first, second);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr469); 
					}
					break;
				case 5 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:41:8: NOT e= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr478); 
					pushFollow(FOLLOW_expr_in_expr482);
					e=expr();
					state._fsp--;

					value = new NotExpr(e);
					}
					break;
				case 6 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:8: ID ASSIGN e= expr
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_expr493); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr495); 
					pushFollow(FOLLOW_expr_in_expr499);
					e=expr();
					state._fsp--;

					value = new AssnExpr((ID3!=null?ID3.getText():null), e);
					}
					break;
				case 7 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:8: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr510);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:1: relexpr returns [Expr value] : left= arithexpr ( (op= LESS |op= BIND ) right= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:5: (left= arithexpr ( (op= LESS |op= BIND ) right= arithexpr )? )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:7: left= arithexpr ( (op= LESS |op= BIND ) right= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr530);
			left=arithexpr();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:46: ( (op= LESS |op= BIND ) right= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==BIND||LA4_0==LESS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:47: (op= LESS |op= BIND ) right= arithexpr
					{
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:47: (op= LESS |op= BIND )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==LESS) ) {
						alt3=1;
					}
					else if ( (LA3_0==BIND) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:48: op= LESS
							{
							op=(Token)match(input,LESS,FOLLOW_LESS_in_relexpr538); 
							}
							break;
						case 2 :
							// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:58: op= BIND
							{
							op=(Token)match(input,BIND,FOLLOW_BIND_in_relexpr544); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr549);
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:1: arithexpr returns [Expr value] : left= term (op= ADDOP right= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:48:6: (left= term (op= ADDOP right= term )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:48:8: left= term (op= ADDOP right= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr577);
			left=term();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:48:42: (op= ADDOP right= term )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ADDOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:48:43: op= ADDOP right= term
					{
					op=(Token)match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr584); 
					pushFollow(FOLLOW_term_in_arithexpr588);
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
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:60:1: term returns [Expr value] : left= factor (op= MULOP right= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Token op=null;
		Expr left =null;
		Expr right =null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:61:5: (left= factor (op= MULOP right= factor )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:61:7: left= factor (op= MULOP right= factor )*
			{
			pushFollow(FOLLOW_factor_in_term619);
			left=factor();
			state._fsp--;

			value = left;
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:61:43: (op= MULOP right= factor )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==MULOP) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:61:44: op= MULOP right= factor
					{
					op=(Token)match(input,MULOP,FOLLOW_MULOP_in_term626); 
					pushFollow(FOLLOW_factor_in_term630);
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
					break loop6;
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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:73:1: factor returns [Expr value] : ( NUM | TRUE | FALSE | ID );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token NUM5=null;
		Token ID6=null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:74:5: ( NUM | TRUE | FALSE | ID )
			int alt7=4;
			switch ( input.LA(1) ) {
			case NUM:
				{
				alt7=1;
				}
				break;
			case TRUE:
				{
				alt7=2;
				}
				break;
			case FALSE:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:74:7: NUM
					{
					NUM5=(Token)match(input,NUM,FOLLOW_NUM_in_factor656); 
					value = new IntConst(Integer.parseInt((NUM5!=null?NUM5.getText():null)));
					}
					break;
				case 2 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:75:8: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor667); 
					value = new BoolConst(true);
					}
					break;
				case 3 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:76:8: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor678); 
					value = new BoolConst(false);
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:77:8: ID
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_factor689); 
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
	public static final BitSet FOLLOW_IF_in_expr367 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr371 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr373 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr379 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr394 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr396 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr398 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr400 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr406 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr429 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr433 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr435 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr450 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr454 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMI_in_expr459 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr463 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr478 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr493 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr495 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr530 = new BitSet(new long[]{0x0000000000020042L});
	public static final BitSet FOLLOW_LESS_in_relexpr538 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_BIND_in_relexpr544 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr577 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr584 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_term_in_arithexpr588 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term619 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term626 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_factor_in_term630 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor689 = new BitSet(new long[]{0x0000000000000002L});
}
