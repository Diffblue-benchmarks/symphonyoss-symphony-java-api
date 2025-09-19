package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4MessageSentDiffblueTest {
  /**
   * Test {@link V4MessageSent#equals(Object)}, and {@link V4MessageSent#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4MessageSent#equals(Object)}
   *   <li>{@link V4MessageSent#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageSent.equals(Object)", "int V4MessageSent.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4MessageSent v4MessageSent = new V4MessageSent();
    V4MessageSent v4MessageSent2 = new V4MessageSent();

    // Act and Assert
    assertEquals(v4MessageSent, v4MessageSent2);
    assertEquals(v4MessageSent.hashCode(), v4MessageSent2.hashCode());
  }

  /**
   * Test {@link V4MessageSent#equals(Object)}, and {@link V4MessageSent#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link V4MessageSent#equals(Object)}
   *   <li>{@link V4MessageSent#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageSent.equals(Object)", "int V4MessageSent.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4MessageSent v4MessageSent = new V4MessageSent();

    // Act and Assert
    assertEquals(v4MessageSent, v4MessageSent);
    int expectedHashCodeResult = v4MessageSent.hashCode();
    assertEquals(expectedHashCodeResult, v4MessageSent.hashCode());
  }

  /**
   * Test {@link V4MessageSent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageSent#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageSent.equals(Object)", "int V4MessageSent.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageSent(), null);
  }

  /**
   * Test {@link V4MessageSent#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link V4MessageSent#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean V4MessageSent.equals(Object)", "int V4MessageSent.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4MessageSent(), "Different type to V4MessageSent");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link V4MessageSent}
   *   <li>{@link V4MessageSent#message(V4Message)}
   *   <li>{@link V4MessageSent#setMessage(V4Message)}
   *   <li>{@link V4MessageSent#toString()}
   *   <li>{@link V4MessageSent#getMessage()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void V4MessageSent.<init>()",
    "V4Message V4MessageSent.getMessage()",
    "V4MessageSent V4MessageSent.message(V4Message)",
    "void V4MessageSent.setMessage(V4Message)",
    "String V4MessageSent.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    V4MessageSent actualV4MessageSent = new V4MessageSent();
    V4MessageSent actualMessageResult = actualV4MessageSent.message(new V4Message());
    V4Message message = new V4Message();
    actualV4MessageSent.setMessage(message);
    String actualToStringResult = actualV4MessageSent.toString();

    // Assert
    assertEquals(
        "class V4MessageSent {\n"
            + "    message: class V4Message {\n"
            + "        messageId: null\n"
            + "        timestamp: null\n"
            + "        message: null\n"
            + "        data: null\n"
            + "        attachments: null\n"
            + "        user: null\n"
            + "        stream: null\n"
            + "        externalRecipients: null\n"
            + "        diagnostic: null\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertSame(message, actualV4MessageSent.getMessage());
    assertSame(actualV4MessageSent, actualMessageResult);
  }
}
