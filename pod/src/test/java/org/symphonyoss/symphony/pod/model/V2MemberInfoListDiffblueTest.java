package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2MemberInfoListDiffblueTest {
  /**
   * Test {@link V2MemberInfoList#equals(Object)}, and {@link V2MemberInfoList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberInfoList#equals(Object)}
   *   <li>{@link V2MemberInfoList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MemberInfoList.equals(Object)", "int V2MemberInfoList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MemberInfoList v2MemberInfoList = new V2MemberInfoList();
    V2MemberInfoList v2MemberInfoList2 = new V2MemberInfoList();

    // Act and Assert
    assertEquals(v2MemberInfoList, v2MemberInfoList2);
    int expectedHashCodeResult = v2MemberInfoList.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberInfoList2.hashCode());
  }

  /**
   * Test {@link V2MemberInfoList#equals(Object)}, and {@link V2MemberInfoList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MemberInfoList#equals(Object)}
   *   <li>{@link V2MemberInfoList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MemberInfoList.equals(Object)", "int V2MemberInfoList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MemberInfoList v2MemberInfoList = new V2MemberInfoList();

    // Act and Assert
    assertEquals(v2MemberInfoList, v2MemberInfoList);
    int expectedHashCodeResult = v2MemberInfoList.hashCode();
    assertEquals(expectedHashCodeResult, v2MemberInfoList.hashCode());
  }

  /**
   * Test {@link V2MemberInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MemberInfoList.equals(Object)", "int V2MemberInfoList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    V2MemberInfoList v2MemberInfoList = new V2MemberInfoList();
    v2MemberInfoList.add(new V2MemberInfo());

    // Act and Assert
    assertNotEquals(v2MemberInfoList, new V2MemberInfoList());
  }

  /**
   * Test {@link V2MemberInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MemberInfoList.equals(Object)", "int V2MemberInfoList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberInfoList(), null);
  }

  /**
   * Test {@link V2MemberInfoList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MemberInfoList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MemberInfoList.equals(Object)", "int V2MemberInfoList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MemberInfoList(), "Different type to V2MemberInfoList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MemberInfoList}
   *   <li>{@link V2MemberInfoList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2MemberInfoList.<init>()", "java.lang.String V2MemberInfoList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class V2MemberInfoList {\n    []\n}", (new V2MemberInfoList()).toString());
  }
}
