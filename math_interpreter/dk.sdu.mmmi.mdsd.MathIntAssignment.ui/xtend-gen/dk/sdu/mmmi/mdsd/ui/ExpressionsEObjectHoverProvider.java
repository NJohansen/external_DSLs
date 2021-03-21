package dk.sdu.mmmi.mdsd.ui;

import dk.sdu.mmmi.mdsd.generator.MathIntLanguageGenerator;
import dk.sdu.mmmi.mdsd.mathIntLanguage.Expression;
import dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

/**
 * Class for hovering effect in Eclipse IDE
 */
@SuppressWarnings("all")
public class ExpressionsEObjectHoverProvider extends DefaultEObjectHoverProvider {
  @Override
  public String getHoverInfoAsHtml(final EObject o) {
    if (((o instanceof MathExp) && this.programHasNoError(o))) {
      final MathExp exp = ((MathExp) o);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<p>");
      _builder.newLine();
      _builder.append("value : <b>");
      int _staticCompute = MathIntLanguageGenerator.staticCompute(exp);
      _builder.append(_staticCompute);
      _builder.append("</b>");
      _builder.newLineIfNotEmpty();
      _builder.append("</p>");
      _builder.newLine();
      return _builder.toString();
    } else {
      if (((o instanceof Expression) && this.programHasNoError(o))) {
        final Expression exp_1 = ((Expression) o);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<p>");
        _builder_1.newLine();
        _builder_1.append("value : <b>");
        int _staticComputeExp = MathIntLanguageGenerator.staticComputeExp(exp_1);
        _builder_1.append(_staticComputeExp);
        _builder_1.append("</b>");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("</p>");
        _builder_1.newLine();
        return _builder_1.toString();
      } else {
        return super.getHoverInfoAsHtml(o);
      }
    }
  }
  
  public boolean programHasNoError(final EObject o) {
    return Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(o)).getChildren().isEmpty();
  }
}
