package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.model.MessageSubmission.FormatEnum;

public class MessageSubmissionDiffblueTest {
  /**
   * Test {@link MessageSubmission#equals(Object)}, and {@link MessageSubmission#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageSubmission#equals(Object)}
   *   <li>{@link MessageSubmission#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageSubmission messageSubmission = new MessageSubmission();
    MessageSubmission messageSubmission2 = new MessageSubmission();

    // Act and Assert
    assertEquals(messageSubmission, messageSubmission2);
    int expectedHashCodeResult = messageSubmission.hashCode();
    assertEquals(expectedHashCodeResult, messageSubmission2.hashCode());
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}, and {@link MessageSubmission#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageSubmission#equals(Object)}
   *   <li>{@link MessageSubmission#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageSubmission messageSubmission = new MessageSubmission();

    // Act and Assert
    assertEquals(messageSubmission, messageSubmission);
    int expectedHashCodeResult = messageSubmission.hashCode();
    assertEquals(expectedHashCodeResult, messageSubmission.hashCode());
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSubmission(), 1);
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MessageSubmission messageSubmission = new MessageSubmission();
    messageSubmission.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(messageSubmission, new MessageSubmission());
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MessageSubmission messageSubmission = new MessageSubmission();
    messageSubmission.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(messageSubmission, new MessageSubmission());
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSubmission(), null);
  }

  /**
   * Test {@link MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MessageSubmission.equals(Object)", "int MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageSubmission(), "Different type to MessageSubmission");
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  public void testFormatEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FormatEnum.fromValue("Text"));
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code TEXT}.</li>
   *   <li>Then return {@code TEXT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  public void testFormatEnumFromValue_whenText_thenReturnText() {
    // Arrange, Act and Assert
    assertEquals(FormatEnum.TEXT, FormatEnum.fromValue("TEXT"));
  }

  /**
   * Test FormatEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FormatEnum#toString()}
   *   <li>{@link FormatEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String FormatEnum.getValue()", "String FormatEnum.toString()"})
  public void testFormatEnumGettersAndSetters() {
    // Arrange
    FormatEnum valueOfResult = FormatEnum.valueOf("TEXT");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TEXT", valueOfResult.getValue());
    assertEquals("TEXT", actualToStringResult);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageSubmission}
   *   <li>{@link MessageSubmission#format(FormatEnum)}
   *   <li>{@link MessageSubmission#message(String)}
   *   <li>{@link MessageSubmission#setFormat(FormatEnum)}
   *   <li>{@link MessageSubmission#setMessage(String)}
   *   <li>{@link MessageSubmission#toString()}
   *   <li>{@link MessageSubmission#getFormat()}
   *   <li>{@link MessageSubmission#getMessage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void MessageSubmission.<init>()", "MessageSubmission MessageSubmission.format(FormatEnum)",
      "FormatEnum MessageSubmission.getFormat()", "String MessageSubmission.getMessage()",
      "MessageSubmission MessageSubmission.message(String)", "void MessageSubmission.setFormat(FormatEnum)",
      "void MessageSubmission.setMessage(String)", "String MessageSubmission.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    MessageSubmission actualMessageSubmission = new MessageSubmission();
    MessageSubmission actualFormatResult = actualMessageSubmission.format(FormatEnum.TEXT);
    MessageSubmission actualMessageResult = actualMessageSubmission.message("Not all who wander are lost");
    actualMessageSubmission.setFormat(FormatEnum.TEXT);
    actualMessageSubmission.setMessage("Not all who wander are lost");
    String actualToStringResult = actualMessageSubmission.toString();
    FormatEnum actualFormat = actualMessageSubmission.getFormat();

    // Assert
    assertEquals("Not all who wander are lost", actualMessageSubmission.getMessage());
    assertEquals("class MessageSubmission {\n    format: TEXT\n    message: Not all who wander are lost\n}",
        actualToStringResult);
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertSame(actualMessageSubmission, actualFormatResult);
    assertSame(actualMessageSubmission, actualMessageResult);
  }
}
