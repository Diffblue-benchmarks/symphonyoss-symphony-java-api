package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ChannelSubscriberDiffblueTest {
  /**
   * Test {@link ChannelSubscriber#equals(Object)}, and {@link ChannelSubscriber#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChannelSubscriber#equals(Object)}
   *   <li>{@link ChannelSubscriber#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    ChannelSubscriber channelSubscriber2 = new ChannelSubscriber();

    // Act and Assert
    assertEquals(channelSubscriber, channelSubscriber2);
    assertEquals(channelSubscriber.hashCode(), channelSubscriber2.hashCode());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}, and {@link ChannelSubscriber#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChannelSubscriber#equals(Object)}
   *   <li>{@link ChannelSubscriber#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();

    // Act and Assert
    assertEquals(channelSubscriber, channelSubscriber);
    int expectedHashCodeResult = channelSubscriber.hashCode();
    assertEquals(expectedHashCodeResult, channelSubscriber.hashCode());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), 1);
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.pushed(true);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.owner(true);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.subscriberName("Subscriber Name");

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.userId(1L);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ChannelSubscriber channelSubscriber = new ChannelSubscriber();
    channelSubscriber.timestamp(10L);

    // Act and Assert
    assertNotEquals(channelSubscriber, new ChannelSubscriber());
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), null);
  }

  /**
   * Test {@link ChannelSubscriber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChannelSubscriber#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChannelSubscriber.equals(Object)",
    "int ChannelSubscriber.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChannelSubscriber(), "Different type to ChannelSubscriber");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ChannelSubscriber}
   *   <li>{@link ChannelSubscriber#owner(Boolean)}
   *   <li>{@link ChannelSubscriber#pushed(Boolean)}
   *   <li>{@link ChannelSubscriber#setOwner(Boolean)}
   *   <li>{@link ChannelSubscriber#setPushed(Boolean)}
   *   <li>{@link ChannelSubscriber#setSubscriberName(String)}
   *   <li>{@link ChannelSubscriber#setTimestamp(Long)}
   *   <li>{@link ChannelSubscriber#setUserId(Long)}
   *   <li>{@link ChannelSubscriber#subscriberName(String)}
   *   <li>{@link ChannelSubscriber#timestamp(Long)}
   *   <li>{@link ChannelSubscriber#userId(Long)}
   *   <li>{@link ChannelSubscriber#toString()}
   *   <li>{@link ChannelSubscriber#getOwner()}
   *   <li>{@link ChannelSubscriber#getPushed()}
   *   <li>{@link ChannelSubscriber#getSubscriberName()}
   *   <li>{@link ChannelSubscriber#getTimestamp()}
   *   <li>{@link ChannelSubscriber#getUserId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ChannelSubscriber.<init>()",
    "Boolean ChannelSubscriber.getOwner()",
    "Boolean ChannelSubscriber.getPushed()",
    "String ChannelSubscriber.getSubscriberName()",
    "Long ChannelSubscriber.getTimestamp()",
    "Long ChannelSubscriber.getUserId()",
    "ChannelSubscriber ChannelSubscriber.owner(Boolean)",
    "ChannelSubscriber ChannelSubscriber.pushed(Boolean)",
    "void ChannelSubscriber.setOwner(Boolean)",
    "void ChannelSubscriber.setPushed(Boolean)",
    "void ChannelSubscriber.setSubscriberName(String)",
    "void ChannelSubscriber.setTimestamp(Long)",
    "void ChannelSubscriber.setUserId(Long)",
    "ChannelSubscriber ChannelSubscriber.subscriberName(String)",
    "ChannelSubscriber ChannelSubscriber.timestamp(Long)",
    "String ChannelSubscriber.toString()",
    "ChannelSubscriber ChannelSubscriber.userId(Long)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ChannelSubscriber actualChannelSubscriber = new ChannelSubscriber();
    ChannelSubscriber actualOwnerResult = actualChannelSubscriber.owner(true);
    ChannelSubscriber actualPushedResult = actualChannelSubscriber.pushed(true);
    actualChannelSubscriber.setOwner(true);
    actualChannelSubscriber.setPushed(true);
    actualChannelSubscriber.setSubscriberName("Subscriber Name");
    actualChannelSubscriber.setTimestamp(10L);
    actualChannelSubscriber.setUserId(1L);
    ChannelSubscriber actualSubscriberNameResult =
        actualChannelSubscriber.subscriberName("Subscriber Name");
    ChannelSubscriber actualTimestampResult = actualChannelSubscriber.timestamp(10L);
    ChannelSubscriber actualUserIdResult = actualChannelSubscriber.userId(1L);
    String actualToStringResult = actualChannelSubscriber.toString();
    Boolean actualOwner = actualChannelSubscriber.getOwner();
    Boolean actualPushed = actualChannelSubscriber.getPushed();
    String actualSubscriberName = actualChannelSubscriber.getSubscriberName();
    Long actualTimestamp = actualChannelSubscriber.getTimestamp();
    Long actualUserId = actualChannelSubscriber.getUserId();

    // Assert
    assertEquals("Subscriber Name", actualSubscriberName);
    assertEquals(
        "class ChannelSubscriber {\n"
            + "    pushed: true\n"
            + "    owner: true\n"
            + "    subscriberName: Subscriber Name\n"
            + "    userId: 1\n"
            + "    timestamp: 10\n"
            + "}",
        actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertTrue(actualOwner);
    assertTrue(actualPushed);
    assertSame(actualChannelSubscriber, actualOwnerResult);
    assertSame(actualChannelSubscriber, actualPushedResult);
    assertSame(actualChannelSubscriber, actualSubscriberNameResult);
    assertSame(actualChannelSubscriber, actualTimestampResult);
    assertSame(actualChannelSubscriber, actualUserIdResult);
  }
}
