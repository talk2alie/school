// $ANTLR 3.5.1 D:\\Repos\\school\\project\\Project.g 2018-10-30 17:55:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjectLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjectLexer() {} 
	public ProjectLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjectLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Repos\\school\\project\\Project.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// D:\\Repos\\school\\project\\Project.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:4:16: ( '0' .. '9' )
			// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:6:8: ( ';' )
			// D:\\Repos\\school\\project\\Project.g:6:10: ';'
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
			// D:\\Repos\\school\\project\\Project.g:7:7: ( 'if' )
			// D:\\Repos\\school\\project\\Project.g:7:9: 'if'
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
			// D:\\Repos\\school\\project\\Project.g:8:8: ( 'then' )
			// D:\\Repos\\school\\project\\Project.g:8:10: 'then'
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
			// D:\\Repos\\school\\project\\Project.g:9:8: ( 'else' )
			// D:\\Repos\\school\\project\\Project.g:9:10: 'else'
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
			// D:\\Repos\\school\\project\\Project.g:10:8: ( 'let' )
			// D:\\Repos\\school\\project\\Project.g:10:10: 'let'
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
			// D:\\Repos\\school\\project\\Project.g:11:8: ( 'val' )
			// D:\\Repos\\school\\project\\Project.g:11:10: 'val'
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
			// D:\\Repos\\school\\project\\Project.g:12:8: ( '=' )
			// D:\\Repos\\school\\project\\Project.g:12:10: '='
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

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\project\\Project.g:13:7: ( 'in' )
			// D:\\Repos\\school\\project\\Project.g:13:9: 'in'
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
			// D:\\Repos\\school\\project\\Project.g:14:8: ( 'end' )
			// D:\\Repos\\school\\project\\Project.g:14:10: 'end'
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
			// D:\\Repos\\school\\project\\Project.g:15:8: ( 'fun' )
			// D:\\Repos\\school\\project\\Project.g:15:10: 'fun'
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
			// D:\\Repos\\school\\project\\Project.g:16:10: ( '(' )
			// D:\\Repos\\school\\project\\Project.g:16:12: '('
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
			// D:\\Repos\\school\\project\\Project.g:17:10: ( ')' )
			// D:\\Repos\\school\\project\\Project.g:17:12: ')'
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
			// D:\\Repos\\school\\project\\Project.g:18:9: ( 'while' )
			// D:\\Repos\\school\\project\\Project.g:18:11: 'while'
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
			// D:\\Repos\\school\\project\\Project.g:19:7: ( 'do' )
			// D:\\Repos\\school\\project\\Project.g:19:9: 'do'
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
			// D:\\Repos\\school\\project\\Project.g:20:10: ( '{' )
			// D:\\Repos\\school\\project\\Project.g:20:12: '{'
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
			// D:\\Repos\\school\\project\\Project.g:21:10: ( '}' )
			// D:\\Repos\\school\\project\\Project.g:21:12: '}'
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
			// D:\\Repos\\school\\project\\Project.g:22:8: ( '!' )
			// D:\\Repos\\school\\project\\Project.g:22:10: '!'
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
			// D:\\Repos\\school\\project\\Project.g:23:10: ( ':=' )
			// D:\\Repos\\school\\project\\Project.g:23:12: ':='
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

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\project\\Project.g:24:9: ( '<' | '=' )
			// D:\\Repos\\school\\project\\Project.g:
			{
			if ( (input.LA(1) >= '<' && input.LA(1) <= '=') ) {
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
	// $ANTLR end "RELOP"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Repos\\school\\project\\Project.g:25:9: ( '+' | '-' | '|' )
			// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:26:9: ( '*' | '/' | '&' )
			// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:27:8: ( 'true' )
			// D:\\Repos\\school\\project\\Project.g:27:11: 'true'
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
			// D:\\Repos\\school\\project\\Project.g:28:9: ( 'false' )
			// D:\\Repos\\school\\project\\Project.g:28:11: 'false'
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
			// D:\\Repos\\school\\project\\Project.g:29:7: ( LETTER ( LETTER | DIGIT )* )
			// D:\\Repos\\school\\project\\Project.g:29:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// D:\\Repos\\school\\project\\Project.g:29:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:30:8: ( ( DIGIT )+ )
			// D:\\Repos\\school\\project\\Project.g:30:10: ( DIGIT )+
			{
			// D:\\Repos\\school\\project\\Project.g:30:10: ( DIGIT )+
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
					// D:\\Repos\\school\\project\\Project.g:
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
			// D:\\Repos\\school\\project\\Project.g:31:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\Repos\\school\\project\\Project.g:31:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\Repos\\school\\project\\Project.g:31:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
					// D:\\Repos\\school\\project\\Project.g:
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
		// D:\\Repos\\school\\project\\Project.g:1:8: ( SEMI | IF | THEN | ELSE | LET | VAL | BIND | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | RELOP | ADDOP | MULOP | TRUE | FALSE | ID | NUM | WS )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// D:\\Repos\\school\\project\\Project.g:1:10: SEMI
				{
				mSEMI(); 

				}
				break;
			case 2 :
				// D:\\Repos\\school\\project\\Project.g:1:15: IF
				{
				mIF(); 

				}
				break;
			case 3 :
				// D:\\Repos\\school\\project\\Project.g:1:18: THEN
				{
				mTHEN(); 

				}
				break;
			case 4 :
				// D:\\Repos\\school\\project\\Project.g:1:23: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// D:\\Repos\\school\\project\\Project.g:1:28: LET
				{
				mLET(); 

				}
				break;
			case 6 :
				// D:\\Repos\\school\\project\\Project.g:1:32: VAL
				{
				mVAL(); 

				}
				break;
			case 7 :
				// D:\\Repos\\school\\project\\Project.g:1:36: BIND
				{
				mBIND(); 

				}
				break;
			case 8 :
				// D:\\Repos\\school\\project\\Project.g:1:41: IN
				{
				mIN(); 

				}
				break;
			case 9 :
				// D:\\Repos\\school\\project\\Project.g:1:44: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// D:\\Repos\\school\\project\\Project.g:1:48: FUN
				{
				mFUN(); 

				}
				break;
			case 11 :
				// D:\\Repos\\school\\project\\Project.g:1:52: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 12 :
				// D:\\Repos\\school\\project\\Project.g:1:59: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 13 :
				// D:\\Repos\\school\\project\\Project.g:1:66: WHILE
				{
				mWHILE(); 

				}
				break;
			case 14 :
				// D:\\Repos\\school\\project\\Project.g:1:72: DO
				{
				mDO(); 

				}
				break;
			case 15 :
				// D:\\Repos\\school\\project\\Project.g:1:75: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 16 :
				// D:\\Repos\\school\\project\\Project.g:1:82: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 17 :
				// D:\\Repos\\school\\project\\Project.g:1:89: NOT
				{
				mNOT(); 

				}
				break;
			case 18 :
				// D:\\Repos\\school\\project\\Project.g:1:93: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 19 :
				// D:\\Repos\\school\\project\\Project.g:1:100: RELOP
				{
				mRELOP(); 

				}
				break;
			case 20 :
				// D:\\Repos\\school\\project\\Project.g:1:106: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 21 :
				// D:\\Repos\\school\\project\\Project.g:1:112: MULOP
				{
				mMULOP(); 

				}
				break;
			case 22 :
				// D:\\Repos\\school\\project\\Project.g:1:118: TRUE
				{
				mTRUE(); 

				}
				break;
			case 23 :
				// D:\\Repos\\school\\project\\Project.g:1:123: FALSE
				{
				mFALSE(); 

				}
				break;
			case 24 :
				// D:\\Repos\\school\\project\\Project.g:1:129: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// D:\\Repos\\school\\project\\Project.g:1:132: NUM
				{
				mNUM(); 

				}
				break;
			case 26 :
				// D:\\Repos\\school\\project\\Project.g:1:136: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\2\uffff\5\24\1\uffff\1\24\2\uffff\2\24\12\uffff\1\44\1\45\6\24\1\uffff"+
		"\3\24\1\57\2\uffff\3\24\1\63\1\64\1\65\1\66\2\24\1\uffff\1\71\1\72\1\73"+
		"\4\uffff\2\24\3\uffff\1\76\1\77\2\uffff";
	static final String DFA4_eofS =
		"\100\uffff";
	static final String DFA4_minS =
		"\1\11\1\uffff\1\146\1\150\1\154\1\145\1\141\1\uffff\1\141\2\uffff\1\150"+
		"\1\157\12\uffff\2\60\1\145\1\165\1\163\1\144\1\164\1\154\1\uffff\1\156"+
		"\1\154\1\151\1\60\2\uffff\1\156\2\145\4\60\1\163\1\154\1\uffff\3\60\4"+
		"\uffff\2\145\3\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\uffff\1\156\1\162\1\156\1\145\1\141\1\uffff\1\165\2\uffff\1\150"+
		"\1\157\12\uffff\2\172\1\145\1\165\1\163\1\144\1\164\1\154\1\uffff\1\156"+
		"\1\154\1\151\1\172\2\uffff\1\156\2\145\4\172\1\163\1\154\1\uffff\3\172"+
		"\4\uffff\2\145\3\uffff\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\5\uffff\1\7\1\uffff\1\13\1\14\2\uffff\1\17\1\20\1\21\1\22"+
		"\1\23\1\24\1\25\1\30\1\31\1\32\10\uffff\1\7\4\uffff\1\2\1\10\11\uffff"+
		"\1\16\3\uffff\1\11\1\5\1\6\1\12\2\uffff\1\3\1\26\1\4\2\uffff\1\27\1\15";
	static final String DFA4_specialS =
		"\100\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\26\2\uffff\1\26\22\uffff\1\26\1\17\4\uffff\1\23\1\uffff\1\11\1\12"+
			"\1\23\1\22\1\uffff\1\22\1\uffff\1\23\12\25\1\20\1\1\1\21\1\7\3\uffff"+
			"\32\24\6\uffff\3\24\1\14\1\4\1\10\2\24\1\2\2\24\1\5\7\24\1\3\1\24\1\6"+
			"\1\13\3\24\1\15\1\22\1\16",
			"",
			"\1\27\7\uffff\1\30",
			"\1\31\11\uffff\1\32",
			"\1\33\1\uffff\1\34",
			"\1\35",
			"\1\36",
			"",
			"\1\41\23\uffff\1\40",
			"",
			"",
			"\1\42",
			"\1\43",
			"",
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
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"",
			"\1\54",
			"\1\55",
			"\1\56",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\1\67",
			"\1\70",
			"",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"\12\24\7\uffff\32\24\6\uffff\32\24",
			"",
			"",
			"",
			"",
			"\1\74",
			"\1\75",
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
			return "1:1: Tokens : ( SEMI | IF | THEN | ELSE | LET | VAL | BIND | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | RELOP | ADDOP | MULOP | TRUE | FALSE | ID | NUM | WS );";
		}
	}

}
