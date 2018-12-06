// $ANTLR null C:\\Repos\\school\\Worksheet9\\Expr.g 2018-12-06 16:50:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class ExprParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr", "input", "factor", "term"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public ExprParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public ExprParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Repos\\school\\Worksheet9\\Expr.g"; }



	// $ANTLR start "input"
	// C:\\Repos\\school\\Worksheet9\\Expr.g:16:1: input returns [Expr value] : expr EOF ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr expr1 =null;

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// C:\\Repos\\school\\Worksheet9\\Expr.g:17:5: ( expr EOF )
			dbg.enterAlt(1);

			// C:\\Repos\\school\\Worksheet9\\Expr.g:17:7: expr EOF
			{
			dbg.location(17,7);
			pushFollow(FOLLOW_expr_in_input168);
			expr1=expr();
			state._fsp--;
			dbg.location(17,12);
			value = expr1;dbg.location(17,36);
			match(input,EOF,FOLLOW_EOF_in_input172); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// C:\\Repos\\school\\Worksheet9\\Expr.g:18:1: expr returns [Expr value] : left= term ( ADD right= term | SUB right= term )* ;
	public final Expr expr() throws RecognitionException {
		Expr value = null;


		Expr left =null;
		Expr right =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// C:\\Repos\\school\\Worksheet9\\Expr.g:19:5: (left= term ( ADD right= term | SUB right= term )* )
			dbg.enterAlt(1);

			// C:\\Repos\\school\\Worksheet9\\Expr.g:19:9: left= term ( ADD right= term | SUB right= term )*
			{
			dbg.location(19,13);
			pushFollow(FOLLOW_term_in_expr193);
			left=term();
			state._fsp--;
			dbg.location(19,19);
			value = left;dbg.location(19,43);
			// C:\\Repos\\school\\Worksheet9\\Expr.g:19:43: ( ADD right= term | SUB right= term )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=3;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ADD) ) {
					alt1=1;
				}
				else if ( (LA1_0==SUB) ) {
					alt1=2;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Repos\\school\\Worksheet9\\Expr.g:19:44: ADD right= term
					{
					dbg.location(19,44);
					match(input,ADD,FOLLOW_ADD_in_expr198); dbg.location(19,53);
					pushFollow(FOLLOW_term_in_expr202);
					right=term();
					state._fsp--;
					dbg.location(19,59);
					value = new PlusExpr(left, right);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Repos\\school\\Worksheet9\\Expr.g:20:8: SUB right= term
					{
					dbg.location(20,8);
					match(input,SUB,FOLLOW_SUB_in_expr214); dbg.location(20,17);
					pushFollow(FOLLOW_term_in_expr218);
					right=term();
					state._fsp--;
					dbg.location(20,23);
					value = new MinusExpr(left, right);
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// C:\\Repos\\school\\Worksheet9\\Expr.g:21:1: term returns [Expr value] : left= factor ( MUL right= factor | DIV right= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		NumExpr left =null;
		NumExpr right =null;

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// C:\\Repos\\school\\Worksheet9\\Expr.g:22:5: (left= factor ( MUL right= factor | DIV right= factor )* )
			dbg.enterAlt(1);

			// C:\\Repos\\school\\Worksheet9\\Expr.g:22:10: left= factor ( MUL right= factor | DIV right= factor )*
			{
			dbg.location(22,14);
			pushFollow(FOLLOW_factor_in_term247);
			left=factor();
			state._fsp--;
			dbg.location(22,22);
			value = left;dbg.location(22,46);
			// C:\\Repos\\school\\Worksheet9\\Expr.g:22:46: ( MUL right= factor | DIV right= factor )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=3;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==MUL) ) {
					alt2=1;
				}
				else if ( (LA2_0==DIV) ) {
					alt2=2;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Repos\\school\\Worksheet9\\Expr.g:22:47: MUL right= factor
					{
					dbg.location(22,47);
					match(input,MUL,FOLLOW_MUL_in_term252); dbg.location(22,56);
					pushFollow(FOLLOW_factor_in_term256);
					right=factor();
					state._fsp--;
					dbg.location(22,64);
					value = new TimesExpr(left, right);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Repos\\school\\Worksheet9\\Expr.g:23:8: DIV right= factor
					{
					dbg.location(23,8);
					match(input,DIV,FOLLOW_DIV_in_term268); dbg.location(23,17);
					pushFollow(FOLLOW_factor_in_term272);
					right=factor();
					state._fsp--;
					dbg.location(23,25);
					value = new DivideExpr(left, right);
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 79);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// C:\\Repos\\school\\Worksheet9\\Expr.g:24:1: factor returns [NumExpr value] : NUM ;
	public final NumExpr factor() throws RecognitionException {
		NumExpr value = null;


		Token NUM2=null;

		try { dbg.enterRule(getGrammarFileName(), "factor");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Repos\\school\\Worksheet9\\Expr.g:25:5: ( NUM )
			dbg.enterAlt(1);

			// C:\\Repos\\school\\Worksheet9\\Expr.g:25:10: NUM
			{
			dbg.location(25,10);
			NUM2=(Token)match(input,NUM,FOLLOW_NUM_in_factor294); dbg.location(25,14);
			value = new NumExpr(Integer.parseInt((NUM2!=null?NUM2.getText():null)));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 65);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "factor");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input168 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_input172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr193 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_ADD_in_expr198 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_term_in_expr202 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_SUB_in_expr214 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_term_in_expr218 = new BitSet(new long[]{0x0000000000002012L});
	public static final BitSet FOLLOW_factor_in_term247 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_MUL_in_term252 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_factor_in_term256 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_DIV_in_term268 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_factor_in_term272 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_NUM_in_factor294 = new BitSet(new long[]{0x0000000000000002L});
}
