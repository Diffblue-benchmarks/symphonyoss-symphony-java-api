package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4EventListDiffblueTest {
  /**
   * Test {@link V4EventList#equals(Object)}, and {@link V4EventList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4EventList#equals(Object)}
   *   <li>{@link V4EventList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4EventList.equals(Object)", "int V4EventList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4EventList v4EventList = new V4EventList();
    V4EventList v4EventList2 = new V4EventList();

    // Act and Assert
    assertEquals(v4EventList, v4EventList2);
    assertEquals(v4EventList.hashCode(), v4EventList2.hashCode());
  }

  /**
   * Test {@link V4EventList#equals(Object)}, and {@link V4EventList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4EventList#equals(Object)}
   *   <li>{@link V4EventList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4EventList.equals(Object)", "int V4EventList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4EventList v4EventList = new V4EventList();

    // Act and Assert
    assertEquals(v4EventList, v4EventList);
    int expectedHashCodeResult = v4EventList.hashCode();
    assertEquals(expectedHashCodeResult, v4EventList.hashCode());
  }

  /**
   * Test {@link V4EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4EventList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4EventList.equals(Object)", "int V4EventList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4EventList v4EventList = new V4EventList();
    v4EventList.add(new V4Event());

    // Act and Assert
    assertNotEquals(v4EventList, new V4EventList());
  }

  /**
   * Test {@link V4EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4EventList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4EventList.equals(Object)", "int V4EventList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4EventList(), null);
  }

  /**
   * Test {@link V4EventList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4EventList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4EventList.equals(Object)", "int V4EventList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4EventList(), "Different type to V4EventList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4EventList}
   *   <li>{@link V4EventList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void V4EventList.<init>()", "java.lang.String V4EventList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V4EventList {\n    []\n}", new V4EventList().toString());
  }
}
