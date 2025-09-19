package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserIdDiffblueTest {
  /**
   * Test {@link UserId#equals(Object)}, and {@link UserId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();
    UserId userId2 = new UserId();

    // Act and Assert
    assertEquals(userId, userId2);
    assertEquals(userId.hashCode(), userId2.hashCode());
  }

  /**
   * Test {@link UserId#equals(Object)}, and {@link UserId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserId#equals(Object)}
   *   <li>{@link UserId#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserId userId = new UserId();

    // Act and Assert
    assertEquals(userId, userId);
    int expectedHashCodeResult = userId.hashCode();
    assertEquals(expectedHashCodeResult, userId.hashCode());
  }

  /**
   * Test {@link UserId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserId#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), null);
  }

  /**
   * Test {@link UserId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserId#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean UserId.equals(Object)", "int UserId.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserId(), "Different type to UserId");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserId}
   *   <li>{@link UserId#id(Long)}
   *   <li>{@link UserId#setId(Long)}
   *   <li>{@link UserId#toString()}
   *   <li>{@link UserId#getId()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserId.<init>()",
    "Long UserId.getId()",
    "UserId UserId.id(Long)",
    "void UserId.setId(Long)",
    "String UserId.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserId actualUserId = new UserId();
    UserId actualIdResult = actualUserId.id(1L);
    actualUserId.setId(1L);
    String actualToStringResult = actualUserId.toString();

    // Assert
    assertEquals("class UserId {\n    id: 1\n}", actualToStringResult);
    assertEquals(1L, actualUserId.getId().longValue());
    assertSame(actualUserId, actualIdResult);
  }
}
