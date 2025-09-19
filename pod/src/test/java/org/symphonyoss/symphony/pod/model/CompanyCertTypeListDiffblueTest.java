package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertTypeListDiffblueTest {
  /**
   * Test {@link CompanyCertTypeList#equals(Object)}, and {@link CompanyCertTypeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertTypeList#equals(Object)}
   *   <li>{@link CompanyCertTypeList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertTypeList.equals(Object)",
    "int CompanyCertTypeList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertTypeList companyCertTypeList = new CompanyCertTypeList();
    CompanyCertTypeList companyCertTypeList2 = new CompanyCertTypeList();

    // Act and Assert
    assertEquals(companyCertTypeList, companyCertTypeList2);
    assertEquals(companyCertTypeList.hashCode(), companyCertTypeList2.hashCode());
  }

  /**
   * Test {@link CompanyCertTypeList#equals(Object)}, and {@link CompanyCertTypeList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertTypeList#equals(Object)}
   *   <li>{@link CompanyCertTypeList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertTypeList.equals(Object)",
    "int CompanyCertTypeList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertTypeList companyCertTypeList = new CompanyCertTypeList();

    // Act and Assert
    assertEquals(companyCertTypeList, companyCertTypeList);
    int expectedHashCodeResult = companyCertTypeList.hashCode();
    assertEquals(expectedHashCodeResult, companyCertTypeList.hashCode());
  }

  /**
   * Test {@link CompanyCertTypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertTypeList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertTypeList.equals(Object)",
    "int CompanyCertTypeList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CompanyCertTypeList companyCertTypeList = new CompanyCertTypeList();
    companyCertTypeList.add(new CompanyCertType());

    // Act and Assert
    assertNotEquals(companyCertTypeList, new CompanyCertTypeList());
  }

  /**
   * Test {@link CompanyCertTypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertTypeList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertTypeList.equals(Object)",
    "int CompanyCertTypeList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertTypeList(), null);
  }

  /**
   * Test {@link CompanyCertTypeList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertTypeList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertTypeList.equals(Object)",
    "int CompanyCertTypeList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertTypeList(), "Different type to CompanyCertTypeList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertTypeList}
   *   <li>{@link CompanyCertTypeList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCertTypeList.<init>()",
    "java.lang.String CompanyCertTypeList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class CompanyCertTypeList {\n    []\n}", new CompanyCertTypeList().toString());
  }
}
