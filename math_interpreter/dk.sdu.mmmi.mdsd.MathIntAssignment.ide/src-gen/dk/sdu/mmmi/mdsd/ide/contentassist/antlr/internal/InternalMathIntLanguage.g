/*
 * generated by Xtext 2.25.0
 */
grammar InternalMathIntLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.MathIntLanguageGrammarAccess;

}
@parser::members {
	private MathIntLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(MathIntLanguageGrammarAccess grammarAccess) {
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
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall()); }
		rulePlusOrMinus
		{ after(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus
:
{ before(grammarAccess.getPlusOrMinusRule()); }
	 rulePlusOrMinus
{ after(grammarAccess.getPlusOrMinusRule()); } 
	 EOF 
;

// Rule PlusOrMinus
rulePlusOrMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup()); }
		(rule__PlusOrMinus__Group__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplyOrDivision
entryRuleMultiplyOrDivision
:
{ before(grammarAccess.getMultiplyOrDivisionRule()); }
	 ruleMultiplyOrDivision
{ after(grammarAccess.getMultiplyOrDivisionRule()); } 
	 EOF 
;

// Rule MultiplyOrDivision
ruleMultiplyOrDivision 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplyOrDivisionAccess().getGroup()); }
		(rule__MultiplyOrDivision__Group__0)
		{ after(grammarAccess.getMultiplyOrDivisionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesis
entryRuleParenthesis
:
{ before(grammarAccess.getParenthesisRule()); }
	 ruleParenthesis
{ after(grammarAccess.getParenthesisRule()); } 
	 EOF 
;

// Rule Parenthesis
ruleParenthesis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup()); }
		(rule__Parenthesis__Group__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumber
entryRuleNumber
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberAccess().getGroup()); }
		(rule__Number__Group__0)
		{ after(grammarAccess.getNumberAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
		(rule__PlusOrMinus__Group_1_0_0__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
		(rule__PlusOrMinus__Group_1_0_1__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1_0_0()); }
		(rule__MultiplyOrDivision__Group_1_0_0__0)
		{ after(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1_0_1()); }
		(rule__MultiplyOrDivision__Group_1_0_1__0)
		{ after(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
		ruleNumber
		{ after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
		ruleParenthesis
		{ after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getResultKeyword_0()); }
	'result'
	{ after(grammarAccess.getMathExpAccess().getResultKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getIsKeyword_1()); }
	'is'
	{ after(grammarAccess.getMathExpAccess().getIsKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
	(rule__MathExp__ExpAssignment_2)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__0__Impl
	rule__PlusOrMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMultiplyOrDivisionParserRuleCall_0()); }
	ruleMultiplyOrDivision
	{ after(grammarAccess.getPlusOrMinusAccess().getMultiplyOrDivisionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
	(rule__PlusOrMinus__Group_1__0)*
	{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__0__Impl
	rule__PlusOrMinus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
	(rule__PlusOrMinus__Alternatives_1_0)
	{ after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
	(rule__PlusOrMinus__RightAssignment_1_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__0__Impl
	rule__PlusOrMinus__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_0()); }
	'+'
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_1()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__0__Impl
	rule__PlusOrMinus__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_0()); }
	'-'
	{ after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_1()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplyOrDivision__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group__0__Impl
	rule__MultiplyOrDivision__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1()); }
	(rule__MultiplyOrDivision__Group_1__0)*
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplyOrDivision__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1__0__Impl
	rule__MultiplyOrDivision__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getAlternatives_1_0()); }
	(rule__MultiplyOrDivision__Alternatives_1_0)
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getRightAssignment_1_1()); }
	(rule__MultiplyOrDivision__RightAssignment_1_1)
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplyOrDivision__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1_0_0__0__Impl
	rule__MultiplyOrDivision__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getAsteriskKeyword_1_0_0_0()); }
	'*'
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getAsteriskKeyword_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getMultiplyLeftAction_1_0_0_1()); }
	()
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getMultiplyLeftAction_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiplyOrDivision__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1_0_1__0__Impl
	rule__MultiplyOrDivision__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getSolidusKeyword_1_0_1_0()); }
	'/'
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getSolidusKeyword_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiplyOrDivision__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplyOrDivisionAccess().getDivisionLeftAction_1_0_1_1()); }
	()
	{ after(grammarAccess.getMultiplyOrDivisionAccess().getDivisionLeftAction_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parenthesis__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__0__Impl
	rule__Parenthesis__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__1__Impl
	rule__Parenthesis__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); }
	ruleExp
	{ after(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Number__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Number__Group__0__Impl
	rule__Number__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumberAccess().getNumberAction_0()); }
	()
	{ after(grammarAccess.getNumberAccess().getNumberAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Number__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNumberAccess().getValueAssignment_1()); }
	(rule__Number__ValueAssignment_1)
	{ after(grammarAccess.getNumberAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivisionParserRuleCall_1_1_0()); }
		ruleMultiplyOrDivision
		{ after(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivisionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiplyOrDivision__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplyOrDivisionAccess().getRightPrimaryParserRuleCall_1_1_0()); }
		rulePrimary
		{ after(grammarAccess.getMultiplyOrDivisionAccess().getRightPrimaryParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
