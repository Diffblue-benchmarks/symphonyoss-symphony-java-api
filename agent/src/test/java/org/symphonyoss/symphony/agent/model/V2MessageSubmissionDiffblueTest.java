package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.symphonyoss.symphony.agent.model.V2MessageSubmission.FormatEnum;

public class V2MessageSubmissionDiffblueTest {
  /**
   * Test {@link V2MessageSubmission#addAttachmentsItem(AttachmentInfo)}.
   * <ul>
   *   <li>Given {@link V2MessageSubmission} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @MethodsUnderTest({"V2MessageSubmission V2MessageSubmission.addAttachmentsItem(AttachmentInfo)"})
  public void testAddAttachmentsItem_givenV2MessageSubmission() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();

    // Act and Assert
    assertSame(v2MessageSubmission, v2MessageSubmission.addAttachmentsItem(new AttachmentInfo()));
  }

  /**
   * Test {@link V2MessageSubmission#addAttachmentsItem(AttachmentInfo)}.
   * <ul>
   *   <li>Given {@link V2MessageSubmission} (default constructor) attachments {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#addAttachmentsItem(AttachmentInfo)}
   */
  @Test
  @MethodsUnderTest({"V2MessageSubmission V2MessageSubmission.addAttachmentsItem(AttachmentInfo)"})
  public void testAddAttachmentsItem_givenV2MessageSubmissionAttachmentsArrayList() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();
    v2MessageSubmission.attachments(new ArrayList<>());

    // Act and Assert
    assertSame(v2MessageSubmission, v2MessageSubmission.addAttachmentsItem(new AttachmentInfo()));
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}, and {@link V2MessageSubmission#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MessageSubmission#equals(Object)}
   *   <li>{@link V2MessageSubmission#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();
    V2MessageSubmission v2MessageSubmission2 = new V2MessageSubmission();

    // Act and Assert
    assertEquals(v2MessageSubmission, v2MessageSubmission2);
    int expectedHashCodeResult = v2MessageSubmission.hashCode();
    assertEquals(expectedHashCodeResult, v2MessageSubmission2.hashCode());
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}, and {@link V2MessageSubmission#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MessageSubmission#equals(Object)}
   *   <li>{@link V2MessageSubmission#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();

    // Act and Assert
    assertEquals(v2MessageSubmission, v2MessageSubmission);
    int expectedHashCodeResult = v2MessageSubmission.hashCode();
    assertEquals(expectedHashCodeResult, v2MessageSubmission.hashCode());
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();
    v2MessageSubmission.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageSubmission, new V2MessageSubmission());
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();
    v2MessageSubmission.format(FormatEnum.TEXT);
    v2MessageSubmission.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageSubmission, new V2MessageSubmission());
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MessageSubmission v2MessageSubmission = new V2MessageSubmission();
    v2MessageSubmission.message("Not all who wander are lost");
    v2MessageSubmission.addAttachmentsItem(new AttachmentInfo());

    // Act and Assert
    assertNotEquals(v2MessageSubmission, new V2MessageSubmission());
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageSubmission(), null);
  }

  /**
   * Test {@link V2MessageSubmission#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MessageSubmission#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MessageSubmission.equals(Object)", "int V2MessageSubmission.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MessageSubmission(), "Different type to V2MessageSubmission");
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  public void testFormatEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FormatEnum.fromValue("Text"));
  }

  /**
   * Test FormatEnum {@link FormatEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code TEXT}.</li>
   *   <li>Then return {@code TEXT}.</li>
   * </ul>
   * <p>
   * Method under test: {@link FormatEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"FormatEnum FormatEnum.fromValue(String)"})
  public void testFormatEnumFromValue_whenText_thenReturnText() {
    // Arrange, Act and Assert
    assertEquals(FormatEnum.TEXT, FormatEnum.fromValue("TEXT"));
  }

  /**
   * Test FormatEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link FormatEnum#toString()}
   *   <li>{@link FormatEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String FormatEnum.getValue()", "String FormatEnum.toString()"})
  public void testFormatEnumGettersAndSetters() {
    // Arrange
    FormatEnum valueOfResult = FormatEnum.valueOf("TEXT");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("TEXT", valueOfResult.getValue());
    assertEquals("TEXT", actualToStringResult);
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MessageSubmission}
   *   <li>{@link V2MessageSubmission#attachments(List)}
   *   <li>{@link V2MessageSubmission#format(FormatEnum)}
   *   <li>{@link V2MessageSubmission#message(String)}
   *   <li>{@link V2MessageSubmission#setAttachments(List)}
   *   <li>{@link V2MessageSubmission#setFormat(FormatEnum)}
   *   <li>{@link V2MessageSubmission#setMessage(String)}
   *   <li>{@link V2MessageSubmission#toString()}
   *   <li>{@link V2MessageSubmission#getAttachments()}
   *   <li>{@link V2MessageSubmission#getFormat()}
   *   <li>{@link V2MessageSubmission#getMessage()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2MessageSubmission.<init>()", "V2MessageSubmission V2MessageSubmission.attachments(List)",
      "V2MessageSubmission V2MessageSubmission.format(FormatEnum)", "List V2MessageSubmission.getAttachments()",
      "FormatEnum V2MessageSubmission.getFormat()", "String V2MessageSubmission.getMessage()",
      "V2MessageSubmission V2MessageSubmission.message(String)", "void V2MessageSubmission.setAttachments(List)",
      "void V2MessageSubmission.setFormat(FormatEnum)", "void V2MessageSubmission.setMessage(String)",
      "String V2MessageSubmission.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V2MessageSubmission actualV2MessageSubmission = new V2MessageSubmission();
    V2MessageSubmission actualAttachmentsResult = actualV2MessageSubmission.attachments(new ArrayList<>());
    V2MessageSubmission actualFormatResult = actualV2MessageSubmission.format(FormatEnum.TEXT);
    V2MessageSubmission actualMessageResult = actualV2MessageSubmission.message("Not all who wander are lost");
    ArrayList<AttachmentInfo> attachments = new ArrayList<>();
    actualV2MessageSubmission.setAttachments(attachments);
    actualV2MessageSubmission.setFormat(FormatEnum.TEXT);
    actualV2MessageSubmission.setMessage("Not all who wander are lost");
    String actualToStringResult = actualV2MessageSubmission.toString();
    List<AttachmentInfo> actualAttachments = actualV2MessageSubmission.getAttachments();
    FormatEnum actualFormat = actualV2MessageSubmission.getFormat();

    // Assert
    assertEquals("Not all who wander are lost", actualV2MessageSubmission.getMessage());
    assertEquals("class V2MessageSubmission {\n" + "    format: TEXT\n" + "    message: Not all who wander are lost\n"
        + "    attachments: []\n" + "}", actualToStringResult);
    assertEquals(FormatEnum.TEXT, actualFormat);
    assertTrue(actualAttachments.isEmpty());
    assertSame(attachments, actualAttachments);
    assertSame(actualV2MessageSubmission, actualAttachmentsResult);
    assertSame(actualV2MessageSubmission, actualFormatResult);
    assertSame(actualV2MessageSubmission, actualMessageResult);
  }
}
