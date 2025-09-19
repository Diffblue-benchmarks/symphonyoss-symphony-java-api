package org.symphonyoss.symphony.authenticator.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class OboAuthResponseDiffblueTest {
  /**
   * Test {@link OboAuthResponse#equals(Object)}, and {@link OboAuthResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OboAuthResponse#equals(Object)}
   *   <li>{@link OboAuthResponse#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OboAuthResponse.equals(Object)", "int OboAuthResponse.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OboAuthResponse oboAuthResponse = new OboAuthResponse();
    OboAuthResponse oboAuthResponse2 = new OboAuthResponse();

    // Act and Assert
    assertEquals(oboAuthResponse, oboAuthResponse2);
    assertEquals(oboAuthResponse.hashCode(), oboAuthResponse2.hashCode());
  }

  /**
   * Test {@link OboAuthResponse#equals(Object)}, and {@link OboAuthResponse#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OboAuthResponse#equals(Object)}
   *   <li>{@link OboAuthResponse#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OboAuthResponse.equals(Object)", "int OboAuthResponse.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OboAuthResponse oboAuthResponse = new OboAuthResponse();

    // Act and Assert
    assertEquals(oboAuthResponse, oboAuthResponse);
    int expectedHashCodeResult = oboAuthResponse.hashCode();
    assertEquals(expectedHashCodeResult, oboAuthResponse.hashCode());
  }

  /**
   * Test {@link OboAuthResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OboAuthResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OboAuthResponse.equals(Object)", "int OboAuthResponse.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OboAuthResponse(), null);
  }

  /**
   * Test {@link OboAuthResponse#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OboAuthResponse#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean OboAuthResponse.equals(Object)", "int OboAuthResponse.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new OboAuthResponse(), "Different type to OboAuthResponse");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link OboAuthResponse}
   *   <li>{@link OboAuthResponse#sessionToken(String)}
   *   <li>{@link OboAuthResponse#setSessionToken(String)}
   *   <li>{@link OboAuthResponse#toString()}
   *   <li>{@link OboAuthResponse#getSessionToken()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OboAuthResponse.<init>()",
    "String OboAuthResponse.getSessionToken()",
    "OboAuthResponse OboAuthResponse.sessionToken(String)",
    "void OboAuthResponse.setSessionToken(String)",
    "String OboAuthResponse.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    OboAuthResponse actualOboAuthResponse = new OboAuthResponse();
    OboAuthResponse actualSessionTokenResult = actualOboAuthResponse.sessionToken("ABC123");
    actualOboAuthResponse.setSessionToken("ABC123");
    String actualToStringResult = actualOboAuthResponse.toString();

    // Assert
    assertEquals("ABC123", actualOboAuthResponse.getSessionToken());
    assertEquals("class OboAuthResponse {\n    sessionToken: ABC123\n}", actualToStringResult);
    assertSame(actualOboAuthResponse, actualSessionTokenResult);
  }
}
