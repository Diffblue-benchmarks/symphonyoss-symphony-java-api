package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserDetailDiffblueTest {
  /**
   * Test {@link UserDetail#equals(Object)}, and {@link UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserDetail#equals(Object)}
   *   <li>{@link UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    UserDetail userDetail2 = new UserDetail();

    // Act and Assert
    assertEquals(userDetail, userDetail2);
    int expectedHashCodeResult = userDetail.hashCode();
    assertEquals(expectedHashCodeResult, userDetail2.hashCode());
  }

  /**
   * Test {@link UserDetail#equals(Object)}, and {@link UserDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserDetail#equals(Object)}
   *   <li>{@link UserDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserDetail userDetail = new UserDetail();

    // Act and Assert
    assertEquals(userDetail, userDetail);
    int expectedHashCodeResult = userDetail.hashCode();
    assertEquals(expectedHashCodeResult, userDetail.hashCode());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetail(), 1);
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.userAttributes(new UserAttributes());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.userSystemInfo(new UserSystemInfo());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.features(new IntegerList());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.apps(new IntegerList());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.groups(new IntegerList());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.roles(new StringList());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.disclaimers(new IntegerList());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    UserDetail userDetail = new UserDetail();
    userDetail.avatar(new Avatar());

    // Act and Assert
    assertNotEquals(userDetail, new UserDetail());
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetail(), null);
  }

  /**
   * Test {@link UserDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserDetail.equals(Object)", "int UserDetail.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserDetail(), "Different type to UserDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserDetail}
   *   <li>{@link UserDetail#apps(IntegerList)}
   *   <li>{@link UserDetail#avatar(Avatar)}
   *   <li>{@link UserDetail#disclaimers(IntegerList)}
   *   <li>{@link UserDetail#features(IntegerList)}
   *   <li>{@link UserDetail#groups(IntegerList)}
   *   <li>{@link UserDetail#roles(StringList)}
   *   <li>{@link UserDetail#setApps(IntegerList)}
   *   <li>{@link UserDetail#setAvatar(Avatar)}
   *   <li>{@link UserDetail#setDisclaimers(IntegerList)}
   *   <li>{@link UserDetail#setFeatures(IntegerList)}
   *   <li>{@link UserDetail#setGroups(IntegerList)}
   *   <li>{@link UserDetail#setRoles(StringList)}
   *   <li>{@link UserDetail#setUserAttributes(UserAttributes)}
   *   <li>{@link UserDetail#setUserSystemInfo(UserSystemInfo)}
   *   <li>{@link UserDetail#userAttributes(UserAttributes)}
   *   <li>{@link UserDetail#userSystemInfo(UserSystemInfo)}
   *   <li>{@link UserDetail#toString()}
   *   <li>{@link UserDetail#getApps()}
   *   <li>{@link UserDetail#getAvatar()}
   *   <li>{@link UserDetail#getDisclaimers()}
   *   <li>{@link UserDetail#getFeatures()}
   *   <li>{@link UserDetail#getGroups()}
   *   <li>{@link UserDetail#getRoles()}
   *   <li>{@link UserDetail#getUserAttributes()}
   *   <li>{@link UserDetail#getUserSystemInfo()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserDetail.<init>()", "UserDetail UserDetail.apps(IntegerList)",
      "UserDetail UserDetail.avatar(Avatar)", "UserDetail UserDetail.disclaimers(IntegerList)",
      "UserDetail UserDetail.features(IntegerList)", "IntegerList UserDetail.getApps()",
      "Avatar UserDetail.getAvatar()", "IntegerList UserDetail.getDisclaimers()",
      "IntegerList UserDetail.getFeatures()", "IntegerList UserDetail.getGroups()", "StringList UserDetail.getRoles()",
      "UserAttributes UserDetail.getUserAttributes()", "UserSystemInfo UserDetail.getUserSystemInfo()",
      "UserDetail UserDetail.groups(IntegerList)", "UserDetail UserDetail.roles(StringList)",
      "void UserDetail.setApps(IntegerList)", "void UserDetail.setAvatar(Avatar)",
      "void UserDetail.setDisclaimers(IntegerList)", "void UserDetail.setFeatures(IntegerList)",
      "void UserDetail.setGroups(IntegerList)", "void UserDetail.setRoles(StringList)",
      "void UserDetail.setUserAttributes(UserAttributes)", "void UserDetail.setUserSystemInfo(UserSystemInfo)",
      "String UserDetail.toString()", "UserDetail UserDetail.userAttributes(UserAttributes)",
      "UserDetail UserDetail.userSystemInfo(UserSystemInfo)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserDetail actualUserDetail = new UserDetail();
    UserDetail actualAppsResult = actualUserDetail.apps(new IntegerList());
    UserDetail actualAvatarResult = actualUserDetail.avatar(new Avatar());
    UserDetail actualDisclaimersResult = actualUserDetail.disclaimers(new IntegerList());
    UserDetail actualFeaturesResult = actualUserDetail.features(new IntegerList());
    UserDetail actualGroupsResult = actualUserDetail.groups(new IntegerList());
    UserDetail actualRolesResult = actualUserDetail.roles(new StringList());
    IntegerList apps = new IntegerList();
    actualUserDetail.setApps(apps);
    Avatar avatar = new Avatar();
    actualUserDetail.setAvatar(avatar);
    IntegerList disclaimers = new IntegerList();
    actualUserDetail.setDisclaimers(disclaimers);
    IntegerList features = new IntegerList();
    actualUserDetail.setFeatures(features);
    IntegerList groups = new IntegerList();
    actualUserDetail.setGroups(groups);
    StringList roles = new StringList();
    actualUserDetail.setRoles(roles);
    actualUserDetail.setUserAttributes(new UserAttributes());
    actualUserDetail.setUserSystemInfo(new UserSystemInfo());
    UserAttributes userAttributes = new UserAttributes();
    UserDetail actualUserAttributesResult = actualUserDetail.userAttributes(userAttributes);
    UserSystemInfo userSystemInfo = new UserSystemInfo();
    UserDetail actualUserSystemInfoResult = actualUserDetail.userSystemInfo(userSystemInfo);
    String actualToStringResult = actualUserDetail.toString();
    IntegerList actualApps = actualUserDetail.getApps();
    Avatar actualAvatar = actualUserDetail.getAvatar();
    IntegerList actualDisclaimers = actualUserDetail.getDisclaimers();
    IntegerList actualFeatures = actualUserDetail.getFeatures();
    IntegerList actualGroups = actualUserDetail.getGroups();
    StringList actualRoles = actualUserDetail.getRoles();
    UserAttributes actualUserAttributes = actualUserDetail.getUserAttributes();

    // Assert
    assertEquals(
        "class UserDetail {\n" + "    userAttributes: class UserAttributes {\n" + "        emailAddress: null\n"
            + "        firstName: null\n" + "        lastName: null\n" + "        userName: null\n"
            + "        displayName: null\n" + "        companyName: null\n" + "        department: null\n"
            + "        division: null\n" + "        title: null\n" + "        workPhoneNumber: null\n"
            + "        mobilePhoneNumber: null\n" + "        smsNumber: null\n" + "        accountType: null\n"
            + "        location: null\n" + "        jobFunction: null\n" + "        assetClasses: null\n"
            + "        industries: null\n" + "    }\n" + "    userSystemInfo: class UserSystemInfo {\n"
            + "        id: null\n" + "        status: null\n" + "        createdDate: null\n"
            + "        createdBy: null\n" + "        lastUpdatedDate: null\n" + "        lastLoginDate: null\n"
            + "        lastPasswordReset: null\n" + "    }\n" + "    features: class IntegerList {\n" + "        []\n"
            + "    }\n" + "    apps: class IntegerList {\n" + "        []\n" + "    }\n"
            + "    groups: class IntegerList {\n" + "        []\n" + "    }\n" + "    roles: class StringList {\n"
            + "        []\n" + "    }\n" + "    disclaimers: class IntegerList {\n" + "        []\n" + "    }\n"
            + "    avatar: class Avatar {\n" + "        size: null\n" + "        url: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertSame(avatar, actualAvatar);
    assertSame(apps, actualApps);
    assertSame(disclaimers, actualDisclaimers);
    assertSame(features, actualFeatures);
    assertSame(groups, actualGroups);
    assertSame(roles, actualRoles);
    assertSame(userAttributes, actualUserAttributes);
    assertSame(actualUserDetail, actualAppsResult);
    assertSame(actualUserDetail, actualAvatarResult);
    assertSame(actualUserDetail, actualDisclaimersResult);
    assertSame(actualUserDetail, actualFeaturesResult);
    assertSame(actualUserDetail, actualGroupsResult);
    assertSame(actualUserDetail, actualRolesResult);
    assertSame(actualUserDetail, actualUserAttributesResult);
    assertSame(actualUserDetail, actualUserSystemInfoResult);
    assertSame(userSystemInfo, actualUserDetail.getUserSystemInfo());
  }
}
