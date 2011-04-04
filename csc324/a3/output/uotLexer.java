// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/dmitry/Documents/University/repo/csc324/a3/uot.g 2011-04-04 12:45:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class uotLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int FSLASH=4;
    public static final int ASTERISK=5;
    public static final int SEMI=6;
    public static final int BEGIN=7;
    public static final int END=8;
    public static final int ASSIGN=9;
    public static final int LBRACKET=10;
    public static final int RBRACKET=11;
    public static final int COMMA=12;
    public static final int CHAR=13;
    public static final int NUMBER=14;
    public static final int TRUE=15;
    public static final int FALSE=16;
    public static final int STRING_LITERAL=17;
    public static final int WS=18;
    public static final int DIGIT=19;
    public static final int COMMENT=20;

    // delegates
    // delegators

    public uotLexer() {;} 
    public uotLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public uotLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/dmitry/Documents/University/repo/csc324/a3/uot.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:3:7: ( 'using' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:3:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:7: ( 'prototype' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:9: 'prototype'
            {
            match("prototype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:5:7: ( 'yield' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:5:9: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:6:7: ( 'when' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:6:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:7: ( 'orwhen' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:9: 'orwhen'
            {
            match("orwhen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:8:7: ( 'otherwise' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:8:9: 'otherwise'
            {
            match("otherwise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:9:7: ( 'aslong' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:9:9: 'aslong'
            {
            match("aslong"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:7: ( '-' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:11:7: ( '+' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:11:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:12:7: ( 'lessthan' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:12:9: 'lessthan'
            {
            match("lessthan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:13:7: ( 'greaterthan' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:13:9: 'greaterthan'
            {
            match("greaterthan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:7: ( 'greaterorequal' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:9: 'greaterorequal'
            {
            match("greaterorequal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:15:7: ( 'lessorequal' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:15:9: 'lessorequal'
            {
            match("lessorequal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:16:7: ( 'is' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:16:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:17:7: ( 'isnot' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:17:9: 'isnot'
            {
            match("isnot"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:18:7: ( 'and' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:18:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:19:7: ( 'or' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:19:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:20:7: ( 'visible' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:20:9: 'visible'
            {
            match("visible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:21:7: ( 'shielded' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:21:9: 'shielded'
            {
            match("shielded"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:22:7: ( 'onlyone' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:22:9: 'onlyone'
            {
            match("onlyone"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:23:7: ( 'constant' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:23:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:24:7: ( 'hidden' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:24:9: 'hidden'
            {
            match("hidden"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:25:7: ( 'integer' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:25:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:7: ( 'bool' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:27:7: ( 'char' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:27:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:28:7: ( 'double' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:28:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:29:7: ( 'nothing' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:29:9: 'nothing'
            {
            match("nothing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:30:7: ( '_' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:30:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:31:7: ( '.' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:32:7: ( '\\\\\\ ' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:32:9: '\\\\\\ '
            {
            match("\\ "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:33:7: ( 'E' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:33:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "FSLASH"
    public final void mFSLASH() throws RecognitionException {
        try {
            int _type = FSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:107:9: ( '/' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:107:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FSLASH"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:108:6: ( ';' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:108:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:109:9: ( '*' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:109:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:110:9: ( '(' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:110:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:111:7: ( ',' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:111:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:112:9: ( ')' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:112:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:113:9: ( '<-' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:113:11: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:114:6: ( 'true' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:114:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:115:7: ( 'false' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:115:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:116:7: ( 'begin' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:116:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:117:5: ( 'end' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:117:7: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:119:5: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:120:3: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:120:3: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:122:8: ( ( DIGIT )+ )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:122:11: ( DIGIT )+
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:122:11: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:122:12: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:125:2: ( '0' .. '9' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:125:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:127:6: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:128:3: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:130:2: ( '\\\"' (~ ( '\\\"' ) )* '\\\"' )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:130:4: '\\\"' (~ ( '\\\"' ) )* '\\\"'
            {
            match('\"'); 
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:130:8: (~ ( '\\\"' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:130:8: ~ ( '\\\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:5: ( '#' (~ ( '\\r' | '\\n' ) )* ( '\\r\\n' | '\\n' | '\\r' ) | '#' (~ ( '\\r' | '\\n' ) )* )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:9: '#' (~ ( '\\r' | '\\n' ) )* ( '\\r\\n' | '\\n' | '\\r' )
                    {
                    match('#'); 
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:13: (~ ( '\\r' | '\\n' ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:13: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:30: ( '\\r\\n' | '\\n' | '\\r' )
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='\n') ) {
                            alt5=1;
                        }
                        else {
                            alt5=3;}
                    }
                    else if ( (LA5_0=='\n') ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:32: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:41: '\\n'
                            {
                            match('\n'); 

                            }
                            break;
                        case 3 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:133:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:134:9: '#' (~ ( '\\r' | '\\n' ) )*
                    {
                    match('#'); 
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:134:13: (~ ( '\\r' | '\\n' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:134:13: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     skip(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FSLASH | SEMI | ASTERISK | LBRACKET | COMMA | RBRACKET | ASSIGN | TRUE | FALSE | BEGIN | END | WS | NUMBER | CHAR | STRING_LITERAL | COMMENT )
        int alt8=47;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:196: FSLASH
                {
                mFSLASH(); 

                }
                break;
            case 33 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:203: SEMI
                {
                mSEMI(); 

                }
                break;
            case 34 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:208: ASTERISK
                {
                mASTERISK(); 

                }
                break;
            case 35 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:217: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 36 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:226: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 37 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:232: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 38 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:241: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 39 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:248: TRUE
                {
                mTRUE(); 

                }
                break;
            case 40 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:253: FALSE
                {
                mFALSE(); 

                }
                break;
            case 41 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:259: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 42 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:265: END
                {
                mEND(); 

                }
                break;
            case 43 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:269: WS
                {
                mWS(); 

                }
                break;
            case 44 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:272: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 45 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:279: CHAR
                {
                mCHAR(); 

                }
                break;
            case 46 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:284: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 47 :
                // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:1:299: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA7_eotS =
        "\1\uffff\2\4\2\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\1\43\2\0\2\uffff";
    static final String DFA7_maxS =
        "\1\43\2\uffff\2\uffff";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\12\2\1\3\2\2\1\3\ufff2\2",
            "\12\2\1\3\2\2\1\3\ufff2\2",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "132:1: COMMENT : ( '#' (~ ( '\\r' | '\\n' ) )* ( '\\r\\n' | '\\n' | '\\r' ) | '#' (~ ( '\\r' | '\\n' ) )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                        s = -1;
                        if ( (LA7_2=='\n'||LA7_2=='\r') ) {s = 3;}

                        else if ( ((LA7_2>='\u0000' && LA7_2<='\t')||(LA7_2>='\u000B' && LA7_2<='\f')||(LA7_2>='\u000E' && LA7_2<='\uFFFF')) ) {s = 2;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_1 = input.LA(1);

                        s = -1;
                        if ( ((LA7_1>='\u0000' && LA7_1<='\t')||(LA7_1>='\u000B' && LA7_1<='\f')||(LA7_1>='\u000E' && LA7_1<='\uFFFF')) ) {s = 2;}

                        else if ( (LA7_1=='\n'||LA7_1=='\r') ) {s = 3;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\1\uffff\6\43\2\uffff\12\43\13\uffff\3\43\11\uffff\1\101\6\uffff"+
        "\1\105\35\uffff";
    static final String DFA8_eofS =
        "\117\uffff";
    static final String DFA8_minS =
        "\1\11\1\163\1\162\1\151\1\150\2\156\2\uffff\1\145\1\162\1\156\1"+
        "\151\2\150\1\151\1\145\2\157\13\uffff\1\162\1\141\1\156\11\uffff"+
        "\1\167\4\uffff\1\163\1\145\1\156\20\uffff\1\163\1\141\2\uffff\1"+
        "\157\1\164\2\uffff\1\145\1\162\1\157\2\uffff";
    static final String DFA8_maxS =
        "\1\172\1\163\1\162\1\151\1\150\1\164\1\163\2\uffff\1\145\1\162\1"+
        "\163\1\151\1\150\1\157\1\151\3\157\13\uffff\1\162\1\141\1\156\11"+
        "\uffff\1\167\4\uffff\1\163\1\145\1\156\20\uffff\1\163\1\141\2\uffff"+
        "\2\164\2\uffff\1\145\1\162\1\164\2\uffff";
    static final String DFA8_acceptS =
        "\7\uffff\1\10\1\11\12\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1"+
        "\43\1\44\1\45\1\46\3\uffff\1\53\1\54\1\55\1\56\1\57\1\1\1\2\1\3"+
        "\1\4\1\uffff\1\6\1\24\1\7\1\20\3\uffff\1\27\1\22\1\23\1\25\1\31"+
        "\1\26\1\30\1\51\1\32\1\33\1\37\1\47\1\50\1\52\1\5\1\21\2\uffff\1"+
        "\17\1\16\2\uffff\1\12\1\15\3\uffff\1\13\1\14";
    static final String DFA8_specialS =
        "\117\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\1\uffff\1\44\1\45\4\uffff\1"+
            "\32\1\34\1\31\1\10\1\33\1\7\1\24\1\27\12\42\1\uffff\1\30\1\35"+
            "\4\uffff\4\43\1\26\25\43\1\uffff\1\25\2\uffff\1\23\1\uffff\1"+
            "\6\1\20\1\16\1\21\1\40\1\37\1\12\1\17\1\13\2\43\1\11\1\43\1"+
            "\22\1\5\1\2\2\43\1\15\1\36\1\1\1\14\1\4\1\43\1\3\1\43",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\54\3\uffff\1\52\1\uffff\1\53",
            "\1\56\4\uffff\1\55",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\62\4\uffff\1\61",
            "\1\63",
            "\1\64",
            "\1\66\6\uffff\1\65",
            "\1\67",
            "\1\71\11\uffff\1\70",
            "\1\72",
            "\1\73",
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
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "",
            "",
            "\1\111\4\uffff\1\110",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\116\4\uffff\1\115",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | FSLASH | SEMI | ASTERISK | LBRACKET | COMMA | RBRACKET | ASSIGN | TRUE | FALSE | BEGIN | END | WS | NUMBER | CHAR | STRING_LITERAL | COMMENT );";
        }
    }
 

}