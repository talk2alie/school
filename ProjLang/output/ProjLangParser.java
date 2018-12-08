// $ANTLR null C:\\Repos\\school\\ProjLang\\ProjLang.g 2018-12-08 18:54:43

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
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:33:1: input : expr SEMI EOF ;
	public final void input() throws RecognitionException {
		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:33:9: ( expr SEMI EOF )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:33:11: expr SEMI EOF
			{
			pushFollow(FOLLOW_expr_in_input337);
			expr();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_input339); 
			match(input,EOF,FOLLOW_EOF_in_input341); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:34:1: expr : ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr );
	public final void expr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:34:9: ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr )
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
				else if ( (LA2_6==ADDOP||LA2_6==BIND||(LA2_6 >= DO && LA2_6 <= END)||LA2_6==IN||LA2_6==LESS||LA2_6==MULOP||LA2_6==RCURLY||(LA2_6 >= SEMI && LA2_6 <= THEN)) ) {
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
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:34:11: IF expr THEN expr ELSE expr
					{
					match(input,IF,FOLLOW_IF_in_expr351); 
					pushFollow(FOLLOW_expr_in_expr353);
					expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr355); 
					pushFollow(FOLLOW_expr_in_expr357);
					expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr359); 
					pushFollow(FOLLOW_expr_in_expr361);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:35:8: LET VAL ID BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr370); 
					match(input,VAL,FOLLOW_VAL_in_expr372); 
					match(input,ID,FOLLOW_ID_in_expr374); 
					match(input,BIND,FOLLOW_BIND_in_expr376); 
					pushFollow(FOLLOW_expr_in_expr378);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr380); 
					pushFollow(FOLLOW_expr_in_expr382);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr384); 
					}
					break;
				case 3 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:36:8: LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr393); 
					match(input,FUN,FOLLOW_FUN_in_expr395); 
					match(input,ID,FOLLOW_ID_in_expr397); 
					match(input,LPAREN,FOLLOW_LPAREN_in_expr399); 
					match(input,ID,FOLLOW_ID_in_expr401); 
					match(input,RPAREN,FOLLOW_RPAREN_in_expr403); 
					match(input,BIND,FOLLOW_BIND_in_expr405); 
					pushFollow(FOLLOW_expr_in_expr407);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr409); 
					pushFollow(FOLLOW_expr_in_expr411);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr413); 
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:37:8: WHILE expr DO expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr422); 
					pushFollow(FOLLOW_expr_in_expr424);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr426); 
					pushFollow(FOLLOW_expr_in_expr428);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:38:8: LCURLY expr ( SEMI expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr437); 
					pushFollow(FOLLOW_expr_in_expr439);
					expr();
					state._fsp--;

					// C:\\Repos\\school\\ProjLang\\ProjLang.g:38:20: ( SEMI expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Repos\\school\\ProjLang\\ProjLang.g:38:21: SEMI expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr442); 
							pushFollow(FOLLOW_expr_in_expr444);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr449); 
					}
					break;
				case 6 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:39:8: NOT expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr458); 
					pushFollow(FOLLOW_expr_in_expr460);
					expr();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:40:8: ID ASSIGN expr
					{
					match(input,ID,FOLLOW_ID_in_expr469); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr471); 
					pushFollow(FOLLOW_expr_in_expr473);
					expr();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:41:8: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr482);
					relexpr();
					state._fsp--;

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
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:1: relexpr : arithexpr ( ( LESS | BIND ) arithexpr )? ;
	public final void relexpr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:11: ( arithexpr ( ( LESS | BIND ) arithexpr )? )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:13: arithexpr ( ( LESS | BIND ) arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr491);
			arithexpr();
			state._fsp--;

			// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:23: ( ( LESS | BIND ) arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BIND||LA3_0==LESS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:42:24: ( LESS | BIND ) arithexpr
					{
					if ( input.LA(1)==BIND||input.LA(1)==LESS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_arithexpr_in_relexpr502);
					arithexpr();
					state._fsp--;

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
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:1: arithexpr : term ( ADDOP term )* ;
	public final void arithexpr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:13: ( term ( ADDOP term )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:15: term ( ADDOP term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr513);
			term();
			state._fsp--;

			// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:20: ( ADDOP term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:43:21: ADDOP term
					{
					match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr516); 
					pushFollow(FOLLOW_term_in_arithexpr518);
					term();
					state._fsp--;

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
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:1: term : factor ( MULOP factor )* ;
	public final void term() throws RecognitionException {
		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:9: ( factor ( MULOP factor )* )
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:11: factor ( MULOP factor )*
			{
			pushFollow(FOLLOW_factor_in_term530);
			factor();
			state._fsp--;

			// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:18: ( MULOP factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:44:19: MULOP factor
					{
					match(input,MULOP,FOLLOW_MULOP_in_term533); 
					pushFollow(FOLLOW_factor_in_term535);
					factor();
					state._fsp--;

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
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// C:\\Repos\\school\\ProjLang\\ProjLang.g:45:1: factor returns [Expr value] : ( NUM | TRUE | FALSE TRUE | ID );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token NUM1=null;
		Token ID2=null;

		try {
			// C:\\Repos\\school\\ProjLang\\ProjLang.g:46:4: ( NUM | TRUE | FALSE TRUE | ID )
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
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:46:6: NUM
					{
					NUM1=(Token)match(input,NUM,FOLLOW_NUM_in_factor552); 
					value = new IntConst(Integer.parseInt((NUM1!=null?NUM1.getText():null)));
					}
					break;
				case 2 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:47:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor562); 
					value = new BoolConst(Boolean.parseBoolean(true));
					}
					break;
				case 3 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:48:7: FALSE TRUE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor572); 
					match(input,TRUE,FOLLOW_TRUE_in_factor574); 
					value = new BoolConst(Boolean.parseBoolean(false));
					}
					break;
				case 4 :
					// C:\\Repos\\school\\ProjLang\\ProjLang.g:49:7: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_factor584); 
					value = new VarExpr((ID2!=null?ID2.getText():null));
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



	public static final BitSet FOLLOW_expr_in_input337 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SEMI_in_input339 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr351 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr353 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr355 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr357 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr359 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr370 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr372 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr374 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr376 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr378 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr380 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr382 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr393 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr395 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr397 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_expr399 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr401 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr403 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr405 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr409 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr411 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr422 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr424 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr426 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr437 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_SEMI_in_expr442 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr444 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_RCURLY_in_expr449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr458 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr469 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr471 = new BitSet(new long[]{0x0000000050C56800L});
	public static final BitSet FOLLOW_expr_in_expr473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr491 = new BitSet(new long[]{0x0000000000020042L});
	public static final BitSet FOLLOW_set_in_relexpr494 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr513 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr516 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_term_in_arithexpr518 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term530 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_MULOP_in_term533 = new BitSet(new long[]{0x0000000010802800L});
	public static final BitSet FOLLOW_factor_in_term535 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_NUM_in_factor552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor572 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_TRUE_in_factor574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor584 = new BitSet(new long[]{0x0000000000000002L});
}
