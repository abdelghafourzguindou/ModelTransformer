/**
 */
package tmodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tmodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tmodel.TmodelPackage
 * @generated
 */
public class TmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TmodelSwitch<Adapter> modelSwitch =
		new TmodelSwitch<Adapter>() {
			@Override
			public Adapter caseRunner(Runner object) {
				return createRunnerAdapter();
			}
			@Override
			public Adapter caseLoader(Loader object) {
				return createLoaderAdapter();
			}
			@Override
			public Adapter caseLoadMetaModel(LoadMetaModel object) {
				return createLoadMetaModelAdapter();
			}
			@Override
			public Adapter caseLoadModel(LoadModel object) {
				return createLoadModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseAdd(Add object) {
				return createAddAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseMElement(MElement object) {
				return createMElementAdapter();
			}
			@Override
			public Adapter caseMAttribute(MAttribute object) {
				return createMAttributeAdapter();
			}
			@Override
			public Adapter caseWhereClause(WhereClause object) {
				return createWhereClauseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Runner
	 * @generated
	 */
	public Adapter createRunnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Loader <em>Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Loader
	 * @generated
	 */
	public Adapter createLoaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.LoadMetaModel <em>Load Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.LoadMetaModel
	 * @generated
	 */
	public Adapter createLoadMetaModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.LoadModel <em>Load Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.LoadModel
	 * @generated
	 */
	public Adapter createLoadModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Add
	 * @generated
	 */
	public Adapter createAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.MElement <em>MElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.MElement
	 * @generated
	 */
	public Adapter createMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.MAttribute <em>MAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.MAttribute
	 * @generated
	 */
	public Adapter createMAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tmodel.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tmodel.WhereClause
	 * @generated
	 */
	public Adapter createWhereClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TmodelAdapterFactory
