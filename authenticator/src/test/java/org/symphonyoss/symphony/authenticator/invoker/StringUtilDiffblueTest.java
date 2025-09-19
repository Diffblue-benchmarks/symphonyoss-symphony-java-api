package org.symphonyoss.symphony.authenticator.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StringUtilDiffblueTest {
  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code 42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWith42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.containsIgnoreCase(new String[] {"42"}, "42"));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Array} and {@code null}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithArrayAndNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.containsIgnoreCase(new String[] {"Array", null}, null));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithArray_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringUtil.containsIgnoreCase(new String[] {"Array"}, "42"));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithArray_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(StringUtil.containsIgnoreCase(new String[] {"Array"}, null));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Array} and empty string.
   *   <li>Then return {@code ArraySeparator}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenArrayOfStringWithArrayAndEmptyString_thenReturnArraySeparator() {
    // Arrange, Act and Assert
    assertEquals("ArraySeparator", StringUtil.join(new String[] {"Array", ""}, "Separator"));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.
   *   <li>Then return {@code Array}.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenArrayOfStringWithArray_thenReturnArray() {
    // Arrange, Act and Assert
    assertEquals("Array", StringUtil.join(new String[] {"Array"}, "Separator"));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenEmptyArrayOfString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", StringUtil.join(new String[] {}, "Separator"));
  }
}
