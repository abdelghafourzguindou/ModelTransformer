/**
 */
package tmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmodel.Operation#getCibleElement <em>Cible Element</em>}</li>
 *   <li>{@link tmodel.Operation#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tmodel.Operation#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @see tmodel.TmodelPackage#getOperation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Cible Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible Element</em>' attribute.
	 * @see #setCibleElement(String)
	 * @see tmodel.TmodelPackage#getOperation_CibleElement()
	 * @model
	 * @generated
	 */
	String getCibleElement();

	/**
	 * Sets the value of the '{@link tmodel.Operation#getCibleElement <em>Cible Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible Element</em>' attribute.
	 * @see #getCibleElement()
	 * @generated
	 */
	void setCibleElement(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link tmodel.MAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see tmodel.TmodelPackage#getOperation_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' containment reference.
	 * @see #setWhereClause(WhereClause)
	 * @see tmodel.TmodelPackage#getOperation_WhereClause()
	 * @model containment="true"
	 * @generated
	 */
	WhereClause getWhereClause();

	/**
	 * Sets the value of the '{@link tmodel.Operation#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' containment reference.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(WhereClause value);

} // Operation
