package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserAppEntitlementListDiffblueTest {
  /**
   * Test {@link UserAppEntitlementList#equals(Object)}, and {@link
   * UserAppEntitlementList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlementList#equals(Object)}
   *   <li>{@link UserAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementList.equals(Object)",
    "int UserAppEntitlementList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlementList userAppEntitlementList = new UserAppEntitlementList();
    UserAppEntitlementList userAppEntitlementList2 = new UserAppEntitlementList();

    // Act and Assert
    assertEquals(userAppEntitlementList, userAppEntitlementList2);
    assertEquals(userAppEntitlementList.hashCode(), userAppEntitlementList2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}, and {@link
   * UserAppEntitlementList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlementList#equals(Object)}
   *   <li>{@link UserAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementList.equals(Object)",
    "int UserAppEntitlementList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAppEntitlementList userAppEntitlementList = new UserAppEntitlementList();

    // Act and Assert
    assertEquals(userAppEntitlementList, userAppEntitlementList);
    int expectedHashCodeResult = userAppEntitlementList.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlementList.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementList.equals(Object)",
    "int UserAppEntitlementList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserAppEntitlementList userAppEntitlementList = new UserAppEntitlementList();
    userAppEntitlementList.add(new UserAppEntitlement());

    // Act and Assert
    assertNotEquals(userAppEntitlementList, new UserAppEntitlementList());
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementList.equals(Object)",
    "int UserAppEntitlementList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementList(), null);
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlementList.equals(Object)",
    "int UserAppEntitlementList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementList(), "Different type to UserAppEntitlementList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAppEntitlementList}
   *   <li>{@link UserAppEntitlementList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAppEntitlementList.<init>()",
    "java.lang.String UserAppEntitlementList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals(
        "class UserAppEntitlementList {\n    []\n}", new UserAppEntitlementList().toString());
  }
}
