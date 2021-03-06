package org.openetcs.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.openetcs.dsl.services.ExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'in'", "'not in'", "'+'", "'-'", "'*'", "'/'", "'.'", "'<-'", "'CurrentState'", "'('", "')'", "'NOT ('", "'OR'", "'AND'", "'^'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=7;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g"; }


     
     	private ExpressionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:61:1: ( ruleModel EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:69:1: ruleModel : ( ( rule__Model__PhraseAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:73:2: ( ( ( rule__Model__PhraseAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:74:1: ( ( rule__Model__PhraseAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:74:1: ( ( rule__Model__PhraseAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:75:1: ( rule__Model__PhraseAssignment )
            {
             before(grammarAccess.getModelAccess().getPhraseAssignment()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:76:1: ( rule__Model__PhraseAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:76:2: rule__Model__PhraseAssignment
            {
            pushFollow(FOLLOW_rule__Model__PhraseAssignment_in_ruleModel94);
            rule__Model__PhraseAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPhraseAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFQN"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:88:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:89:1: ( ruleFQN EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:90:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN121);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN128); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:97:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:101:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:102:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:102:1: ( ( rule__FQN__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:103:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:104:1: ( rule__FQN__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:104:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN154);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:116:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:117:1: ( rulePhrase EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:118:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_rulePhrase_in_entryRulePhrase181);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhrase188); 

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
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:125:1: rulePhrase : ( ( rule__Phrase__Alternatives ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:129:2: ( ( ( rule__Phrase__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:130:1: ( ( rule__Phrase__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:130:1: ( ( rule__Phrase__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:131:1: ( rule__Phrase__Alternatives )
            {
             before(grammarAccess.getPhraseAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:132:1: ( rule__Phrase__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:132:2: rule__Phrase__Alternatives
            {
            pushFollow(FOLLOW_rule__Phrase__Alternatives_in_rulePhrase214);
            rule__Phrase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getAlternatives()); 

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
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:145:1: ( ruleExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression241);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression248); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:153:1: ruleExpression : ( ruleEvaluationExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:157:2: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:158:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:158:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:159:1: ruleEvaluationExpression
            {
             before(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_ruleExpression274);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEvaluationExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:172:1: entryRuleEvaluationExpression : ruleEvaluationExpression EOF ;
    public final void entryRuleEvaluationExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:173:1: ( ruleEvaluationExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:174:1: ruleEvaluationExpression EOF
            {
             before(grammarAccess.getEvaluationExpressionRule()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression300);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationExpression307); 

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
    // $ANTLR end "entryRuleEvaluationExpression"


    // $ANTLR start "ruleEvaluationExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:181:1: ruleEvaluationExpression : ( ruleOrExpression ) ;
    public final void ruleEvaluationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:185:2: ( ( ruleOrExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:186:1: ( ruleOrExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:186:1: ( ruleOrExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:187:1: ruleOrExpression
            {
             before(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrExpression_in_ruleEvaluationExpression333);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 

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
    // $ANTLR end "ruleEvaluationExpression"


    // $ANTLR start "entryRuleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:200:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:201:1: ( ruleStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:202:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement359);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement366); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:209:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:213:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:214:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:214:1: ( ( rule__Statement__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:215:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:216:1: ( rule__Statement__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:216:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement392);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSingleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:228:1: entryRuleSingleStatement : ruleSingleStatement EOF ;
    public final void entryRuleSingleStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:229:1: ( ruleSingleStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:230:1: ruleSingleStatement EOF
            {
             before(grammarAccess.getSingleStatementRule()); 
            pushFollow(FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement419);
            ruleSingleStatement();

            state._fsp--;

             after(grammarAccess.getSingleStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleStatement426); 

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
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:237:1: ruleSingleStatement : ( ( rule__SingleStatement__Group__0 ) ) ;
    public final void ruleSingleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:241:2: ( ( ( rule__SingleStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:242:1: ( ( rule__SingleStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:242:1: ( ( rule__SingleStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:243:1: ( rule__SingleStatement__Group__0 )
            {
             before(grammarAccess.getSingleStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:244:1: ( rule__SingleStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:244:2: rule__SingleStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__0_in_ruleSingleStatement452);
            rule__SingleStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleSelfStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:256:1: entryRuleSelfStatement : ruleSelfStatement EOF ;
    public final void entryRuleSelfStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:257:1: ( ruleSelfStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:258:1: ruleSelfStatement EOF
            {
             before(grammarAccess.getSelfStatementRule()); 
            pushFollow(FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement479);
            ruleSelfStatement();

            state._fsp--;

             after(grammarAccess.getSelfStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelfStatement486); 

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
    // $ANTLR end "entryRuleSelfStatement"


    // $ANTLR start "ruleSelfStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:265:1: ruleSelfStatement : ( ( rule__SelfStatement__Group__0 ) ) ;
    public final void ruleSelfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:269:2: ( ( ( rule__SelfStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:270:1: ( ( rule__SelfStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:270:1: ( ( rule__SelfStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:271:1: ( rule__SelfStatement__Group__0 )
            {
             before(grammarAccess.getSelfStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:272:1: ( rule__SelfStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:272:2: rule__SelfStatement__Group__0
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__0_in_ruleSelfStatement512);
            rule__SelfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelfStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleSelfStatement"


    // $ANTLR start "entryRuleMultiStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:284:1: entryRuleMultiStatement : ruleMultiStatement EOF ;
    public final void entryRuleMultiStatement() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:285:1: ( ruleMultiStatement EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:286:1: ruleMultiStatement EOF
            {
             before(grammarAccess.getMultiStatementRule()); 
            pushFollow(FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement539);
            ruleMultiStatement();

            state._fsp--;

             after(grammarAccess.getMultiStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiStatement546); 

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
    // $ANTLR end "entryRuleMultiStatement"


    // $ANTLR start "ruleMultiStatement"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:293:1: ruleMultiStatement : ( ( rule__MultiStatement__Group__0 ) ) ;
    public final void ruleMultiStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:297:2: ( ( ( rule__MultiStatement__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:298:1: ( ( rule__MultiStatement__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:298:1: ( ( rule__MultiStatement__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:299:1: ( rule__MultiStatement__Group__0 )
            {
             before(grammarAccess.getMultiStatementAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:300:1: ( rule__MultiStatement__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:300:2: rule__MultiStatement__Group__0
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__0_in_ruleMultiStatement572);
            rule__MultiStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiStatement"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:312:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:313:1: ( ruleOrExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:314:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression599);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression606); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:321:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:325:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:326:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:326:1: ( ( rule__OrExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:327:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:328:1: ( rule__OrExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:328:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression632);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:340:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:341:1: ( ruleAndExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:342:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression659);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression666); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:349:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:353:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:354:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:354:1: ( ( rule__AndExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:355:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:356:1: ( rule__AndExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:356:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression692);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:368:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:369:1: ( ruleEqualityExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:370:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression719);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression726); 

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
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:377:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:381:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:382:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:382:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:383:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:384:1: ( rule__EqualityExpression__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:384:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression752);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleDashOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:396:1: entryRuleDashOperation : ruleDashOperation EOF ;
    public final void entryRuleDashOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:397:1: ( ruleDashOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:398:1: ruleDashOperation EOF
            {
             before(grammarAccess.getDashOperationRule()); 
            pushFollow(FOLLOW_ruleDashOperation_in_entryRuleDashOperation779);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDashOperation786); 

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
    // $ANTLR end "entryRuleDashOperation"


    // $ANTLR start "ruleDashOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:405:1: ruleDashOperation : ( ( rule__DashOperation__Group__0 ) ) ;
    public final void ruleDashOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:409:2: ( ( ( rule__DashOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:410:1: ( ( rule__DashOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:410:1: ( ( rule__DashOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:411:1: ( rule__DashOperation__Group__0 )
            {
             before(grammarAccess.getDashOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:412:1: ( rule__DashOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:412:2: rule__DashOperation__Group__0
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__0_in_ruleDashOperation812);
            rule__DashOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleDashOperation"


    // $ANTLR start "entryRulePointOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:424:1: entryRulePointOperation : rulePointOperation EOF ;
    public final void entryRulePointOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:425:1: ( rulePointOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:426:1: rulePointOperation EOF
            {
             before(grammarAccess.getPointOperationRule()); 
            pushFollow(FOLLOW_rulePointOperation_in_entryRulePointOperation839);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointOperation846); 

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
    // $ANTLR end "entryRulePointOperation"


    // $ANTLR start "rulePointOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:433:1: rulePointOperation : ( ( rule__PointOperation__Group__0 ) ) ;
    public final void rulePointOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:437:2: ( ( ( rule__PointOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:438:1: ( ( rule__PointOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:438:1: ( ( rule__PointOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:439:1: ( rule__PointOperation__Group__0 )
            {
             before(grammarAccess.getPointOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:440:1: ( rule__PointOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:440:2: rule__PointOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__0_in_rulePointOperation872);
            rule__PointOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getGroup()); 

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
    // $ANTLR end "rulePointOperation"


    // $ANTLR start "entryRulePowOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:452:1: entryRulePowOperation : rulePowOperation EOF ;
    public final void entryRulePowOperation() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:453:1: ( rulePowOperation EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:454:1: rulePowOperation EOF
            {
             before(grammarAccess.getPowOperationRule()); 
            pushFollow(FOLLOW_rulePowOperation_in_entryRulePowOperation899);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPowOperationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePowOperation906); 

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
    // $ANTLR end "entryRulePowOperation"


    // $ANTLR start "rulePowOperation"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:461:1: rulePowOperation : ( ( rule__PowOperation__Group__0 ) ) ;
    public final void rulePowOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:465:2: ( ( ( rule__PowOperation__Group__0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:466:1: ( ( rule__PowOperation__Group__0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:466:1: ( ( rule__PowOperation__Group__0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:467:1: ( rule__PowOperation__Group__0 )
            {
             before(grammarAccess.getPowOperationAccess().getGroup()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:468:1: ( rule__PowOperation__Group__0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:468:2: rule__PowOperation__Group__0
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__0_in_rulePowOperation932);
            rule__PowOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getGroup()); 

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
    // $ANTLR end "rulePowOperation"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:480:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:481:1: ( rulePrimaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:482:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression959);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression966); 

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:489:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:493:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:494:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:494:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:495:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:496:1: ( rule__PrimaryExpression__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:496:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression992);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:508:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:509:1: ( ruleUnaryExpression EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:510:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1019);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression1026); 

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:517:1: ruleUnaryExpression : ( ruleTerm ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:521:2: ( ( ruleTerm ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:522:1: ( ruleTerm )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:522:1: ( ruleTerm )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:523:1: ruleTerm
            {
             before(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
            pushFollow(FOLLOW_ruleTerm_in_ruleUnaryExpression1052);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 

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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:536:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:537:1: ( ruleTerm EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:538:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1078);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1085); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:545:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:549:2: ( ( ( rule__Term__Alternatives ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:550:1: ( ( rule__Term__Alternatives ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:550:1: ( ( rule__Term__Alternatives ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:551:1: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:1: ( rule__Term__Alternatives )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:552:2: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_rule__Term__Alternatives_in_ruleTerm1111);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:564:1: entryRuleDesignator : ruleDesignator EOF ;
    public final void entryRuleDesignator() throws RecognitionException {
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:565:1: ( ruleDesignator EOF )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:566:1: ruleDesignator EOF
            {
             before(grammarAccess.getDesignatorRule()); 
            pushFollow(FOLLOW_ruleDesignator_in_entryRuleDesignator1138);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getDesignatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDesignator1145); 

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
    // $ANTLR end "entryRuleDesignator"


    // $ANTLR start "ruleDesignator"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:573:1: ruleDesignator : ( ( rule__Designator__ValueAssignment ) ) ;
    public final void ruleDesignator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:577:2: ( ( ( rule__Designator__ValueAssignment ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:578:1: ( ( rule__Designator__ValueAssignment ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:578:1: ( ( rule__Designator__ValueAssignment ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:579:1: ( rule__Designator__ValueAssignment )
            {
             before(grammarAccess.getDesignatorAccess().getValueAssignment()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:580:1: ( rule__Designator__ValueAssignment )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:580:2: rule__Designator__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1171);
            rule__Designator__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDesignatorAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleDesignator"


    // $ANTLR start "rule__Phrase__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:592:1: rule__Phrase__Alternatives : ( ( ruleExpression ) | ( ruleStatement ) );
    public final void rule__Phrase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:596:1: ( ( ruleExpression ) | ( ruleStatement ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:597:1: ( ruleExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:597:1: ( ruleExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:598:1: ruleExpression
                    {
                     before(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1207);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:603:6: ( ruleStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:603:6: ( ruleStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:604:1: ruleStatement
                    {
                     before(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStatement_in_rule__Phrase__Alternatives1224);
                    ruleStatement();

                    state._fsp--;

                     after(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Phrase__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:614:1: rule__Statement__Alternatives : ( ( ruleSingleStatement ) | ( ruleSelfStatement ) | ( ruleMultiStatement ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:618:1: ( ( ruleSingleStatement ) | ( ruleSelfStatement ) | ( ruleMultiStatement ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:619:1: ( ruleSingleStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:619:1: ( ruleSingleStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:620:1: ruleSingleStatement
                    {
                     before(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSingleStatement_in_rule__Statement__Alternatives1256);
                    ruleSingleStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:625:6: ( ruleSelfStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:625:6: ( ruleSelfStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:626:1: ruleSelfStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSelfStatement_in_rule__Statement__Alternatives1273);
                    ruleSelfStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:631:6: ( ruleMultiStatement )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:631:6: ( ruleMultiStatement )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:632:1: ruleMultiStatement
                    {
                     before(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMultiStatement_in_rule__Statement__Alternatives1290);
                    ruleMultiStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__EqualityExpression__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:642:1: rule__EqualityExpression__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) );
    public final void rule__EqualityExpression__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:646:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( 'in' ) | ( 'not in' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:647:1: ( '==' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:647:1: ( '==' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:648:1: '=='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_1_1_01323); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:655:6: ( '!=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:655:6: ( '!=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:656:1: '!='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_1_1_01343); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:663:6: ( '<=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:663:6: ( '<=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:664:1: '<='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_1_1_01363); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:671:6: ( '>=' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:671:6: ( '>=' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:672:1: '>='
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_1_1_01383); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:679:6: ( 'in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:679:6: ( 'in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:680:1: 'in'
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4()); 
                    match(input,16,FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_1_1_01403); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:687:6: ( 'not in' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:687:6: ( 'not in' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:688:1: 'not in'
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5()); 
                    match(input,17,FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_1_1_01423); 
                     after(grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5()); 

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
    // $ANTLR end "rule__EqualityExpression__OpAlternatives_1_1_0"


    // $ANTLR start "rule__DashOperation__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:700:1: rule__DashOperation__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__DashOperation__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:704:1: ( ( '+' ) | ( '-' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:705:1: ( '+' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:705:1: ( '+' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:706:1: '+'
                    {
                     before(grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__DashOperation__OpAlternatives_1_1_01458); 
                     after(grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:713:6: ( '-' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:713:6: ( '-' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:714:1: '-'
                    {
                     before(grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__DashOperation__OpAlternatives_1_1_01478); 
                     after(grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__DashOperation__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PointOperation__OpAlternatives_1_1_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:726:1: rule__PointOperation__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__PointOperation__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:730:1: ( ( '*' ) | ( '/' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:731:1: ( '*' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:731:1: ( '*' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:732:1: '*'
                    {
                     before(grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__PointOperation__OpAlternatives_1_1_01513); 
                     after(grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:739:6: ( '/' )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:739:6: ( '/' )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:740:1: '/'
                    {
                     before(grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__PointOperation__OpAlternatives_1_1_01533); 
                     after(grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__PointOperation__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:752:1: rule__PrimaryExpression__Alternatives : ( ( ruleUnaryExpression ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:756:1: ( ( ruleUnaryExpression ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:757:1: ( ruleUnaryExpression )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:757:1: ( ruleUnaryExpression )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:758:1: ruleUnaryExpression
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives1567);
                    ruleUnaryExpression();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:763:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:764:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:765:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:765:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1584);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:769:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:769:6: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:770:1: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:771:1: ( rule__PrimaryExpression__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:771:2: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1602);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Term__Alternatives"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:780:1: rule__Term__Alternatives : ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:784:1: ( ( ruleDesignator ) | ( ( rule__Term__Group_1__0 ) ) | ( ( rule__Term__Group_2__0 ) ) | ( ( rule__Term__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
                {
                alt7=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:785:1: ( ruleDesignator )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:785:1: ( ruleDesignator )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:786:1: ruleDesignator
                    {
                     before(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDesignator_in_rule__Term__Alternatives1635);
                    ruleDesignator();

                    state._fsp--;

                     after(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:791:6: ( ( rule__Term__Group_1__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:791:6: ( ( rule__Term__Group_1__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:792:1: ( rule__Term__Group_1__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_1()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:793:1: ( rule__Term__Group_1__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:793:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives1652);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:797:6: ( ( rule__Term__Group_2__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:797:6: ( ( rule__Term__Group_2__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:798:1: ( rule__Term__Group_2__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_2()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:799:1: ( rule__Term__Group_2__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:799:2: rule__Term__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives1670);
                    rule__Term__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:803:6: ( ( rule__Term__Group_3__0 ) )
                    {
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:803:6: ( ( rule__Term__Group_3__0 ) )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:804:1: ( rule__Term__Group_3__0 )
                    {
                     before(grammarAccess.getTermAccess().getGroup_3()); 
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:1: ( rule__Term__Group_3__0 )
                    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:805:2: rule__Term__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives1688);
                    rule__Term__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:816:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:820:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:821:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01719);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01722);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:828:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:832:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( RULE_ID )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:833:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:834:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1749); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:845:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:849:1: ( rule__FQN__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:850:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11778);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:856:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:860:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:861:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:861:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:862:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:1: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:863:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1805);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:877:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:881:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:882:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01840);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01843);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:889:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:893:1: ( ( '.' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:894:1: ( '.' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:894:1: ( '.' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:895:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__FQN__Group_1__0__Impl1871); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:908:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:912:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:913:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11902);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:919:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:923:1: ( ( RULE_ID ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:924:1: ( RULE_ID )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:924:1: ( RULE_ID )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:925:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1929); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__SingleStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:940:1: rule__SingleStatement__Group__0 : rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1 ;
    public final void rule__SingleStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:944:1: ( rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:945:2: rule__SingleStatement__Group__0__Impl rule__SingleStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__0__Impl_in_rule__SingleStatement__Group__01962);
            rule__SingleStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStatement__Group__1_in_rule__SingleStatement__Group__01965);
            rule__SingleStatement__Group__1();

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
    // $ANTLR end "rule__SingleStatement__Group__0"


    // $ANTLR start "rule__SingleStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:952:1: rule__SingleStatement__Group__0__Impl : ( ( rule__SingleStatement__DesgnatorAssignment_0 ) ) ;
    public final void rule__SingleStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:956:1: ( ( ( rule__SingleStatement__DesgnatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:957:1: ( ( rule__SingleStatement__DesgnatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:957:1: ( ( rule__SingleStatement__DesgnatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:958:1: ( rule__SingleStatement__DesgnatorAssignment_0 )
            {
             before(grammarAccess.getSingleStatementAccess().getDesgnatorAssignment_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:959:1: ( rule__SingleStatement__DesgnatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:959:2: rule__SingleStatement__DesgnatorAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleStatement__DesgnatorAssignment_0_in_rule__SingleStatement__Group__0__Impl1992);
            rule__SingleStatement__DesgnatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getDesgnatorAssignment_0()); 

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
    // $ANTLR end "rule__SingleStatement__Group__0__Impl"


    // $ANTLR start "rule__SingleStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:969:1: rule__SingleStatement__Group__1 : rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2 ;
    public final void rule__SingleStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:973:1: ( rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:974:2: rule__SingleStatement__Group__1__Impl rule__SingleStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__1__Impl_in_rule__SingleStatement__Group__12022);
            rule__SingleStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleStatement__Group__2_in_rule__SingleStatement__Group__12025);
            rule__SingleStatement__Group__2();

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
    // $ANTLR end "rule__SingleStatement__Group__1"


    // $ANTLR start "rule__SingleStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:981:1: rule__SingleStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SingleStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:985:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:986:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:986:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:987:1: '<-'
            {
             before(grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SingleStatement__Group__1__Impl2053); 
             after(grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__SingleStatement__Group__1__Impl"


    // $ANTLR start "rule__SingleStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1000:1: rule__SingleStatement__Group__2 : rule__SingleStatement__Group__2__Impl ;
    public final void rule__SingleStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1004:1: ( rule__SingleStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1005:2: rule__SingleStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleStatement__Group__2__Impl_in_rule__SingleStatement__Group__22084);
            rule__SingleStatement__Group__2__Impl();

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
    // $ANTLR end "rule__SingleStatement__Group__2"


    // $ANTLR start "rule__SingleStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1011:1: rule__SingleStatement__Group__2__Impl : ( ( rule__SingleStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SingleStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1015:1: ( ( ( rule__SingleStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1016:1: ( ( rule__SingleStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1016:1: ( ( rule__SingleStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1017:1: ( rule__SingleStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSingleStatementAccess().getExpressionAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1018:1: ( rule__SingleStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1018:2: rule__SingleStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SingleStatement__ExpressionAssignment_2_in_rule__SingleStatement__Group__2__Impl2111);
            rule__SingleStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleStatementAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__SingleStatement__Group__2__Impl"


    // $ANTLR start "rule__SelfStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1034:1: rule__SelfStatement__Group__0 : rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1 ;
    public final void rule__SelfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1038:1: ( rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1039:2: rule__SelfStatement__Group__0__Impl rule__SelfStatement__Group__1
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__0__Impl_in_rule__SelfStatement__Group__02147);
            rule__SelfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfStatement__Group__1_in_rule__SelfStatement__Group__02150);
            rule__SelfStatement__Group__1();

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
    // $ANTLR end "rule__SelfStatement__Group__0"


    // $ANTLR start "rule__SelfStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1046:1: rule__SelfStatement__Group__0__Impl : ( 'CurrentState' ) ;
    public final void rule__SelfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1050:1: ( ( 'CurrentState' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1051:1: ( 'CurrentState' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1051:1: ( 'CurrentState' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1052:1: 'CurrentState'
            {
             before(grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__SelfStatement__Group__0__Impl2178); 
             after(grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0()); 

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
    // $ANTLR end "rule__SelfStatement__Group__0__Impl"


    // $ANTLR start "rule__SelfStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1065:1: rule__SelfStatement__Group__1 : rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2 ;
    public final void rule__SelfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1069:1: ( rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1070:2: rule__SelfStatement__Group__1__Impl rule__SelfStatement__Group__2
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__1__Impl_in_rule__SelfStatement__Group__12209);
            rule__SelfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelfStatement__Group__2_in_rule__SelfStatement__Group__12212);
            rule__SelfStatement__Group__2();

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
    // $ANTLR end "rule__SelfStatement__Group__1"


    // $ANTLR start "rule__SelfStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1077:1: rule__SelfStatement__Group__1__Impl : ( '<-' ) ;
    public final void rule__SelfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1081:1: ( ( '<-' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:1: ( '<-' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1082:1: ( '<-' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1083:1: '<-'
            {
             before(grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__SelfStatement__Group__1__Impl2240); 
             after(grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__SelfStatement__Group__1__Impl"


    // $ANTLR start "rule__SelfStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1096:1: rule__SelfStatement__Group__2 : rule__SelfStatement__Group__2__Impl ;
    public final void rule__SelfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1100:1: ( rule__SelfStatement__Group__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1101:2: rule__SelfStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelfStatement__Group__2__Impl_in_rule__SelfStatement__Group__22271);
            rule__SelfStatement__Group__2__Impl();

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
    // $ANTLR end "rule__SelfStatement__Group__2"


    // $ANTLR start "rule__SelfStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1107:1: rule__SelfStatement__Group__2__Impl : ( ( rule__SelfStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__SelfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1111:1: ( ( ( rule__SelfStatement__ExpressionAssignment_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:1: ( ( rule__SelfStatement__ExpressionAssignment_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1112:1: ( ( rule__SelfStatement__ExpressionAssignment_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1113:1: ( rule__SelfStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getSelfStatementAccess().getExpressionAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1114:1: ( rule__SelfStatement__ExpressionAssignment_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1114:2: rule__SelfStatement__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_rule__SelfStatement__ExpressionAssignment_2_in_rule__SelfStatement__Group__2__Impl2298);
            rule__SelfStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelfStatementAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__SelfStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiStatement__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1130:1: rule__MultiStatement__Group__0 : rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1 ;
    public final void rule__MultiStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1134:1: ( rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1135:2: rule__MultiStatement__Group__0__Impl rule__MultiStatement__Group__1
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__0__Impl_in_rule__MultiStatement__Group__02334);
            rule__MultiStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__1_in_rule__MultiStatement__Group__02337);
            rule__MultiStatement__Group__1();

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
    // $ANTLR end "rule__MultiStatement__Group__0"


    // $ANTLR start "rule__MultiStatement__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1142:1: rule__MultiStatement__Group__0__Impl : ( ( rule__MultiStatement__DesgnatorAssignment_0 ) ) ;
    public final void rule__MultiStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1146:1: ( ( ( rule__MultiStatement__DesgnatorAssignment_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1147:1: ( ( rule__MultiStatement__DesgnatorAssignment_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1147:1: ( ( rule__MultiStatement__DesgnatorAssignment_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1148:1: ( rule__MultiStatement__DesgnatorAssignment_0 )
            {
             before(grammarAccess.getMultiStatementAccess().getDesgnatorAssignment_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1149:1: ( rule__MultiStatement__DesgnatorAssignment_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1149:2: rule__MultiStatement__DesgnatorAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiStatement__DesgnatorAssignment_0_in_rule__MultiStatement__Group__0__Impl2364);
            rule__MultiStatement__DesgnatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiStatementAccess().getDesgnatorAssignment_0()); 

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
    // $ANTLR end "rule__MultiStatement__Group__0__Impl"


    // $ANTLR start "rule__MultiStatement__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1159:1: rule__MultiStatement__Group__1 : rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2 ;
    public final void rule__MultiStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1163:1: ( rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1164:2: rule__MultiStatement__Group__1__Impl rule__MultiStatement__Group__2
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__1__Impl_in_rule__MultiStatement__Group__12394);
            rule__MultiStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__2_in_rule__MultiStatement__Group__12397);
            rule__MultiStatement__Group__2();

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
    // $ANTLR end "rule__MultiStatement__Group__1"


    // $ANTLR start "rule__MultiStatement__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1171:1: rule__MultiStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__MultiStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1175:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1176:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1176:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1177:1: '('
            {
             before(grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__MultiStatement__Group__1__Impl2425); 
             after(grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MultiStatement__Group__1__Impl"


    // $ANTLR start "rule__MultiStatement__Group__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1190:1: rule__MultiStatement__Group__2 : rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3 ;
    public final void rule__MultiStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1194:1: ( rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1195:2: rule__MultiStatement__Group__2__Impl rule__MultiStatement__Group__3
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__2__Impl_in_rule__MultiStatement__Group__22456);
            rule__MultiStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiStatement__Group__3_in_rule__MultiStatement__Group__22459);
            rule__MultiStatement__Group__3();

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
    // $ANTLR end "rule__MultiStatement__Group__2"


    // $ANTLR start "rule__MultiStatement__Group__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1202:1: rule__MultiStatement__Group__2__Impl : ( ( rule__MultiStatement__ExpressionsAssignment_2 )* ) ;
    public final void rule__MultiStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1206:1: ( ( ( rule__MultiStatement__ExpressionsAssignment_2 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1207:1: ( ( rule__MultiStatement__ExpressionsAssignment_2 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1207:1: ( ( rule__MultiStatement__ExpressionsAssignment_2 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1208:1: ( rule__MultiStatement__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getMultiStatementAccess().getExpressionsAssignment_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1209:1: ( rule__MultiStatement__ExpressionsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_DOUBLE)||LA9_0==25||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1209:2: rule__MultiStatement__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__MultiStatement__ExpressionsAssignment_2_in_rule__MultiStatement__Group__2__Impl2486);
            	    rule__MultiStatement__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMultiStatementAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end "rule__MultiStatement__Group__2__Impl"


    // $ANTLR start "rule__MultiStatement__Group__3"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1219:1: rule__MultiStatement__Group__3 : rule__MultiStatement__Group__3__Impl ;
    public final void rule__MultiStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1223:1: ( rule__MultiStatement__Group__3__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1224:2: rule__MultiStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MultiStatement__Group__3__Impl_in_rule__MultiStatement__Group__32517);
            rule__MultiStatement__Group__3__Impl();

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
    // $ANTLR end "rule__MultiStatement__Group__3"


    // $ANTLR start "rule__MultiStatement__Group__3__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1230:1: rule__MultiStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__MultiStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1234:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1235:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1235:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1236:1: ')'
            {
             before(grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__MultiStatement__Group__3__Impl2545); 
             after(grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MultiStatement__Group__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1257:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1261:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1262:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02584);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02587);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1269:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1273:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1274:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1274:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1275:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2614);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1286:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1290:1: ( rule__OrExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1291:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12643);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1297:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1301:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1302:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1302:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1303:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:1: ( rule__OrExpression__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1304:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2670);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1318:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1322:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1323:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02705);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02708);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1330:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1334:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1335:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1335:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1336:1: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1337:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1339:1: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1349:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1353:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1354:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12766);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12769);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1361:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1365:1: ( ( ( rule__OrExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1366:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1366:1: ( ( rule__OrExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1367:1: ( rule__OrExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1368:1: ( rule__OrExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1368:2: rule__OrExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2796);
            rule__OrExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1378:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1382:1: ( rule__OrExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1383:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22826);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1389:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1393:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1394:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1394:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1395:1: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1396:1: ( rule__OrExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1396:2: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2853);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1412:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1416:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1417:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02889);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02892);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1424:1: rule__AndExpression__Group__0__Impl : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1428:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1429:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1429:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1430:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl2919);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1441:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1445:1: ( rule__AndExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1446:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12948);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1452:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1456:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1457:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1457:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1458:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:1: ( rule__AndExpression__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1459:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2975);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1473:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1477:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1478:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03010);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03013);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1485:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1489:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1490:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1490:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1491:1: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1492:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1494:1: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1504:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1508:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1509:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13071);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13074);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1516:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OpAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1520:1: ( ( ( rule__AndExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1521:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1521:1: ( ( rule__AndExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1522:1: ( rule__AndExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:1: ( rule__AndExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1523:2: rule__AndExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3101);
            rule__AndExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1533:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1537:1: ( rule__AndExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1538:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23131);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1544:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1548:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1549:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1549:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1550:1: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1551:1: ( rule__AndExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1551:2: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3158);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1567:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1571:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1572:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03194);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03197);
            rule__EqualityExpression__Group__1();

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
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1579:1: rule__EqualityExpression__Group__0__Impl : ( ruleDashOperation ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1583:1: ( ( ruleDashOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1584:1: ( ruleDashOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1584:1: ( ruleDashOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1585:1: ruleDashOperation
            {
             before(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDashOperation_in_rule__EqualityExpression__Group__0__Impl3224);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1596:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1600:1: ( rule__EqualityExpression__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1601:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13253);
            rule__EqualityExpression__Group__1__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1607:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1611:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1612:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1612:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1613:1: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1614:1: ( rule__EqualityExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=12 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1614:2: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl3280);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1628:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1632:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1633:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__03315);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__03318);
            rule__EqualityExpression__Group_1__1();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1640:1: rule__EqualityExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1644:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1645:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1645:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1646:1: ()
            {
             before(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1647:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1649:1: 
            {
            }

             after(grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1659:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1663:1: ( rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1664:2: rule__EqualityExpression__Group_1__1__Impl rule__EqualityExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__13376);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__2_in_rule__EqualityExpression__Group_1__13379);
            rule__EqualityExpression__Group_1__2();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1671:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1675:1: ( ( ( rule__EqualityExpression__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1676:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1676:1: ( ( rule__EqualityExpression__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1677:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:1: ( rule__EqualityExpression__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1678:2: rule__EqualityExpression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl3406);
            rule__EqualityExpression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1688:1: rule__EqualityExpression__Group_1__2 : rule__EqualityExpression__Group_1__2__Impl ;
    public final void rule__EqualityExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1692:1: ( rule__EqualityExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1693:2: rule__EqualityExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__2__Impl_in_rule__EqualityExpression__Group_1__23436);
            rule__EqualityExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2"


    // $ANTLR start "rule__EqualityExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1699:1: rule__EqualityExpression__Group_1__2__Impl : ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) ;
    public final void rule__EqualityExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1703:1: ( ( ( rule__EqualityExpression__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1704:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1704:1: ( ( rule__EqualityExpression__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1705:1: ( rule__EqualityExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1706:1: ( rule__EqualityExpression__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1706:2: rule__EqualityExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__EqualityExpression__RightAssignment_1_2_in_rule__EqualityExpression__Group_1__2__Impl3463);
            rule__EqualityExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__EqualityExpression__Group_1__2__Impl"


    // $ANTLR start "rule__DashOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1722:1: rule__DashOperation__Group__0 : rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1 ;
    public final void rule__DashOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1726:1: ( rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1727:2: rule__DashOperation__Group__0__Impl rule__DashOperation__Group__1
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__0__Impl_in_rule__DashOperation__Group__03499);
            rule__DashOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group__1_in_rule__DashOperation__Group__03502);
            rule__DashOperation__Group__1();

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
    // $ANTLR end "rule__DashOperation__Group__0"


    // $ANTLR start "rule__DashOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1734:1: rule__DashOperation__Group__0__Impl : ( rulePointOperation ) ;
    public final void rule__DashOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1738:1: ( ( rulePointOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1739:1: ( rulePointOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1739:1: ( rulePointOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1740:1: rulePointOperation
            {
             before(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePointOperation_in_rule__DashOperation__Group__0__Impl3529);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__DashOperation__Group__0__Impl"


    // $ANTLR start "rule__DashOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1751:1: rule__DashOperation__Group__1 : rule__DashOperation__Group__1__Impl ;
    public final void rule__DashOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1755:1: ( rule__DashOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1756:2: rule__DashOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DashOperation__Group__1__Impl_in_rule__DashOperation__Group__13558);
            rule__DashOperation__Group__1__Impl();

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
    // $ANTLR end "rule__DashOperation__Group__1"


    // $ANTLR start "rule__DashOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1762:1: rule__DashOperation__Group__1__Impl : ( ( rule__DashOperation__Group_1__0 )* ) ;
    public final void rule__DashOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1766:1: ( ( ( rule__DashOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1767:1: ( ( rule__DashOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1767:1: ( ( rule__DashOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1768:1: ( rule__DashOperation__Group_1__0 )*
            {
             before(grammarAccess.getDashOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1769:1: ( rule__DashOperation__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=18 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1769:2: rule__DashOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DashOperation__Group_1__0_in_rule__DashOperation__Group__1__Impl3585);
            	    rule__DashOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDashOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DashOperation__Group__1__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1783:1: rule__DashOperation__Group_1__0 : rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1 ;
    public final void rule__DashOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1787:1: ( rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1788:2: rule__DashOperation__Group_1__0__Impl rule__DashOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__0__Impl_in_rule__DashOperation__Group_1__03620);
            rule__DashOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group_1__1_in_rule__DashOperation__Group_1__03623);
            rule__DashOperation__Group_1__1();

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
    // $ANTLR end "rule__DashOperation__Group_1__0"


    // $ANTLR start "rule__DashOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1795:1: rule__DashOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__DashOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1799:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1800:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1800:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1801:1: ()
            {
             before(grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1802:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1804:1: 
            {
            }

             after(grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DashOperation__Group_1__0__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1814:1: rule__DashOperation__Group_1__1 : rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2 ;
    public final void rule__DashOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1818:1: ( rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1819:2: rule__DashOperation__Group_1__1__Impl rule__DashOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__1__Impl_in_rule__DashOperation__Group_1__13681);
            rule__DashOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DashOperation__Group_1__2_in_rule__DashOperation__Group_1__13684);
            rule__DashOperation__Group_1__2();

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
    // $ANTLR end "rule__DashOperation__Group_1__1"


    // $ANTLR start "rule__DashOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1826:1: rule__DashOperation__Group_1__1__Impl : ( ( rule__DashOperation__OpAssignment_1_1 ) ) ;
    public final void rule__DashOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1830:1: ( ( ( rule__DashOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1831:1: ( ( rule__DashOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1831:1: ( ( rule__DashOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1832:1: ( rule__DashOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getDashOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:1: ( rule__DashOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1833:2: rule__DashOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DashOperation__OpAssignment_1_1_in_rule__DashOperation__Group_1__1__Impl3711);
            rule__DashOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__DashOperation__Group_1__1__Impl"


    // $ANTLR start "rule__DashOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1843:1: rule__DashOperation__Group_1__2 : rule__DashOperation__Group_1__2__Impl ;
    public final void rule__DashOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1847:1: ( rule__DashOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1848:2: rule__DashOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DashOperation__Group_1__2__Impl_in_rule__DashOperation__Group_1__23741);
            rule__DashOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__DashOperation__Group_1__2"


    // $ANTLR start "rule__DashOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1854:1: rule__DashOperation__Group_1__2__Impl : ( ( rule__DashOperation__RightAssignment_1_2 ) ) ;
    public final void rule__DashOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1858:1: ( ( ( rule__DashOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1859:1: ( ( rule__DashOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1859:1: ( ( rule__DashOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1860:1: ( rule__DashOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getDashOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1861:1: ( rule__DashOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1861:2: rule__DashOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DashOperation__RightAssignment_1_2_in_rule__DashOperation__Group_1__2__Impl3768);
            rule__DashOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__DashOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PointOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1877:1: rule__PointOperation__Group__0 : rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1 ;
    public final void rule__PointOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1881:1: ( rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1882:2: rule__PointOperation__Group__0__Impl rule__PointOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__0__Impl_in_rule__PointOperation__Group__03804);
            rule__PointOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group__1_in_rule__PointOperation__Group__03807);
            rule__PointOperation__Group__1();

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
    // $ANTLR end "rule__PointOperation__Group__0"


    // $ANTLR start "rule__PointOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1889:1: rule__PointOperation__Group__0__Impl : ( rulePowOperation ) ;
    public final void rule__PointOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1893:1: ( ( rulePowOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1894:1: ( rulePowOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1894:1: ( rulePowOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1895:1: rulePowOperation
            {
             before(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePowOperation_in_rule__PointOperation__Group__0__Impl3834);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__PointOperation__Group__0__Impl"


    // $ANTLR start "rule__PointOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1906:1: rule__PointOperation__Group__1 : rule__PointOperation__Group__1__Impl ;
    public final void rule__PointOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1910:1: ( rule__PointOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1911:2: rule__PointOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PointOperation__Group__1__Impl_in_rule__PointOperation__Group__13863);
            rule__PointOperation__Group__1__Impl();

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
    // $ANTLR end "rule__PointOperation__Group__1"


    // $ANTLR start "rule__PointOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1917:1: rule__PointOperation__Group__1__Impl : ( ( rule__PointOperation__Group_1__0 )* ) ;
    public final void rule__PointOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1921:1: ( ( ( rule__PointOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1922:1: ( ( rule__PointOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1922:1: ( ( rule__PointOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1923:1: ( rule__PointOperation__Group_1__0 )*
            {
             before(grammarAccess.getPointOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1924:1: ( rule__PointOperation__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=20 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1924:2: rule__PointOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PointOperation__Group_1__0_in_rule__PointOperation__Group__1__Impl3890);
            	    rule__PointOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPointOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PointOperation__Group__1__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1938:1: rule__PointOperation__Group_1__0 : rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1 ;
    public final void rule__PointOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1942:1: ( rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1943:2: rule__PointOperation__Group_1__0__Impl rule__PointOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__0__Impl_in_rule__PointOperation__Group_1__03925);
            rule__PointOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group_1__1_in_rule__PointOperation__Group_1__03928);
            rule__PointOperation__Group_1__1();

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
    // $ANTLR end "rule__PointOperation__Group_1__0"


    // $ANTLR start "rule__PointOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1950:1: rule__PointOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PointOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1954:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1955:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1955:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1956:1: ()
            {
             before(grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1957:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1959:1: 
            {
            }

             after(grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PointOperation__Group_1__0__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1969:1: rule__PointOperation__Group_1__1 : rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2 ;
    public final void rule__PointOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1973:1: ( rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1974:2: rule__PointOperation__Group_1__1__Impl rule__PointOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__1__Impl_in_rule__PointOperation__Group_1__13986);
            rule__PointOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PointOperation__Group_1__2_in_rule__PointOperation__Group_1__13989);
            rule__PointOperation__Group_1__2();

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
    // $ANTLR end "rule__PointOperation__Group_1__1"


    // $ANTLR start "rule__PointOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1981:1: rule__PointOperation__Group_1__1__Impl : ( ( rule__PointOperation__OpAssignment_1_1 ) ) ;
    public final void rule__PointOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1985:1: ( ( ( rule__PointOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1986:1: ( ( rule__PointOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1986:1: ( ( rule__PointOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1987:1: ( rule__PointOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getPointOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:1: ( rule__PointOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1988:2: rule__PointOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PointOperation__OpAssignment_1_1_in_rule__PointOperation__Group_1__1__Impl4016);
            rule__PointOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__PointOperation__Group_1__1__Impl"


    // $ANTLR start "rule__PointOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:1998:1: rule__PointOperation__Group_1__2 : rule__PointOperation__Group_1__2__Impl ;
    public final void rule__PointOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2002:1: ( rule__PointOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2003:2: rule__PointOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PointOperation__Group_1__2__Impl_in_rule__PointOperation__Group_1__24046);
            rule__PointOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__PointOperation__Group_1__2"


    // $ANTLR start "rule__PointOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2009:1: rule__PointOperation__Group_1__2__Impl : ( ( rule__PointOperation__RightAssignment_1_2 ) ) ;
    public final void rule__PointOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2013:1: ( ( ( rule__PointOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2014:1: ( ( rule__PointOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2014:1: ( ( rule__PointOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2015:1: ( rule__PointOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getPointOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2016:1: ( rule__PointOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2016:2: rule__PointOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PointOperation__RightAssignment_1_2_in_rule__PointOperation__Group_1__2__Impl4073);
            rule__PointOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__PointOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PowOperation__Group__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2032:1: rule__PowOperation__Group__0 : rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1 ;
    public final void rule__PowOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2036:1: ( rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2037:2: rule__PowOperation__Group__0__Impl rule__PowOperation__Group__1
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__0__Impl_in_rule__PowOperation__Group__04109);
            rule__PowOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group__1_in_rule__PowOperation__Group__04112);
            rule__PowOperation__Group__1();

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
    // $ANTLR end "rule__PowOperation__Group__0"


    // $ANTLR start "rule__PowOperation__Group__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2044:1: rule__PowOperation__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__PowOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2048:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2049:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2049:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2050:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PowOperation__Group__0__Impl4139);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 

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
    // $ANTLR end "rule__PowOperation__Group__0__Impl"


    // $ANTLR start "rule__PowOperation__Group__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2061:1: rule__PowOperation__Group__1 : rule__PowOperation__Group__1__Impl ;
    public final void rule__PowOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2065:1: ( rule__PowOperation__Group__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2066:2: rule__PowOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PowOperation__Group__1__Impl_in_rule__PowOperation__Group__14168);
            rule__PowOperation__Group__1__Impl();

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
    // $ANTLR end "rule__PowOperation__Group__1"


    // $ANTLR start "rule__PowOperation__Group__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2072:1: rule__PowOperation__Group__1__Impl : ( ( rule__PowOperation__Group_1__0 )* ) ;
    public final void rule__PowOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2076:1: ( ( ( rule__PowOperation__Group_1__0 )* ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2077:1: ( ( rule__PowOperation__Group_1__0 )* )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2077:1: ( ( rule__PowOperation__Group_1__0 )* )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2078:1: ( rule__PowOperation__Group_1__0 )*
            {
             before(grammarAccess.getPowOperationAccess().getGroup_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2079:1: ( rule__PowOperation__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2079:2: rule__PowOperation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PowOperation__Group_1__0_in_rule__PowOperation__Group__1__Impl4195);
            	    rule__PowOperation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPowOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PowOperation__Group__1__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2093:1: rule__PowOperation__Group_1__0 : rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1 ;
    public final void rule__PowOperation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2097:1: ( rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2098:2: rule__PowOperation__Group_1__0__Impl rule__PowOperation__Group_1__1
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__0__Impl_in_rule__PowOperation__Group_1__04230);
            rule__PowOperation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group_1__1_in_rule__PowOperation__Group_1__04233);
            rule__PowOperation__Group_1__1();

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
    // $ANTLR end "rule__PowOperation__Group_1__0"


    // $ANTLR start "rule__PowOperation__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2105:1: rule__PowOperation__Group_1__0__Impl : ( () ) ;
    public final void rule__PowOperation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2109:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2110:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2110:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2111:1: ()
            {
             before(grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2112:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2114:1: 
            {
            }

             after(grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowOperation__Group_1__0__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2124:1: rule__PowOperation__Group_1__1 : rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2 ;
    public final void rule__PowOperation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2128:1: ( rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2129:2: rule__PowOperation__Group_1__1__Impl rule__PowOperation__Group_1__2
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__1__Impl_in_rule__PowOperation__Group_1__14291);
            rule__PowOperation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PowOperation__Group_1__2_in_rule__PowOperation__Group_1__14294);
            rule__PowOperation__Group_1__2();

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
    // $ANTLR end "rule__PowOperation__Group_1__1"


    // $ANTLR start "rule__PowOperation__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2136:1: rule__PowOperation__Group_1__1__Impl : ( ( rule__PowOperation__OpAssignment_1_1 ) ) ;
    public final void rule__PowOperation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2140:1: ( ( ( rule__PowOperation__OpAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2141:1: ( ( rule__PowOperation__OpAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2141:1: ( ( rule__PowOperation__OpAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2142:1: ( rule__PowOperation__OpAssignment_1_1 )
            {
             before(grammarAccess.getPowOperationAccess().getOpAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:1: ( rule__PowOperation__OpAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2143:2: rule__PowOperation__OpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PowOperation__OpAssignment_1_1_in_rule__PowOperation__Group_1__1__Impl4321);
            rule__PowOperation__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__PowOperation__Group_1__1__Impl"


    // $ANTLR start "rule__PowOperation__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2153:1: rule__PowOperation__Group_1__2 : rule__PowOperation__Group_1__2__Impl ;
    public final void rule__PowOperation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2157:1: ( rule__PowOperation__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2158:2: rule__PowOperation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PowOperation__Group_1__2__Impl_in_rule__PowOperation__Group_1__24351);
            rule__PowOperation__Group_1__2__Impl();

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
    // $ANTLR end "rule__PowOperation__Group_1__2"


    // $ANTLR start "rule__PowOperation__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2164:1: rule__PowOperation__Group_1__2__Impl : ( ( rule__PowOperation__RightAssignment_1_2 ) ) ;
    public final void rule__PowOperation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2168:1: ( ( ( rule__PowOperation__RightAssignment_1_2 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2169:1: ( ( rule__PowOperation__RightAssignment_1_2 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2169:1: ( ( rule__PowOperation__RightAssignment_1_2 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2170:1: ( rule__PowOperation__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowOperationAccess().getRightAssignment_1_2()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2171:1: ( rule__PowOperation__RightAssignment_1_2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2171:2: rule__PowOperation__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PowOperation__RightAssignment_1_2_in_rule__PowOperation__Group_1__2__Impl4378);
            rule__PowOperation__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowOperationAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__PowOperation__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2187:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2191:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2192:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__04414);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__04417);
            rule__PrimaryExpression__Group_1__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2199:1: rule__PrimaryExpression__Group_1__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2203:1: ( ( '(' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2204:1: ( '(' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2204:1: ( '(' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2205:1: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__PrimaryExpression__Group_1__0__Impl4445); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2218:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2222:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2223:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__14476);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__14479);
            rule__PrimaryExpression__Group_1__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2230:1: rule__PrimaryExpression__Group_1__1__Impl : ( ruleEvaluationExpression ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2234:1: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2235:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2235:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2236:1: ruleEvaluationExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_1__1__Impl4506);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2247:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2251:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2252:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__24535);
            rule__PrimaryExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2258:1: rule__PrimaryExpression__Group_1__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2262:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2263:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2263:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2264:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 
            match(input,26,FOLLOW_26_in_rule__PrimaryExpression__Group_1__2__Impl4563); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2283:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2287:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2288:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__04600);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__04603);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2295:1: rule__PrimaryExpression__Group_2__0__Impl : ( 'NOT (' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2299:1: ( ( 'NOT (' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2300:1: ( 'NOT (' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2300:1: ( 'NOT (' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2301:1: 'NOT ('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__PrimaryExpression__Group_2__0__Impl4631); 
             after(grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2314:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2318:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2319:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__14662);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__14665);
            rule__PrimaryExpression__Group_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2326:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleEvaluationExpression ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2330:1: ( ( ruleEvaluationExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2331:1: ( ruleEvaluationExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2331:1: ( ruleEvaluationExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2332:1: ruleEvaluationExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_2__1__Impl4692);
            ruleEvaluationExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2343:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2347:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2348:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__24721);
            rule__PrimaryExpression__Group_2__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2354:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2358:1: ( ( ')' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2359:1: ( ')' )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2359:1: ( ')' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2360:1: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__PrimaryExpression__Group_2__2__Impl4749); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2379:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2383:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2384:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04786);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04789);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2391:1: rule__Term__Group_1__0__Impl : ( () ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2395:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2396:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2396:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2397:1: ()
            {
             before(grammarAccess.getTermAccess().getStringValueAction_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2398:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2400:1: 
            {
            }

             after(grammarAccess.getTermAccess().getStringValueAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2410:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2414:1: ( rule__Term__Group_1__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2415:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14847);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2421:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ValueAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2425:1: ( ( ( rule__Term__ValueAssignment_1_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2426:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2426:1: ( ( rule__Term__ValueAssignment_1_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2427:1: ( rule__Term__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_1_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2428:1: ( rule__Term__ValueAssignment_1_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2428:2: rule__Term__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl4874);
            rule__Term__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_2__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2442:1: rule__Term__Group_2__0 : rule__Term__Group_2__0__Impl rule__Term__Group_2__1 ;
    public final void rule__Term__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2446:1: ( rule__Term__Group_2__0__Impl rule__Term__Group_2__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2447:2: rule__Term__Group_2__0__Impl rule__Term__Group_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__04908);
            rule__Term__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__04911);
            rule__Term__Group_2__1();

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
    // $ANTLR end "rule__Term__Group_2__0"


    // $ANTLR start "rule__Term__Group_2__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2454:1: rule__Term__Group_2__0__Impl : ( () ) ;
    public final void rule__Term__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2458:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2459:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2459:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2460:1: ()
            {
             before(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2461:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2463:1: 
            {
            }

             after(grammarAccess.getTermAccess().getIntegerValueAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_2__0__Impl"


    // $ANTLR start "rule__Term__Group_2__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2473:1: rule__Term__Group_2__1 : rule__Term__Group_2__1__Impl ;
    public final void rule__Term__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2477:1: ( rule__Term__Group_2__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2478:2: rule__Term__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__14969);
            rule__Term__Group_2__1__Impl();

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
    // $ANTLR end "rule__Term__Group_2__1"


    // $ANTLR start "rule__Term__Group_2__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2484:1: rule__Term__Group_2__1__Impl : ( ( rule__Term__ValueAssignment_2_1 ) ) ;
    public final void rule__Term__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2488:1: ( ( ( rule__Term__ValueAssignment_2_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2489:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2489:1: ( ( rule__Term__ValueAssignment_2_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2490:1: ( rule__Term__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_2_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2491:1: ( rule__Term__ValueAssignment_2_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2491:2: rule__Term__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl4996);
            rule__Term__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Term__Group_2__1__Impl"


    // $ANTLR start "rule__Term__Group_3__0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2505:1: rule__Term__Group_3__0 : rule__Term__Group_3__0__Impl rule__Term__Group_3__1 ;
    public final void rule__Term__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2509:1: ( rule__Term__Group_3__0__Impl rule__Term__Group_3__1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2510:2: rule__Term__Group_3__0__Impl rule__Term__Group_3__1
            {
            pushFollow(FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__05030);
            rule__Term__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__05033);
            rule__Term__Group_3__1();

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
    // $ANTLR end "rule__Term__Group_3__0"


    // $ANTLR start "rule__Term__Group_3__0__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2517:1: rule__Term__Group_3__0__Impl : ( () ) ;
    public final void rule__Term__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2521:1: ( ( () ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2522:1: ( () )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2522:1: ( () )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2523:1: ()
            {
             before(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2524:1: ()
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2526:1: 
            {
            }

             after(grammarAccess.getTermAccess().getDoubleValueAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_3__0__Impl"


    // $ANTLR start "rule__Term__Group_3__1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2536:1: rule__Term__Group_3__1 : rule__Term__Group_3__1__Impl ;
    public final void rule__Term__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2540:1: ( rule__Term__Group_3__1__Impl )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2541:2: rule__Term__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__15091);
            rule__Term__Group_3__1__Impl();

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
    // $ANTLR end "rule__Term__Group_3__1"


    // $ANTLR start "rule__Term__Group_3__1__Impl"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2547:1: rule__Term__Group_3__1__Impl : ( ( rule__Term__ValueAssignment_3_1 ) ) ;
    public final void rule__Term__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2551:1: ( ( ( rule__Term__ValueAssignment_3_1 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2552:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2552:1: ( ( rule__Term__ValueAssignment_3_1 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2553:1: ( rule__Term__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTermAccess().getValueAssignment_3_1()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2554:1: ( rule__Term__ValueAssignment_3_1 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2554:2: rule__Term__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl5118);
            rule__Term__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Term__Group_3__1__Impl"


    // $ANTLR start "rule__Model__PhraseAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2569:1: rule__Model__PhraseAssignment : ( rulePhrase ) ;
    public final void rule__Model__PhraseAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2573:1: ( ( rulePhrase ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2574:1: ( rulePhrase )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2574:1: ( rulePhrase )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2575:1: rulePhrase
            {
             before(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment5157);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__PhraseAssignment"


    // $ANTLR start "rule__SingleStatement__DesgnatorAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2584:1: rule__SingleStatement__DesgnatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__SingleStatement__DesgnatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2588:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2589:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2589:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2590:1: ruleDesignator
            {
             before(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDesignator_in_rule__SingleStatement__DesgnatorAssignment_05188);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__SingleStatement__DesgnatorAssignment_0"


    // $ANTLR start "rule__SingleStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2599:1: rule__SingleStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SingleStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2603:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2604:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2604:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2605:1: ruleExpression
            {
             before(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SingleStatement__ExpressionAssignment_25219);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SingleStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__SelfStatement__ExpressionAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2614:1: rule__SelfStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__SelfStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2618:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2619:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2619:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2620:1: ruleExpression
            {
             before(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__SelfStatement__ExpressionAssignment_25250);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SelfStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__MultiStatement__DesgnatorAssignment_0"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2629:1: rule__MultiStatement__DesgnatorAssignment_0 : ( ruleDesignator ) ;
    public final void rule__MultiStatement__DesgnatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2633:1: ( ( ruleDesignator ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2634:1: ( ruleDesignator )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2634:1: ( ruleDesignator )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2635:1: ruleDesignator
            {
             before(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDesignator_in_rule__MultiStatement__DesgnatorAssignment_05281);
            ruleDesignator();

            state._fsp--;

             after(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MultiStatement__DesgnatorAssignment_0"


    // $ANTLR start "rule__MultiStatement__ExpressionsAssignment_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2644:1: rule__MultiStatement__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__MultiStatement__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2648:1: ( ( ruleExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2649:1: ( ruleExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2649:1: ( ruleExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2650:1: ruleExpression
            {
             before(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__MultiStatement__ExpressionsAssignment_25312);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MultiStatement__ExpressionsAssignment_2"


    // $ANTLR start "rule__OrExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2659:1: rule__OrExpression__OpAssignment_1_1 : ( ( 'OR' ) ) ;
    public final void rule__OrExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2663:1: ( ( ( 'OR' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2664:1: ( ( 'OR' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2664:1: ( ( 'OR' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2665:1: ( 'OR' )
            {
             before(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2666:1: ( 'OR' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2667:1: 'OR'
            {
             before(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 
            match(input,28,FOLLOW_28_in_rule__OrExpression__OpAssignment_1_15348); 
             after(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 

            }

             after(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0()); 

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
    // $ANTLR end "rule__OrExpression__OpAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2682:1: rule__OrExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2686:1: ( ( ruleAndExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2687:1: ( ruleAndExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2687:1: ( ruleAndExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2688:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25387);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2697:1: rule__AndExpression__OpAssignment_1_1 : ( ( 'AND' ) ) ;
    public final void rule__AndExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2701:1: ( ( ( 'AND' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2702:1: ( ( 'AND' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2702:1: ( ( 'AND' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2703:1: ( 'AND' )
            {
             before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2704:1: ( 'AND' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2705:1: 'AND'
            {
             before(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 
            match(input,29,FOLLOW_29_in_rule__AndExpression__OpAssignment_1_15423); 
             after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 

            }

             after(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AndExpression__OpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2720:1: rule__AndExpression__RightAssignment_1_2 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2724:1: ( ( ruleEqualityExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2725:1: ( ruleEqualityExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2725:1: ( ruleEqualityExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2726:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__RightAssignment_1_25462);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__EqualityExpression__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2735:1: rule__EqualityExpression__OpAssignment_1_1 : ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) ;
    public final void rule__EqualityExpression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2739:1: ( ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2740:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2740:1: ( ( rule__EqualityExpression__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2741:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2742:1: ( rule__EqualityExpression__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2742:2: rule__EqualityExpression__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OpAlternatives_1_1_0_in_rule__EqualityExpression__OpAssignment_1_15493);
            rule__EqualityExpression__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__EqualityExpression__OpAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2751:1: rule__EqualityExpression__RightAssignment_1_2 : ( ruleDashOperation ) ;
    public final void rule__EqualityExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2755:1: ( ( ruleDashOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2756:1: ( ruleDashOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2756:1: ( ruleDashOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2757:1: ruleDashOperation
            {
             before(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleDashOperation_in_rule__EqualityExpression__RightAssignment_1_25526);
            ruleDashOperation();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__EqualityExpression__RightAssignment_1_2"


    // $ANTLR start "rule__DashOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2766:1: rule__DashOperation__OpAssignment_1_1 : ( ( rule__DashOperation__OpAlternatives_1_1_0 ) ) ;
    public final void rule__DashOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2770:1: ( ( ( rule__DashOperation__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2771:1: ( ( rule__DashOperation__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2771:1: ( ( rule__DashOperation__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2772:1: ( rule__DashOperation__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getDashOperationAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2773:1: ( rule__DashOperation__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2773:2: rule__DashOperation__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__DashOperation__OpAlternatives_1_1_0_in_rule__DashOperation__OpAssignment_1_15557);
            rule__DashOperation__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDashOperationAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__DashOperation__OpAssignment_1_1"


    // $ANTLR start "rule__DashOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2782:1: rule__DashOperation__RightAssignment_1_2 : ( rulePointOperation ) ;
    public final void rule__DashOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2786:1: ( ( rulePointOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2787:1: ( rulePointOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2787:1: ( rulePointOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2788:1: rulePointOperation
            {
             before(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePointOperation_in_rule__DashOperation__RightAssignment_1_25590);
            rulePointOperation();

            state._fsp--;

             after(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__DashOperation__RightAssignment_1_2"


    // $ANTLR start "rule__PointOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2797:1: rule__PointOperation__OpAssignment_1_1 : ( ( rule__PointOperation__OpAlternatives_1_1_0 ) ) ;
    public final void rule__PointOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2801:1: ( ( ( rule__PointOperation__OpAlternatives_1_1_0 ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2802:1: ( ( rule__PointOperation__OpAlternatives_1_1_0 ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2802:1: ( ( rule__PointOperation__OpAlternatives_1_1_0 ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2803:1: ( rule__PointOperation__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getPointOperationAccess().getOpAlternatives_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2804:1: ( rule__PointOperation__OpAlternatives_1_1_0 )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2804:2: rule__PointOperation__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__PointOperation__OpAlternatives_1_1_0_in_rule__PointOperation__OpAssignment_1_15621);
            rule__PointOperation__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPointOperationAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__PointOperation__OpAssignment_1_1"


    // $ANTLR start "rule__PointOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2813:1: rule__PointOperation__RightAssignment_1_2 : ( rulePowOperation ) ;
    public final void rule__PointOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2817:1: ( ( rulePowOperation ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2818:1: ( rulePowOperation )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2818:1: ( rulePowOperation )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2819:1: rulePowOperation
            {
             before(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePowOperation_in_rule__PointOperation__RightAssignment_1_25654);
            rulePowOperation();

            state._fsp--;

             after(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__PointOperation__RightAssignment_1_2"


    // $ANTLR start "rule__PowOperation__OpAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2828:1: rule__PowOperation__OpAssignment_1_1 : ( ( '^' ) ) ;
    public final void rule__PowOperation__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2832:1: ( ( ( '^' ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2833:1: ( ( '^' ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2833:1: ( ( '^' ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2834:1: ( '^' )
            {
             before(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2835:1: ( '^' )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2836:1: '^'
            {
             before(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 
            match(input,30,FOLLOW_30_in_rule__PowOperation__OpAssignment_1_15690); 
             after(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 

            }

             after(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0()); 

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
    // $ANTLR end "rule__PowOperation__OpAssignment_1_1"


    // $ANTLR start "rule__PowOperation__RightAssignment_1_2"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2851:1: rule__PowOperation__RightAssignment_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__PowOperation__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2855:1: ( ( rulePrimaryExpression ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2856:1: ( rulePrimaryExpression )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2856:1: ( rulePrimaryExpression )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2857:1: rulePrimaryExpression
            {
             before(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__PowOperation__RightAssignment_1_25729);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__PowOperation__RightAssignment_1_2"


    // $ANTLR start "rule__Term__ValueAssignment_1_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2866:1: rule__Term__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Term__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2870:1: ( ( RULE_STRING ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2871:1: ( RULE_STRING )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2871:1: ( RULE_STRING )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2872:1: RULE_STRING
            {
             before(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_15760); 
             after(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Term__ValueAssignment_1_1"


    // $ANTLR start "rule__Term__ValueAssignment_2_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2881:1: rule__Term__ValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Term__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2885:1: ( ( RULE_INT ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2886:1: ( RULE_INT )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2886:1: ( RULE_INT )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2887:1: RULE_INT
            {
             before(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_15791); 
             after(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Term__ValueAssignment_2_1"


    // $ANTLR start "rule__Term__ValueAssignment_3_1"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2896:1: rule__Term__ValueAssignment_3_1 : ( RULE_DOUBLE ) ;
    public final void rule__Term__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2900:1: ( ( RULE_DOUBLE ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2901:1: ( RULE_DOUBLE )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2901:1: ( RULE_DOUBLE )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2902:1: RULE_DOUBLE
            {
             before(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_15822); 
             after(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Term__ValueAssignment_3_1"


    // $ANTLR start "rule__Designator__ValueAssignment"
    // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2911:1: rule__Designator__ValueAssignment : ( ( ruleFQN ) ) ;
    public final void rule__Designator__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2915:1: ( ( ( ruleFQN ) ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2916:1: ( ( ruleFQN ) )
            {
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2916:1: ( ( ruleFQN ) )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2917:1: ( ruleFQN )
            {
             before(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2918:1: ( ruleFQN )
            // ../org.openetcs.dsl.expression.ui/src-gen/org/openetcs/dsl/ui/contentassist/antlr/internal/InternalExpression.g:2919:1: ruleFQN
            {
             before(grammarAccess.getDesignatorAccess().getValueEObjectFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Designator__ValueAssignment5857);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDesignatorAccess().getValueEObjectFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 

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
    // $ANTLR end "rule__Designator__ValueAssignment"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\6\uffff";
    static final String DFA1_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA1_minS =
        "\1\4\1\14\2\uffff\1\4\1\14";
    static final String DFA1_maxS =
        "\1\33\1\36\2\uffff\1\4\1\36";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2\2\uffff";
    static final String DFA1_specialS =
        "\6\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\3\2\20\uffff\1\3\1\2\1\uffff\1\2",
            "\12\2\1\4\1\3\1\uffff\1\3\2\uffff\3\2",
            "",
            "",
            "\1\5",
            "\12\2\1\4\1\3\1\uffff\1\3\2\uffff\3\2"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "592:1: rule__Phrase__Alternatives : ( ( ruleExpression ) | ( ruleStatement ) );";
        }
    }
    static final String DFA2_eotS =
        "\7\uffff";
    static final String DFA2_eofS =
        "\7\uffff";
    static final String DFA2_minS =
        "\1\4\1\26\1\uffff\1\4\2\uffff\1\26";
    static final String DFA2_maxS =
        "\1\30\1\31\1\uffff\1\4\2\uffff\1\31";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1\1\uffff";
    static final String DFA2_specialS =
        "\7\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\23\uffff\1\2",
            "\1\3\1\5\1\uffff\1\4",
            "",
            "\1\6",
            "",
            "",
            "\1\3\1\5\1\uffff\1\4"
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
            return "614:1: rule__Statement__Alternatives : ( ( ruleSingleStatement ) | ( ruleSelfStatement ) | ( ruleMultiStatement ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PhraseAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_entryRulePhrase181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhrase188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Phrase__Alternatives_in_rulePhrase214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_ruleExpression274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_entryRuleEvaluationExpression300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationExpression307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleEvaluationExpression333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_entryRuleSingleStatement419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleStatement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__0_in_ruleSingleStatement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_entryRuleSelfStatement479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelfStatement486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__0_in_ruleSelfStatement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_entryRuleMultiStatement539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiStatement546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__0_in_ruleMultiStatement572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_entryRuleDashOperation779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDashOperation786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__0_in_ruleDashOperation812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_entryRulePointOperation839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointOperation846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__0_in_rulePointOperation872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_entryRulePowOperation899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePowOperation906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__0_in_rulePowOperation932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleUnaryExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Alternatives_in_ruleTerm1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_entryRuleDesignator1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDesignator1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Designator__ValueAssignment_in_ruleDesignator1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Phrase__Alternatives1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Phrase__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleStatement_in_rule__Statement__Alternatives1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelfStatement_in_rule__Statement__Alternatives1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiStatement_in_rule__Statement__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EqualityExpression__OpAlternatives_1_1_01323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EqualityExpression__OpAlternatives_1_1_01343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EqualityExpression__OpAlternatives_1_1_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqualityExpression__OpAlternatives_1_1_01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqualityExpression__OpAlternatives_1_1_01403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EqualityExpression__OpAlternatives_1_1_01423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DashOperation__OpAlternatives_1_1_01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DashOperation__OpAlternatives_1_1_01478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PointOperation__OpAlternatives_1_1_01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__PointOperation__OpAlternatives_1_1_01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__PrimaryExpression__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0_in_rule__PrimaryExpression__Alternatives1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__Term__Alternatives1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Alternatives1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0_in_rule__Term__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0_in_rule__Term__Alternatives1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01719 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1805 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__FQN__Group_1__0__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__0__Impl_in_rule__SingleStatement__Group__01962 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__1_in_rule__SingleStatement__Group__01965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__DesgnatorAssignment_0_in_rule__SingleStatement__Group__0__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__1__Impl_in_rule__SingleStatement__Group__12022 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__2_in_rule__SingleStatement__Group__12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SingleStatement__Group__1__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__Group__2__Impl_in_rule__SingleStatement__Group__22084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleStatement__ExpressionAssignment_2_in_rule__SingleStatement__Group__2__Impl2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__0__Impl_in_rule__SelfStatement__Group__02147 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__1_in_rule__SelfStatement__Group__02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SelfStatement__Group__0__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__1__Impl_in_rule__SelfStatement__Group__12209 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__2_in_rule__SelfStatement__Group__12212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SelfStatement__Group__1__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__Group__2__Impl_in_rule__SelfStatement__Group__22271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelfStatement__ExpressionAssignment_2_in_rule__SelfStatement__Group__2__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__0__Impl_in_rule__MultiStatement__Group__02334 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__1_in_rule__MultiStatement__Group__02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__DesgnatorAssignment_0_in_rule__MultiStatement__Group__0__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__1__Impl_in_rule__MultiStatement__Group__12394 = new BitSet(new long[]{0x000000000E0000F0L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__2_in_rule__MultiStatement__Group__12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MultiStatement__Group__1__Impl2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__2__Impl_in_rule__MultiStatement__Group__22456 = new BitSet(new long[]{0x000000000E0000F0L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__3_in_rule__MultiStatement__Group__22459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiStatement__ExpressionsAssignment_2_in_rule__MultiStatement__Group__2__Impl2486 = new BitSet(new long[]{0x000000000A0000F2L});
    public static final BitSet FOLLOW_rule__MultiStatement__Group__3__Impl_in_rule__MultiStatement__Group__32517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MultiStatement__Group__3__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__02584 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__02587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__Group__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl2670 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__02705 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__02708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__12766 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2_in_rule__OrExpression__Group_1__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__2__Impl_in_rule__OrExpression__Group_1__22826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__RightAssignment_1_2_in_rule__OrExpression__Group_1__2__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__02889 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__02892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__Group__0__Impl2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__12948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl2975 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__03010 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__13071 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2_in_rule__AndExpression__Group_1__13074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OpAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__2__Impl_in_rule__AndExpression__Group_1__23131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__RightAssignment_1_2_in_rule__AndExpression__Group_1__2__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__03194 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__03197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_rule__EqualityExpression__Group__0__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__13253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl3280 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__03315 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__03318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__13376 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__2_in_rule__EqualityExpression__Group_1__13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__2__Impl_in_rule__EqualityExpression__Group_1__23436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__RightAssignment_1_2_in_rule__EqualityExpression__Group_1__2__Impl3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__0__Impl_in_rule__DashOperation__Group__03499 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__1_in_rule__DashOperation__Group__03502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_rule__DashOperation__Group__0__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group__1__Impl_in_rule__DashOperation__Group__13558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__0_in_rule__DashOperation__Group__1__Impl3585 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__0__Impl_in_rule__DashOperation__Group_1__03620 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__1_in_rule__DashOperation__Group_1__03623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__1__Impl_in_rule__DashOperation__Group_1__13681 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__2_in_rule__DashOperation__Group_1__13684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__OpAssignment_1_1_in_rule__DashOperation__Group_1__1__Impl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__Group_1__2__Impl_in_rule__DashOperation__Group_1__23741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__RightAssignment_1_2_in_rule__DashOperation__Group_1__2__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__0__Impl_in_rule__PointOperation__Group__03804 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__1_in_rule__PointOperation__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rule__PointOperation__Group__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group__1__Impl_in_rule__PointOperation__Group__13863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__0_in_rule__PointOperation__Group__1__Impl3890 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__0__Impl_in_rule__PointOperation__Group_1__03925 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__1_in_rule__PointOperation__Group_1__03928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__1__Impl_in_rule__PointOperation__Group_1__13986 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__2_in_rule__PointOperation__Group_1__13989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__OpAssignment_1_1_in_rule__PointOperation__Group_1__1__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__Group_1__2__Impl_in_rule__PointOperation__Group_1__24046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__RightAssignment_1_2_in_rule__PointOperation__Group_1__2__Impl4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__0__Impl_in_rule__PowOperation__Group__04109 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__1_in_rule__PowOperation__Group__04112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PowOperation__Group__0__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group__1__Impl_in_rule__PowOperation__Group__14168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__0_in_rule__PowOperation__Group__1__Impl4195 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__0__Impl_in_rule__PowOperation__Group_1__04230 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__1_in_rule__PowOperation__Group_1__04233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__1__Impl_in_rule__PowOperation__Group_1__14291 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__2_in_rule__PowOperation__Group_1__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__OpAssignment_1_1_in_rule__PowOperation__Group_1__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__Group_1__2__Impl_in_rule__PowOperation__Group_1__24351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PowOperation__RightAssignment_1_2_in_rule__PowOperation__Group_1__2__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__04414 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__04417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrimaryExpression__Group_1__0__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__14476 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__14479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_1__1__Impl4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__24535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimaryExpression__Group_1__2__Impl4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__0__Impl_in_rule__PrimaryExpression__Group_2__04600 = new BitSet(new long[]{0x000000000A0000F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1_in_rule__PrimaryExpression__Group_2__04603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PrimaryExpression__Group_2__0__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__1__Impl_in_rule__PrimaryExpression__Group_2__14662 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2_in_rule__PrimaryExpression__Group_2__14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationExpression_in_rule__PrimaryExpression__Group_2__1__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_2__2__Impl_in_rule__PrimaryExpression__Group_2__24721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrimaryExpression__Group_2__2__Impl4749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04786 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_1_1_in_rule__Term__Group_1__1__Impl4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__0__Impl_in_rule__Term__Group_2__04908 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1_in_rule__Term__Group_2__04911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_2__1__Impl_in_rule__Term__Group_2__14969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_2_1_in_rule__Term__Group_2__1__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__0__Impl_in_rule__Term__Group_3__05030 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1_in_rule__Term__Group_3__05033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_3__1__Impl_in_rule__Term__Group_3__15091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ValueAssignment_3_1_in_rule__Term__Group_3__1__Impl5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhrase_in_rule__Model__PhraseAssignment5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__SingleStatement__DesgnatorAssignment_05188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SingleStatement__ExpressionAssignment_25219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SelfStatement__ExpressionAssignment_25250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDesignator_in_rule__MultiStatement__DesgnatorAssignment_05281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__MultiStatement__ExpressionsAssignment_25312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__OrExpression__OpAssignment_1_15348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__RightAssignment_1_25387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AndExpression__OpAssignment_1_15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__RightAssignment_1_25462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OpAlternatives_1_1_0_in_rule__EqualityExpression__OpAssignment_1_15493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDashOperation_in_rule__EqualityExpression__RightAssignment_1_25526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DashOperation__OpAlternatives_1_1_0_in_rule__DashOperation__OpAssignment_1_15557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointOperation_in_rule__DashOperation__RightAssignment_1_25590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PointOperation__OpAlternatives_1_1_0_in_rule__PointOperation__OpAssignment_1_15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePowOperation_in_rule__PointOperation__RightAssignment_1_25654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PowOperation__OpAssignment_1_15690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__PowOperation__RightAssignment_1_25729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Term__ValueAssignment_1_15760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Term__ValueAssignment_2_15791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Term__ValueAssignment_3_15822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Designator__ValueAssignment5857 = new BitSet(new long[]{0x0000000000000002L});

}