package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MessageImportListDiffblueTest {
  /**
   * Test {@link MessageImportList#equals(Object)}, and {@link MessageImportList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageImportList#equals(Object)}
   *   <li>{@link MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageImportList.equals(Object)",
    "int MessageImportList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MessageImportList messageImportList = new MessageImportList();
    MessageImportList messageImportList2 = new MessageImportList();

    // Act and Assert
    assertEquals(messageImportList, messageImportList2);
    assertEquals(messageImportList.hashCode(), messageImportList2.hashCode());
  }

  /**
   * Test {@link MessageImportList#equals(Object)}, and {@link MessageImportList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageImportList#equals(Object)}
   *   <li>{@link MessageImportList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageImportList.equals(Object)",
    "int MessageImportList.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MessageImportList messageImportList = new MessageImportList();

    // Act and Assert
    assertEquals(messageImportList, messageImportList);
    int expectedHashCodeResult = messageImportList.hashCode();
    assertEquals(expectedHashCodeResult, messageImportList.hashCode());
  }

  /**
   * Test {@link MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageImportList.equals(Object)",
    "int MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MessageImportList messageImportList = new MessageImportList();
    messageImportList.add(new ImportedMessage());

    // Act and Assert
    assertNotEquals(messageImportList, new MessageImportList());
  }

  /**
   * Test {@link MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageImportList.equals(Object)",
    "int MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageImportList(), null);
  }

  /**
   * Test {@link MessageImportList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MessageImportList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MessageImportList.equals(Object)",
    "int MessageImportList.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MessageImportList(), "Different type to MessageImportList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MessageImportList}
   *   <li>{@link MessageImportList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageImportList.<init>()",
    "java.lang.String MessageImportList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class MessageImportList {\n    []\n}", new MessageImportList().toString());
  }
}
