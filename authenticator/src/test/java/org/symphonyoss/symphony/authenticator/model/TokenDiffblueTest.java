package org.symphonyoss.symphony.authenticator.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class TokenDiffblueTest {
  /**
   * Test {@link Token#equals(Object)}, and {@link Token#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Token#equals(Object)}
   *   <li>{@link Token#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Token token = new Token();
    Token token2 = new Token();

    // Act and Assert
    assertEquals(token, token2);
    int expectedHashCodeResult = token.hashCode();
    assertEquals(expectedHashCodeResult, token2.hashCode());
  }

  /**
   * Test {@link Token#equals(Object)}, and {@link Token#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Token#equals(Object)}
   *   <li>{@link Token#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Token token = new Token();

    // Act and Assert
    assertEquals(token, token);
    int expectedHashCodeResult = token.hashCode();
    assertEquals(expectedHashCodeResult, token.hashCode());
  }

  /**
   * Test {@link Token#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Token#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), 1);
  }

  /**
   * Test {@link Token#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Token#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Token token = new Token();
    token.name("Name");

    // Act and Assert
    assertNotEquals(token, new Token());
  }

  /**
   * Test {@link Token#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Token#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Token token = new Token();
    token.token("ABC123");

    // Act and Assert
    assertNotEquals(token, new Token());
  }

  /**
   * Test {@link Token#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Token#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), null);
  }

  /**
   * Test {@link Token#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Token#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Token.equals(Object)", "int Token.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Token(), "Different type to Token");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Token}
   *   <li>{@link Token#name(String)}
   *   <li>{@link Token#setName(String)}
   *   <li>{@link Token#setToken(String)}
   *   <li>{@link Token#token(String)}
   *   <li>{@link Token#toString()}
   *   <li>{@link Token#getName()}
   *   <li>{@link Token#getToken()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void Token.<init>()", "String Token.getName()", "String Token.getToken()",
      "Token Token.name(String)", "void Token.setName(String)", "void Token.setToken(String)",
      "String Token.toString()", "Token Token.token(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    Token actualToken = new Token();
    Token actualNameResult = actualToken.name("Name");
    actualToken.setName("Name");
    actualToken.setToken("ABC123");
    Token actualTokenResult = actualToken.token("ABC123");
    String actualToStringResult = actualToken.toString();
    String actualName = actualToken.getName();

    // Assert
    assertEquals("ABC123", actualToken.getToken());
    assertEquals("Name", actualName);
    assertEquals("class Token {\n    name: Name\n    token: ABC123\n}", actualToStringResult);
    assertSame(actualToken, actualNameResult);
    assertSame(actualToken, actualTokenResult);
  }
}
