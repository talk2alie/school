// $ANTLR 3.5.1 D:\\Repos\\school\\project\\Project.g 2018-10-30 17:55:39

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
	@Override public String getGrammarFileName() { return "D:\\Repos\\school\\project\\Project.g"; }



	// $ANTLR start "input"
	// D:\\Repos\\school\\project\\Project.g:33:1: input : expr SEMI ;
	public final void input() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:33:9: ( expr SEMI )
			// D:\\Repos\\school\\project\\Project.g:33:11: expr SEMI
			{
			pushFollow(FOLLOW_expr_in_input335);
			expr();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_input337); 
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
	// D:\\Repos\\school\\project\\Project.g:34:1: expr : ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr );
	public final void expr() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:34:8: ( IF expr THEN expr ELSE expr | LET VAL ID BIND expr IN expr END | LET FUN ID LPAREN ID RPAREN BIND expr IN expr END | WHILE expr DO expr | LCURLY expr ( SEMI expr )* RCURLY | NOT expr | ID ASSIGN expr | relexpr )
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
					// D:\\Repos\\school\\project\\Project.g:34:10: IF expr THEN expr ELSE expr
					{
					match(input,IF,FOLLOW_IF_in_expr346); 
					pushFollow(FOLLOW_expr_in_expr348);
					expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr350); 
					pushFollow(FOLLOW_expr_in_expr352);
					expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr354); 
					pushFollow(FOLLOW_expr_in_expr356);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Repos\\school\\project\\Project.g:35:8: LET VAL ID BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr365); 
					match(input,VAL,FOLLOW_VAL_in_expr367); 
					match(input,ID,FOLLOW_ID_in_expr369); 
					match(input,BIND,FOLLOW_BIND_in_expr371); 
					pushFollow(FOLLOW_expr_in_expr373);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr375); 
					pushFollow(FOLLOW_expr_in_expr377);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr379); 
					}
					break;
				case 3 :
					// D:\\Repos\\school\\project\\Project.g:36:8: LET FUN ID LPAREN ID RPAREN BIND expr IN expr END
					{
					match(input,LET,FOLLOW_LET_in_expr388); 
					match(input,FUN,FOLLOW_FUN_in_expr390); 
					match(input,ID,FOLLOW_ID_in_expr392); 
					match(input,LPAREN,FOLLOW_LPAREN_in_expr394); 
					match(input,ID,FOLLOW_ID_in_expr396); 
					match(input,RPAREN,FOLLOW_RPAREN_in_expr398); 
					match(input,BIND,FOLLOW_BIND_in_expr400); 
					pushFollow(FOLLOW_expr_in_expr402);
					expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr404); 
					pushFollow(FOLLOW_expr_in_expr406);
					expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr408); 
					}
					break;
				case 4 :
					// D:\\Repos\\school\\project\\Project.g:37:8: WHILE expr DO expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr417); 
					pushFollow(FOLLOW_expr_in_expr419);
					expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr421); 
					pushFollow(FOLLOW_expr_in_expr423);
					expr();
					state._fsp--;

					}
					break;
				case 5 :
					// D:\\Repos\\school\\project\\Project.g:38:8: LCURLY expr ( SEMI expr )* RCURLY
					{
					match(input,LCURLY,FOLLOW_LCURLY_in_expr432); 
					pushFollow(FOLLOW_expr_in_expr434);
					expr();
					state._fsp--;

					// D:\\Repos\\school\\project\\Project.g:38:20: ( SEMI expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMI) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\Repos\\school\\project\\Project.g:38:21: SEMI expr
							{
							match(input,SEMI,FOLLOW_SEMI_in_expr437); 
							pushFollow(FOLLOW_expr_in_expr439);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RCURLY,FOLLOW_RCURLY_in_expr444); 
					}
					break;
				case 6 :
					// D:\\Repos\\school\\project\\Project.g:39:8: NOT expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr453); 
					pushFollow(FOLLOW_expr_in_expr455);
					expr();
					state._fsp--;

					}
					break;
				case 7 :
					// D:\\Repos\\school\\project\\Project.g:40:8: ID ASSIGN expr
					{
					match(input,ID,FOLLOW_ID_in_expr464); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr466); 
					pushFollow(FOLLOW_expr_in_expr468);
					expr();
					state._fsp--;

					}
					break;
				case 8 :
					// D:\\Repos\\school\\project\\Project.g:41:8: relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr477);
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
	// D:\\Repos\\school\\project\\Project.g:42:1: relexpr : arithexpr ( RELOP arithexpr )? ;
	public final void relexpr() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:42:11: ( arithexpr ( RELOP arithexpr )? )
			// D:\\Repos\\school\\project\\Project.g:42:13: arithexpr ( RELOP arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr486);
			arithexpr();
			state._fsp--;

			// D:\\Repos\\school\\project\\Project.g:42:23: ( RELOP arithexpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==RELOP) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\Repos\\school\\project\\Project.g:42:24: RELOP arithexpr
					{
					match(input,RELOP,FOLLOW_RELOP_in_relexpr489); 
					pushFollow(FOLLOW_arithexpr_in_relexpr491);
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
	// D:\\Repos\\school\\project\\Project.g:43:1: arithexpr : term ( ADDOP term )* ;
	public final void arithexpr() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:43:13: ( term ( ADDOP term )* )
			// D:\\Repos\\school\\project\\Project.g:43:15: term ( ADDOP term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr502);
			term();
			state._fsp--;

			// D:\\Repos\\school\\project\\Project.g:43:20: ( ADDOP term )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ADDOP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\Repos\\school\\project\\Project.g:43:21: ADDOP term
					{
					match(input,ADDOP,FOLLOW_ADDOP_in_arithexpr505); 
					pushFollow(FOLLOW_term_in_arithexpr507);
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
	// D:\\Repos\\school\\project\\Project.g:44:1: term : factor ( MULOP factor )* ;
	public final void term() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:44:8: ( factor ( MULOP factor )* )
			// D:\\Repos\\school\\project\\Project.g:44:10: factor ( MULOP factor )*
			{
			pushFollow(FOLLOW_factor_in_term518);
			factor();
			state._fsp--;

			// D:\\Repos\\school\\project\\Project.g:44:17: ( MULOP factor )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==MULOP) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\Repos\\school\\project\\Project.g:44:18: MULOP factor
					{
					match(input,MULOP,FOLLOW_MULOP_in_term521); 
					pushFollow(FOLLOW_factor_in_term523);
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
	// D:\\Repos\\school\\project\\Project.g:45:1: factor : ( NUM | TRUE | FALSE | ID | ID LPAREN ID RPAREN | LPAREN expr RPAREN );
	public final void factor() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:45:10: ( NUM | TRUE | FALSE | ID | ID LPAREN ID RPAREN | LPAREN expr RPAREN )
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
					// D:\\Repos\\school\\project\\Project.g:45:12: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_factor534); 
					}
					break;
				case 2 :
					// D:\\Repos\\school\\project\\Project.g:46:8: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor543); 
					}
					break;
				case 3 :
					// D:\\Repos\\school\\project\\Project.g:47:8: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor552); 
					}
					break;
				case 4 :
					// D:\\Repos\\school\\project\\Project.g:48:8: ID
					{
					match(input,ID,FOLLOW_ID_in_factor561); 
					}
					break;
				case 5 :
					// D:\\Repos\\school\\project\\Project.g:49:8: ID LPAREN ID RPAREN
					{
					match(input,ID,FOLLOW_ID_in_factor570); 
					match(input,LPAREN,FOLLOW_LPAREN_in_factor572); 
					match(input,ID,FOLLOW_ID_in_factor574); 
					match(input,RPAREN,FOLLOW_RPAREN_in_factor576); 
					}
					break;
				case 6 :
					// D:\\Repos\\school\\project\\Project.g:50:8: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_factor585); 
					pushFollow(FOLLOW_expr_in_factor587);
					expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_factor589); 
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



	public static final BitSet FOLLOW_expr_in_input335 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_SEMI_in_input337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr346 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr348 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_THEN_in_expr350 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr352 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELSE_in_expr354 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr365 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_VAL_in_expr367 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr369 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr371 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr373 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr375 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr377 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr388 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_FUN_in_expr390 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr392 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_expr394 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_expr396 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_expr398 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BIND_in_expr400 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IN_in_expr404 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_END_in_expr408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr417 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr419 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DO_in_expr421 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_expr432 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr434 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_SEMI_in_expr437 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr439 = new BitSet(new long[]{0x0000000004800000L});
	public static final BitSet FOLLOW_RCURLY_in_expr444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr453 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr464 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_expr466 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr486 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_RELOP_in_relexpr489 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr502 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_ADDOP_in_arithexpr505 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_term_in_arithexpr507 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_factor_in_term518 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_MULOP_in_term521 = new BitSet(new long[]{0x0000000010482800L});
	public static final BitSet FOLLOW_factor_in_term523 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_NUM_in_factor534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor570 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_factor572 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_factor574 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor585 = new BitSet(new long[]{0x00000000506B6800L});
	public static final BitSet FOLLOW_expr_in_factor587 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor589 = new BitSet(new long[]{0x0000000000000002L});
}
