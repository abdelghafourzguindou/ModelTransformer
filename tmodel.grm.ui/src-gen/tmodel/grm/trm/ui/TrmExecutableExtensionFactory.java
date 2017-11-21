/*
 * generated by Xtext 2.12.0
 */
package tmodel.grm.trm.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import tmodel.grm.ui.internal.GrmActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TrmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return GrmActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return GrmActivator.getInstance().getInjector(GrmActivator.TMODEL_GRM_TRM_TRM);
	}
	
}