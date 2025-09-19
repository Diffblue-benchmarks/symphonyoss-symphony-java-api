package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserConnectionListDiffblueTest {
  /**
   * Test {@link UserConnectionList#equals(Object)}, and {@link UserConnectionList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserConnectionList#equals(Object)}
   *   <li>{@link UserConnectionList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionList.equals(Object)",
    "int UserConnectionList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserConnectionList userConnectionList = new UserConnectionList();
    UserConnectionList userConnectionList2 = new UserConnectionList();

    // Act and Assert
    assertEquals(userConnectionList, userConnectionList2);
    assertEquals(userConnectionList.hashCode(), userConnectionList2.hashCode());
  }

  /**
   * Test {@link UserConnectionList#equals(Object)}, and {@link UserConnectionList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserConnectionList#equals(Object)}
   *   <li>{@link UserConnectionList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionList.equals(Object)",
    "int UserConnectionList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserConnectionList userConnectionList = new UserConnectionList();

    // Act and Assert
    assertEquals(userConnectionList, userConnectionList);
    int expectedHashCodeResult = userConnectionList.hashCode();
    assertEquals(expectedHashCodeResult, userConnectionList.hashCode());
  }

  /**
   * Test {@link UserConnectionList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserConnectionList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionList.equals(Object)",
    "int UserConnectionList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserConnectionList userConnectionList = new UserConnectionList();
    userConnectionList.add(new UserConnection());

    // Act and Assert
    assertNotEquals(userConnectionList, new UserConnectionList());
  }

  /**
   * Test {@link UserConnectionList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserConnectionList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionList.equals(Object)",
    "int UserConnectionList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionList(), null);
  }

  /**
   * Test {@link UserConnectionList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserConnectionList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionList.equals(Object)",
    "int UserConnectionList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionList(), "Different type to UserConnectionList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserConnectionList}
   *   <li>{@link UserConnectionList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserConnectionList.<init>()",
    "java.lang.String UserConnectionList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class UserConnectionList {\n    []\n}", new UserConnectionList().toString());
  }
}
