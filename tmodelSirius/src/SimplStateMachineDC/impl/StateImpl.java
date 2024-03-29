/**
 */
package SimplStateMachineDC.impl;

import SimplStateMachineDC.CompositeState;
import SimplStateMachineDC.SimplStateMachineDCPackage;
import SimplStateMachineDC.State;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getOrd <em>Ord</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getInh <em>Inh</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getOrdIf <em>Ord If</em>}</li>
 *   <li>{@link SimplStateMachineDC.impl.StateImpl#getInhIf <em>Inh If</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrd() <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd()
	 * @generated
	 * @ordered
	 */
	protected static final String ORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrd() <em>Ord</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrd()
	 * @generated
	 * @ordered
	 */
	protected String ord = ORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInh() <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInh()
	 * @generated
	 * @ordered
	 */
	protected static final String INH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInh() <em>Inh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInh()
	 * @generated
	 * @ordered
	 */
	protected String inh = INH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdIf() <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdIf()
	 * @generated
	 * @ordered
	 */
	protected static final String ORD_IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdIf() <em>Ord If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdIf()
	 * @generated
	 * @ordered
	 */
	protected String ordIf = ORD_IF_EDEFAULT;

	/**
	 * The default value of the '{@link #getInhIf() <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhIf()
	 * @generated
	 * @ordered
	 */
	protected static final String INH_IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInhIf() <em>Inh If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhIf()
	 * @generated
	 * @ordered
	 */
	protected String inhIf = INH_IF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplStateMachineDCPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeState getContainer() {
		if (eContainerFeatureID() != SimplStateMachineDCPackage.STATE__CONTAINER) return null;
		return (CompositeState)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(CompositeState newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, SimplStateMachineDCPackage.STATE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(CompositeState newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != SimplStateMachineDCPackage.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, SimplStateMachineDCPackage.COMPOSITE_STATE__STATES, CompositeState.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrd() {
		return ord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrd(String newOrd) {
		String oldOrd = ord;
		ord = newOrd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__ORD, oldOrd, ord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInh() {
		return inh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInh(String newInh) {
		String oldInh = inh;
		inh = newInh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__INH, oldInh, inh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdIf() {
		return ordIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdIf(String newOrdIf) {
		String oldOrdIf = ordIf;
		ordIf = newOrdIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__ORD_IF, oldOrdIf, ordIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInhIf() {
		return inhIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhIf(String newInhIf) {
		String oldInhIf = inhIf;
		inhIf = newInhIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplStateMachineDCPackage.STATE__INH_IF, oldInhIf, inhIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((CompositeState)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				return basicSetContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, SimplStateMachineDCPackage.COMPOSITE_STATE__STATES, CompositeState.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__NAME:
				return getName();
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				return getContainer();
			case SimplStateMachineDCPackage.STATE__IS_ACTIVE:
				return isIsActive();
			case SimplStateMachineDCPackage.STATE__ORD:
				return getOrd();
			case SimplStateMachineDCPackage.STATE__INH:
				return getInh();
			case SimplStateMachineDCPackage.STATE__ORD_IF:
				return getOrdIf();
			case SimplStateMachineDCPackage.STATE__INH_IF:
				return getInhIf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				setContainer((CompositeState)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__ORD:
				setOrd((String)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__INH:
				setInh((String)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__ORD_IF:
				setOrdIf((String)newValue);
				return;
			case SimplStateMachineDCPackage.STATE__INH_IF:
				setInhIf((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				setContainer((CompositeState)null);
				return;
			case SimplStateMachineDCPackage.STATE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case SimplStateMachineDCPackage.STATE__ORD:
				setOrd(ORD_EDEFAULT);
				return;
			case SimplStateMachineDCPackage.STATE__INH:
				setInh(INH_EDEFAULT);
				return;
			case SimplStateMachineDCPackage.STATE__ORD_IF:
				setOrdIf(ORD_IF_EDEFAULT);
				return;
			case SimplStateMachineDCPackage.STATE__INH_IF:
				setInhIf(INH_IF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplStateMachineDCPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplStateMachineDCPackage.STATE__CONTAINER:
				return getContainer() != null;
			case SimplStateMachineDCPackage.STATE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case SimplStateMachineDCPackage.STATE__ORD:
				return ORD_EDEFAULT == null ? ord != null : !ORD_EDEFAULT.equals(ord);
			case SimplStateMachineDCPackage.STATE__INH:
				return INH_EDEFAULT == null ? inh != null : !INH_EDEFAULT.equals(inh);
			case SimplStateMachineDCPackage.STATE__ORD_IF:
				return ORD_IF_EDEFAULT == null ? ordIf != null : !ORD_IF_EDEFAULT.equals(ordIf);
			case SimplStateMachineDCPackage.STATE__INH_IF:
				return INH_IF_EDEFAULT == null ? inhIf != null : !INH_IF_EDEFAULT.equals(inhIf);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", Ord: ");
		result.append(ord);
		result.append(", Inh: ");
		result.append(inh);
		result.append(", OrdIf: ");
		result.append(ordIf);
		result.append(", InhIf: ");
		result.append(inhIf);
		result.append(')');
		return result.toString();
	}

} //StateImpl
