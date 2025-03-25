package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V5FirehoseDiffblueTest {
  /**
   * Test {@link V5Firehose#equals(Object)}, and {@link V5Firehose#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V5Firehose#equals(Object)}
   *   <li>{@link V5Firehose#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V5Firehose.equals(Object)", "int V5Firehose.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5Firehose v5Firehose = new V5Firehose();
    V5Firehose v5Firehose2 = new V5Firehose();

    // Act and Assert
    assertEquals(v5Firehose, v5Firehose2);
    int expectedHashCodeResult = v5Firehose.hashCode();
    assertEquals(expectedHashCodeResult, v5Firehose2.hashCode());
  }

  /**
   * Test {@link V5Firehose#equals(Object)}, and {@link V5Firehose#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V5Firehose#equals(Object)}
   *   <li>{@link V5Firehose#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V5Firehose.equals(Object)", "int V5Firehose.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5Firehose v5Firehose = new V5Firehose();

    // Act and Assert
    assertEquals(v5Firehose, v5Firehose);
    int expectedHashCodeResult = v5Firehose.hashCode();
    assertEquals(expectedHashCodeResult, v5Firehose.hashCode());
  }

  /**
   * Test {@link V5Firehose#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5Firehose#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5Firehose.equals(Object)", "int V5Firehose.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Firehose(), null);
  }

  /**
   * Test {@link V5Firehose#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5Firehose#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5Firehose.equals(Object)", "int V5Firehose.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Firehose(), null);
  }

  /**
   * Test {@link V5Firehose#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5Firehose#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5Firehose.equals(Object)", "int V5Firehose.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5Firehose(), "Different type to V5Firehose");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V5Firehose}
   *   <li>{@link V5Firehose#id(String)}
   *   <li>{@link V5Firehose#setId(String)}
   *   <li>{@link V5Firehose#toString()}
   *   <li>{@link V5Firehose#getId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V5Firehose.<init>()", "String V5Firehose.getId()", "V5Firehose V5Firehose.id(String)",
      "void V5Firehose.setId(String)", "String V5Firehose.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V5Firehose actualV5Firehose = new V5Firehose();
    V5Firehose actualIdResult = actualV5Firehose.id("42");
    actualV5Firehose.setId("42");
    String actualToStringResult = actualV5Firehose.toString();

    // Assert
    assertEquals("42", actualV5Firehose.getId());
    assertEquals("class V5Firehose {\n    id: 42\n}", actualToStringResult);
    assertSame(actualV5Firehose, actualIdResult);
  }
}
