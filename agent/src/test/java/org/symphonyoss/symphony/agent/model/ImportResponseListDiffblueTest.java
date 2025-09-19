package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ImportResponseListDiffblueTest {
  /**
   * Test {@link ImportResponseList#equals(Object)}, and {@link ImportResponseList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImportResponseList#equals(Object)}
   *   <li>{@link ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImportResponseList.equals(Object)",
    "int ImportResponseList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImportResponseList importResponseList = new ImportResponseList();
    ImportResponseList importResponseList2 = new ImportResponseList();

    // Act and Assert
    assertEquals(importResponseList, importResponseList2);
    assertEquals(importResponseList.hashCode(), importResponseList2.hashCode());
  }

  /**
   * Test {@link ImportResponseList#equals(Object)}, and {@link ImportResponseList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImportResponseList#equals(Object)}
   *   <li>{@link ImportResponseList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImportResponseList.equals(Object)",
    "int ImportResponseList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImportResponseList importResponseList = new ImportResponseList();

    // Act and Assert
    assertEquals(importResponseList, importResponseList);
    int expectedHashCodeResult = importResponseList.hashCode();
    assertEquals(expectedHashCodeResult, importResponseList.hashCode());
  }

  /**
   * Test {@link ImportResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportResponseList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImportResponseList.equals(Object)",
    "int ImportResponseList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ImportResponseList importResponseList = new ImportResponseList();
    importResponseList.add(new ImportResponse());

    // Act and Assert
    assertNotEquals(importResponseList, new ImportResponseList());
  }

  /**
   * Test {@link ImportResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportResponseList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImportResponseList.equals(Object)",
    "int ImportResponseList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportResponseList(), null);
  }

  /**
   * Test {@link ImportResponseList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImportResponseList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImportResponseList.equals(Object)",
    "int ImportResponseList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ImportResponseList(), "Different type to ImportResponseList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ImportResponseList}
   *   <li>{@link ImportResponseList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImportResponseList.<init>()",
    "java.lang.String ImportResponseList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class ImportResponseList {\n    []\n}", new ImportResponseList().toString());
  }
}
