package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AvatarListDiffblueTest {
  /**
   * Test {@link AvatarList#equals(Object)}, and {@link AvatarList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AvatarList#equals(Object)}
   *   <li>{@link AvatarList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AvatarList.equals(Object)", "int AvatarList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AvatarList avatarList = new AvatarList();
    AvatarList avatarList2 = new AvatarList();

    // Act and Assert
    assertEquals(avatarList, avatarList2);
    assertEquals(avatarList.hashCode(), avatarList2.hashCode());
  }

  /**
   * Test {@link AvatarList#equals(Object)}, and {@link AvatarList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AvatarList#equals(Object)}
   *   <li>{@link AvatarList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AvatarList.equals(Object)", "int AvatarList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AvatarList avatarList = new AvatarList();

    // Act and Assert
    assertEquals(avatarList, avatarList);
    int expectedHashCodeResult = avatarList.hashCode();
    assertEquals(expectedHashCodeResult, avatarList.hashCode());
  }

  /**
   * Test {@link AvatarList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AvatarList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AvatarList.equals(Object)", "int AvatarList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AvatarList avatarList = new AvatarList();
    avatarList.add(new Avatar());

    // Act and Assert
    assertNotEquals(avatarList, new AvatarList());
  }

  /**
   * Test {@link AvatarList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AvatarList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AvatarList.equals(Object)", "int AvatarList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AvatarList(), null);
  }

  /**
   * Test {@link AvatarList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AvatarList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AvatarList.equals(Object)", "int AvatarList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AvatarList(), "Different type to AvatarList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AvatarList}
   *   <li>{@link AvatarList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void AvatarList.<init>()", "java.lang.String AvatarList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class AvatarList {\n    []\n}", new AvatarList().toString());
  }
}
