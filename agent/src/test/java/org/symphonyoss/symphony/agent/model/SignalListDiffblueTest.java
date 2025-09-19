package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class SignalListDiffblueTest {
  /**
   * Test {@link SignalList#equals(Object)}, and {@link SignalList#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SignalList#equals(Object)}
   *   <li>{@link SignalList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalList.equals(Object)", "int SignalList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SignalList signalList = new SignalList();
    SignalList signalList2 = new SignalList();

    // Act and Assert
    assertEquals(signalList, signalList2);
    assertEquals(signalList.hashCode(), signalList2.hashCode());
  }

  /**
   * Test {@link SignalList#equals(Object)}, and {@link SignalList#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SignalList#equals(Object)}
   *   <li>{@link SignalList#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalList.equals(Object)", "int SignalList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SignalList signalList = new SignalList();

    // Act and Assert
    assertEquals(signalList, signalList);
    int expectedHashCodeResult = signalList.hashCode();
    assertEquals(expectedHashCodeResult, signalList.hashCode());
  }

  /**
   * Test {@link SignalList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalList.equals(Object)", "int SignalList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SignalList signalList = new SignalList();
    signalList.add(new Signal());

    // Act and Assert
    assertNotEquals(signalList, new SignalList());
  }

  /**
   * Test {@link SignalList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalList.equals(Object)", "int SignalList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SignalList(), null);
  }

  /**
   * Test {@link SignalList#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SignalList#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SignalList.equals(Object)", "int SignalList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SignalList(), "Different type to SignalList");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SignalList}
   *   <li>{@link SignalList#toString()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void SignalList.<init>()", "java.lang.String SignalList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class SignalList {\n    []\n}", new SignalList().toString());
  }
}
