package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4InstantMessageCreatedDiffblueTest {
  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}, and {@link V4InstantMessageCreated#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4InstantMessageCreated#equals(Object)}
   *   <li>{@link V4InstantMessageCreated#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4InstantMessageCreated.equals(Object)", "int V4InstantMessageCreated.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4InstantMessageCreated v4InstantMessageCreated = new V4InstantMessageCreated();
    V4InstantMessageCreated v4InstantMessageCreated2 = new V4InstantMessageCreated();

    // Act and Assert
    assertEquals(v4InstantMessageCreated, v4InstantMessageCreated2);
    int expectedHashCodeResult = v4InstantMessageCreated.hashCode();
    assertEquals(expectedHashCodeResult, v4InstantMessageCreated2.hashCode());
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}, and {@link V4InstantMessageCreated#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4InstantMessageCreated#equals(Object)}
   *   <li>{@link V4InstantMessageCreated#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4InstantMessageCreated.equals(Object)", "int V4InstantMessageCreated.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4InstantMessageCreated v4InstantMessageCreated = new V4InstantMessageCreated();

    // Act and Assert
    assertEquals(v4InstantMessageCreated, v4InstantMessageCreated);
    int expectedHashCodeResult = v4InstantMessageCreated.hashCode();
    assertEquals(expectedHashCodeResult, v4InstantMessageCreated.hashCode());
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4InstantMessageCreated#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4InstantMessageCreated.equals(Object)", "int V4InstantMessageCreated.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4InstantMessageCreated(), null);
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4InstantMessageCreated#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4InstantMessageCreated.equals(Object)", "int V4InstantMessageCreated.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4InstantMessageCreated(), null);
  }

  /**
   * Test {@link V4InstantMessageCreated#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4InstantMessageCreated#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4InstantMessageCreated.equals(Object)", "int V4InstantMessageCreated.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4InstantMessageCreated(), "Different type to V4InstantMessageCreated");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4InstantMessageCreated}
   *   <li>{@link V4InstantMessageCreated#setStream(V4Stream)}
   *   <li>{@link V4InstantMessageCreated#stream(V4Stream)}
   *   <li>{@link V4InstantMessageCreated#toString()}
   *   <li>{@link V4InstantMessageCreated#getStream()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4InstantMessageCreated.<init>()", "V4Stream V4InstantMessageCreated.getStream()",
      "void V4InstantMessageCreated.setStream(V4Stream)",
      "V4InstantMessageCreated V4InstantMessageCreated.stream(V4Stream)", "String V4InstantMessageCreated.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V4InstantMessageCreated actualV4InstantMessageCreated = new V4InstantMessageCreated();
    actualV4InstantMessageCreated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4InstantMessageCreated actualStreamResult = actualV4InstantMessageCreated.stream(stream);
    String actualToStringResult = actualV4InstantMessageCreated.toString();

    // Assert
    assertEquals("class V4InstantMessageCreated {\n" + "    stream: class V4Stream {\n" + "        streamId: null\n"
        + "        streamType: null\n" + "        roomName: null\n" + "        members: null\n"
        + "        external: null\n" + "        crossPod: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4InstantMessageCreated, actualStreamResult);
    assertSame(stream, actualV4InstantMessageCreated.getStream());
  }
}
