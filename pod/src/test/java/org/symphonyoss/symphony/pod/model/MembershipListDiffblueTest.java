package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MembershipListDiffblueTest {
  /**
   * Test {@link MembershipList#equals(Object)}, and {@link MembershipList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MembershipList#equals(Object)}
   *   <li>{@link MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean MembershipList.equals(Object)", "int MembershipList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MembershipList membershipList = new MembershipList();
    MembershipList membershipList2 = new MembershipList();

    // Act and Assert
    assertEquals(membershipList, membershipList2);
    int expectedHashCodeResult = membershipList.hashCode();
    assertEquals(expectedHashCodeResult, membershipList2.hashCode());
  }

  /**
   * Test {@link MembershipList#equals(Object)}, and {@link MembershipList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MembershipList#equals(Object)}
   *   <li>{@link MembershipList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean MembershipList.equals(Object)", "int MembershipList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MembershipList membershipList = new MembershipList();

    // Act and Assert
    assertEquals(membershipList, membershipList);
    int expectedHashCodeResult = membershipList.hashCode();
    assertEquals(expectedHashCodeResult, membershipList.hashCode());
  }

  /**
   * Test {@link MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MembershipList.equals(Object)", "int MembershipList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MembershipList membershipList = new MembershipList();
    membershipList.add(new MemberInfo());

    // Act and Assert
    assertNotEquals(membershipList, new MembershipList());
  }

  /**
   * Test {@link MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MembershipList.equals(Object)", "int MembershipList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipList(), null);
  }

  /**
   * Test {@link MembershipList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link MembershipList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean MembershipList.equals(Object)", "int MembershipList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MembershipList(), "Different type to MembershipList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link MembershipList}
   *   <li>{@link MembershipList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void MembershipList.<init>()", "java.lang.String MembershipList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class MembershipList {\n    []\n}", (new MembershipList()).toString());
  }
}
