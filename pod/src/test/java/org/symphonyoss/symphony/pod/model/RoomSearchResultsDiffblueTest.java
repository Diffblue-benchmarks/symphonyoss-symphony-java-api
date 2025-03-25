package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RoomSearchResultsDiffblueTest {
  /**
   * Test {@link RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}.
   * <ul>
   *   <li>Given {@link RoomSearchResults} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}
   */
  @Test
  @MethodsUnderTest({"RoomSearchResults RoomSearchResults.addFacetedMatchCountItem(FacetedMatchCount)"})
  public void testAddFacetedMatchCountItem_givenRoomSearchResults() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();

    // Act and Assert
    assertSame(roomSearchResults, roomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount()));
  }

  /**
   * Test {@link RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}.
   * <ul>
   *   <li>Given {@link RoomSearchResults} (default constructor) facetedMatchCount {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#addFacetedMatchCountItem(FacetedMatchCount)}
   */
  @Test
  @MethodsUnderTest({"RoomSearchResults RoomSearchResults.addFacetedMatchCountItem(FacetedMatchCount)"})
  public void testAddFacetedMatchCountItem_givenRoomSearchResultsFacetedMatchCountArrayList() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.facetedMatchCount(new ArrayList<>());

    // Act and Assert
    assertSame(roomSearchResults, roomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount()));
  }

  /**
   * Test {@link RoomSearchResults#addRoomsItem(V2RoomDetail)}.
   * <ul>
   *   <li>Given {@link RoomSearchResults} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#addRoomsItem(V2RoomDetail)}
   */
  @Test
  @MethodsUnderTest({"RoomSearchResults RoomSearchResults.addRoomsItem(V2RoomDetail)"})
  public void testAddRoomsItem_givenRoomSearchResults() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();

    // Act and Assert
    assertSame(roomSearchResults, roomSearchResults.addRoomsItem(new V2RoomDetail()));
  }

  /**
   * Test {@link RoomSearchResults#addRoomsItem(V2RoomDetail)}.
   * <ul>
   *   <li>Given {@link RoomSearchResults} (default constructor) rooms {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#addRoomsItem(V2RoomDetail)}
   */
  @Test
  @MethodsUnderTest({"RoomSearchResults RoomSearchResults.addRoomsItem(V2RoomDetail)"})
  public void testAddRoomsItem_givenRoomSearchResultsRoomsArrayList() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.rooms(new ArrayList<>());

    // Act and Assert
    assertSame(roomSearchResults, roomSearchResults.addRoomsItem(new V2RoomDetail()));
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}, and {@link RoomSearchResults#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomSearchResults#equals(Object)}
   *   <li>{@link RoomSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    RoomSearchResults roomSearchResults2 = new RoomSearchResults();

    // Act and Assert
    assertEquals(roomSearchResults, roomSearchResults2);
    int expectedHashCodeResult = roomSearchResults.hashCode();
    assertEquals(expectedHashCodeResult, roomSearchResults2.hashCode());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}, and {@link RoomSearchResults#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomSearchResults#equals(Object)}
   *   <li>{@link RoomSearchResults#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();

    // Act and Assert
    assertEquals(roomSearchResults, roomSearchResults);
    int expectedHashCodeResult = roomSearchResults.hashCode();
    assertEquals(expectedHashCodeResult, roomSearchResults.hashCode());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.addRoomsItem(new V2RoomDetail());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.count(3L);
    roomSearchResults.addRoomsItem(new V2RoomDetail());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.skip(1);
    roomSearchResults.addRoomsItem(new V2RoomDetail());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.limit(1);
    roomSearchResults.addRoomsItem(new V2RoomDetail());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.query(new RoomSearchCriteria());
    roomSearchResults.addRoomsItem(new V2RoomDetail());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    RoomSearchResults roomSearchResults = new RoomSearchResults();
    roomSearchResults.addFacetedMatchCountItem(new FacetedMatchCount());

    // Act and Assert
    assertNotEquals(roomSearchResults, new RoomSearchResults());
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSearchResults(), null);
  }

  /**
   * Test {@link RoomSearchResults#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link RoomSearchResults#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean RoomSearchResults.equals(Object)", "int RoomSearchResults.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RoomSearchResults(), "Different type to RoomSearchResults");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link RoomSearchResults}
   *   <li>{@link RoomSearchResults#count(Long)}
   *   <li>{@link RoomSearchResults#facetedMatchCount(List)}
   *   <li>{@link RoomSearchResults#limit(Integer)}
   *   <li>{@link RoomSearchResults#query(RoomSearchCriteria)}
   *   <li>{@link RoomSearchResults#rooms(List)}
   *   <li>{@link RoomSearchResults#setCount(Long)}
   *   <li>{@link RoomSearchResults#setFacetedMatchCount(List)}
   *   <li>{@link RoomSearchResults#setLimit(Integer)}
   *   <li>{@link RoomSearchResults#setQuery(RoomSearchCriteria)}
   *   <li>{@link RoomSearchResults#setRooms(List)}
   *   <li>{@link RoomSearchResults#setSkip(Integer)}
   *   <li>{@link RoomSearchResults#skip(Integer)}
   *   <li>{@link RoomSearchResults#toString()}
   *   <li>{@link RoomSearchResults#getCount()}
   *   <li>{@link RoomSearchResults#getFacetedMatchCount()}
   *   <li>{@link RoomSearchResults#getLimit()}
   *   <li>{@link RoomSearchResults#getQuery()}
   *   <li>{@link RoomSearchResults#getRooms()}
   *   <li>{@link RoomSearchResults#getSkip()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void RoomSearchResults.<init>()", "RoomSearchResults RoomSearchResults.count(Long)",
      "RoomSearchResults RoomSearchResults.facetedMatchCount(List)", "Long RoomSearchResults.getCount()",
      "List RoomSearchResults.getFacetedMatchCount()", "Integer RoomSearchResults.getLimit()",
      "RoomSearchCriteria RoomSearchResults.getQuery()", "List RoomSearchResults.getRooms()",
      "Integer RoomSearchResults.getSkip()", "RoomSearchResults RoomSearchResults.limit(Integer)",
      "RoomSearchResults RoomSearchResults.query(RoomSearchCriteria)",
      "RoomSearchResults RoomSearchResults.rooms(List)", "void RoomSearchResults.setCount(Long)",
      "void RoomSearchResults.setFacetedMatchCount(List)", "void RoomSearchResults.setLimit(Integer)",
      "void RoomSearchResults.setQuery(RoomSearchCriteria)", "void RoomSearchResults.setRooms(List)",
      "void RoomSearchResults.setSkip(Integer)", "RoomSearchResults RoomSearchResults.skip(Integer)",
      "String RoomSearchResults.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    RoomSearchResults actualRoomSearchResults = new RoomSearchResults();
    RoomSearchResults actualCountResult = actualRoomSearchResults.count(3L);
    RoomSearchResults actualFacetedMatchCountResult = actualRoomSearchResults.facetedMatchCount(new ArrayList<>());
    RoomSearchResults actualLimitResult = actualRoomSearchResults.limit(1);
    RoomSearchResults actualQueryResult = actualRoomSearchResults.query(new RoomSearchCriteria());
    RoomSearchResults actualRoomsResult = actualRoomSearchResults.rooms(new ArrayList<>());
    actualRoomSearchResults.setCount(3L);
    ArrayList<FacetedMatchCount> facetedMatchCount = new ArrayList<>();
    actualRoomSearchResults.setFacetedMatchCount(facetedMatchCount);
    actualRoomSearchResults.setLimit(1);
    RoomSearchCriteria query = new RoomSearchCriteria();
    actualRoomSearchResults.setQuery(query);
    ArrayList<V2RoomDetail> rooms = new ArrayList<>();
    actualRoomSearchResults.setRooms(rooms);
    actualRoomSearchResults.setSkip(1);
    RoomSearchResults actualSkipResult = actualRoomSearchResults.skip(1);
    String actualToStringResult = actualRoomSearchResults.toString();
    Long actualCount = actualRoomSearchResults.getCount();
    List<FacetedMatchCount> actualFacetedMatchCount = actualRoomSearchResults.getFacetedMatchCount();
    Integer actualLimit = actualRoomSearchResults.getLimit();
    RoomSearchCriteria actualQuery = actualRoomSearchResults.getQuery();
    List<V2RoomDetail> actualRooms = actualRoomSearchResults.getRooms();
    Integer actualSkip = actualRoomSearchResults.getSkip();

    // Assert
    assertEquals("class RoomSearchResults {\n" + "    count: 3\n" + "    skip: 1\n" + "    limit: 1\n"
        + "    query: class RoomSearchCriteria {\n" + "        query: null\n" + "        labels: null\n"
        + "        active: null\n" + "        _private: null\n" + "        owner: null\n" + "        creator: null\n"
        + "        member: null\n" + "        sortOrder: null\n" + "    }\n" + "    rooms: []\n"
        + "    facetedMatchCount: []\n" + "}", actualToStringResult);
    assertEquals(1, actualLimit.intValue());
    assertEquals(1, actualSkip.intValue());
    assertEquals(3L, actualCount.longValue());
    assertTrue(actualFacetedMatchCount.isEmpty());
    assertTrue(actualRooms.isEmpty());
    assertSame(facetedMatchCount, actualFacetedMatchCount);
    assertSame(rooms, actualRooms);
    assertSame(query, actualQuery);
    assertSame(actualRoomSearchResults, actualCountResult);
    assertSame(actualRoomSearchResults, actualFacetedMatchCountResult);
    assertSame(actualRoomSearchResults, actualLimitResult);
    assertSame(actualRoomSearchResults, actualQueryResult);
    assertSame(actualRoomSearchResults, actualRoomsResult);
    assertSame(actualRoomSearchResults, actualSkipResult);
  }
}
