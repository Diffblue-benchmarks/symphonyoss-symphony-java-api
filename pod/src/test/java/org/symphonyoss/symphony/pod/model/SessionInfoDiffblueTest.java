package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SessionInfoDiffblueTest {
  /**
   * Test {@link SessionInfo#equals(Object)}, and {@link SessionInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SessionInfo#equals(Object)}
   *   <li>{@link SessionInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SessionInfo.equals(Object)", "int SessionInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SessionInfo sessionInfo = new SessionInfo();
    SessionInfo sessionInfo2 = new SessionInfo();

    // Act and Assert
    assertEquals(sessionInfo, sessionInfo2);
    int expectedHashCodeResult = sessionInfo.hashCode();
    assertEquals(expectedHashCodeResult, sessionInfo2.hashCode());
  }

  /**
   * Test {@link SessionInfo#equals(Object)}, and {@link SessionInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SessionInfo#equals(Object)}
   *   <li>{@link SessionInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean SessionInfo.equals(Object)", "int SessionInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SessionInfo sessionInfo = new SessionInfo();

    // Act and Assert
    assertEquals(sessionInfo, sessionInfo);
    int expectedHashCodeResult = sessionInfo.hashCode();
    assertEquals(expectedHashCodeResult, sessionInfo.hashCode());
  }

  /**
   * Test {@link SessionInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SessionInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SessionInfo.equals(Object)", "int SessionInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SessionInfo(), null);
  }

  /**
   * Test {@link SessionInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SessionInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SessionInfo.equals(Object)", "int SessionInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SessionInfo(), null);
  }

  /**
   * Test {@link SessionInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SessionInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean SessionInfo.equals(Object)", "int SessionInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SessionInfo(), "Different type to SessionInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link SessionInfo}
   *   <li>{@link SessionInfo#setUserId(Long)}
   *   <li>{@link SessionInfo#userId(Long)}
   *   <li>{@link SessionInfo#toString()}
   *   <li>{@link SessionInfo#getUserId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void SessionInfo.<init>()", "Long SessionInfo.getUserId()", "void SessionInfo.setUserId(Long)",
      "String SessionInfo.toString()", "SessionInfo SessionInfo.userId(Long)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    SessionInfo actualSessionInfo = new SessionInfo();
    actualSessionInfo.setUserId(1L);
    SessionInfo actualUserIdResult = actualSessionInfo.userId(1L);
    String actualToStringResult = actualSessionInfo.toString();

    // Assert
    assertEquals("class SessionInfo {\n    userId: 1\n}", actualToStringResult);
    assertEquals(1L, actualSessionInfo.getUserId().longValue());
    assertSame(actualSessionInfo, actualUserIdResult);
  }
}
