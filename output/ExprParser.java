// $ANTLR 3.5.1 D:\\Repos\\school\\Expr.g 2018-10-30 17:35:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "DIGIT", "DIV", "ID", "LETTER", 
		"LPAR", "MUL", "NUM", "RPAR", "SUB", "WS"
	};
	public static final int EOF=-1;
	public static final int ADD=4;
	public static final int DIGIT=5;
	public static final int DIV=6;
	public static final int ID=7;
	public static final int LETTER=8;
	public static final int LPAR=9;
	public static final int MUL=10;
	public static final int NUM=11;
	public static final int RPAR=12;
	public static final int SUB=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\Repos\\school\\Expr.g"; }



	// $ANTLR start "input"
	// D:\\Repos\\school\\Expr.g:20:1: input : expr EOF ;
	public final void input() throws RecognitionException {
		try {
			// D:\\Repos\\school\\Expr.g:20:7: ( expr EOF )
			// D:\\Repos\\school\\Expr.g:20:9: expr EOF
			{
			pushFollow(FOLLOW_expr_in_input136);
			expr();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_input138); 
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
	// D:\\Repos\\school\\Expr.g:22:1: expr : term ( ADD term | SUB term )* ;
	public final void expr() throws RecognitionException {
		try {
			// D:\\Repos\\school\\Expr.g:22:6: ( term ( ADD term | SUB term )* )
			// D:\\Repos\\school\\Expr.g:22:13: term ( ADD term | SUB term )*
			{
			pushFollow(FOLLOW_term_in_expr153);
			term();
			state._fsp--;

			// D:\\Repos\\school\\Expr.g:22:18: ( ADD term | SUB term )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ADD) ) {
					alt1=1;
				}
				else if ( (LA1_0==SUB) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// D:\\Repos\\school\\Expr.g:22:19: ADD term
					{
					match(input,ADD,FOLLOW_ADD_in_expr156); 
					pushFollow(FOLLOW_term_in_expr158);
					term();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Repos\\school\\Expr.g:22:30: SUB term
					{
					match(input,SUB,FOLLOW_SUB_in_expr162); 
					pushFollow(FOLLOW_term_in_expr164);
					term();
					state._fsp--;

					}
					break;

				default :
					break loop1;
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
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// D:\\Repos\\school\\Expr.g:24:1: term : factor ( MUL factor | DIV factor )* ;
	public final void term() throws RecognitionException {
		try {
			// D:\\Repos\\school\\Expr.g:24:6: ( factor ( MUL factor | DIV factor )* )
			// D:\\Repos\\school\\Expr.g:24:13: factor ( MUL factor | DIV factor )*
			{
			pushFollow(FOLLOW_factor_in_term181);
			factor();
			state._fsp--;

			// D:\\Repos\\school\\Expr.g:24:20: ( MUL factor | DIV factor )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==MUL) ) {
					alt2=1;
				}
				else if ( (LA2_0==DIV) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// D:\\Repos\\school\\Expr.g:24:21: MUL factor
					{
					match(input,MUL,FOLLOW_MUL_in_term184); 
					pushFollow(FOLLOW_factor_in_term186);
					factor();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\Repos\\school\\Expr.g:24:34: DIV factor
					{
					match(input,DIV,FOLLOW_DIV_in_term190); 
					pushFollow(FOLLOW_factor_in_term192);
					factor();
					state._fsp--;

					}
					break;

				default :
					break loop2;
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
	// D:\\Repos\\school\\Expr.g:26:1: factor : ( LPAR expr RPAR | ID | NUM );
	public final void factor() throws RecognitionException {
		try {
			// D:\\Repos\\school\\Expr.g:26:8: ( LPAR expr RPAR | ID | NUM )
			int alt3=3;
			switch ( input.LA(1) ) {
			case LPAR:
				{
				alt3=1;
				}
				break;
			case ID:
				{
				alt3=2;
				}
				break;
			case NUM:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\Repos\\school\\Expr.g:26:14: LPAR expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor214); 
					pushFollow(FOLLOW_expr_in_factor216);
					expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor218); 
					}
					break;
				case 2 :
					// D:\\Repos\\school\\Expr.g:27:12: ID
					{
					match(input,ID,FOLLOW_ID_in_factor231); 
					}
					break;
				case 3 :
					// D:\\Repos\\school\\Expr.g:28:12: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_factor244); 
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



	public static final BitSet FOLLOW_expr_in_input136 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr153 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_ADD_in_expr156 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_term_in_expr158 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_SUB_in_expr162 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_term_in_expr164 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_factor_in_term181 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_MUL_in_term184 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_factor_in_term186 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_DIV_in_term190 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_factor_in_term192 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_LPAR_in_factor214 = new BitSet(new long[]{0x0000000000000A80L});
	public static final BitSet FOLLOW_expr_in_factor216 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_RPAR_in_factor218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_factor244 = new BitSet(new long[]{0x0000000000000002L});
}
