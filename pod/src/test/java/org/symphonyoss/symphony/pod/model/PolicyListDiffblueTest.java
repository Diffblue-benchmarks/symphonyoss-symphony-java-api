package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class PolicyListDiffblueTest {
  /**
   * Test {@link PolicyList#equals(Object)}, and {@link PolicyList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PolicyList#equals(Object)}
   *   <li>{@link PolicyList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean PolicyList.equals(Object)", "int PolicyList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PolicyList policyList = new PolicyList();
    PolicyList policyList2 = new PolicyList();

    // Act and Assert
    assertEquals(policyList, policyList2);
    int expectedHashCodeResult = policyList.hashCode();
    assertEquals(expectedHashCodeResult, policyList2.hashCode());
  }

  /**
   * Test {@link PolicyList#equals(Object)}, and {@link PolicyList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PolicyList#equals(Object)}
   *   <li>{@link PolicyList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean PolicyList.equals(Object)", "int PolicyList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PolicyList policyList = new PolicyList();

    // Act and Assert
    assertEquals(policyList, policyList);
    int expectedHashCodeResult = policyList.hashCode();
    assertEquals(expectedHashCodeResult, policyList.hashCode());
  }

  /**
   * Test {@link PolicyList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PolicyList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PolicyList.equals(Object)", "int PolicyList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PolicyList policyList = new PolicyList();
    policyList.add(new Policy());

    // Act and Assert
    assertNotEquals(policyList, new PolicyList());
  }

  /**
   * Test {@link PolicyList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PolicyList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PolicyList.equals(Object)", "int PolicyList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PolicyList(), null);
  }

  /**
   * Test {@link PolicyList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link PolicyList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean PolicyList.equals(Object)", "int PolicyList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new PolicyList(), "Different type to PolicyList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link PolicyList}
   *   <li>{@link PolicyList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void PolicyList.<init>()", "java.lang.String PolicyList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class PolicyList {\n    []\n}", (new PolicyList()).toString());
  }
}
