package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoomMemberDemotedFromOwnerMessageDiffblueTest {
  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}, and {@link RoomMemberDemotedFromOwnerMessage#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage2 = new RoomMemberDemotedFromOwnerMessage();

    // Act and Assert
    assertEquals(roomMemberDemotedFromOwnerMessage, roomMemberDemotedFromOwnerMessage2);
    int expectedHashCodeResult = roomMemberDemotedFromOwnerMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberDemotedFromOwnerMessage2.hashCode());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}, and {@link RoomMemberDemotedFromOwnerMessage#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();

    // Act and Assert
    assertEquals(roomMemberDemotedFromOwnerMessage, roomMemberDemotedFromOwnerMessage);
    int expectedHashCodeResult = roomMemberDemotedFromOwnerMessage.hashCode();
    assertEquals(expectedHashCodeResult, roomMemberDemotedFromOwnerMessage.hashCode());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberDemotedFromOwnerMessage(), 1);
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();
    roomMemberDemotedFromOwnerMessage.demotedByUserId(1L);

    // Act and Assert
    assertNotEquals(roomMemberDemotedFromOwnerMessage, new RoomMemberDemotedFromOwnerMessage());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();
    roomMemberDemotedFromOwnerMessage.demotedUserId(1L);

    // Act and Assert
    assertNotEquals(roomMemberDemotedFromOwnerMessage, new RoomMemberDemotedFromOwnerMessage());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();
    roomMemberDemotedFromOwnerMessage.id("42");

    // Act and Assert
    assertNotEquals(roomMemberDemotedFromOwnerMessage, new RoomMemberDemotedFromOwnerMessage());
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberDemotedFromOwnerMessage(), null);
  }

  /**
   * Test {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomMemberDemotedFromOwnerMessage#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomMemberDemotedFromOwnerMessage.equals(Object)",
      "int RoomMemberDemotedFromOwnerMessage.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomMemberDemotedFromOwnerMessage(), "Different type to RoomMemberDemotedFromOwnerMessage");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomMemberDemotedFromOwnerMessage}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#demotedByUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#demotedUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#setDemotedByUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#setDemotedUserId(Long)}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#toString()}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#getDemotedByUserId()}
   *   <li>{@link RoomMemberDemotedFromOwnerMessage#getDemotedUserId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void RoomMemberDemotedFromOwnerMessage.<init>()",
      "RoomMemberDemotedFromOwnerMessage RoomMemberDemotedFromOwnerMessage.demotedByUserId(Long)",
      "RoomMemberDemotedFromOwnerMessage RoomMemberDemotedFromOwnerMessage.demotedUserId(Long)",
      "Long RoomMemberDemotedFromOwnerMessage.getDemotedByUserId()",
      "Long RoomMemberDemotedFromOwnerMessage.getDemotedUserId()",
      "void RoomMemberDemotedFromOwnerMessage.setDemotedByUserId(Long)",
      "void RoomMemberDemotedFromOwnerMessage.setDemotedUserId(Long)",
      "String RoomMemberDemotedFromOwnerMessage.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    RoomMemberDemotedFromOwnerMessage actualRoomMemberDemotedFromOwnerMessage = new RoomMemberDemotedFromOwnerMessage();
    RoomMemberDemotedFromOwnerMessage actualDemotedByUserIdResult = actualRoomMemberDemotedFromOwnerMessage
        .demotedByUserId(1L);
    RoomMemberDemotedFromOwnerMessage actualDemotedUserIdResult = actualRoomMemberDemotedFromOwnerMessage
        .demotedUserId(1L);
    actualRoomMemberDemotedFromOwnerMessage.setDemotedByUserId(1L);
    actualRoomMemberDemotedFromOwnerMessage.setDemotedUserId(1L);
    String actualToStringResult = actualRoomMemberDemotedFromOwnerMessage.toString();
    Long actualDemotedByUserId = actualRoomMemberDemotedFromOwnerMessage.getDemotedByUserId();
    Long actualDemotedUserId = actualRoomMemberDemotedFromOwnerMessage.getDemotedUserId();

    // Assert
    assertEquals("class RoomMemberDemotedFromOwnerMessage {\n" + "    class V2BaseMessage {\n" + "        id: null\n"
        + "        timestamp: null\n" + "        v2messageType: null\n" + "        streamId: null\n" + "    }\n"
        + "    demotedByUserId: 1\n" + "    demotedUserId: 1\n" + "}", actualToStringResult);
    assertNull(actualRoomMemberDemotedFromOwnerMessage.getId());
    assertNull(actualRoomMemberDemotedFromOwnerMessage.getStreamId());
    assertNull(actualRoomMemberDemotedFromOwnerMessage.getTimestamp());
    assertNull(actualRoomMemberDemotedFromOwnerMessage.getV2messageType());
    assertEquals(1L, actualDemotedByUserId.longValue());
    assertEquals(1L, actualDemotedUserId.longValue());
    assertSame(actualRoomMemberDemotedFromOwnerMessage, actualDemotedByUserIdResult);
    assertSame(actualRoomMemberDemotedFromOwnerMessage, actualDemotedUserIdResult);
  }
}
