package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "':'", "'attribute'", "'relation'", "'from'", "'to'", "'*'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEntitySystem"
    // InternalMyDsl.g:53:1: entryRuleEntitySystem : ruleEntitySystem EOF ;
    public final void entryRuleEntitySystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleEntitySystem EOF )
            // InternalMyDsl.g:55:1: ruleEntitySystem EOF
            {
             before(grammarAccess.getEntitySystemRule()); 
            pushFollow(FOLLOW_1);
            ruleEntitySystem();

            state._fsp--;

             after(grammarAccess.getEntitySystemRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntitySystem"


    // $ANTLR start "ruleEntitySystem"
    // InternalMyDsl.g:62:1: ruleEntitySystem : ( ( rule__EntitySystem__Group__0 ) ) ;
    public final void ruleEntitySystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__EntitySystem__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__EntitySystem__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__EntitySystem__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__EntitySystem__Group__0 )
            {
             before(grammarAccess.getEntitySystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__EntitySystem__Group__0 )
            // InternalMyDsl.g:69:4: rule__EntitySystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntitySystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntitySystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntitySystem"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDeclaration EOF )
            // InternalMyDsl.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Declaration__Alternatives )
            // InternalMyDsl.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEntity EOF )
            // InternalMyDsl.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:137:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:144:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRelation EOF )
            // InternalMyDsl.g:155:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:162:1: ruleRelation : ( ( rule__Relation__Group__0 ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Relation__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Relation__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Relation__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Relation__Group__0 )
            {
             before(grammarAccess.getRelationAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Relation__Group__0 )
            // InternalMyDsl.g:169:4: rule__Relation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalMyDsl.g:177:1: rule__Declaration__Alternatives : ( ( ruleEntity ) | ( ruleRelation ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( ruleEntity ) | ( ruleRelation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:182:2: ( ruleEntity )
                    // InternalMyDsl.g:183:3: ruleEntity
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( ruleRelation )
                    {
                    // InternalMyDsl.g:188:2: ( ruleRelation )
                    // InternalMyDsl.g:189:3: ruleRelation
                    {
                     before(grammarAccess.getDeclarationAccess().getRelationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getRelationParserRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__EntitySystem__Group__0"
    // InternalMyDsl.g:198:1: rule__EntitySystem__Group__0 : rule__EntitySystem__Group__0__Impl rule__EntitySystem__Group__1 ;
    public final void rule__EntitySystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( rule__EntitySystem__Group__0__Impl rule__EntitySystem__Group__1 )
            // InternalMyDsl.g:203:2: rule__EntitySystem__Group__0__Impl rule__EntitySystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EntitySystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntitySystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__0"


    // $ANTLR start "rule__EntitySystem__Group__0__Impl"
    // InternalMyDsl.g:210:1: rule__EntitySystem__Group__0__Impl : ( 'system' ) ;
    public final void rule__EntitySystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( 'system' ) )
            // InternalMyDsl.g:215:1: ( 'system' )
            {
            // InternalMyDsl.g:215:1: ( 'system' )
            // InternalMyDsl.g:216:2: 'system'
            {
             before(grammarAccess.getEntitySystemAccess().getSystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEntitySystemAccess().getSystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__0__Impl"


    // $ANTLR start "rule__EntitySystem__Group__1"
    // InternalMyDsl.g:225:1: rule__EntitySystem__Group__1 : rule__EntitySystem__Group__1__Impl rule__EntitySystem__Group__2 ;
    public final void rule__EntitySystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__EntitySystem__Group__1__Impl rule__EntitySystem__Group__2 )
            // InternalMyDsl.g:230:2: rule__EntitySystem__Group__1__Impl rule__EntitySystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EntitySystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntitySystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__1"


    // $ANTLR start "rule__EntitySystem__Group__1__Impl"
    // InternalMyDsl.g:237:1: rule__EntitySystem__Group__1__Impl : ( ( rule__EntitySystem__NameAssignment_1 ) ) ;
    public final void rule__EntitySystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( ( ( rule__EntitySystem__NameAssignment_1 ) ) )
            // InternalMyDsl.g:242:1: ( ( rule__EntitySystem__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:242:1: ( ( rule__EntitySystem__NameAssignment_1 ) )
            // InternalMyDsl.g:243:2: ( rule__EntitySystem__NameAssignment_1 )
            {
             before(grammarAccess.getEntitySystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:244:2: ( rule__EntitySystem__NameAssignment_1 )
            // InternalMyDsl.g:244:3: rule__EntitySystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntitySystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntitySystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__1__Impl"


    // $ANTLR start "rule__EntitySystem__Group__2"
    // InternalMyDsl.g:252:1: rule__EntitySystem__Group__2 : rule__EntitySystem__Group__2__Impl ;
    public final void rule__EntitySystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__EntitySystem__Group__2__Impl )
            // InternalMyDsl.g:257:2: rule__EntitySystem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntitySystem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__2"


    // $ANTLR start "rule__EntitySystem__Group__2__Impl"
    // InternalMyDsl.g:263:1: rule__EntitySystem__Group__2__Impl : ( ( rule__EntitySystem__DeclarationAssignment_2 )* ) ;
    public final void rule__EntitySystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:267:1: ( ( ( rule__EntitySystem__DeclarationAssignment_2 )* ) )
            // InternalMyDsl.g:268:1: ( ( rule__EntitySystem__DeclarationAssignment_2 )* )
            {
            // InternalMyDsl.g:268:1: ( ( rule__EntitySystem__DeclarationAssignment_2 )* )
            // InternalMyDsl.g:269:2: ( rule__EntitySystem__DeclarationAssignment_2 )*
            {
             before(grammarAccess.getEntitySystemAccess().getDeclarationAssignment_2()); 
            // InternalMyDsl.g:270:2: ( rule__EntitySystem__DeclarationAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:270:3: rule__EntitySystem__DeclarationAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__EntitySystem__DeclarationAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getEntitySystemAccess().getDeclarationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:279:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:284:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:291:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( 'entity' ) )
            // InternalMyDsl.g:296:1: ( 'entity' )
            {
            // InternalMyDsl.g:296:1: ( 'entity' )
            // InternalMyDsl.g:297:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:306:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:311:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:318:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:323:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:323:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:324:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:325:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:325:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:333:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:338:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:345:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMyDsl.g:350:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMyDsl.g:350:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMyDsl.g:351:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMyDsl.g:352:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:352:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDsl.g:360:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__Entity__Group__3__Impl )
            // InternalMyDsl.g:365:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDsl.g:371:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalMyDsl.g:376:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalMyDsl.g:376:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalMyDsl.g:377:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalMyDsl.g:378:2: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:378:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalMyDsl.g:387:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMyDsl.g:392:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalMyDsl.g:399:1: rule__Entity__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( ':' ) )
            // InternalMyDsl.g:404:1: ( ':' )
            {
            // InternalMyDsl.g:404:1: ( ':' )
            // InternalMyDsl.g:405:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalMyDsl.g:414:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMyDsl.g:419:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalMyDsl.g:425:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__BaseAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:429:1: ( ( ( rule__Entity__BaseAssignment_2_1 ) ) )
            // InternalMyDsl.g:430:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            {
            // InternalMyDsl.g:430:1: ( ( rule__Entity__BaseAssignment_2_1 ) )
            // InternalMyDsl.g:431:2: ( rule__Entity__BaseAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 
            // InternalMyDsl.g:432:2: ( rule__Entity__BaseAssignment_2_1 )
            // InternalMyDsl.g:432:3: rule__Entity__BaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__BaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getBaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:441:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:446:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:453:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:458:1: ( 'attribute' )
            {
            // InternalMyDsl.g:458:1: ( 'attribute' )
            // InternalMyDsl.g:459:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:468:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:473:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:480:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:485:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:485:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:486:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:487:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:487:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:495:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:500:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:507:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( ':' ) )
            // InternalMyDsl.g:512:1: ( ':' )
            {
            // InternalMyDsl.g:512:1: ( ':' )
            // InternalMyDsl.g:513:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:522:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:527:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:533:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:538:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:538:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDsl.g:539:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:540:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDsl.g:540:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__0"
    // InternalMyDsl.g:549:1: rule__Relation__Group__0 : rule__Relation__Group__0__Impl rule__Relation__Group__1 ;
    public final void rule__Relation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__Relation__Group__0__Impl rule__Relation__Group__1 )
            // InternalMyDsl.g:554:2: rule__Relation__Group__0__Impl rule__Relation__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Relation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0"


    // $ANTLR start "rule__Relation__Group__0__Impl"
    // InternalMyDsl.g:561:1: rule__Relation__Group__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( 'relation' ) )
            // InternalMyDsl.g:566:1: ( 'relation' )
            {
            // InternalMyDsl.g:566:1: ( 'relation' )
            // InternalMyDsl.g:567:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__0__Impl"


    // $ANTLR start "rule__Relation__Group__1"
    // InternalMyDsl.g:576:1: rule__Relation__Group__1 : rule__Relation__Group__1__Impl rule__Relation__Group__2 ;
    public final void rule__Relation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__Relation__Group__1__Impl rule__Relation__Group__2 )
            // InternalMyDsl.g:581:2: rule__Relation__Group__1__Impl rule__Relation__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1"


    // $ANTLR start "rule__Relation__Group__1__Impl"
    // InternalMyDsl.g:588:1: rule__Relation__Group__1__Impl : ( 'from' ) ;
    public final void rule__Relation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:1: ( ( 'from' ) )
            // InternalMyDsl.g:593:1: ( 'from' )
            {
            // InternalMyDsl.g:593:1: ( 'from' )
            // InternalMyDsl.g:594:2: 'from'
            {
             before(grammarAccess.getRelationAccess().getFromKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__1__Impl"


    // $ANTLR start "rule__Relation__Group__2"
    // InternalMyDsl.g:603:1: rule__Relation__Group__2 : rule__Relation__Group__2__Impl rule__Relation__Group__3 ;
    public final void rule__Relation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__Relation__Group__2__Impl rule__Relation__Group__3 )
            // InternalMyDsl.g:608:2: rule__Relation__Group__2__Impl rule__Relation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2"


    // $ANTLR start "rule__Relation__Group__2__Impl"
    // InternalMyDsl.g:615:1: rule__Relation__Group__2__Impl : ( ( rule__Relation__FromTypeAssignment_2 ) ) ;
    public final void rule__Relation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( ( rule__Relation__FromTypeAssignment_2 ) ) )
            // InternalMyDsl.g:620:1: ( ( rule__Relation__FromTypeAssignment_2 ) )
            {
            // InternalMyDsl.g:620:1: ( ( rule__Relation__FromTypeAssignment_2 ) )
            // InternalMyDsl.g:621:2: ( rule__Relation__FromTypeAssignment_2 )
            {
             before(grammarAccess.getRelationAccess().getFromTypeAssignment_2()); 
            // InternalMyDsl.g:622:2: ( rule__Relation__FromTypeAssignment_2 )
            // InternalMyDsl.g:622:3: rule__Relation__FromTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__2__Impl"


    // $ANTLR start "rule__Relation__Group__3"
    // InternalMyDsl.g:630:1: rule__Relation__Group__3 : rule__Relation__Group__3__Impl rule__Relation__Group__4 ;
    public final void rule__Relation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__Relation__Group__3__Impl rule__Relation__Group__4 )
            // InternalMyDsl.g:635:2: rule__Relation__Group__3__Impl rule__Relation__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3"


    // $ANTLR start "rule__Relation__Group__3__Impl"
    // InternalMyDsl.g:642:1: rule__Relation__Group__3__Impl : ( ( rule__Relation__FromNameAssignment_3 ) ) ;
    public final void rule__Relation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( ( rule__Relation__FromNameAssignment_3 ) ) )
            // InternalMyDsl.g:647:1: ( ( rule__Relation__FromNameAssignment_3 ) )
            {
            // InternalMyDsl.g:647:1: ( ( rule__Relation__FromNameAssignment_3 ) )
            // InternalMyDsl.g:648:2: ( rule__Relation__FromNameAssignment_3 )
            {
             before(grammarAccess.getRelationAccess().getFromNameAssignment_3()); 
            // InternalMyDsl.g:649:2: ( rule__Relation__FromNameAssignment_3 )
            // InternalMyDsl.g:649:3: rule__Relation__FromNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group__4"
    // InternalMyDsl.g:657:1: rule__Relation__Group__4 : rule__Relation__Group__4__Impl rule__Relation__Group__5 ;
    public final void rule__Relation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__Relation__Group__4__Impl rule__Relation__Group__5 )
            // InternalMyDsl.g:662:2: rule__Relation__Group__4__Impl rule__Relation__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4"


    // $ANTLR start "rule__Relation__Group__4__Impl"
    // InternalMyDsl.g:669:1: rule__Relation__Group__4__Impl : ( ( rule__Relation__FromMultipleAssignment_4 )? ) ;
    public final void rule__Relation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( ( rule__Relation__FromMultipleAssignment_4 )? ) )
            // InternalMyDsl.g:674:1: ( ( rule__Relation__FromMultipleAssignment_4 )? )
            {
            // InternalMyDsl.g:674:1: ( ( rule__Relation__FromMultipleAssignment_4 )? )
            // InternalMyDsl.g:675:2: ( rule__Relation__FromMultipleAssignment_4 )?
            {
             before(grammarAccess.getRelationAccess().getFromMultipleAssignment_4()); 
            // InternalMyDsl.g:676:2: ( rule__Relation__FromMultipleAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:676:3: rule__Relation__FromMultipleAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__FromMultipleAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getFromMultipleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__4__Impl"


    // $ANTLR start "rule__Relation__Group__5"
    // InternalMyDsl.g:684:1: rule__Relation__Group__5 : rule__Relation__Group__5__Impl rule__Relation__Group__6 ;
    public final void rule__Relation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__Relation__Group__5__Impl rule__Relation__Group__6 )
            // InternalMyDsl.g:689:2: rule__Relation__Group__5__Impl rule__Relation__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5"


    // $ANTLR start "rule__Relation__Group__5__Impl"
    // InternalMyDsl.g:696:1: rule__Relation__Group__5__Impl : ( 'to' ) ;
    public final void rule__Relation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( 'to' ) )
            // InternalMyDsl.g:701:1: ( 'to' )
            {
            // InternalMyDsl.g:701:1: ( 'to' )
            // InternalMyDsl.g:702:2: 'to'
            {
             before(grammarAccess.getRelationAccess().getToKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__5__Impl"


    // $ANTLR start "rule__Relation__Group__6"
    // InternalMyDsl.g:711:1: rule__Relation__Group__6 : rule__Relation__Group__6__Impl rule__Relation__Group__7 ;
    public final void rule__Relation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__Relation__Group__6__Impl rule__Relation__Group__7 )
            // InternalMyDsl.g:716:2: rule__Relation__Group__6__Impl rule__Relation__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6"


    // $ANTLR start "rule__Relation__Group__6__Impl"
    // InternalMyDsl.g:723:1: rule__Relation__Group__6__Impl : ( ( rule__Relation__ToNameAssignment_6 ) ) ;
    public final void rule__Relation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__Relation__ToNameAssignment_6 ) ) )
            // InternalMyDsl.g:728:1: ( ( rule__Relation__ToNameAssignment_6 ) )
            {
            // InternalMyDsl.g:728:1: ( ( rule__Relation__ToNameAssignment_6 ) )
            // InternalMyDsl.g:729:2: ( rule__Relation__ToNameAssignment_6 )
            {
             before(grammarAccess.getRelationAccess().getToNameAssignment_6()); 
            // InternalMyDsl.g:730:2: ( rule__Relation__ToNameAssignment_6 )
            // InternalMyDsl.g:730:3: rule__Relation__ToNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__6__Impl"


    // $ANTLR start "rule__Relation__Group__7"
    // InternalMyDsl.g:738:1: rule__Relation__Group__7 : rule__Relation__Group__7__Impl rule__Relation__Group__8 ;
    public final void rule__Relation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__Relation__Group__7__Impl rule__Relation__Group__8 )
            // InternalMyDsl.g:743:2: rule__Relation__Group__7__Impl rule__Relation__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7"


    // $ANTLR start "rule__Relation__Group__7__Impl"
    // InternalMyDsl.g:750:1: rule__Relation__Group__7__Impl : ( ( rule__Relation__ToMultipleAssignment_7 )? ) ;
    public final void rule__Relation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__Relation__ToMultipleAssignment_7 )? ) )
            // InternalMyDsl.g:755:1: ( ( rule__Relation__ToMultipleAssignment_7 )? )
            {
            // InternalMyDsl.g:755:1: ( ( rule__Relation__ToMultipleAssignment_7 )? )
            // InternalMyDsl.g:756:2: ( rule__Relation__ToMultipleAssignment_7 )?
            {
             before(grammarAccess.getRelationAccess().getToMultipleAssignment_7()); 
            // InternalMyDsl.g:757:2: ( rule__Relation__ToMultipleAssignment_7 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:757:3: rule__Relation__ToMultipleAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__ToMultipleAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getToMultipleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__7__Impl"


    // $ANTLR start "rule__Relation__Group__8"
    // InternalMyDsl.g:765:1: rule__Relation__Group__8 : rule__Relation__Group__8__Impl ;
    public final void rule__Relation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__Relation__Group__8__Impl )
            // InternalMyDsl.g:770:2: rule__Relation__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8"


    // $ANTLR start "rule__Relation__Group__8__Impl"
    // InternalMyDsl.g:776:1: rule__Relation__Group__8__Impl : ( ( rule__Relation__ToTypeAssignment_8 ) ) ;
    public final void rule__Relation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:780:1: ( ( ( rule__Relation__ToTypeAssignment_8 ) ) )
            // InternalMyDsl.g:781:1: ( ( rule__Relation__ToTypeAssignment_8 ) )
            {
            // InternalMyDsl.g:781:1: ( ( rule__Relation__ToTypeAssignment_8 ) )
            // InternalMyDsl.g:782:2: ( rule__Relation__ToTypeAssignment_8 )
            {
             before(grammarAccess.getRelationAccess().getToTypeAssignment_8()); 
            // InternalMyDsl.g:783:2: ( rule__Relation__ToTypeAssignment_8 )
            // InternalMyDsl.g:783:3: rule__Relation__ToTypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group__8__Impl"


    // $ANTLR start "rule__EntitySystem__NameAssignment_1"
    // InternalMyDsl.g:792:1: rule__EntitySystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntitySystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:797:2: ( RULE_ID )
            {
            // InternalMyDsl.g:797:2: ( RULE_ID )
            // InternalMyDsl.g:798:3: RULE_ID
            {
             before(grammarAccess.getEntitySystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntitySystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__NameAssignment_1"


    // $ANTLR start "rule__EntitySystem__DeclarationAssignment_2"
    // InternalMyDsl.g:807:1: rule__EntitySystem__DeclarationAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__EntitySystem__DeclarationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( ruleDeclaration ) )
            // InternalMyDsl.g:812:2: ( ruleDeclaration )
            {
            // InternalMyDsl.g:812:2: ( ruleDeclaration )
            // InternalMyDsl.g:813:3: ruleDeclaration
            {
             before(grammarAccess.getEntitySystemAccess().getDeclarationDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getEntitySystemAccess().getDeclarationDeclarationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntitySystem__DeclarationAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:822:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:827:2: ( RULE_ID )
            {
            // InternalMyDsl.g:827:2: ( RULE_ID )
            // InternalMyDsl.g:828:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__BaseAssignment_2_1"
    // InternalMyDsl.g:837:1: rule__Entity__BaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__BaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:842:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:842:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:843:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 
            // InternalMyDsl.g:844:3: ( RULE_ID )
            // InternalMyDsl.g:845:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getBaseEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getBaseEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__BaseAssignment_2_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalMyDsl.g:856:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:861:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:861:2: ( ruleAttribute )
            // InternalMyDsl.g:862:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:871:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:876:2: ( RULE_ID )
            {
            // InternalMyDsl.g:876:2: ( RULE_ID )
            // InternalMyDsl.g:877:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalMyDsl.g:886:1: rule__Attribute__TypeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:891:2: ( RULE_ID )
            {
            // InternalMyDsl.g:891:2: ( RULE_ID )
            // InternalMyDsl.g:892:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Relation__FromTypeAssignment_2"
    // InternalMyDsl.g:901:1: rule__Relation__FromTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:905:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:906:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:906:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:907:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromTypeEntityCrossReference_2_0()); 
            // InternalMyDsl.g:908:3: ( RULE_ID )
            // InternalMyDsl.g:909:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromTypeEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromTypeEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromTypeEntityCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromTypeAssignment_2"


    // $ANTLR start "rule__Relation__FromNameAssignment_3"
    // InternalMyDsl.g:920:1: rule__Relation__FromNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Relation__FromNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:925:2: ( RULE_ID )
            {
            // InternalMyDsl.g:925:2: ( RULE_ID )
            // InternalMyDsl.g:926:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromNameAssignment_3"


    // $ANTLR start "rule__Relation__FromMultipleAssignment_4"
    // InternalMyDsl.g:935:1: rule__Relation__FromMultipleAssignment_4 : ( ( '*' ) ) ;
    public final void rule__Relation__FromMultipleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( '*' ) ) )
            // InternalMyDsl.g:940:2: ( ( '*' ) )
            {
            // InternalMyDsl.g:940:2: ( ( '*' ) )
            // InternalMyDsl.g:941:3: ( '*' )
            {
             before(grammarAccess.getRelationAccess().getFromMultipleAsteriskKeyword_4_0()); 
            // InternalMyDsl.g:942:3: ( '*' )
            // InternalMyDsl.g:943:4: '*'
            {
             before(grammarAccess.getRelationAccess().getFromMultipleAsteriskKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromMultipleAsteriskKeyword_4_0()); 

            }

             after(grammarAccess.getRelationAccess().getFromMultipleAsteriskKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__FromMultipleAssignment_4"


    // $ANTLR start "rule__Relation__ToNameAssignment_6"
    // InternalMyDsl.g:954:1: rule__Relation__ToNameAssignment_6 : ( RULE_ID ) ;
    public final void rule__Relation__ToNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:959:2: ( RULE_ID )
            {
            // InternalMyDsl.g:959:2: ( RULE_ID )
            // InternalMyDsl.g:960:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToNameIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToNameIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToNameAssignment_6"


    // $ANTLR start "rule__Relation__ToMultipleAssignment_7"
    // InternalMyDsl.g:969:1: rule__Relation__ToMultipleAssignment_7 : ( ( '*' ) ) ;
    public final void rule__Relation__ToMultipleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ( '*' ) ) )
            // InternalMyDsl.g:974:2: ( ( '*' ) )
            {
            // InternalMyDsl.g:974:2: ( ( '*' ) )
            // InternalMyDsl.g:975:3: ( '*' )
            {
             before(grammarAccess.getRelationAccess().getToMultipleAsteriskKeyword_7_0()); 
            // InternalMyDsl.g:976:3: ( '*' )
            // InternalMyDsl.g:977:4: '*'
            {
             before(grammarAccess.getRelationAccess().getToMultipleAsteriskKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToMultipleAsteriskKeyword_7_0()); 

            }

             after(grammarAccess.getRelationAccess().getToMultipleAsteriskKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToMultipleAssignment_7"


    // $ANTLR start "rule__Relation__ToTypeAssignment_8"
    // InternalMyDsl.g:988:1: rule__Relation__ToTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:993:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:993:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:994:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToTypeEntityCrossReference_8_0()); 
            // InternalMyDsl.g:995:3: ( RULE_ID )
            // InternalMyDsl.g:996:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToTypeEntityIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToTypeEntityIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToTypeEntityCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__ToTypeAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040010L});

}