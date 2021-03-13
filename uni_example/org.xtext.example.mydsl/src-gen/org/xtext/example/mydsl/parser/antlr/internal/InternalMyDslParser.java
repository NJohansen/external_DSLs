package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "':'", "'attribute'", "'relation'", "'from'", "'*'", "'to'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EntitySystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntitySystem"
    // InternalMyDsl.g:64:1: entryRuleEntitySystem returns [EObject current=null] : iv_ruleEntitySystem= ruleEntitySystem EOF ;
    public final EObject entryRuleEntitySystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySystem = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleEntitySystem= ruleEntitySystem EOF )
            // InternalMyDsl.g:65:2: iv_ruleEntitySystem= ruleEntitySystem EOF
            {
             newCompositeNode(grammarAccess.getEntitySystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySystem=ruleEntitySystem();

            state._fsp--;

             current =iv_ruleEntitySystem; 
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
    // $ANTLR end "entryRuleEntitySystem"


    // $ANTLR start "ruleEntitySystem"
    // InternalMyDsl.g:71:1: ruleEntitySystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaration_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleEntitySystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declaration_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaration_2_0= ruleDeclaration ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaration_2_0= ruleDeclaration ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaration_2_0= ruleDeclaration ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declaration_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitySystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntitySystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntitySystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_declaration_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_declaration_2_0= ruleDeclaration )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_declaration_2_0= ruleDeclaration )
            	    // InternalMyDsl.g:103:5: lv_declaration_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getEntitySystemAccess().getDeclarationDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declaration_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitySystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declaration",
            	    						lv_declaration_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEntitySystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Relation_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:137:2: ( (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation ) )
            // InternalMyDsl.g:138:2: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            {
            // InternalMyDsl.g:138:2: (this_Entity_0= ruleEntity | this_Relation_1= ruleRelation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:139:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:148:3: this_Relation_1= ruleRelation
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getRelationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relation_1=ruleRelation();

                    state._fsp--;


                    			current = this_Relation_1;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:160:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:160:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:161:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:167:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_attributes_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:173:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) )* )
            // InternalMyDsl.g:175:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )? ( (lv_attributes_4_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:197:3: (otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:198:4: otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
                    			
                    // InternalMyDsl.g:202:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMyDsl.g:203:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMyDsl.g:203:5: (otherlv_3= RULE_ID )
                    // InternalMyDsl.g:204:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:216:3: ( (lv_attributes_4_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:217:4: (lv_attributes_4_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:217:4: (lv_attributes_4_0= ruleAttribute )
            	    // InternalMyDsl.g:218:5: lv_attributes_4_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_4_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:239:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:239:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:240:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:246:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:252:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:253:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:253:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) ) )
            // InternalMyDsl.g:254:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:258:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:259:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:259:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:260:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:280:3: ( (lv_type_3_0= RULE_ID ) )
            // InternalMyDsl.g:281:4: (lv_type_3_0= RULE_ID )
            {
            // InternalMyDsl.g:281:4: (lv_type_3_0= RULE_ID )
            // InternalMyDsl.g:282:5: lv_type_3_0= RULE_ID
            {
            lv_type_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_3_0, grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:302:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:302:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:303:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:309:1: ruleRelation returns [EObject current=null] : (otherlv_0= 'relation' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ( (lv_fromName_3_0= RULE_ID ) ) ( (lv_fromMultiple_4_0= '*' ) )? otherlv_5= 'to' ( (lv_toName_6_0= RULE_ID ) ) ( (lv_toMultiple_7_0= '*' ) )? ( (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_fromName_3_0=null;
        Token lv_fromMultiple_4_0=null;
        Token otherlv_5=null;
        Token lv_toName_6_0=null;
        Token lv_toMultiple_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:315:2: ( (otherlv_0= 'relation' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ( (lv_fromName_3_0= RULE_ID ) ) ( (lv_fromMultiple_4_0= '*' ) )? otherlv_5= 'to' ( (lv_toName_6_0= RULE_ID ) ) ( (lv_toMultiple_7_0= '*' ) )? ( (otherlv_8= RULE_ID ) ) ) )
            // InternalMyDsl.g:316:2: (otherlv_0= 'relation' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ( (lv_fromName_3_0= RULE_ID ) ) ( (lv_fromMultiple_4_0= '*' ) )? otherlv_5= 'to' ( (lv_toName_6_0= RULE_ID ) ) ( (lv_toMultiple_7_0= '*' ) )? ( (otherlv_8= RULE_ID ) ) )
            {
            // InternalMyDsl.g:316:2: (otherlv_0= 'relation' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ( (lv_fromName_3_0= RULE_ID ) ) ( (lv_fromMultiple_4_0= '*' ) )? otherlv_5= 'to' ( (lv_toName_6_0= RULE_ID ) ) ( (lv_toMultiple_7_0= '*' ) )? ( (otherlv_8= RULE_ID ) ) )
            // InternalMyDsl.g:317:3: otherlv_0= 'relation' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) ( (lv_fromName_3_0= RULE_ID ) ) ( (lv_fromMultiple_4_0= '*' ) )? otherlv_5= 'to' ( (lv_toName_6_0= RULE_ID ) ) ( (lv_toMultiple_7_0= '*' ) )? ( (otherlv_8= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getFromKeyword_1());
            		
            // InternalMyDsl.g:325:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:326:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:326:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:327:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getFromTypeEntityCrossReference_2_0());
            				

            }


            }

            // InternalMyDsl.g:338:3: ( (lv_fromName_3_0= RULE_ID ) )
            // InternalMyDsl.g:339:4: (lv_fromName_3_0= RULE_ID )
            {
            // InternalMyDsl.g:339:4: (lv_fromName_3_0= RULE_ID )
            // InternalMyDsl.g:340:5: lv_fromName_3_0= RULE_ID
            {
            lv_fromName_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_fromName_3_0, grammarAccess.getRelationAccess().getFromNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fromName",
            						lv_fromName_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:356:3: ( (lv_fromMultiple_4_0= '*' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:357:4: (lv_fromMultiple_4_0= '*' )
                    {
                    // InternalMyDsl.g:357:4: (lv_fromMultiple_4_0= '*' )
                    // InternalMyDsl.g:358:5: lv_fromMultiple_4_0= '*'
                    {
                    lv_fromMultiple_4_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_fromMultiple_4_0, grammarAccess.getRelationAccess().getFromMultipleAsteriskKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(current, "fromMultiple", lv_fromMultiple_4_0 != null, "*");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getToKeyword_5());
            		
            // InternalMyDsl.g:374:3: ( (lv_toName_6_0= RULE_ID ) )
            // InternalMyDsl.g:375:4: (lv_toName_6_0= RULE_ID )
            {
            // InternalMyDsl.g:375:4: (lv_toName_6_0= RULE_ID )
            // InternalMyDsl.g:376:5: lv_toName_6_0= RULE_ID
            {
            lv_toName_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_toName_6_0, grammarAccess.getRelationAccess().getToNameIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"toName",
            						lv_toName_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:392:3: ( (lv_toMultiple_7_0= '*' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:393:4: (lv_toMultiple_7_0= '*' )
                    {
                    // InternalMyDsl.g:393:4: (lv_toMultiple_7_0= '*' )
                    // InternalMyDsl.g:394:5: lv_toMultiple_7_0= '*'
                    {
                    lv_toMultiple_7_0=(Token)match(input,17,FOLLOW_3); 

                    					newLeafNode(lv_toMultiple_7_0, grammarAccess.getRelationAccess().getToMultipleAsteriskKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationRule());
                    					}
                    					setWithLastConsumed(current, "toMultiple", lv_toMultiple_7_0 != null, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:406:3: ( (otherlv_8= RULE_ID ) )
            // InternalMyDsl.g:407:4: (otherlv_8= RULE_ID )
            {
            // InternalMyDsl.g:407:4: (otherlv_8= RULE_ID )
            // InternalMyDsl.g:408:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getToTypeEntityCrossReference_8_0());
            				

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
    // $ANTLR end "ruleRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020010L});

}