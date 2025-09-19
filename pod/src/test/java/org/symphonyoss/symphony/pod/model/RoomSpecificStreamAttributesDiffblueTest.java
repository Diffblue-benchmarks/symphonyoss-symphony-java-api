package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoomSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomSpecificStreamAttributes roomSpecificStreamAttributes = new RoomSpecificStreamAttributes();
    RoomSpecificStreamAttributes roomSpecificStreamAttributes2 = new RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(roomSpecificStreamAttributes, roomSpecificStreamAttributes2);
    assertEquals(roomSpecificStreamAttributes.hashCode(), roomSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}, and {@link
   * RoomSpecificStreamAttributes#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomSpecificStreamAttributes#equals(Object)}
   *   <li>{@link RoomSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomSpecificStreamAttributes roomSpecificStreamAttributes = new RoomSpecificStreamAttributes();

    // Act and Assert
    assertEquals(roomSpecificStreamAttributes, roomSpecificStreamAttributes);
    int expectedHashCodeResult = roomSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, roomSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link RoomSpecificStreamAttributes#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RoomSpecificStreamAttributes.equals(Object)",
    "int RoomSpecificStreamAttributes.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RoomSpecificStreamAttributes(), "Different type to RoomSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomSpecificStreamAttributes}
   *   <li>{@link RoomSpecificStreamAttributes#name(String)}
   *   <li>{@link RoomSpecificStreamAttributes#setName(String)}
   *   <li>{@link RoomSpecificStreamAttributes#toString()}
   *   <li>{@link RoomSpecificStreamAttributes#getName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomSpecificStreamAttributes.<init>()",
    "String RoomSpecificStreamAttributes.getName()",
    "RoomSpecificStreamAttributes RoomSpecificStreamAttributes.name(String)",
    "void RoomSpecificStreamAttributes.setName(String)",
    "String RoomSpecificStreamAttributes.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    RoomSpecificStreamAttributes actualRoomSpecificStreamAttributes =
        new RoomSpecificStreamAttributes();
    RoomSpecificStreamAttributes actualNameResult = actualRoomSpecificStreamAttributes.name("Name");
    actualRoomSpecificStreamAttributes.setName("Name");
    String actualToStringResult = actualRoomSpecificStreamAttributes.toString();

    // Assert
    assertEquals("Name", actualRoomSpecificStreamAttributes.getName());
    assertEquals("class RoomSpecificStreamAttributes {\n    name: Name\n}", actualToStringResult);
    assertSame(actualRoomSpecificStreamAttributes, actualNameResult);
  }
}
