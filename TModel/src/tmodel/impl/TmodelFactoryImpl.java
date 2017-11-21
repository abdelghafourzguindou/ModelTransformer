/**
 */
package tmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TmodelFactoryImpl extends EFactoryImpl implements TmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TmodelFactory init() {
		try {
			TmodelFactory theTmodelFactory = (TmodelFactory)EPackage.Registry.INSTANCE.getEFactory(TmodelPackage.eNS_URI);
			if (theTmodelFactory != null) {
				return theTmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TmodelPackage.RUNNER: return createRunner();
			case TmodelPackage.LOAD_META_MODEL: return createLoadMetaModel();
			case TmodelPackage.LOAD_MODEL: return createLoadModel();
			case TmodelPackage.ADD: return createAdd();
			case TmodelPackage.UPDATE: return createUpdate();
			case TmodelPackage.DELETE: return createDelete();
			case TmodelPackage.MELEMENT: return createMElement();
			case TmodelPackage.MATTRIBUTE: return createMAttribute();
			case TmodelPackage.WHERE_CLAUSE: return createWhereClause();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runner createRunner() {
		RunnerImpl runner = new RunnerImpl();
		return runner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMetaModel createLoadMetaModel() {
		LoadMetaModelImpl loadMetaModel = new LoadMetaModelImpl();
		return loadMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModel createLoadModel() {
		LoadModelImpl loadModel = new LoadModelImpl();
		return loadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MElement createMElement() {
		MElementImpl mElement = new MElementImpl();
		return mElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAttribute createMAttribute() {
		MAttributeImpl mAttribute = new MAttributeImpl();
		return mAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClause createWhereClause() {
		WhereClauseImpl whereClause = new WhereClauseImpl();
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmodelPackage getTmodelPackage() {
		return (TmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TmodelPackage getPackage() {
		return TmodelPackage.eINSTANCE;
	}

} //TmodelFactoryImpl
