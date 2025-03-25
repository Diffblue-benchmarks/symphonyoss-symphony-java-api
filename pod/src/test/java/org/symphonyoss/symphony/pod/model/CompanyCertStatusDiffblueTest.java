package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.CompanyCertStatus.TypeEnum;

public class CompanyCertStatusDiffblueTest {
  /**
   * Test {@link CompanyCertStatus#equals(Object)}, and {@link CompanyCertStatus#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertStatus#equals(Object)}
   *   <li>{@link CompanyCertStatus#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertStatus companyCertStatus = new CompanyCertStatus();
    CompanyCertStatus companyCertStatus2 = new CompanyCertStatus();

    // Act and Assert
    assertEquals(companyCertStatus, companyCertStatus2);
    int expectedHashCodeResult = companyCertStatus.hashCode();
    assertEquals(expectedHashCodeResult, companyCertStatus2.hashCode());
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}, and {@link CompanyCertStatus#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertStatus#equals(Object)}
   *   <li>{@link CompanyCertStatus#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertStatus companyCertStatus = new CompanyCertStatus();

    // Act and Assert
    assertEquals(companyCertStatus, companyCertStatus);
    int expectedHashCodeResult = companyCertStatus.hashCode();
    assertEquals(expectedHashCodeResult, companyCertStatus.hashCode());
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), null);
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), null);
  }

  /**
   * Test {@link CompanyCertStatus#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertStatus#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertStatus.equals(Object)", "int CompanyCertStatus.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertStatus(), "Different type to CompanyCertStatus");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertStatus}
   *   <li>{@link CompanyCertStatus#setType(TypeEnum)}
   *   <li>{@link CompanyCertStatus#type(TypeEnum)}
   *   <li>{@link CompanyCertStatus#toString()}
   *   <li>{@link CompanyCertStatus#getType()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void CompanyCertStatus.<init>()", "TypeEnum CompanyCertStatus.getType()",
      "void CompanyCertStatus.setType(TypeEnum)", "String CompanyCertStatus.toString()",
      "CompanyCertStatus CompanyCertStatus.type(TypeEnum)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertStatus actualCompanyCertStatus = new CompanyCertStatus();
    actualCompanyCertStatus.setType(TypeEnum.TRUSTED);
    CompanyCertStatus actualTypeResult = actualCompanyCertStatus.type(TypeEnum.TRUSTED);
    String actualToStringResult = actualCompanyCertStatus.toString();

    // Assert
    assertEquals("class CompanyCertStatus {\n    type: TRUSTED\n}", actualToStringResult);
    assertEquals(TypeEnum.TRUSTED, actualCompanyCertStatus.getType());
    assertSame(actualCompanyCertStatus, actualTypeResult);
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TypeEnum.fromValue("Text"));
  }

  /**
   * Test TypeEnum {@link TypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code TRUSTED}.</li>
   *   <li>Then return {@code TRUSTED}.</li>
   * </ul>
   * <p>
   * Method under test: {@link TypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"TypeEnum TypeEnum.fromValue(String)"})
  public void testTypeEnumFromValue_whenTrusted_thenReturnTrusted() {
    // Arrange, Act and Assert
    assertEquals(TypeEnum.TRUSTED, TypeEnum.fromValue("TRUSTED"));
  }

  /**
   * Test TypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link TypeEnum#toString()}
   *   <li>{@link TypeEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String TypeEnum.getValue()", "String TypeEnum.toString()"})
  public void testTypeEnumGettersAndSetters() {
    // Arrange
    TypeEnum valueOfResult = TypeEnum.valueOf("TRUSTED");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TRUSTED", valueOfResult.getValue());
    assertEquals("TRUSTED", actualToStringResult);
  }
}
