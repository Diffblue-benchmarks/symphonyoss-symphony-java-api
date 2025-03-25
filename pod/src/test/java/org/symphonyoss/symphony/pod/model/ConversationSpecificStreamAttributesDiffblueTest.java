package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ConversationSpecificStreamAttributesDiffblueTest {
  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}, and {@link ConversationSpecificStreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes2 = new ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(conversationSpecificStreamAttributes, conversationSpecificStreamAttributes2);
    int expectedHashCodeResult = conversationSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, conversationSpecificStreamAttributes2.hashCode());
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}, and {@link ConversationSpecificStreamAttributes#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ConversationSpecificStreamAttributes#equals(Object)}
   *   <li>{@link ConversationSpecificStreamAttributes#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ConversationSpecificStreamAttributes conversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();

    // Act and Assert
    assertEquals(conversationSpecificStreamAttributes, conversationSpecificStreamAttributes);
    int expectedHashCodeResult = conversationSpecificStreamAttributes.hashCode();
    assertEquals(expectedHashCodeResult, conversationSpecificStreamAttributes.hashCode());
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConversationSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConversationSpecificStreamAttributes(), null);
  }

  /**
   * Test {@link ConversationSpecificStreamAttributes#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ConversationSpecificStreamAttributes#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ConversationSpecificStreamAttributes.equals(Object)",
      "int ConversationSpecificStreamAttributes.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ConversationSpecificStreamAttributes(),
        "Different type to ConversationSpecificStreamAttributes");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ConversationSpecificStreamAttributes}
   *   <li>{@link ConversationSpecificStreamAttributes#members(UserIdList)}
   *   <li>{@link ConversationSpecificStreamAttributes#setMembers(UserIdList)}
   *   <li>{@link ConversationSpecificStreamAttributes#toString()}
   *   <li>{@link ConversationSpecificStreamAttributes#getMembers()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void ConversationSpecificStreamAttributes.<init>()",
      "UserIdList ConversationSpecificStreamAttributes.getMembers()",
      "ConversationSpecificStreamAttributes ConversationSpecificStreamAttributes.members(UserIdList)",
      "void ConversationSpecificStreamAttributes.setMembers(UserIdList)",
      "String ConversationSpecificStreamAttributes.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    ConversationSpecificStreamAttributes actualConversationSpecificStreamAttributes = new ConversationSpecificStreamAttributes();
    ConversationSpecificStreamAttributes actualMembersResult = actualConversationSpecificStreamAttributes
        .members(new UserIdList());
    UserIdList members = new UserIdList();
    actualConversationSpecificStreamAttributes.setMembers(members);
    String actualToStringResult = actualConversationSpecificStreamAttributes.toString();

    // Assert
    assertEquals("class ConversationSpecificStreamAttributes {\n    members: class UserIdList {\n        []\n    }\n}",
        actualToStringResult);
    assertSame(actualConversationSpecificStreamAttributes, actualMembersResult);
    assertSame(members, actualConversationSpecificStreamAttributes.getMembers());
  }
}
