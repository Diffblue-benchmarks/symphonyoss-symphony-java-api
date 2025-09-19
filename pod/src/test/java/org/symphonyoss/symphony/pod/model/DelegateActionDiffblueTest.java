package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.DelegateAction.ActionEnum;

public class DelegateActionDiffblueTest {
  /**
   * Test ActionEnum {@link ActionEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ADD}.
   *   <li>Then return {@code ADD}.
   * </ul>
   *
   * <p>Method under test: {@link ActionEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ActionEnum ActionEnum.fromValue(String)"})
  public void testActionEnumFromValue_whenAdd_thenReturnAdd() {
    // Arrange, Act and Assert
    assertEquals(ActionEnum.ADD, ActionEnum.fromValue("ADD"));
  }

  /**
   * Test ActionEnum {@link ActionEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ActionEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ActionEnum ActionEnum.fromValue(String)"})
  public void testActionEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ActionEnum.fromValue("Text"));
  }

  /**
   * Test ActionEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ActionEnum#toString()}
   *   <li>{@link ActionEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ActionEnum.getValue()", "String ActionEnum.toString()"})
  public void testActionEnumGettersAndSetters() {
    // Arrange
    ActionEnum valueOfResult = ActionEnum.valueOf("ADD");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ADD", valueOfResult.getValue());
    assertEquals("ADD", actualToStringResult);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}, and {@link DelegateAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DelegateAction#equals(Object)}
   *   <li>{@link DelegateAction#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    DelegateAction delegateAction2 = new DelegateAction();

    // Act and Assert
    assertEquals(delegateAction, delegateAction2);
    assertEquals(delegateAction.hashCode(), delegateAction2.hashCode());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}, and {@link DelegateAction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DelegateAction#equals(Object)}
   *   <li>{@link DelegateAction#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();

    // Act and Assert
    assertEquals(delegateAction, delegateAction);
    int expectedHashCodeResult = delegateAction.hashCode();
    assertEquals(expectedHashCodeResult, delegateAction.hashCode());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), 1);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    delegateAction.userId(1L);

    // Act and Assert
    assertNotEquals(delegateAction, new DelegateAction());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DelegateAction delegateAction = new DelegateAction();
    delegateAction.action(ActionEnum.ADD);

    // Act and Assert
    assertNotEquals(delegateAction, new DelegateAction());
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), null);
  }

  /**
   * Test {@link DelegateAction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DelegateAction#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DelegateAction.equals(Object)", "int DelegateAction.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DelegateAction(), "Different type to DelegateAction");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link DelegateAction}
   *   <li>{@link DelegateAction#action(ActionEnum)}
   *   <li>{@link DelegateAction#setAction(ActionEnum)}
   *   <li>{@link DelegateAction#setUserId(Long)}
   *   <li>{@link DelegateAction#userId(Long)}
   *   <li>{@link DelegateAction#toString()}
   *   <li>{@link DelegateAction#getAction()}
   *   <li>{@link DelegateAction#getUserId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DelegateAction.<init>()",
    "DelegateAction DelegateAction.action(ActionEnum)",
    "ActionEnum DelegateAction.getAction()",
    "Long DelegateAction.getUserId()",
    "void DelegateAction.setAction(ActionEnum)",
    "void DelegateAction.setUserId(Long)",
    "String DelegateAction.toString()",
    "DelegateAction DelegateAction.userId(Long)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    DelegateAction actualDelegateAction = new DelegateAction();
    DelegateAction actualActionResult = actualDelegateAction.action(ActionEnum.ADD);
    actualDelegateAction.setAction(ActionEnum.ADD);
    actualDelegateAction.setUserId(1L);
    DelegateAction actualUserIdResult = actualDelegateAction.userId(1L);
    String actualToStringResult = actualDelegateAction.toString();
    ActionEnum actualAction = actualDelegateAction.getAction();

    // Assert
    assertEquals("class DelegateAction {\n    userId: 1\n    action: ADD\n}", actualToStringResult);
    assertEquals(1L, actualDelegateAction.getUserId().longValue());
    assertEquals(ActionEnum.ADD, actualAction);
    assertSame(actualDelegateAction, actualActionResult);
    assertSame(actualDelegateAction, actualUserIdResult);
  }
}
