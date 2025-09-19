package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MessageSuppressionResponseDiffblueTest {
  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}, and {@link
   * MessageSuppressionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageSuppressionResponse#equals(Object)}
   *   <li>{@link MessageSuppressionResponse#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    MessageSuppressionResponse messageSuppressionResponse2 = new MessageSuppressionResponse();

    // Act and Assert
    assertEquals(messageSuppressionResponse, messageSuppressionResponse2);
    assertEquals(messageSuppressionResponse.hashCode(), messageSuppressionResponse2.hashCode());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}, and {@link
   * MessageSuppressionResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageSuppressionResponse#equals(Object)}
   *   <li>{@link MessageSuppressionResponse#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();

    // Act and Assert
    assertEquals(messageSuppressionResponse, messageSuppressionResponse);
    int expectedHashCodeResult = messageSuppressionResponse.hashCode();
    assertEquals(expectedHashCodeResult, messageSuppressionResponse.hashCode());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSuppressionResponse(), 1);
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.messageId("42");

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.suppressed(true);

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MessageSuppressionResponse messageSuppressionResponse = new MessageSuppressionResponse();
    messageSuppressionResponse.suppressionDate(1L);

    // Act and Assert
    assertNotEquals(messageSuppressionResponse, new MessageSuppressionResponse());
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSuppressionResponse(), null);
  }

  /**
   * Test {@link MessageSuppressionResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageSuppressionResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageSuppressionResponse.equals(Object)",
    "int MessageSuppressionResponse.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new MessageSuppressionResponse(), "Different type to MessageSuppressionResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageSuppressionResponse}
   *   <li>{@link MessageSuppressionResponse#messageId(String)}
   *   <li>{@link MessageSuppressionResponse#setMessageId(String)}
   *   <li>{@link MessageSuppressionResponse#setSuppressed(Boolean)}
   *   <li>{@link MessageSuppressionResponse#setSuppressionDate(Long)}
   *   <li>{@link MessageSuppressionResponse#suppressed(Boolean)}
   *   <li>{@link MessageSuppressionResponse#suppressionDate(Long)}
   *   <li>{@link MessageSuppressionResponse#toString()}
   *   <li>{@link MessageSuppressionResponse#getMessageId()}
   *   <li>{@link MessageSuppressionResponse#getSuppressed()}
   *   <li>{@link MessageSuppressionResponse#getSuppressionDate()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageSuppressionResponse.<init>()",
    "String MessageSuppressionResponse.getMessageId()",
    "Boolean MessageSuppressionResponse.getSuppressed()",
    "Long MessageSuppressionResponse.getSuppressionDate()",
    "MessageSuppressionResponse MessageSuppressionResponse.messageId(String)",
    "void MessageSuppressionResponse.setMessageId(String)",
    "void MessageSuppressionResponse.setSuppressed(Boolean)",
    "void MessageSuppressionResponse.setSuppressionDate(Long)",
    "MessageSuppressionResponse MessageSuppressionResponse.suppressed(Boolean)",
    "MessageSuppressionResponse MessageSuppressionResponse.suppressionDate(Long)",
    "String MessageSuppressionResponse.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    MessageSuppressionResponse actualMessageSuppressionResponse = new MessageSuppressionResponse();
    MessageSuppressionResponse actualMessageIdResult =
        actualMessageSuppressionResponse.messageId("42");
    actualMessageSuppressionResponse.setMessageId("42");
    actualMessageSuppressionResponse.setSuppressed(true);
    actualMessageSuppressionResponse.setSuppressionDate(1L);
    MessageSuppressionResponse actualSuppressedResult =
        actualMessageSuppressionResponse.suppressed(true);
    MessageSuppressionResponse actualSuppressionDateResult =
        actualMessageSuppressionResponse.suppressionDate(1L);
    String actualToStringResult = actualMessageSuppressionResponse.toString();
    String actualMessageId = actualMessageSuppressionResponse.getMessageId();
    Boolean actualSuppressed = actualMessageSuppressionResponse.getSuppressed();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals(
        "class MessageSuppressionResponse {\n    messageId: 42\n    suppressed: true\n    suppressionDate: 1\n}",
        actualToStringResult);
    assertEquals(1L, actualMessageSuppressionResponse.getSuppressionDate().longValue());
    assertTrue(actualSuppressed);
    assertSame(actualMessageSuppressionResponse, actualMessageIdResult);
    assertSame(actualMessageSuppressionResponse, actualSuppressedResult);
    assertSame(actualMessageSuppressionResponse, actualSuppressionDateResult);
  }
}
