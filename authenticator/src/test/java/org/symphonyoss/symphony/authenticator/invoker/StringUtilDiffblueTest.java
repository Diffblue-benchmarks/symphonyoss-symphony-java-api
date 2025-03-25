package org.symphonyoss.symphony.authenticator.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class StringUtilDiffblueTest {
  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code 42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWith42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.containsIgnoreCase(new String[]{"42"}, "42"));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithArray_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StringUtil.containsIgnoreCase(new String[]{"Array"}, "42"));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithArray_thenReturnFalse2() {
    // Arrange, Act and Assert
    assertFalse(StringUtil.containsIgnoreCase(new String[]{"Array"}, null));
  }

  /**
   * Test {@link StringUtil#containsIgnoreCase(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#containsIgnoreCase(String[], String)}
   */
  @Test
  @MethodsUnderTest({"boolean StringUtil.containsIgnoreCase(String[], String)"})
  public void testContainsIgnoreCase_whenArrayOfStringWithNull_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StringUtil.containsIgnoreCase(new String[]{null}, null));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code Array} and empty string.</li>
   *   <li>Then return {@code ArraySeparator}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenArrayOfStringWithArrayAndEmptyString_thenReturnArraySeparator() {
    // Arrange, Act and Assert
    assertEquals("ArraySeparator", StringUtil.join(new String[]{"Array", ""}, "Separator"));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   * <ul>
   *   <li>When array of {@link String} with {@code Array}.</li>
   *   <li>Then return {@code Array}.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenArrayOfStringWithArray_thenReturnArray() {
    // Arrange, Act and Assert
    assertEquals("Array", StringUtil.join(new String[]{"Array"}, "Separator"));
  }

  /**
   * Test {@link StringUtil#join(String[], String)}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link StringUtil#join(String[], String)}
   */
  @Test
  @MethodsUnderTest({"String StringUtil.join(String[], String)"})
  public void testJoin_whenEmptyArrayOfString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", StringUtil.join(new String[]{}, "Separator"));
  }
}
