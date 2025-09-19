package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class FeatureListDiffblueTest {
  /**
   * Test {@link FeatureList#equals(Object)}, and {@link FeatureList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FeatureList#equals(Object)}
   *   <li>{@link FeatureList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FeatureList.equals(Object)", "int FeatureList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FeatureList featureList = new FeatureList();
    FeatureList featureList2 = new FeatureList();

    // Act and Assert
    assertEquals(featureList, featureList2);
    assertEquals(featureList.hashCode(), featureList2.hashCode());
  }

  /**
   * Test {@link FeatureList#equals(Object)}, and {@link FeatureList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FeatureList#equals(Object)}
   *   <li>{@link FeatureList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FeatureList.equals(Object)", "int FeatureList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FeatureList featureList = new FeatureList();

    // Act and Assert
    assertEquals(featureList, featureList);
    int expectedHashCodeResult = featureList.hashCode();
    assertEquals(expectedHashCodeResult, featureList.hashCode());
  }

  /**
   * Test {@link FeatureList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FeatureList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FeatureList.equals(Object)", "int FeatureList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FeatureList featureList = new FeatureList();
    featureList.add(new Feature());

    // Act and Assert
    assertNotEquals(featureList, new FeatureList());
  }

  /**
   * Test {@link FeatureList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FeatureList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FeatureList.equals(Object)", "int FeatureList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FeatureList(), null);
  }

  /**
   * Test {@link FeatureList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FeatureList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FeatureList.equals(Object)", "int FeatureList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FeatureList(), "Different type to FeatureList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FeatureList}
   *   <li>{@link FeatureList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void FeatureList.<init>()", "java.lang.String FeatureList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class FeatureList {\n    []\n}", new FeatureList().toString());
  }
}
