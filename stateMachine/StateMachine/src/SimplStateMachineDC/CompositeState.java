/**
 */
package SimplStateMachineDC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimplStateMachineDC.CompositeState#getStates <em>States</em>}</li>
 *   <li>{@link SimplStateMachineDC.CompositeState#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getCompositeState()
 * @model
 * @generated
 */
public interface CompositeState extends State {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link SimplStateMachineDC.State}.
	 * It is bidirectional and its opposite is '{@link SimplStateMachineDC.State#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getCompositeState_States()
	 * @see SimplStateMachineDC.State#getContainer
	 * @model opposite="container" containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(InitialState)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getCompositeState_InitialState()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialState();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.CompositeState#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialState value);

} // CompositeState
