package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AdminStreamInfoListDiffblueTest {
  /**
   * Test {@link AdminStreamInfoList#equals(Object)}, and {@link AdminStreamInfoList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamInfoList#equals(Object)}
   *   <li>{@link AdminStreamInfoList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamInfoList.equals(Object)",
    "int AdminStreamInfoList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamInfoList adminStreamInfoList = new AdminStreamInfoList();
    AdminStreamInfoList adminStreamInfoList2 = new AdminStreamInfoList();

    // Act and Assert
    assertEquals(adminStreamInfoList, adminStreamInfoList2);
    assertEquals(adminStreamInfoList.hashCode(), adminStreamInfoList2.hashCode());
  }

  /**
   * Test {@link AdminStreamInfoList#equals(Object)}, and {@link AdminStreamInfoList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamInfoList#equals(Object)}
   *   <li>{@link AdminStreamInfoList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamInfoList.equals(Object)",
    "int AdminStreamInfoList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamInfoList adminStreamInfoList = new AdminStreamInfoList();

    // Act and Assert
    assertEquals(adminStreamInfoList, adminStreamInfoList);
    int expectedHashCodeResult = adminStreamInfoList.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamInfoList.hashCode());
  }

  /**
   * Test {@link AdminStreamInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamInfoList.equals(Object)",
    "int AdminStreamInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdminStreamInfoList adminStreamInfoList = new AdminStreamInfoList();
    adminStreamInfoList.add(new AdminStreamInfo());

    // Act and Assert
    assertNotEquals(adminStreamInfoList, new AdminStreamInfoList());
  }

  /**
   * Test {@link AdminStreamInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamInfoList.equals(Object)",
    "int AdminStreamInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamInfoList(), null);
  }

  /**
   * Test {@link AdminStreamInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamInfoList.equals(Object)",
    "int AdminStreamInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamInfoList(), "Different type to AdminStreamInfoList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamInfoList}
   *   <li>{@link AdminStreamInfoList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamInfoList.<init>()",
    "java.lang.String AdminStreamInfoList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class AdminStreamInfoList {\n    []\n}", new AdminStreamInfoList().toString());
  }
}
