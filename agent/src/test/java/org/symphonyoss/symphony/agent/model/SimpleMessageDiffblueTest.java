package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SimpleMessageDiffblueTest {
  /**
   * Test {@link SimpleMessage#equals(Object)}, and {@link SimpleMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleMessage#equals(Object)}
   *   <li>{@link SimpleMessage#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SimpleMessage.equals(Object)", "int SimpleMessage.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleMessage simpleMessage = new SimpleMessage();
    SimpleMessage simpleMessage2 = new SimpleMessage();

    // Act and Assert
    assertEquals(simpleMessage, simpleMessage2);
    int expectedHashCodeResult = simpleMessage.hashCode();
    assertEquals(expectedHashCodeResult, simpleMessage2.hashCode());
  }

  /**
   * Test {@link SimpleMessage#equals(Object)}, and {@link SimpleMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleMessage#equals(Object)}
   *   <li>{@link SimpleMessage#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SimpleMessage.equals(Object)", "int SimpleMessage.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleMessage simpleMessage = new SimpleMessage();

    // Act and Assert
    assertEquals(simpleMessage, simpleMessage);
    int expectedHashCodeResult = simpleMessage.hashCode();
    assertEquals(expectedHashCodeResult, simpleMessage.hashCode());
  }

  /**
   * Test {@link SimpleMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SimpleMessage.equals(Object)", "int SimpleMessage.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleMessage(), null);
  }

  /**
   * Test {@link SimpleMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SimpleMessage.equals(Object)", "int SimpleMessage.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleMessage(), null);
  }

  /**
   * Test {@link SimpleMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SimpleMessage.equals(Object)", "int SimpleMessage.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleMessage(), "Different type to SimpleMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link SimpleMessage}
   *   <li>{@link SimpleMessage#message(String)}
   *   <li>{@link SimpleMessage#setMessage(String)}
   *   <li>{@link SimpleMessage#toString()}
   *   <li>{@link SimpleMessage#getMessage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void SimpleMessage.<init>()", "String SimpleMessage.getMessage()",
      "SimpleMessage SimpleMessage.message(String)", "void SimpleMessage.setMessage(String)",
      "String SimpleMessage.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    SimpleMessage actualSimpleMessage = new SimpleMessage();
    SimpleMessage actualMessageResult = actualSimpleMessage.message("Not all who wander are lost");
    actualSimpleMessage.setMessage("Not all who wander are lost");
    String actualToStringResult = actualSimpleMessage.toString();

    // Assert
    assertEquals("Not all who wander are lost", actualSimpleMessage.getMessage());
    assertEquals("class SimpleMessage {\n    message: Not all who wander are lost\n}", actualToStringResult);
    assertSame(actualSimpleMessage, actualMessageResult);
  }
}
