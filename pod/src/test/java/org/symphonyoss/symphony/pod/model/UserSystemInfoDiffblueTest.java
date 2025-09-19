package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.UserSystemInfo.StatusEnum;

public class UserSystemInfoDiffblueTest {
  /**
   * Test {@link UserSystemInfo#equals(Object)}, and {@link UserSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSystemInfo#equals(Object)}
   *   <li>{@link UserSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    UserSystemInfo userSystemInfo2 = new UserSystemInfo();

    // Act and Assert
    assertEquals(userSystemInfo, userSystemInfo2);
    assertEquals(userSystemInfo.hashCode(), userSystemInfo2.hashCode());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}, and {@link UserSystemInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserSystemInfo#equals(Object)}
   *   <li>{@link UserSystemInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();

    // Act and Assert
    assertEquals(userSystemInfo, userSystemInfo);
    int expectedHashCodeResult = userSystemInfo.hashCode();
    assertEquals(expectedHashCodeResult, userSystemInfo.hashCode());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), 1);
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.id(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.createdDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.createdBy("Jan 1, 2020 8:00am GMT+0100");

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastUpdatedDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastLoginDate(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    userSystemInfo.lastPasswordReset(1L);

    // Act and Assert
    assertNotEquals(userSystemInfo, new UserSystemInfo());
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), null);
  }

  /**
   * Test {@link UserSystemInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserSystemInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserSystemInfo.equals(Object)", "int UserSystemInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSystemInfo(), "Different type to UserSystemInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSystemInfo}
   *   <li>{@link UserSystemInfo#createdBy(String)}
   *   <li>{@link UserSystemInfo#createdDate(Long)}
   *   <li>{@link UserSystemInfo#id(Long)}
   *   <li>{@link UserSystemInfo#lastLoginDate(Long)}
   *   <li>{@link UserSystemInfo#lastPasswordReset(Long)}
   *   <li>{@link UserSystemInfo#lastUpdatedDate(Long)}
   *   <li>{@link UserSystemInfo#setCreatedBy(String)}
   *   <li>{@link UserSystemInfo#setCreatedDate(Long)}
   *   <li>{@link UserSystemInfo#setId(Long)}
   *   <li>{@link UserSystemInfo#setLastLoginDate(Long)}
   *   <li>{@link UserSystemInfo#setLastPasswordReset(Long)}
   *   <li>{@link UserSystemInfo#setLastUpdatedDate(Long)}
   *   <li>{@link UserSystemInfo#setStatus(StatusEnum)}
   *   <li>{@link UserSystemInfo#status(StatusEnum)}
   *   <li>{@link UserSystemInfo#toString()}
   *   <li>{@link UserSystemInfo#getCreatedBy()}
   *   <li>{@link UserSystemInfo#getCreatedDate()}
   *   <li>{@link UserSystemInfo#getId()}
   *   <li>{@link UserSystemInfo#getLastLoginDate()}
   *   <li>{@link UserSystemInfo#getLastPasswordReset()}
   *   <li>{@link UserSystemInfo#getLastUpdatedDate()}
   *   <li>{@link UserSystemInfo#getStatus()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserSystemInfo.<init>()",
    "UserSystemInfo UserSystemInfo.createdBy(String)",
    "UserSystemInfo UserSystemInfo.createdDate(Long)",
    "String UserSystemInfo.getCreatedBy()",
    "Long UserSystemInfo.getCreatedDate()",
    "Long UserSystemInfo.getId()",
    "Long UserSystemInfo.getLastLoginDate()",
    "Long UserSystemInfo.getLastPasswordReset()",
    "Long UserSystemInfo.getLastUpdatedDate()",
    "StatusEnum UserSystemInfo.getStatus()",
    "UserSystemInfo UserSystemInfo.id(Long)",
    "UserSystemInfo UserSystemInfo.lastLoginDate(Long)",
    "UserSystemInfo UserSystemInfo.lastPasswordReset(Long)",
    "UserSystemInfo UserSystemInfo.lastUpdatedDate(Long)",
    "void UserSystemInfo.setCreatedBy(String)",
    "void UserSystemInfo.setCreatedDate(Long)",
    "void UserSystemInfo.setId(Long)",
    "void UserSystemInfo.setLastLoginDate(Long)",
    "void UserSystemInfo.setLastPasswordReset(Long)",
    "void UserSystemInfo.setLastUpdatedDate(Long)",
    "void UserSystemInfo.setStatus(StatusEnum)",
    "UserSystemInfo UserSystemInfo.status(StatusEnum)",
    "String UserSystemInfo.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserSystemInfo actualUserSystemInfo = new UserSystemInfo();
    UserSystemInfo actualCreatedByResult =
        actualUserSystemInfo.createdBy("Jan 1, 2020 8:00am GMT+0100");
    UserSystemInfo actualCreatedDateResult = actualUserSystemInfo.createdDate(1L);
    UserSystemInfo actualIdResult = actualUserSystemInfo.id(1L);
    UserSystemInfo actualLastLoginDateResult = actualUserSystemInfo.lastLoginDate(1L);
    UserSystemInfo actualLastPasswordResetResult = actualUserSystemInfo.lastPasswordReset(1L);
    UserSystemInfo actualLastUpdatedDateResult = actualUserSystemInfo.lastUpdatedDate(1L);
    actualUserSystemInfo.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
    actualUserSystemInfo.setCreatedDate(1L);
    actualUserSystemInfo.setId(1L);
    actualUserSystemInfo.setLastLoginDate(1L);
    actualUserSystemInfo.setLastPasswordReset(1L);
    actualUserSystemInfo.setLastUpdatedDate(1L);
    actualUserSystemInfo.setStatus(StatusEnum.ENABLED);
    UserSystemInfo actualStatusResult = actualUserSystemInfo.status(StatusEnum.ENABLED);
    String actualToStringResult = actualUserSystemInfo.toString();
    String actualCreatedBy = actualUserSystemInfo.getCreatedBy();
    Long actualCreatedDate = actualUserSystemInfo.getCreatedDate();
    Long actualId = actualUserSystemInfo.getId();
    Long actualLastLoginDate = actualUserSystemInfo.getLastLoginDate();
    Long actualLastPasswordReset = actualUserSystemInfo.getLastPasswordReset();
    Long actualLastUpdatedDate = actualUserSystemInfo.getLastUpdatedDate();
    StatusEnum actualStatus = actualUserSystemInfo.getStatus();

    // Assert
    assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
    assertEquals(
        "class UserSystemInfo {\n"
            + "    id: 1\n"
            + "    status: ENABLED\n"
            + "    createdDate: 1\n"
            + "    createdBy: Jan 1, 2020 8:00am GMT+0100\n"
            + "    lastUpdatedDate: 1\n"
            + "    lastLoginDate: 1\n"
            + "    lastPasswordReset: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualId.longValue());
    assertEquals(1L, actualLastLoginDate.longValue());
    assertEquals(1L, actualLastPasswordReset.longValue());
    assertEquals(1L, actualLastUpdatedDate.longValue());
    assertEquals(StatusEnum.ENABLED, actualStatus);
    assertSame(actualUserSystemInfo, actualCreatedByResult);
    assertSame(actualUserSystemInfo, actualCreatedDateResult);
    assertSame(actualUserSystemInfo, actualIdResult);
    assertSame(actualUserSystemInfo, actualLastLoginDateResult);
    assertSame(actualUserSystemInfo, actualLastPasswordResetResult);
    assertSame(actualUserSystemInfo, actualLastUpdatedDateResult);
    assertSame(actualUserSystemInfo, actualStatusResult);
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
