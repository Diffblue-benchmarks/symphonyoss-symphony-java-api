package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.StreamType.TypeEnum;

public class StreamTypeDiffblueTest {
  /**
   * Test {@link StreamType#equals(Object)}, and {@link StreamType#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamType#equals(Object)}
   *   <li>{@link StreamType#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamType streamType = new StreamType();
    StreamType streamType2 = new StreamType();

    // Act and Assert
    assertEquals(streamType, streamType2);
    int expectedHashCodeResult = streamType.hashCode();
    assertEquals(expectedHashCodeResult, streamType2.hashCode());
  }

  /**
   * Test {@link StreamType#equals(Object)}, and {@link StreamType#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamType#equals(Object)}
   *   <li>{@link StreamType#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamType streamType = new StreamType();

    // Act and Assert
    assertEquals(streamType, streamType);
    int expectedHashCodeResult = streamType.hashCode();
    assertEquals(expectedHashCodeResult, streamType.hashCode());
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), null);
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), null);
  }

  /**
   * Test {@link StreamType#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamType#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamType.equals(Object)", "int StreamType.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamType(), "Different type to StreamType");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamType}
   *   <li>{@link StreamType#setType(TypeEnum)}
   *   <li>{@link StreamType#type(TypeEnum)}
   *   <li>{@link StreamType#toString()}
   *   <li>{@link StreamType#getType()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void StreamType.<init>()", "TypeEnum StreamType.getType()", "void StreamType.setType(TypeEnum)",
      "String StreamType.toString()", "StreamType StreamType.type(TypeEnum)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    StreamType actualStreamType = new StreamType();
    actualStreamType.setType(TypeEnum.IM);
    StreamType actualTypeResult = actualStreamType.type(TypeEnum.IM);
    String actualToStringResult = actualStreamType.toString();

    // Assert
    assertEquals("class StreamType {\n    type: IM\n}", actualToStringResult);
    assertEquals(TypeEnum.IM, actualStreamType.getType());
    assertSame(actualStreamType, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code IM}.</li>
   *   <li>Then return {@code IM}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenIm_thenReturnIm() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.IM, TypeEnum.fromValue("IM"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("Text"));
  }

  /**
   * Test TypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  public void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("IM");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("IM", valueOfResult.getValue());
    assertEquals("IM", actualToStringResult);
  }
}
