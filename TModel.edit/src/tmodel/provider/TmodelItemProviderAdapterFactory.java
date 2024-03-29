/**
 */
package tmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tmodel.util.TmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TmodelItemProviderAdapterFactory extends TmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.Runner} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnerItemProvider runnerItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.Runner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRunnerAdapter() {
		if (runnerItemProvider == null) {
			runnerItemProvider = new RunnerItemProvider(this);
		}

		return runnerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.LoadMetaModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMetaModelItemProvider loadMetaModelItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.LoadMetaModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadMetaModelAdapter() {
		if (loadMetaModelItemProvider == null) {
			loadMetaModelItemProvider = new LoadMetaModelItemProvider(this);
		}

		return loadMetaModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.LoadModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadModelItemProvider loadModelItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.LoadModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoadModelAdapter() {
		if (loadModelItemProvider == null) {
			loadModelItemProvider = new LoadModelItemProvider(this);
		}

		return loadModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.Add} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddItemProvider addItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.Add}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddAdapter() {
		if (addItemProvider == null) {
			addItemProvider = new AddItemProvider(this);
		}

		return addItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.Update} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateItemProvider updateItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.Update}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateAdapter() {
		if (updateItemProvider == null) {
			updateItemProvider = new UpdateItemProvider(this);
		}

		return updateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.Delete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteItemProvider deleteItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.Delete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteAdapter() {
		if (deleteItemProvider == null) {
			deleteItemProvider = new DeleteItemProvider(this);
		}

		return deleteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.MElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MElementItemProvider mElementItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.MElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMElementAdapter() {
		if (mElementItemProvider == null) {
			mElementItemProvider = new MElementItemProvider(this);
		}

		return mElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.MAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAttributeItemProvider mAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.MAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMAttributeAdapter() {
		if (mAttributeItemProvider == null) {
			mAttributeItemProvider = new MAttributeItemProvider(this);
		}

		return mAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tmodel.WhereClause} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereClauseItemProvider whereClauseItemProvider;

	/**
	 * This creates an adapter for a {@link tmodel.WhereClause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWhereClauseAdapter() {
		if (whereClauseItemProvider == null) {
			whereClauseItemProvider = new WhereClauseItemProvider(this);
		}

		return whereClauseItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (runnerItemProvider != null) runnerItemProvider.dispose();
		if (loadMetaModelItemProvider != null) loadMetaModelItemProvider.dispose();
		if (loadModelItemProvider != null) loadModelItemProvider.dispose();
		if (addItemProvider != null) addItemProvider.dispose();
		if (updateItemProvider != null) updateItemProvider.dispose();
		if (deleteItemProvider != null) deleteItemProvider.dispose();
		if (mElementItemProvider != null) mElementItemProvider.dispose();
		if (mAttributeItemProvider != null) mAttributeItemProvider.dispose();
		if (whereClauseItemProvider != null) whereClauseItemProvider.dispose();
	}

}
