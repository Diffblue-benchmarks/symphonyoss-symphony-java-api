package org.symphonyoss.symphony.authenticator.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AuthenticateRequestDiffblueTest {
  /**
   * Test {@link AuthenticateRequest#equals(Object)}, and {@link AuthenticateRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AuthenticateRequest#equals(Object)}
   *   <li>{@link AuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AuthenticateRequest.equals(Object)", "int AuthenticateRequest.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AuthenticateRequest authenticateRequest = new AuthenticateRequest();
    AuthenticateRequest authenticateRequest2 = new AuthenticateRequest();

    // Act and Assert
    assertEquals(authenticateRequest, authenticateRequest2);
    int expectedHashCodeResult = authenticateRequest.hashCode();
    assertEquals(expectedHashCodeResult, authenticateRequest2.hashCode());
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}, and {@link AuthenticateRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AuthenticateRequest#equals(Object)}
   *   <li>{@link AuthenticateRequest#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AuthenticateRequest.equals(Object)", "int AuthenticateRequest.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AuthenticateRequest authenticateRequest = new AuthenticateRequest();

    // Act and Assert
    assertEquals(authenticateRequest, authenticateRequest);
    int expectedHashCodeResult = authenticateRequest.hashCode();
    assertEquals(expectedHashCodeResult, authenticateRequest.hashCode());
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticateRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AuthenticateRequest.equals(Object)", "int AuthenticateRequest.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateRequest(), null);
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticateRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AuthenticateRequest.equals(Object)", "int AuthenticateRequest.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateRequest(), null);
  }

  /**
   * Test {@link AuthenticateRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AuthenticateRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AuthenticateRequest.equals(Object)", "int AuthenticateRequest.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AuthenticateRequest(), "Different type to AuthenticateRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AuthenticateRequest}
   *   <li>{@link AuthenticateRequest#appToken(String)}
   *   <li>{@link AuthenticateRequest#setAppToken(String)}
   *   <li>{@link AuthenticateRequest#toString()}
   *   <li>{@link AuthenticateRequest#getAppToken()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AuthenticateRequest.<init>()", "AuthenticateRequest AuthenticateRequest.appToken(String)",
      "String AuthenticateRequest.getAppToken()", "void AuthenticateRequest.setAppToken(String)",
      "String AuthenticateRequest.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AuthenticateRequest actualAuthenticateRequest = new AuthenticateRequest();
    AuthenticateRequest actualAppTokenResult = actualAuthenticateRequest.appToken("ABC123");
    actualAuthenticateRequest.setAppToken("ABC123");
    String actualToStringResult = actualAuthenticateRequest.toString();

    // Assert
    assertEquals("ABC123", actualAuthenticateRequest.getAppToken());
    assertEquals("class AuthenticateRequest {\n    appToken: ABC123\n}", actualToStringResult);
    assertSame(actualAuthenticateRequest, actualAppTokenResult);
  }
}
