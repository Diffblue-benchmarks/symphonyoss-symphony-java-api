package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class MemberInfoDiffblueTest {
  /**
   * Test {@link MemberInfo#equals(Object)}, and {@link MemberInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MemberInfo#equals(Object)}
   *   <li>{@link MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    MemberInfo memberInfo2 = new MemberInfo();

    // Act and Assert
    assertEquals(memberInfo, memberInfo2);
    assertEquals(memberInfo.hashCode(), memberInfo2.hashCode());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}, and {@link MemberInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MemberInfo#equals(Object)}
   *   <li>{@link MemberInfo#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();

    // Act and Assert
    assertEquals(memberInfo, memberInfo);
    int expectedHashCodeResult = memberInfo.hashCode();
    assertEquals(expectedHashCodeResult, memberInfo.hashCode());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MemberInfo(), 1);
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.id(1L);

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.owner(true);

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    MemberInfo memberInfo = new MemberInfo();
    memberInfo.joinDate(1L);

    // Act and Assert
    assertNotEquals(memberInfo, new MemberInfo());
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MemberInfo(), null);
  }

  /**
   * Test {@link MemberInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MemberInfo#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MemberInfo.equals(Object)", "int MemberInfo.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new MemberInfo(), "Different type to MemberInfo");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MemberInfo}
   *   <li>{@link MemberInfo#id(Long)}
   *   <li>{@link MemberInfo#joinDate(Long)}
   *   <li>{@link MemberInfo#owner(Boolean)}
   *   <li>{@link MemberInfo#setId(Long)}
   *   <li>{@link MemberInfo#setJoinDate(Long)}
   *   <li>{@link MemberInfo#setOwner(Boolean)}
   *   <li>{@link MemberInfo#toString()}
   *   <li>{@link MemberInfo#getId()}
   *   <li>{@link MemberInfo#getJoinDate()}
   *   <li>{@link MemberInfo#getOwner()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MemberInfo.<init>()",
    "Long MemberInfo.getId()",
    "Long MemberInfo.getJoinDate()",
    "Boolean MemberInfo.getOwner()",
    "MemberInfo MemberInfo.id(Long)",
    "MemberInfo MemberInfo.joinDate(Long)",
    "MemberInfo MemberInfo.owner(Boolean)",
    "void MemberInfo.setId(Long)",
    "void MemberInfo.setJoinDate(Long)",
    "void MemberInfo.setOwner(Boolean)",
    "String MemberInfo.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    MemberInfo actualMemberInfo = new MemberInfo();
    MemberInfo actualIdResult = actualMemberInfo.id(1L);
    MemberInfo actualJoinDateResult = actualMemberInfo.joinDate(1L);
    MemberInfo actualOwnerResult = actualMemberInfo.owner(true);
    actualMemberInfo.setId(1L);
    actualMemberInfo.setJoinDate(1L);
    actualMemberInfo.setOwner(true);
    String actualToStringResult = actualMemberInfo.toString();
    Long actualId = actualMemberInfo.getId();
    Long actualJoinDate = actualMemberInfo.getJoinDate();
    Boolean actualOwner = actualMemberInfo.getOwner();

    // Assert
    assertEquals(
        "class MemberInfo {\n    id: 1\n    owner: true\n    joinDate: 1\n}", actualToStringResult);
    assertEquals(1L, actualId.longValue());
    assertEquals(1L, actualJoinDate.longValue());
    assertTrue(actualOwner);
    assertSame(actualMemberInfo, actualIdResult);
    assertSame(actualMemberInfo, actualJoinDateResult);
    assertSame(actualMemberInfo, actualOwnerResult);
  }
}
