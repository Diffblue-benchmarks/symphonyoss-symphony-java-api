package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AvatarUpdateDiffblueTest {
  /**
   * Test {@link AvatarUpdate#equals(Object)}, and {@link AvatarUpdate#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AvatarUpdate#equals(Object)}
   *   <li>{@link AvatarUpdate#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AvatarUpdate.equals(Object)", "int AvatarUpdate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AvatarUpdate avatarUpdate = new AvatarUpdate();
    AvatarUpdate avatarUpdate2 = new AvatarUpdate();

    // Act and Assert
    assertEquals(avatarUpdate, avatarUpdate2);
    int expectedHashCodeResult = avatarUpdate.hashCode();
    assertEquals(expectedHashCodeResult, avatarUpdate2.hashCode());
  }

  /**
   * Test {@link AvatarUpdate#equals(Object)}, and {@link AvatarUpdate#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AvatarUpdate#equals(Object)}
   *   <li>{@link AvatarUpdate#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AvatarUpdate.equals(Object)", "int AvatarUpdate.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AvatarUpdate avatarUpdate = new AvatarUpdate();

    // Act and Assert
    assertEquals(avatarUpdate, avatarUpdate);
    int expectedHashCodeResult = avatarUpdate.hashCode();
    assertEquals(expectedHashCodeResult, avatarUpdate.hashCode());
  }

  /**
   * Test {@link AvatarUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AvatarUpdate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AvatarUpdate.equals(Object)", "int AvatarUpdate.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AvatarUpdate(), null);
  }

  /**
   * Test {@link AvatarUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AvatarUpdate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AvatarUpdate.equals(Object)", "int AvatarUpdate.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AvatarUpdate(), null);
  }

  /**
   * Test {@link AvatarUpdate#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AvatarUpdate#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AvatarUpdate.equals(Object)", "int AvatarUpdate.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AvatarUpdate(), "Different type to AvatarUpdate");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AvatarUpdate}
   *   <li>{@link AvatarUpdate#image(String)}
   *   <li>{@link AvatarUpdate#setImage(String)}
   *   <li>{@link AvatarUpdate#toString()}
   *   <li>{@link AvatarUpdate#getImage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AvatarUpdate.<init>()", "String AvatarUpdate.getImage()",
      "AvatarUpdate AvatarUpdate.image(String)", "void AvatarUpdate.setImage(String)",
      "String AvatarUpdate.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AvatarUpdate actualAvatarUpdate = new AvatarUpdate();
    AvatarUpdate actualImageResult = actualAvatarUpdate.image("Image");
    actualAvatarUpdate.setImage("Image");
    String actualToStringResult = actualAvatarUpdate.toString();

    // Assert
    assertEquals("Image", actualAvatarUpdate.getImage());
    assertEquals("class AvatarUpdate {\n    image: Image\n}", actualToStringResult);
    assertSame(actualAvatarUpdate, actualImageResult);
  }
}
