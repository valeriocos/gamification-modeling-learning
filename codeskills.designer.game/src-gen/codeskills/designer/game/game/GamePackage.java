/**
 * generated by Xtext 2.10.0
 */
package codeskills.designer.game.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see codeskills.designer.game.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "game";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.designer.codeskills/game/Game";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "game";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GamePackage eINSTANCE = codeskills.designer.game.game.impl.GamePackageImpl.init();

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.GameImpl <em>Game</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.GameImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getGame()
   * @generated
   */
  int GAME = 0;

  /**
   * The feature id for the '<em><b>Levels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME__LEVELS = 0;

  /**
   * The number of structural features of the '<em>Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.RewardableImpl <em>Rewardable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.RewardableImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getRewardable()
   * @generated
   */
  int REWARDABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARDABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARDABLE__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Reward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARDABLE__REWARD = 2;

  /**
   * The number of structural features of the '<em>Rewardable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARDABLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.LevelImpl <em>Level</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.LevelImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getLevel()
   * @generated
   */
  int LEVEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__NAME = REWARDABLE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__DESCRIPTION = REWARDABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Reward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__REWARD = REWARDABLE__REWARD;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL__GROUPS = REWARDABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Level</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEVEL_FEATURE_COUNT = REWARDABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.GroupImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getGroup()
   * @generated
   */
  int GROUP = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = REWARDABLE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__DESCRIPTION = REWARDABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Reward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__REWARD = REWARDABLE__REWARD;

  /**
   * The feature id for the '<em><b>Achievements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ACHIEVEMENTS = REWARDABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = REWARDABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.AchievementImpl <em>Achievement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.AchievementImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getAchievement()
   * @generated
   */
  int ACHIEVEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVEMENT__NAME = REWARDABLE__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVEMENT__DESCRIPTION = REWARDABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Reward</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVEMENT__REWARD = REWARDABLE__REWARD;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVEMENT__TASKS = REWARDABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Achievement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACHIEVEMENT_FEATURE_COUNT = REWARDABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.RewardImpl <em>Reward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.RewardImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getReward()
   * @generated
   */
  int REWARD = 5;

  /**
   * The feature id for the '<em><b>Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD__POINTS = 0;

  /**
   * The feature id for the '<em><b>Badge Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD__BADGE_PATH = 1;

  /**
   * The feature id for the '<em><b>Notification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD__NOTIFICATION = 2;

  /**
   * The number of structural features of the '<em>Reward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWARD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.NotificationImpl <em>Notification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.NotificationImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getNotification()
   * @generated
   */
  int NOTIFICATION = 6;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__MESSAGE = 0;

  /**
   * The feature id for the '<em><b>Icon Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__ICON_PATH = 1;

  /**
   * The feature id for the '<em><b>Sound Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION__SOUND_PATH = 2;

  /**
   * The number of structural features of the '<em>Notification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link codeskills.designer.game.game.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see codeskills.designer.game.game.impl.TaskImpl
   * @see codeskills.designer.game.game.impl.GamePackageImpl#getTask()
   * @generated
   */
  int TASK = 7;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Query Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__QUERY_NAME = 1;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Game <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game</em>'.
   * @see codeskills.designer.game.game.Game
   * @generated
   */
  EClass getGame();

  /**
   * Returns the meta object for the containment reference list '{@link codeskills.designer.game.game.Game#getLevels <em>Levels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Levels</em>'.
   * @see codeskills.designer.game.game.Game#getLevels()
   * @see #getGame()
   * @generated
   */
  EReference getGame_Levels();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Rewardable <em>Rewardable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rewardable</em>'.
   * @see codeskills.designer.game.game.Rewardable
   * @generated
   */
  EClass getRewardable();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Rewardable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see codeskills.designer.game.game.Rewardable#getName()
   * @see #getRewardable()
   * @generated
   */
  EAttribute getRewardable_Name();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Rewardable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see codeskills.designer.game.game.Rewardable#getDescription()
   * @see #getRewardable()
   * @generated
   */
  EAttribute getRewardable_Description();

  /**
   * Returns the meta object for the containment reference '{@link codeskills.designer.game.game.Rewardable#getReward <em>Reward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reward</em>'.
   * @see codeskills.designer.game.game.Rewardable#getReward()
   * @see #getRewardable()
   * @generated
   */
  EReference getRewardable_Reward();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Level <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Level</em>'.
   * @see codeskills.designer.game.game.Level
   * @generated
   */
  EClass getLevel();

  /**
   * Returns the meta object for the containment reference list '{@link codeskills.designer.game.game.Level#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see codeskills.designer.game.game.Level#getGroups()
   * @see #getLevel()
   * @generated
   */
  EReference getLevel_Groups();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see codeskills.designer.game.game.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the containment reference list '{@link codeskills.designer.game.game.Group#getAchievements <em>Achievements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Achievements</em>'.
   * @see codeskills.designer.game.game.Group#getAchievements()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Achievements();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Achievement <em>Achievement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Achievement</em>'.
   * @see codeskills.designer.game.game.Achievement
   * @generated
   */
  EClass getAchievement();

  /**
   * Returns the meta object for the containment reference list '{@link codeskills.designer.game.game.Achievement#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see codeskills.designer.game.game.Achievement#getTasks()
   * @see #getAchievement()
   * @generated
   */
  EReference getAchievement_Tasks();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Reward <em>Reward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reward</em>'.
   * @see codeskills.designer.game.game.Reward
   * @generated
   */
  EClass getReward();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Reward#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Points</em>'.
   * @see codeskills.designer.game.game.Reward#getPoints()
   * @see #getReward()
   * @generated
   */
  EAttribute getReward_Points();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Reward#getBadgePath <em>Badge Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Badge Path</em>'.
   * @see codeskills.designer.game.game.Reward#getBadgePath()
   * @see #getReward()
   * @generated
   */
  EAttribute getReward_BadgePath();

  /**
   * Returns the meta object for the containment reference '{@link codeskills.designer.game.game.Reward#getNotification <em>Notification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Notification</em>'.
   * @see codeskills.designer.game.game.Reward#getNotification()
   * @see #getReward()
   * @generated
   */
  EReference getReward_Notification();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Notification <em>Notification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification</em>'.
   * @see codeskills.designer.game.game.Notification
   * @generated
   */
  EClass getNotification();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Notification#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see codeskills.designer.game.game.Notification#getMessage()
   * @see #getNotification()
   * @generated
   */
  EAttribute getNotification_Message();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Notification#getIconPath <em>Icon Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon Path</em>'.
   * @see codeskills.designer.game.game.Notification#getIconPath()
   * @see #getNotification()
   * @generated
   */
  EAttribute getNotification_IconPath();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Notification#getSoundPath <em>Sound Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sound Path</em>'.
   * @see codeskills.designer.game.game.Notification#getSoundPath()
   * @see #getNotification()
   * @generated
   */
  EAttribute getNotification_SoundPath();

  /**
   * Returns the meta object for class '{@link codeskills.designer.game.game.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see codeskills.designer.game.game.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Task#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see codeskills.designer.game.game.Task#getDescription()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Description();

  /**
   * Returns the meta object for the attribute '{@link codeskills.designer.game.game.Task#getQueryName <em>Query Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Name</em>'.
   * @see codeskills.designer.game.game.Task#getQueryName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_QueryName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GameFactory getGameFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.GameImpl <em>Game</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.GameImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getGame()
     * @generated
     */
    EClass GAME = eINSTANCE.getGame();

    /**
     * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GAME__LEVELS = eINSTANCE.getGame_Levels();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.RewardableImpl <em>Rewardable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.RewardableImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getRewardable()
     * @generated
     */
    EClass REWARDABLE = eINSTANCE.getRewardable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARDABLE__NAME = eINSTANCE.getRewardable_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARDABLE__DESCRIPTION = eINSTANCE.getRewardable_Description();

    /**
     * The meta object literal for the '<em><b>Reward</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWARDABLE__REWARD = eINSTANCE.getRewardable_Reward();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.LevelImpl <em>Level</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.LevelImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getLevel()
     * @generated
     */
    EClass LEVEL = eINSTANCE.getLevel();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEVEL__GROUPS = eINSTANCE.getLevel_Groups();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.GroupImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Achievements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__ACHIEVEMENTS = eINSTANCE.getGroup_Achievements();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.AchievementImpl <em>Achievement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.AchievementImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getAchievement()
     * @generated
     */
    EClass ACHIEVEMENT = eINSTANCE.getAchievement();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACHIEVEMENT__TASKS = eINSTANCE.getAchievement_Tasks();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.RewardImpl <em>Reward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.RewardImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getReward()
     * @generated
     */
    EClass REWARD = eINSTANCE.getReward();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD__POINTS = eINSTANCE.getReward_Points();

    /**
     * The meta object literal for the '<em><b>Badge Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWARD__BADGE_PATH = eINSTANCE.getReward_BadgePath();

    /**
     * The meta object literal for the '<em><b>Notification</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REWARD__NOTIFICATION = eINSTANCE.getReward_Notification();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.NotificationImpl <em>Notification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.NotificationImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getNotification()
     * @generated
     */
    EClass NOTIFICATION = eINSTANCE.getNotification();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();

    /**
     * The meta object literal for the '<em><b>Icon Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFICATION__ICON_PATH = eINSTANCE.getNotification_IconPath();

    /**
     * The meta object literal for the '<em><b>Sound Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTIFICATION__SOUND_PATH = eINSTANCE.getNotification_SoundPath();

    /**
     * The meta object literal for the '{@link codeskills.designer.game.game.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see codeskills.designer.game.game.impl.TaskImpl
     * @see codeskills.designer.game.game.impl.GamePackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

    /**
     * The meta object literal for the '<em><b>Query Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__QUERY_NAME = eINSTANCE.getTask_QueryName();

  }

} //GamePackage