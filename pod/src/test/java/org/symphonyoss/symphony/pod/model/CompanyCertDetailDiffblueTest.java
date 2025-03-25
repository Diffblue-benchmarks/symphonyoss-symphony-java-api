package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertDetailDiffblueTest {
  /**
   * Test {@link CompanyCertDetail#equals(Object)}, and {@link CompanyCertDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertDetail#equals(Object)}
   *   <li>{@link CompanyCertDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    CompanyCertDetail companyCertDetail2 = new CompanyCertDetail();

    // Act and Assert
    assertEquals(companyCertDetail, companyCertDetail2);
    int expectedHashCodeResult = companyCertDetail.hashCode();
    assertEquals(expectedHashCodeResult, companyCertDetail2.hashCode());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}, and {@link CompanyCertDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CompanyCertDetail#equals(Object)}
   *   <li>{@link CompanyCertDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();

    // Act and Assert
    assertEquals(companyCertDetail, companyCertDetail);
    int expectedHashCodeResult = companyCertDetail.hashCode();
    assertEquals(expectedHashCodeResult, companyCertDetail.hashCode());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertDetail(), 1);
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.companyCertAttributes(new CompanyCertAttributes());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.companyCertInfo(new CompanyCertInfo());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CompanyCertDetail companyCertDetail = new CompanyCertDetail();
    companyCertDetail.certInfo(new CertInfo());

    // Act and Assert
    assertNotEquals(companyCertDetail, new CompanyCertDetail());
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertDetail(), null);
  }

  /**
   * Test {@link CompanyCertDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CompanyCertDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CompanyCertDetail.equals(Object)", "int CompanyCertDetail.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertDetail(), "Different type to CompanyCertDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertDetail}
   *   <li>{@link CompanyCertDetail#certInfo(CertInfo)}
   *   <li>{@link CompanyCertDetail#companyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertDetail#companyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertDetail#setCertInfo(CertInfo)}
   *   <li>{@link CompanyCertDetail#setCompanyCertAttributes(CompanyCertAttributes)}
   *   <li>{@link CompanyCertDetail#setCompanyCertInfo(CompanyCertInfo)}
   *   <li>{@link CompanyCertDetail#toString()}
   *   <li>{@link CompanyCertDetail#getCertInfo()}
   *   <li>{@link CompanyCertDetail#getCompanyCertAttributes()}
   *   <li>{@link CompanyCertDetail#getCompanyCertInfo()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void CompanyCertDetail.<init>()", "CompanyCertDetail CompanyCertDetail.certInfo(CertInfo)",
      "CompanyCertDetail CompanyCertDetail.companyCertAttributes(CompanyCertAttributes)",
      "CompanyCertDetail CompanyCertDetail.companyCertInfo(CompanyCertInfo)",
      "CertInfo CompanyCertDetail.getCertInfo()", "CompanyCertAttributes CompanyCertDetail.getCompanyCertAttributes()",
      "CompanyCertInfo CompanyCertDetail.getCompanyCertInfo()", "void CompanyCertDetail.setCertInfo(CertInfo)",
      "void CompanyCertDetail.setCompanyCertAttributes(CompanyCertAttributes)",
      "void CompanyCertDetail.setCompanyCertInfo(CompanyCertInfo)", "String CompanyCertDetail.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CompanyCertDetail actualCompanyCertDetail = new CompanyCertDetail();
    CompanyCertDetail actualCertInfoResult = actualCompanyCertDetail.certInfo(new CertInfo());
    CompanyCertDetail actualCompanyCertAttributesResult = actualCompanyCertDetail
        .companyCertAttributes(new CompanyCertAttributes());
    CompanyCertDetail actualCompanyCertInfoResult = actualCompanyCertDetail.companyCertInfo(new CompanyCertInfo());
    CertInfo certInfo = new CertInfo();
    actualCompanyCertDetail.setCertInfo(certInfo);
    CompanyCertAttributes companyCertAttributes = new CompanyCertAttributes();
    actualCompanyCertDetail.setCompanyCertAttributes(companyCertAttributes);
    CompanyCertInfo companyCertInfo = new CompanyCertInfo();
    actualCompanyCertDetail.setCompanyCertInfo(companyCertInfo);
    String actualToStringResult = actualCompanyCertDetail.toString();
    CertInfo actualCertInfo = actualCompanyCertDetail.getCertInfo();
    CompanyCertAttributes actualCompanyCertAttributes = actualCompanyCertDetail.getCompanyCertAttributes();

    // Assert
    assertEquals("class CompanyCertDetail {\n" + "    companyCertAttributes: class CompanyCertAttributes {\n"
        + "        name: null\n" + "        type: null\n" + "        status: null\n" + "    }\n"
        + "    companyCertInfo: class CompanyCertInfo {\n" + "        fingerPrint: null\n"
        + "        issuerFingerPrint: null\n" + "        lastSeen: null\n" + "        updatedAt: null\n"
        + "        updatedBy: null\n" + "        commonName: null\n" + "        expiryDate: null\n" + "    }\n"
        + "    certInfo: class CertInfo {\n" + "        []\n" + "    }\n" + "}", actualToStringResult);
    assertSame(certInfo, actualCertInfo);
    assertSame(companyCertAttributes, actualCompanyCertAttributes);
    assertSame(actualCompanyCertDetail, actualCertInfoResult);
    assertSame(actualCompanyCertDetail, actualCompanyCertAttributesResult);
    assertSame(actualCompanyCertDetail, actualCompanyCertInfoResult);
    assertSame(companyCertInfo, actualCompanyCertDetail.getCompanyCertInfo());
  }
}
