/**
 */
package tmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tmodel.MAttribute;
import tmodel.TmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MAttribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAttributeTest extends TestCase {

	/**
	 * The fixture for this MAttribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAttribute fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MAttributeTest.class);
	}

	/**
	 * Constructs a new MAttribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAttributeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this MAttribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MAttribute fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this MAttribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAttribute getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TmodelFactory.eINSTANCE.createMAttribute());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MAttributeTest
