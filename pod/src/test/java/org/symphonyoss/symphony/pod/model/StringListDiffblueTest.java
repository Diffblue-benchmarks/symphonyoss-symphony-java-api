package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StringListDiffblueTest {
  /**
   * Test {@link StringList#equals(Object)}, and {@link StringList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringList#equals(Object)}
   *   <li>{@link StringList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StringList.equals(Object)", "int StringList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringList stringList = new StringList();
    StringList stringList2 = new StringList();

    // Act and Assert
    assertEquals(stringList, stringList2);
    int expectedHashCodeResult = stringList.hashCode();
    assertEquals(expectedHashCodeResult, stringList2.hashCode());
  }

  /**
   * Test {@link StringList#equals(Object)}, and {@link StringList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StringList#equals(Object)}
   *   <li>{@link StringList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StringList.equals(Object)", "int StringList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringList stringList = new StringList();

    // Act and Assert
    assertEquals(stringList, stringList);
    int expectedHashCodeResult = stringList.hashCode();
    assertEquals(expectedHashCodeResult, stringList.hashCode());
  }

  /**
   * Test {@link StringList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StringList.equals(Object)", "int StringList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StringList stringList = new StringList();
    stringList.add("foo");

    // Act and Assert
    assertNotEquals(stringList, new StringList());
  }

  /**
   * Test {@link StringList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StringList.equals(Object)", "int StringList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringList(), null);
  }

  /**
   * Test {@link StringList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StringList.equals(Object)", "int StringList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringList(), "Different type to StringList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StringList}
   *   <li>{@link StringList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void StringList.<init>()", "java.lang.String StringList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class StringList {\n    []\n}", (new StringList()).toString());
  }
}
