/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.data.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see codeskills.designer.data.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DataFactory eINSTANCE = codeskills.designer.data.data.impl.DataFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
  Resource createResource();

  /**
   * Returns a new object of class '<em>Container Resource</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Resource</em>'.
   * @generated
   */
  ContainerResource createContainerResource();

  /**
   * Returns a new object of class '<em>Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project</em>'.
   * @generated
   */
  Project createProject();

  /**
   * Returns a new object of class '<em>Folder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Folder</em>'.
   * @generated
   */
  Folder createFolder();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DataPackage getDataPackage();

} //DataFactory
