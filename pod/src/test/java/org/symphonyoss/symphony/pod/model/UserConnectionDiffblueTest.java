package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.UserConnection.StatusEnum;

public class UserConnectionDiffblueTest {
  /**
   * Test {@link UserConnection#equals(Object)}, and {@link UserConnection#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnection#equals(Object)}
   *   <li>{@link UserConnection#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    UserConnection userConnection2 = new UserConnection();

    // Act and Assert
    assertEquals(userConnection, userConnection2);
    int expectedHashCodeResult = userConnection.hashCode();
    assertEquals(expectedHashCodeResult, userConnection2.hashCode());
  }

  /**
   * Test {@link UserConnection#equals(Object)}, and {@link UserConnection#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserConnection#equals(Object)}
   *   <li>{@link UserConnection#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserConnection userConnection = new UserConnection();

    // Act and Assert
    assertEquals(userConnection, userConnection);
    int expectedHashCodeResult = userConnection.hashCode();
    assertEquals(expectedHashCodeResult, userConnection.hashCode());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), 1);
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.userId(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.status(StatusEnum.PENDING_INCOMING);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.firstRequestedAt(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.updatedAt(1L);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserConnection userConnection = new UserConnection();
    userConnection.requestCounter(3);

    // Act and Assert
    assertNotEquals(userConnection, new UserConnection());
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), null);
  }

  /**
   * Test {@link UserConnection#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserConnection#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserConnection.equals(Object)", "int UserConnection.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnection(), "Different type to UserConnection");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserConnection}
   *   <li>{@link UserConnection#firstRequestedAt(Long)}
   *   <li>{@link UserConnection#requestCounter(Integer)}
   *   <li>{@link UserConnection#setFirstRequestedAt(Long)}
   *   <li>{@link UserConnection#setRequestCounter(Integer)}
   *   <li>{@link UserConnection#setStatus(StatusEnum)}
   *   <li>{@link UserConnection#setUpdatedAt(Long)}
   *   <li>{@link UserConnection#setUserId(Long)}
   *   <li>{@link UserConnection#status(StatusEnum)}
   *   <li>{@link UserConnection#updatedAt(Long)}
   *   <li>{@link UserConnection#userId(Long)}
   *   <li>{@link UserConnection#toString()}
   *   <li>{@link UserConnection#getFirstRequestedAt()}
   *   <li>{@link UserConnection#getRequestCounter()}
   *   <li>{@link UserConnection#getStatus()}
   *   <li>{@link UserConnection#getUpdatedAt()}
   *   <li>{@link UserConnection#getUserId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserConnection.<init>()", "UserConnection UserConnection.firstRequestedAt(Long)",
      "Long UserConnection.getFirstRequestedAt()", "Integer UserConnection.getRequestCounter()",
      "StatusEnum UserConnection.getStatus()", "Long UserConnection.getUpdatedAt()", "Long UserConnection.getUserId()",
      "UserConnection UserConnection.requestCounter(Integer)", "void UserConnection.setFirstRequestedAt(Long)",
      "void UserConnection.setRequestCounter(Integer)", "void UserConnection.setStatus(StatusEnum)",
      "void UserConnection.setUpdatedAt(Long)", "void UserConnection.setUserId(Long)",
      "UserConnection UserConnection.status(StatusEnum)", "String UserConnection.toString()",
      "UserConnection UserConnection.updatedAt(Long)", "UserConnection UserConnection.userId(Long)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserConnection actualUserConnection = new UserConnection();
    UserConnection actualFirstRequestedAtResult = actualUserConnection.firstRequestedAt(1L);
    UserConnection actualRequestCounterResult = actualUserConnection.requestCounter(3);
    actualUserConnection.setFirstRequestedAt(1L);
    actualUserConnection.setRequestCounter(3);
    actualUserConnection.setStatus(StatusEnum.PENDING_INCOMING);
    actualUserConnection.setUpdatedAt(1L);
    actualUserConnection.setUserId(1L);
    UserConnection actualStatusResult = actualUserConnection.status(StatusEnum.PENDING_INCOMING);
    UserConnection actualUpdatedAtResult = actualUserConnection.updatedAt(1L);
    UserConnection actualUserIdResult = actualUserConnection.userId(1L);
    String actualToStringResult = actualUserConnection.toString();
    Long actualFirstRequestedAt = actualUserConnection.getFirstRequestedAt();
    Integer actualRequestCounter = actualUserConnection.getRequestCounter();
    StatusEnum actualStatus = actualUserConnection.getStatus();
    Long actualUpdatedAt = actualUserConnection.getUpdatedAt();
    Long actualUserId = actualUserConnection.getUserId();

    // Assert
    assertEquals("class UserConnection {\n" + "    userId: 1\n" + "    status: PENDING_INCOMING\n"
        + "    firstRequestedAt: 1\n" + "    updatedAt: 1\n" + "    requestCounter: 3\n" + "}", actualToStringResult);
    assertEquals(1L, actualFirstRequestedAt.longValue());
    assertEquals(1L, actualUpdatedAt.longValue());
    assertEquals(1L, actualUserId.longValue());
    assertEquals(3, actualRequestCounter.intValue());
    assertEquals(StatusEnum.PENDING_INCOMING, actualStatus);
    assertSame(actualUserConnection, actualFirstRequestedAtResult);
    assertSame(actualUserConnection, actualRequestCounterResult);
    assertSame(actualUserConnection, actualStatusResult);
    assertSame(actualUserConnection, actualUpdatedAtResult);
    assertSame(actualUserConnection, actualUserIdResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code PENDING_INCOMING}.</li>
   *   <li>Then return {@code PENDING_INCOMING}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenPendingIncoming_thenReturnPendingIncoming() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.PENDING_INCOMING, StatusEnum.fromValue("PENDING_INCOMING"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("Text"));
  }

  /**
   * Test StatusEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  public void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("PENDING_INCOMING");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("PENDING_INCOMING", valueOfResult.getValue());
    assertEquals("PENDING_INCOMING", actualToStringResult);
  }
}
