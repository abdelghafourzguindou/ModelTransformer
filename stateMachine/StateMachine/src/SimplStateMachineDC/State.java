/**
 */
package SimplStateMachineDC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SimplStateMachineDC.State#getName <em>Name</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#getContainer <em>Container</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#getOrd <em>Ord</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#getInh <em>Inh</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#getOrdIf <em>Ord If</em>}</li>
 *   <li>{@link SimplStateMachineDC.State#getInhIf <em>Inh If</em>}</li>
 * </ul>
 *
 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link SimplStateMachineDC.CompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' container reference.
	 * @see #setContainer(CompositeState)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_Container()
	 * @see SimplStateMachineDC.CompositeState#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	CompositeState getContainer();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getContainer <em>Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' container reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(CompositeState value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_IsActive()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Ord</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ord</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord</em>' attribute.
	 * @see #setOrd(String)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_Ord()
	 * @model
	 * @generated
	 */
	String getOrd();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getOrd <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord</em>' attribute.
	 * @see #getOrd()
	 * @generated
	 */
	void setOrd(String value);

	/**
	 * Returns the value of the '<em><b>Inh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inh</em>' attribute.
	 * @see #setInh(String)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_Inh()
	 * @model
	 * @generated
	 */
	String getInh();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getInh <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inh</em>' attribute.
	 * @see #getInh()
	 * @generated
	 */
	void setInh(String value);

	/**
	 * Returns the value of the '<em><b>Ord If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ord If</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ord If</em>' attribute.
	 * @see #setOrdIf(String)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_OrdIf()
	 * @model
	 * @generated
	 */
	String getOrdIf();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getOrdIf <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ord If</em>' attribute.
	 * @see #getOrdIf()
	 * @generated
	 */
	void setOrdIf(String value);

	/**
	 * Returns the value of the '<em><b>Inh If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inh If</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inh If</em>' attribute.
	 * @see #setInhIf(String)
	 * @see SimplStateMachineDC.SimplStateMachineDCPackage#getState_InhIf()
	 * @model
	 * @generated
	 */
	String getInhIf();

	/**
	 * Sets the value of the '{@link SimplStateMachineDC.State#getInhIf <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inh If</em>' attribute.
	 * @see #getInhIf()
	 * @generated
	 */
	void setInhIf(String value);

} // State
