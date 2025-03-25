package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2AdminStreamInfoListDiffblueTest {
  /**
   * Test {@link V2AdminStreamInfoList#equals(Object)}, and {@link V2AdminStreamInfoList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamInfoList#equals(Object)}
   *   <li>{@link V2AdminStreamInfoList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfoList.equals(Object)", "int V2AdminStreamInfoList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamInfoList v2AdminStreamInfoList = new V2AdminStreamInfoList();
    V2AdminStreamInfoList v2AdminStreamInfoList2 = new V2AdminStreamInfoList();

    // Act and Assert
    assertEquals(v2AdminStreamInfoList, v2AdminStreamInfoList2);
    int expectedHashCodeResult = v2AdminStreamInfoList.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamInfoList2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamInfoList#equals(Object)}, and {@link V2AdminStreamInfoList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamInfoList#equals(Object)}
   *   <li>{@link V2AdminStreamInfoList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfoList.equals(Object)", "int V2AdminStreamInfoList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamInfoList v2AdminStreamInfoList = new V2AdminStreamInfoList();

    // Act and Assert
    assertEquals(v2AdminStreamInfoList, v2AdminStreamInfoList);
    int expectedHashCodeResult = v2AdminStreamInfoList.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamInfoList.hashCode());
  }

  /**
   * Test {@link V2AdminStreamInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfoList.equals(Object)", "int V2AdminStreamInfoList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2AdminStreamInfoList v2AdminStreamInfoList = new V2AdminStreamInfoList();
    v2AdminStreamInfoList.add(new V2AdminStreamInfo());

    // Act and Assert
    assertNotEquals(v2AdminStreamInfoList, new V2AdminStreamInfoList());
  }

  /**
   * Test {@link V2AdminStreamInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfoList.equals(Object)", "int V2AdminStreamInfoList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamInfoList(), null);
  }

  /**
   * Test {@link V2AdminStreamInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfoList.equals(Object)", "int V2AdminStreamInfoList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamInfoList(), "Different type to V2AdminStreamInfoList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamInfoList}
   *   <li>{@link V2AdminStreamInfoList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2AdminStreamInfoList.<init>()", "java.lang.String V2AdminStreamInfoList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2AdminStreamInfoList {\n    []\n}", (new V2AdminStreamInfoList()).toString());
  }
}
