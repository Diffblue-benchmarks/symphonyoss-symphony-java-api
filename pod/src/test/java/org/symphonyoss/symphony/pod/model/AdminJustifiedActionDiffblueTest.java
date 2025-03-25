package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AdminJustifiedActionDiffblueTest {
  /**
   * Test {@link AdminJustifiedAction#equals(Object)}, and {@link AdminJustifiedAction#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AdminJustifiedAction#equals(Object)}
   *   <li>{@link AdminJustifiedAction#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AdminJustifiedAction.equals(Object)", "int AdminJustifiedAction.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminJustifiedAction adminJustifiedAction = new AdminJustifiedAction();
    AdminJustifiedAction adminJustifiedAction2 = new AdminJustifiedAction();

    // Act and Assert
    assertEquals(adminJustifiedAction, adminJustifiedAction2);
    int expectedHashCodeResult = adminJustifiedAction.hashCode();
    assertEquals(expectedHashCodeResult, adminJustifiedAction2.hashCode());
  }

  /**
   * Test {@link AdminJustifiedAction#equals(Object)}, and {@link AdminJustifiedAction#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AdminJustifiedAction#equals(Object)}
   *   <li>{@link AdminJustifiedAction#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean AdminJustifiedAction.equals(Object)", "int AdminJustifiedAction.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminJustifiedAction adminJustifiedAction = new AdminJustifiedAction();

    // Act and Assert
    assertEquals(adminJustifiedAction, adminJustifiedAction);
    int expectedHashCodeResult = adminJustifiedAction.hashCode();
    assertEquals(expectedHashCodeResult, adminJustifiedAction.hashCode());
  }

  /**
   * Test {@link AdminJustifiedAction#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdminJustifiedAction#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AdminJustifiedAction.equals(Object)", "int AdminJustifiedAction.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedAction(), null);
  }

  /**
   * Test {@link AdminJustifiedAction#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdminJustifiedAction#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AdminJustifiedAction.equals(Object)", "int AdminJustifiedAction.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedAction(), null);
  }

  /**
   * Test {@link AdminJustifiedAction#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AdminJustifiedAction#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean AdminJustifiedAction.equals(Object)", "int AdminJustifiedAction.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminJustifiedAction(), "Different type to AdminJustifiedAction");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminJustifiedAction}
   *   <li>{@link AdminJustifiedAction#justification(String)}
   *   <li>{@link AdminJustifiedAction#setJustification(String)}
   *   <li>{@link AdminJustifiedAction#toString()}
   *   <li>{@link AdminJustifiedAction#getJustification()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AdminJustifiedAction.<init>()", "String AdminJustifiedAction.getJustification()",
      "AdminJustifiedAction AdminJustifiedAction.justification(String)",
      "void AdminJustifiedAction.setJustification(String)", "String AdminJustifiedAction.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AdminJustifiedAction actualAdminJustifiedAction = new AdminJustifiedAction();
    AdminJustifiedAction actualJustificationResult = actualAdminJustifiedAction.justification("Justification");
    actualAdminJustifiedAction.setJustification("Justification");
    String actualToStringResult = actualAdminJustifiedAction.toString();

    // Assert
    assertEquals("Justification", actualAdminJustifiedAction.getJustification());
    assertEquals("class AdminJustifiedAction {\n    justification: Justification\n}", actualToStringResult);
    assertSame(actualAdminJustifiedAction, actualJustificationResult);
  }
}
