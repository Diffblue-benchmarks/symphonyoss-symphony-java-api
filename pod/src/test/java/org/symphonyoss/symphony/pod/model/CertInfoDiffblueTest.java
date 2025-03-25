package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CertInfoDiffblueTest {
  /**
   * Test {@link CertInfo#equals(Object)}, and {@link CertInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CertInfo#equals(Object)}
   *   <li>{@link CertInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CertInfo.equals(Object)", "int CertInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CertInfo certInfo = new CertInfo();
    CertInfo certInfo2 = new CertInfo();

    // Act and Assert
    assertEquals(certInfo, certInfo2);
    int expectedHashCodeResult = certInfo.hashCode();
    assertEquals(expectedHashCodeResult, certInfo2.hashCode());
  }

  /**
   * Test {@link CertInfo#equals(Object)}, and {@link CertInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CertInfo#equals(Object)}
   *   <li>{@link CertInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CertInfo.equals(Object)", "int CertInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CertInfo certInfo = new CertInfo();

    // Act and Assert
    assertEquals(certInfo, certInfo);
    int expectedHashCodeResult = certInfo.hashCode();
    assertEquals(expectedHashCodeResult, certInfo.hashCode());
  }

  /**
   * Test {@link CertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfo.equals(Object)", "int CertInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CertInfo certInfo = new CertInfo();
    certInfo.add(new CertInfoItem());

    // Act and Assert
    assertNotEquals(certInfo, new CertInfo());
  }

  /**
   * Test {@link CertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfo.equals(Object)", "int CertInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfo(), null);
  }

  /**
   * Test {@link CertInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfo.equals(Object)", "int CertInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfo(), "Different type to CertInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CertInfo}
   *   <li>{@link CertInfo#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void CertInfo.<init>()", "java.lang.String CertInfo.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class CertInfo {\n    []\n}", (new CertInfo()).toString());
  }
}
