// $ANTLR null C:\\Repos\\school\\Project.g 2018-10-30 16:05:06

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
	@Override public String getGrammarFileName() { return "C:\\Repos\\school\\Project.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Project.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Repos\\school\\Project.g:
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
			// C:\\Repos\\school\\Project.g:4:16: ( '0' .. '9' )
			// C:\\Repos\\school\\Project.g:
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

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Project.g:6:6: ( ( DIGIT )+ )
			// C:\\Repos\\school\\Project.g:6:8: ( DIGIT )+
			{
			// C:\\Repos\\school\\Project.g:6:8: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Repos\\school\\Project.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Project.g:7:5: ( 'IF' )
			// C:\\Repos\\school\\Project.g:7:7: 'IF'
			{
			match("IF"); 

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
			// C:\\Repos\\school\\Project.g:8:7: ( 'THEN' )
			// C:\\Repos\\school\\Project.g:8:9: 'THEN'
			{
			match("THEN"); 

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
			// C:\\Repos\\school\\Project.g:9:7: ( 'ELSE' )
			// C:\\Repos\\school\\Project.g:9:9: 'ELSE'
			{
			match("ELSE"); 

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
			// C:\\Repos\\school\\Project.g:10:6: ( 'LET' )
			// C:\\Repos\\school\\Project.g:10:8: 'LET'
			{
			match("LET"); 

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
			// C:\\Repos\\school\\Project.g:11:6: ( 'VAL' )
			// C:\\Repos\\school\\Project.g:11:8: 'VAL'
			{
			match("VAL"); 

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
			// C:\\Repos\\school\\Project.g:12:7: ( 'BIND' )
			// C:\\Repos\\school\\Project.g:12:9: 'BIND'
			{
			match("BIND"); 

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
			// C:\\Repos\\school\\Project.g:13:5: ( 'in' )
			// C:\\Repos\\school\\Project.g:13:7: 'in'
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
			// C:\\Repos\\school\\Project.g:14:6: ( 'end' )
			// C:\\Repos\\school\\Project.g:14:8: 'end'
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
			// C:\\Repos\\school\\Project.g:15:6: ( 'fun' )
			// C:\\Repos\\school\\Project.g:15:8: 'fun'
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
			// C:\\Repos\\school\\Project.g:16:9: ( '(' )
			// C:\\Repos\\school\\Project.g:16:11: '('
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
			// C:\\Repos\\school\\Project.g:17:9: ( ')' )
			// C:\\Repos\\school\\Project.g:17:11: ')'
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
			// C:\\Repos\\school\\Project.g:18:8: ( 'while' )
			// C:\\Repos\\school\\Project.g:18:10: 'while'
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
			// C:\\Repos\\school\\Project.g:19:5: ( 'do' )
			// C:\\Repos\\school\\Project.g:19:7: 'do'
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
			// C:\\Repos\\school\\Project.g:20:9: ( '{' )
			// C:\\Repos\\school\\Project.g:20:11: '{'
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
			// C:\\Repos\\school\\Project.g:21:9: ( '}' )
			// C:\\Repos\\school\\Project.g:21:11: '}'
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
			// C:\\Repos\\school\\Project.g:22:6: ( '!' )
			// C:\\Repos\\school\\Project.g:22:8: '!'
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
			// C:\\Repos\\school\\Project.g:23:9: ( ':BIND' )
			// C:\\Repos\\school\\Project.g:23:11: ':BIND'
			{
			match(":BIND"); 

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
			// C:\\Repos\\school\\Project.g:24:8: ( '<' | 'BIND' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='<') ) {
				alt2=1;
			}
			else if ( (LA2_0=='B') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// C:\\Repos\\school\\Project.g:24:10: '<'
					{
					match('<'); 
					}
					break;
				case 2 :
					// C:\\Repos\\school\\Project.g:24:16: 'BIND'
					{
					match("BIND"); 

					}
					break;

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
			// C:\\Repos\\school\\Project.g:25:8: ( '+' | '-' | '|' )
			// C:\\Repos\\school\\Project.g:
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
			// C:\\Repos\\school\\Project.g:26:8: ( '*' | '/' | '&' )
			// C:\\Repos\\school\\Project.g:
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
			// C:\\Repos\\school\\Project.g:27:7: ( 'true' )
			// C:\\Repos\\school\\Project.g:27:10: 'true'
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
			// C:\\Repos\\school\\Project.g:28:8: ( 'false' )
			// C:\\Repos\\school\\Project.g:28:10: 'false'
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

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Project.g:29:7: ( ';' )
			// C:\\Repos\\school\\Project.g:29:9: ';'
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Project.g:30:5: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Repos\\school\\Project.g:30:7: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Repos\\school\\Project.g:30:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Repos\\school\\Project.g:
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
					break loop3;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Project.g:31:5: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Repos\\school\\Project.g:31:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Repos\\school\\Project.g:31:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Repos\\school\\Project.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
		// C:\\Repos\\school\\Project.g:1:8: ( NUM | IF | THEN | ELSE | LET | VAL | BIND | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | RELOP | ADDOP | MULOP | TRUE | FALSE | SEMI | ID | WS )
		int alt5=26;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Repos\\school\\Project.g:1:10: NUM
				{
				mNUM(); 

				}
				break;
			case 2 :
				// C:\\Repos\\school\\Project.g:1:14: IF
				{
				mIF(); 

				}
				break;
			case 3 :
				// C:\\Repos\\school\\Project.g:1:17: THEN
				{
				mTHEN(); 

				}
				break;
			case 4 :
				// C:\\Repos\\school\\Project.g:1:22: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// C:\\Repos\\school\\Project.g:1:27: LET
				{
				mLET(); 

				}
				break;
			case 6 :
				// C:\\Repos\\school\\Project.g:1:31: VAL
				{
				mVAL(); 

				}
				break;
			case 7 :
				// C:\\Repos\\school\\Project.g:1:35: BIND
				{
				mBIND(); 

				}
				break;
			case 8 :
				// C:\\Repos\\school\\Project.g:1:40: IN
				{
				mIN(); 

				}
				break;
			case 9 :
				// C:\\Repos\\school\\Project.g:1:43: END
				{
				mEND(); 

				}
				break;
			case 10 :
				// C:\\Repos\\school\\Project.g:1:47: FUN
				{
				mFUN(); 

				}
				break;
			case 11 :
				// C:\\Repos\\school\\Project.g:1:51: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 12 :
				// C:\\Repos\\school\\Project.g:1:58: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 13 :
				// C:\\Repos\\school\\Project.g:1:65: WHILE
				{
				mWHILE(); 

				}
				break;
			case 14 :
				// C:\\Repos\\school\\Project.g:1:71: DO
				{
				mDO(); 

				}
				break;
			case 15 :
				// C:\\Repos\\school\\Project.g:1:74: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 16 :
				// C:\\Repos\\school\\Project.g:1:81: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 17 :
				// C:\\Repos\\school\\Project.g:1:88: NOT
				{
				mNOT(); 

				}
				break;
			case 18 :
				// C:\\Repos\\school\\Project.g:1:92: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 19 :
				// C:\\Repos\\school\\Project.g:1:99: RELOP
				{
				mRELOP(); 

				}
				break;
			case 20 :
				// C:\\Repos\\school\\Project.g:1:105: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 21 :
				// C:\\Repos\\school\\Project.g:1:111: MULOP
				{
				mMULOP(); 

				}
				break;
			case 22 :
				// C:\\Repos\\school\\Project.g:1:117: TRUE
				{
				mTRUE(); 

				}
				break;
			case 23 :
				// C:\\Repos\\school\\Project.g:1:122: FALSE
				{
				mFALSE(); 

				}
				break;
			case 24 :
				// C:\\Repos\\school\\Project.g:1:128: SEMI
				{
				mSEMI(); 

				}
				break;
			case 25 :
				// C:\\Repos\\school\\Project.g:1:133: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// C:\\Repos\\school\\Project.g:1:136: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\2\uffff\11\30\2\uffff\2\30\7\uffff\1\30\3\uffff\1\47\5\30\1\55\4\30\1"+
		"\62\1\30\1\uffff\2\30\1\66\1\67\1\30\1\uffff\1\71\1\72\2\30\1\uffff\1"+
		"\30\1\76\1\77\2\uffff\1\100\2\uffff\2\30\1\103\3\uffff\1\104\1\105\3\uffff";
	static final String DFA5_eofS =
		"\106\uffff";
	static final String DFA5_minS =
		"\1\11\1\uffff\1\106\1\110\1\114\1\105\1\101\1\111\2\156\1\141\2\uffff"+
		"\1\150\1\157\7\uffff\1\162\3\uffff\1\60\1\105\1\123\1\124\1\114\1\116"+
		"\1\60\1\144\1\156\1\154\1\151\1\60\1\165\1\uffff\1\116\1\105\2\60\1\104"+
		"\1\uffff\2\60\1\163\1\154\1\uffff\1\145\2\60\2\uffff\1\60\2\uffff\2\145"+
		"\1\60\3\uffff\2\60\3\uffff";
	static final String DFA5_maxS =
		"\1\175\1\uffff\1\106\1\110\1\114\1\105\1\101\1\111\2\156\1\165\2\uffff"+
		"\1\150\1\157\7\uffff\1\162\3\uffff\1\172\1\105\1\123\1\124\1\114\1\116"+
		"\1\172\1\144\1\156\1\154\1\151\1\172\1\165\1\uffff\1\116\1\105\2\172\1"+
		"\104\1\uffff\2\172\1\163\1\154\1\uffff\1\145\2\172\2\uffff\1\172\2\uffff"+
		"\2\145\1\172\3\uffff\2\172\3\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\11\uffff\1\13\1\14\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24"+
		"\1\25\1\uffff\1\30\1\31\1\32\15\uffff\1\2\5\uffff\1\10\4\uffff\1\16\3"+
		"\uffff\1\5\1\6\1\uffff\1\11\1\12\3\uffff\1\3\1\4\1\7\2\uffff\1\26\1\27"+
		"\1\15";
	static final String DFA5_specialS =
		"\106\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\31\2\uffff\1\31\22\uffff\1\31\1\21\4\uffff\1\25\1\uffff\1\13\1\14"+
			"\1\25\1\24\1\uffff\1\24\1\uffff\1\25\12\1\1\22\1\27\1\23\4\uffff\1\30"+
			"\1\7\2\30\1\4\3\30\1\2\2\30\1\5\7\30\1\3\1\30\1\6\4\30\6\uffff\3\30\1"+
			"\16\1\11\1\12\2\30\1\10\12\30\1\26\2\30\1\15\3\30\1\17\1\24\1\20",
			"",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\43\23\uffff\1\42",
			"",
			"",
			"\1\44",
			"\1\45",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\46",
			"",
			"",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\63",
			"",
			"\1\64",
			"\1\65",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\70",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\1\73",
			"\1\74",
			"",
			"\1\75",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"",
			"\1\101",
			"\1\102",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"",
			"",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"\12\30\7\uffff\32\30\6\uffff\32\30",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( NUM | IF | THEN | ELSE | LET | VAL | BIND | IN | END | FUN | LPAREN | RPAREN | WHILE | DO | LCURLY | RCURLY | NOT | ASSIGN | RELOP | ADDOP | MULOP | TRUE | FALSE | SEMI | ID | WS );";
		}
	}

}
