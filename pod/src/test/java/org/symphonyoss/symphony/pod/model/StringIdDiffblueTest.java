package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StringIdDiffblueTest {
  /**
   * Test {@link StringId#equals(Object)}, and {@link StringId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringId#equals(Object)}
   *   <li>{@link StringId#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StringId stringId = new StringId();
    StringId stringId2 = new StringId();

    // Act and Assert
    assertEquals(stringId, stringId2);
    assertEquals(stringId.hashCode(), stringId2.hashCode());
  }

  /**
   * Test {@link StringId#equals(Object)}, and {@link StringId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StringId#equals(Object)}
   *   <li>{@link StringId#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StringId stringId = new StringId();

    // Act and Assert
    assertEquals(stringId, stringId);
    int expectedHashCodeResult = stringId.hashCode();
    assertEquals(expectedHashCodeResult, stringId.hashCode());
  }

  /**
   * Test {@link StringId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringId#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringId(), null);
  }

  /**
   * Test {@link StringId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StringId#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringId.equals(Object)", "int StringId.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StringId(), "Different type to StringId");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link StringId}
   *   <li>{@link StringId#id(String)}
   *   <li>{@link StringId#setId(String)}
   *   <li>{@link StringId#toString()}
   *   <li>{@link StringId#getId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void StringId.<init>()",
    "String StringId.getId()",
    "StringId StringId.id(String)",
    "void StringId.setId(String)",
    "String StringId.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    StringId actualStringId = new StringId();
    StringId actualIdResult = actualStringId.id("42");
    actualStringId.setId("42");
    String actualToStringResult = actualStringId.toString();

    // Assert
    assertEquals("42", actualStringId.getId());
    assertEquals("class StringId {\n    id: 42\n}", actualToStringResult);
    assertSame(actualStringId, actualIdResult);
  }
}
