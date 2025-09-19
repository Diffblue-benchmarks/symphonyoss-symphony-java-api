package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserConnectionRequestDiffblueTest {
  /**
   * Test {@link UserConnectionRequest#equals(Object)}, and {@link
   * UserConnectionRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserConnectionRequest#equals(Object)}
   *   <li>{@link UserConnectionRequest#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionRequest.equals(Object)",
    "int UserConnectionRequest.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserConnectionRequest userConnectionRequest = new UserConnectionRequest();
    UserConnectionRequest userConnectionRequest2 = new UserConnectionRequest();

    // Act and Assert
    assertEquals(userConnectionRequest, userConnectionRequest2);
    assertEquals(userConnectionRequest.hashCode(), userConnectionRequest2.hashCode());
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}, and {@link
   * UserConnectionRequest#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserConnectionRequest#equals(Object)}
   *   <li>{@link UserConnectionRequest#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionRequest.equals(Object)",
    "int UserConnectionRequest.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserConnectionRequest userConnectionRequest = new UserConnectionRequest();

    // Act and Assert
    assertEquals(userConnectionRequest, userConnectionRequest);
    int expectedHashCodeResult = userConnectionRequest.hashCode();
    assertEquals(expectedHashCodeResult, userConnectionRequest.hashCode());
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserConnectionRequest#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionRequest.equals(Object)",
    "int UserConnectionRequest.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionRequest(), null);
  }

  /**
   * Test {@link UserConnectionRequest#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserConnectionRequest#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserConnectionRequest.equals(Object)",
    "int UserConnectionRequest.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserConnectionRequest(), "Different type to UserConnectionRequest");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserConnectionRequest}
   *   <li>{@link UserConnectionRequest#setUserId(Long)}
   *   <li>{@link UserConnectionRequest#userId(Long)}
   *   <li>{@link UserConnectionRequest#toString()}
   *   <li>{@link UserConnectionRequest#getUserId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserConnectionRequest.<init>()",
    "Long UserConnectionRequest.getUserId()",
    "void UserConnectionRequest.setUserId(Long)",
    "String UserConnectionRequest.toString()",
    "UserConnectionRequest UserConnectionRequest.userId(Long)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserConnectionRequest actualUserConnectionRequest = new UserConnectionRequest();
    actualUserConnectionRequest.setUserId(1L);
    UserConnectionRequest actualUserIdResult = actualUserConnectionRequest.userId(1L);
    String actualToStringResult = actualUserConnectionRequest.toString();

    // Assert
    assertEquals("class UserConnectionRequest {\n    userId: 1\n}", actualToStringResult);
    assertEquals(1L, actualUserConnectionRequest.getUserId().longValue());
    assertSame(actualUserConnectionRequest, actualUserIdResult);
  }
}
