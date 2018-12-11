// $ANTLR 3.5.1 D:\\Repos\\school\\ProjLang\\ProjLang.g 2018-12-11 17:41:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Repos\\school\\ProjLang\\ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:4:16: ( '0' .. '9' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:6:9: ( ';' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:6:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:7:7: ( 'if' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:7:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:8:9: ( 'then' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:8:11: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:9:9: ( 'else' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:9:11: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:10:8: ( 'let' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:10:10: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:11:8: ( 'val' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:11:10: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "BIND"
	public final void mBIND() throws RecognitionException {
		try {
			int _type = BIND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:12:9: ( '=' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:12:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIND"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:13:9: ( '<' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:13:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:14:7: ( 'in' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:14:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:15:8: ( 'end' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:15:10: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:16:8: ( 'fun' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:16:10: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:17:10: ( '(' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:17:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:18:10: ( ')' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:18:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:19:9: ( 'while' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:19:11: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:20:7: ( 'do' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:20:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:21:10: ( '{' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:21:12: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:22:10: ( '}' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:22:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:23:8: ( '!' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:23:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:24:10: ( ':=' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:24:12: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:25:9: ( '+' | '-' | '|' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:26:9: ( '*' | '/' | '&' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:27:9: ( 'true' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:27:12: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:28:9: ( 'false' )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:28:11: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:29:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:29:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\Repos\\school\\ProjLang\\ProjLang.g:29:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:30:8: ( ( DIGIT )+ )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:30:10: ( DIGIT )+
			{
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:30:10: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:31:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:31:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\Repos\\school\\ProjLang\\ProjLang.g:31:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\Repos\\school\\ProjLang\\ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:8: ( SEMI | IF | THEN | ELSE | LET | VAL | BIND | LESS | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | ADDOP | MULOP | TRUE | FALSE | ID | NUM | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:10: SEMI
				{
				mSEMI(); 

				}
				break;
			case 2 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:15: IF
				{
				mIF(); 

				}
				break;
			case 3 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:18: THEN
				{
				mTHEN(); 

				}
				break;
			case 4 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:23: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:28: LET
				{
				mLET(); 

				}
				break;
			case 6 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:32: VAL
				{
				mVAL(); 

				}
				break;
			case 7 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:36: BIND
				{
				mBIND(); 

				}
				break;
			case 8 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:41: LESS
				{
				mLESS(); 

				}
				break;
			case 9 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:46: IN
				{
				mIN(); 

				}
				break;
			case 10 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:49: END
				{
				mEND(); 

				}
				break;
			case 11 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:53: FUN
				{
				mFUN(); 

				}
				break;
			case 12 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:57: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 13 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:64: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 14 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:71: WHILE
				{
				mWHILE(); 

				}
				break;
			case 15 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:77: DO
				{
				mDO(); 

				}
				break;
			case 16 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:80: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 17 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:87: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 18 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:94: NOT
				{
				mNOT(); 

				}
				break;
			case 19 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:98: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 20 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:105: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 21 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:111: MULOP
				{
				mMULOP(); 

				}
				break;
			case 22 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:117: TRUE
				{
				mTRUE(); 

				}
				break;
			case 23 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:122: FALSE
				{
				mFALSE(); 

				}
				break;
			case 24 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:128: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:131: NUM
				{
				mNUM(); 

				}
				break;
			case 26 :
				// D:\\Repos\\school\\ProjLang\\ProjLang.g:1:135: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\2\uffff\5\24\2\uffff\1\24\2\uffff\2\24\11\uffff\1\43\1\44\11\24\1\56"+
		"\2\uffff\3\24\1\62\1\63\1\64\1\65\2\24\1\uffff\1\70\1\71\1\72\4\uffff"+
		"\2\24\3\uffff\1\75\1\76\2\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\1\uffff\1\146\1\150\1\154\1\145\1\141\2\uffff\1\141\2\uffff\1\150"+
		"\1\157\11\uffff\2\60\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\1"+
		"\151\1\60\2\uffff\1\156\2\145\4\60\1\163\1\154\1\uffff\3\60\4\uffff\2"+
		"\145\3\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\uffff\1\156\1\162\1\156\1\145\1\141\2\uffff\1\165\2\uffff\1\150"+
		"\1\157\11\uffff\2\172\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154"+
		"\1\151\1\172\2\uffff\1\156\2\145\4\172\1\163\1\154\1\uffff\3\172\4\uffff"+
		"\2\145\3\uffff\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\5\uffff\1\7\1\10\1\uffff\1\14\1\15\2\uffff\1\20\1\21\1\22"+
		"\1\23\1\24\1\25\1\30\1\31\1\32\14\uffff\1\2\1\11\11\uffff\1\17\3\uffff"+
		"\1\12\1\5\1\6\1\13\2\uffff\1\3\1\26\1\4\2\uffff\1\27\1\16";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\20\4\uffff\1\23\1\uffff\1\12\1\13"+
			"\1\23\1\22\1\uffff\1\22\1\uffff\1\23\12\25\1\21\1\1\1\10\1\7\3\uffff"+
			"\32\24\6\uffff\3\24\1\15\1\4\1\11\2\24\1\2\2\24\1\5\7\24\1\3\1\24\1\6"+
			"\1\14\3\24\1\16\1\22\1\17",
			"",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33\1\uffff\1\34",
			"\1\35",
			"\1\36",
			"",
			"",
			"\1\40\23\uffff\1\37",
			"",
			"",
			"\1\41",
			"\1\42",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\66",
			"\1\67",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"",
			"",
			"\1\73",
			"\1\74",
			"",
			"",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SEMI | IF | THEN | ELSE | LET | VAL | BIND | LESS | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | ADDOP | MULOP | TRUE | FALSE | ID | NUM | WS );";
		}
	}

}
