package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.symphonyoss.symphony.pod.model.BulkActionResult.OverallResultEnum;

public class BulkActionResultDiffblueTest {
  /**
   * Test {@link BulkActionResult#addResultsItem(String)}.
   * <ul>
   *   <li>Given {@link BulkActionResult} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#addResultsItem(String)}
   */
  @Test
  @MethodsUnderTest({"BulkActionResult BulkActionResult.addResultsItem(String)"})
  public void testAddResultsItem_givenBulkActionResult() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();

    // Act and Assert
    assertSame(bulkActionResult, bulkActionResult.addResultsItem("Results Item"));
  }

  /**
   * Test {@link BulkActionResult#addResultsItem(String)}.
   * <ul>
   *   <li>Given {@link BulkActionResult} (default constructor) results {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#addResultsItem(String)}
   */
  @Test
  @MethodsUnderTest({"BulkActionResult BulkActionResult.addResultsItem(String)"})
  public void testAddResultsItem_givenBulkActionResultResultsArrayList() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.results(new ArrayList<>());

    // Act and Assert
    assertSame(bulkActionResult, bulkActionResult.addResultsItem("Results Item"));
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}, and {@link BulkActionResult#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BulkActionResult#equals(Object)}
   *   <li>{@link BulkActionResult#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    BulkActionResult bulkActionResult2 = new BulkActionResult();

    // Act and Assert
    assertEquals(bulkActionResult, bulkActionResult2);
    int expectedHashCodeResult = bulkActionResult.hashCode();
    assertEquals(expectedHashCodeResult, bulkActionResult2.hashCode());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}, and {@link BulkActionResult#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link BulkActionResult#equals(Object)}
   *   <li>{@link BulkActionResult#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();

    // Act and Assert
    assertEquals(bulkActionResult, bulkActionResult);
    int expectedHashCodeResult = bulkActionResult.hashCode();
    assertEquals(expectedHashCodeResult, bulkActionResult.hashCode());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.addResultsItem("Results Item");

    // Act and Assert
    assertNotEquals(bulkActionResult, new BulkActionResult());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BulkActionResult bulkActionResult = new BulkActionResult();
    bulkActionResult.overallResult(OverallResultEnum.SUCCESS);
    bulkActionResult.addResultsItem("Results Item");

    // Act and Assert
    assertNotEquals(bulkActionResult, new BulkActionResult());
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BulkActionResult(), null);
  }

  /**
   * Test {@link BulkActionResult#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link BulkActionResult#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean BulkActionResult.equals(Object)", "int BulkActionResult.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BulkActionResult(), "Different type to BulkActionResult");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link BulkActionResult}
   *   <li>{@link BulkActionResult#overallResult(OverallResultEnum)}
   *   <li>{@link BulkActionResult#results(List)}
   *   <li>{@link BulkActionResult#setOverallResult(OverallResultEnum)}
   *   <li>{@link BulkActionResult#setResults(List)}
   *   <li>{@link BulkActionResult#toString()}
   *   <li>{@link BulkActionResult#getOverallResult()}
   *   <li>{@link BulkActionResult#getResults()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void BulkActionResult.<init>()", "OverallResultEnum BulkActionResult.getOverallResult()",
      "List BulkActionResult.getResults()", "BulkActionResult BulkActionResult.overallResult(OverallResultEnum)",
      "BulkActionResult BulkActionResult.results(List)", "void BulkActionResult.setOverallResult(OverallResultEnum)",
      "void BulkActionResult.setResults(List)", "String BulkActionResult.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    BulkActionResult actualBulkActionResult = new BulkActionResult();
    BulkActionResult actualOverallResultResult = actualBulkActionResult.overallResult(OverallResultEnum.SUCCESS);
    BulkActionResult actualResultsResult = actualBulkActionResult.results(new ArrayList<>());
    actualBulkActionResult.setOverallResult(OverallResultEnum.SUCCESS);
    ArrayList<String> results = new ArrayList<>();
    actualBulkActionResult.setResults(results);
    String actualToStringResult = actualBulkActionResult.toString();
    OverallResultEnum actualOverallResult = actualBulkActionResult.getOverallResult();
    List<String> actualResults = actualBulkActionResult.getResults();

    // Assert
    assertEquals("class BulkActionResult {\n    overallResult: SUCCESS\n    results: []\n}", actualToStringResult);
    assertEquals(OverallResultEnum.SUCCESS, actualOverallResult);
    assertTrue(actualResults.isEmpty());
    assertSame(results, actualResults);
    assertSame(actualBulkActionResult, actualOverallResultResult);
    assertSame(actualBulkActionResult, actualResultsResult);
  }

  /**
   * Test OverallResultEnum {@link OverallResultEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code SUCCESS}.</li>
   *   <li>Then return {@code SUCCESS}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OverallResultEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"OverallResultEnum OverallResultEnum.fromValue(String)"})
  public void testOverallResultEnumFromValue_whenSuccess_thenReturnSuccess() {
    // Arrange, Act and Assert
    assertEquals(OverallResultEnum.SUCCESS, OverallResultEnum.fromValue("SUCCESS"));
  }

  /**
   * Test OverallResultEnum {@link OverallResultEnum#fromValue(String)}.
   * <ul>
   *   <li>When {@code Text}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OverallResultEnum#fromValue(String)}
   */
  @Test
  @MethodsUnderTest({"OverallResultEnum OverallResultEnum.fromValue(String)"})
  public void testOverallResultEnumFromValue_whenText_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OverallResultEnum.fromValue("Text"));
  }

  /**
   * Test OverallResultEnum getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link OverallResultEnum#toString()}
   *   <li>{@link OverallResultEnum#getValue()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"String OverallResultEnum.getValue()", "String OverallResultEnum.toString()"})
  public void testOverallResultEnumGettersAndSetters() {
    // Arrange
    OverallResultEnum valueOfResult = OverallResultEnum.valueOf("SUCCESS");

    // Act
    String actualToStringResult = valueOfResult.toString();

    // Assert
    assertEquals("SUCCESS", valueOfResult.getValue());
    assertEquals("SUCCESS", actualToStringResult);
  }
}
