// $ANTLR null C:\\Repos\\school\\Worksheet9\\Expr.g 2018-12-06 16:41:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Repos\\school\\Worksheet9\\Expr.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Repos\\school\\Worksheet9\\Expr.g:3:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:
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
			// C:\\Repos\\school\\Worksheet9\\Expr.g:4:16: ( '0' .. '9' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:5:7: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:5:9: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Repos\\school\\Worksheet9\\Expr.g:5:16: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Repos\\school\\Worksheet9\\Expr.g:
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
			// C:\\Repos\\school\\Worksheet9\\Expr.g:6:8: ( ( DIGIT )+ )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:6:10: ( DIGIT )+
			{
			// C:\\Repos\\school\\Worksheet9\\Expr.g:6:10: ( DIGIT )+
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
					// C:\\Repos\\school\\Worksheet9\\Expr.g:
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

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:7:8: ( '+' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:7:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:8:8: ( '-' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:8:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:9:8: ( '*' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:9:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:10:8: ( '/' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:10:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:11:9: ( '(' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:11:11: '('
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
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:12:9: ( ')' )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:12:11: ')'
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
	// $ANTLR end "RPAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Repos\\school\\Worksheet9\\Expr.g:13:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Repos\\school\\Worksheet9\\Expr.g:13:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Repos\\school\\Worksheet9\\Expr.g:13:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
					// C:\\Repos\\school\\Worksheet9\\Expr.g:
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
		// C:\\Repos\\school\\Worksheet9\\Expr.g:1:8: ( ID | NUM | ADD | SUB | MUL | DIV | LPAR | RPAR | WS )
		int alt4=9;
		switch ( input.LA(1) ) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=1;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=2;
			}
			break;
		case '+':
			{
			alt4=3;
			}
			break;
		case '-':
			{
			alt4=4;
			}
			break;
		case '*':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case '(':
			{
			alt4=7;
			}
			break;
		case ')':
			{
			alt4=8;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=9;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:10: ID
				{
				mID(); 

				}
				break;
			case 2 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:13: NUM
				{
				mNUM(); 

				}
				break;
			case 3 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:17: ADD
				{
				mADD(); 

				}
				break;
			case 4 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:21: SUB
				{
				mSUB(); 

				}
				break;
			case 5 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:25: MUL
				{
				mMUL(); 

				}
				break;
			case 6 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:29: DIV
				{
				mDIV(); 

				}
				break;
			case 7 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:33: LPAR
				{
				mLPAR(); 

				}
				break;
			case 8 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:38: RPAR
				{
				mRPAR(); 

				}
				break;
			case 9 :
				// C:\\Repos\\school\\Worksheet9\\Expr.g:1:43: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
