/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.mathIntLanguage.Division;
import dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp;
import dk.sdu.mmmi.mdsd.mathIntLanguage.MathIntLanguagePackage;
import dk.sdu.mmmi.mdsd.mathIntLanguage.Minus;
import dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply;
import dk.sdu.mmmi.mdsd.mathIntLanguage.Plus;
import dk.sdu.mmmi.mdsd.services.MathIntLanguageGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MathIntLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MathIntLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MathIntLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MathIntLanguagePackage.DIVISION:
				sequence_MultiplyOrDivision(context, (Division) semanticObject); 
				return; 
			case MathIntLanguagePackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case MathIntLanguagePackage.MINUS:
				sequence_PlusOrMinus(context, (Minus) semanticObject); 
				return; 
			case MathIntLanguagePackage.MULTIPLY:
				sequence_MultiplyOrDivision(context, (Multiply) semanticObject); 
				return; 
			case MathIntLanguagePackage.NUMBER:
				sequence_Number(context, (dk.sdu.mmmi.mdsd.mathIntLanguage.Number) semanticObject); 
				return; 
			case MathIntLanguagePackage.PLUS:
				sequence_PlusOrMinus(context, (Plus) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Division
	 *     PlusOrMinus returns Division
	 *     PlusOrMinus.Plus_1_0_0_1 returns Division
	 *     PlusOrMinus.Minus_1_0_1_1 returns Division
	 *     MultiplyOrDivision returns Division
	 *     MultiplyOrDivision.Multiply_1_0_0_1 returns Division
	 *     MultiplyOrDivision.Division_1_0_1_1 returns Division
	 *     Primary returns Division
	 *     Parenthesis returns Division
	 *
	 * Constraint:
	 *     (left=MultiplyOrDivision_Division_1_0_1_1 right=Primary)
	 */
	protected void sequence_MultiplyOrDivision(ISerializationContext context, Division semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.DIVISION__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.DIVISION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyOrDivisionAccess().getDivisionLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyOrDivisionAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Multiply
	 *     PlusOrMinus returns Multiply
	 *     PlusOrMinus.Plus_1_0_0_1 returns Multiply
	 *     PlusOrMinus.Minus_1_0_1_1 returns Multiply
	 *     MultiplyOrDivision returns Multiply
	 *     MultiplyOrDivision.Multiply_1_0_0_1 returns Multiply
	 *     MultiplyOrDivision.Division_1_0_1_1 returns Multiply
	 *     Primary returns Multiply
	 *     Parenthesis returns Multiply
	 *
	 * Constraint:
	 *     (left=MultiplyOrDivision_Multiply_1_0_0_1 right=Primary)
	 */
	protected void sequence_MultiplyOrDivision(ISerializationContext context, Multiply semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.MULTIPLY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.MULTIPLY__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.MULTIPLY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.MULTIPLY__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplyOrDivisionAccess().getMultiplyLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplyOrDivisionAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Number
	 *     PlusOrMinus returns Number
	 *     PlusOrMinus.Plus_1_0_0_1 returns Number
	 *     PlusOrMinus.Minus_1_0_1_1 returns Number
	 *     MultiplyOrDivision returns Number
	 *     MultiplyOrDivision.Multiply_1_0_0_1 returns Number
	 *     MultiplyOrDivision.Division_1_0_1_1 returns Number
	 *     Primary returns Number
	 *     Parenthesis returns Number
	 *     Number returns Number
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, dk.sdu.mmmi.mdsd.mathIntLanguage.Number semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.NUMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     PlusOrMinus returns Minus
	 *     PlusOrMinus.Plus_1_0_0_1 returns Minus
	 *     PlusOrMinus.Minus_1_0_1_1 returns Minus
	 *     MultiplyOrDivision returns Minus
	 *     MultiplyOrDivision.Multiply_1_0_0_1 returns Minus
	 *     MultiplyOrDivision.Division_1_0_1_1 returns Minus
	 *     Primary returns Minus
	 *     Parenthesis returns Minus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_1 right=MultiplyOrDivision)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivisionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     PlusOrMinus returns Plus
	 *     PlusOrMinus.Plus_1_0_0_1 returns Plus
	 *     PlusOrMinus.Minus_1_0_1_1 returns Plus
	 *     MultiplyOrDivision returns Plus
	 *     MultiplyOrDivision.Multiply_1_0_0_1 returns Plus
	 *     MultiplyOrDivision.Division_1_0_1_1 returns Plus
	 *     Primary returns Plus
	 *     Parenthesis returns Plus
	 *
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_1 right=MultiplyOrDivision)
	 */
	protected void sequence_PlusOrMinus(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, MathIntLanguagePackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MathIntLanguagePackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPlusOrMinusAccess().getRightMultiplyOrDivisionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}
