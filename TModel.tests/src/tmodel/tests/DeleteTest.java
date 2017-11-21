/**
 */
package tmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tmodel.Delete;
import tmodel.TmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeleteTest extends TestCase {

	/**
	 * The fixture for this Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Delete fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeleteTest.class);
	}

	/**
	 * Constructs a new Delete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Delete fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Delete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Delete getFixture() {
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
		setFixture(TmodelFactory.eINSTANCE.createDelete());
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

} //DeleteTest
