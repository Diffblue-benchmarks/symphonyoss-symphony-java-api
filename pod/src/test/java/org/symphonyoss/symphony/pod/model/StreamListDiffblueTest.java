package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StreamListDiffblueTest {
  /**
   * Test {@link StreamList#equals(Object)}, and {@link StreamList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamList#equals(Object)}
   *   <li>{@link StreamList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StreamList.equals(Object)", "int StreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamList streamList = new StreamList();
    StreamList streamList2 = new StreamList();

    // Act and Assert
    assertEquals(streamList, streamList2);
    int expectedHashCodeResult = streamList.hashCode();
    assertEquals(expectedHashCodeResult, streamList2.hashCode());
  }

  /**
   * Test {@link StreamList#equals(Object)}, and {@link StreamList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link StreamList#equals(Object)}
   *   <li>{@link StreamList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean StreamList.equals(Object)", "int StreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamList streamList = new StreamList();

    // Act and Assert
    assertEquals(streamList, streamList);
    int expectedHashCodeResult = streamList.hashCode();
    assertEquals(expectedHashCodeResult, streamList.hashCode());
  }

  /**
   * Test {@link StreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamList.equals(Object)", "int StreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StreamList streamList = new StreamList();
    streamList.add(new StreamAttributes());

    // Act and Assert
    assertNotEquals(streamList, new StreamList());
  }

  /**
   * Test {@link StreamList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamList.equals(Object)", "int StreamList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamList(), null);
  }

  /**
   * Test {@link StreamList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link StreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean StreamList.equals(Object)", "int StreamList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamList(), "Different type to StreamList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamList}
   *   <li>{@link StreamList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void StreamList.<init>()", "java.lang.String StreamList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class StreamList {\n    []\n}", (new StreamList()).toString());
  }
}
