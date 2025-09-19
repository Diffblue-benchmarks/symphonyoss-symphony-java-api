package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class AdminStreamListDiffblueTest {
  /**
   * Test {@link AdminStreamList#equals(Object)}, and {@link AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamList#equals(Object)}
   *   <li>{@link AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    AdminStreamList adminStreamList2 = new AdminStreamList();

    // Act and Assert
    assertEquals(adminStreamList, adminStreamList2);
    assertEquals(adminStreamList.hashCode(), adminStreamList2.hashCode());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}, and {@link AdminStreamList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdminStreamList#equals(Object)}
   *   <li>{@link AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();

    // Act and Assert
    assertEquals(adminStreamList, adminStreamList);
    int expectedHashCodeResult = adminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, adminStreamList.hashCode());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamList(), 1);
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.count(3L);

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.skip(1);

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.limit(1);

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.filter(new AdminStreamFilter());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    AdminStreamList adminStreamList = new AdminStreamList();
    adminStreamList.streams(new AdminStreamInfoList());

    // Act and Assert
    assertNotEquals(adminStreamList, new AdminStreamList());
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamList(), null);
  }

  /**
   * Test {@link AdminStreamList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdminStreamList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdminStreamList.equals(Object)", "int AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new AdminStreamList(), "Different type to AdminStreamList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link AdminStreamList}
   *   <li>{@link AdminStreamList#count(Long)}
   *   <li>{@link AdminStreamList#filter(AdminStreamFilter)}
   *   <li>{@link AdminStreamList#limit(Integer)}
   *   <li>{@link AdminStreamList#setCount(Long)}
   *   <li>{@link AdminStreamList#setFilter(AdminStreamFilter)}
   *   <li>{@link AdminStreamList#setLimit(Integer)}
   *   <li>{@link AdminStreamList#setSkip(Integer)}
   *   <li>{@link AdminStreamList#setStreams(AdminStreamInfoList)}
   *   <li>{@link AdminStreamList#skip(Integer)}
   *   <li>{@link AdminStreamList#streams(AdminStreamInfoList)}
   *   <li>{@link AdminStreamList#toString()}
   *   <li>{@link AdminStreamList#getCount()}
   *   <li>{@link AdminStreamList#getFilter()}
   *   <li>{@link AdminStreamList#getLimit()}
   *   <li>{@link AdminStreamList#getSkip()}
   *   <li>{@link AdminStreamList#getStreams()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AdminStreamList.<init>()",
    "AdminStreamList AdminStreamList.count(Long)",
    "AdminStreamList AdminStreamList.filter(AdminStreamFilter)",
    "Long AdminStreamList.getCount()",
    "AdminStreamFilter AdminStreamList.getFilter()",
    "Integer AdminStreamList.getLimit()",
    "Integer AdminStreamList.getSkip()",
    "AdminStreamInfoList AdminStreamList.getStreams()",
    "AdminStreamList AdminStreamList.limit(Integer)",
    "void AdminStreamList.setCount(Long)",
    "void AdminStreamList.setFilter(AdminStreamFilter)",
    "void AdminStreamList.setLimit(Integer)",
    "void AdminStreamList.setSkip(Integer)",
    "void AdminStreamList.setStreams(AdminStreamInfoList)",
    "AdminStreamList AdminStreamList.skip(Integer)",
    "AdminStreamList AdminStreamList.streams(AdminStreamInfoList)",
    "String AdminStreamList.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    AdminStreamList actualAdminStreamList = new AdminStreamList();
    AdminStreamList actualCountResult = actualAdminStreamList.count(3L);
    AdminStreamList actualFilterResult = actualAdminStreamList.filter(new AdminStreamFilter());
    AdminStreamList actualLimitResult = actualAdminStreamList.limit(1);
    actualAdminStreamList.setCount(3L);
    AdminStreamFilter filter = new AdminStreamFilter();
    actualAdminStreamList.setFilter(filter);
    actualAdminStreamList.setLimit(1);
    actualAdminStreamList.setSkip(1);
    actualAdminStreamList.setStreams(new AdminStreamInfoList());
    AdminStreamList actualSkipResult = actualAdminStreamList.skip(1);
    AdminStreamInfoList streams = new AdminStreamInfoList();
    AdminStreamList actualStreamsResult = actualAdminStreamList.streams(streams);
    String actualToStringResult = actualAdminStreamList.toString();
    Long actualCount = actualAdminStreamList.getCount();
    AdminStreamFilter actualFilter = actualAdminStreamList.getFilter();
    Integer actualLimit = actualAdminStreamList.getLimit();
    Integer actualSkip = actualAdminStreamList.getSkip();
    AdminStreamInfoList actualStreams = actualAdminStreamList.getStreams();

    // Assert
    assertEquals(
        "class AdminStreamList {\n"
            + "    count: 3\n"
            + "    skip: 1\n"
            + "    limit: 1\n"
            + "    filter: class AdminStreamFilter {\n"
            + "        streamTypes: null\n"
            + "        scope: null\n"
            + "        origin: null\n"
            + "        status: null\n"
            + "        privacy: null\n"
            + "        startDate: null\n"
            + "        endDate: null\n"
            + "    }\n"
            + "    streams: class AdminStreamInfoList {\n"
            + "        []\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3L, actualCount.longValue());
    assertSame(filter, actualFilter);
    assertSame(streams, actualStreams);
    assertSame(actualAdminStreamList, actualCountResult);
    assertSame(actualAdminStreamList, actualFilterResult);
    assertSame(actualAdminStreamList, actualLimitResult);
    assertSame(actualAdminStreamList, actualSkipResult);
    assertSame(actualAdminStreamList, actualStreamsResult);
  }
}
