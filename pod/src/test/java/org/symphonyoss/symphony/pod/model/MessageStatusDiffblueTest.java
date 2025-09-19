package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MessageStatusDiffblueTest {
  /**
   * Test {@link MessageStatus#addDeliveredItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addDeliveredItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addDeliveredItem(MessageStatusUser)"})
  public void testAddDeliveredItem_givenMessageStatus() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();

    // Act
    MessageStatus actualAddDeliveredItemResult =
        messageStatus.addDeliveredItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddDeliveredItemResult);
  }

  /**
   * Test {@link MessageStatus#addDeliveredItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor) delivered {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addDeliveredItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addDeliveredItem(MessageStatusUser)"})
  public void testAddDeliveredItem_givenMessageStatusDeliveredArrayList() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.delivered(new ArrayList<>());

    // Act
    MessageStatus actualAddDeliveredItemResult =
        messageStatus.addDeliveredItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddDeliveredItemResult);
  }

  /**
   * Test {@link MessageStatus#addReadItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addReadItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addReadItem(MessageStatusUser)"})
  public void testAddReadItem_givenMessageStatus() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();

    // Act
    MessageStatus actualAddReadItemResult = messageStatus.addReadItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddReadItemResult);
  }

  /**
   * Test {@link MessageStatus#addReadItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor) read {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addReadItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addReadItem(MessageStatusUser)"})
  public void testAddReadItem_givenMessageStatusReadArrayList() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.read(new ArrayList<>());

    // Act
    MessageStatus actualAddReadItemResult = messageStatus.addReadItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddReadItemResult);
  }

  /**
   * Test {@link MessageStatus#addSentItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addSentItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addSentItem(MessageStatusUser)"})
  public void testAddSentItem_givenMessageStatus() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();

    // Act
    MessageStatus actualAddSentItemResult = messageStatus.addSentItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddSentItemResult);
  }

  /**
   * Test {@link MessageStatus#addSentItem(MessageStatusUser)}.
   *
   * <ul>
   *   <li>Given {@link MessageStatus} (default constructor) sent {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#addSentItem(MessageStatusUser)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"MessageStatus MessageStatus.addSentItem(MessageStatusUser)"})
  public void testAddSentItem_givenMessageStatusSentArrayList() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.sent(new ArrayList<>());

    // Act
    MessageStatus actualAddSentItemResult = messageStatus.addSentItem(new MessageStatusUser());

    // Assert
    assertSame(messageStatus, actualAddSentItemResult);
  }

  /**
   * Test {@link MessageStatus#equals(Object)}, and {@link MessageStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStatus#equals(Object)}
   *   <li>{@link MessageStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    MessageStatus messageStatus2 = new MessageStatus();

    // Act and Assert
    assertEquals(messageStatus, messageStatus2);
    assertEquals(messageStatus.hashCode(), messageStatus2.hashCode());
  }

  /**
   * Test {@link MessageStatus#equals(Object)}, and {@link MessageStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageStatus#equals(Object)}
   *   <li>{@link MessageStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();

    // Act and Assert
    assertEquals(messageStatus, messageStatus);
    int expectedHashCodeResult = messageStatus.hashCode();
    assertEquals(expectedHashCodeResult, messageStatus.hashCode());
  }

  /**
   * Test {@link MessageStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.addReadItem(new MessageStatusUser());

    // Act and Assert
    assertNotEquals(messageStatus, new MessageStatus());
  }

  /**
   * Test {@link MessageStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.addDeliveredItem(new MessageStatusUser());

    // Act and Assert
    assertNotEquals(messageStatus, new MessageStatus());
  }

  /**
   * Test {@link MessageStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageStatus messageStatus = new MessageStatus();
    messageStatus.addSentItem(new MessageStatusUser());

    // Act and Assert
    assertNotEquals(messageStatus, new MessageStatus());
  }

  /**
   * Test {@link MessageStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStatus(), null);
  }

  /**
   * Test {@link MessageStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MessageStatus.equals(Object)", "int MessageStatus.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageStatus(), "Different type to MessageStatus");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageStatus}
   *   <li>{@link MessageStatus#delivered(List)}
   *   <li>{@link MessageStatus#read(List)}
   *   <li>{@link MessageStatus#sent(List)}
   *   <li>{@link MessageStatus#setDelivered(List)}
   *   <li>{@link MessageStatus#setRead(List)}
   *   <li>{@link MessageStatus#setSent(List)}
   *   <li>{@link MessageStatus#toString()}
   *   <li>{@link MessageStatus#getDelivered()}
   *   <li>{@link MessageStatus#getRead()}
   *   <li>{@link MessageStatus#getSent()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageStatus.<init>()",
    "MessageStatus MessageStatus.delivered(List)",
    "List MessageStatus.getDelivered()",
    "List MessageStatus.getRead()",
    "List MessageStatus.getSent()",
    "MessageStatus MessageStatus.read(List)",
    "MessageStatus MessageStatus.sent(List)",
    "void MessageStatus.setDelivered(List)",
    "void MessageStatus.setRead(List)",
    "void MessageStatus.setSent(List)",
    "String MessageStatus.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    MessageStatus actualMessageStatus = new MessageStatus();
    MessageStatus actualDeliveredResult = actualMessageStatus.delivered(new ArrayList<>());
    MessageStatus actualReadResult = actualMessageStatus.read(new ArrayList<>());
    MessageStatus actualSentResult = actualMessageStatus.sent(new ArrayList<>());
    ArrayList<MessageStatusUser> delivered = new ArrayList<>();
    actualMessageStatus.setDelivered(delivered);
    ArrayList<MessageStatusUser> read = new ArrayList<>();
    actualMessageStatus.setRead(read);
    ArrayList<MessageStatusUser> sent = new ArrayList<>();
    actualMessageStatus.setSent(sent);
    String actualToStringResult = actualMessageStatus.toString();
    List<MessageStatusUser> actualDelivered = actualMessageStatus.getDelivered();
    List<MessageStatusUser> actualRead = actualMessageStatus.getRead();
    List<MessageStatusUser> actualSent = actualMessageStatus.getSent();

    // Assert
    assertEquals(
        "class MessageStatus {\n    read: []\n    delivered: []\n    sent: []\n}",
        actualToStringResult);
    assertTrue(actualDelivered.isEmpty());
    assertTrue(actualRead.isEmpty());
    assertTrue(actualSent.isEmpty());
    assertSame(delivered, actualDelivered);
    assertSame(read, actualRead);
    assertSame(sent, actualSent);
    assertSame(actualMessageStatus, actualDeliveredResult);
    assertSame(actualMessageStatus, actualReadResult);
    assertSame(actualMessageStatus, actualSentResult);
  }
}
