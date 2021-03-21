package dk.sdu.mmmi.mdsd.ui

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider

import static extension dk.sdu.mmmi.mdsd.generator.MathIntLanguageGenerator.staticComputeExp
import static extension dk.sdu.mmmi.mdsd.generator.MathIntLanguageGenerator.staticCompute
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import dk.sdu.mmmi.mdsd.mathIntLanguage.Expression
import dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp

/*
 * Class for hovering effect in Eclipse IDE 
 */
class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {

	override getHoverInfoAsHtml(EObject o) {
		 if (o instanceof MathExp && o.programHasNoError) { //Used to compute the result value for the whole expression
			val exp = o as MathExp
			return '''
				<p>
				value : <b>«staticCompute(exp)»</b>
				</p>
			'''
		} else if (o instanceof Expression && o.programHasNoError) { //Used to show each value while hovering over it.
			val exp = o as Expression
			return '''
				<p>
				value : <b>«staticComputeExp(exp)»</b>
				</p>
			'''
		} else
			return super.getHoverInfoAsHtml(o)
	}

	def programHasNoError(EObject o) {
		Diagnostician.INSTANCE.validate(o.rootContainer).children.empty
	}
}