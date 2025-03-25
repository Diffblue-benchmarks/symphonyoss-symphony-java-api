package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserAppEntitlementListDiffblueTest {
  /**
   * Test {@link UserAppEntitlementList#equals(Object)}, and {@link UserAppEntitlementList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserAppEntitlementList#equals(Object)}
   *   <li>{@link UserAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserAppEntitlementList.equals(Object)", "int UserAppEntitlementList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlementList userAppEntitlementList = new UserAppEntitlementList();
    UserAppEntitlementList userAppEntitlementList2 = new UserAppEntitlementList();

    // Act and Assert
    assertEquals(userAppEntitlementList, userAppEntitlementList2);
    int expectedHashCodeResult = userAppEntitlementList.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlementList2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}, and {@link UserAppEntitlementList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserAppEntitlementList#equals(Object)}
   *   <li>{@link UserAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserAppEntitlementList.equals(Object)", "int UserAppEntitlementList.hashCode()"})
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
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserAppEntitlementList.equals(Object)", "int UserAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserAppEntitlementList userAppEntitlementList = new UserAppEntitlementList();
    userAppEntitlementList.add(new UserAppEntitlement());

    // Act and Assert
    assertNotEquals(userAppEntitlementList, new UserAppEntitlementList());
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserAppEntitlementList.equals(Object)", "int UserAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementList(), null);
  }

  /**
   * Test {@link UserAppEntitlementList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserAppEntitlementList.equals(Object)", "int UserAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlementList(), "Different type to UserAppEntitlementList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAppEntitlementList}
   *   <li>{@link UserAppEntitlementList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserAppEntitlementList.<init>()", "java.lang.String UserAppEntitlementList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class UserAppEntitlementList {\n    []\n}", (new UserAppEntitlementList()).toString());
  }
}
