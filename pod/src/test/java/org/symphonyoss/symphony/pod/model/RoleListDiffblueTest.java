package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoleListDiffblueTest {
  /**
   * Test {@link RoleList#equals(Object)}, and {@link RoleList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoleList#equals(Object)}
   *   <li>{@link RoleList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleList.equals(Object)", "int RoleList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoleList roleList = new RoleList();
    RoleList roleList2 = new RoleList();

    // Act and Assert
    assertEquals(roleList, roleList2);
    assertEquals(roleList.hashCode(), roleList2.hashCode());
  }

  /**
   * Test {@link RoleList#equals(Object)}, and {@link RoleList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoleList#equals(Object)}
   *   <li>{@link RoleList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleList.equals(Object)", "int RoleList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoleList roleList = new RoleList();

    // Act and Assert
    assertEquals(roleList, roleList);
    int expectedHashCodeResult = roleList.hashCode();
    assertEquals(expectedHashCodeResult, roleList.hashCode());
  }

  /**
   * Test {@link RoleList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleList.equals(Object)", "int RoleList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoleList roleList = new RoleList();
    roleList.add(new Role());

    // Act and Assert
    assertNotEquals(roleList, new RoleList());
  }

  /**
   * Test {@link RoleList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleList.equals(Object)", "int RoleList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleList(), null);
  }

  /**
   * Test {@link RoleList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoleList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoleList.equals(Object)", "int RoleList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoleList(), "Different type to RoleList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoleList}
   *   <li>{@link RoleList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void RoleList.<init>()", "java.lang.String RoleList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class RoleList {\n    []\n}", new RoleList().toString());
  }
}
