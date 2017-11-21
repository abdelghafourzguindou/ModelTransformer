/**
 */
package tmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tmodel.TmodelFactory
 * @model kind="package"
 * @generated
 */
public interface TmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://transformermodel.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TmodelPackage eINSTANCE = tmodel.impl.TmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link tmodel.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.RunnerImpl
	 * @see tmodel.impl.TmodelPackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 0;

	/**
	 * The feature id for the '<em><b>Loader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__LOADER = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__OPERATIONS = 1;

	/**
	 * The number of structural features of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmodel.Loader <em>Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.Loader
	 * @see tmodel.impl.TmodelPackageImpl#getLoader()
	 * @generated
	 */
	int LOADER = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER__URL = 0;

	/**
	 * The number of structural features of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.LoadMetaModelImpl <em>Load Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.LoadMetaModelImpl
	 * @see tmodel.impl.TmodelPackageImpl#getLoadMetaModel()
	 * @generated
	 */
	int LOAD_META_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_META_MODEL__URL = LOADER__URL;

	/**
	 * The number of structural features of the '<em>Load Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_META_MODEL_FEATURE_COUNT = LOADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_META_MODEL_OPERATION_COUNT = LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.LoadModelImpl <em>Load Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.LoadModelImpl
	 * @see tmodel.impl.TmodelPackageImpl#getLoadModel()
	 * @generated
	 */
	int LOAD_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL__URL = LOADER__URL;

	/**
	 * The number of structural features of the '<em>Load Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL_FEATURE_COUNT = LOADER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_MODEL_OPERATION_COUNT = LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.NamedElement
	 * @see tmodel.impl.TmodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmodel.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.Operation
	 * @see tmodel.impl.TmodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Cible Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CIBLE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__WHERE_CLAUSE = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.AddImpl
	 * @see tmodel.impl.TmodelPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 6;

	/**
	 * The feature id for the '<em><b>Cible Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CIBLE_ELEMENT = OPERATION__CIBLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__ATTRIBUTES = OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__WHERE_CLAUSE = OPERATION__WHERE_CLAUSE;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__IN = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.UpdateImpl
	 * @see tmodel.impl.TmodelPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 7;

	/**
	 * The feature id for the '<em><b>Cible Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__CIBLE_ELEMENT = OPERATION__CIBLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__ATTRIBUTES = OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__WHERE_CLAUSE = OPERATION__WHERE_CLAUSE;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.DeleteImpl
	 * @see tmodel.impl.TmodelPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 8;

	/**
	 * The feature id for the '<em><b>Cible Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__CIBLE_ELEMENT = OPERATION__CIBLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__ATTRIBUTES = OPERATION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__WHERE_CLAUSE = OPERATION__WHERE_CLAUSE;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.MElementImpl <em>MElement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.MElementImpl
	 * @see tmodel.impl.TmodelPackageImpl#getMElement()
	 * @generated
	 */
	int MELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELEMENT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MElement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.MAttributeImpl <em>MAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.MAttributeImpl
	 * @see tmodel.impl.TmodelPackageImpl#getMAttribute()
	 * @generated
	 */
	int MATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>MAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tmodel.impl.WhereClauseImpl <em>Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tmodel.impl.WhereClauseImpl
	 * @see tmodel.impl.TmodelPackageImpl#getWhereClause()
	 * @generated
	 */
	int WHERE_CLAUSE = 11;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__CONDITIONS = 0;

	/**
	 * The number of structural features of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tmodel.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see tmodel.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for the containment reference list '{@link tmodel.Runner#getLoader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loader</em>'.
	 * @see tmodel.Runner#getLoader()
	 * @see #getRunner()
	 * @generated
	 */
	EReference getRunner_Loader();

	/**
	 * Returns the meta object for the containment reference list '{@link tmodel.Runner#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see tmodel.Runner#getOperations()
	 * @see #getRunner()
	 * @generated
	 */
	EReference getRunner_Operations();

	/**
	 * Returns the meta object for class '{@link tmodel.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loader</em>'.
	 * @see tmodel.Loader
	 * @generated
	 */
	EClass getLoader();

	/**
	 * Returns the meta object for the attribute '{@link tmodel.Loader#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see tmodel.Loader#getUrl()
	 * @see #getLoader()
	 * @generated
	 */
	EAttribute getLoader_Url();

	/**
	 * Returns the meta object for class '{@link tmodel.LoadMetaModel <em>Load Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Meta Model</em>'.
	 * @see tmodel.LoadMetaModel
	 * @generated
	 */
	EClass getLoadMetaModel();

	/**
	 * Returns the meta object for class '{@link tmodel.LoadModel <em>Load Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Model</em>'.
	 * @see tmodel.LoadModel
	 * @generated
	 */
	EClass getLoadModel();

	/**
	 * Returns the meta object for class '{@link tmodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see tmodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link tmodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tmodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link tmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see tmodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link tmodel.Operation#getCibleElement <em>Cible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cible Element</em>'.
	 * @see tmodel.Operation#getCibleElement()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_CibleElement();

	/**
	 * Returns the meta object for the containment reference list '{@link tmodel.Operation#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see tmodel.Operation#getAttributes()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link tmodel.Operation#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Clause</em>'.
	 * @see tmodel.Operation#getWhereClause()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_WhereClause();

	/**
	 * Returns the meta object for class '{@link tmodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see tmodel.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the attribute '{@link tmodel.Add#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see tmodel.Add#getIn()
	 * @see #getAdd()
	 * @generated
	 */
	EAttribute getAdd_In();

	/**
	 * Returns the meta object for class '{@link tmodel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see tmodel.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link tmodel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see tmodel.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link tmodel.MElement <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MElement</em>'.
	 * @see tmodel.MElement
	 * @generated
	 */
	EClass getMElement();

	/**
	 * Returns the meta object for the containment reference list '{@link tmodel.MElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see tmodel.MElement#getAttributes()
	 * @see #getMElement()
	 * @generated
	 */
	EReference getMElement_Attributes();

	/**
	 * Returns the meta object for class '{@link tmodel.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MAttribute</em>'.
	 * @see tmodel.MAttribute
	 * @generated
	 */
	EClass getMAttribute();

	/**
	 * Returns the meta object for the attribute '{@link tmodel.MAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tmodel.MAttribute#getValue()
	 * @see #getMAttribute()
	 * @generated
	 */
	EAttribute getMAttribute_Value();

	/**
	 * Returns the meta object for class '{@link tmodel.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Clause</em>'.
	 * @see tmodel.WhereClause
	 * @generated
	 */
	EClass getWhereClause();

	/**
	 * Returns the meta object for the containment reference list '{@link tmodel.WhereClause#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see tmodel.WhereClause#getConditions()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Conditions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TmodelFactory getTmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tmodel.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.RunnerImpl
		 * @see tmodel.impl.TmodelPackageImpl#getRunner()
		 * @generated
		 */
		EClass RUNNER = eINSTANCE.getRunner();

		/**
		 * The meta object literal for the '<em><b>Loader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNER__LOADER = eINSTANCE.getRunner_Loader();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNER__OPERATIONS = eINSTANCE.getRunner_Operations();

		/**
		 * The meta object literal for the '{@link tmodel.Loader <em>Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.Loader
		 * @see tmodel.impl.TmodelPackageImpl#getLoader()
		 * @generated
		 */
		EClass LOADER = eINSTANCE.getLoader();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADER__URL = eINSTANCE.getLoader_Url();

		/**
		 * The meta object literal for the '{@link tmodel.impl.LoadMetaModelImpl <em>Load Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.LoadMetaModelImpl
		 * @see tmodel.impl.TmodelPackageImpl#getLoadMetaModel()
		 * @generated
		 */
		EClass LOAD_META_MODEL = eINSTANCE.getLoadMetaModel();

		/**
		 * The meta object literal for the '{@link tmodel.impl.LoadModelImpl <em>Load Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.LoadModelImpl
		 * @see tmodel.impl.TmodelPackageImpl#getLoadModel()
		 * @generated
		 */
		EClass LOAD_MODEL = eINSTANCE.getLoadModel();

		/**
		 * The meta object literal for the '{@link tmodel.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.NamedElement
		 * @see tmodel.impl.TmodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link tmodel.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.Operation
		 * @see tmodel.impl.TmodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Cible Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__CIBLE_ELEMENT = eINSTANCE.getOperation_CibleElement();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ATTRIBUTES = eINSTANCE.getOperation_Attributes();

		/**
		 * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__WHERE_CLAUSE = eINSTANCE.getOperation_WhereClause();

		/**
		 * The meta object literal for the '{@link tmodel.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.AddImpl
		 * @see tmodel.impl.TmodelPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD__IN = eINSTANCE.getAdd_In();

		/**
		 * The meta object literal for the '{@link tmodel.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.UpdateImpl
		 * @see tmodel.impl.TmodelPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link tmodel.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.DeleteImpl
		 * @see tmodel.impl.TmodelPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link tmodel.impl.MElementImpl <em>MElement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.MElementImpl
		 * @see tmodel.impl.TmodelPackageImpl#getMElement()
		 * @generated
		 */
		EClass MELEMENT = eINSTANCE.getMElement();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MELEMENT__ATTRIBUTES = eINSTANCE.getMElement_Attributes();

		/**
		 * The meta object literal for the '{@link tmodel.impl.MAttributeImpl <em>MAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.MAttributeImpl
		 * @see tmodel.impl.TmodelPackageImpl#getMAttribute()
		 * @generated
		 */
		EClass MATTRIBUTE = eINSTANCE.getMAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATTRIBUTE__VALUE = eINSTANCE.getMAttribute_Value();

		/**
		 * The meta object literal for the '{@link tmodel.impl.WhereClauseImpl <em>Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tmodel.impl.WhereClauseImpl
		 * @see tmodel.impl.TmodelPackageImpl#getWhereClause()
		 * @generated
		 */
		EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_CLAUSE__CONDITIONS = eINSTANCE.getWhereClause_Conditions();

	}

} //TmodelPackage
