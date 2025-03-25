package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2AdminStreamInfoDiffblueTest {
  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}, and {@link V2AdminStreamInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamInfo#equals(Object)}
   *   <li>{@link V2AdminStreamInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    V2AdminStreamInfo v2AdminStreamInfo2 = new V2AdminStreamInfo();

    // Act and Assert
    assertEquals(v2AdminStreamInfo, v2AdminStreamInfo2);
    int expectedHashCodeResult = v2AdminStreamInfo.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamInfo2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}, and {@link V2AdminStreamInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamInfo#equals(Object)}
   *   <li>{@link V2AdminStreamInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();

    // Act and Assert
    assertEquals(v2AdminStreamInfo, v2AdminStreamInfo);
    int expectedHashCodeResult = v2AdminStreamInfo.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamInfo.hashCode());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamInfo(), 1);
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.id("42");

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.setIsExternal(true);

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.setIsActive(true);

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.setIsPublic(true);

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.type("Type");

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    V2AdminStreamInfo v2AdminStreamInfo = new V2AdminStreamInfo();
    v2AdminStreamInfo.attributes(new V2AdminStreamAttributes());

    // Act and Assert
    assertNotEquals(v2AdminStreamInfo, new V2AdminStreamInfo());
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamInfo(), null);
  }

  /**
   * Test {@link V2AdminStreamInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamInfo.equals(Object)", "int V2AdminStreamInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamInfo(), "Different type to V2AdminStreamInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamInfo}
   *   <li>{@link V2AdminStreamInfo#attributes(V2AdminStreamAttributes)}
   *   <li>{@link V2AdminStreamInfo#id(String)}
   *   <li>{@link V2AdminStreamInfo#setAttributes(V2AdminStreamAttributes)}
   *   <li>{@link V2AdminStreamInfo#setId(String)}
   *   <li>{@link V2AdminStreamInfo#setIsActive(Boolean)}
   *   <li>{@link V2AdminStreamInfo#setIsExternal(Boolean)}
   *   <li>{@link V2AdminStreamInfo#setIsPublic(Boolean)}
   *   <li>{@link V2AdminStreamInfo#setType(String)}
   *   <li>{@link V2AdminStreamInfo#type(String)}
   *   <li>{@link V2AdminStreamInfo#isActive(Boolean)}
   *   <li>{@link V2AdminStreamInfo#isExternal(Boolean)}
   *   <li>{@link V2AdminStreamInfo#isPublic(Boolean)}
   *   <li>{@link V2AdminStreamInfo#toString()}
   *   <li>{@link V2AdminStreamInfo#getAttributes()}
   *   <li>{@link V2AdminStreamInfo#getId()}
   *   <li>{@link V2AdminStreamInfo#getIsActive()}
   *   <li>{@link V2AdminStreamInfo#getIsExternal()}
   *   <li>{@link V2AdminStreamInfo#getIsPublic()}
   *   <li>{@link V2AdminStreamInfo#getType()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2AdminStreamInfo.<init>()",
      "V2AdminStreamInfo V2AdminStreamInfo.attributes(V2AdminStreamAttributes)",
      "V2AdminStreamAttributes V2AdminStreamInfo.getAttributes()", "String V2AdminStreamInfo.getId()",
      "Boolean V2AdminStreamInfo.getIsActive()", "Boolean V2AdminStreamInfo.getIsExternal()",
      "Boolean V2AdminStreamInfo.getIsPublic()", "String V2AdminStreamInfo.getType()",
      "V2AdminStreamInfo V2AdminStreamInfo.id(String)", "V2AdminStreamInfo V2AdminStreamInfo.isActive(Boolean)",
      "V2AdminStreamInfo V2AdminStreamInfo.isExternal(Boolean)",
      "V2AdminStreamInfo V2AdminStreamInfo.isPublic(Boolean)",
      "void V2AdminStreamInfo.setAttributes(V2AdminStreamAttributes)", "void V2AdminStreamInfo.setId(String)",
      "void V2AdminStreamInfo.setIsActive(Boolean)", "void V2AdminStreamInfo.setIsExternal(Boolean)",
      "void V2AdminStreamInfo.setIsPublic(Boolean)", "void V2AdminStreamInfo.setType(String)",
      "String V2AdminStreamInfo.toString()", "V2AdminStreamInfo V2AdminStreamInfo.type(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamInfo actualV2AdminStreamInfo = new V2AdminStreamInfo();
    V2AdminStreamInfo actualAttributesResult = actualV2AdminStreamInfo.attributes(new V2AdminStreamAttributes());
    V2AdminStreamInfo actualIdResult = actualV2AdminStreamInfo.id("42");
    V2AdminStreamAttributes attributes = new V2AdminStreamAttributes();
    actualV2AdminStreamInfo.setAttributes(attributes);
    actualV2AdminStreamInfo.setId("42");
    actualV2AdminStreamInfo.setIsActive(true);
    actualV2AdminStreamInfo.setIsExternal(true);
    actualV2AdminStreamInfo.setIsPublic(true);
    actualV2AdminStreamInfo.setType("Type");
    V2AdminStreamInfo actualTypeResult = actualV2AdminStreamInfo.type("Type");
    V2AdminStreamInfo actualIsActiveResult = actualV2AdminStreamInfo.isActive(true);
    V2AdminStreamInfo actualIsExternalResult = actualV2AdminStreamInfo.isExternal(true);
    V2AdminStreamInfo actualIsPublicResult = actualV2AdminStreamInfo.isPublic(true);
    String actualToStringResult = actualV2AdminStreamInfo.toString();
    V2AdminStreamAttributes actualAttributes = actualV2AdminStreamInfo.getAttributes();
    String actualId = actualV2AdminStreamInfo.getId();
    Boolean actualIsActive = actualV2AdminStreamInfo.getIsActive();
    Boolean actualIsExternal = actualV2AdminStreamInfo.getIsExternal();
    Boolean actualIsPublic = actualV2AdminStreamInfo.getIsPublic();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Type", actualV2AdminStreamInfo.getType());
    assertEquals("class V2AdminStreamInfo {\n" + "    id: 42\n" + "    isExternal: true\n" + "    isActive: true\n"
        + "    isPublic: true\n" + "    type: Type\n" + "    attributes: class V2AdminStreamAttributes {\n"
        + "        roomName: null\n" + "        roomDescription: null\n" + "        members: null\n"
        + "        createdByUserId: null\n" + "        createdDate: null\n" + "        lastModifiedDate: null\n"
        + "        originCompany: null\n" + "        originCompanyId: null\n" + "        membersCount: null\n"
        + "        lastMessageDate: null\n" + "    }\n" + "}", actualToStringResult);
    assertTrue(actualIsActive);
    assertTrue(actualIsExternal);
    assertTrue(actualIsPublic);
    assertSame(attributes, actualAttributes);
    assertSame(actualV2AdminStreamInfo, actualAttributesResult);
    assertSame(actualV2AdminStreamInfo, actualIdResult);
    assertSame(actualV2AdminStreamInfo, actualIsActiveResult);
    assertSame(actualV2AdminStreamInfo, actualIsExternalResult);
    assertSame(actualV2AdminStreamInfo, actualIsPublicResult);
    assertSame(actualV2AdminStreamInfo, actualTypeResult);
  }
}
