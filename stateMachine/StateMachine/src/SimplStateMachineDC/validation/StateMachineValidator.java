/**
 *
 * $Id$
 */
package SimplStateMachineDC.validation;

import SimplStateMachineDC.State;
import SimplStateMachineDC.Transition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SimplStateMachineDC.StateMachine}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StateMachineValidator {
	boolean validate();

	boolean validateTransitions(EList<Transition> value);
	boolean validateStates(EList<State> value);
}
