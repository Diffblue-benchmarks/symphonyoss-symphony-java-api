package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserSearchFilterDiffblueTest {
  /**
   * Test {@link UserSearchFilter#equals(Object)}, and {@link UserSearchFilter#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserSearchFilter#equals(Object)}
   *   <li>{@link UserSearchFilter#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    UserSearchFilter userSearchFilter2 = new UserSearchFilter();

    // Act and Assert
    assertEquals(userSearchFilter, userSearchFilter2);
    int expectedHashCodeResult = userSearchFilter.hashCode();
    assertEquals(expectedHashCodeResult, userSearchFilter2.hashCode());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}, and {@link UserSearchFilter#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UserSearchFilter#equals(Object)}
   *   <li>{@link UserSearchFilter#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();

    // Act and Assert
    assertEquals(userSearchFilter, userSearchFilter);
    int expectedHashCodeResult = userSearchFilter.hashCode();
    assertEquals(expectedHashCodeResult, userSearchFilter.hashCode());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchFilter(), 1);
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.title("Dr");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.company("Company");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserSearchFilter userSearchFilter = new UserSearchFilter();
    userSearchFilter.location("Location");

    // Act and Assert
    assertNotEquals(userSearchFilter, new UserSearchFilter());
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchFilter(), null);
  }

  /**
   * Test {@link UserSearchFilter#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link UserSearchFilter#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean UserSearchFilter.equals(Object)", "int UserSearchFilter.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserSearchFilter(), "Different type to UserSearchFilter");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link UserSearchFilter}
   *   <li>{@link UserSearchFilter#company(String)}
   *   <li>{@link UserSearchFilter#location(String)}
   *   <li>{@link UserSearchFilter#setCompany(String)}
   *   <li>{@link UserSearchFilter#setLocation(String)}
   *   <li>{@link UserSearchFilter#setTitle(String)}
   *   <li>{@link UserSearchFilter#title(String)}
   *   <li>{@link UserSearchFilter#toString()}
   *   <li>{@link UserSearchFilter#getCompany()}
   *   <li>{@link UserSearchFilter#getLocation()}
   *   <li>{@link UserSearchFilter#getTitle()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UserSearchFilter.<init>()", "UserSearchFilter UserSearchFilter.company(String)",
      "String UserSearchFilter.getCompany()", "String UserSearchFilter.getLocation()",
      "String UserSearchFilter.getTitle()", "UserSearchFilter UserSearchFilter.location(String)",
      "void UserSearchFilter.setCompany(String)", "void UserSearchFilter.setLocation(String)",
      "void UserSearchFilter.setTitle(String)", "UserSearchFilter UserSearchFilter.title(String)",
      "String UserSearchFilter.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UserSearchFilter actualUserSearchFilter = new UserSearchFilter();
    UserSearchFilter actualCompanyResult = actualUserSearchFilter.company("Company");
    UserSearchFilter actualLocationResult = actualUserSearchFilter.location("Location");
    actualUserSearchFilter.setCompany("Company");
    actualUserSearchFilter.setLocation("Location");
    actualUserSearchFilter.setTitle("Dr");
    UserSearchFilter actualTitleResult = actualUserSearchFilter.title("Dr");
    String actualToStringResult = actualUserSearchFilter.toString();
    String actualCompany = actualUserSearchFilter.getCompany();
    String actualLocation = actualUserSearchFilter.getLocation();

    // Assert
    assertEquals("Company", actualCompany);
    assertEquals("Dr", actualUserSearchFilter.getTitle());
    assertEquals("Location", actualLocation);
    assertEquals("class UserSearchFilter {\n    title: Dr\n    company: Company\n    location: Location\n}",
        actualToStringResult);
    assertSame(actualUserSearchFilter, actualCompanyResult);
    assertSame(actualUserSearchFilter, actualLocationResult);
    assertSame(actualUserSearchFilter, actualTitleResult);
  }
}
