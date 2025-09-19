package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2MessageImportListDiffblueTest {
  /**
   * Test {@link V2MessageImportList#equals(Object)}, and {@link V2MessageImportList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageImportList#equals(Object)}
   *   <li>{@link V2MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2MessageImportList.equals(Object)",
    "int V2MessageImportList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MessageImportList v2MessageImportList = new V2MessageImportList();
    V2MessageImportList v2MessageImportList2 = new V2MessageImportList();

    // Act and Assert
    assertEquals(v2MessageImportList, v2MessageImportList2);
    assertEquals(v2MessageImportList.hashCode(), v2MessageImportList2.hashCode());
  }

  /**
   * Test {@link V2MessageImportList#equals(Object)}, and {@link V2MessageImportList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2MessageImportList#equals(Object)}
   *   <li>{@link V2MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2MessageImportList.equals(Object)",
    "int V2MessageImportList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MessageImportList v2MessageImportList = new V2MessageImportList();

    // Act and Assert
    assertEquals(v2MessageImportList, v2MessageImportList);
    int expectedHashCodeResult = v2MessageImportList.hashCode();
    assertEquals(expectedHashCodeResult, v2MessageImportList.hashCode());
  }

  /**
   * Test {@link V2MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2MessageImportList.equals(Object)",
    "int V2MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MessageImportList v2MessageImportList = new V2MessageImportList();
    v2MessageImportList.add(new V2ImportedMessage());

    // Act and Assert
    assertNotEquals(v2MessageImportList, new V2MessageImportList());
  }

  /**
   * Test {@link V2MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2MessageImportList.equals(Object)",
    "int V2MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageImportList(), null);
  }

  /**
   * Test {@link V2MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean V2MessageImportList.equals(Object)",
    "int V2MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageImportList(), "Different type to V2MessageImportList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MessageImportList}
   *   <li>{@link V2MessageImportList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2MessageImportList.<init>()",
    "java.lang.String V2MessageImportList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2MessageImportList {\n    []\n}", new V2MessageImportList().toString());
  }
}
