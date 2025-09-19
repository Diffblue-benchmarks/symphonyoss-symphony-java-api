package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class CompanyCertInfoListDiffblueTest {
  /**
   * Test {@link CompanyCertInfoList#equals(Object)}, and {@link CompanyCertInfoList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertInfoList#equals(Object)}
   *   <li>{@link CompanyCertInfoList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertInfoList.equals(Object)",
    "int CompanyCertInfoList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CompanyCertInfoList companyCertInfoList = new CompanyCertInfoList();
    CompanyCertInfoList companyCertInfoList2 = new CompanyCertInfoList();

    // Act and Assert
    assertEquals(companyCertInfoList, companyCertInfoList2);
    assertEquals(companyCertInfoList.hashCode(), companyCertInfoList2.hashCode());
  }

  /**
   * Test {@link CompanyCertInfoList#equals(Object)}, and {@link CompanyCertInfoList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CompanyCertInfoList#equals(Object)}
   *   <li>{@link CompanyCertInfoList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertInfoList.equals(Object)",
    "int CompanyCertInfoList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CompanyCertInfoList companyCertInfoList = new CompanyCertInfoList();

    // Act and Assert
    assertEquals(companyCertInfoList, companyCertInfoList);
    int expectedHashCodeResult = companyCertInfoList.hashCode();
    assertEquals(expectedHashCodeResult, companyCertInfoList.hashCode());
  }

  /**
   * Test {@link CompanyCertInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertInfoList.equals(Object)",
    "int CompanyCertInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CompanyCertInfoList companyCertInfoList = new CompanyCertInfoList();
    companyCertInfoList.add(new CompanyCertInfoListInner());

    // Act and Assert
    assertNotEquals(companyCertInfoList, new CompanyCertInfoList());
  }

  /**
   * Test {@link CompanyCertInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertInfoList.equals(Object)",
    "int CompanyCertInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfoList(), null);
  }

  /**
   * Test {@link CompanyCertInfoList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CompanyCertInfoList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CompanyCertInfoList.equals(Object)",
    "int CompanyCertInfoList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CompanyCertInfoList(), "Different type to CompanyCertInfoList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CompanyCertInfoList}
   *   <li>{@link CompanyCertInfoList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CompanyCertInfoList.<init>()",
    "java.lang.String CompanyCertInfoList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class CompanyCertInfoList {\n    []\n}", new CompanyCertInfoList().toString());
  }
}
