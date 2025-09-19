package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2PresenceStatusDiffblueTest {
  /**
   * Test {@link V2PresenceStatus#equals(Object)}, and {@link V2PresenceStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2PresenceStatus#equals(Object)}
   *   <li>{@link V2PresenceStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceStatus.equals(Object)", "int V2PresenceStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2PresenceStatus v2PresenceStatus = new V2PresenceStatus();
    V2PresenceStatus v2PresenceStatus2 = new V2PresenceStatus();

    // Act and Assert
    assertEquals(v2PresenceStatus, v2PresenceStatus2);
    assertEquals(v2PresenceStatus.hashCode(), v2PresenceStatus2.hashCode());
  }

  /**
   * Test {@link V2PresenceStatus#equals(Object)}, and {@link V2PresenceStatus#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V2PresenceStatus#equals(Object)}
   *   <li>{@link V2PresenceStatus#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceStatus.equals(Object)", "int V2PresenceStatus.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2PresenceStatus v2PresenceStatus = new V2PresenceStatus();

    // Act and Assert
    assertEquals(v2PresenceStatus, v2PresenceStatus);
    int expectedHashCodeResult = v2PresenceStatus.hashCode();
    assertEquals(expectedHashCodeResult, v2PresenceStatus.hashCode());
  }

  /**
   * Test {@link V2PresenceStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2PresenceStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceStatus.equals(Object)", "int V2PresenceStatus.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceStatus(), null);
  }

  /**
   * Test {@link V2PresenceStatus#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V2PresenceStatus#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V2PresenceStatus.equals(Object)", "int V2PresenceStatus.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceStatus(), "Different type to V2PresenceStatus");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V2PresenceStatus}
   *   <li>{@link V2PresenceStatus#category(String)}
   *   <li>{@link V2PresenceStatus#setCategory(String)}
   *   <li>{@link V2PresenceStatus#toString()}
   *   <li>{@link V2PresenceStatus#getCategory()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V2PresenceStatus.<init>()",
    "V2PresenceStatus V2PresenceStatus.category(String)",
    "String V2PresenceStatus.getCategory()",
    "void V2PresenceStatus.setCategory(String)",
    "String V2PresenceStatus.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V2PresenceStatus actualV2PresenceStatus = new V2PresenceStatus();
    V2PresenceStatus actualCategoryResult = actualV2PresenceStatus.category("Category");
    actualV2PresenceStatus.setCategory("Category");
    String actualToStringResult = actualV2PresenceStatus.toString();

    // Assert
    assertEquals("Category", actualV2PresenceStatus.getCategory());
    assertEquals("class V2PresenceStatus {\n    category: Category\n}", actualToStringResult);
    assertSame(actualV2PresenceStatus, actualCategoryResult);
  }
}
