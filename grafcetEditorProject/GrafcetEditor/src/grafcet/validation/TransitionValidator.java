/**
 *
 * $Id$
 */
package grafcet.validation;

import grafcet.Step;

/**
 * A sample validator interface for {@link grafcet.Transition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TransitionValidator {
	boolean validate();

	boolean validateCondition(String value);
	boolean validateIncomingConnections(Step value);
	boolean validateOutgoingConnections(Step value);
}
