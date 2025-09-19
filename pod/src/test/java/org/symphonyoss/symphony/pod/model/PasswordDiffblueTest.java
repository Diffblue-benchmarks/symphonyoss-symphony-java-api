package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class PasswordDiffblueTest {
  /**
   * Test {@link Password#equals(Object)}, and {@link Password#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Password#equals(Object)}
   *   <li>{@link Password#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Password password = new Password();
    Password password2 = new Password();

    // Act and Assert
    assertEquals(password, password2);
    assertEquals(password.hashCode(), password2.hashCode());
  }

  /**
   * Test {@link Password#equals(Object)}, and {@link Password#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Password#equals(Object)}
   *   <li>{@link Password#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Password password = new Password();

    // Act and Assert
    assertEquals(password, password);
    int expectedHashCodeResult = password.hashCode();
    assertEquals(expectedHashCodeResult, password.hashCode());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), 1);
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Password password = new Password();
    password.hSalt("H Salt");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Password password = new Password();
    password.hPassword("iloveyou");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Password password = new Password();
    password.khSalt("Kh Salt");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Password password = new Password();
    password.khPassword("iloveyou");

    // Act and Assert
    assertNotEquals(password, new Password());
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), null);
  }

  /**
   * Test {@link Password#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Password#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Password.equals(Object)", "int Password.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Password(), "Different type to Password");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Password}
   *   <li>{@link Password#hPassword(String)}
   *   <li>{@link Password#hSalt(String)}
   *   <li>{@link Password#khPassword(String)}
   *   <li>{@link Password#khSalt(String)}
   *   <li>{@link Password#setHPassword(String)}
   *   <li>{@link Password#setHSalt(String)}
   *   <li>{@link Password#setKhPassword(String)}
   *   <li>{@link Password#setKhSalt(String)}
   *   <li>{@link Password#toString()}
   *   <li>{@link Password#getHPassword()}
   *   <li>{@link Password#getHSalt()}
   *   <li>{@link Password#getKhPassword()}
   *   <li>{@link Password#getKhSalt()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Password.<init>()",
    "String Password.getHPassword()",
    "String Password.getHSalt()",
    "String Password.getKhPassword()",
    "String Password.getKhSalt()",
    "Password Password.hPassword(String)",
    "Password Password.hSalt(String)",
    "Password Password.khPassword(String)",
    "Password Password.khSalt(String)",
    "void Password.setHPassword(String)",
    "void Password.setHSalt(String)",
    "void Password.setKhPassword(String)",
    "void Password.setKhSalt(String)",
    "String Password.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    Password actualPassword = new Password();
    Password actualHPasswordResult = actualPassword.hPassword("iloveyou");
    Password actualHSaltResult = actualPassword.hSalt("H Salt");
    Password actualKhPasswordResult = actualPassword.khPassword("iloveyou");
    Password actualKhSaltResult = actualPassword.khSalt("Kh Salt");
    actualPassword.setHPassword("iloveyou");
    actualPassword.setHSalt("H Salt");
    actualPassword.setKhPassword("iloveyou");
    actualPassword.setKhSalt("Kh Salt");
    String actualToStringResult = actualPassword.toString();
    String actualHPassword = actualPassword.getHPassword();
    String actualHSalt = actualPassword.getHSalt();
    String actualKhPassword = actualPassword.getKhPassword();

    // Assert
    assertEquals("H Salt", actualHSalt);
    assertEquals("Kh Salt", actualPassword.getKhSalt());
    assertEquals(
        "class Password {\n"
            + "    hSalt: H Salt\n"
            + "    hPassword: iloveyou\n"
            + "    khSalt: Kh Salt\n"
            + "    khPassword: iloveyou\n"
            + "}",
        actualToStringResult);
    assertEquals("iloveyou", actualHPassword);
    assertEquals("iloveyou", actualKhPassword);
    assertSame(actualPassword, actualHPasswordResult);
    assertSame(actualPassword, actualHSaltResult);
    assertSame(actualPassword, actualKhPasswordResult);
    assertSame(actualPassword, actualKhSaltResult);
  }
}
