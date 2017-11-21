/**
 */
package tmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tmodel.Add;
import tmodel.TmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddTest extends TestCase {

	/**
	 * The fixture for this Add test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Add fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AddTest.class);
	}

	/**
	 * Constructs a new Add test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Add test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Add fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Add test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Add getFixture() {
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
		setFixture(TmodelFactory.eINSTANCE.createAdd());
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

} //AddTest
