/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class MathIntLanguageUiModule extends AbstractMathIntLanguageUiModule {
	def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
		return ExpressionsEObjectHoverProvider
	}
}
