package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoomTagDiffblueTest {
  /**
   * Test {@link RoomTag#equals(Object)}, and {@link RoomTag#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomTag#equals(Object)}
   *   <li>{@link RoomTag#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomTag roomTag = new RoomTag();
    RoomTag roomTag2 = new RoomTag();

    // Act and Assert
    assertEquals(roomTag, roomTag2);
    assertEquals(roomTag.hashCode(), roomTag2.hashCode());
  }

  /**
   * Test {@link RoomTag#equals(Object)}, and {@link RoomTag#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RoomTag#equals(Object)}
   *   <li>{@link RoomTag#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomTag roomTag = new RoomTag();

    // Act and Assert
    assertEquals(roomTag, roomTag);
    int expectedHashCodeResult = roomTag.hashCode();
    assertEquals(expectedHashCodeResult, roomTag.hashCode());
  }

  /**
   * Test {@link RoomTag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomTag#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomTag(), 1);
  }

  /**
   * Test {@link RoomTag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomTag#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomTag roomTag = new RoomTag();
    roomTag.key("Key");

    // Act and Assert
    assertNotEquals(roomTag, new RoomTag());
  }

  /**
   * Test {@link RoomTag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomTag#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomTag roomTag = new RoomTag();
    roomTag.value("42");

    // Act and Assert
    assertNotEquals(roomTag, new RoomTag());
  }

  /**
   * Test {@link RoomTag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomTag#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomTag(), null);
  }

  /**
   * Test {@link RoomTag#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RoomTag#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RoomTag.equals(Object)", "int RoomTag.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomTag(), "Different type to RoomTag");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomTag}
   *   <li>{@link RoomTag#key(String)}
   *   <li>{@link RoomTag#setKey(String)}
   *   <li>{@link RoomTag#setValue(String)}
   *   <li>{@link RoomTag#value(String)}
   *   <li>{@link RoomTag#toString()}
   *   <li>{@link RoomTag#getKey()}
   *   <li>{@link RoomTag#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RoomTag.<init>()",
    "String RoomTag.getKey()",
    "String RoomTag.getValue()",
    "RoomTag RoomTag.key(String)",
    "void RoomTag.setKey(String)",
    "void RoomTag.setValue(String)",
    "String RoomTag.toString()",
    "RoomTag RoomTag.value(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    RoomTag actualRoomTag = new RoomTag();
    RoomTag actualKeyResult = actualRoomTag.key("Key");
    actualRoomTag.setKey("Key");
    actualRoomTag.setValue("42");
    RoomTag actualValueResult = actualRoomTag.value("42");
    String actualToStringResult = actualRoomTag.toString();
    String actualKey = actualRoomTag.getKey();

    // Assert
    assertEquals("42", actualRoomTag.getValue());
    assertEquals("Key", actualKey);
    assertEquals("class RoomTag {\n    key: Key\n    value: 42\n}", actualToStringResult);
    assertSame(actualRoomTag, actualKeyResult);
    assertSame(actualRoomTag, actualValueResult);
  }
}
