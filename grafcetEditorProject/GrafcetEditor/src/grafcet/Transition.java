/**
 */
package grafcet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grafcet.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link grafcet.Transition#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link grafcet.Transition#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see grafcet.GrafcetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Element {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see grafcet.GrafcetPackage#getTransition_Condition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Connections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference.
	 * @see #setIncomingConnections(Step)
	 * @see grafcet.GrafcetPackage#getTransition_IncomingConnections()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Step getIncomingConnections();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getIncomingConnections <em>Incoming Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Connections</em>' reference.
	 * @see #getIncomingConnections()
	 * @generated
	 */
	void setIncomingConnections(Step value);

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Connections</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference.
	 * @see #setOutgoingConnections(Step)
	 * @see grafcet.GrafcetPackage#getTransition_OutgoingConnections()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Step getOutgoingConnections();

	/**
	 * Sets the value of the '{@link grafcet.Transition#getOutgoingConnections <em>Outgoing Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Connections</em>' reference.
	 * @see #getOutgoingConnections()
	 * @generated
	 */
	void setOutgoingConnections(Step value);

} // Transition
