package org.symphonyoss.symphony.agent.invoker;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class PairDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Pair#getName()}
   *   <li>{@link Pair#getValue()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String Pair.getName()", "String Pair.getValue()"})
  public void testGettersAndSetters() {
    // Arrange
    Pair pair = new Pair("Name", "42");

    // Act
    String actualName = pair.getName();

    // Assert
    assertEquals("42", pair.getValue());
    assertEquals("Name", actualName);
  }

  /**
   * Test {@link Pair#Pair(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Name is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  public void testNewPair_whenEmptyString_thenReturnNameIsEmptyString() {
    // Arrange and Act
    Pair actualPair = new Pair("", "42");

    // Assert
    assertEquals("", actualPair.getName());
    assertEquals("42", actualPair.getValue());
  }

  /**
   * Test {@link Pair#Pair(String, String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  public void testNewPair_whenName_thenReturnName() {
    // Arrange and Act
    Pair actualPair = new Pair("Name", "42");

    // Assert
    assertEquals("42", actualPair.getValue());
    assertEquals("Name", actualPair.getName());
  }

  /**
   * Test {@link Pair#Pair(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link Pair#Pair(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void Pair.<init>(String, String)"})
  public void testNewPair_whenNull_thenReturnValueIsEmptyString() {
    // Arrange and Act
    Pair actualPair = new Pair(null, null);

    // Assert
    assertEquals("", actualPair.getName());
    assertEquals("", actualPair.getValue());
  }
}
