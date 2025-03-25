package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2MembershipListDiffblueTest {
  /**
   * Test {@link V2MembershipList#equals(Object)}, and {@link V2MembershipList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MembershipList#equals(Object)}
   *   <li>{@link V2MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    V2MembershipList v2MembershipList2 = new V2MembershipList();

    // Act and Assert
    assertEquals(v2MembershipList, v2MembershipList2);
    int expectedHashCodeResult = v2MembershipList.hashCode();
    assertEquals(expectedHashCodeResult, v2MembershipList2.hashCode());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}, and {@link V2MembershipList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2MembershipList#equals(Object)}
   *   <li>{@link V2MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();

    // Act and Assert
    assertEquals(v2MembershipList, v2MembershipList);
    int expectedHashCodeResult = v2MembershipList.hashCode();
    assertEquals(expectedHashCodeResult, v2MembershipList.hashCode());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MembershipList(), 1);
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.count(3);

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.skip(1);

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.limit(1);

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2MembershipList v2MembershipList = new V2MembershipList();
    v2MembershipList.members(new V2MemberInfoList());

    // Act and Assert
    assertNotEquals(v2MembershipList, new V2MembershipList());
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MembershipList(), null);
  }

  /**
   * Test {@link V2MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2MembershipList.equals(Object)", "int V2MembershipList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2MembershipList(), "Different type to V2MembershipList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2MembershipList}
   *   <li>{@link V2MembershipList#count(Integer)}
   *   <li>{@link V2MembershipList#limit(Integer)}
   *   <li>{@link V2MembershipList#members(V2MemberInfoList)}
   *   <li>{@link V2MembershipList#setCount(Integer)}
   *   <li>{@link V2MembershipList#setLimit(Integer)}
   *   <li>{@link V2MembershipList#setMembers(V2MemberInfoList)}
   *   <li>{@link V2MembershipList#setSkip(Integer)}
   *   <li>{@link V2MembershipList#skip(Integer)}
   *   <li>{@link V2MembershipList#toString()}
   *   <li>{@link V2MembershipList#getCount()}
   *   <li>{@link V2MembershipList#getLimit()}
   *   <li>{@link V2MembershipList#getMembers()}
   *   <li>{@link V2MembershipList#getSkip()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2MembershipList.<init>()", "V2MembershipList V2MembershipList.count(Integer)",
      "Integer V2MembershipList.getCount()", "Integer V2MembershipList.getLimit()",
      "V2MemberInfoList V2MembershipList.getMembers()", "Integer V2MembershipList.getSkip()",
      "V2MembershipList V2MembershipList.limit(Integer)", "V2MembershipList V2MembershipList.members(V2MemberInfoList)",
      "void V2MembershipList.setCount(Integer)", "void V2MembershipList.setLimit(Integer)",
      "void V2MembershipList.setMembers(V2MemberInfoList)", "void V2MembershipList.setSkip(Integer)",
      "V2MembershipList V2MembershipList.skip(Integer)", "String V2MembershipList.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V2MembershipList actualV2MembershipList = new V2MembershipList();
    V2MembershipList actualCountResult = actualV2MembershipList.count(3);
    V2MembershipList actualLimitResult = actualV2MembershipList.limit(1);
    V2MembershipList actualMembersResult = actualV2MembershipList.members(new V2MemberInfoList());
    actualV2MembershipList.setCount(3);
    actualV2MembershipList.setLimit(1);
    V2MemberInfoList members = new V2MemberInfoList();
    actualV2MembershipList.setMembers(members);
    actualV2MembershipList.setSkip(1);
    V2MembershipList actualSkipResult = actualV2MembershipList.skip(1);
    String actualToStringResult = actualV2MembershipList.toString();
    Integer actualCount = actualV2MembershipList.getCount();
    Integer actualLimit = actualV2MembershipList.getLimit();
    V2MemberInfoList actualMembers = actualV2MembershipList.getMembers();
    Integer actualSkip = actualV2MembershipList.getSkip();

    // Assert
    assertEquals("class V2MembershipList {\n" + "    count: 3\n" + "    skip: 1\n" + "    limit: 1\n"
        + "    members: class V2MemberInfoList {\n" + "        []\n" + "    }\n" + "}", actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3, actualCount.intValue());
    assertSame(members, actualMembers);
    assertSame(actualV2MembershipList, actualCountResult);
    assertSame(actualV2MembershipList, actualLimitResult);
    assertSame(actualV2MembershipList, actualMembersResult);
    assertSame(actualV2MembershipList, actualSkipResult);
  }
}
