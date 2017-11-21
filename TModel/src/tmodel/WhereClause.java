/**
 */
package tmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmodel.WhereClause#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see tmodel.TmodelPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link tmodel.MAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see tmodel.TmodelPackage#getWhereClause_Conditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MAttribute> getConditions();

} // WhereClause
