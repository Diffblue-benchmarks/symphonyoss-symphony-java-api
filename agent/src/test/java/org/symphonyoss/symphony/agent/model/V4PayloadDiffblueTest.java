package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4PayloadDiffblueTest {
  /**
   * Test {@link V4Payload#equals(Object)}, and {@link V4Payload#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Payload#equals(Object)}
   *   <li>{@link V4Payload#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    V4Payload v4Payload2 = new V4Payload();

    // Act and Assert
    assertEquals(v4Payload, v4Payload2);
    assertEquals(v4Payload.hashCode(), v4Payload2.hashCode());
  }

  /**
   * Test {@link V4Payload#equals(Object)}, and {@link V4Payload#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4Payload#equals(Object)}
   *   <li>{@link V4Payload#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Payload v4Payload = new V4Payload();

    // Act and Assert
    assertEquals(v4Payload, v4Payload);
    int expectedHashCodeResult = v4Payload.hashCode();
    assertEquals(expectedHashCodeResult, v4Payload.hashCode());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Payload(), 1);
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.messageSent(new V4MessageSent());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.sharedPost(new V4SharedPost());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.instantMessageCreated(new V4InstantMessageCreated());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomCreated(new V4RoomCreated());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomUpdated(new V4RoomUpdated());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomDeactivated(new V4RoomDeactivated());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomReactivated(new V4RoomReactivated());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.userJoinedRoom(new V4UserJoinedRoom());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.userLeftRoom(new V4UserLeftRoom());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomMemberPromotedToOwner(new V4RoomMemberPromotedToOwner());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.roomMemberDemotedFromOwner(new V4RoomMemberDemotedFromOwner());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.connectionRequested(new V4ConnectionRequested());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.connectionAccepted(new V4ConnectionAccepted());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    V4Payload v4Payload = new V4Payload();
    v4Payload.messageSuppressed(new V4MessageSuppressed());

    // Act and Assert
    assertNotEquals(v4Payload, new V4Payload());
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Payload(), null);
  }

  /**
   * Test {@link V4Payload#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4Payload#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4Payload.equals(Object)", "int V4Payload.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Payload(), "Different type to V4Payload");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Payload}
   *   <li>{@link V4Payload#connectionAccepted(V4ConnectionAccepted)}
   *   <li>{@link V4Payload#connectionRequested(V4ConnectionRequested)}
   *   <li>{@link V4Payload#instantMessageCreated(V4InstantMessageCreated)}
   *   <li>{@link V4Payload#messageSent(V4MessageSent)}
   *   <li>{@link V4Payload#messageSuppressed(V4MessageSuppressed)}
   *   <li>{@link V4Payload#roomCreated(V4RoomCreated)}
   *   <li>{@link V4Payload#roomDeactivated(V4RoomDeactivated)}
   *   <li>{@link V4Payload#roomMemberDemotedFromOwner(V4RoomMemberDemotedFromOwner)}
   *   <li>{@link V4Payload#roomMemberPromotedToOwner(V4RoomMemberPromotedToOwner)}
   *   <li>{@link V4Payload#roomReactivated(V4RoomReactivated)}
   *   <li>{@link V4Payload#roomUpdated(V4RoomUpdated)}
   *   <li>{@link V4Payload#setConnectionAccepted(V4ConnectionAccepted)}
   *   <li>{@link V4Payload#setConnectionRequested(V4ConnectionRequested)}
   *   <li>{@link V4Payload#setInstantMessageCreated(V4InstantMessageCreated)}
   *   <li>{@link V4Payload#setMessageSent(V4MessageSent)}
   *   <li>{@link V4Payload#setMessageSuppressed(V4MessageSuppressed)}
   *   <li>{@link V4Payload#setRoomCreated(V4RoomCreated)}
   *   <li>{@link V4Payload#setRoomDeactivated(V4RoomDeactivated)}
   *   <li>{@link V4Payload#setRoomMemberDemotedFromOwner(V4RoomMemberDemotedFromOwner)}
   *   <li>{@link V4Payload#setRoomMemberPromotedToOwner(V4RoomMemberPromotedToOwner)}
   *   <li>{@link V4Payload#setRoomReactivated(V4RoomReactivated)}
   *   <li>{@link V4Payload#setRoomUpdated(V4RoomUpdated)}
   *   <li>{@link V4Payload#setSharedPost(V4SharedPost)}
   *   <li>{@link V4Payload#setUserJoinedRoom(V4UserJoinedRoom)}
   *   <li>{@link V4Payload#setUserLeftRoom(V4UserLeftRoom)}
   *   <li>{@link V4Payload#sharedPost(V4SharedPost)}
   *   <li>{@link V4Payload#userJoinedRoom(V4UserJoinedRoom)}
   *   <li>{@link V4Payload#userLeftRoom(V4UserLeftRoom)}
   *   <li>{@link V4Payload#toString()}
   *   <li>{@link V4Payload#getConnectionAccepted()}
   *   <li>{@link V4Payload#getConnectionRequested()}
   *   <li>{@link V4Payload#getInstantMessageCreated()}
   *   <li>{@link V4Payload#getMessageSent()}
   *   <li>{@link V4Payload#getMessageSuppressed()}
   *   <li>{@link V4Payload#getRoomCreated()}
   *   <li>{@link V4Payload#getRoomDeactivated()}
   *   <li>{@link V4Payload#getRoomMemberDemotedFromOwner()}
   *   <li>{@link V4Payload#getRoomMemberPromotedToOwner()}
   *   <li>{@link V4Payload#getRoomReactivated()}
   *   <li>{@link V4Payload#getRoomUpdated()}
   *   <li>{@link V4Payload#getSharedPost()}
   *   <li>{@link V4Payload#getUserJoinedRoom()}
   *   <li>{@link V4Payload#getUserLeftRoom()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4Payload.<init>()",
    "V4Payload V4Payload.connectionAccepted(V4ConnectionAccepted)",
    "V4Payload V4Payload.connectionRequested(V4ConnectionRequested)",
    "V4ConnectionAccepted V4Payload.getConnectionAccepted()",
    "V4ConnectionRequested V4Payload.getConnectionRequested()",
    "V4InstantMessageCreated V4Payload.getInstantMessageCreated()",
    "V4MessageSent V4Payload.getMessageSent()",
    "V4MessageSuppressed V4Payload.getMessageSuppressed()",
    "V4RoomCreated V4Payload.getRoomCreated()",
    "V4RoomDeactivated V4Payload.getRoomDeactivated()",
    "V4RoomMemberDemotedFromOwner V4Payload.getRoomMemberDemotedFromOwner()",
    "V4RoomMemberPromotedToOwner V4Payload.getRoomMemberPromotedToOwner()",
    "V4RoomReactivated V4Payload.getRoomReactivated()",
    "V4RoomUpdated V4Payload.getRoomUpdated()",
    "V4SharedPost V4Payload.getSharedPost()",
    "V4UserJoinedRoom V4Payload.getUserJoinedRoom()",
    "V4UserLeftRoom V4Payload.getUserLeftRoom()",
    "V4Payload V4Payload.instantMessageCreated(V4InstantMessageCreated)",
    "V4Payload V4Payload.messageSent(V4MessageSent)",
    "V4Payload V4Payload.messageSuppressed(V4MessageSuppressed)",
    "V4Payload V4Payload.roomCreated(V4RoomCreated)",
    "V4Payload V4Payload.roomDeactivated(V4RoomDeactivated)",
    "V4Payload V4Payload.roomMemberDemotedFromOwner(V4RoomMemberDemotedFromOwner)",
    "V4Payload V4Payload.roomMemberPromotedToOwner(V4RoomMemberPromotedToOwner)",
    "V4Payload V4Payload.roomReactivated(V4RoomReactivated)",
    "V4Payload V4Payload.roomUpdated(V4RoomUpdated)",
    "void V4Payload.setConnectionAccepted(V4ConnectionAccepted)",
    "void V4Payload.setConnectionRequested(V4ConnectionRequested)",
    "void V4Payload.setInstantMessageCreated(V4InstantMessageCreated)",
    "void V4Payload.setMessageSent(V4MessageSent)",
    "void V4Payload.setMessageSuppressed(V4MessageSuppressed)",
    "void V4Payload.setRoomCreated(V4RoomCreated)",
    "void V4Payload.setRoomDeactivated(V4RoomDeactivated)",
    "void V4Payload.setRoomMemberDemotedFromOwner(V4RoomMemberDemotedFromOwner)",
    "void V4Payload.setRoomMemberPromotedToOwner(V4RoomMemberPromotedToOwner)",
    "void V4Payload.setRoomReactivated(V4RoomReactivated)",
    "void V4Payload.setRoomUpdated(V4RoomUpdated)",
    "void V4Payload.setSharedPost(V4SharedPost)",
    "void V4Payload.setUserJoinedRoom(V4UserJoinedRoom)",
    "void V4Payload.setUserLeftRoom(V4UserLeftRoom)",
    "V4Payload V4Payload.sharedPost(V4SharedPost)",
    "String V4Payload.toString()",
    "V4Payload V4Payload.userJoinedRoom(V4UserJoinedRoom)",
    "V4Payload V4Payload.userLeftRoom(V4UserLeftRoom)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V4Payload actualV4Payload = new V4Payload();
    V4Payload actualConnectionAcceptedResult =
        actualV4Payload.connectionAccepted(new V4ConnectionAccepted());
    V4Payload actualConnectionRequestedResult =
        actualV4Payload.connectionRequested(new V4ConnectionRequested());
    V4Payload actualInstantMessageCreatedResult =
        actualV4Payload.instantMessageCreated(new V4InstantMessageCreated());
    V4Payload actualMessageSentResult = actualV4Payload.messageSent(new V4MessageSent());
    V4Payload actualMessageSuppressedResult =
        actualV4Payload.messageSuppressed(new V4MessageSuppressed());
    V4Payload actualRoomCreatedResult = actualV4Payload.roomCreated(new V4RoomCreated());
    V4Payload actualRoomDeactivatedResult =
        actualV4Payload.roomDeactivated(new V4RoomDeactivated());
    V4Payload actualRoomMemberDemotedFromOwnerResult =
        actualV4Payload.roomMemberDemotedFromOwner(new V4RoomMemberDemotedFromOwner());
    V4Payload actualRoomMemberPromotedToOwnerResult =
        actualV4Payload.roomMemberPromotedToOwner(new V4RoomMemberPromotedToOwner());
    V4Payload actualRoomReactivatedResult =
        actualV4Payload.roomReactivated(new V4RoomReactivated());
    V4Payload actualRoomUpdatedResult = actualV4Payload.roomUpdated(new V4RoomUpdated());
    V4ConnectionAccepted connectionAccepted = new V4ConnectionAccepted();
    actualV4Payload.setConnectionAccepted(connectionAccepted);
    V4ConnectionRequested connectionRequested = new V4ConnectionRequested();
    actualV4Payload.setConnectionRequested(connectionRequested);
    V4InstantMessageCreated instantMessageCreated = new V4InstantMessageCreated();
    actualV4Payload.setInstantMessageCreated(instantMessageCreated);
    V4MessageSent messageSent = new V4MessageSent();
    actualV4Payload.setMessageSent(messageSent);
    V4MessageSuppressed messageSuppressed = new V4MessageSuppressed();
    actualV4Payload.setMessageSuppressed(messageSuppressed);
    V4RoomCreated roomCreated = new V4RoomCreated();
    actualV4Payload.setRoomCreated(roomCreated);
    V4RoomDeactivated roomDeactivated = new V4RoomDeactivated();
    actualV4Payload.setRoomDeactivated(roomDeactivated);
    V4RoomMemberDemotedFromOwner roomMemberDemotedFromOwner = new V4RoomMemberDemotedFromOwner();
    actualV4Payload.setRoomMemberDemotedFromOwner(roomMemberDemotedFromOwner);
    V4RoomMemberPromotedToOwner roomMemberPromotedToOwner = new V4RoomMemberPromotedToOwner();
    actualV4Payload.setRoomMemberPromotedToOwner(roomMemberPromotedToOwner);
    V4RoomReactivated roomReactivated = new V4RoomReactivated();
    actualV4Payload.setRoomReactivated(roomReactivated);
    V4RoomUpdated roomUpdated = new V4RoomUpdated();
    actualV4Payload.setRoomUpdated(roomUpdated);
    actualV4Payload.setSharedPost(new V4SharedPost());
    actualV4Payload.setUserJoinedRoom(new V4UserJoinedRoom());
    actualV4Payload.setUserLeftRoom(new V4UserLeftRoom());
    V4SharedPost sharedPost = new V4SharedPost();
    V4Payload actualSharedPostResult = actualV4Payload.sharedPost(sharedPost);
    V4UserJoinedRoom userJoinedRoom = new V4UserJoinedRoom();
    V4Payload actualUserJoinedRoomResult = actualV4Payload.userJoinedRoom(userJoinedRoom);
    V4UserLeftRoom userLeftRoom = new V4UserLeftRoom();
    V4Payload actualUserLeftRoomResult = actualV4Payload.userLeftRoom(userLeftRoom);
    String actualToStringResult = actualV4Payload.toString();
    V4ConnectionAccepted actualConnectionAccepted = actualV4Payload.getConnectionAccepted();
    V4ConnectionRequested actualConnectionRequested = actualV4Payload.getConnectionRequested();
    V4InstantMessageCreated actualInstantMessageCreated =
        actualV4Payload.getInstantMessageCreated();
    V4MessageSent actualMessageSent = actualV4Payload.getMessageSent();
    V4MessageSuppressed actualMessageSuppressed = actualV4Payload.getMessageSuppressed();
    V4RoomCreated actualRoomCreated = actualV4Payload.getRoomCreated();
    V4RoomDeactivated actualRoomDeactivated = actualV4Payload.getRoomDeactivated();
    V4RoomMemberDemotedFromOwner actualRoomMemberDemotedFromOwner =
        actualV4Payload.getRoomMemberDemotedFromOwner();
    V4RoomMemberPromotedToOwner actualRoomMemberPromotedToOwner =
        actualV4Payload.getRoomMemberPromotedToOwner();
    V4RoomReactivated actualRoomReactivated = actualV4Payload.getRoomReactivated();
    V4RoomUpdated actualRoomUpdated = actualV4Payload.getRoomUpdated();
    V4SharedPost actualSharedPost = actualV4Payload.getSharedPost();
    V4UserJoinedRoom actualUserJoinedRoom = actualV4Payload.getUserJoinedRoom();
    V4UserLeftRoom actualUserLeftRoom = actualV4Payload.getUserLeftRoom();

    // Assert
    assertEquals(
        "class V4Payload {\n"
            + "    messageSent: class V4MessageSent {\n"
            + "        message: null\n"
            + "    }\n"
            + "    sharedPost: class V4SharedPost {\n"
            + "        message: null\n"
            + "        sharedMessage: null\n"
            + "    }\n"
            + "    instantMessageCreated: class V4InstantMessageCreated {\n"
            + "        stream: null\n"
            + "    }\n"
            + "    roomCreated: class V4RoomCreated {\n"
            + "        stream: null\n"
            + "        roomProperties: null\n"
            + "    }\n"
            + "    roomUpdated: class V4RoomUpdated {\n"
            + "        stream: null\n"
            + "        newRoomProperties: null\n"
            + "    }\n"
            + "    roomDeactivated: class V4RoomDeactivated {\n"
            + "        stream: null\n"
            + "    }\n"
            + "    roomReactivated: class V4RoomReactivated {\n"
            + "        stream: null\n"
            + "    }\n"
            + "    userJoinedRoom: class V4UserJoinedRoom {\n"
            + "        stream: null\n"
            + "        affectedUser: null\n"
            + "    }\n"
            + "    userLeftRoom: class V4UserLeftRoom {\n"
            + "        stream: null\n"
            + "        affectedUser: null\n"
            + "    }\n"
            + "    roomMemberPromotedToOwner: class V4RoomMemberPromotedToOwner {\n"
            + "        stream: null\n"
            + "        affectedUser: null\n"
            + "    }\n"
            + "    roomMemberDemotedFromOwner: class V4RoomMemberDemotedFromOwner {\n"
            + "        stream: null\n"
            + "        affectedUser: null\n"
            + "    }\n"
            + "    connectionRequested: class V4ConnectionRequested {\n"
            + "        toUser: null\n"
            + "    }\n"
            + "    connectionAccepted: class V4ConnectionAccepted {\n"
            + "        fromUser: null\n"
            + "    }\n"
            + "    messageSuppressed: class V4MessageSuppressed {\n"
            + "        messageId: null\n"
            + "        stream: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertNull(actualMessageSent.getMessage());
    assertNull(actualInstantMessageCreated.getStream());
    assertNull(actualRoomDeactivated.getStream());
    assertNull(actualRoomReactivated.getStream());
    assertNull(actualConnectionAccepted.getFromUser());
    assertNull(actualConnectionRequested.getToUser());
    assertSame(connectionAccepted, actualConnectionAccepted);
    assertSame(connectionRequested, actualConnectionRequested);
    assertSame(instantMessageCreated, actualInstantMessageCreated);
    assertSame(messageSent, actualMessageSent);
    assertSame(messageSuppressed, actualMessageSuppressed);
    assertSame(actualV4Payload, actualConnectionAcceptedResult);
    assertSame(actualV4Payload, actualConnectionRequestedResult);
    assertSame(actualV4Payload, actualInstantMessageCreatedResult);
    assertSame(actualV4Payload, actualMessageSentResult);
    assertSame(actualV4Payload, actualMessageSuppressedResult);
    assertSame(actualV4Payload, actualRoomCreatedResult);
    assertSame(actualV4Payload, actualRoomDeactivatedResult);
    assertSame(actualV4Payload, actualRoomMemberDemotedFromOwnerResult);
    assertSame(actualV4Payload, actualRoomMemberPromotedToOwnerResult);
    assertSame(actualV4Payload, actualRoomReactivatedResult);
    assertSame(actualV4Payload, actualRoomUpdatedResult);
    assertSame(actualV4Payload, actualSharedPostResult);
    assertSame(actualV4Payload, actualUserJoinedRoomResult);
    assertSame(actualV4Payload, actualUserLeftRoomResult);
    assertSame(roomCreated, actualRoomCreated);
    assertSame(roomDeactivated, actualRoomDeactivated);
    assertSame(roomMemberDemotedFromOwner, actualRoomMemberDemotedFromOwner);
    assertSame(roomMemberPromotedToOwner, actualRoomMemberPromotedToOwner);
    assertSame(roomReactivated, actualRoomReactivated);
    assertSame(roomUpdated, actualRoomUpdated);
    assertSame(sharedPost, actualSharedPost);
    assertSame(userJoinedRoom, actualUserJoinedRoom);
    assertSame(userLeftRoom, actualUserLeftRoom);
  }
}
