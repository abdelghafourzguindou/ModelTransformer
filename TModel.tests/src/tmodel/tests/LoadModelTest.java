/**
 */
package tmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tmodel.LoadModel;
import tmodel.TmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadModelTest extends TestCase {

	/**
	 * The fixture for this Load Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadModelTest.class);
	}

	/**
	 * Constructs a new Load Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Load Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoadModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Load Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadModel getFixture() {
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
		setFixture(TmodelFactory.eINSTANCE.createLoadModel());
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

} //LoadModelTest
