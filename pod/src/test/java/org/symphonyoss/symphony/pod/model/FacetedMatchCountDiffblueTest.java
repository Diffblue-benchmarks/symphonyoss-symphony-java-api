package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class FacetedMatchCountDiffblueTest {
  /**
   * Test {@link FacetedMatchCount#equals(Object)}, and {@link FacetedMatchCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FacetedMatchCount#equals(Object)}
   *   <li>{@link FacetedMatchCount#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FacetedMatchCount facetedMatchCount = new FacetedMatchCount();
    FacetedMatchCount facetedMatchCount2 = new FacetedMatchCount();

    // Act and Assert
    assertEquals(facetedMatchCount, facetedMatchCount2);
    assertEquals(facetedMatchCount.hashCode(), facetedMatchCount2.hashCode());
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}, and {@link FacetedMatchCount#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FacetedMatchCount#equals(Object)}
   *   <li>{@link FacetedMatchCount#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FacetedMatchCount facetedMatchCount = new FacetedMatchCount();

    // Act and Assert
    assertEquals(facetedMatchCount, facetedMatchCount);
    int expectedHashCodeResult = facetedMatchCount.hashCode();
    assertEquals(expectedHashCodeResult, facetedMatchCount.hashCode());
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FacetedMatchCount#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FacetedMatchCount(), 1);
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FacetedMatchCount#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FacetedMatchCount facetedMatchCount = new FacetedMatchCount();
    facetedMatchCount.facet("Facet");

    // Act and Assert
    assertNotEquals(facetedMatchCount, new FacetedMatchCount());
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FacetedMatchCount#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FacetedMatchCount facetedMatchCount = new FacetedMatchCount();
    facetedMatchCount.count(3);

    // Act and Assert
    assertNotEquals(facetedMatchCount, new FacetedMatchCount());
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FacetedMatchCount#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FacetedMatchCount(), null);
  }

  /**
   * Test {@link FacetedMatchCount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FacetedMatchCount#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FacetedMatchCount.equals(Object)",
    "int FacetedMatchCount.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FacetedMatchCount(), "Different type to FacetedMatchCount");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FacetedMatchCount}
   *   <li>{@link FacetedMatchCount#count(Integer)}
   *   <li>{@link FacetedMatchCount#facet(String)}
   *   <li>{@link FacetedMatchCount#setCount(Integer)}
   *   <li>{@link FacetedMatchCount#setFacet(String)}
   *   <li>{@link FacetedMatchCount#toString()}
   *   <li>{@link FacetedMatchCount#getCount()}
   *   <li>{@link FacetedMatchCount#getFacet()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FacetedMatchCount.<init>()",
    "FacetedMatchCount FacetedMatchCount.count(Integer)",
    "FacetedMatchCount FacetedMatchCount.facet(String)",
    "Integer FacetedMatchCount.getCount()",
    "String FacetedMatchCount.getFacet()",
    "void FacetedMatchCount.setCount(Integer)",
    "void FacetedMatchCount.setFacet(String)",
    "String FacetedMatchCount.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    FacetedMatchCount actualFacetedMatchCount = new FacetedMatchCount();
    FacetedMatchCount actualCountResult = actualFacetedMatchCount.count(3);
    FacetedMatchCount actualFacetResult = actualFacetedMatchCount.facet("Facet");
    actualFacetedMatchCount.setCount(3);
    actualFacetedMatchCount.setFacet("Facet");
    String actualToStringResult = actualFacetedMatchCount.toString();
    Integer actualCount = actualFacetedMatchCount.getCount();

    // Assert
    assertEquals("Facet", actualFacetedMatchCount.getFacet());
    assertEquals(
        "class FacetedMatchCount {\n    facet: Facet\n    count: 3\n}", actualToStringResult);
    assertEquals(3, actualCount.intValue());
    assertSame(actualFacetedMatchCount, actualCountResult);
    assertSame(actualFacetedMatchCount, actualFacetResult);
  }
}
