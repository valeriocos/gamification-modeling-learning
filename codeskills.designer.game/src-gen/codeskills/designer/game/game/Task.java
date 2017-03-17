/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link codeskills.designer.game.game.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link codeskills.designer.game.game.Task#getQueryName <em>Query Name</em>}</li>
 * </ul>
 *
 * @see codeskills.designer.game.game.GamePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see codeskills.designer.game.game.GamePackage#getTask_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link codeskills.designer.game.game.Task#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Query Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Name</em>' attribute.
   * @see #setQueryName(String)
   * @see codeskills.designer.game.game.GamePackage#getTask_QueryName()
   * @model
   * @generated
   */
  String getQueryName();

  /**
   * Sets the value of the '{@link codeskills.designer.game.game.Task#getQueryName <em>Query Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query Name</em>' attribute.
   * @see #getQueryName()
   * @generated
   */
  void setQueryName(String value);

} // Task