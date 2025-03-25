package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class DisclaimerListDiffblueTest {
  /**
   * Test {@link DisclaimerList#equals(Object)}, and {@link DisclaimerList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DisclaimerList#equals(Object)}
   *   <li>{@link DisclaimerList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean DisclaimerList.equals(Object)", "int DisclaimerList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DisclaimerList disclaimerList = new DisclaimerList();
    DisclaimerList disclaimerList2 = new DisclaimerList();

    // Act and Assert
    assertEquals(disclaimerList, disclaimerList2);
    int expectedHashCodeResult = disclaimerList.hashCode();
    assertEquals(expectedHashCodeResult, disclaimerList2.hashCode());
  }

  /**
   * Test {@link DisclaimerList#equals(Object)}, and {@link DisclaimerList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DisclaimerList#equals(Object)}
   *   <li>{@link DisclaimerList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean DisclaimerList.equals(Object)", "int DisclaimerList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DisclaimerList disclaimerList = new DisclaimerList();

    // Act and Assert
    assertEquals(disclaimerList, disclaimerList);
    int expectedHashCodeResult = disclaimerList.hashCode();
    assertEquals(expectedHashCodeResult, disclaimerList.hashCode());
  }

  /**
   * Test {@link DisclaimerList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DisclaimerList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean DisclaimerList.equals(Object)", "int DisclaimerList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DisclaimerList disclaimerList = new DisclaimerList();
    disclaimerList.add(new Disclaimer());

    // Act and Assert
    assertNotEquals(disclaimerList, new DisclaimerList());
  }

  /**
   * Test {@link DisclaimerList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DisclaimerList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean DisclaimerList.equals(Object)", "int DisclaimerList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DisclaimerList(), null);
  }

  /**
   * Test {@link DisclaimerList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link DisclaimerList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean DisclaimerList.equals(Object)", "int DisclaimerList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new DisclaimerList(), "Different type to DisclaimerList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link DisclaimerList}
   *   <li>{@link DisclaimerList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void DisclaimerList.<init>()", "java.lang.String DisclaimerList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class DisclaimerList {\n    []\n}", (new DisclaimerList()).toString());
  }
}
