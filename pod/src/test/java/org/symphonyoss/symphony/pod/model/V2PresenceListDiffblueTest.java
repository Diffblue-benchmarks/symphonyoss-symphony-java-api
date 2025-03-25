package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2PresenceListDiffblueTest {
  /**
   * Test {@link V2PresenceList#equals(Object)}, and {@link V2PresenceList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2PresenceList#equals(Object)}
   *   <li>{@link V2PresenceList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2PresenceList.equals(Object)", "int V2PresenceList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2PresenceList v2PresenceList = new V2PresenceList();
    V2PresenceList v2PresenceList2 = new V2PresenceList();

    // Act and Assert
    assertEquals(v2PresenceList, v2PresenceList2);
    int expectedHashCodeResult = v2PresenceList.hashCode();
    assertEquals(expectedHashCodeResult, v2PresenceList2.hashCode());
  }

  /**
   * Test {@link V2PresenceList#equals(Object)}, and {@link V2PresenceList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2PresenceList#equals(Object)}
   *   <li>{@link V2PresenceList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2PresenceList.equals(Object)", "int V2PresenceList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2PresenceList v2PresenceList = new V2PresenceList();

    // Act and Assert
    assertEquals(v2PresenceList, v2PresenceList);
    int expectedHashCodeResult = v2PresenceList.hashCode();
    assertEquals(expectedHashCodeResult, v2PresenceList.hashCode());
  }

  /**
   * Test {@link V2PresenceList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2PresenceList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2PresenceList.equals(Object)", "int V2PresenceList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2PresenceList v2PresenceList = new V2PresenceList();
    v2PresenceList.add(new V2Presence());

    // Act and Assert
    assertNotEquals(v2PresenceList, new V2PresenceList());
  }

  /**
   * Test {@link V2PresenceList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2PresenceList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2PresenceList.equals(Object)", "int V2PresenceList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceList(), null);
  }

  /**
   * Test {@link V2PresenceList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2PresenceList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2PresenceList.equals(Object)", "int V2PresenceList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2PresenceList(), "Different type to V2PresenceList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2PresenceList}
   *   <li>{@link V2PresenceList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2PresenceList.<init>()", "java.lang.String V2PresenceList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2PresenceList {\n    []\n}", (new V2PresenceList()).toString());
  }
}
