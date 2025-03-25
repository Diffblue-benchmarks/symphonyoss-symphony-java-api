package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class FeatureDiffblueTest {
  /**
   * Test {@link Feature#equals(Object)}, and {@link Feature#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Feature#equals(Object)}
   *   <li>{@link Feature#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Feature feature = new Feature();
    Feature feature2 = new Feature();

    // Act and Assert
    assertEquals(feature, feature2);
    int expectedHashCodeResult = feature.hashCode();
    assertEquals(expectedHashCodeResult, feature2.hashCode());
  }

  /**
   * Test {@link Feature#equals(Object)}, and {@link Feature#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Feature#equals(Object)}
   *   <li>{@link Feature#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Feature feature = new Feature();

    // Act and Assert
    assertEquals(feature, feature);
    int expectedHashCodeResult = feature.hashCode();
    assertEquals(expectedHashCodeResult, feature.hashCode());
  }

  /**
   * Test {@link Feature#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Feature#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Feature(), 1);
  }

  /**
   * Test {@link Feature#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Feature#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Feature feature = new Feature();
    feature.entitlment("Entitlment");

    // Act and Assert
    assertNotEquals(feature, new Feature());
  }

  /**
   * Test {@link Feature#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Feature#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Feature feature = new Feature();
    feature.enabled(true);

    // Act and Assert
    assertNotEquals(feature, new Feature());
  }

  /**
   * Test {@link Feature#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Feature#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Feature(), null);
  }

  /**
   * Test {@link Feature#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Feature#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Feature.equals(Object)", "int Feature.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Feature(), "Different type to Feature");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Feature}
   *   <li>{@link Feature#enabled(Boolean)}
   *   <li>{@link Feature#entitlment(String)}
   *   <li>{@link Feature#setEnabled(Boolean)}
   *   <li>{@link Feature#setEntitlment(String)}
   *   <li>{@link Feature#toString()}
   *   <li>{@link Feature#getEnabled()}
   *   <li>{@link Feature#getEntitlment()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void Feature.<init>()", "Feature Feature.enabled(Boolean)", "Feature Feature.entitlment(String)",
      "Boolean Feature.getEnabled()", "String Feature.getEntitlment()", "void Feature.setEnabled(Boolean)",
      "void Feature.setEntitlment(String)", "String Feature.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    Feature actualFeature = new Feature();
    Feature actualEnabledResult = actualFeature.enabled(true);
    Feature actualEntitlmentResult = actualFeature.entitlment("Entitlment");
    actualFeature.setEnabled(true);
    actualFeature.setEntitlment("Entitlment");
    String actualToStringResult = actualFeature.toString();
    Boolean actualEnabled = actualFeature.getEnabled();

    // Assert
    assertEquals("Entitlment", actualFeature.getEntitlment());
    assertEquals("class Feature {\n    entitlment: Entitlment\n    enabled: true\n}", actualToStringResult);
    assertTrue(actualEnabled);
    assertSame(actualFeature, actualEnabledResult);
    assertSame(actualFeature, actualEntitlmentResult);
  }
}
