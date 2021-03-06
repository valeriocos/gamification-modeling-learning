/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.data.tests;

import codeskills.designer.data.data.ContainerResource;
import codeskills.designer.data.data.DataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Resource</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerResourceTest extends ResourceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerResourceTest.class);
	}

	/**
	 * Constructs a new Container Resource test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerResourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Resource test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerResource getFixture() {
		return (ContainerResource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DataFactory.eINSTANCE.createContainerResource());
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

} //ContainerResourceTest
