/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.tests

import com.google.inject.Inject
import dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import static extension dk.sdu.mmmi.mdsd.generator.MathIntLanguageGenerator.staticCompute

@ExtendWith(InjectionExtension)
@InjectWith(MathIntLanguageInjectorProvider)
class MathIntLanguageParsingTest {
	@Inject
	ParseHelper<MathExp> parseHelper
	
	@Test
	def void T01_dummy() {
		Assertions.assertTrue(true)
	}

	@Test
	def void T01_loadModel() {
		val result = parseHelper.parse('''result is 87''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}

	@Test
	def void T02_addition() {
		val result = parseHelper.parse('''result is 80+7''')
		Assertions.assertTrue(result.staticCompute==87)
	}

	@Test
	def void T02_addsub() {
		val result = parseHelper.parse('''result is 100-20+10-3''')
		Assertions.assertTrue(result.staticCompute==87)
	}
	
	@Test
	def void T02_muldiv() {
		val result = parseHelper.parse('''result is 100*20/10*3''')
		Assertions.assertTrue(result.staticCompute==600)
	}

	@Test
	def void T02_parens() {
		val result = parseHelper.parse('''result is (10+3)*7-4''')
		Assertions.assertTrue(result.staticCompute==87)
	}
	
	@Test
	def void T03_precedence() {
		val result = parseHelper.parse('''result is 10+3*4-12/3+3''')
		Assertions.assertTrue(result.staticCompute==21)
	}
	
	@Test
	def void T03_left_assoc_minus() {
		val result = parseHelper.parse('''result is 10-5-2''')
		Assertions.assertTrue(result.staticCompute==3)
	}

	@Test
	def void T03_left_assoc_div() {
		val result = parseHelper.parse('''result is 10/5/2''')
		Assertions.assertTrue(result.staticCompute==1)
	}

	@Test
	def void T04_let() {
		val result = parseHelper.parse('''result is let x=10*8 in x+7 end''')
		Assertions.assertTrue(result.staticCompute==87)
	}

	@Test
	def void T04_nested_let_other_var() {
		val result = parseHelper.parse('''result is let x=2 in let y=3 in x*y end + x end + 79''')
		Assertions.assertTrue(result.staticCompute==87)
	}

	@Test
	def void T04_nested_let_same_var() {
		val result = parseHelper.parse('''result is let x=2 in let x=3 in x*x end + x end + 76''')
		Assertions.assertTrue(result.staticCompute==87)
	}


}