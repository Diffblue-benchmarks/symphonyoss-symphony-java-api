package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StreamDiffblueTest {
  /**
   * Test {@link Stream#equals(Object)}, and {@link Stream#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Stream#equals(Object)}
   *   <li>{@link Stream#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Stream stream = new Stream();
    Stream stream2 = new Stream();

    // Act and Assert
    assertEquals(stream, stream2);
    assertEquals(stream.hashCode(), stream2.hashCode());
  }

  /**
   * Test {@link Stream#equals(Object)}, and {@link Stream#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Stream#equals(Object)}
   *   <li>{@link Stream#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Stream stream = new Stream();

    // Act and Assert
    assertEquals(stream, stream);
    int expectedHashCodeResult = stream.hashCode();
    assertEquals(expectedHashCodeResult, stream.hashCode());
  }

  /**
   * Test {@link Stream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Stream#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Stream(), null);
  }

  /**
   * Test {@link Stream#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Stream#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Stream.equals(Object)", "int Stream.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Stream(), "Different type to Stream");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Stream}
   *   <li>{@link Stream#id(String)}
   *   <li>{@link Stream#setId(String)}
   *   <li>{@link Stream#toString()}
   *   <li>{@link Stream#getId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Stream.<init>()",
    "String Stream.getId()",
    "Stream Stream.id(String)",
    "void Stream.setId(String)",
    "String Stream.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    Stream actualStream = new Stream();
    Stream actualIdResult = actualStream.id("42");
    actualStream.setId("42");
    String actualToStringResult = actualStream.toString();

    // Assert
    assertEquals("42", actualStream.getId());
    assertEquals("class Stream {\n    id: 42\n}", actualToStringResult);
    assertSame(actualStream, actualIdResult);
  }
}
