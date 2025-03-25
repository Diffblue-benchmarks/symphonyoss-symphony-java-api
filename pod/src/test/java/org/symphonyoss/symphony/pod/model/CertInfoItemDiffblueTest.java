package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class CertInfoItemDiffblueTest {
  /**
   * Test {@link CertInfoItem#addAttributesItem(NameValuePair)}.
   * <ul>
   *   <li>Given {@link CertInfoItem} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#addAttributesItem(NameValuePair)}
   */
  @Test
  @MethodsUnderTest({"CertInfoItem CertInfoItem.addAttributesItem(NameValuePair)"})
  public void testAddAttributesItem_givenCertInfoItem() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();

    // Act and Assert
    assertSame(certInfoItem, certInfoItem.addAttributesItem(new NameValuePair()));
  }

  /**
   * Test {@link CertInfoItem#addAttributesItem(NameValuePair)}.
   * <ul>
   *   <li>Given {@link CertInfoItem} (default constructor) attributes {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#addAttributesItem(NameValuePair)}
   */
  @Test
  @MethodsUnderTest({"CertInfoItem CertInfoItem.addAttributesItem(NameValuePair)"})
  public void testAddAttributesItem_givenCertInfoItemAttributesArrayList() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.attributes(new ArrayList<>());

    // Act and Assert
    assertSame(certInfoItem, certInfoItem.addAttributesItem(new NameValuePair()));
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}, and {@link CertInfoItem#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CertInfoItem#equals(Object)}
   *   <li>{@link CertInfoItem#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    CertInfoItem certInfoItem2 = new CertInfoItem();

    // Act and Assert
    assertEquals(certInfoItem, certInfoItem2);
    int expectedHashCodeResult = certInfoItem.hashCode();
    assertEquals(expectedHashCodeResult, certInfoItem2.hashCode());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}, and {@link CertInfoItem#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link CertInfoItem#equals(Object)}
   *   <li>{@link CertInfoItem#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();

    // Act and Assert
    assertEquals(certInfoItem, certInfoItem);
    int expectedHashCodeResult = certInfoItem.hashCode();
    assertEquals(expectedHashCodeResult, certInfoItem.hashCode());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.addAttributesItem(new NameValuePair());

    // Act and Assert
    assertNotEquals(certInfoItem, new CertInfoItem());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CertInfoItem certInfoItem = new CertInfoItem();
    certInfoItem.name("Name");
    certInfoItem.addAttributesItem(new NameValuePair());

    // Act and Assert
    assertNotEquals(certInfoItem, new CertInfoItem());
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfoItem(), null);
  }

  /**
   * Test {@link CertInfoItem#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link CertInfoItem#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean CertInfoItem.equals(Object)", "int CertInfoItem.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new CertInfoItem(), "Different type to CertInfoItem");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link CertInfoItem}
   *   <li>{@link CertInfoItem#attributes(List)}
   *   <li>{@link CertInfoItem#name(String)}
   *   <li>{@link CertInfoItem#setAttributes(List)}
   *   <li>{@link CertInfoItem#setName(String)}
   *   <li>{@link CertInfoItem#toString()}
   *   <li>{@link CertInfoItem#getAttributes()}
   *   <li>{@link CertInfoItem#getName()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void CertInfoItem.<init>()", "CertInfoItem CertInfoItem.attributes(List)",
      "List CertInfoItem.getAttributes()", "String CertInfoItem.getName()", "CertInfoItem CertInfoItem.name(String)",
      "void CertInfoItem.setAttributes(List)", "void CertInfoItem.setName(String)", "String CertInfoItem.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    CertInfoItem actualCertInfoItem = new CertInfoItem();
    CertInfoItem actualAttributesResult = actualCertInfoItem.attributes(new ArrayList<>());
    CertInfoItem actualNameResult = actualCertInfoItem.name("Name");
    ArrayList<NameValuePair> attributes = new ArrayList<>();
    actualCertInfoItem.setAttributes(attributes);
    actualCertInfoItem.setName("Name");
    String actualToStringResult = actualCertInfoItem.toString();
    List<NameValuePair> actualAttributes = actualCertInfoItem.getAttributes();

    // Assert
    assertEquals("Name", actualCertInfoItem.getName());
    assertEquals("class CertInfoItem {\n    name: Name\n    attributes: []\n}", actualToStringResult);
    assertTrue(actualAttributes.isEmpty());
    assertSame(attributes, actualAttributes);
    assertSame(actualCertInfoItem, actualAttributesResult);
    assertSame(actualCertInfoItem, actualNameResult);
  }
}
