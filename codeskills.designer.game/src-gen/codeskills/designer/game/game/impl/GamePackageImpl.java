/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.game.impl;

import codeskills.designer.game.game.Achievement;
import codeskills.designer.game.game.Game;
import codeskills.designer.game.game.GameFactory;
import codeskills.designer.game.game.GamePackage;
import codeskills.designer.game.game.Group;
import codeskills.designer.game.game.Level;
import codeskills.designer.game.game.Notification;
import codeskills.designer.game.game.Reward;
import codeskills.designer.game.game.Rewardable;
import codeskills.designer.game.game.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamePackageImpl extends EPackageImpl implements GamePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewardableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass levelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass achievementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see codeskills.designer.game.game.GamePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GamePackageImpl()
  {
    super(eNS_URI, GameFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link GamePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GamePackage init()
  {
    if (isInited) return (GamePackage)EPackage.Registry.INSTANCE.getEPackage(GamePackage.eNS_URI);

    // Obtain or create and register package
    GamePackageImpl theGamePackage = (GamePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GamePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GamePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGamePackage.createPackageContents();

    // Initialize created meta-data
    theGamePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGamePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GamePackage.eNS_URI, theGamePackage);
    return theGamePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGame()
  {
    return gameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGame_Levels()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRewardable()
  {
    return rewardableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardable_Name()
  {
    return (EAttribute)rewardableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewardable_Description()
  {
    return (EAttribute)rewardableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRewardable_Reward()
  {
    return (EReference)rewardableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLevel()
  {
    return levelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLevel_Groups()
  {
    return (EReference)levelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Achievements()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAchievement()
  {
    return achievementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAchievement_Tasks()
  {
    return (EReference)achievementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReward()
  {
    return rewardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReward_Points()
  {
    return (EAttribute)rewardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReward_BadgePath()
  {
    return (EAttribute)rewardEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReward_Notification()
  {
    return (EReference)rewardEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotification()
  {
    return notificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotification_Message()
  {
    return (EAttribute)notificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotification_IconPath()
  {
    return (EAttribute)notificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotification_SoundPath()
  {
    return (EAttribute)notificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_Description()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTask_QueryName()
  {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GameFactory getGameFactory()
  {
    return (GameFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gameEClass = createEClass(GAME);
    createEReference(gameEClass, GAME__LEVELS);

    rewardableEClass = createEClass(REWARDABLE);
    createEAttribute(rewardableEClass, REWARDABLE__NAME);
    createEAttribute(rewardableEClass, REWARDABLE__DESCRIPTION);
    createEReference(rewardableEClass, REWARDABLE__REWARD);

    levelEClass = createEClass(LEVEL);
    createEReference(levelEClass, LEVEL__GROUPS);

    groupEClass = createEClass(GROUP);
    createEReference(groupEClass, GROUP__ACHIEVEMENTS);

    achievementEClass = createEClass(ACHIEVEMENT);
    createEReference(achievementEClass, ACHIEVEMENT__TASKS);

    rewardEClass = createEClass(REWARD);
    createEAttribute(rewardEClass, REWARD__POINTS);
    createEAttribute(rewardEClass, REWARD__BADGE_PATH);
    createEReference(rewardEClass, REWARD__NOTIFICATION);

    notificationEClass = createEClass(NOTIFICATION);
    createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
    createEAttribute(notificationEClass, NOTIFICATION__ICON_PATH);
    createEAttribute(notificationEClass, NOTIFICATION__SOUND_PATH);

    taskEClass = createEClass(TASK);
    createEAttribute(taskEClass, TASK__DESCRIPTION);
    createEAttribute(taskEClass, TASK__QUERY_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    levelEClass.getESuperTypes().add(this.getRewardable());
    groupEClass.getESuperTypes().add(this.getRewardable());
    achievementEClass.getESuperTypes().add(this.getRewardable());

    // Initialize classes and features; add operations and parameters
    initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGame_Levels(), this.getLevel(), null, "levels", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewardableEClass, Rewardable.class, "Rewardable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRewardable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rewardable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRewardable_Description(), ecorePackage.getEString(), "description", null, 0, 1, Rewardable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRewardable_Reward(), this.getReward(), null, "reward", null, 0, 1, Rewardable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLevel_Groups(), this.getGroup(), null, "groups", null, 0, -1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGroup_Achievements(), this.getAchievement(), null, "achievements", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(achievementEClass, Achievement.class, "Achievement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAchievement_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Achievement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewardEClass, Reward.class, "Reward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReward_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Reward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReward_BadgePath(), ecorePackage.getEString(), "badgePath", null, 0, 1, Reward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReward_Notification(), this.getNotification(), null, "notification", null, 0, 1, Reward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotification_Message(), ecorePackage.getEString(), "message", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNotification_IconPath(), ecorePackage.getEString(), "iconPath", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNotification_SoundPath(), ecorePackage.getEString(), "soundPath", null, 0, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_QueryName(), ecorePackage.getEString(), "queryName", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //GamePackageImpl
