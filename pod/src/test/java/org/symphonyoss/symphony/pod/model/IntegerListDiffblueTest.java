package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class IntegerListDiffblueTest {
  /**
   * Test {@link IntegerList#equals(Object)}, and {@link IntegerList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegerList#equals(Object)}
   *   <li>{@link IntegerList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntegerList.equals(Object)", "int IntegerList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IntegerList integerList = new IntegerList();
    IntegerList integerList2 = new IntegerList();

    // Act and Assert
    assertEquals(integerList, integerList2);
    assertEquals(integerList.hashCode(), integerList2.hashCode());
  }

  /**
   * Test {@link IntegerList#equals(Object)}, and {@link IntegerList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntegerList#equals(Object)}
   *   <li>{@link IntegerList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntegerList.equals(Object)", "int IntegerList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IntegerList integerList = new IntegerList();

    // Act and Assert
    assertEquals(integerList, integerList);
    int expectedHashCodeResult = integerList.hashCode();
    assertEquals(expectedHashCodeResult, integerList.hashCode());
  }

  /**
   * Test {@link IntegerList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegerList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntegerList.equals(Object)", "int IntegerList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntegerList integerList = new IntegerList();
    integerList.add(1L);

    // Act and Assert
    assertNotEquals(integerList, new IntegerList());
  }

  /**
   * Test {@link IntegerList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegerList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntegerList.equals(Object)", "int IntegerList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegerList(), null);
  }

  /**
   * Test {@link IntegerList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntegerList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntegerList.equals(Object)", "int IntegerList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new IntegerList(), "Different type to IntegerList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link IntegerList}
   *   <li>{@link IntegerList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntegerList.<init>()", "java.lang.String IntegerList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class IntegerList {\n    []\n}", new IntegerList().toString());
  }
}
