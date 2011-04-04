// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/dmitry/Documents/University/repo/csc324/a3/uot.g 2011-04-04 12:45:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class uotParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FSLASH", "ASTERISK", "SEMI", "BEGIN", "END", "ASSIGN", "LBRACKET", "RBRACKET", "COMMA", "CHAR", "NUMBER", "TRUE", "FALSE", "STRING_LITERAL", "WS", "DIGIT", "COMMENT", "'using'", "'prototype'", "'yield'", "'when'", "'orwhen'", "'otherwise'", "'aslong'", "'-'", "'+'", "'lessthan'", "'greaterthan'", "'greaterorequal'", "'lessorequal'", "'is'", "'isnot'", "'and'", "'or'", "'visible'", "'shielded'", "'onlyone'", "'constant'", "'hidden'", "'integer'", "'bool'", "'char'", "'double'", "'nothing'", "'_'", "'.'", "'\\\\\\ '", "'E'"
    };
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


        public uotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public uotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return uotParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/dmitry/Documents/University/repo/csc324/a3/uot.g"; }



    // $ANTLR start "prog"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:1: prog : ( useStatements | protoDecs )+ ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:7: ( ( useStatements | protoDecs )+ )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:9: ( useStatements | protoDecs )+
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:9: ( useStatements | protoDecs )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }
                else if ( (LA1_0==22||(LA1_0>=38 && LA1_0<=42)) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:10: useStatements
            	    {
            	    pushFollow(FOLLOW_useStatements_in_prog13);
            	    useStatements();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:4:24: protoDecs
            	    {
            	    pushFollow(FOLLOW_protoDecs_in_prog15);
            	    protoDecs();

            	    state._fsp--;


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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "useStatements"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:6:1: useStatements : 'using' ( dirname FSLASH )* ( dirname | ASTERISK ) SEMI ;
    public final void useStatements() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:2: ( 'using' ( dirname FSLASH )* ( dirname | ASTERISK ) SEMI )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:4: 'using' ( dirname FSLASH )* ( dirname | ASTERISK ) SEMI
            {
            match(input,21,FOLLOW_21_in_useStatements26); 
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:12: ( dirname FSLASH )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:13: dirname FSLASH
            	    {
            	    pushFollow(FOLLOW_dirname_in_useStatements29);
            	    dirname();

            	    state._fsp--;

            	    match(input,FSLASH,FOLLOW_FSLASH_in_useStatements31); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:30: ( dirname | ASTERISK )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=LBRACKET && LA3_0<=RBRACKET)||(LA3_0>=CHAR && LA3_0<=NUMBER)||LA3_0==28||(LA3_0>=48 && LA3_0<=50)) ) {
                alt3=1;
            }
            else if ( (LA3_0==ASTERISK) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:31: dirname
                    {
                    pushFollow(FOLLOW_dirname_in_useStatements36);
                    dirname();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:7:39: ASTERISK
                    {
                    match(input,ASTERISK,FOLLOW_ASTERISK_in_useStatements38); 

                    }
                    break;

            }

            match(input,SEMI,FOLLOW_SEMI_in_useStatements41); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "useStatements"


    // $ANTLR start "protoDecs"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:9:1: protoDecs : ( modifiers )* 'prototype' validName protoBody ;
    public final void protoDecs() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:2: ( ( modifiers )* 'prototype' validName protoBody )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:5: ( modifiers )* 'prototype' validName protoBody
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:5: ( modifiers )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=38 && LA4_0<=42)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:10:6: modifiers
            	    {
            	    pushFollow(FOLLOW_modifiers_in_protoDecs52);
            	    modifiers();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_protoDecs56); 
            pushFollow(FOLLOW_validName_in_protoDecs58);
            validName();

            state._fsp--;

            pushFollow(FOLLOW_protoBody_in_protoDecs60);
            protoBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "protoDecs"


    // $ANTLR start "protoBody"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:13:1: protoBody : BEGIN ( methodDecs | fieldDecs )* END ;
    public final void protoBody() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:2: ( BEGIN ( methodDecs | fieldDecs )* END )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:5: BEGIN ( methodDecs | fieldDecs )* END
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_protoBody72); 
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:11: ( methodDecs | fieldDecs )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=38 && LA5_0<=42)) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==47) ) {
                        alt5=1;
                    }
                    else if ( ((LA5_2>=43 && LA5_2<=46)) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==CHAR) ) {
                            alt5=1;
                        }
                        else if ( (LA5_4==END||(LA5_4>=38 && LA5_4<=42)) ) {
                            alt5=2;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:12: methodDecs
            	    {
            	    pushFollow(FOLLOW_methodDecs_in_protoBody75);
            	    methodDecs();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:14:25: fieldDecs
            	    {
            	    pushFollow(FOLLOW_fieldDecs_in_protoBody79);
            	    fieldDecs();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_protoBody83); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "protoBody"


    // $ANTLR start "fieldDecs"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:17:1: fieldDecs : modifiers datatype ;
    public final void fieldDecs() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:18:2: ( modifiers datatype )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:18:5: modifiers datatype
            {
            pushFollow(FOLLOW_modifiers_in_fieldDecs95);
            modifiers();

            state._fsp--;

            pushFollow(FOLLOW_datatype_in_fieldDecs97);
            datatype();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldDecs"


    // $ANTLR start "methodDecs"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:21:1: methodDecs : modifiers yieldtype validName formalList BEGIN statementList END ;
    public final void methodDecs() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:22:2: ( modifiers yieldtype validName formalList BEGIN statementList END )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:22:5: modifiers yieldtype validName formalList BEGIN statementList END
            {
            pushFollow(FOLLOW_modifiers_in_methodDecs109);
            modifiers();

            state._fsp--;

            pushFollow(FOLLOW_yieldtype_in_methodDecs111);
            yieldtype();

            state._fsp--;

            pushFollow(FOLLOW_validName_in_methodDecs113);
            validName();

            state._fsp--;

            pushFollow(FOLLOW_formalList_in_methodDecs115);
            formalList();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_methodDecs117); 
            pushFollow(FOLLOW_statementList_in_methodDecs119);
            statementList();

            state._fsp--;

            match(input,END,FOLLOW_END_in_methodDecs121); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodDecs"


    // $ANTLR start "statementList"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:25:1: statementList : ( statement )* ;
    public final void statementList() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:2: ( ( statement )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:4: ( statement )*
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:4: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==CHAR||(LA6_0>=23 && LA6_0<=24)||LA6_0==27||(LA6_0>=43 && LA6_0<=46)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:26:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statementList134);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "statementList"


    // $ANTLR start "statement"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:27:1: statement : ( validName ASSIGN expr SEMI | 'yield' expr SEMI | datatype validName ( ASSIGN expr )? SEMI | when | aslong );
    public final void statement() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:28:2: ( validName ASSIGN expr SEMI | 'yield' expr SEMI | datatype validName ( ASSIGN expr )? SEMI | when | aslong )
            int alt8=5;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:28:4: validName ASSIGN expr SEMI
                    {
                    pushFollow(FOLLOW_validName_in_statement144);
                    validName();

                    state._fsp--;

                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement146); 
                    pushFollow(FOLLOW_expr_in_statement148);
                    expr();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_statement150); 

                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:29:4: 'yield' expr SEMI
                    {
                    match(input,23,FOLLOW_23_in_statement157); 
                    pushFollow(FOLLOW_expr_in_statement159);
                    expr();

                    state._fsp--;

                    match(input,SEMI,FOLLOW_SEMI_in_statement161); 

                    }
                    break;
                case 3 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:30:4: datatype validName ( ASSIGN expr )? SEMI
                    {
                    pushFollow(FOLLOW_datatype_in_statement168);
                    datatype();

                    state._fsp--;

                    pushFollow(FOLLOW_validName_in_statement170);
                    validName();

                    state._fsp--;

                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:30:23: ( ASSIGN expr )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ASSIGN) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:30:24: ASSIGN expr
                            {
                            match(input,ASSIGN,FOLLOW_ASSIGN_in_statement173); 
                            pushFollow(FOLLOW_expr_in_statement175);
                            expr();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement179); 

                    }
                    break;
                case 4 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:31:4: when
                    {
                    pushFollow(FOLLOW_when_in_statement185);
                    when();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:32:4: aslong
                    {
                    pushFollow(FOLLOW_aslong_in_statement190);
                    aslong();

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
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "when"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:35:1: when : 'when' expr BEGIN whenBody END ;
    public final void when() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:35:6: ( 'when' expr BEGIN whenBody END )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:35:8: 'when' expr BEGIN whenBody END
            {
            match(input,24,FOLLOW_24_in_when201); 
            pushFollow(FOLLOW_expr_in_when203);
            expr();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_when205); 
            pushFollow(FOLLOW_whenBody_in_when207);
            whenBody();

            state._fsp--;

            match(input,END,FOLLOW_END_in_when209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "when"


    // $ANTLR start "whenBody"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:1: whenBody : statementList ( ( 'orwhen' expr statementList )* 'otherwise' statementList )? ;
    public final void whenBody() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:9: ( statementList ( ( 'orwhen' expr statementList )* 'otherwise' statementList )? )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:11: statementList ( ( 'orwhen' expr statementList )* 'otherwise' statementList )?
            {
            pushFollow(FOLLOW_statementList_in_whenBody215);
            statementList();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:25: ( ( 'orwhen' expr statementList )* 'otherwise' statementList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=25 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:26: ( 'orwhen' expr statementList )* 'otherwise' statementList
                    {
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:26: ( 'orwhen' expr statementList )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==25) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:36:27: 'orwhen' expr statementList
                    	    {
                    	    match(input,25,FOLLOW_25_in_whenBody219); 
                    	    pushFollow(FOLLOW_expr_in_whenBody221);
                    	    expr();

                    	    state._fsp--;

                    	    pushFollow(FOLLOW_statementList_in_whenBody223);
                    	    statementList();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,26,FOLLOW_26_in_whenBody227); 
                    pushFollow(FOLLOW_statementList_in_whenBody229);
                    statementList();

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
        }
        return ;
    }
    // $ANTLR end "whenBody"


    // $ANTLR start "aslong"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:39:1: aslong : 'aslong' expr BEGIN aslongBody END ;
    public final void aslong() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:39:8: ( 'aslong' expr BEGIN aslongBody END )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:39:10: 'aslong' expr BEGIN aslongBody END
            {
            match(input,27,FOLLOW_27_in_aslong241); 
            pushFollow(FOLLOW_expr_in_aslong243);
            expr();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_aslong245); 
            pushFollow(FOLLOW_aslongBody_in_aslong247);
            aslongBody();

            state._fsp--;

            match(input,END,FOLLOW_END_in_aslong249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aslong"


    // $ANTLR start "aslongBody"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:40:1: aslongBody : statementList ;
    public final void aslongBody() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:41:2: ( statementList )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:41:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_aslongBody257);
            statementList();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aslongBody"


    // $ANTLR start "expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:42:1: expr : ( mult_expr | ( '-' | '+' ) mult_expr );
    public final void expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:43:4: ( mult_expr | ( '-' | '+' ) mult_expr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LBRACKET||(LA11_0>=CHAR && LA11_0<=STRING_LITERAL)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:43:7: mult_expr
                    {
                    pushFollow(FOLLOW_mult_expr_in_expr268);
                    mult_expr();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:44:7: ( '-' | '+' ) mult_expr
                    {
                    if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_mult_expr_in_expr282);
                    mult_expr();

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
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "mult_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:47:1: mult_expr : addsub_expr ( ( '*' | '/' ) addsub_expr )* ;
    public final void mult_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:48:4: ( addsub_expr ( ( '*' | '/' ) addsub_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:48:7: addsub_expr ( ( '*' | '/' ) addsub_expr )*
            {
            pushFollow(FOLLOW_addsub_expr_in_mult_expr298);
            addsub_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:48:19: ( ( '*' | '/' ) addsub_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=FSLASH && LA12_0<=ASTERISK)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:48:20: ( '*' | '/' ) addsub_expr
            	    {
            	    if ( (input.LA(1)>=FSLASH && input.LA(1)<=ASTERISK) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addsub_expr_in_mult_expr311);
            	    addsub_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "mult_expr"


    // $ANTLR start "addsub_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:50:1: addsub_expr : ineq_expr ( ( '+' | '-' ) ineq_expr )* ;
    public final void addsub_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:51:4: ( ineq_expr ( ( '+' | '-' ) ineq_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:51:7: ineq_expr ( ( '+' | '-' ) ineq_expr )*
            {
            pushFollow(FOLLOW_ineq_expr_in_addsub_expr328);
            ineq_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:51:17: ( ( '+' | '-' ) ineq_expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:51:19: ( '+' | '-' ) ineq_expr
            	    {
            	    if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ineq_expr_in_addsub_expr342);
            	    ineq_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "addsub_expr"


    // $ANTLR start "ineq_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:54:1: ineq_expr : eq_expr ( ( 'lessthan' | 'greaterthan' | 'greaterorequal' | 'lessorequal' ) eq_expr )* ;
    public final void ineq_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:55:4: ( eq_expr ( ( 'lessthan' | 'greaterthan' | 'greaterorequal' | 'lessorequal' ) eq_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:55:7: eq_expr ( ( 'lessthan' | 'greaterthan' | 'greaterorequal' | 'lessorequal' ) eq_expr )*
            {
            pushFollow(FOLLOW_eq_expr_in_ineq_expr361);
            eq_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:55:15: ( ( 'lessthan' | 'greaterthan' | 'greaterorequal' | 'lessorequal' ) eq_expr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=30 && LA14_0<=33)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:55:16: ( 'lessthan' | 'greaterthan' | 'greaterorequal' | 'lessorequal' ) eq_expr
            	    {
            	    if ( (input.LA(1)>=30 && input.LA(1)<=33) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_eq_expr_in_ineq_expr388);
            	    eq_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ineq_expr"


    // $ANTLR start "eq_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:59:1: eq_expr : and_expr ( ( 'is' | 'isnot' ) and_expr )* ;
    public final void eq_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:60:2: ( and_expr ( ( 'is' | 'isnot' ) and_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:60:5: and_expr ( ( 'is' | 'isnot' ) and_expr )*
            {
            pushFollow(FOLLOW_and_expr_in_eq_expr404);
            and_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:60:14: ( ( 'is' | 'isnot' ) and_expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:60:15: ( 'is' | 'isnot' ) and_expr
            	    {
            	    if ( (input.LA(1)>=34 && input.LA(1)<=35) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_and_expr_in_eq_expr417);
            	    and_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "eq_expr"


    // $ANTLR start "and_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:63:1: and_expr : or_expr ( 'and' or_expr )* ;
    public final void and_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:64:2: ( or_expr ( 'and' or_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:64:5: or_expr ( 'and' or_expr )*
            {
            pushFollow(FOLLOW_or_expr_in_and_expr434);
            or_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:64:13: ( 'and' or_expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:64:15: 'and' or_expr
            	    {
            	    match(input,36,FOLLOW_36_in_and_expr438); 
            	    pushFollow(FOLLOW_or_expr_in_and_expr440);
            	    or_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "and_expr"


    // $ANTLR start "or_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:67:1: or_expr : main_expr ( 'or' main_expr )* ;
    public final void or_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:68:2: ( main_expr ( 'or' main_expr )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:68:5: main_expr ( 'or' main_expr )*
            {
            pushFollow(FOLLOW_main_expr_in_or_expr457);
            main_expr();

            state._fsp--;

            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:68:15: ( 'or' main_expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:68:17: 'or' main_expr
            	    {
            	    match(input,37,FOLLOW_37_in_or_expr461); 
            	    pushFollow(FOLLOW_main_expr_in_or_expr463);
            	    main_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "or_expr"


    // $ANTLR start "main_expr"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:71:1: main_expr : ( validName | constant | ( LBRACKET expr RBRACKET ) );
    public final void main_expr() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:72:3: ( validName | constant | ( LBRACKET expr RBRACKET ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case CHAR:
                {
                alt18=1;
                }
                break;
            case NUMBER:
            case TRUE:
            case FALSE:
            case STRING_LITERAL:
                {
                alt18=2;
                }
                break;
            case LBRACKET:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:72:6: validName
                    {
                    pushFollow(FOLLOW_validName_in_main_expr480);
                    validName();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:73:6: constant
                    {
                    pushFollow(FOLLOW_constant_in_main_expr488);
                    constant();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:74:7: ( LBRACKET expr RBRACKET )
                    {
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:74:7: ( LBRACKET expr RBRACKET )
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:74:8: LBRACKET expr RBRACKET
                    {
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_main_expr498); 
                    pushFollow(FOLLOW_expr_in_main_expr500);
                    expr();

                    state._fsp--;

                    match(input,RBRACKET,FOLLOW_RBRACKET_in_main_expr502); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "main_expr"


    // $ANTLR start "formalList"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:77:1: formalList : LBRACKET ( formal COMMA )* RBRACKET ;
    public final void formalList() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:78:2: ( LBRACKET ( formal COMMA )* RBRACKET )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:78:5: LBRACKET ( formal COMMA )* RBRACKET
            {
            match(input,LBRACKET,FOLLOW_LBRACKET_in_formalList518); 
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:78:14: ( formal COMMA )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=43 && LA19_0<=46)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:78:15: formal COMMA
            	    {
            	    pushFollow(FOLLOW_formal_in_formalList521);
            	    formal();

            	    state._fsp--;

            	    match(input,COMMA,FOLLOW_COMMA_in_formalList523); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,RBRACKET,FOLLOW_RBRACKET_in_formalList527); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalList"


    // $ANTLR start "formal"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:80:1: formal : datatype validName ;
    public final void formal() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:80:8: ( datatype validName )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:80:10: datatype validName
            {
            pushFollow(FOLLOW_datatype_in_formal536);
            datatype();

            state._fsp--;

            pushFollow(FOLLOW_validName_in_formal538);
            validName();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formal"


    // $ANTLR start "modifiers"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:82:1: modifiers : ( 'visible' | 'shielded' | 'onlyone' | 'constant' | 'hidden' ) ;
    public final void modifiers() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:83:2: ( ( 'visible' | 'shielded' | 'onlyone' | 'constant' | 'hidden' ) )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:83:5: ( 'visible' | 'shielded' | 'onlyone' | 'constant' | 'hidden' )
            {
            if ( (input.LA(1)>=38 && input.LA(1)<=42) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "modifiers"


    // $ANTLR start "datatype"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:85:1: datatype : ( 'integer' | 'bool' | 'char' | 'double' ) ;
    public final void datatype() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:86:2: ( ( 'integer' | 'bool' | 'char' | 'double' ) )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:86:5: ( 'integer' | 'bool' | 'char' | 'double' )
            {
            if ( (input.LA(1)>=43 && input.LA(1)<=46) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "datatype"


    // $ANTLR start "yieldtype"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:89:1: yieldtype : ( 'nothing' | datatype ) ;
    public final void yieldtype() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:90:2: ( ( 'nothing' | datatype ) )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:90:5: ( 'nothing' | datatype )
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:90:5: ( 'nothing' | datatype )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==47) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=43 && LA20_0<=46)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:90:6: 'nothing'
                    {
                    match(input,47,FOLLOW_47_in_yieldtype605); 

                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:90:18: datatype
                    {
                    pushFollow(FOLLOW_datatype_in_yieldtype609);
                    datatype();

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
        }
        return ;
    }
    // $ANTLR end "yieldtype"


    // $ANTLR start "dirname"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:92:1: dirname : ( CHAR | NUMBER | '-' | '_' | '.' | '(' | ')' | '\\\\\\ ' )+ ;
    public final void dirname() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:93:2: ( ( CHAR | NUMBER | '-' | '_' | '.' | '(' | ')' | '\\\\\\ ' )+ )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:93:5: ( CHAR | NUMBER | '-' | '_' | '.' | '(' | ')' | '\\\\\\ ' )+
            {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:93:5: ( CHAR | NUMBER | '-' | '_' | '.' | '(' | ')' | '\\\\\\ ' )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=LBRACKET && LA21_0<=RBRACKET)||(LA21_0>=CHAR && LA21_0<=NUMBER)||LA21_0==28||(LA21_0>=48 && LA21_0<=50)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:
            	    {
            	    if ( (input.LA(1)>=LBRACKET && input.LA(1)<=RBRACKET)||(input.LA(1)>=CHAR && input.LA(1)<=NUMBER)||input.LA(1)==28||(input.LA(1)>=48 && input.LA(1)<=50) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "dirname"


    // $ANTLR start "validName"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:96:1: validName : CHAR ( CHAR | NUMBER )* ;
    public final void validName() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:97:2: ( CHAR ( CHAR | NUMBER )* )
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:97:5: CHAR ( CHAR | NUMBER )*
            {
            match(input,CHAR,FOLLOW_CHAR_in_validName664); 
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:97:10: ( CHAR | NUMBER )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=CHAR && LA22_0<=NUMBER)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:
            	    {
            	    if ( (input.LA(1)>=CHAR && input.LA(1)<=NUMBER) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "validName"


    // $ANTLR start "constant"
    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:1: constant : ( ( NUMBER )+ '.' ( NUMBER )+ | ( NUMBER )+ ( '.' ( NUMBER )* )? 'E' ( '-' | '+' )? ( NUMBER )+ | ( NUMBER )+ | ( TRUE | FALSE ) | STRING_LITERAL );
    public final void constant() throws RecognitionException {
        try {
            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:9: ( ( NUMBER )+ '.' ( NUMBER )+ | ( NUMBER )+ ( '.' ( NUMBER )* )? 'E' ( '-' | '+' )? ( NUMBER )+ | ( NUMBER )+ | ( TRUE | FALSE ) | STRING_LITERAL )
            int alt31=5;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:11: ( NUMBER )+ '.' ( NUMBER )+
                    {
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:11: ( NUMBER )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==NUMBER) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:11: NUMBER
                    	    {
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_constant683); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    match(input,49,FOLLOW_49_in_constant685); 
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:21: ( NUMBER )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==NUMBER) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:99:21: NUMBER
                    	    {
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_constant686); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:4: ( NUMBER )+ ( '.' ( NUMBER )* )? 'E' ( '-' | '+' )? ( NUMBER )+
                    {
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:4: ( NUMBER )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==NUMBER) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:4: NUMBER
                    	    {
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_constant692); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:11: ( '.' ( NUMBER )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==49) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:12: '.' ( NUMBER )*
                            {
                            match(input,49,FOLLOW_49_in_constant695); 
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:15: ( NUMBER )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==NUMBER) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:16: NUMBER
                            	    {
                            	    match(input,NUMBER,FOLLOW_NUMBER_in_constant697); 

                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,51,FOLLOW_51_in_constant702); 
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:29: ( '-' | '+' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=28 && LA28_0<=29)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:
                            {
                            if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }

                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:39: ( NUMBER )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==NUMBER) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:100:39: NUMBER
                    	    {
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_constant709); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:101:4: ( NUMBER )+
                    {
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:101:4: ( NUMBER )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==NUMBER) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:101:4: NUMBER
                    	    {
                    	    match(input,NUMBER,FOLLOW_NUMBER_in_constant715); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:102:4: ( TRUE | FALSE )
                    {
                    if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 5 :
                    // /Users/dmitry/Documents/University/repo/csc324/a3/uot.g:103:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant730); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA2_eotS =
        "\4\uffff";
    static final String DFA2_eofS =
        "\4\uffff";
    static final String DFA2_minS =
        "\1\5\1\4\2\uffff";
    static final String DFA2_maxS =
        "\2\62\2\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA2_specialS =
        "\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\4\uffff\2\1\1\uffff\2\1\15\uffff\1\1\23\uffff\3\1",
            "\1\3\1\uffff\1\2\3\uffff\2\1\1\uffff\2\1\15\uffff\1\1\23\uffff"+
            "\3\1",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 7:12: ( dirname FSLASH )*";
        }
    }
    static final String DFA31_eotS =
        "\11\uffff";
    static final String DFA31_eofS =
        "\11\uffff";
    static final String DFA31_minS =
        "\1\16\1\4\2\uffff\1\16\2\uffff\1\4\1\uffff";
    static final String DFA31_maxS =
        "\1\21\1\63\2\uffff\1\63\2\uffff\1\63\1\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\4\1\5\1\uffff\1\2\1\3\1\uffff\1\1";
    static final String DFA31_specialS =
        "\11\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\2\2\1\3",
            "\4\6\3\uffff\1\6\1\uffff\1\6\1\1\10\uffff\17\6\5\uffff\4\6"+
            "\2\uffff\1\4\1\uffff\1\5",
            "",
            "",
            "\1\7\44\uffff\1\5",
            "",
            "",
            "\4\10\3\uffff\1\10\1\uffff\1\10\1\7\10\uffff\17\10\5\uffff"+
            "\4\10\4\uffff\1\5",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "99:1: constant : ( ( NUMBER )+ '.' ( NUMBER )+ | ( NUMBER )+ ( '.' ( NUMBER )* )? 'E' ( '-' | '+' )? ( NUMBER )+ | ( NUMBER )+ | ( TRUE | FALSE ) | STRING_LITERAL );";
        }
    }
 

    public static final BitSet FOLLOW_useStatements_in_prog13 = new BitSet(new long[]{0x000007C000600002L});
    public static final BitSet FOLLOW_protoDecs_in_prog15 = new BitSet(new long[]{0x000007C000600002L});
    public static final BitSet FOLLOW_21_in_useStatements26 = new BitSet(new long[]{0x0007000010006C20L});
    public static final BitSet FOLLOW_dirname_in_useStatements29 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_FSLASH_in_useStatements31 = new BitSet(new long[]{0x0007000010006C20L});
    public static final BitSet FOLLOW_dirname_in_useStatements36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASTERISK_in_useStatements38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_useStatements41 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_protoDecs52 = new BitSet(new long[]{0x000007C000400000L});
    public static final BitSet FOLLOW_22_in_protoDecs56 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_validName_in_protoDecs58 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_protoBody_in_protoDecs60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_protoBody72 = new BitSet(new long[]{0x000007C000000100L});
    public static final BitSet FOLLOW_methodDecs_in_protoBody75 = new BitSet(new long[]{0x000007C000000100L});
    public static final BitSet FOLLOW_fieldDecs_in_protoBody79 = new BitSet(new long[]{0x000007C000000100L});
    public static final BitSet FOLLOW_END_in_protoBody83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDecs95 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_datatype_in_fieldDecs97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDecs109 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_yieldtype_in_methodDecs111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_validName_in_methodDecs113 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_formalList_in_methodDecs115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BEGIN_in_methodDecs117 = new BitSet(new long[]{0x0000780009802100L});
    public static final BitSet FOLLOW_statementList_in_methodDecs119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_methodDecs121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList134 = new BitSet(new long[]{0x0000780009802002L});
    public static final BitSet FOLLOW_validName_in_statement144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ASSIGN_in_statement146 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_statement148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_statement150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement157 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_statement159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_statement161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_statement168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_validName_in_statement170 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_ASSIGN_in_statement173 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_statement175 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMI_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_when_in_statement185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aslong_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_when201 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_when203 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BEGIN_in_when205 = new BitSet(new long[]{0x000078000F802000L});
    public static final BitSet FOLLOW_whenBody_in_when207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_when209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementList_in_whenBody215 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_whenBody219 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_whenBody221 = new BitSet(new long[]{0x000078000F802000L});
    public static final BitSet FOLLOW_statementList_in_whenBody223 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_whenBody227 = new BitSet(new long[]{0x0000780009802000L});
    public static final BitSet FOLLOW_statementList_in_whenBody229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_aslong241 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_aslong243 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BEGIN_in_aslong245 = new BitSet(new long[]{0x0000780009802000L});
    public static final BitSet FOLLOW_aslongBody_in_aslong247 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_aslong249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementList_in_aslongBody257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr276 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_mult_expr_in_expr282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_addsub_expr_in_mult_expr298 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_mult_expr301 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_addsub_expr_in_mult_expr311 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ineq_expr_in_addsub_expr328 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_addsub_expr332 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_ineq_expr_in_addsub_expr342 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_eq_expr_in_ineq_expr361 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_set_in_ineq_expr364 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_eq_expr_in_ineq_expr388 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_and_expr_in_eq_expr404 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_eq_expr407 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_and_expr_in_eq_expr417 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_or_expr_in_and_expr434 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_and_expr438 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_or_expr_in_and_expr440 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_main_expr_in_or_expr457 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_or_expr461 = new BitSet(new long[]{0x000000000003E400L});
    public static final BitSet FOLLOW_main_expr_in_or_expr463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_validName_in_main_expr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_main_expr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_main_expr498 = new BitSet(new long[]{0x000000003003E400L});
    public static final BitSet FOLLOW_expr_in_main_expr500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RBRACKET_in_main_expr502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_formalList518 = new BitSet(new long[]{0x0000780000000800L});
    public static final BitSet FOLLOW_formal_in_formalList521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMMA_in_formalList523 = new BitSet(new long[]{0x0000780000000800L});
    public static final BitSet FOLLOW_RBRACKET_in_formalList527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_formal536 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_validName_in_formal538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifiers548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_datatype578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_yieldtype605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_yieldtype609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_dirname621 = new BitSet(new long[]{0x0007000010006C02L});
    public static final BitSet FOLLOW_CHAR_in_validName664 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_set_in_validName666 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_NUMBER_in_constant683 = new BitSet(new long[]{0x0002000000004000L});
    public static final BitSet FOLLOW_49_in_constant685 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_constant686 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NUMBER_in_constant692 = new BitSet(new long[]{0x000A000000004000L});
    public static final BitSet FOLLOW_49_in_constant695 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_constant697 = new BitSet(new long[]{0x0008000000004000L});
    public static final BitSet FOLLOW_51_in_constant702 = new BitSet(new long[]{0x0000000030004000L});
    public static final BitSet FOLLOW_set_in_constant703 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_constant709 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_NUMBER_in_constant715 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_set_in_constant721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant730 = new BitSet(new long[]{0x0000000000000002L});

}