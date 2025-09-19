package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4RoomReactivatedDiffblueTest {
  /**
   * Test {@link V4RoomReactivated#equals(Object)}, and {@link V4RoomReactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomReactivated#equals(Object)}
   *   <li>{@link V4RoomReactivated#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomReactivated.equals(Object)",
    "int V4RoomReactivated.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4RoomReactivated v4RoomReactivated = new V4RoomReactivated();
    V4RoomReactivated v4RoomReactivated2 = new V4RoomReactivated();

    // Act and Assert
    assertEquals(v4RoomReactivated, v4RoomReactivated2);
    assertEquals(v4RoomReactivated.hashCode(), v4RoomReactivated2.hashCode());
  }

  /**
   * Test {@link V4RoomReactivated#equals(Object)}, and {@link V4RoomReactivated#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4RoomReactivated#equals(Object)}
   *   <li>{@link V4RoomReactivated#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomReactivated.equals(Object)",
    "int V4RoomReactivated.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4RoomReactivated v4RoomReactivated = new V4RoomReactivated();

    // Act and Assert
    assertEquals(v4RoomReactivated, v4RoomReactivated);
    int expectedHashCodeResult = v4RoomReactivated.hashCode();
    assertEquals(expectedHashCodeResult, v4RoomReactivated.hashCode());
  }

  /**
   * Test {@link V4RoomReactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomReactivated#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomReactivated.equals(Object)",
    "int V4RoomReactivated.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomReactivated(), null);
  }

  /**
   * Test {@link V4RoomReactivated#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4RoomReactivated#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V4RoomReactivated.equals(Object)",
    "int V4RoomReactivated.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4RoomReactivated(), "Different type to V4RoomReactivated");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4RoomReactivated}
   *   <li>{@link V4RoomReactivated#setStream(V4Stream)}
   *   <li>{@link V4RoomReactivated#stream(V4Stream)}
   *   <li>{@link V4RoomReactivated#toString()}
   *   <li>{@link V4RoomReactivated#getStream()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4RoomReactivated.<init>()",
    "V4Stream V4RoomReactivated.getStream()",
    "void V4RoomReactivated.setStream(V4Stream)",
    "V4RoomReactivated V4RoomReactivated.stream(V4Stream)",
    "String V4RoomReactivated.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V4RoomReactivated actualV4RoomReactivated = new V4RoomReactivated();
    actualV4RoomReactivated.setStream(new V4Stream());
    V4Stream stream = new V4Stream();
    V4RoomReactivated actualStreamResult = actualV4RoomReactivated.stream(stream);
    String actualToStringResult = actualV4RoomReactivated.toString();
    V4Stream actualStream = actualV4RoomReactivated.getStream();

    // Assert
    assertEquals(
        "class V4RoomReactivated {\n"
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
    assertSame(actualV4RoomReactivated, actualStreamResult);
    assertSame(stream, actualStream);
  }
}
