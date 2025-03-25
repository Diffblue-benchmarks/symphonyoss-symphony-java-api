package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.UserFilter.StatusEnum;
import org.symphonyoss.symphony.pod.model.UserFilter.UsertypeEnum;

public class UserFilterDiffblueTest {
  /**
   * Test {@link UserFilter#equals(Object)}, and {@link UserFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserFilter#equals(Object)}
   *   <li>{@link UserFilter#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    UserFilter userFilter2 = new UserFilter();

    // Act and Assert
    assertEquals(userFilter, userFilter2);
    int expectedHashCodeResult = userFilter.hashCode();
    assertEquals(expectedHashCodeResult, userFilter2.hashCode());
  }

  /**
   * Test {@link UserFilter#equals(Object)}, and {@link UserFilter#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserFilter#equals(Object)}
   *   <li>{@link UserFilter#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserFilter userFilter = new UserFilter();

    // Act and Assert
    assertEquals(userFilter, userFilter);
    int expectedHashCodeResult = userFilter.hashCode();
    assertEquals(expectedHashCodeResult, userFilter.hashCode());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), 1);
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.email("jane.doe@example.org");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.name("Name");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.department("Department");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.title("Dr");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.role("Role");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.feature("Feature");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.status(StatusEnum.ENABLED);

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.usertype(UsertypeEnum.NORMAL);

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserFilter userFilter = new UserFilter();
    userFilter.location("Location");

    // Act and Assert
    assertNotEquals(userFilter, new UserFilter());
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), null);
  }

  /**
   * Test {@link UserFilter#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserFilter.equals(Object)", "int UserFilter.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserFilter(), "Different type to UserFilter");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserFilter}
   *   <li>{@link UserFilter#department(String)}
   *   <li>{@link UserFilter#email(String)}
   *   <li>{@link UserFilter#feature(String)}
   *   <li>{@link UserFilter#location(String)}
   *   <li>{@link UserFilter#name(String)}
   *   <li>{@link UserFilter#role(String)}
   *   <li>{@link UserFilter#setDepartment(String)}
   *   <li>{@link UserFilter#setEmail(String)}
   *   <li>{@link UserFilter#setFeature(String)}
   *   <li>{@link UserFilter#setLocation(String)}
   *   <li>{@link UserFilter#setName(String)}
   *   <li>{@link UserFilter#setRole(String)}
   *   <li>{@link UserFilter#setStatus(StatusEnum)}
   *   <li>{@link UserFilter#setTitle(String)}
   *   <li>{@link UserFilter#setUsertype(UsertypeEnum)}
   *   <li>{@link UserFilter#status(StatusEnum)}
   *   <li>{@link UserFilter#title(String)}
   *   <li>{@link UserFilter#usertype(UsertypeEnum)}
   *   <li>{@link UserFilter#toString()}
   *   <li>{@link UserFilter#getDepartment()}
   *   <li>{@link UserFilter#getEmail()}
   *   <li>{@link UserFilter#getFeature()}
   *   <li>{@link UserFilter#getLocation()}
   *   <li>{@link UserFilter#getName()}
   *   <li>{@link UserFilter#getRole()}
   *   <li>{@link UserFilter#getStatus()}
   *   <li>{@link UserFilter#getTitle()}
   *   <li>{@link UserFilter#getUsertype()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserFilter.<init>()", "UserFilter UserFilter.department(String)",
      "UserFilter UserFilter.email(String)", "UserFilter UserFilter.feature(String)",
      "String UserFilter.getDepartment()", "String UserFilter.getEmail()", "String UserFilter.getFeature()",
      "String UserFilter.getLocation()", "String UserFilter.getName()", "String UserFilter.getRole()",
      "StatusEnum UserFilter.getStatus()", "String UserFilter.getTitle()", "UsertypeEnum UserFilter.getUsertype()",
      "UserFilter UserFilter.location(String)", "UserFilter UserFilter.name(String)",
      "UserFilter UserFilter.role(String)", "void UserFilter.setDepartment(String)", "void UserFilter.setEmail(String)",
      "void UserFilter.setFeature(String)", "void UserFilter.setLocation(String)", "void UserFilter.setName(String)",
      "void UserFilter.setRole(String)", "void UserFilter.setStatus(StatusEnum)", "void UserFilter.setTitle(String)",
      "void UserFilter.setUsertype(UsertypeEnum)", "UserFilter UserFilter.status(StatusEnum)",
      "UserFilter UserFilter.title(String)", "String UserFilter.toString()",
      "UserFilter UserFilter.usertype(UsertypeEnum)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserFilter actualUserFilter = new UserFilter();
    UserFilter actualDepartmentResult = actualUserFilter.department("Department");
    UserFilter actualEmailResult = actualUserFilter.email("jane.doe@example.org");
    UserFilter actualFeatureResult = actualUserFilter.feature("Feature");
    UserFilter actualLocationResult = actualUserFilter.location("Location");
    UserFilter actualNameResult = actualUserFilter.name("Name");
    UserFilter actualRoleResult = actualUserFilter.role("Role");
    actualUserFilter.setDepartment("Department");
    actualUserFilter.setEmail("jane.doe@example.org");
    actualUserFilter.setFeature("Feature");
    actualUserFilter.setLocation("Location");
    actualUserFilter.setName("Name");
    actualUserFilter.setRole("Role");
    actualUserFilter.setStatus(StatusEnum.ENABLED);
    actualUserFilter.setTitle("Dr");
    actualUserFilter.setUsertype(UsertypeEnum.NORMAL);
    UserFilter actualStatusResult = actualUserFilter.status(StatusEnum.ENABLED);
    UserFilter actualTitleResult = actualUserFilter.title("Dr");
    UserFilter actualUsertypeResult = actualUserFilter.usertype(UsertypeEnum.NORMAL);
    String actualToStringResult = actualUserFilter.toString();
    String actualDepartment = actualUserFilter.getDepartment();
    String actualEmail = actualUserFilter.getEmail();
    String actualFeature = actualUserFilter.getFeature();
    String actualLocation = actualUserFilter.getLocation();
    String actualName = actualUserFilter.getName();
    String actualRole = actualUserFilter.getRole();
    StatusEnum actualStatus = actualUserFilter.getStatus();
    String actualTitle = actualUserFilter.getTitle();

    // Assert
    assertEquals("Department", actualDepartment);
    assertEquals("Dr", actualTitle);
    assertEquals("Feature", actualFeature);
    assertEquals("Location", actualLocation);
    assertEquals("Name", actualName);
    assertEquals("Role", actualRole);
    assertEquals(
        "class UserFilter {\n" + "    email: jane.doe@example.org\n" + "    name: Name\n"
            + "    department: Department\n" + "    title: Dr\n" + "    role: Role\n" + "    feature: Feature\n"
            + "    status: ENABLED\n" + "    usertype: NORMAL\n" + "    location: Location\n" + "}",
        actualToStringResult);
    assertEquals("jane.doe@example.org", actualEmail);
    assertEquals(StatusEnum.ENABLED, actualStatus);
    assertEquals(UsertypeEnum.NORMAL, actualUserFilter.getUsertype());
    assertSame(actualUserFilter, actualDepartmentResult);
    assertSame(actualUserFilter, actualEmailResult);
    assertSame(actualUserFilter, actualFeatureResult);
    assertSame(actualUserFilter, actualLocationResult);
    assertSame(actualUserFilter, actualNameResult);
    assertSame(actualUserFilter, actualRoleResult);
    assertSame(actualUserFilter, actualStatusResult);
    assertSame(actualUserFilter, actualTitleResult);
    assertSame(actualUserFilter, actualUsertypeResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code ENABLED}.</li>
   *   <li>Then return {@code ENABLED}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenEnabled_thenReturnEnabled() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ENABLED, StatusEnum.fromValue("ENABLED"));
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
    StatusEnum valueOfResult = StatusEnum.valueOf("ENABLED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ENABLED", valueOfResult.getValue());
    assertEquals("ENABLED", actualToStringResult);
  }

  /**
   * Test UsertypeEnum {@link UsertypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code NORMAL}.</li>
   *   <li>Then return {@code NORMAL}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UsertypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"UsertypeEnum UsertypeEnum.fromValue(String)"})
  public void testUsertypeEnumFromValue_whenNormal_thenReturnNormal() {
    // Arrange, Act and Assert
    assertEquals(UsertypeEnum.NORMAL, UsertypeEnum.fromValue("NORMAL"));
  }

  /**
   * Test UsertypeEnum {@link UsertypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UsertypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"UsertypeEnum UsertypeEnum.fromValue(String)"})
  public void testUsertypeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(UsertypeEnum.fromValue("Text"));
  }

  /**
   * Test UsertypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UsertypeEnum#toString()}
   *   <li>{@link UsertypeEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String UsertypeEnum.getValue()", "String UsertypeEnum.toString()"})
  public void testUsertypeEnumGettersAndSetters() {
    // Arrange
    UsertypeEnum valueOfResult = UsertypeEnum.valueOf("NORMAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("NORMAL", valueOfResult.getValue());
    assertEquals("NORMAL", actualToStringResult);
  }
}
