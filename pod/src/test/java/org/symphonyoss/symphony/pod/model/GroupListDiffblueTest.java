package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class GroupListDiffblueTest {
  /**
   * Test {@link GroupList#equals(Object)}, and {@link GroupList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupList#equals(Object)}
   *   <li>{@link GroupList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GroupList groupList = new GroupList();
    GroupList groupList2 = new GroupList();

    // Act and Assert
    assertEquals(groupList, groupList2);
    assertEquals(groupList.hashCode(), groupList2.hashCode());
  }

  /**
   * Test {@link GroupList#equals(Object)}, and {@link GroupList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GroupList#equals(Object)}
   *   <li>{@link GroupList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GroupList groupList = new GroupList();

    // Act and Assert
    assertEquals(groupList, groupList);
    int expectedHashCodeResult = groupList.hashCode();
    assertEquals(expectedHashCodeResult, groupList.hashCode());
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GroupList groupList = new GroupList();
    groupList.add(new Group());

    // Act and Assert
    assertNotEquals(groupList, new GroupList());
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupList(), null);
  }

  /**
   * Test {@link GroupList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GroupList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean GroupList.equals(Object)", "int GroupList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GroupList(), "Different type to GroupList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link GroupList}
   *   <li>{@link GroupList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void GroupList.<init>()", "java.lang.String GroupList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class GroupList {\n    []\n}", new GroupList().toString());
  }
}
