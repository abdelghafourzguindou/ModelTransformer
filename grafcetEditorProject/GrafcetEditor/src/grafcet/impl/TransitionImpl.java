/**
 */
package grafcet.impl;

import grafcet.GrafcetPackage;
import grafcet.Step;
import grafcet.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grafcet.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link grafcet.impl.TransitionImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link grafcet.impl.TransitionImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ElementImpl implements Transition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncomingConnections() <em>Incoming Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingConnections()
	 * @generated
	 * @ordered
	 */
	protected Step incomingConnections;

	/**
	 * The cached value of the '{@link #getOutgoingConnections() <em>Outgoing Connections</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingConnections()
	 * @generated
	 * @ordered
	 */
	protected Step outgoingConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getIncomingConnections() {
		if (incomingConnections != null && incomingConnections.eIsProxy()) {
			InternalEObject oldIncomingConnections = (InternalEObject)incomingConnections;
			incomingConnections = (Step)eResolveProxy(oldIncomingConnections);
			if (incomingConnections != oldIncomingConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS, oldIncomingConnections, incomingConnections));
			}
		}
		return incomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetIncomingConnections() {
		return incomingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingConnections(Step newIncomingConnections) {
		Step oldIncomingConnections = incomingConnections;
		incomingConnections = newIncomingConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS, oldIncomingConnections, incomingConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getOutgoingConnections() {
		if (outgoingConnections != null && outgoingConnections.eIsProxy()) {
			InternalEObject oldOutgoingConnections = (InternalEObject)outgoingConnections;
			outgoingConnections = (Step)eResolveProxy(oldOutgoingConnections);
			if (outgoingConnections != oldOutgoingConnections) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS, oldOutgoingConnections, outgoingConnections));
			}
		}
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetOutgoingConnections() {
		return outgoingConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutgoingConnections(Step newOutgoingConnections) {
		Step oldOutgoingConnections = outgoingConnections;
		outgoingConnections = newOutgoingConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS, oldOutgoingConnections, outgoingConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrafcetPackage.TRANSITION__CONDITION:
				return getCondition();
			case GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS:
				if (resolve) return getIncomingConnections();
				return basicGetIncomingConnections();
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				if (resolve) return getOutgoingConnections();
				return basicGetOutgoingConnections();
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
			case GrafcetPackage.TRANSITION__CONDITION:
				setCondition((String)newValue);
				return;
			case GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS:
				setIncomingConnections((Step)newValue);
				return;
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				setOutgoingConnections((Step)newValue);
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
			case GrafcetPackage.TRANSITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS:
				setIncomingConnections((Step)null);
				return;
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				setOutgoingConnections((Step)null);
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
			case GrafcetPackage.TRANSITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case GrafcetPackage.TRANSITION__INCOMING_CONNECTIONS:
				return incomingConnections != null;
			case GrafcetPackage.TRANSITION__OUTGOING_CONNECTIONS:
				return outgoingConnections != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
