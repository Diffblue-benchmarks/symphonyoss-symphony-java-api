package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V2AdminStreamListDiffblueTest {
  /**
   * Test {@link V2AdminStreamList#equals(Object)}, and {@link V2AdminStreamList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamList#equals(Object)}
   *   <li>{@link V2AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    V2AdminStreamList v2AdminStreamList2 = new V2AdminStreamList();

    // Act and Assert
    assertEquals(v2AdminStreamList, v2AdminStreamList2);
    int expectedHashCodeResult = v2AdminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamList2.hashCode());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}, and {@link V2AdminStreamList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V2AdminStreamList#equals(Object)}
   *   <li>{@link V2AdminStreamList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();

    // Act and Assert
    assertEquals(v2AdminStreamList, v2AdminStreamList);
    int expectedHashCodeResult = v2AdminStreamList.hashCode();
    assertEquals(expectedHashCodeResult, v2AdminStreamList.hashCode());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamList(), 1);
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.count(3L);

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.skip(1);

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.limit(1);

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.filter(new AdminStreamFilter());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    V2AdminStreamList v2AdminStreamList = new V2AdminStreamList();
    v2AdminStreamList.streams(new V2AdminStreamInfoList());

    // Act and Assert
    assertNotEquals(v2AdminStreamList, new V2AdminStreamList());
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamList(), null);
  }

  /**
   * Test {@link V2AdminStreamList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V2AdminStreamList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V2AdminStreamList.equals(Object)", "int V2AdminStreamList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V2AdminStreamList(), "Different type to V2AdminStreamList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V2AdminStreamList}
   *   <li>{@link V2AdminStreamList#count(Long)}
   *   <li>{@link V2AdminStreamList#filter(AdminStreamFilter)}
   *   <li>{@link V2AdminStreamList#limit(Integer)}
   *   <li>{@link V2AdminStreamList#setCount(Long)}
   *   <li>{@link V2AdminStreamList#setFilter(AdminStreamFilter)}
   *   <li>{@link V2AdminStreamList#setLimit(Integer)}
   *   <li>{@link V2AdminStreamList#setSkip(Integer)}
   *   <li>{@link V2AdminStreamList#setStreams(V2AdminStreamInfoList)}
   *   <li>{@link V2AdminStreamList#skip(Integer)}
   *   <li>{@link V2AdminStreamList#streams(V2AdminStreamInfoList)}
   *   <li>{@link V2AdminStreamList#toString()}
   *   <li>{@link V2AdminStreamList#getCount()}
   *   <li>{@link V2AdminStreamList#getFilter()}
   *   <li>{@link V2AdminStreamList#getLimit()}
   *   <li>{@link V2AdminStreamList#getSkip()}
   *   <li>{@link V2AdminStreamList#getStreams()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V2AdminStreamList.<init>()", "V2AdminStreamList V2AdminStreamList.count(Long)",
      "V2AdminStreamList V2AdminStreamList.filter(AdminStreamFilter)", "Long V2AdminStreamList.getCount()",
      "AdminStreamFilter V2AdminStreamList.getFilter()", "Integer V2AdminStreamList.getLimit()",
      "Integer V2AdminStreamList.getSkip()", "V2AdminStreamInfoList V2AdminStreamList.getStreams()",
      "V2AdminStreamList V2AdminStreamList.limit(Integer)", "void V2AdminStreamList.setCount(Long)",
      "void V2AdminStreamList.setFilter(AdminStreamFilter)", "void V2AdminStreamList.setLimit(Integer)",
      "void V2AdminStreamList.setSkip(Integer)", "void V2AdminStreamList.setStreams(V2AdminStreamInfoList)",
      "V2AdminStreamList V2AdminStreamList.skip(Integer)",
      "V2AdminStreamList V2AdminStreamList.streams(V2AdminStreamInfoList)", "String V2AdminStreamList.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V2AdminStreamList actualV2AdminStreamList = new V2AdminStreamList();
    V2AdminStreamList actualCountResult = actualV2AdminStreamList.count(3L);
    V2AdminStreamList actualFilterResult = actualV2AdminStreamList.filter(new AdminStreamFilter());
    V2AdminStreamList actualLimitResult = actualV2AdminStreamList.limit(1);
    actualV2AdminStreamList.setCount(3L);
    AdminStreamFilter filter = new AdminStreamFilter();
    actualV2AdminStreamList.setFilter(filter);
    actualV2AdminStreamList.setLimit(1);
    actualV2AdminStreamList.setSkip(1);
    actualV2AdminStreamList.setStreams(new V2AdminStreamInfoList());
    V2AdminStreamList actualSkipResult = actualV2AdminStreamList.skip(1);
    V2AdminStreamInfoList streams = new V2AdminStreamInfoList();
    V2AdminStreamList actualStreamsResult = actualV2AdminStreamList.streams(streams);
    String actualToStringResult = actualV2AdminStreamList.toString();
    Long actualCount = actualV2AdminStreamList.getCount();
    AdminStreamFilter actualFilter = actualV2AdminStreamList.getFilter();
    Integer actualLimit = actualV2AdminStreamList.getLimit();
    Integer actualSkip = actualV2AdminStreamList.getSkip();
    V2AdminStreamInfoList actualStreams = actualV2AdminStreamList.getStreams();

    // Assert
    assertEquals("class V2AdminStreamList {\n" + "    count: 3\n" + "    skip: 1\n" + "    limit: 1\n"
        + "    filter: class AdminStreamFilter {\n" + "        streamTypes: null\n" + "        scope: null\n"
        + "        origin: null\n" + "        status: null\n" + "        privacy: null\n" + "        startDate: null\n"
        + "        endDate: null\n" + "    }\n" + "    streams: class V2AdminStreamInfoList {\n" + "        []\n"
        + "    }\n" + "}", actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3L, actualCount.longValue());
    assertSame(filter, actualFilter);
    assertSame(streams, actualStreams);
    assertSame(actualV2AdminStreamList, actualCountResult);
    assertSame(actualV2AdminStreamList, actualFilterResult);
    assertSame(actualV2AdminStreamList, actualLimitResult);
    assertSame(actualV2AdminStreamList, actualSkipResult);
    assertSame(actualV2AdminStreamList, actualStreamsResult);
  }
}
