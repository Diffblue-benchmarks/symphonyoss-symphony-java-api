package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class UserCreateDiffblueTest {
  /**
   * Test {@link UserCreate#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link UserCreate} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#addRolesItem(String)}
   */
  @Test
  @MethodsUnderTest({"UserCreate UserCreate.addRolesItem(String)"})
  public void testAddRolesItem_givenUserCreate() {
    // Arrange
    UserCreate userCreate = new UserCreate();

    // Act and Assert
    assertSame(userCreate, userCreate.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link UserCreate#addRolesItem(String)}.
   * <ul>
   *   <li>Given {@link UserCreate} (default constructor) roles {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#addRolesItem(String)}
   */
  @Test
  @MethodsUnderTest({"UserCreate UserCreate.addRolesItem(String)"})
  public void testAddRolesItem_givenUserCreateRolesArrayList() {
    // Arrange
    UserCreate userCreate = new UserCreate();
    userCreate.roles(new ArrayList<>());

    // Act and Assert
    assertSame(userCreate, userCreate.addRolesItem("Roles Item"));
  }

  /**
   * Test {@link UserCreate#equals(Object)}, and {@link UserCreate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserCreate#equals(Object)}
   *   <li>{@link UserCreate#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserCreate userCreate = new UserCreate();
    UserCreate userCreate2 = new UserCreate();

    // Act and Assert
    assertEquals(userCreate, userCreate2);
    int expectedHashCodeResult = userCreate.hashCode();
    assertEquals(expectedHashCodeResult, userCreate2.hashCode());
  }

  /**
   * Test {@link UserCreate#equals(Object)}, and {@link UserCreate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserCreate#equals(Object)}
   *   <li>{@link UserCreate#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserCreate userCreate = new UserCreate();

    // Act and Assert
    assertEquals(userCreate, userCreate);
    int expectedHashCodeResult = userCreate.hashCode();
    assertEquals(expectedHashCodeResult, userCreate.hashCode());
  }

  /**
   * Test {@link UserCreate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UserCreate userCreate = new UserCreate();
    userCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userCreate, new UserCreate());
  }

  /**
   * Test {@link UserCreate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserCreate userCreate = new UserCreate();
    userCreate.userAttributes(new UserAttributes());
    userCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userCreate, new UserCreate());
  }

  /**
   * Test {@link UserCreate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserCreate userCreate = new UserCreate();
    userCreate.password(new Password());
    userCreate.addRolesItem("Roles Item");

    // Act and Assert
    assertNotEquals(userCreate, new UserCreate());
  }

  /**
   * Test {@link UserCreate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserCreate(), null);
  }

  /**
   * Test {@link UserCreate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserCreate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserCreate.equals(Object)", "int UserCreate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserCreate(), "Different type to UserCreate");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserCreate}
   *   <li>{@link UserCreate#password(Password)}
   *   <li>{@link UserCreate#roles(List)}
   *   <li>{@link UserCreate#setPassword(Password)}
   *   <li>{@link UserCreate#setRoles(List)}
   *   <li>{@link UserCreate#setUserAttributes(UserAttributes)}
   *   <li>{@link UserCreate#userAttributes(UserAttributes)}
   *   <li>{@link UserCreate#toString()}
   *   <li>{@link UserCreate#getPassword()}
   *   <li>{@link UserCreate#getRoles()}
   *   <li>{@link UserCreate#getUserAttributes()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserCreate.<init>()", "Password UserCreate.getPassword()", "List UserCreate.getRoles()",
      "UserAttributes UserCreate.getUserAttributes()", "UserCreate UserCreate.password(Password)",
      "UserCreate UserCreate.roles(List)", "void UserCreate.setPassword(Password)", "void UserCreate.setRoles(List)",
      "void UserCreate.setUserAttributes(UserAttributes)", "String UserCreate.toString()",
      "UserCreate UserCreate.userAttributes(UserAttributes)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserCreate actualUserCreate = new UserCreate();
    UserCreate actualPasswordResult = actualUserCreate.password(new Password());
    UserCreate actualRolesResult = actualUserCreate.roles(new ArrayList<>());
    Password password = new Password();
    actualUserCreate.setPassword(password);
    ArrayList<String> roles = new ArrayList<>();
    actualUserCreate.setRoles(roles);
    actualUserCreate.setUserAttributes(new UserAttributes());
    UserAttributes userAttributes = new UserAttributes();
    UserCreate actualUserAttributesResult = actualUserCreate.userAttributes(userAttributes);
    String actualToStringResult = actualUserCreate.toString();
    Password actualPassword = actualUserCreate.getPassword();
    List<String> actualRoles = actualUserCreate.getRoles();
    UserAttributes actualUserAttributes = actualUserCreate.getUserAttributes();

    // Assert
    assertEquals("class UserCreate {\n" + "    userAttributes: class UserAttributes {\n"
        + "        emailAddress: null\n" + "        firstName: null\n" + "        lastName: null\n"
        + "        userName: null\n" + "        displayName: null\n" + "        companyName: null\n"
        + "        department: null\n" + "        division: null\n" + "        title: null\n"
        + "        workPhoneNumber: null\n" + "        mobilePhoneNumber: null\n" + "        smsNumber: null\n"
        + "        accountType: null\n" + "        location: null\n" + "        jobFunction: null\n"
        + "        assetClasses: null\n" + "        industries: null\n" + "    }\n" + "    password: class Password {\n"
        + "        hSalt: null\n" + "        hPassword: null\n" + "        khSalt: null\n"
        + "        khPassword: null\n" + "    }\n" + "    roles: []\n" + "}", actualToStringResult);
    assertTrue(actualRoles.isEmpty());
    assertSame(roles, actualRoles);
    assertSame(password, actualPassword);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualUserCreate, actualPasswordResult);
    assertSame(actualUserCreate, actualRolesResult);
    assertSame(actualUserCreate, actualUserAttributesResult);
  }
}
