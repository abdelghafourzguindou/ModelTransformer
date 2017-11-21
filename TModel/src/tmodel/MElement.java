/**
 */
package tmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MElement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tmodel.MElement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see tmodel.TmodelPackage#getMElement()
 * @model
 * @generated
 */
public interface MElement extends NamedElement {
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
	 * @see tmodel.TmodelPackage#getMElement_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MAttribute> getAttributes();

} // MElement
