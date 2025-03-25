package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2ImportResponseListDiffblueTest {
  /**
   * Test {@link V2ImportResponseList#equals(Object)}, and {@link V2ImportResponseList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2ImportResponseList#equals(Object)}
   *   <li>{@link V2ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2ImportResponseList.equals(Object)", "int V2ImportResponseList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2ImportResponseList v2ImportResponseList = new V2ImportResponseList();
    V2ImportResponseList v2ImportResponseList2 = new V2ImportResponseList();

    // Act and Assert
    assertEquals(v2ImportResponseList, v2ImportResponseList2);
    int expectedHashCodeResult = v2ImportResponseList.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportResponseList2.hashCode());
  }

  /**
   * Test {@link V2ImportResponseList#equals(Object)}, and {@link V2ImportResponseList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2ImportResponseList#equals(Object)}
   *   <li>{@link V2ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2ImportResponseList.equals(Object)", "int V2ImportResponseList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2ImportResponseList v2ImportResponseList = new V2ImportResponseList();

    // Act and Assert
    assertEquals(v2ImportResponseList, v2ImportResponseList);
    int expectedHashCodeResult = v2ImportResponseList.hashCode();
    assertEquals(expectedHashCodeResult, v2ImportResponseList.hashCode());
  }

  /**
   * Test {@link V2ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2ImportResponseList.equals(Object)", "int V2ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2ImportResponseList v2ImportResponseList = new V2ImportResponseList();
    v2ImportResponseList.add(new V2ImportResponse());

    // Act and Assert
    assertNotEquals(v2ImportResponseList, new V2ImportResponseList());
  }

  /**
   * Test {@link V2ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2ImportResponseList.equals(Object)", "int V2ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportResponseList(), null);
  }

  /**
   * Test {@link V2ImportResponseList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2ImportResponseList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2ImportResponseList.equals(Object)", "int V2ImportResponseList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2ImportResponseList(), "Different type to V2ImportResponseList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2ImportResponseList}
   *   <li>{@link V2ImportResponseList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2ImportResponseList.<init>()", "java.lang.String V2ImportResponseList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2ImportResponseList {\n    []\n}", (new V2ImportResponseList()).toString());
  }
}
