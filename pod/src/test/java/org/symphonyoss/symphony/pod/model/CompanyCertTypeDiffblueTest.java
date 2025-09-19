package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.CompanyCertType.TypeEnum;

public class CompanyCertTypeDiffblueTest {
  /**
   * Test {@link CompanyCertType#equals(Object)}, and {@link CompanyCertType#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertType#equals(Object)}
   *   <li>{@link CompanyCertType#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertType companyCertType = new CompanyCertType();
    CompanyCertType companyCertType2 = new CompanyCertType();

    // Act and Assert
    assertEquals(companyCertType, companyCertType2);
    assertEquals(companyCertType.hashCode(), companyCertType2.hashCode());
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}, and {@link CompanyCertType#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertType#equals(Object)}
   *   <li>{@link CompanyCertType#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertType companyCertType = new CompanyCertType();

    // Act and Assert
    assertEquals(companyCertType, companyCertType);
    int expectedHashCodeResult = companyCertType.hashCode();
    assertEquals(expectedHashCodeResult, companyCertType.hashCode());
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertType#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertType(), null);
  }

  /**
   * Test {@link CompanyCertType#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertType#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CompanyCertType.equals(Object)", "int CompanyCertType.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertType(), "Different type to CompanyCertType");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertType}
   *   <li>{@link CompanyCertType#setType(TypeEnum)}
   *   <li>{@link CompanyCertType#type(TypeEnum)}
   *   <li>{@link CompanyCertType#toString()}
   *   <li>{@link CompanyCertType#getType()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCertType.<init>()",
    "TypeEnum CompanyCertType.getType()",
    "void CompanyCertType.setType(TypeEnum)",
    "String CompanyCertType.toString()",
    "CompanyCertType CompanyCertType.type(TypeEnum)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertType actualCompanyCertType = new CompanyCertType();
    actualCompanyCertType.setType(TypeEnum.USERSIGNING);
    CompanyCertType actualTypeResult = actualCompanyCertType.type(TypeEnum.USERSIGNING);
    String actualToStringResult = actualCompanyCertType.toString();

    // Assert
    assertEquals("class CompanyCertType {\n    type: USERSIGNING\n}", actualToStringResult);
    assertEquals(TypeEnum.USERSIGNING, actualCompanyCertType.getType());
    assertSame(actualCompanyCertType, actualTypeResult);
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
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code USERSIGNING}.
   *   <li>Then return {@code USERSIGNING}.
   * </ul>
   *
   * <p>Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenUsersigning_thenReturnUsersigning() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.USERSIGNING, TypeEnum.fromValue("USERSIGNING"));
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
    TypeEnum valueOfResult = TypeEnum.valueOf("USERSIGNING");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("USERSIGNING", valueOfResult.getValue());
    assertEquals("USERSIGNING", actualToStringResult);
  }
}
