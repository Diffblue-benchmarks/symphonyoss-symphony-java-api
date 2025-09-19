package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2MessageListDiffblueTest {
  /**
   * Test {@link V2MessageList#equals(Object)}, and {@link V2MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageList#equals(Object)}
   *   <li>{@link V2MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageList.equals(Object)", "int V2MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MessageList v2MessageList = new V2MessageList();
    V2MessageList v2MessageList2 = new V2MessageList();

    // Act and Assert
    assertEquals(v2MessageList, v2MessageList2);
    assertEquals(v2MessageList.hashCode(), v2MessageList2.hashCode());
  }

  /**
   * Test {@link V2MessageList#equals(Object)}, and {@link V2MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageList#equals(Object)}
   *   <li>{@link V2MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageList.equals(Object)", "int V2MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MessageList v2MessageList = new V2MessageList();

    // Act and Assert
    assertEquals(v2MessageList, v2MessageList);
    int expectedHashCodeResult = v2MessageList.hashCode();
    assertEquals(expectedHashCodeResult, v2MessageList.hashCode());
  }

  /**
   * Test {@link V2MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageList.equals(Object)", "int V2MessageList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MessageList v2MessageList = new V2MessageList();
    v2MessageList.add(new V2BaseMessage());

    // Act and Assert
    assertNotEquals(v2MessageList, new V2MessageList());
  }

  /**
   * Test {@link V2MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageList.equals(Object)", "int V2MessageList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageList(), null);
  }

  /**
   * Test {@link V2MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2MessageList.equals(Object)", "int V2MessageList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageList(), "Different type to V2MessageList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MessageList}
   *   <li>{@link V2MessageList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void V2MessageList.<init>()", "java.lang.String V2MessageList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2MessageList {\n    []\n}", new V2MessageList().toString());
  }
}
