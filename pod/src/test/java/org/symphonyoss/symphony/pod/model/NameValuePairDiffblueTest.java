package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class NameValuePairDiffblueTest {
  /**
   * Test {@link NameValuePair#equals(Object)}, and {@link NameValuePair#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link NameValuePair#equals(Object)}
   *   <li>{@link NameValuePair#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NameValuePair nameValuePair = new NameValuePair();
    NameValuePair nameValuePair2 = new NameValuePair();

    // Act and Assert
    assertEquals(nameValuePair, nameValuePair2);
    int expectedHashCodeResult = nameValuePair.hashCode();
    assertEquals(expectedHashCodeResult, nameValuePair2.hashCode());
  }

  /**
   * Test {@link NameValuePair#equals(Object)}, and {@link NameValuePair#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link NameValuePair#equals(Object)}
   *   <li>{@link NameValuePair#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NameValuePair nameValuePair = new NameValuePair();

    // Act and Assert
    assertEquals(nameValuePair, nameValuePair);
    int expectedHashCodeResult = nameValuePair.hashCode();
    assertEquals(expectedHashCodeResult, nameValuePair.hashCode());
  }

  /**
   * Test {@link NameValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NameValuePair#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NameValuePair(), 1);
  }

  /**
   * Test {@link NameValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NameValuePair#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    NameValuePair nameValuePair = new NameValuePair();
    nameValuePair.name("Name");

    // Act and Assert
    assertNotEquals(nameValuePair, new NameValuePair());
  }

  /**
   * Test {@link NameValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NameValuePair#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    NameValuePair nameValuePair = new NameValuePair();
    nameValuePair.value("42");

    // Act and Assert
    assertNotEquals(nameValuePair, new NameValuePair());
  }

  /**
   * Test {@link NameValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NameValuePair#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NameValuePair(), null);
  }

  /**
   * Test {@link NameValuePair#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link NameValuePair#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean NameValuePair.equals(Object)", "int NameValuePair.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NameValuePair(), "Different type to NameValuePair");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link NameValuePair}
   *   <li>{@link NameValuePair#name(String)}
   *   <li>{@link NameValuePair#setName(String)}
   *   <li>{@link NameValuePair#setValue(String)}
   *   <li>{@link NameValuePair#value(String)}
   *   <li>{@link NameValuePair#toString()}
   *   <li>{@link NameValuePair#getName()}
   *   <li>{@link NameValuePair#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void NameValuePair.<init>()", "String NameValuePair.getName()", "String NameValuePair.getValue()",
      "NameValuePair NameValuePair.name(String)", "void NameValuePair.setName(String)",
      "void NameValuePair.setValue(String)", "String NameValuePair.toString()",
      "NameValuePair NameValuePair.value(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    NameValuePair actualNameValuePair = new NameValuePair();
    NameValuePair actualNameResult = actualNameValuePair.name("Name");
    actualNameValuePair.setName("Name");
    actualNameValuePair.setValue("42");
    NameValuePair actualValueResult = actualNameValuePair.value("42");
    String actualToStringResult = actualNameValuePair.toString();
    String actualName = actualNameValuePair.getName();

    // Assert
    assertEquals("42", actualNameValuePair.getValue());
    assertEquals("Name", actualName);
    assertEquals("class NameValuePair {\n    name: Name\n    value: 42\n}", actualToStringResult);
    assertSame(actualNameValuePair, actualNameResult);
    assertSame(actualNameValuePair, actualValueResult);
  }
}
