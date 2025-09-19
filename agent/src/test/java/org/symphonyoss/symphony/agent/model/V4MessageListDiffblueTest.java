package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4MessageListDiffblueTest {
  /**
   * Test {@link V4MessageList#equals(Object)}, and {@link V4MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4MessageList#equals(Object)}
   *   <li>{@link V4MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageList.equals(Object)", "int V4MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4MessageList v4MessageList = new V4MessageList();
    V4MessageList v4MessageList2 = new V4MessageList();

    // Act and Assert
    assertEquals(v4MessageList, v4MessageList2);
    assertEquals(v4MessageList.hashCode(), v4MessageList2.hashCode());
  }

  /**
   * Test {@link V4MessageList#equals(Object)}, and {@link V4MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4MessageList#equals(Object)}
   *   <li>{@link V4MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageList.equals(Object)", "int V4MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4MessageList v4MessageList = new V4MessageList();

    // Act and Assert
    assertEquals(v4MessageList, v4MessageList);
    int expectedHashCodeResult = v4MessageList.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageList.hashCode());
  }

  /**
   * Test {@link V4MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageList.equals(Object)", "int V4MessageList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4MessageList v4MessageList = new V4MessageList();
    v4MessageList.add(new V4Message());

    // Act and Assert
    assertNotEquals(v4MessageList, new V4MessageList());
  }

  /**
   * Test {@link V4MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageList.equals(Object)", "int V4MessageList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageList(), null);
  }

  /**
   * Test {@link V4MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageList.equals(Object)", "int V4MessageList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageList(), "Different type to V4MessageList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4MessageList}
   *   <li>{@link V4MessageList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void V4MessageList.<init>()", "java.lang.String V4MessageList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V4MessageList {\n    []\n}", new V4MessageList().toString());
  }
}
