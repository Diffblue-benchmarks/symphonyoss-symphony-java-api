package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoleDetailListDiffblueTest {
  /**
   * Test {@link RoleDetailList#equals(Object)}, and {@link RoleDetailList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoleDetailList#equals(Object)}
   *   <li>{@link RoleDetailList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoleDetailList.equals(Object)", "int RoleDetailList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoleDetailList roleDetailList = new RoleDetailList();
    RoleDetailList roleDetailList2 = new RoleDetailList();

    // Act and Assert
    assertEquals(roleDetailList, roleDetailList2);
    int expectedHashCodeResult = roleDetailList.hashCode();
    assertEquals(expectedHashCodeResult, roleDetailList2.hashCode());
  }

  /**
   * Test {@link RoleDetailList#equals(Object)}, and {@link RoleDetailList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoleDetailList#equals(Object)}
   *   <li>{@link RoleDetailList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoleDetailList.equals(Object)", "int RoleDetailList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoleDetailList roleDetailList = new RoleDetailList();

    // Act and Assert
    assertEquals(roleDetailList, roleDetailList);
    int expectedHashCodeResult = roleDetailList.hashCode();
    assertEquals(expectedHashCodeResult, roleDetailList.hashCode());
  }

  /**
   * Test {@link RoleDetailList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoleDetailList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoleDetailList.equals(Object)", "int RoleDetailList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoleDetailList roleDetailList = new RoleDetailList();
    roleDetailList.add(new RoleDetail());

    // Act and Assert
    assertNotEquals(roleDetailList, new RoleDetailList());
  }

  /**
   * Test {@link RoleDetailList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoleDetailList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoleDetailList.equals(Object)", "int RoleDetailList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleDetailList(), null);
  }

  /**
   * Test {@link RoleDetailList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoleDetailList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoleDetailList.equals(Object)", "int RoleDetailList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleDetailList(), "Different type to RoleDetailList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoleDetailList}
   *   <li>{@link RoleDetailList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void RoleDetailList.<init>()", "java.lang.String RoleDetailList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class RoleDetailList {\n    []\n}", (new RoleDetailList()).toString());
  }
}
