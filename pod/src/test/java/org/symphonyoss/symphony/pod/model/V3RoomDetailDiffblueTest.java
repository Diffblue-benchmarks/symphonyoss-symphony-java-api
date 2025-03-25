package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V3RoomDetailDiffblueTest {
  /**
   * Test {@link V3RoomDetail#equals(Object)}, and {@link V3RoomDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3RoomDetail#equals(Object)}
   *   <li>{@link V3RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    V3RoomDetail v3RoomDetail2 = new V3RoomDetail();

    // Act and Assert
    assertEquals(v3RoomDetail, v3RoomDetail2);
    int expectedHashCodeResult = v3RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomDetail2.hashCode());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}, and {@link V3RoomDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V3RoomDetail#equals(Object)}
   *   <li>{@link V3RoomDetail#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();

    // Act and Assert
    assertEquals(v3RoomDetail, v3RoomDetail);
    int expectedHashCodeResult = v3RoomDetail.hashCode();
    assertEquals(expectedHashCodeResult, v3RoomDetail.hashCode());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomDetail(), 1);
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.roomAttributes(new V3RoomAttributes());

    // Act and Assert
    assertNotEquals(v3RoomDetail, new V3RoomDetail());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V3RoomDetail v3RoomDetail = new V3RoomDetail();
    v3RoomDetail.roomSystemInfo(new RoomSystemInfo());

    // Act and Assert
    assertNotEquals(v3RoomDetail, new V3RoomDetail());
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomDetail(), null);
  }

  /**
   * Test {@link V3RoomDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V3RoomDetail#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V3RoomDetail.equals(Object)", "int V3RoomDetail.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V3RoomDetail(), "Different type to V3RoomDetail");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V3RoomDetail}
   *   <li>{@link V3RoomDetail#roomAttributes(V3RoomAttributes)}
   *   <li>{@link V3RoomDetail#roomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V3RoomDetail#setRoomAttributes(V3RoomAttributes)}
   *   <li>{@link V3RoomDetail#setRoomSystemInfo(RoomSystemInfo)}
   *   <li>{@link V3RoomDetail#toString()}
   *   <li>{@link V3RoomDetail#getRoomAttributes()}
   *   <li>{@link V3RoomDetail#getRoomSystemInfo()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V3RoomDetail.<init>()", "V3RoomAttributes V3RoomDetail.getRoomAttributes()",
      "RoomSystemInfo V3RoomDetail.getRoomSystemInfo()", "V3RoomDetail V3RoomDetail.roomAttributes(V3RoomAttributes)",
      "V3RoomDetail V3RoomDetail.roomSystemInfo(RoomSystemInfo)",
      "void V3RoomDetail.setRoomAttributes(V3RoomAttributes)", "void V3RoomDetail.setRoomSystemInfo(RoomSystemInfo)",
      "String V3RoomDetail.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V3RoomDetail actualV3RoomDetail = new V3RoomDetail();
    V3RoomDetail actualRoomAttributesResult = actualV3RoomDetail.roomAttributes(new V3RoomAttributes());
    V3RoomDetail actualRoomSystemInfoResult = actualV3RoomDetail.roomSystemInfo(new RoomSystemInfo());
    V3RoomAttributes roomAttributes = new V3RoomAttributes();
    actualV3RoomDetail.setRoomAttributes(roomAttributes);
    RoomSystemInfo roomSystemInfo = new RoomSystemInfo();
    actualV3RoomDetail.setRoomSystemInfo(roomSystemInfo);
    String actualToStringResult = actualV3RoomDetail.toString();
    V3RoomAttributes actualRoomAttributes = actualV3RoomDetail.getRoomAttributes();

    // Assert
    assertEquals("class V3RoomDetail {\n" + "    roomAttributes: class V3RoomAttributes {\n" + "        name: null\n"
        + "        keywords: null\n" + "        description: null\n" + "        membersCanInvite: null\n"
        + "        discoverable: null\n" + "        _public: null\n" + "        readOnly: null\n"
        + "        copyProtected: null\n" + "        crossPod: null\n" + "        viewHistory: null\n"
        + "        multiLateralRoom: null\n" + "    }\n" + "    roomSystemInfo: class RoomSystemInfo {\n"
        + "        id: null\n" + "        creationDate: null\n" + "        createdByUserId: null\n"
        + "        active: null\n" + "    }\n" + "}", actualToStringResult);
    assertSame(roomSystemInfo, actualV3RoomDetail.getRoomSystemInfo());
    assertSame(roomAttributes, actualRoomAttributes);
    assertSame(actualV3RoomDetail, actualRoomAttributesResult);
    assertSame(actualV3RoomDetail, actualRoomSystemInfoResult);
  }
}
