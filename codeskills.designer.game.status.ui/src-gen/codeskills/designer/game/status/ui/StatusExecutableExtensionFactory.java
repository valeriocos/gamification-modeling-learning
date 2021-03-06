/*
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.status.ui;

import codeskills.designer.game.status.ui.internal.StatusActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class StatusExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return StatusActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return StatusActivator.getInstance().getInjector(StatusActivator.CODESKILLS_DESIGNER_GAME_STATUS_STATUS);
	}
	
}
