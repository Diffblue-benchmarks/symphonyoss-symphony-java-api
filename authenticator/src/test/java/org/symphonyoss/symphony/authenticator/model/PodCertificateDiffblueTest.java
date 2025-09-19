package org.symphonyoss.symphony.authenticator.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class PodCertificateDiffblueTest {
  /**
   * Test {@link PodCertificate#equals(Object)}, and {@link PodCertificate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodCertificate#equals(Object)}
   *   <li>{@link PodCertificate#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PodCertificate podCertificate = new PodCertificate();
    PodCertificate podCertificate2 = new PodCertificate();

    // Act and Assert
    assertEquals(podCertificate, podCertificate2);
    assertEquals(podCertificate.hashCode(), podCertificate2.hashCode());
  }

  /**
   * Test {@link PodCertificate#equals(Object)}, and {@link PodCertificate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PodCertificate#equals(Object)}
   *   <li>{@link PodCertificate#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PodCertificate podCertificate = new PodCertificate();

    // Act and Assert
    assertEquals(podCertificate, podCertificate);
    int expectedHashCodeResult = podCertificate.hashCode();
    assertEquals(expectedHashCodeResult, podCertificate.hashCode());
  }

  /**
   * Test {@link PodCertificate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodCertificate#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodCertificate(), null);
  }

  /**
   * Test {@link PodCertificate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PodCertificate#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PodCertificate.equals(Object)", "int PodCertificate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodCertificate(), "Different type to PodCertificate");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link PodCertificate}
   *   <li>{@link PodCertificate#certificate(String)}
   *   <li>{@link PodCertificate#setCertificate(String)}
   *   <li>{@link PodCertificate#toString()}
   *   <li>{@link PodCertificate#getCertificate()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PodCertificate.<init>()",
    "PodCertificate PodCertificate.certificate(String)",
    "String PodCertificate.getCertificate()",
    "void PodCertificate.setCertificate(String)",
    "String PodCertificate.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    PodCertificate actualPodCertificate = new PodCertificate();
    PodCertificate actualCertificateResult = actualPodCertificate.certificate("Certificate");
    actualPodCertificate.setCertificate("Certificate");
    String actualToStringResult = actualPodCertificate.toString();

    // Assert
    assertEquals("Certificate", actualPodCertificate.getCertificate());
    assertEquals("class PodCertificate {\n    certificate: Certificate\n}", actualToStringResult);
    assertSame(actualPodCertificate, actualCertificateResult);
  }
}
