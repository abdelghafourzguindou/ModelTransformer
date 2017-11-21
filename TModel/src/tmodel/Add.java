/**
 */
package tmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmodel.Add#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see tmodel.TmodelPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Operation {
	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(String)
	 * @see tmodel.TmodelPackage#getAdd_In()
	 * @model
	 * @generated
	 */
	String getIn();

	/**
	 * Sets the value of the '{@link tmodel.Add#getIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(String value);

} // Add
