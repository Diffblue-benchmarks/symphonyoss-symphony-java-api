package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertInfoListInnerDiffblueTest {
  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}, and {@link CompanyCertInfoListInner#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertInfoListInner#equals(Object)}
   *   <li>{@link CompanyCertInfoListInner#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertInfoListInner companyCertInfoListInner = new CompanyCertInfoListInner();
    CompanyCertInfoListInner companyCertInfoListInner2 = new CompanyCertInfoListInner();

    // Act and Assert
    assertEquals(companyCertInfoListInner, companyCertInfoListInner2);
    int expectedHashCodeResult = companyCertInfoListInner.hashCode();
    assertEquals(expectedHashCodeResult, companyCertInfoListInner2.hashCode());
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}, and {@link CompanyCertInfoListInner#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertInfoListInner#equals(Object)}
   *   <li>{@link CompanyCertInfoListInner#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertInfoListInner companyCertInfoListInner = new CompanyCertInfoListInner();

    // Act and Assert
    assertEquals(companyCertInfoListInner, companyCertInfoListInner);
    int expectedHashCodeResult = companyCertInfoListInner.hashCode();
    assertEquals(expectedHashCodeResult, companyCertInfoListInner.hashCode());
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfoListInner#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfoListInner(), 1);
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfoListInner#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCertInfoListInner companyCertInfoListInner = new CompanyCertInfoListInner();
    companyCertInfoListInner.companyCertAttributes(new CompanyCertAttributes());

    // Act and Assert
    assertNotEquals(companyCertInfoListInner, new CompanyCertInfoListInner());
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfoListInner#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCertInfoListInner companyCertInfoListInner = new CompanyCertInfoListInner();
    companyCertInfoListInner.companyCertInfo(new CompanyCertInfo());

    // Act and Assert
    assertNotEquals(companyCertInfoListInner, new CompanyCertInfoListInner());
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfoListInner#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfoListInner(), null);
  }

  /**
   * Test {@link CompanyCertInfoListInner#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertInfoListInner#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertInfoListInner.equals(Object)", "int CompanyCertInfoListInner.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfoListInner(), "Different type to CompanyCertInfoListInner");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertInfoListInner}
   *   <li>{@link CompanyCertInfoListInner#companyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertInfoListInner#companyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertInfoListInner#setCompanyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertInfoListInner#setCompanyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertInfoListInner#toString()}
   *   <li>{@link CompanyCertInfoListInner#getCompanyCertAttributes()}
   *   <li>{@link CompanyCertInfoListInner#getCompanyCertInfo()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void CompanyCertInfoListInner.<init>()",
      "CompanyCertInfoListInner CompanyCertInfoListInner.companyCertAttributes(CompanyCertAttributes)",
      "CompanyCertInfoListInner CompanyCertInfoListInner.companyCertInfo(CompanyCertInfo)",
      "CompanyCertAttributes CompanyCertInfoListInner.getCompanyCertAttributes()",
      "CompanyCertInfo CompanyCertInfoListInner.getCompanyCertInfo()",
      "void CompanyCertInfoListInner.setCompanyCertAttributes(CompanyCertAttributes)",
      "void CompanyCertInfoListInner.setCompanyCertInfo(CompanyCertInfo)",
      "String CompanyCertInfoListInner.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertInfoListInner actualCompanyCertInfoListInner = new CompanyCertInfoListInner();
    CompanyCertInfoListInner actualCompanyCertAttributesResult = actualCompanyCertInfoListInner
        .companyCertAttributes(new CompanyCertAttributes());
    CompanyCertInfoListInner actualCompanyCertInfoResult = actualCompanyCertInfoListInner
        .companyCertInfo(new CompanyCertInfo());
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    actualCompanyCertInfoListInner.setCompanyCertAttributes(companyCertAttributes);
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    actualCompanyCertInfoListInner.setCompanyCertInfo(companyCertInfo);
    String actualToStringResult = actualCompanyCertInfoListInner.toString();
    CompanyCertAttributes actualCompanyCertAttributes = actualCompanyCertInfoListInner.getCompanyCertAttributes();

    // Assert
    assertEquals("class CompanyCertInfoListInner {\n" + "    companyCertAttributes: class CompanyCertAttributes {\n"
        + "        name: null\n" + "        type: null\n" + "        status: null\n" + "    }\n"
        + "    companyCertInfo: class CompanyCertInfo {\n" + "        fingerPrint: null\n"
        + "        issuerFingerPrint: null\n" + "        lastSeen: null\n" + "        updatedAt: null\n"
        + "        updatedBy: null\n" + "        commonName: null\n" + "        expiryDate: null\n" + "    }\n" + "}",
        actualToStringResult);
    assertSame(companyCertAttributes, actualCompanyCertAttributes);
    assertSame(companyCertInfo, actualCompanyCertInfoListInner.getCompanyCertInfo());
    assertSame(actualCompanyCertInfoListInner, actualCompanyCertAttributesResult);
    assertSame(actualCompanyCertInfoListInner, actualCompanyCertInfoResult);
  }
}
