package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.PasswordReset.TypeEnum;

public class PasswordResetDiffblueTest {
  /**
   * Test {@link PasswordReset#equals(Object)}, and {@link PasswordReset#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PasswordReset#equals(Object)}
   *   <li>{@link PasswordReset#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PasswordReset passwordReset = new PasswordReset();
    PasswordReset passwordReset2 = new PasswordReset();

    // Act and Assert
    assertEquals(passwordReset, passwordReset2);
    assertEquals(passwordReset.hashCode(), passwordReset2.hashCode());
  }

  /**
   * Test {@link PasswordReset#equals(Object)}, and {@link PasswordReset#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PasswordReset#equals(Object)}
   *   <li>{@link PasswordReset#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PasswordReset passwordReset = new PasswordReset();

    // Act and Assert
    assertEquals(passwordReset, passwordReset);
    int expectedHashCodeResult = passwordReset.hashCode();
    assertEquals(expectedHashCodeResult, passwordReset.hashCode());
  }

  /**
   * Test {@link PasswordReset#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PasswordReset#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PasswordReset(), null);
  }

  /**
   * Test {@link PasswordReset#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PasswordReset#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PasswordReset.equals(Object)", "int PasswordReset.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PasswordReset(), "Different type to PasswordReset");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link PasswordReset}
   *   <li>{@link PasswordReset#setType(TypeEnum)}
   *   <li>{@link PasswordReset#type(TypeEnum)}
   *   <li>{@link PasswordReset#toString()}
   *   <li>{@link PasswordReset#getType()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PasswordReset.<init>()",
    "TypeEnum PasswordReset.getType()",
    "void PasswordReset.setType(TypeEnum)",
    "String PasswordReset.toString()",
    "PasswordReset PasswordReset.type(TypeEnum)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    PasswordReset actualPasswordReset = new PasswordReset();
    actualPasswordReset.setType(TypeEnum.EMAIL);
    PasswordReset actualTypeResult = actualPasswordReset.type(TypeEnum.EMAIL);
    String actualToStringResult = actualPasswordReset.toString();

    // Assert
    assertEquals("class PasswordReset {\n    type: EMAIL\n}", actualToStringResult);
    assertEquals(TypeEnum.EMAIL, actualPasswordReset.getType());
    assertSame(actualPasswordReset, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code EMAIL}.
   *   <li>Then return {@code EMAIL}.
   * </ul>
   *
   * <p>Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenEmail_thenReturnEmail() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.EMAIL, TypeEnum.fromValue("EMAIL"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("Text"));
  }

  /**
   * Test TypeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  public void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("EMAIL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("EMAIL", valueOfResult.getValue());
    assertEquals("EMAIL", actualToStringResult);
  }
}
