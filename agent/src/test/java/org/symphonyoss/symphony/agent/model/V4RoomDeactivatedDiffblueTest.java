package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4RoomDeactivatedDiffblueTest {
  /**
   * Test {@link V4RoomDeactivated#equals(Object)}, and {@link V4RoomDeactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomDeactivated#equals(Object)}
   *   <li>{@link V4RoomDeactivated#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomDeactivated v4RoomDeactivated = new V4RoomDeactivated();
    V4RoomDeactivated v4RoomDeactivated2 = new V4RoomDeactivated();

    // Act and Assert
    assertEquals(v4RoomDeactivated, v4RoomDeactivated2);
    assertEquals(v4RoomDeactivated.hashCode(), v4RoomDeactivated2.hashCode());
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}, and {@link V4RoomDeactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomDeactivated#equals(Object)}
   *   <li>{@link V4RoomDeactivated#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomDeactivated v4RoomDeactivated = new V4RoomDeactivated();

    // Act and Assert
    assertEquals(v4RoomDeactivated, v4RoomDeactivated);
    int expectedHashCodeResult = v4RoomDeactivated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomDeactivated.hashCode());
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomDeactivated#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomDeactivated(), null);
  }

  /**
   * Test {@link V4RoomDeactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomDeactivated#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomDeactivated.equals(Object)",
    "int V4RoomDeactivated.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomDeactivated(), "Different type to V4RoomDeactivated");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomDeactivated}
   *   <li>{@link V4RoomDeactivated#setStream(V4Stream)}
   *   <li>{@link V4RoomDeactivated#stream(V4Stream)}
   *   <li>{@link V4RoomDeactivated#toString()}
   *   <li>{@link V4RoomDeactivated#getStream()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomDeactivated.<init>()",
    "V4Stream V4RoomDeactivated.getStream()",
    "void V4RoomDeactivated.setStream(V4Stream)",
    "V4RoomDeactivated V4RoomDeactivated.stream(V4Stream)",
    "String V4RoomDeactivated.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V4RoomDeactivated actualV4RoomDeactivated = new V4RoomDeactivated();
    actualV4RoomDeactivated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomDeactivated actualStreamResult = actualV4RoomDeactivated.stream(stream);
    String actualToStringResult = actualV4RoomDeactivated.toString();
    V4Stream actualStream = actualV4RoomDeactivated.getStream();

    // Assert
    assertEquals(
        "class V4RoomDeactivated {\n"
            + "    stream: class V4Stream {\n"
            + "        streamId: null\n"
            + "        streamType: null\n"
            + "        roomName: null\n"
            + "        members: null\n"
            + "        external: null\n"
            + "        crossPod: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(actualV4RoomDeactivated, actualStreamResult);
    assertSame(stream, actualStream);
  }
}
