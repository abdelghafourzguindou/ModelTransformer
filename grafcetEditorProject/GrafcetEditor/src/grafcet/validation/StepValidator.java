/**
 *
 * $Id$
 */
package grafcet.validation;

import grafcet.Step;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link grafcet.Step}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StepValidator {
	boolean validate();

	boolean validateIsInitial(boolean value);
	boolean validateIsActive(boolean value);
	boolean validateAction(String value);
	boolean validateIncomingConnections(EList<Step> value);
	boolean validateOutgoingConnections(EList<Step> value);
}
