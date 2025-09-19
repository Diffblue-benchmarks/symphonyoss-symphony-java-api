package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.UserStatus.StatusEnum;

public class UserStatusDiffblueTest {
  /**
   * Test {@link UserStatus#equals(Object)}, and {@link UserStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserStatus#equals(Object)}
   *   <li>{@link UserStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserStatus userStatus = new UserStatus();
    UserStatus userStatus2 = new UserStatus();

    // Act and Assert
    assertEquals(userStatus, userStatus2);
    assertEquals(userStatus.hashCode(), userStatus2.hashCode());
  }

  /**
   * Test {@link UserStatus#equals(Object)}, and {@link UserStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserStatus#equals(Object)}
   *   <li>{@link UserStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserStatus userStatus = new UserStatus();

    // Act and Assert
    assertEquals(userStatus, userStatus);
    int expectedHashCodeResult = userStatus.hashCode();
    assertEquals(expectedHashCodeResult, userStatus.hashCode());
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserStatus(), null);
  }

  /**
   * Test {@link UserStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserStatus.equals(Object)", "int UserStatus.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserStatus(), "Different type to UserStatus");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserStatus}
   *   <li>{@link UserStatus#setStatus(StatusEnum)}
   *   <li>{@link UserStatus#status(StatusEnum)}
   *   <li>{@link UserStatus#toString()}
   *   <li>{@link UserStatus#getStatus()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserStatus.<init>()",
    "StatusEnum UserStatus.getStatus()",
    "void UserStatus.setStatus(StatusEnum)",
    "UserStatus UserStatus.status(StatusEnum)",
    "String UserStatus.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserStatus actualUserStatus = new UserStatus();
    actualUserStatus.setStatus(StatusEnum.ENABLED);
    UserStatus actualStatusResult = actualUserStatus.status(StatusEnum.ENABLED);
    String actualToStringResult = actualUserStatus.toString();

    // Assert
    assertEquals("class UserStatus {\n    status: ENABLED\n}", actualToStringResult);
    assertEquals(StatusEnum.ENABLED, actualUserStatus.getStatus());
    assertSame(actualUserStatus, actualStatusResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ENABLED}.
   *   <li>Then return {@code ENABLED}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenEnabled_thenReturnEnabled() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ENABLED, StatusEnum.fromValue("ENABLED"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("Text"));
  }

  /**
   * Test StatusEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  public void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("ENABLED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ENABLED", valueOfResult.getValue());
    assertEquals("ENABLED", actualToStringResult);
  }
}
