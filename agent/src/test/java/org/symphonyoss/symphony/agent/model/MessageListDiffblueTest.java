package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MessageListDiffblueTest {
  /**
   * Test {@link MessageList#equals(Object)}, and {@link MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageList#equals(Object)}
   *   <li>{@link MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageList.equals(Object)", "int MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageList messageList = new MessageList();
    MessageList messageList2 = new MessageList();

    // Act and Assert
    assertEquals(messageList, messageList2);
    assertEquals(messageList.hashCode(), messageList2.hashCode());
  }

  /**
   * Test {@link MessageList#equals(Object)}, and {@link MessageList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageList#equals(Object)}
   *   <li>{@link MessageList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageList.equals(Object)", "int MessageList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageList messageList = new MessageList();

    // Act and Assert
    assertEquals(messageList, messageList);
    int expectedHashCodeResult = messageList.hashCode();
    assertEquals(expectedHashCodeResult, messageList.hashCode());
  }

  /**
   * Test {@link MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageList.equals(Object)", "int MessageList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageList messageList = new MessageList();
    messageList.add(new Message());

    // Act and Assert
    assertNotEquals(messageList, new MessageList());
  }

  /**
   * Test {@link MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageList.equals(Object)", "int MessageList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageList(), null);
  }

  /**
   * Test {@link MessageList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageList.equals(Object)", "int MessageList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageList(), "Different type to MessageList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageList}
   *   <li>{@link MessageList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void MessageList.<init>()", "java.lang.String MessageList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class MessageList {\n    []\n}", new MessageList().toString());
  }
}
