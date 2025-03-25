package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserIdListDiffblueTest {
  /**
   * Test {@link UserIdList#equals(Object)}, and {@link UserIdList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserIdList#equals(Object)}
   *   <li>{@link UserIdList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserIdList.equals(Object)", "int UserIdList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserIdList userIdList = new UserIdList();
    UserIdList userIdList2 = new UserIdList();

    // Act and Assert
    assertEquals(userIdList, userIdList2);
    int expectedHashCodeResult = userIdList.hashCode();
    assertEquals(expectedHashCodeResult, userIdList2.hashCode());
  }

  /**
   * Test {@link UserIdList#equals(Object)}, and {@link UserIdList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserIdList#equals(Object)}
   *   <li>{@link UserIdList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserIdList.equals(Object)", "int UserIdList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserIdList userIdList = new UserIdList();

    // Act and Assert
    assertEquals(userIdList, userIdList);
    int expectedHashCodeResult = userIdList.hashCode();
    assertEquals(expectedHashCodeResult, userIdList.hashCode());
  }

  /**
   * Test {@link UserIdList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserIdList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserIdList.equals(Object)", "int UserIdList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserIdList userIdList = new UserIdList();
    userIdList.add(1L);

    // Act and Assert
    assertNotEquals(userIdList, new UserIdList());
  }

  /**
   * Test {@link UserIdList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserIdList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserIdList.equals(Object)", "int UserIdList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserIdList(), null);
  }

  /**
   * Test {@link UserIdList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserIdList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserIdList.equals(Object)", "int UserIdList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserIdList(), "Different type to UserIdList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserIdList}
   *   <li>{@link UserIdList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserIdList.<init>()", "java.lang.String UserIdList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class UserIdList {\n    []\n}", (new UserIdList()).toString());
  }
}
