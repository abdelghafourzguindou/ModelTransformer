/**
 */
package tmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tmodel.Delete;
import tmodel.MAttribute;
import tmodel.TmodelPackage;
import tmodel.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tmodel.impl.DeleteImpl#getCibleElement <em>Cible Element</em>}</li>
 *   <li>{@link tmodel.impl.DeleteImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link tmodel.impl.DeleteImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteImpl extends MinimalEObjectImpl.Container implements Delete {
	/**
	 * The default value of the '{@link #getCibleElement() <em>Cible Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCibleElement()
	 * @generated
	 * @ordered
	 */
	protected static final String CIBLE_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCibleElement() <em>Cible Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCibleElement()
	 * @generated
	 * @ordered
	 */
	protected String cibleElement = CIBLE_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<MAttribute> attributes;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected WhereClause whereClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TmodelPackage.Literals.DELETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCibleElement() {
		return cibleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCibleElement(String newCibleElement) {
		String oldCibleElement = cibleElement;
		cibleElement = newCibleElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TmodelPackage.DELETE__CIBLE_ELEMENT, oldCibleElement, cibleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<MAttribute>(MAttribute.class, this, TmodelPackage.DELETE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClause getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereClause(WhereClause newWhereClause, NotificationChain msgs) {
		WhereClause oldWhereClause = whereClause;
		whereClause = newWhereClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TmodelPackage.DELETE__WHERE_CLAUSE, oldWhereClause, newWhereClause);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereClause(WhereClause newWhereClause) {
		if (newWhereClause != whereClause) {
			NotificationChain msgs = null;
			if (whereClause != null)
				msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TmodelPackage.DELETE__WHERE_CLAUSE, null, msgs);
			if (newWhereClause != null)
				msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TmodelPackage.DELETE__WHERE_CLAUSE, null, msgs);
			msgs = basicSetWhereClause(newWhereClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TmodelPackage.DELETE__WHERE_CLAUSE, newWhereClause, newWhereClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TmodelPackage.DELETE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TmodelPackage.DELETE__WHERE_CLAUSE:
				return basicSetWhereClause(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TmodelPackage.DELETE__CIBLE_ELEMENT:
				return getCibleElement();
			case TmodelPackage.DELETE__ATTRIBUTES:
				return getAttributes();
			case TmodelPackage.DELETE__WHERE_CLAUSE:
				return getWhereClause();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TmodelPackage.DELETE__CIBLE_ELEMENT:
				setCibleElement((String)newValue);
				return;
			case TmodelPackage.DELETE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends MAttribute>)newValue);
				return;
			case TmodelPackage.DELETE__WHERE_CLAUSE:
				setWhereClause((WhereClause)newValue);
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
			case TmodelPackage.DELETE__CIBLE_ELEMENT:
				setCibleElement(CIBLE_ELEMENT_EDEFAULT);
				return;
			case TmodelPackage.DELETE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TmodelPackage.DELETE__WHERE_CLAUSE:
				setWhereClause((WhereClause)null);
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
			case TmodelPackage.DELETE__CIBLE_ELEMENT:
				return CIBLE_ELEMENT_EDEFAULT == null ? cibleElement != null : !CIBLE_ELEMENT_EDEFAULT.equals(cibleElement);
			case TmodelPackage.DELETE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TmodelPackage.DELETE__WHERE_CLAUSE:
				return whereClause != null;
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
		result.append(" (cibleElement: ");
		result.append(cibleElement);
		result.append(')');
		return result.toString();
	}

} //DeleteImpl
