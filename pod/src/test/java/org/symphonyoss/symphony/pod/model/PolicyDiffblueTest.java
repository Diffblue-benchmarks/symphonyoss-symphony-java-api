package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.Policy.PolicyTypeEnum;

public class PolicyDiffblueTest {
  /**
   * Test {@link Policy#addGroupsItem(String)}.
   * <ul>
   *   <li>Given {@link Policy} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#addGroupsItem(String)}
   */
  @Test
  @MethodsUnderTest({"Policy Policy.addGroupsItem(String)"})
  public void testAddGroupsItem_givenPolicy() {
    // Arrange
    Policy policy = new Policy();

    // Act and Assert
    assertSame(policy, policy.addGroupsItem("Groups Item"));
  }

  /**
   * Test {@link Policy#addGroupsItem(String)}.
   * <ul>
   *   <li>Given {@link Policy} (default constructor) groups {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#addGroupsItem(String)}
   */
  @Test
  @MethodsUnderTest({"Policy Policy.addGroupsItem(String)"})
  public void testAddGroupsItem_givenPolicyGroupsArrayList() {
    // Arrange
    Policy policy = new Policy();
    policy.groups(new ArrayList<>());

    // Act and Assert
    assertSame(policy, policy.addGroupsItem("Groups Item"));
  }

