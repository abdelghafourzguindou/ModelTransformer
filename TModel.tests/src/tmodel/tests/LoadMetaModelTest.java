/**
 */
package tmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tmodel.LoadMetaModel;
import tmodel.TmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Load Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadMetaModelTest extends TestCase {

	/**
	 * The fixture for this Load Meta Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMetaModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoadMetaModelTest.class);
	}

	/**
	 * Constructs a new Load Meta Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadMetaModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Load Meta Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LoadMetaModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Load Meta Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadMetaModel getFixture() {
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
		setFixture(TmodelFactory.eINSTANCE.createLoadMetaModel());
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

} //LoadMetaModelTest
