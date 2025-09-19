package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.AdminStreamFilter.OriginEnum;
import org.symphonyoss.symphony.pod.model.AdminStreamFilter.PrivacyEnum;
import org.symphonyoss.symphony.pod.model.AdminStreamFilter.ScopeEnum;
import org.symphonyoss.symphony.pod.model.AdminStreamFilter.StatusEnum;

public class AdminStreamFilterDiffblueTest {
  /**
   * Test {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamFilter} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamFilter AdminStreamFilter.addStreamTypesItem(AdminStreamTypeEnum)"})
  public void testAddStreamTypesItem_givenAdminStreamFilter() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();

    // Act
    AdminStreamFilter actualAddStreamTypesItemResult =
        adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Assert
    assertSame(adminStreamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}.
   *
   * <ul>
   *   <li>Given {@link AdminStreamFilter} (default constructor) streamTypes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#addStreamTypesItem(AdminStreamTypeEnum)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"AdminStreamFilter AdminStreamFilter.addStreamTypesItem(AdminStreamTypeEnum)"})
  public void testAddStreamTypesItem_givenAdminStreamFilterStreamTypesArrayList() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.streamTypes(new ArrayList<>());

    // Act
    AdminStreamFilter actualAddStreamTypesItemResult =
        adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Assert
    assertSame(adminStreamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}, and {@link AdminStreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamFilter#equals(Object)}
   *   <li>{@link AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    AdminStreamFilter adminStreamFilter2 = new AdminStreamFilter();

    // Act and Assert
    assertEquals(adminStreamFilter, adminStreamFilter2);
    assertEquals(adminStreamFilter.hashCode(), adminStreamFilter2.hashCode());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}, and {@link AdminStreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamFilter#equals(Object)}
   *   <li>{@link AdminStreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();

    // Act and Assert
    assertEquals(adminStreamFilter, adminStreamFilter);
    int expectedHashCodeResult = adminStreamFilter.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamFilter.hashCode());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.addStreamTypesItem(new AdminStreamTypeEnum());

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.scope(ScopeEnum.INTERNAL);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.origin(OriginEnum.INTERNAL);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.status(StatusEnum.ACTIVE);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.privacy(PrivacyEnum.PUBLIC);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.startDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    AdminStreamFilter adminStreamFilter = new AdminStreamFilter();
    adminStreamFilter.endDate(1L);

    // Act and Assert
    assertNotEquals(adminStreamFilter, new AdminStreamFilter());
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamFilter(), null);
  }

  /**
   * Test {@link AdminStreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdminStreamFilter.equals(Object)",
    "int AdminStreamFilter.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamFilter(), "Different type to AdminStreamFilter");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamFilter}
   *   <li>{@link AdminStreamFilter#endDate(Long)}
   *   <li>{@link AdminStreamFilter#origin(OriginEnum)}
   *   <li>{@link AdminStreamFilter#privacy(PrivacyEnum)}
   *   <li>{@link AdminStreamFilter#scope(ScopeEnum)}
   *   <li>{@link AdminStreamFilter#setEndDate(Long)}
   *   <li>{@link AdminStreamFilter#setOrigin(OriginEnum)}
   *   <li>{@link AdminStreamFilter#setPrivacy(PrivacyEnum)}
   *   <li>{@link AdminStreamFilter#setScope(ScopeEnum)}
   *   <li>{@link AdminStreamFilter#setStartDate(Long)}
   *   <li>{@link AdminStreamFilter#setStatus(StatusEnum)}
   *   <li>{@link AdminStreamFilter#setStreamTypes(List)}
   *   <li>{@link AdminStreamFilter#startDate(Long)}
   *   <li>{@link AdminStreamFilter#status(StatusEnum)}
   *   <li>{@link AdminStreamFilter#streamTypes(List)}
   *   <li>{@link AdminStreamFilter#toString()}
   *   <li>{@link AdminStreamFilter#getEndDate()}
   *   <li>{@link AdminStreamFilter#getOrigin()}
   *   <li>{@link AdminStreamFilter#getPrivacy()}
   *   <li>{@link AdminStreamFilter#getScope()}
   *   <li>{@link AdminStreamFilter#getStartDate()}
   *   <li>{@link AdminStreamFilter#getStatus()}
   *   <li>{@link AdminStreamFilter#getStreamTypes()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamFilter.<init>()",
    "AdminStreamFilter AdminStreamFilter.endDate(Long)",
    "Long AdminStreamFilter.getEndDate()",
    "OriginEnum AdminStreamFilter.getOrigin()",
    "PrivacyEnum AdminStreamFilter.getPrivacy()",
    "ScopeEnum AdminStreamFilter.getScope()",
    "Long AdminStreamFilter.getStartDate()",
    "StatusEnum AdminStreamFilter.getStatus()",
    "List AdminStreamFilter.getStreamTypes()",
    "AdminStreamFilter AdminStreamFilter.origin(OriginEnum)",
    "AdminStreamFilter AdminStreamFilter.privacy(PrivacyEnum)",
    "AdminStreamFilter AdminStreamFilter.scope(ScopeEnum)",
    "void AdminStreamFilter.setEndDate(Long)",
    "void AdminStreamFilter.setOrigin(OriginEnum)",
    "void AdminStreamFilter.setPrivacy(PrivacyEnum)",
    "void AdminStreamFilter.setScope(ScopeEnum)",
    "void AdminStreamFilter.setStartDate(Long)",
    "void AdminStreamFilter.setStatus(StatusEnum)",
    "void AdminStreamFilter.setStreamTypes(List)",
    "AdminStreamFilter AdminStreamFilter.startDate(Long)",
    "AdminStreamFilter AdminStreamFilter.status(StatusEnum)",
    "AdminStreamFilter AdminStreamFilter.streamTypes(List)",
    "String AdminStreamFilter.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamFilter actualAdminStreamFilter = new AdminStreamFilter();
    AdminStreamFilter actualEndDateResult = actualAdminStreamFilter.endDate(1L);
    AdminStreamFilter actualOriginResult = actualAdminStreamFilter.origin(OriginEnum.INTERNAL);
    AdminStreamFilter actualPrivacyResult = actualAdminStreamFilter.privacy(PrivacyEnum.PUBLIC);
    AdminStreamFilter actualScopeResult = actualAdminStreamFilter.scope(ScopeEnum.INTERNAL);
    actualAdminStreamFilter.setEndDate(1L);
    actualAdminStreamFilter.setOrigin(OriginEnum.INTERNAL);
    actualAdminStreamFilter.setPrivacy(PrivacyEnum.PUBLIC);
    actualAdminStreamFilter.setScope(ScopeEnum.INTERNAL);
    actualAdminStreamFilter.setStartDate(1L);
    actualAdminStreamFilter.setStatus(StatusEnum.ACTIVE);
    actualAdminStreamFilter.setStreamTypes(new ArrayList<>());
    AdminStreamFilter actualStartDateResult = actualAdminStreamFilter.startDate(1L);
    AdminStreamFilter actualStatusResult = actualAdminStreamFilter.status(StatusEnum.ACTIVE);
    ArrayList<AdminStreamTypeEnum> streamTypes = new ArrayList<>();
    AdminStreamFilter actualStreamTypesResult = actualAdminStreamFilter.streamTypes(streamTypes);
    String actualToStringResult = actualAdminStreamFilter.toString();
    Long actualEndDate = actualAdminStreamFilter.getEndDate();
    OriginEnum actualOrigin = actualAdminStreamFilter.getOrigin();
    PrivacyEnum actualPrivacy = actualAdminStreamFilter.getPrivacy();
    ScopeEnum actualScope = actualAdminStreamFilter.getScope();
    Long actualStartDate = actualAdminStreamFilter.getStartDate();
    StatusEnum actualStatus = actualAdminStreamFilter.getStatus();
    List<AdminStreamTypeEnum> actualStreamTypes = actualAdminStreamFilter.getStreamTypes();

    // Assert
    assertEquals(
        "class AdminStreamFilter {\n"
            + "    streamTypes: []\n"
            + "    scope: INTERNAL\n"
            + "    origin: INTERNAL\n"
            + "    status: ACTIVE\n"
            + "    privacy: PUBLIC\n"
            + "    startDate: 1\n"
            + "    endDate: 1\n"
            + "}",
        actualToStringResult);
    assertEquals(1L, actualEndDate.longValue());
    assertEquals(1L, actualStartDate.longValue());
    assertEquals(OriginEnum.INTERNAL, actualOrigin);
    assertEquals(PrivacyEnum.PUBLIC, actualPrivacy);
    assertEquals(ScopeEnum.INTERNAL, actualScope);
    assertEquals(StatusEnum.ACTIVE, actualStatus);
    assertTrue(actualStreamTypes.isEmpty());
    assertSame(streamTypes, actualStreamTypes);
    assertSame(actualAdminStreamFilter, actualEndDateResult);
    assertSame(actualAdminStreamFilter, actualOriginResult);
    assertSame(actualAdminStreamFilter, actualPrivacyResult);
    assertSame(actualAdminStreamFilter, actualScopeResult);
    assertSame(actualAdminStreamFilter, actualStartDateResult);
    assertSame(actualAdminStreamFilter, actualStatusResult);
    assertSame(actualAdminStreamFilter, actualStreamTypesResult);
  }

  /**
   * Test OriginEnum {@link OriginEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code INTERNAL}.
   *   <li>Then return {@code INTERNAL}.
   * </ul>
   *
   * <p>Method under test: {@link OriginEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"OriginEnum OriginEnum.fromValue(String)"})
  public void testOriginEnumFromValue_whenInternal_thenReturnInternal() {
    // Arrange, Act and Assert
    assertEquals(OriginEnum.INTERNAL, OriginEnum.fromValue("INTERNAL"));
  }

  /**
   * Test OriginEnum {@link OriginEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OriginEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"OriginEnum OriginEnum.fromValue(String)"})
  public void testOriginEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OriginEnum.fromValue("Text"));
  }

  /**
   * Test OriginEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OriginEnum#toString()}
   *   <li>{@link OriginEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String OriginEnum.getValue()", "String OriginEnum.toString()"})
  public void testOriginEnumGettersAndSetters() {
    // Arrange
    OriginEnum valueOfResult = OriginEnum.valueOf("INTERNAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("INTERNAL", valueOfResult.getValue());
    assertEquals("INTERNAL", actualToStringResult);
  }

  /**
   * Test PrivacyEnum {@link PrivacyEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code PUBLIC}.
   *   <li>Then return {@code PUBLIC}.
   * </ul>
   *
   * <p>Method under test: {@link PrivacyEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PrivacyEnum PrivacyEnum.fromValue(String)"})
  public void testPrivacyEnumFromValue_whenPublic_thenReturnPublic() {
    // Arrange, Act and Assert
    assertEquals(PrivacyEnum.PUBLIC, PrivacyEnum.fromValue("PUBLIC"));
  }

  /**
   * Test PrivacyEnum {@link PrivacyEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PrivacyEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"PrivacyEnum PrivacyEnum.fromValue(String)"})
  public void testPrivacyEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PrivacyEnum.fromValue("Text"));
  }

  /**
   * Test PrivacyEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PrivacyEnum#toString()}
   *   <li>{@link PrivacyEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String PrivacyEnum.getValue()", "String PrivacyEnum.toString()"})
  public void testPrivacyEnumGettersAndSetters() {
    // Arrange
    PrivacyEnum valueOfResult = PrivacyEnum.valueOf("PUBLIC");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("PUBLIC", valueOfResult.getValue());
    assertEquals("PUBLIC", actualToStringResult);
  }

  /**
   * Test ScopeEnum {@link ScopeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code INTERNAL}.
   *   <li>Then return {@code INTERNAL}.
   * </ul>
   *
   * <p>Method under test: {@link ScopeEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ScopeEnum ScopeEnum.fromValue(String)"})
  public void testScopeEnumFromValue_whenInternal_thenReturnInternal() {
    // Arrange, Act and Assert
    assertEquals(ScopeEnum.INTERNAL, ScopeEnum.fromValue("INTERNAL"));
  }

  /**
   * Test ScopeEnum {@link ScopeEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScopeEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ScopeEnum ScopeEnum.fromValue(String)"})
  public void testScopeEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ScopeEnum.fromValue("Text"));
  }

  /**
   * Test ScopeEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScopeEnum#toString()}
   *   <li>{@link ScopeEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ScopeEnum.getValue()", "String ScopeEnum.toString()"})
  public void testScopeEnumGettersAndSetters() {
    // Arrange
    ScopeEnum valueOfResult = ScopeEnum.valueOf("INTERNAL");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("INTERNAL", valueOfResult.getValue());
    assertEquals("INTERNAL", actualToStringResult);
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code ACTIVE}.
   *   <li>Then return {@code ACTIVE}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenActive_thenReturnActive() {
    // Arrange, Act and Assert
    assertEquals(StatusEnum.ACTIVE, StatusEnum.fromValue("ACTIVE"));
  }

  /**
   * Test StatusEnum {@link StatusEnum#fromValue(String)}.
   *
   * <ul>
   *   <li>When {@code Text}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link StatusEnum#fromValue(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StatusEnum StatusEnum.fromValue(String)"})
  public void testStatusEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StatusEnum.fromValue("Text"));
  }

  /**
   * Test StatusEnum getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StatusEnum#toString()}
   *   <li>{@link StatusEnum#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String StatusEnum.getValue()", "String StatusEnum.toString()"})
  public void testStatusEnumGettersAndSetters() {
    // Arrange
    StatusEnum valueOfResult = StatusEnum.valueOf("ACTIVE");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("ACTIVE", valueOfResult.getValue());
    assertEquals("ACTIVE", actualToStringResult);
  }
}
