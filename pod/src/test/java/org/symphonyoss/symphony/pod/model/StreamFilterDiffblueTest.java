package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class StreamFilterDiffblueTest {
  /**
   * Test {@link StreamFilter#addStreamTypesItem(StreamType)}.
   *
   * <ul>
   *   <li>Given {@link StreamFilter} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#addStreamTypesItem(StreamType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StreamFilter StreamFilter.addStreamTypesItem(StreamType)"})
  public void testAddStreamTypesItem_givenStreamFilter() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();

    // Act
    StreamFilter actualAddStreamTypesItemResult = streamFilter.addStreamTypesItem(new StreamType());

    // Assert
    assertSame(streamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link StreamFilter#addStreamTypesItem(StreamType)}.
   *
   * <ul>
   *   <li>Given {@link StreamFilter} (default constructor) streamTypes {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#addStreamTypesItem(StreamType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"StreamFilter StreamFilter.addStreamTypesItem(StreamType)"})
  public void testAddStreamTypesItem_givenStreamFilterStreamTypesArrayList() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();
    streamFilter.streamTypes(new ArrayList<>());

    // Act
    StreamFilter actualAddStreamTypesItemResult = streamFilter.addStreamTypesItem(new StreamType());

    // Assert
    assertSame(streamFilter, actualAddStreamTypesItemResult);
  }

  /**
   * Test {@link StreamFilter#equals(Object)}, and {@link StreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StreamFilter#equals(Object)}
   *   <li>{@link StreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();
    StreamFilter streamFilter2 = new StreamFilter();

    // Act and Assert
    assertEquals(streamFilter, streamFilter2);
    assertEquals(streamFilter.hashCode(), streamFilter2.hashCode());
  }

  /**
   * Test {@link StreamFilter#equals(Object)}, and {@link StreamFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StreamFilter#equals(Object)}
   *   <li>{@link StreamFilter#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();

    // Act and Assert
    assertEquals(streamFilter, streamFilter);
    int expectedHashCodeResult = streamFilter.hashCode();
    assertEquals(expectedHashCodeResult, streamFilter.hashCode());
  }

  /**
   * Test {@link StreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();
    streamFilter.addStreamTypesItem(new StreamType());

    // Act and Assert
    assertNotEquals(streamFilter, new StreamFilter());
  }

  /**
   * Test {@link StreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StreamFilter streamFilter = new StreamFilter();
    streamFilter.includeInactiveStreams(true);

    // Act and Assert
    assertNotEquals(streamFilter, new StreamFilter());
  }

  /**
   * Test {@link StreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamFilter(), null);
  }

  /**
   * Test {@link StreamFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StreamFilter#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StreamFilter.equals(Object)", "int StreamFilter.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StreamFilter(), "Different type to StreamFilter");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link StreamFilter}
   *   <li>{@link StreamFilter#includeInactiveStreams(Boolean)}
   *   <li>{@link StreamFilter#setIncludeInactiveStreams(Boolean)}
   *   <li>{@link StreamFilter#setStreamTypes(List)}
   *   <li>{@link StreamFilter#streamTypes(List)}
   *   <li>{@link StreamFilter#toString()}
   *   <li>{@link StreamFilter#getIncludeInactiveStreams()}
   *   <li>{@link StreamFilter#getStreamTypes()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void StreamFilter.<init>()",
    "Boolean StreamFilter.getIncludeInactiveStreams()",
    "List StreamFilter.getStreamTypes()",
    "StreamFilter StreamFilter.includeInactiveStreams(Boolean)",
    "void StreamFilter.setIncludeInactiveStreams(Boolean)",
    "void StreamFilter.setStreamTypes(List)",
    "StreamFilter StreamFilter.streamTypes(List)",
    "String StreamFilter.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    StreamFilter actualStreamFilter = new StreamFilter();
    StreamFilter actualIncludeInactiveStreamsResult =
        actualStreamFilter.includeInactiveStreams(true);
    actualStreamFilter.setIncludeInactiveStreams(true);
    actualStreamFilter.setStreamTypes(new ArrayList<>());
    ArrayList<StreamType> streamTypes = new ArrayList<>();
    StreamFilter actualStreamTypesResult = actualStreamFilter.streamTypes(streamTypes);
    String actualToStringResult = actualStreamFilter.toString();
    Boolean actualIncludeInactiveStreams = actualStreamFilter.getIncludeInactiveStreams();
    List<StreamType> actualStreamTypes = actualStreamFilter.getStreamTypes();

    // Assert
    assertEquals(
        "class StreamFilter {\n    streamTypes: []\n    includeInactiveStreams: true\n}",
        actualToStringResult);
    assertTrue(actualStreamTypes.isEmpty());
    assertTrue(actualIncludeInactiveStreams);
    assertSame(streamTypes, actualStreamTypes);
    assertSame(actualStreamFilter, actualIncludeInactiveStreamsResult);
    assertSame(actualStreamFilter, actualStreamTypesResult);
  }
}
