package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4InitiatorDiffblueTest {
  /**
   * Test {@link V4Initiator#equals(Object)}, and {@link V4Initiator#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Initiator#equals(Object)}
   *   <li>{@link V4Initiator#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Initiator v4Initiator = new V4Initiator();
    V4Initiator v4Initiator2 = new V4Initiator();

    // Act and Assert
    assertEquals(v4Initiator, v4Initiator2);
    int expectedHashCodeResult = v4Initiator.hashCode();
    assertEquals(expectedHashCodeResult, v4Initiator2.hashCode());
  }

  /**
   * Test {@link V4Initiator#equals(Object)}, and {@link V4Initiator#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Initiator#equals(Object)}
   *   <li>{@link V4Initiator#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Initiator v4Initiator = new V4Initiator();

    // Act and Assert
    assertEquals(v4Initiator, v4Initiator);
    int expectedHashCodeResult = v4Initiator.hashCode();
    assertEquals(expectedHashCodeResult, v4Initiator.hashCode());
  }

  /**
   * Test {@link V4Initiator#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Initiator#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Initiator(), null);
  }

  /**
   * Test {@link V4Initiator#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Initiator#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Initiator(), null);
  }

  /**
   * Test {@link V4Initiator#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Initiator#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Initiator.equals(Object)", "int V4Initiator.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Initiator(), "Different type to V4Initiator");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Initiator}
   *   <li>{@link V4Initiator#setUser(V4User)}
   *   <li>{@link V4Initiator#user(V4User)}
   *   <li>{@link V4Initiator#toString()}
   *   <li>{@link V4Initiator#getUser()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4Initiator.<init>()", "V4User V4Initiator.getUser()", "void V4Initiator.setUser(V4User)",
      "String V4Initiator.toString()", "V4Initiator V4Initiator.user(V4User)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V4Initiator actualV4Initiator = new V4Initiator();
    actualV4Initiator.setUser(new V4User());
    V4User user = new V4User();
    V4Initiator actualUserResult = actualV4Initiator.user(user);
    String actualToStringResult = actualV4Initiator.toString();

    // Assert
    assertEquals("class V4Initiator {\n" + "    user: class V4User {\n" + "        userId: null\n"
        + "        firstName: null\n" + "        lastName: null\n" + "        displayName: null\n"
        + "        email: null\n" + "        username: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(actualV4Initiator, actualUserResult);
    assertSame(user, actualV4Initiator.getUser());
  }
}
