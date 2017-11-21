/**
 */
package tmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tmodel.TmodelPackage
 * @generated
 */
public interface TmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TmodelFactory eINSTANCE = tmodel.impl.TmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Runner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runner</em>'.
	 * @generated
	 */
	Runner createRunner();

	/**
	 * Returns a new object of class '<em>Load Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Meta Model</em>'.
	 * @generated
	 */
	LoadMetaModel createLoadMetaModel();

	/**
	 * Returns a new object of class '<em>Load Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load Model</em>'.
	 * @generated
	 */
	LoadModel createLoadModel();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update</em>'.
	 * @generated
	 */
	Update createUpdate();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>MElement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MElement</em>'.
	 * @generated
	 */
	MElement createMElement();

	/**
	 * Returns a new object of class '<em>MAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAttribute</em>'.
	 * @generated
	 */
	MAttribute createMAttribute();

	/**
	 * Returns a new object of class '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where Clause</em>'.
	 * @generated
	 */
	WhereClause createWhereClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TmodelPackage getTmodelPackage();

} //TmodelFactory
