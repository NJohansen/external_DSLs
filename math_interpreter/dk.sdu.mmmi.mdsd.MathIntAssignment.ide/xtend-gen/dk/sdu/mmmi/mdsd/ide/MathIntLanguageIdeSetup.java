/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mmmi.mdsd.MathIntLanguageRuntimeModule;
import dk.sdu.mmmi.mdsd.MathIntLanguageStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MathIntLanguageIdeSetup extends MathIntLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    MathIntLanguageRuntimeModule _mathIntLanguageRuntimeModule = new MathIntLanguageRuntimeModule();
    MathIntLanguageIdeModule _mathIntLanguageIdeModule = new MathIntLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_mathIntLanguageRuntimeModule, _mathIntLanguageIdeModule));
  }
}
