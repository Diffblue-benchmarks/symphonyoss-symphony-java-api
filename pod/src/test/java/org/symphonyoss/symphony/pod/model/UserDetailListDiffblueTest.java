package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserDetailListDiffblueTest {
  /**
   * Test {@link UserDetailList#equals(Object)}, and {@link UserDetailList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserDetailList#equals(Object)}
   *   <li>{@link UserDetailList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetailList.equals(Object)", "int UserDetailList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserDetailList userDetailList = new UserDetailList();
    UserDetailList userDetailList2 = new UserDetailList();

    // Act and Assert
    assertEquals(userDetailList, userDetailList2);
    assertEquals(userDetailList.hashCode(), userDetailList2.hashCode());
  }

  /**
   * Test {@link UserDetailList#equals(Object)}, and {@link UserDetailList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserDetailList#equals(Object)}
   *   <li>{@link UserDetailList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetailList.equals(Object)", "int UserDetailList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserDetailList userDetailList = new UserDetailList();

    // Act and Assert
    assertEquals(userDetailList, userDetailList);
    int expectedHashCodeResult = userDetailList.hashCode();
    assertEquals(expectedHashCodeResult, userDetailList.hashCode());
  }

  /**
   * Test {@link UserDetailList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetailList.equals(Object)", "int UserDetailList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserDetailList userDetailList = new UserDetailList();
    userDetailList.add(new UserDetail());

    // Act and Assert
    assertNotEquals(userDetailList, new UserDetailList());
  }

  /**
   * Test {@link UserDetailList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetailList.equals(Object)", "int UserDetailList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetailList(), null);
  }

  /**
   * Test {@link UserDetailList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserDetailList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserDetailList.equals(Object)", "int UserDetailList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetailList(), "Different type to UserDetailList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserDetailList}
   *   <li>{@link UserDetailList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void UserDetailList.<init>()", "java.lang.String UserDetailList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class UserDetailList {\n    []\n}", new UserDetailList().toString());
  }
}
