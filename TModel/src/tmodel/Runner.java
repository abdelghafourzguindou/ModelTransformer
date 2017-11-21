/**
 */
package tmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmodel.Runner#getLoader <em>Loader</em>}</li>
 *   <li>{@link tmodel.Runner#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see tmodel.TmodelPackage#getRunner()
 * @model
 * @generated
 */
public interface Runner extends EObject {
	/**
	 * Returns the value of the '<em><b>Loader</b></em>' containment reference list.
	 * The list contents are of type {@link tmodel.Loader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loader</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loader</em>' containment reference list.
	 * @see tmodel.TmodelPackage#getRunner_Loader()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Loader> getLoader();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link tmodel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see tmodel.TmodelPackage#getRunner_Operations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Runner
