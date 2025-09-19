package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class V2UserListDiffblueTest {
  /**
   * Test {@link V2UserList#addErrorsItem(UserError)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addErrorsItem(UserError)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addErrorsItem(UserError)"})
  public void testAddErrorsItem_givenV2UserList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act
    V2UserList actualAddErrorsItemResult = v2UserList.addErrorsItem(new UserError());

    // Assert
    assertSame(v2UserList, actualAddErrorsItemResult);
  }

  /**
   * Test {@link V2UserList#addErrorsItem(UserError)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor) errors {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addErrorsItem(UserError)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addErrorsItem(UserError)"})
  public void testAddErrorsItem_givenV2UserListErrorsArrayList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.errors(new ArrayList<>());

    // Act
    V2UserList actualAddErrorsItemResult = v2UserList.addErrorsItem(new UserError());

    // Assert
    assertSame(v2UserList, actualAddErrorsItemResult);
  }

  /**
   * Test {@link V2UserList#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addUsersItem(UserV2)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addUsersItem(UserV2)"})
  public void testAddUsersItem_givenV2UserList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act
    V2UserList actualAddUsersItemResult = v2UserList.addUsersItem(new UserV2());

    // Assert
    assertSame(v2UserList, actualAddUsersItemResult);
  }

  /**
   * Test {@link V2UserList#addUsersItem(UserV2)}.
   *
   * <ul>
   *   <li>Given {@link V2UserList} (default constructor) users {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#addUsersItem(UserV2)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"V2UserList V2UserList.addUsersItem(UserV2)"})
  public void testAddUsersItem_givenV2UserListUsersArrayList() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.users(new ArrayList<>());

    // Act
    V2UserList actualAddUsersItemResult = v2UserList.addUsersItem(new UserV2());

    // Assert
    assertSame(v2UserList, actualAddUsersItemResult);
  }

  /**
   * Test {@link V2UserList#equals(Object)}, and {@link V2UserList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserList#equals(Object)}
   *   <li>{@link V2UserList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    V2UserList v2UserList2 = new V2UserList();

    // Act and Assert
    assertEquals(v2UserList, v2UserList2);
    assertEquals(v2UserList.hashCode(), v2UserList2.hashCode());
  }

  /**
   * Test {@link V2UserList#equals(Object)}, and {@link V2UserList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2UserList#equals(Object)}
   *   <li>{@link V2UserList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();

    // Act and Assert
    assertEquals(v2UserList, v2UserList);
    int expectedHashCodeResult = v2UserList.hashCode();
    assertEquals(expectedHashCodeResult, v2UserList.hashCode());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.addUsersItem(new UserV2());

    // Act and Assert
    assertNotEquals(v2UserList, new V2UserList());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2UserList v2UserList = new V2UserList();
    v2UserList.addErrorsItem(new UserError());

    // Act and Assert
    assertNotEquals(v2UserList, new V2UserList());
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserList(), null);
  }

  /**
   * Test {@link V2UserList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2UserList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2UserList.equals(Object)", "int V2UserList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2UserList(), "Different type to V2UserList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2UserList}
   *   <li>{@link V2UserList#errors(List)}
   *   <li>{@link V2UserList#setErrors(List)}
   *   <li>{@link V2UserList#setUsers(List)}
   *   <li>{@link V2UserList#users(List)}
   *   <li>{@link V2UserList#toString()}
   *   <li>{@link V2UserList#getErrors()}
   *   <li>{@link V2UserList#getUsers()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2UserList.<init>()",
    "V2UserList V2UserList.errors(List)",
    "List V2UserList.getErrors()",
    "List V2UserList.getUsers()",
    "void V2UserList.setErrors(List)",
    "void V2UserList.setUsers(List)",
    "String V2UserList.toString()",
    "V2UserList V2UserList.users(List)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V2UserList actualV2UserList = new V2UserList();
    V2UserList actualErrorsResult = actualV2UserList.errors(new ArrayList<>());
    ArrayList<UserError> errors = new ArrayList<>();
    actualV2UserList.setErrors(errors);
    actualV2UserList.setUsers(new ArrayList<>());
    ArrayList<UserV2> users = new ArrayList<>();
    V2UserList actualUsersResult = actualV2UserList.users(users);
    String actualToStringResult = actualV2UserList.toString();
    List<UserError> actualErrors = actualV2UserList.getErrors();
    List<UserV2> actualUsers = actualV2UserList.getUsers();

    // Assert
    assertEquals("class V2UserList {\n    users: []\n    errors: []\n}", actualToStringResult);
    assertTrue(actualErrors.isEmpty());
    assertTrue(actualUsers.isEmpty());
    assertSame(errors, actualErrors);
    assertSame(users, actualUsers);
    assertSame(actualV2UserList, actualErrorsResult);
    assertSame(actualV2UserList, actualUsersResult);
  }
}
