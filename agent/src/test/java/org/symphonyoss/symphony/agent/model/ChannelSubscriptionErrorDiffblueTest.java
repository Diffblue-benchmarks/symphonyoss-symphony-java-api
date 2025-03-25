package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ChannelSubscriptionErrorDiffblueTest {
  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}, and {@link ChannelSubscriptionError#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriptionError#equals(Object)}
   *   <li>{@link ChannelSubscriptionError#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChannelSubscriptionError channelSubscriptionError = new ChannelSubscriptionError();
    ChannelSubscriptionError channelSubscriptionError2 = new ChannelSubscriptionError();

    // Act and Assert
    assertEquals(channelSubscriptionError, channelSubscriptionError2);
    int expectedHashCodeResult = channelSubscriptionError.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriptionError2.hashCode());
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}, and {@link ChannelSubscriptionError#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ChannelSubscriptionError#equals(Object)}
   *   <li>{@link ChannelSubscriptionError#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChannelSubscriptionError channelSubscriptionError = new ChannelSubscriptionError();

    // Act and Assert
    assertEquals(channelSubscriptionError, channelSubscriptionError);
    int expectedHashCodeResult = channelSubscriptionError.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriptionError.hashCode());
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriptionError(), 1);
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChannelSubscriptionError channelSubscriptionError = new ChannelSubscriptionError();
    channelSubscriptionError.userId(1L);

    // Act and Assert
    assertNotEquals(channelSubscriptionError, new ChannelSubscriptionError());
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ChannelSubscriptionError channelSubscriptionError = new ChannelSubscriptionError();
    channelSubscriptionError.code("Code");

    // Act and Assert
    assertNotEquals(channelSubscriptionError, new ChannelSubscriptionError());
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ChannelSubscriptionError channelSubscriptionError = new ChannelSubscriptionError();
    channelSubscriptionError.message("Not all who wander are lost");

    // Act and Assert
    assertNotEquals(channelSubscriptionError, new ChannelSubscriptionError());
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriptionError(), null);
  }

  /**
   * Test {@link ChannelSubscriptionError#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ChannelSubscriptionError#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ChannelSubscriptionError.equals(Object)", "int ChannelSubscriptionError.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriptionError(), "Different type to ChannelSubscriptionError");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ChannelSubscriptionError}
   *   <li>{@link ChannelSubscriptionError#code(String)}
   *   <li>{@link ChannelSubscriptionError#message(String)}
   *   <li>{@link ChannelSubscriptionError#setCode(String)}
   *   <li>{@link ChannelSubscriptionError#setMessage(String)}
   *   <li>{@link ChannelSubscriptionError#setUserId(Long)}
   *   <li>{@link ChannelSubscriptionError#userId(Long)}
   *   <li>{@link ChannelSubscriptionError#toString()}
   *   <li>{@link ChannelSubscriptionError#getCode()}
   *   <li>{@link ChannelSubscriptionError#getMessage()}
   *   <li>{@link ChannelSubscriptionError#getUserId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void ChannelSubscriptionError.<init>()",
      "ChannelSubscriptionError ChannelSubscriptionError.code(String)", "String ChannelSubscriptionError.getCode()",
      "String ChannelSubscriptionError.getMessage()", "Long ChannelSubscriptionError.getUserId()",
      "ChannelSubscriptionError ChannelSubscriptionError.message(String)",
      "void ChannelSubscriptionError.setCode(String)", "void ChannelSubscriptionError.setMessage(String)",
      "void ChannelSubscriptionError.setUserId(Long)", "String ChannelSubscriptionError.toString()",
      "ChannelSubscriptionError ChannelSubscriptionError.userId(Long)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    ChannelSubscriptionError actualChannelSubscriptionError = new ChannelSubscriptionError();
    ChannelSubscriptionError actualCodeResult = actualChannelSubscriptionError.code("Code");
    ChannelSubscriptionError actualMessageResult = actualChannelSubscriptionError
        .message("Not all who wander are lost");
    actualChannelSubscriptionError.setCode("Code");
    actualChannelSubscriptionError.setMessage("Not all who wander are lost");
    actualChannelSubscriptionError.setUserId(1L);
    ChannelSubscriptionError actualUserIdResult = actualChannelSubscriptionError.userId(1L);
    String actualToStringResult = actualChannelSubscriptionError.toString();
    String actualCode = actualChannelSubscriptionError.getCode();
    String actualMessage = actualChannelSubscriptionError.getMessage();

    // Assert
    assertEquals("Code", actualCode);
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("class ChannelSubscriptionError {\n" + "    userId: 1\n" + "    code: Code\n"
        + "    message: Not all who wander are lost\n" + "}", actualToStringResult);
    assertEquals(1L, actualChannelSubscriptionError.getUserId().longValue());
    assertSame(actualChannelSubscriptionError, actualCodeResult);
    assertSame(actualChannelSubscriptionError, actualMessageResult);
    assertSame(actualChannelSubscriptionError, actualUserIdResult);
  }
}
