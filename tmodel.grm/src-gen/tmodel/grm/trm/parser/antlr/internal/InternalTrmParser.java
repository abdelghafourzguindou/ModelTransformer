package tmodel.grm.trm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tmodel.grm.trm.services.TrmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTrmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "'{'", "','", "'}'", "'begin:'", "'end'", "';'", "'metamodel'", "'from'", "'model'", "'='", "'where'", "'('", "')'", "'add'", "'in'", "'with'", "'update'", "'set'", "'delete'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTrmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTrmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTrmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTrm.g"; }



     	private TrmGrammarAccess grammarAccess;

        public InternalTrmParser(TokenStream input, TrmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Runner";
       	}

       	@Override
       	protected TrmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRunner"
    // InternalTrm.g:64:1: entryRuleRunner returns [EObject current=null] : iv_ruleRunner= ruleRunner EOF ;
    public final EObject entryRuleRunner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunner = null;


        try {
            // InternalTrm.g:64:47: (iv_ruleRunner= ruleRunner EOF )
            // InternalTrm.g:65:2: iv_ruleRunner= ruleRunner EOF
            {
             newCompositeNode(grammarAccess.getRunnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunner=ruleRunner();

            state._fsp--;

             current =iv_ruleRunner; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunner"


    // $ANTLR start "ruleRunner"
    // InternalTrm.g:71:1: ruleRunner returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= '{' ( (lv_loader_2_0= ruleLoader ) ) otherlv_3= ',' ( (lv_loader_4_0= ruleLoader ) ) otherlv_5= '}' otherlv_6= 'begin:' ( (lv_operations_7_0= ruleOperation ) ) ( (lv_operations_8_0= ruleOperation ) )* otherlv_9= 'end' ) ;
    public final EObject ruleRunner() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_loader_2_0 = null;

        EObject lv_loader_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_8_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:77:2: ( (otherlv_0= 'load' otherlv_1= '{' ( (lv_loader_2_0= ruleLoader ) ) otherlv_3= ',' ( (lv_loader_4_0= ruleLoader ) ) otherlv_5= '}' otherlv_6= 'begin:' ( (lv_operations_7_0= ruleOperation ) ) ( (lv_operations_8_0= ruleOperation ) )* otherlv_9= 'end' ) )
            // InternalTrm.g:78:2: (otherlv_0= 'load' otherlv_1= '{' ( (lv_loader_2_0= ruleLoader ) ) otherlv_3= ',' ( (lv_loader_4_0= ruleLoader ) ) otherlv_5= '}' otherlv_6= 'begin:' ( (lv_operations_7_0= ruleOperation ) ) ( (lv_operations_8_0= ruleOperation ) )* otherlv_9= 'end' )
            {
            // InternalTrm.g:78:2: (otherlv_0= 'load' otherlv_1= '{' ( (lv_loader_2_0= ruleLoader ) ) otherlv_3= ',' ( (lv_loader_4_0= ruleLoader ) ) otherlv_5= '}' otherlv_6= 'begin:' ( (lv_operations_7_0= ruleOperation ) ) ( (lv_operations_8_0= ruleOperation ) )* otherlv_9= 'end' )
            // InternalTrm.g:79:3: otherlv_0= 'load' otherlv_1= '{' ( (lv_loader_2_0= ruleLoader ) ) otherlv_3= ',' ( (lv_loader_4_0= ruleLoader ) ) otherlv_5= '}' otherlv_6= 'begin:' ( (lv_operations_7_0= ruleOperation ) ) ( (lv_operations_8_0= ruleOperation ) )* otherlv_9= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRunnerAccess().getLoadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRunnerAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalTrm.g:87:3: ( (lv_loader_2_0= ruleLoader ) )
            // InternalTrm.g:88:4: (lv_loader_2_0= ruleLoader )
            {
            // InternalTrm.g:88:4: (lv_loader_2_0= ruleLoader )
            // InternalTrm.g:89:5: lv_loader_2_0= ruleLoader
            {

            					newCompositeNode(grammarAccess.getRunnerAccess().getLoaderLoaderParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_loader_2_0=ruleLoader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunnerRule());
            					}
            					add(
            						current,
            						"loader",
            						lv_loader_2_0,
            						"tmodel.grm.trm.Trm.Loader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRunnerAccess().getCommaKeyword_3());
            		
            // InternalTrm.g:110:3: ( (lv_loader_4_0= ruleLoader ) )
            // InternalTrm.g:111:4: (lv_loader_4_0= ruleLoader )
            {
            // InternalTrm.g:111:4: (lv_loader_4_0= ruleLoader )
            // InternalTrm.g:112:5: lv_loader_4_0= ruleLoader
            {

            					newCompositeNode(grammarAccess.getRunnerAccess().getLoaderLoaderParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_loader_4_0=ruleLoader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunnerRule());
            					}
            					add(
            						current,
            						"loader",
            						lv_loader_4_0,
            						"tmodel.grm.trm.Trm.Loader");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRunnerAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getRunnerAccess().getBeginKeyword_6());
            		
            // InternalTrm.g:137:3: ( (lv_operations_7_0= ruleOperation ) )
            // InternalTrm.g:138:4: (lv_operations_7_0= ruleOperation )
            {
            // InternalTrm.g:138:4: (lv_operations_7_0= ruleOperation )
            // InternalTrm.g:139:5: lv_operations_7_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getRunnerAccess().getOperationsOperationParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_operations_7_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunnerRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_7_0,
            						"tmodel.grm.trm.Trm.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrm.g:156:3: ( (lv_operations_8_0= ruleOperation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25||LA1_0==28||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTrm.g:157:4: (lv_operations_8_0= ruleOperation )
            	    {
            	    // InternalTrm.g:157:4: (lv_operations_8_0= ruleOperation )
            	    // InternalTrm.g:158:5: lv_operations_8_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getRunnerAccess().getOperationsOperationParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_operations_8_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunnerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_8_0,
            	    						"tmodel.grm.trm.Trm.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRunnerAccess().getEndKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunner"


    // $ANTLR start "entryRuleLoader"
    // InternalTrm.g:183:1: entryRuleLoader returns [EObject current=null] : iv_ruleLoader= ruleLoader EOF ;
    public final EObject entryRuleLoader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoader = null;


        try {
            // InternalTrm.g:183:47: (iv_ruleLoader= ruleLoader EOF )
            // InternalTrm.g:184:2: iv_ruleLoader= ruleLoader EOF
            {
             newCompositeNode(grammarAccess.getLoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoader=ruleLoader();

            state._fsp--;

             current =iv_ruleLoader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoader"


    // $ANTLR start "ruleLoader"
    // InternalTrm.g:190:1: ruleLoader returns [EObject current=null] : (this_LoadMetaModel_0= ruleLoadMetaModel | this_LoadModel_1= ruleLoadModel ) ;
    public final EObject ruleLoader() throws RecognitionException {
        EObject current = null;

        EObject this_LoadMetaModel_0 = null;

        EObject this_LoadModel_1 = null;



        	enterRule();

        try {
            // InternalTrm.g:196:2: ( (this_LoadMetaModel_0= ruleLoadMetaModel | this_LoadModel_1= ruleLoadModel ) )
            // InternalTrm.g:197:2: (this_LoadMetaModel_0= ruleLoadMetaModel | this_LoadModel_1= ruleLoadModel )
            {
            // InternalTrm.g:197:2: (this_LoadMetaModel_0= ruleLoadMetaModel | this_LoadModel_1= ruleLoadModel )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTrm.g:198:3: this_LoadMetaModel_0= ruleLoadMetaModel
                    {

                    			newCompositeNode(grammarAccess.getLoaderAccess().getLoadMetaModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadMetaModel_0=ruleLoadMetaModel();

                    state._fsp--;


                    			current = this_LoadMetaModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalTrm.g:207:3: this_LoadModel_1= ruleLoadModel
                    {

                    			newCompositeNode(grammarAccess.getLoaderAccess().getLoadModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoadModel_1=ruleLoadModel();

                    state._fsp--;


                    			current = this_LoadModel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoader"


    // $ANTLR start "entryRuleOperation"
    // InternalTrm.g:219:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalTrm.g:219:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalTrm.g:220:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalTrm.g:226:1: ruleOperation returns [EObject current=null] : ( (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) otherlv_3= ';' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Add_0 = null;

        EObject this_Update_1 = null;

        EObject this_Delete_2 = null;



        	enterRule();

        try {
            // InternalTrm.g:232:2: ( ( (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) otherlv_3= ';' ) )
            // InternalTrm.g:233:2: ( (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) otherlv_3= ';' )
            {
            // InternalTrm.g:233:2: ( (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) otherlv_3= ';' )
            // InternalTrm.g:234:3: (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete ) otherlv_3= ';'
            {
            // InternalTrm.g:234:3: (this_Add_0= ruleAdd | this_Update_1= ruleUpdate | this_Delete_2= ruleDelete )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 30:
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
                    // InternalTrm.g:235:4: this_Add_0= ruleAdd
                    {

                    				newCompositeNode(grammarAccess.getOperationAccess().getAddParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_10);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    				current = this_Add_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalTrm.g:244:4: this_Update_1= ruleUpdate
                    {

                    				newCompositeNode(grammarAccess.getOperationAccess().getUpdateParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_10);
                    this_Update_1=ruleUpdate();

                    state._fsp--;


                    				current = this_Update_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalTrm.g:253:4: this_Delete_2= ruleDelete
                    {

                    				newCompositeNode(grammarAccess.getOperationAccess().getDeleteParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_10);
                    this_Delete_2=ruleDelete();

                    state._fsp--;


                    				current = this_Delete_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleEString"
    // InternalTrm.g:270:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTrm.g:270:47: (iv_ruleEString= ruleEString EOF )
            // InternalTrm.g:271:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTrm.g:277:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTrm.g:283:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTrm.g:284:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTrm.g:284:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTrm.g:285:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTrm.g:293:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleLoadMetaModel"
    // InternalTrm.g:304:1: entryRuleLoadMetaModel returns [EObject current=null] : iv_ruleLoadMetaModel= ruleLoadMetaModel EOF ;
    public final EObject entryRuleLoadMetaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadMetaModel = null;


        try {
            // InternalTrm.g:304:54: (iv_ruleLoadMetaModel= ruleLoadMetaModel EOF )
            // InternalTrm.g:305:2: iv_ruleLoadMetaModel= ruleLoadMetaModel EOF
            {
             newCompositeNode(grammarAccess.getLoadMetaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadMetaModel=ruleLoadMetaModel();

            state._fsp--;

             current =iv_ruleLoadMetaModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadMetaModel"


    // $ANTLR start "ruleLoadMetaModel"
    // InternalTrm.g:311:1: ruleLoadMetaModel returns [EObject current=null] : (otherlv_0= 'metamodel' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) ) ;
    public final EObject ruleLoadMetaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:317:2: ( (otherlv_0= 'metamodel' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) ) )
            // InternalTrm.g:318:2: (otherlv_0= 'metamodel' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) )
            {
            // InternalTrm.g:318:2: (otherlv_0= 'metamodel' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) )
            // InternalTrm.g:319:3: otherlv_0= 'metamodel' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadMetaModelAccess().getMetamodelKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadMetaModelAccess().getFromKeyword_1());
            		
            // InternalTrm.g:327:3: ()
            // InternalTrm.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadMetaModelAccess().getLoadMetaModelAction_2(),
            					current);
            			

            }

            // InternalTrm.g:334:3: ( (lv_url_3_0= ruleEString ) )
            // InternalTrm.g:335:4: (lv_url_3_0= ruleEString )
            {
            // InternalTrm.g:335:4: (lv_url_3_0= ruleEString )
            // InternalTrm.g:336:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadMetaModelAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadMetaModelRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadMetaModel"


    // $ANTLR start "entryRuleLoadModel"
    // InternalTrm.g:357:1: entryRuleLoadModel returns [EObject current=null] : iv_ruleLoadModel= ruleLoadModel EOF ;
    public final EObject entryRuleLoadModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadModel = null;


        try {
            // InternalTrm.g:357:50: (iv_ruleLoadModel= ruleLoadModel EOF )
            // InternalTrm.g:358:2: iv_ruleLoadModel= ruleLoadModel EOF
            {
             newCompositeNode(grammarAccess.getLoadModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadModel=ruleLoadModel();

            state._fsp--;

             current =iv_ruleLoadModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoadModel"


    // $ANTLR start "ruleLoadModel"
    // InternalTrm.g:364:1: ruleLoadModel returns [EObject current=null] : (otherlv_0= 'model' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) ) ;
    public final EObject ruleLoadModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_url_3_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:370:2: ( (otherlv_0= 'model' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) ) )
            // InternalTrm.g:371:2: (otherlv_0= 'model' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) )
            {
            // InternalTrm.g:371:2: (otherlv_0= 'model' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) ) )
            // InternalTrm.g:372:3: otherlv_0= 'model' otherlv_1= 'from' () ( (lv_url_3_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLoadModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadModelAccess().getFromKeyword_1());
            		
            // InternalTrm.g:380:3: ()
            // InternalTrm.g:381:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadModelAccess().getLoadModelAction_2(),
            					current);
            			

            }

            // InternalTrm.g:387:3: ( (lv_url_3_0= ruleEString ) )
            // InternalTrm.g:388:4: (lv_url_3_0= ruleEString )
            {
            // InternalTrm.g:388:4: (lv_url_3_0= ruleEString )
            // InternalTrm.g:389:5: lv_url_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadModelAccess().getUrlEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadModelRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_3_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoadModel"


    // $ANTLR start "entryRuleMAttribute"
    // InternalTrm.g:410:1: entryRuleMAttribute returns [EObject current=null] : iv_ruleMAttribute= ruleMAttribute EOF ;
    public final EObject entryRuleMAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAttribute = null;


        try {
            // InternalTrm.g:410:51: (iv_ruleMAttribute= ruleMAttribute EOF )
            // InternalTrm.g:411:2: iv_ruleMAttribute= ruleMAttribute EOF
            {
             newCompositeNode(grammarAccess.getMAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMAttribute=ruleMAttribute();

            state._fsp--;

             current =iv_ruleMAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMAttribute"


    // $ANTLR start "ruleMAttribute"
    // InternalTrm.g:417:1: ruleMAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleMAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:423:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalTrm.g:424:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalTrm.g:424:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalTrm.g:425:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalTrm.g:425:3: ()
            // InternalTrm.g:426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMAttributeAccess().getMAttributeAction_0(),
            					current);
            			

            }

            // InternalTrm.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTrm.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTrm.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalTrm.g:434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMAttributeAccess().getEqualsSignKeyword_2());
            		
            // InternalTrm.g:454:3: ( (lv_value_3_0= ruleEString ) )
            // InternalTrm.g:455:4: (lv_value_3_0= ruleEString )
            {
            // InternalTrm.g:455:4: (lv_value_3_0= ruleEString )
            // InternalTrm.g:456:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMAttributeAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMAttribute"


    // $ANTLR start "entryRuleWhereClause"
    // InternalTrm.g:477:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalTrm.g:477:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalTrm.g:478:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalTrm.g:484:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'where' otherlv_1= '(' ( (lv_conditions_2_0= ruleMAttribute ) ) (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conditions_2_0 = null;

        EObject lv_conditions_4_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:490:2: ( (otherlv_0= 'where' otherlv_1= '(' ( (lv_conditions_2_0= ruleMAttribute ) ) (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )* otherlv_5= ')' ) )
            // InternalTrm.g:491:2: (otherlv_0= 'where' otherlv_1= '(' ( (lv_conditions_2_0= ruleMAttribute ) ) (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )* otherlv_5= ')' )
            {
            // InternalTrm.g:491:2: (otherlv_0= 'where' otherlv_1= '(' ( (lv_conditions_2_0= ruleMAttribute ) ) (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )* otherlv_5= ')' )
            // InternalTrm.g:492:3: otherlv_0= 'where' otherlv_1= '(' ( (lv_conditions_2_0= ruleMAttribute ) ) (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWhereKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereClauseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalTrm.g:500:3: ( (lv_conditions_2_0= ruleMAttribute ) )
            // InternalTrm.g:501:4: (lv_conditions_2_0= ruleMAttribute )
            {
            // InternalTrm.g:501:4: (lv_conditions_2_0= ruleMAttribute )
            // InternalTrm.g:502:5: lv_conditions_2_0= ruleMAttribute
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getConditionsMAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_conditions_2_0=ruleMAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_2_0,
            						"tmodel.grm.trm.Trm.MAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrm.g:519:3: (otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTrm.g:520:4: otherlv_3= ',' ( (lv_conditions_4_0= ruleMAttribute ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWhereClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTrm.g:524:4: ( (lv_conditions_4_0= ruleMAttribute ) )
            	    // InternalTrm.g:525:5: (lv_conditions_4_0= ruleMAttribute )
            	    {
            	    // InternalTrm.g:525:5: (lv_conditions_4_0= ruleMAttribute )
            	    // InternalTrm.g:526:6: lv_conditions_4_0= ruleMAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getWhereClauseAccess().getConditionsMAttributeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_conditions_4_0=ruleMAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_4_0,
            	    							"tmodel.grm.trm.Trm.MAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWhereClauseAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleAdd"
    // InternalTrm.g:552:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalTrm.g:552:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalTrm.g:553:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalTrm.g:559:1: ruleAdd returns [EObject current=null] : ( () otherlv_1= 'add' ( (lv_cibleElement_2_0= ruleEString ) ) (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )? (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )? ( (lv_whereClause_11_0= ruleWhereClause ) )? ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_cibleElement_2_0 = null;

        AntlrDatatypeRuleToken lv_in_4_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_whereClause_11_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:565:2: ( ( () otherlv_1= 'add' ( (lv_cibleElement_2_0= ruleEString ) ) (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )? (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )? ( (lv_whereClause_11_0= ruleWhereClause ) )? ) )
            // InternalTrm.g:566:2: ( () otherlv_1= 'add' ( (lv_cibleElement_2_0= ruleEString ) ) (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )? (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )? ( (lv_whereClause_11_0= ruleWhereClause ) )? )
            {
            // InternalTrm.g:566:2: ( () otherlv_1= 'add' ( (lv_cibleElement_2_0= ruleEString ) ) (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )? (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )? ( (lv_whereClause_11_0= ruleWhereClause ) )? )
            // InternalTrm.g:567:3: () otherlv_1= 'add' ( (lv_cibleElement_2_0= ruleEString ) ) (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )? (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )? ( (lv_whereClause_11_0= ruleWhereClause ) )?
            {
            // InternalTrm.g:567:3: ()
            // InternalTrm.g:568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
            		
            // InternalTrm.g:578:3: ( (lv_cibleElement_2_0= ruleEString ) )
            // InternalTrm.g:579:4: (lv_cibleElement_2_0= ruleEString )
            {
            // InternalTrm.g:579:4: (lv_cibleElement_2_0= ruleEString )
            // InternalTrm.g:580:5: lv_cibleElement_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAccess().getCibleElementEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_cibleElement_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"cibleElement",
            						lv_cibleElement_2_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrm.g:597:3: (otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTrm.g:598:4: otherlv_3= 'in' ( (lv_in_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAddAccess().getInKeyword_3_0());
                    			
                    // InternalTrm.g:602:4: ( (lv_in_4_0= ruleEString ) )
                    // InternalTrm.g:603:5: (lv_in_4_0= ruleEString )
                    {
                    // InternalTrm.g:603:5: (lv_in_4_0= ruleEString )
                    // InternalTrm.g:604:6: lv_in_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAddAccess().getInEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_in_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRule());
                    						}
                    						set(
                    							current,
                    							"in",
                    							lv_in_4_0,
                    							"tmodel.grm.trm.Trm.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTrm.g:622:3: (otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTrm.g:623:4: otherlv_5= 'with' otherlv_6= '(' ( (lv_attributes_7_0= ruleMAttribute ) ) (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getAddAccess().getWithKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getAddAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalTrm.g:631:4: ( (lv_attributes_7_0= ruleMAttribute ) )
                    // InternalTrm.g:632:5: (lv_attributes_7_0= ruleMAttribute )
                    {
                    // InternalTrm.g:632:5: (lv_attributes_7_0= ruleMAttribute )
                    // InternalTrm.g:633:6: lv_attributes_7_0= ruleMAttribute
                    {

                    						newCompositeNode(grammarAccess.getAddAccess().getAttributesMAttributeParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_attributes_7_0=ruleMAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAddRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_7_0,
                    							"tmodel.grm.trm.Trm.MAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTrm.g:650:4: (otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==13) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTrm.g:651:5: otherlv_8= ',' ( (lv_attributes_9_0= ruleMAttribute ) )
                    	    {
                    	    otherlv_8=(Token)match(input,13,FOLLOW_15); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAddAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalTrm.g:655:5: ( (lv_attributes_9_0= ruleMAttribute ) )
                    	    // InternalTrm.g:656:6: (lv_attributes_9_0= ruleMAttribute )
                    	    {
                    	    // InternalTrm.g:656:6: (lv_attributes_9_0= ruleMAttribute )
                    	    // InternalTrm.g:657:7: lv_attributes_9_0= ruleMAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getAddAccess().getAttributesMAttributeParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_attributes_9_0=ruleMAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAddRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"tmodel.grm.trm.Trm.MAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getAddAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalTrm.g:680:3: ( (lv_whereClause_11_0= ruleWhereClause ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTrm.g:681:4: (lv_whereClause_11_0= ruleWhereClause )
                    {
                    // InternalTrm.g:681:4: (lv_whereClause_11_0= ruleWhereClause )
                    // InternalTrm.g:682:5: lv_whereClause_11_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getAddAccess().getWhereClauseWhereClauseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whereClause_11_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAddRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_11_0,
                    						"tmodel.grm.trm.Trm.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleUpdate"
    // InternalTrm.g:703:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalTrm.g:703:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalTrm.g:704:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalTrm.g:710:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'update' ( (lv_cibleElement_2_0= ruleEString ) ) otherlv_3= 'set' otherlv_4= '(' ( (lv_attributes_5_0= ruleMAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )* otherlv_8= ')' ( (lv_whereClause_9_0= ruleWhereClause ) )? ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_cibleElement_2_0 = null;

        EObject lv_attributes_5_0 = null;

        EObject lv_attributes_7_0 = null;

        EObject lv_whereClause_9_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:716:2: ( ( () otherlv_1= 'update' ( (lv_cibleElement_2_0= ruleEString ) ) otherlv_3= 'set' otherlv_4= '(' ( (lv_attributes_5_0= ruleMAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )* otherlv_8= ')' ( (lv_whereClause_9_0= ruleWhereClause ) )? ) )
            // InternalTrm.g:717:2: ( () otherlv_1= 'update' ( (lv_cibleElement_2_0= ruleEString ) ) otherlv_3= 'set' otherlv_4= '(' ( (lv_attributes_5_0= ruleMAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )* otherlv_8= ')' ( (lv_whereClause_9_0= ruleWhereClause ) )? )
            {
            // InternalTrm.g:717:2: ( () otherlv_1= 'update' ( (lv_cibleElement_2_0= ruleEString ) ) otherlv_3= 'set' otherlv_4= '(' ( (lv_attributes_5_0= ruleMAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )* otherlv_8= ')' ( (lv_whereClause_9_0= ruleWhereClause ) )? )
            // InternalTrm.g:718:3: () otherlv_1= 'update' ( (lv_cibleElement_2_0= ruleEString ) ) otherlv_3= 'set' otherlv_4= '(' ( (lv_attributes_5_0= ruleMAttribute ) ) (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )* otherlv_8= ')' ( (lv_whereClause_9_0= ruleWhereClause ) )?
            {
            // InternalTrm.g:718:3: ()
            // InternalTrm.g:719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            // InternalTrm.g:729:3: ( (lv_cibleElement_2_0= ruleEString ) )
            // InternalTrm.g:730:4: (lv_cibleElement_2_0= ruleEString )
            {
            // InternalTrm.g:730:4: (lv_cibleElement_2_0= ruleEString )
            // InternalTrm.g:731:5: lv_cibleElement_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getCibleElementEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_cibleElement_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"cibleElement",
            						lv_cibleElement_2_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getSetKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getLeftParenthesisKeyword_4());
            		
            // InternalTrm.g:756:3: ( (lv_attributes_5_0= ruleMAttribute ) )
            // InternalTrm.g:757:4: (lv_attributes_5_0= ruleMAttribute )
            {
            // InternalTrm.g:757:4: (lv_attributes_5_0= ruleMAttribute )
            // InternalTrm.g:758:5: lv_attributes_5_0= ruleMAttribute
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getAttributesMAttributeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_attributes_5_0=ruleMAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_5_0,
            						"tmodel.grm.trm.Trm.MAttribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrm.g:775:3: (otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==13) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTrm.g:776:4: otherlv_6= ',' ( (lv_attributes_7_0= ruleMAttribute ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalTrm.g:780:4: ( (lv_attributes_7_0= ruleMAttribute ) )
            	    // InternalTrm.g:781:5: (lv_attributes_7_0= ruleMAttribute )
            	    {
            	    // InternalTrm.g:781:5: (lv_attributes_7_0= ruleMAttribute )
            	    // InternalTrm.g:782:6: lv_attributes_7_0= ruleMAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getAttributesMAttributeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_attributes_7_0=ruleMAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_7_0,
            	    							"tmodel.grm.trm.Trm.MAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getUpdateAccess().getRightParenthesisKeyword_7());
            		
            // InternalTrm.g:804:3: ( (lv_whereClause_9_0= ruleWhereClause ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTrm.g:805:4: (lv_whereClause_9_0= ruleWhereClause )
                    {
                    // InternalTrm.g:805:4: (lv_whereClause_9_0= ruleWhereClause )
                    // InternalTrm.g:806:5: lv_whereClause_9_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getWhereClauseWhereClauseParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whereClause_9_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpdateRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_9_0,
                    						"tmodel.grm.trm.Trm.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleDelete"
    // InternalTrm.g:827:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalTrm.g:827:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalTrm.g:828:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalTrm.g:834:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'delete' ( (lv_cibleElement_2_0= ruleEString ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cibleElement_2_0 = null;

        EObject lv_whereClause_3_0 = null;



        	enterRule();

        try {
            // InternalTrm.g:840:2: ( ( () otherlv_1= 'delete' ( (lv_cibleElement_2_0= ruleEString ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? ) )
            // InternalTrm.g:841:2: ( () otherlv_1= 'delete' ( (lv_cibleElement_2_0= ruleEString ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? )
            {
            // InternalTrm.g:841:2: ( () otherlv_1= 'delete' ( (lv_cibleElement_2_0= ruleEString ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )? )
            // InternalTrm.g:842:3: () otherlv_1= 'delete' ( (lv_cibleElement_2_0= ruleEString ) ) ( (lv_whereClause_3_0= ruleWhereClause ) )?
            {
            // InternalTrm.g:842:3: ()
            // InternalTrm.g:843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            // InternalTrm.g:853:3: ( (lv_cibleElement_2_0= ruleEString ) )
            // InternalTrm.g:854:4: (lv_cibleElement_2_0= ruleEString )
            {
            // InternalTrm.g:854:4: (lv_cibleElement_2_0= ruleEString )
            // InternalTrm.g:855:5: lv_cibleElement_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getCibleElementEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_cibleElement_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					set(
            						current,
            						"cibleElement",
            						lv_cibleElement_2_0,
            						"tmodel.grm.trm.Trm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTrm.g:872:3: ( (lv_whereClause_3_0= ruleWhereClause ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTrm.g:873:4: (lv_whereClause_3_0= ruleWhereClause )
                    {
                    // InternalTrm.g:873:4: (lv_whereClause_3_0= ruleWhereClause )
                    // InternalTrm.g:874:5: lv_whereClause_3_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getDeleteAccess().getWhereClauseWhereClauseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whereClause_3_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeleteRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_3_0,
                    						"tmodel.grm.trm.Trm.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelete"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000052000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000052010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}