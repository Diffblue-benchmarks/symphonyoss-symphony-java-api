package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class PodAppEntitlementListDiffblueTest {
  /**
   * Test {@link PodAppEntitlementList#equals(Object)}, and {@link PodAppEntitlementList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PodAppEntitlementList#equals(Object)}
   *   <li>{@link PodAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean PodAppEntitlementList.equals(Object)", "int PodAppEntitlementList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PodAppEntitlementList podAppEntitlementList = new PodAppEntitlementList();
    PodAppEntitlementList podAppEntitlementList2 = new PodAppEntitlementList();

    // Act and Assert
    assertEquals(podAppEntitlementList, podAppEntitlementList2);
    int expectedHashCodeResult = podAppEntitlementList.hashCode();
    assertEquals(expectedHashCodeResult, podAppEntitlementList2.hashCode());
  }

  /**
   * Test {@link PodAppEntitlementList#equals(Object)}, and {@link PodAppEntitlementList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PodAppEntitlementList#equals(Object)}
   *   <li>{@link PodAppEntitlementList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean PodAppEntitlementList.equals(Object)", "int PodAppEntitlementList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PodAppEntitlementList podAppEntitlementList = new PodAppEntitlementList();

    // Act and Assert
    assertEquals(podAppEntitlementList, podAppEntitlementList);
    int expectedHashCodeResult = podAppEntitlementList.hashCode();
    assertEquals(expectedHashCodeResult, podAppEntitlementList.hashCode());
  }

  /**
   * Test {@link PodAppEntitlementList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PodAppEntitlementList.equals(Object)", "int PodAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PodAppEntitlementList podAppEntitlementList = new PodAppEntitlementList();
    podAppEntitlementList.add(new PodAppEntitlement());

    // Act and Assert
    assertNotEquals(podAppEntitlementList, new PodAppEntitlementList());
  }

  /**
   * Test {@link PodAppEntitlementList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PodAppEntitlementList.equals(Object)", "int PodAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodAppEntitlementList(), null);
  }

  /**
   * Test {@link PodAppEntitlementList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PodAppEntitlementList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PodAppEntitlementList.equals(Object)", "int PodAppEntitlementList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PodAppEntitlementList(), "Different type to PodAppEntitlementList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PodAppEntitlementList}
   *   <li>{@link PodAppEntitlementList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void PodAppEntitlementList.<init>()", "java.lang.String PodAppEntitlementList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class PodAppEntitlementList {\n    []\n}", (new PodAppEntitlementList()).toString());
  }
}
