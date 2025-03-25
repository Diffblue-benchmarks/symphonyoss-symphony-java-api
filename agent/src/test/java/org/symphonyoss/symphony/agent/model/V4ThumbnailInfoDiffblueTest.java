package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V4ThumbnailInfoDiffblueTest {
  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}, and {@link V4ThumbnailInfo#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ThumbnailInfo#equals(Object)}
   *   <li>{@link V4ThumbnailInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V4ThumbnailInfo v4ThumbnailInfo = new V4ThumbnailInfo();
    V4ThumbnailInfo v4ThumbnailInfo2 = new V4ThumbnailInfo();

    // Act and Assert
    assertEquals(v4ThumbnailInfo, v4ThumbnailInfo2);
    int expectedHashCodeResult = v4ThumbnailInfo.hashCode();
    assertEquals(expectedHashCodeResult, v4ThumbnailInfo2.hashCode());
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}, and {@link V4ThumbnailInfo#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V4ThumbnailInfo#equals(Object)}
   *   <li>{@link V4ThumbnailInfo#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V4ThumbnailInfo v4ThumbnailInfo = new V4ThumbnailInfo();

    // Act and Assert
    assertEquals(v4ThumbnailInfo, v4ThumbnailInfo);
    int expectedHashCodeResult = v4ThumbnailInfo.hashCode();
    assertEquals(expectedHashCodeResult, v4ThumbnailInfo.hashCode());
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ThumbnailInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ThumbnailInfo(), 1);
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ThumbnailInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V4ThumbnailInfo v4ThumbnailInfo = new V4ThumbnailInfo();
    v4ThumbnailInfo.id("42");

    // Act and Assert
    assertNotEquals(v4ThumbnailInfo, new V4ThumbnailInfo());
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ThumbnailInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V4ThumbnailInfo v4ThumbnailInfo = new V4ThumbnailInfo();
    v4ThumbnailInfo.dimension("Dimension");

    // Act and Assert
    assertNotEquals(v4ThumbnailInfo, new V4ThumbnailInfo());
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ThumbnailInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ThumbnailInfo(), null);
  }

  /**
   * Test {@link V4ThumbnailInfo#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V4ThumbnailInfo#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V4ThumbnailInfo.equals(Object)", "int V4ThumbnailInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V4ThumbnailInfo(), "Different type to V4ThumbnailInfo");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V4ThumbnailInfo}
   *   <li>{@link V4ThumbnailInfo#dimension(String)}
   *   <li>{@link V4ThumbnailInfo#id(String)}
   *   <li>{@link V4ThumbnailInfo#setDimension(String)}
   *   <li>{@link V4ThumbnailInfo#setId(String)}
   *   <li>{@link V4ThumbnailInfo#toString()}
   *   <li>{@link V4ThumbnailInfo#getDimension()}
   *   <li>{@link V4ThumbnailInfo#getId()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V4ThumbnailInfo.<init>()", "V4ThumbnailInfo V4ThumbnailInfo.dimension(String)",
      "String V4ThumbnailInfo.getDimension()", "String V4ThumbnailInfo.getId()",
      "V4ThumbnailInfo V4ThumbnailInfo.id(String)", "void V4ThumbnailInfo.setDimension(String)",
      "void V4ThumbnailInfo.setId(String)", "String V4ThumbnailInfo.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V4ThumbnailInfo actualV4ThumbnailInfo = new V4ThumbnailInfo();
    V4ThumbnailInfo actualDimensionResult = actualV4ThumbnailInfo.dimension("Dimension");
    V4ThumbnailInfo actualIdResult = actualV4ThumbnailInfo.id("42");
    actualV4ThumbnailInfo.setDimension("Dimension");
    actualV4ThumbnailInfo.setId("42");
    String actualToStringResult = actualV4ThumbnailInfo.toString();
    String actualDimension = actualV4ThumbnailInfo.getDimension();

    // Assert
    assertEquals("42", actualV4ThumbnailInfo.getId());
    assertEquals("Dimension", actualDimension);
    assertEquals("class V4ThumbnailInfo {\n    id: 42\n    dimension: Dimension\n}", actualToStringResult);
    assertSame(actualV4ThumbnailInfo, actualDimensionResult);
    assertSame(actualV4ThumbnailInfo, actualIdResult);
  }
}
