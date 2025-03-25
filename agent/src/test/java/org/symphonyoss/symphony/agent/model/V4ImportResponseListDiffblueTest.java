package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4ImportResponseListDiffblueTest {
  /**
   * Test {@link V4ImportResponseList#equals(Object)}, and {@link V4ImportResponseList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ImportResponseList#equals(Object)}
   *   <li>{@link V4ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4ImportResponseList.equals(Object)", "int V4ImportResponseList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ImportResponseList v4ImportResponseList = new V4ImportResponseList();
    V4ImportResponseList v4ImportResponseList2 = new V4ImportResponseList();

    // Act and Assert
    assertEquals(v4ImportResponseList, v4ImportResponseList2);
    int expectedHashCodeResult = v4ImportResponseList.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportResponseList2.hashCode());
  }

  /**
   * Test {@link V4ImportResponseList#equals(Object)}, and {@link V4ImportResponseList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ImportResponseList#equals(Object)}
   *   <li>{@link V4ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4ImportResponseList.equals(Object)", "int V4ImportResponseList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ImportResponseList v4ImportResponseList = new V4ImportResponseList();

    // Act and Assert
    assertEquals(v4ImportResponseList, v4ImportResponseList);
    int expectedHashCodeResult = v4ImportResponseList.hashCode();
    assertEquals(expectedHashCodeResult, v4ImportResponseList.hashCode());
  }

  /**
   * Test {@link V4ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ImportResponseList.equals(Object)", "int V4ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4ImportResponseList v4ImportResponseList = new V4ImportResponseList();
    v4ImportResponseList.add(new V4ImportResponse());

    // Act and Assert
    assertNotEquals(v4ImportResponseList, new V4ImportResponseList());
  }

  /**
   * Test {@link V4ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ImportResponseList.equals(Object)", "int V4ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportResponseList(), null);
  }

  /**
   * Test {@link V4ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ImportResponseList.equals(Object)", "int V4ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ImportResponseList(), "Different type to V4ImportResponseList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ImportResponseList}
   *   <li>{@link V4ImportResponseList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4ImportResponseList.<init>()", "java.lang.String V4ImportResponseList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V4ImportResponseList {\n    []\n}", (new V4ImportResponseList()).toString());
  }
}
