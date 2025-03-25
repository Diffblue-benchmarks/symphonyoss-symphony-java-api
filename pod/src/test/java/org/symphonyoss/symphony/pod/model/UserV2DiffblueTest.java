package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserV2DiffblueTest {
  /**
   * Test {@link UserV2#equals(Object)}, and {@link UserV2#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserV2#equals(Object)}
   *   <li>{@link UserV2#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserV2 userV2 = new UserV2();
    UserV2 userV22 = new UserV2();

    // Act and Assert
    assertEquals(userV2, userV22);
    int expectedHashCodeResult = userV2.hashCode();
    assertEquals(expectedHashCodeResult, userV22.hashCode());
  }

  /**
   * Test {@link UserV2#equals(Object)}, and {@link UserV2#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserV2#equals(Object)}
   *   <li>{@link UserV2#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserV2 userV2 = new UserV2();

    // Act and Assert
    assertEquals(userV2, userV2);
    int expectedHashCodeResult = userV2.hashCode();
    assertEquals(expectedHashCodeResult, userV2.hashCode());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserV2(), 1);
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.id(1L);

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.emailAddress("42 Main St");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.firstName("Jane");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.lastName("Doe");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.displayName("Display Name");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.title("Dr");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.company("Company");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.username("janedoe");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.location("Location");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.avatars(new AvatarList());

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual12() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.workPhoneNumber("6625550144");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual13() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.mobilePhoneNumber("6625550144");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual14() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.jobFunction("Job Function");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual15() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.department("Department");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual16() {
    // Arrange
    UserV2 userV2 = new UserV2();
    userV2.division("Division");

    // Act and Assert
    assertNotEquals(userV2, new UserV2());
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserV2(), null);
  }

  /**
   * Test {@link UserV2#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserV2#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserV2.equals(Object)", "int UserV2.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserV2(), "Different type to UserV2");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserV2}
   *   <li>{@link UserV2#avatars(AvatarList)}
   *   <li>{@link UserV2#company(String)}
   *   <li>{@link UserV2#department(String)}
   *   <li>{@link UserV2#displayName(String)}
   *   <li>{@link UserV2#division(String)}
   *   <li>{@link UserV2#emailAddress(String)}
   *   <li>{@link UserV2#firstName(String)}
   *   <li>{@link UserV2#id(Long)}
   *   <li>{@link UserV2#jobFunction(String)}
   *   <li>{@link UserV2#lastName(String)}
   *   <li>{@link UserV2#location(String)}
   *   <li>{@link UserV2#mobilePhoneNumber(String)}
   *   <li>{@link UserV2#setAvatars(AvatarList)}
   *   <li>{@link UserV2#setCompany(String)}
   *   <li>{@link UserV2#setDepartment(String)}
   *   <li>{@link UserV2#setDisplayName(String)}
   *   <li>{@link UserV2#setDivision(String)}
   *   <li>{@link UserV2#setEmailAddress(String)}
   *   <li>{@link UserV2#setFirstName(String)}
   *   <li>{@link UserV2#setId(Long)}
   *   <li>{@link UserV2#setJobFunction(String)}
   *   <li>{@link UserV2#setLastName(String)}
   *   <li>{@link UserV2#setLocation(String)}
   *   <li>{@link UserV2#setMobilePhoneNumber(String)}
   *   <li>{@link UserV2#setTitle(String)}
   *   <li>{@link UserV2#setUsername(String)}
   *   <li>{@link UserV2#setWorkPhoneNumber(String)}
   *   <li>{@link UserV2#title(String)}
   *   <li>{@link UserV2#username(String)}
   *   <li>{@link UserV2#workPhoneNumber(String)}
   *   <li>{@link UserV2#toString()}
   *   <li>{@link UserV2#getAvatars()}
   *   <li>{@link UserV2#getCompany()}
   *   <li>{@link UserV2#getDepartment()}
   *   <li>{@link UserV2#getDisplayName()}
   *   <li>{@link UserV2#getDivision()}
   *   <li>{@link UserV2#getEmailAddress()}
   *   <li>{@link UserV2#getFirstName()}
   *   <li>{@link UserV2#getId()}
   *   <li>{@link UserV2#getJobFunction()}
   *   <li>{@link UserV2#getLastName()}
   *   <li>{@link UserV2#getLocation()}
   *   <li>{@link UserV2#getMobilePhoneNumber()}
   *   <li>{@link UserV2#getTitle()}
   *   <li>{@link UserV2#getUsername()}
   *   <li>{@link UserV2#getWorkPhoneNumber()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserV2.<init>()", "UserV2 UserV2.avatars(AvatarList)", "UserV2 UserV2.company(String)",
      "UserV2 UserV2.department(String)", "UserV2 UserV2.displayName(String)", "UserV2 UserV2.division(String)",
      "UserV2 UserV2.emailAddress(String)", "UserV2 UserV2.firstName(String)", "AvatarList UserV2.getAvatars()",
      "String UserV2.getCompany()", "String UserV2.getDepartment()", "String UserV2.getDisplayName()",
      "String UserV2.getDivision()", "String UserV2.getEmailAddress()", "String UserV2.getFirstName()",
      "Long UserV2.getId()", "String UserV2.getJobFunction()", "String UserV2.getLastName()",
      "String UserV2.getLocation()", "String UserV2.getMobilePhoneNumber()", "String UserV2.getTitle()",
      "String UserV2.getUsername()", "String UserV2.getWorkPhoneNumber()", "UserV2 UserV2.id(Long)",
      "UserV2 UserV2.jobFunction(String)", "UserV2 UserV2.lastName(String)", "UserV2 UserV2.location(String)",
      "UserV2 UserV2.mobilePhoneNumber(String)", "void UserV2.setAvatars(AvatarList)", "void UserV2.setCompany(String)",
      "void UserV2.setDepartment(String)", "void UserV2.setDisplayName(String)", "void UserV2.setDivision(String)",
      "void UserV2.setEmailAddress(String)", "void UserV2.setFirstName(String)", "void UserV2.setId(Long)",
      "void UserV2.setJobFunction(String)", "void UserV2.setLastName(String)", "void UserV2.setLocation(String)",
      "void UserV2.setMobilePhoneNumber(String)", "void UserV2.setTitle(String)", "void UserV2.setUsername(String)",
      "void UserV2.setWorkPhoneNumber(String)", "UserV2 UserV2.title(String)", "String UserV2.toString()",
      "UserV2 UserV2.username(String)", "UserV2 UserV2.workPhoneNumber(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserV2 actualUserV2 = new UserV2();
    UserV2 actualAvatarsResult = actualUserV2.avatars(new AvatarList());
    UserV2 actualCompanyResult = actualUserV2.company("Company");
    UserV2 actualDepartmentResult = actualUserV2.department("Department");
    UserV2 actualDisplayNameResult = actualUserV2.displayName("Display Name");
    UserV2 actualDivisionResult = actualUserV2.division("Division");
    UserV2 actualEmailAddressResult = actualUserV2.emailAddress("42 Main St");
    UserV2 actualFirstNameResult = actualUserV2.firstName("Jane");
    UserV2 actualIdResult = actualUserV2.id(1L);
    UserV2 actualJobFunctionResult = actualUserV2.jobFunction("Job Function");
    UserV2 actualLastNameResult = actualUserV2.lastName("Doe");
    UserV2 actualLocationResult = actualUserV2.location("Location");
    UserV2 actualMobilePhoneNumberResult = actualUserV2.mobilePhoneNumber("6625550144");
    AvatarList avatars = new AvatarList();
    actualUserV2.setAvatars(avatars);
    actualUserV2.setCompany("Company");
    actualUserV2.setDepartment("Department");
    actualUserV2.setDisplayName("Display Name");
    actualUserV2.setDivision("Division");
    actualUserV2.setEmailAddress("42 Main St");
    actualUserV2.setFirstName("Jane");
    actualUserV2.setId(1L);
    actualUserV2.setJobFunction("Job Function");
    actualUserV2.setLastName("Doe");
    actualUserV2.setLocation("Location");
    actualUserV2.setMobilePhoneNumber("6625550144");
    actualUserV2.setTitle("Dr");
    actualUserV2.setUsername("janedoe");
    actualUserV2.setWorkPhoneNumber("6625550144");
    UserV2 actualTitleResult = actualUserV2.title("Dr");
    UserV2 actualUsernameResult = actualUserV2.username("janedoe");
    UserV2 actualWorkPhoneNumberResult = actualUserV2.workPhoneNumber("6625550144");
    String actualToStringResult = actualUserV2.toString();
    AvatarList actualAvatars = actualUserV2.getAvatars();
    String actualCompany = actualUserV2.getCompany();
    String actualDepartment = actualUserV2.getDepartment();
    String actualDisplayName = actualUserV2.getDisplayName();
    String actualDivision = actualUserV2.getDivision();
    String actualEmailAddress = actualUserV2.getEmailAddress();
    String actualFirstName = actualUserV2.getFirstName();
    Long actualId = actualUserV2.getId();
    String actualJobFunction = actualUserV2.getJobFunction();
    String actualLastName = actualUserV2.getLastName();
    String actualLocation = actualUserV2.getLocation();
    String actualMobilePhoneNumber = actualUserV2.getMobilePhoneNumber();
    String actualTitle = actualUserV2.getTitle();
    String actualUsername = actualUserV2.getUsername();

    // Assert
    assertEquals("42 Main St", actualEmailAddress);
    assertEquals("6625550144", actualMobilePhoneNumber);
    assertEquals("6625550144", actualUserV2.getWorkPhoneNumber());
    assertEquals("Company", actualCompany);
    assertEquals("Department", actualDepartment);
    assertEquals("Display Name", actualDisplayName);
    assertEquals("Division", actualDivision);
    assertEquals("Doe", actualLastName);
    assertEquals("Dr", actualTitle);
    assertEquals("Jane", actualFirstName);
    assertEquals("Job Function", actualJobFunction);
    assertEquals("Location", actualLocation);
    assertEquals(
        "class UserV2 {\n" + "    id: 1\n" + "    emailAddress: 42 Main St\n" + "    firstName: Jane\n"
            + "    lastName: Doe\n" + "    displayName: Display Name\n" + "    title: Dr\n" + "    company: Company\n"
            + "    username: janedoe\n" + "    location: Location\n" + "    avatars: class AvatarList {\n"
            + "        []\n" + "    }\n" + "    workPhoneNumber: 6625550144\n" + "    mobilePhoneNumber: 6625550144\n"
            + "    jobFunction: Job Function\n" + "    department: Department\n" + "    division: Division\n" + "}",
        actualToStringResult);
    assertEquals("janedoe", actualUsername);
    assertEquals(1L, actualId.longValue());
    assertSame(avatars, actualAvatars);
    assertSame(actualUserV2, actualAvatarsResult);
    assertSame(actualUserV2, actualCompanyResult);
    assertSame(actualUserV2, actualDepartmentResult);
    assertSame(actualUserV2, actualDisplayNameResult);
    assertSame(actualUserV2, actualDivisionResult);
    assertSame(actualUserV2, actualEmailAddressResult);
    assertSame(actualUserV2, actualFirstNameResult);
    assertSame(actualUserV2, actualIdResult);
    assertSame(actualUserV2, actualJobFunctionResult);
    assertSame(actualUserV2, actualLastNameResult);
    assertSame(actualUserV2, actualLocationResult);
    assertSame(actualUserV2, actualMobilePhoneNumberResult);
    assertSame(actualUserV2, actualTitleResult);
    assertSame(actualUserV2, actualUsernameResult);
    assertSame(actualUserV2, actualWorkPhoneNumberResult);
  }
}