  /**
   * Test {@link Policy#equals(Object)}, and {@link Policy#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Policy#equals(Object)}
   *   <li>{@link Policy#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Policy policy = new Policy();
    Policy policy2 = new Policy();

    // Act and Assert
    assertEquals(policy, policy2);
    int expectedHashCodeResult = policy.hashCode();
    assertEquals(expectedHashCodeResult, policy2.hashCode());
  }

  /**
   * Test {@link Policy#equals(Object)}, and {@link Policy#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link Policy#equals(Object)}
   *   <li>{@link Policy#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Policy policy = new Policy();

    // Act and Assert
    assertEquals(policy, policy);
    int expectedHashCodeResult = policy.hashCode();
    assertEquals(expectedHashCodeResult, policy.hashCode());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Policy policy = new Policy();
    policy.addGroupsItem("Groups Item");

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Policy policy = new Policy();
    policy.id("42");
    policy.addGroupsItem("Groups Item");

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Policy policy = new Policy();
    policy.policyType(PolicyTypeEnum.BLOCK);
    policy.addGroupsItem("Groups Item");

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Policy policy = new Policy();
    policy.active(true);
    policy.addGroupsItem("Groups Item");

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Policy policy = new Policy();
    policy.memberCount(3);
    policy.addGroupsItem("Groups Item");

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    Policy policy = new Policy();
    policy.createdDate(1L);

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    Policy policy = new Policy();
    policy.modifiedDate(1L);

    // Act and Assert
    assertNotEquals(policy, new Policy());
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Policy(), null);
  }

  /**
   * Test {@link Policy#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link Policy#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean Policy.equals(Object)", "int Policy.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Policy(), "Different type to Policy");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link Policy}
   *   <li>{@link Policy#active(Boolean)}
   *   <li>{@link Policy#createdDate(Long)}
   *   <li>{@link Policy#groups(List)}
   *   <li>{@link Policy#id(String)}
   *   <li>{@link Policy#memberCount(Integer)}
   *   <li>{@link Policy#modifiedDate(Long)}
   *   <li>{@link Policy#policyType(PolicyTypeEnum)}
   *   <li>{@link Policy#setActive(Boolean)}
   *   <li>{@link Policy#setCreatedDate(Long)}
   *   <li>{@link Policy#setGroups(List)}
   *   <li>{@link Policy#setId(String)}
   *   <li>{@link Policy#setMemberCount(Integer)}
   *   <li>{@link Policy#setModifiedDate(Long)}
   *   <li>{@link Policy#setPolicyType(PolicyTypeEnum)}
   *   <li>{@link Policy#toString()}
   *   <li>{@link Policy#getActive()}
   *   <li>{@link Policy#getCreatedDate()}
   *   <li>{@link Policy#getGroups()}
   *   <li>{@link Policy#getId()}
   *   <li>{@link Policy#getMemberCount()}
   *   <li>{@link Policy#getModifiedDate()}
   *   <li>{@link Policy#getPolicyType()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void Policy.<init>()", "Policy Policy.active(Boolean)", "Policy Policy.createdDate(Long)",
      "Boolean Policy.getActive()", "Long Policy.getCreatedDate()", "List Policy.getGroups()", "String Policy.getId()",
      "Integer Policy.getMemberCount()", "Long Policy.getModifiedDate()", "PolicyTypeEnum Policy.getPolicyType()",
      "Policy Policy.groups(List)", "Policy Policy.id(String)", "Policy Policy.memberCount(Integer)",
      "Policy Policy.modifiedDate(Long)", "Policy Policy.policyType(PolicyTypeEnum)", "void Policy.setActive(Boolean)",
      "void Policy.setCreatedDate(Long)", "void Policy.setGroups(List)", "void Policy.setId(String)",
      "void Policy.setMemberCount(Integer)", "void Policy.setModifiedDate(Long)",
      "void Policy.setPolicyType(PolicyTypeEnum)", "String Policy.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    Policy actualPolicy = new Policy();
    Policy actualActiveResult = actualPolicy.active(true);
    Policy actualCreatedDateResult = actualPolicy.createdDate(1L);
    Policy actualGroupsResult = actualPolicy.groups(new ArrayList<>());
    Policy actualIdResult = actualPolicy.id("42");
    Policy actualMemberCountResult = actualPolicy.memberCount(3);
    Policy actualModifiedDateResult = actualPolicy.modifiedDate(1L);
    Policy actualPolicyTypeResult = actualPolicy.policyType(PolicyTypeEnum.BLOCK);
    actualPolicy.setActive(true);
    actualPolicy.setCreatedDate(1L);
    ArrayList<String> groups = new ArrayList<>();
    actualPolicy.setGroups(groups);
    actualPolicy.setId("42");
    actualPolicy.setMemberCount(3);
    actualPolicy.setModifiedDate(1L);
    actualPolicy.setPolicyType(PolicyTypeEnum.BLOCK);
    String actualToStringResult = actualPolicy.toString();
    Boolean actualActive = actualPolicy.getActive();
    Long actualCreatedDate = actualPolicy.getCreatedDate();
    List<String> actualGroups = actualPolicy.getGroups();
    String actualId = actualPolicy.getId();
    Integer actualMemberCount = actualPolicy.getMemberCount();
    Long actualModifiedDate = actualPolicy.getModifiedDate();
    PolicyTypeEnum actualPolicyType = actualPolicy.getPolicyType();

    // Assert
    assertEquals("42", actualId);
    assertEquals("class Policy {\n" + "    id: 42\n" + "    policyType: BLOCK\n" + "    active: true\n"
        + "    memberCount: 3\n" + "    groups: []\n" + "    createdDate: 1\n" + "    modifiedDate: 1\n" + "}",
        actualToStringResult);
    assertEquals(1L, actualCreatedDate.longValue());
    assertEquals(1L, actualModifiedDate.longValue());
    assertEquals(3, actualMemberCount.intValue());
    assertEquals(PolicyTypeEnum.BLOCK, actualPolicyType);
    assertTrue(actualGroups.isEmpty());
    assertTrue(actualActive);
    assertSame(groups, actualGroups);
    assertSame(actualPolicy, actualActiveResult);
    assertSame(actualPolicy, actualCreatedDateResult);
    assertSame(actualPolicy, actualGroupsResult);
    assertSame(actualPolicy, actualIdResult);
    assertSame(actualPolicy, actualMemberCountResult);
    assertSame(actualPolicy, actualModifiedDateResult);
    assertSame(actualPolicy, actualPolicyTypeResult);
  }

  /**
   * Test PolicyTypeEnum {@link PolicyTypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code BLOCK}.</li>
   *   <li>Then return {@code BLOCK}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PolicyTypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"PolicyTypeEnum PolicyTypeEnum.fromValue(String)"})
  public void testPolicyTypeEnumFromValue_whenBlock_thenReturnBlock() {
    // Arrange, Act and Assert
    assertEquals(PolicyTypeEnum.BLOCK, PolicyTypeEnum.fromValue("BLOCK"));
  }

  /**
   * Test PolicyTypeEnum {@link PolicyTypeEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link PolicyTypeEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"PolicyTypeEnum PolicyTypeEnum.fromValue(String)"})
  public void testPolicyTypeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PolicyTypeEnum.fromValue("Text"));
  }

  /**
   * Test PolicyTypeEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PolicyTypeEnum#toString()}
   *   <li>{@link PolicyTypeEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String PolicyTypeEnum.getValue()", "String PolicyTypeEnum.toString()"})
  public void testPolicyTypeEnumGettersAndSetters() {
    // Arrange
    PolicyTypeEnum valueOfResult = PolicyTypeEnum.valueOf("BLOCK");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("BLOCK", valueOfResult.getValue());
    assertEquals("BLOCK", actualToStringResult);
  }
}
