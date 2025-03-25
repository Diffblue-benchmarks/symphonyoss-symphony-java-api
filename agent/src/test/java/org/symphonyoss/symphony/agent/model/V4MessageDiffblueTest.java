package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class V4MessageDiffblueTest {
  /**
   * Test {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}.
   * <ul>
   *   <li>Given {@link V4Message} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}
   */
  @Test
  @MethodsUnderTest({"V4Message V4Message.addAttachmentsItem(V4AttachmentInfo)"})
  public void testAddAttachmentsItem_givenV4Message() {
    // Arrange
    V4Message v4Message = new V4Message();

    // Act and Assert
    assertSame(v4Message, v4Message.addAttachmentsItem(new V4AttachmentInfo()));
  }

  /**
   * Test {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}.
   * <ul>
   *   <li>Given {@link V4Message} (default constructor) attachments {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#addAttachmentsItem(V4AttachmentInfo)}
   */
  @Test
  @MethodsUnderTest({"V4Message V4Message.addAttachmentsItem(V4AttachmentInfo)"})
  public void testAddAttachmentsItem_givenV4MessageAttachmentsArrayList() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.attachments(new ArrayList<>());

    // Act and Assert
    assertSame(v4Message, v4Message.addAttachmentsItem(new V4AttachmentInfo()));
  }

  /**
   * Test {@link V4Message#equals(Object)}, and {@link V4Message#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Message#equals(Object)}
   *   <li>{@link V4Message#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4Message v4Message = new V4Message();
    V4Message v4Message2 = new V4Message();

    // Act and Assert
    assertEquals(v4Message, v4Message2);
    int expectedHashCodeResult = v4Message.hashCode();
    assertEquals(expectedHashCodeResult, v4Message2.hashCode());
  }

  /**
   * Test {@link V4Message#equals(Object)}, and {@link V4Message#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4Message#equals(Object)}
   *   <li>{@link V4Message#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4Message v4Message = new V4Message();

    // Act and Assert
    assertEquals(v4Message, v4Message);
    int expectedHashCodeResult = v4Message.hashCode();
    assertEquals(expectedHashCodeResult, v4Message.hashCode());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.messageId("42");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.timestamp(10L);
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.message("Not all who wander are lost");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.data("Data");
    v4Message.addAttachmentsItem(new V4AttachmentInfo());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.user(new V4User());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.stream(new V4Stream());

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.externalRecipients(true);

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    V4Message v4Message = new V4Message();
    v4Message.diagnostic("Diagnostic");

    // Act and Assert
    assertNotEquals(v4Message, new V4Message());
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Message(), null);
  }

  /**
   * Test {@link V4Message#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4Message#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4Message.equals(Object)", "int V4Message.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4Message(), "Different type to V4Message");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4Message}
   *   <li>{@link V4Message#attachments(List)}
   *   <li>{@link V4Message#data(String)}
   *   <li>{@link V4Message#diagnostic(String)}
   *   <li>{@link V4Message#externalRecipients(Boolean)}
   *   <li>{@link V4Message#message(String)}
   *   <li>{@link V4Message#messageId(String)}
   *   <li>{@link V4Message#setAttachments(List)}
   *   <li>{@link V4Message#setData(String)}
   *   <li>{@link V4Message#setDiagnostic(String)}
   *   <li>{@link V4Message#setExternalRecipients(Boolean)}
   *   <li>{@link V4Message#setMessage(String)}
   *   <li>{@link V4Message#setMessageId(String)}
   *   <li>{@link V4Message#setStream(V4Stream)}
   *   <li>{@link V4Message#setTimestamp(Long)}
   *   <li>{@link V4Message#setUser(V4User)}
   *   <li>{@link V4Message#stream(V4Stream)}
   *   <li>{@link V4Message#timestamp(Long)}
   *   <li>{@link V4Message#user(V4User)}
   *   <li>{@link V4Message#toString()}
   *   <li>{@link V4Message#getAttachments()}
   *   <li>{@link V4Message#getData()}
   *   <li>{@link V4Message#getDiagnostic()}
   *   <li>{@link V4Message#getExternalRecipients()}
   *   <li>{@link V4Message#getMessage()}
   *   <li>{@link V4Message#getMessageId()}
   *   <li>{@link V4Message#getStream()}
   *   <li>{@link V4Message#getTimestamp()}
   *   <li>{@link V4Message#getUser()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4Message.<init>()", "V4Message V4Message.attachments(List)",
      "V4Message V4Message.data(String)", "V4Message V4Message.diagnostic(String)",
      "V4Message V4Message.externalRecipients(Boolean)", "List V4Message.getAttachments()",
      "String V4Message.getData()", "String V4Message.getDiagnostic()", "Boolean V4Message.getExternalRecipients()",
      "String V4Message.getMessage()", "String V4Message.getMessageId()", "V4Stream V4Message.getStream()",
      "Long V4Message.getTimestamp()", "V4User V4Message.getUser()", "V4Message V4Message.message(String)",
      "V4Message V4Message.messageId(String)", "void V4Message.setAttachments(List)", "void V4Message.setData(String)",
      "void V4Message.setDiagnostic(String)", "void V4Message.setExternalRecipients(Boolean)",
      "void V4Message.setMessage(String)", "void V4Message.setMessageId(String)", "void V4Message.setStream(V4Stream)",
      "void V4Message.setTimestamp(Long)", "void V4Message.setUser(V4User)", "V4Message V4Message.stream(V4Stream)",
      "V4Message V4Message.timestamp(Long)", "String V4Message.toString()", "V4Message V4Message.user(V4User)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V4Message actualV4Message = new V4Message();
    V4Message actualAttachmentsResult = actualV4Message.attachments(new ArrayList<>());
    V4Message actualDataResult = actualV4Message.data("Data");
    V4Message actualDiagnosticResult = actualV4Message.diagnostic("Diagnostic");
    V4Message actualExternalRecipientsResult = actualV4Message.externalRecipients(true);
    V4Message actualMessageResult = actualV4Message.message("Not all who wander are lost");
    V4Message actualMessageIdResult = actualV4Message.messageId("42");
    ArrayList<V4AttachmentInfo> attachments = new ArrayList<>();
    actualV4Message.setAttachments(attachments);
    actualV4Message.setData("Data");
    actualV4Message.setDiagnostic("Diagnostic");
    actualV4Message.setExternalRecipients(true);
    actualV4Message.setMessage("Not all who wander are lost");
    actualV4Message.setMessageId("42");
    actualV4Message.setStream(new V4Stream());
    actualV4Message.setTimestamp(10L);
    actualV4Message.setUser(new V4User());
    V4Stream stream = new V4Stream();
    V4Message actualStreamResult = actualV4Message.stream(stream);
    V4Message actualTimestampResult = actualV4Message.timestamp(10L);
    V4User user = new V4User();
    V4Message actualUserResult = actualV4Message.user(user);
    String actualToStringResult = actualV4Message.toString();
    List<V4AttachmentInfo> actualAttachments = actualV4Message.getAttachments();
    String actualData = actualV4Message.getData();
    String actualDiagnostic = actualV4Message.getDiagnostic();
    Boolean actualExternalRecipients = actualV4Message.getExternalRecipients();
    String actualMessage = actualV4Message.getMessage();
    String actualMessageId = actualV4Message.getMessageId();
    V4Stream actualStream = actualV4Message.getStream();
    Long actualTimestamp = actualV4Message.getTimestamp();
    V4User actualUser = actualV4Message.getUser();

    // Assert
    assertEquals("42", actualMessageId);
    assertEquals("Data", actualData);
    assertEquals("Diagnostic", actualDiagnostic);
    assertEquals("Not all who wander are lost", actualMessage);
    assertEquals("class V4Message {\n" + "    messageId: 42\n" + "    timestamp: 10\n"
        + "    message: Not all who wander are lost\n" + "    data: Data\n" + "    attachments: []\n"
        + "    user: class V4User {\n" + "        userId: null\n" + "        firstName: null\n"
        + "        lastName: null\n" + "        displayName: null\n" + "        email: null\n"
        + "        username: null\n" + "    }\n" + "    stream: class V4Stream {\n" + "        streamId: null\n"
        + "        streamType: null\n" + "        roomName: null\n" + "        members: null\n"
        + "        external: null\n" + "        crossPod: null\n" + "    }\n" + "    externalRecipients: true\n"
        + "    diagnostic: Diagnostic\n" + "}", actualToStringResult);
    assertEquals(10L, actualTimestamp.longValue());
    assertTrue(actualAttachments.isEmpty());
    assertTrue(actualExternalRecipients);
    assertSame(attachments, actualAttachments);
    assertSame(actualV4Message, actualAttachmentsResult);
    assertSame(actualV4Message, actualDataResult);
    assertSame(actualV4Message, actualDiagnosticResult);
    assertSame(actualV4Message, actualExternalRecipientsResult);
    assertSame(actualV4Message, actualMessageResult);
    assertSame(actualV4Message, actualMessageIdResult);
    assertSame(actualV4Message, actualStreamResult);
    assertSame(actualV4Message, actualTimestampResult);
    assertSame(actualV4Message, actualUserResult);
    assertSame(stream, actualStream);
    assertSame(user, actualUser);
  }
}
