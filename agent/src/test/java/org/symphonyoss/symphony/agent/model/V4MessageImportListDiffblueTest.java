package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4MessageImportListDiffblueTest {
  /**
   * Test {@link V4MessageImportList#equals(Object)}, and {@link V4MessageImportList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageImportList#equals(Object)}
   *   <li>{@link V4MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4MessageImportList.equals(Object)", "int V4MessageImportList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4MessageImportList v4MessageImportList = new V4MessageImportList();
    V4MessageImportList v4MessageImportList2 = new V4MessageImportList();

    // Act and Assert
    assertEquals(v4MessageImportList, v4MessageImportList2);
    int expectedHashCodeResult = v4MessageImportList.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageImportList2.hashCode());
  }

  /**
   * Test {@link V4MessageImportList#equals(Object)}, and {@link V4MessageImportList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4MessageImportList#equals(Object)}
   *   <li>{@link V4MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4MessageImportList.equals(Object)", "int V4MessageImportList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4MessageImportList v4MessageImportList = new V4MessageImportList();

    // Act and Assert
    assertEquals(v4MessageImportList, v4MessageImportList);
    int expectedHashCodeResult = v4MessageImportList.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageImportList.hashCode());
  }

  /**
   * Test {@link V4MessageImportList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageImportList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4MessageImportList.equals(Object)", "int V4MessageImportList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4MessageImportList v4MessageImportList = new V4MessageImportList();
    v4MessageImportList.add(new V4ImportedMessage());

    // Act and Assert
    assertNotEquals(v4MessageImportList, new V4MessageImportList());
  }

  /**
   * Test {@link V4MessageImportList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageImportList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4MessageImportList.equals(Object)", "int V4MessageImportList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageImportList(), null);
  }

  /**
   * Test {@link V4MessageImportList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4MessageImportList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4MessageImportList.equals(Object)", "int V4MessageImportList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageImportList(), "Different type to V4MessageImportList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4MessageImportList}
   *   <li>{@link V4MessageImportList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4MessageImportList.<init>()", "java.lang.String V4MessageImportList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V4MessageImportList {\n    []\n}", (new V4MessageImportList()).toString());
  }
}
