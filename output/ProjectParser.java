// $ANTLR null C:\\Repos\\school\\Project.g 2018-10-30 16:05:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOP", "ASSIGN", "BIND", "DIGIT", 
		"DO", "ELSE", "END", "FALSE", "FUN", "ID", "IF", "IN", "LCURLY", "LET", 
		"LETTER", "LPAREN", "MULOP", "NOT", "NUM", "RCURLY", "RELOP", "RPAREN", 
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
	public static final int LET=17;
	public static final int LETTER=18;
	public static final int LPAREN=19;
	public static final int MULOP=20;
	public static final int NOT=21;
	public static final int NUM=22;
	public static final int RCURLY=23;
	public static final int RELOP=24;
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


	public ProjectParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjectParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjectParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Repos\\school\\Project.g"; }



	// $ANTLR start "input"
	// C:\\Repos\\school\\Project.g:33:1: input : expr SEMI EOF ;
	public final void input() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:33:8: ( expr SEMI EOF )
			// C:\\Repos\\school\\Project.g:33:10: expr SEMI EOF
			{
			pushFollow(FOLLOW_expr_in_input297);
			expr();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_input299); 
			match(input,EOF,FOLLOW_EOF_in_input301); 
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
	// C:\\Repos\\school\\Project.g:34:1: expr : ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr );
	public final void expr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:34:7: ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr )
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
				else if ( (LA2_6==ADDOP||(LA2_6 >= DO && LA2_6 <= END)||LA2_6==IN||(LA2_6 >= LPAREN && LA2_6 <= MULOP)||(LA2_6 >= RCURLY && LA2_6 <= THEN)) ) {
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
					// C:\\Repos\\school\\Project.g:34:9: IF expr THEN expr ELSE expr
					{
					match(input,IF,FOLLOW_IF_in_expr309); 
					pushFollow(FOLLOW_expr_in_expr311);
					expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr313); 
					pushFollow(FOLLOW_expr_in_expr315);
					expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr317); 
					pushFollow(FOLLOW_expr_in_expr319);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Repos\\school\\Project.g:35:6: LET VAL ID BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr326); 
					match(input,VAL,FOLLOW_VAL_in_expr328); 
					match(input,ID,FOLLOW_ID_in_expr330); 
					match(input,BIND,FOLLOW_BIND_in_expr332); 
					pushFollow(FOLLOW_expr_in_expr334);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr336); 
					pushFollow(FOLLOW_expr_in_expr338);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr340); 
					}
					break;
				case 3 :
					// C:\\Repos\\school\\Project.g:36:6: LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr347); 
					match(input,FUN,FOLLOW_FUN_in_expr349); 
					match(input,ID,FOLLOW_ID_in_expr351); 
					match(input,LPAREN,FOLLOW_LPAREN_in_expr353); 
					match(input,ID,FOLLOW_ID_in_expr355); 
					match(input,RPAREN,FOLLOW_RPAREN_in_expr357); 
					match(input,BIND,FOLLOW_BIND_in_expr359); 
					pushFollow(FOLLOW_expr_in_expr361);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr363); 
					pushFollow(FOLLOW_expr_in_expr365);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr367); 
					}
					break;
				case 4 :
					// C:\\Repos\\school\\Project.g:37:6: WHILE expr DO expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr374); 
					pushFollow(FOLLOW_expr_in_expr376);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr378); 
					pushFollow(FOLLOW_expr_in_expr380);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Repos\\school\\Project.g:38:6: LCURLY expr ( SEMI expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr387); 
					pushFollow(FOLLOW_expr_in_expr389);
					expr();
					state._fsp--;

					// C:\\Repos\\school\\Project.g:38:18: ( SEMI expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// C:\\Repos\\school\\Project.g:38:19: SEMI expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr392); 
							pushFollow(FOLLOW_expr_in_expr394);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr398); 
					}
					break;
				case 6 :
					// C:\\Repos\\school\\Project.g:39:6: NOT expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr405); 
					pushFollow(FOLLOW_expr_in_expr407);
					expr();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Repos\\school\\Project.g:40:6: ID ASSIGN expr
					{
					match(input,ID,FOLLOW_ID_in_expr414); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr416); 
					pushFollow(FOLLOW_expr_in_expr418);
					expr();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Repos\\school\\Project.g:41:6: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr425);
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
	// C:\\Repos\\school\\Project.g:42:1: relexpr : arithexpr ( RELOP arithexpr )? ;
	public final void relexpr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:42:10: ( arithexpr ( RELOP arithexpr )? )
			// C:\\Repos\\school\\Project.g:42:12: arithexpr ( RELOP arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr433);
			arithexpr();
			state._fsp--;

			// C:\\Repos\\school\\Project.g:42:22: ( RELOP arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RELOP) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Repos\\school\\Project.g:42:23: RELOP arithexpr
					{
					match(input,RELOP,FOLLOW_RELOP_in_relexpr436); 
					pushFollow(FOLLOW_arithexpr_in_relexpr438);
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
	// C:\\Repos\\school\\Project.g:43:1: arithexpr : term ( ADDOP term )* ;
	public final void arithexpr() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:43:12: ( term ( ADDOP term )* )
			// C:\\Repos\\school\\Project.g:43:14: term ( ADDOP term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr448);
			term();
			state._fsp--;

			// C:\\Repos\\school\\Project.g:43:19: ( ADDOP term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Repos\\school\\Project.g:43:20: ADDOP term
					{
					match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr451); 
					pushFollow(FOLLOW_term_in_arithexpr453);
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
	// C:\\Repos\\school\\Project.g:44:1: term : factor ( MULOP factor )* ;
	public final void term() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:44:7: ( factor ( MULOP factor )* )
			// C:\\Repos\\school\\Project.g:44:9: factor ( MULOP factor )*
			{
			pushFollow(FOLLOW_factor_in_term463);
			factor();
			state._fsp--;

			// C:\\Repos\\school\\Project.g:44:16: ( MULOP factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Repos\\school\\Project.g:44:17: MULOP factor
					{
					match(input,MULOP,FOLLOW_MULOP_in_term466); 
					pushFollow(FOLLOW_factor_in_term468);
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
	// C:\\Repos\\school\\Project.g:45:1: factor : ( NUM | TRUE | FALSE | ID | ID LPAREN expr RPAREN | LPAREN expr RPAREN );
	public final void factor() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:45:9: ( NUM | TRUE | FALSE | ID | ID LPAREN expr RPAREN | LPAREN expr RPAREN )
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
				else if ( (LA6_4==ADDOP||(LA6_4 >= DO && LA6_4 <= END)||LA6_4==IN||LA6_4==MULOP||(LA6_4 >= RCURLY && LA6_4 <= THEN)) ) {
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
					// C:\\Repos\\school\\Project.g:45:11: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_factor478); 
					}
					break;
				case 2 :
					// C:\\Repos\\school\\Project.g:46:6: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor485); 
					}
					break;
				case 3 :
					// C:\\Repos\\school\\Project.g:47:6: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor492); 
					}
					break;
				case 4 :
					// C:\\Repos\\school\\Project.g:48:6: ID
					{
					match(input,ID,FOLLOW_ID_in_factor499); 
					}
					break;
				case 5 :
					// C:\\Repos\\school\\Project.g:49:6: ID LPAREN expr RPAREN
					{
					match(input,ID,FOLLOW_ID_in_factor506); 
					match(input,LPAREN,FOLLOW_LPAREN_in_factor508); 
					pushFollow(FOLLOW_expr_in_factor510);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_factor512); 
					}
					break;
				case 6 :
					// C:\\Repos\\school\\Project.g:50:6: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_factor519); 
					pushFollow(FOLLOW_expr_in_factor521);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_factor523); 
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
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input297 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SEMI_in_input299 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr309 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr311 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr313 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr315 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr317 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr326 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr328 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr330 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr332 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr334 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr336 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr347 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr349 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr351 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_expr353 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr355 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr357 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr359 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr363 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr365 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr374 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr376 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr378 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr387 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr389 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_SEMI_in_expr392 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr394 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_RCURLY_in_expr398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr405 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr414 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr416 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr433 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_RELOP_in_relexpr436 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr448 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr451 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_term_in_arithexpr453 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term463 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_MULOP_in_term466 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_factor_in_term468 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_NUM_in_factor478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor506 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_factor508 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_factor510 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor519 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_factor521 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor523 = new BitSet(new long[]{0x0000000000000002L});
}
