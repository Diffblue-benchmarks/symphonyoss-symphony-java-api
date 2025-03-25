package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.SuccessResponse.FormatEnum;

public class SuccessResponseDiffblueTest {
  /**
   * Test {@link SuccessResponse#equals(Object)}, and {@link SuccessResponse#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SuccessResponse#equals(Object)}
   *   <li>{@link SuccessResponse#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    SuccessResponse successResponse2 = new SuccessResponse();

    // Act and Assert
    assertEquals(successResponse, successResponse2);
    int expectedHashCodeResult = successResponse.hashCode();
    assertEquals(expectedHashCodeResult, successResponse2.hashCode());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}, and {@link SuccessResponse#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SuccessResponse#equals(Object)}
   *   <li>{@link SuccessResponse#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();

    // Act and Assert
    assertEquals(successResponse, successResponse);
    int expectedHashCodeResult = successResponse.hashCode();
    assertEquals(expectedHashCodeResult, successResponse.hashCode());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), 1);
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    successResponse.format(FormatEnum.TEXT);

    // Act and Assert
    assertNotEquals(successResponse, new SuccessResponse());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SuccessResponse successResponse = new SuccessResponse();
    successResponse.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(successResponse, new SuccessResponse());
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), null);
  }

  /**
   * Test {@link SuccessResponse#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SuccessResponse#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SuccessResponse.equals(Object)", "int SuccessResponse.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SuccessResponse(), "Different type to SuccessResponse");
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
   *   <li>default or parameterless constructor of {@link SuccessResponse}
   *   <li>{@link SuccessResponse#format(FormatEnum)}
   *   <li>{@link SuccessResponse#message(String)}
   *   <li>{@link SuccessResponse#setFormat(FormatEnum)}
   *   <li>{@link SuccessResponse#setMessage(String)}
   *   <li>{@link SuccessResponse#toString()}
   *   <li>{@link SuccessResponse#getFormat()}
   *   <li>{@link SuccessResponse#getMessage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void SuccessResponse.<init>()", "SuccessResponse SuccessResponse.format(FormatEnum)",
      "FormatEnum SuccessResponse.getFormat()", "String SuccessResponse.getMessage()",
      "SuccessResponse SuccessResponse.message(String)", "void SuccessResponse.setFormat(FormatEnum)",
      "void SuccessResponse.setMessage(String)", "String SuccessResponse.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    SuccessResponse actualSuccessResponse = new SuccessResponse();
    SuccessResponse actualFormatResult = actualSuccessResponse.format(FormatEnum.TEXT);
    SuccessResponse actualMessageResult = actualSuccessResponse.message("Not all who wander are lost");
    actualSuccessResponse.setFormat(FormatEnum.TEXT);
    actualSuccessResponse.setMessage("Not all who wander are lost");
    String actualToStringResult = actualSuccessResponse.toString();
    FormatEnum actualFormat = actualSuccessResponse.getFormat();

    // Assert
    assertEquals("Not all who wander are lost", actualSuccessResponse.getMessage());
    assertEquals("class SuccessResponse {\n    format: TEXT\n    message: Not all who wander are lost\n}",
        actualToStringResult);
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertSame(actualSuccessResponse, actualFormatResult);
    assertSame(actualSuccessResponse, actualMessageResult);
  }
}
