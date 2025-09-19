package org.symphonyoss.symphony.authenticator.invoker.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.symphonyoss.symphony.authenticator.invoker.Pair;

public class ApiKeyAuthDiffblueTest {
  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", "");
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(1, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("", getResult.getName());
    assertEquals("Api Key", getResult.getValue());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams2() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", null);
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(1, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("", getResult.getName());
    assertEquals("Api Key", getResult.getValue());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Given {@link ApiKeyAuth#ApiKeyAuth(String, String)} with {@code Location} and {@code
   *       Param Name} ApiKey is {@code Api Key}.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenApiKeyAuthWithLocationAndParamNameApiKeyIsApiKey() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("Location", "Param Name");
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, headerParams);

    // Assert that nothing has changed
    assertTrue(queryParams.isEmpty());
    assertTrue(headerParams.isEmpty());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Given {@link ApiKeyAuth#ApiKeyAuth(String, String)} with {@code Location} and {@code
   *       Param Name}.
   *   <li>Then {@link HashMap#HashMap()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenApiKeyAuthWithLocationAndParamName_thenHashMapEmpty() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("Location", "Param Name");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, headerParams);

    // Assert that nothing has changed
    assertTrue(queryParams.isEmpty());
    assertTrue(headerParams.isEmpty());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code query} and value is {@code
   *       42}.
   *   <li>Then {@link ArrayList#ArrayList()} size is two.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenPairWithNameIsQueryAndValueIs42_thenArrayListSizeIsTwo() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", "Param Name");
    apiKeyAuth.setApiKey("Api Key");

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("query", "42"));

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(2, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("42", getResult.getValue());
    Pair getResult2 = queryParams.get(1);
    assertEquals("Api Key", getResult2.getValue());
    assertEquals("Param Name", getResult2.getName());
    assertEquals("query", getResult.getName());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first Value is {@code Api Key}.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenArrayListFirstValueIsApiKey() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", "Param Name");
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(1, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("Api Key", getResult.getValue());
    assertEquals("Param Name", getResult.getName());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenArrayListFirstValueIsEmptyString() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", "Param Name");
    apiKeyAuth.setApiKey("");
    ArrayList<Pair> queryParams = new ArrayList<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(1, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Param Name", getResult.getName());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} first Value is {@code query Api Key}.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenArrayListFirstValueIsQueryApiKey() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("query", "Param Name");
    apiKeyAuth.setApiKeyPrefix("query");
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, new HashMap<>());

    // Assert
    assertEquals(1, queryParams.size());
    Pair getResult = queryParams.get(0);
    assertEquals("Param Name", getResult.getName());
    assertEquals("query Api Key", getResult.getValue());
  }

  /**
   * Test {@link ApiKeyAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link ApiKeyAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiKeyAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenHashMapSizeIsOne() {
    // Arrange
    ApiKeyAuth apiKeyAuth = new ApiKeyAuth("header", "Param Name");
    apiKeyAuth.setApiKey("Api Key");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    apiKeyAuth.applyToParams(queryParams, headerParams);

    // Assert
    assertEquals(1, headerParams.size());
    assertEquals("Api Key", headerParams.get("Param Name"));
    assertTrue(queryParams.isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiKeyAuth#ApiKeyAuth(String, String)}
   *   <li>{@link ApiKeyAuth#setApiKey(String)}
   *   <li>{@link ApiKeyAuth#setApiKeyPrefix(String)}
   *   <li>{@link ApiKeyAuth#getApiKey()}
   *   <li>{@link ApiKeyAuth#getApiKeyPrefix()}
   *   <li>{@link ApiKeyAuth#getLocation()}
   *   <li>{@link ApiKeyAuth#getParamName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiKeyAuth.<init>(String, String)",
    "String ApiKeyAuth.getApiKey()",
    "String ApiKeyAuth.getApiKeyPrefix()",
    "String ApiKeyAuth.getLocation()",
    "String ApiKeyAuth.getParamName()",
    "void ApiKeyAuth.setApiKey(String)",
    "void ApiKeyAuth.setApiKeyPrefix(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ApiKeyAuth actualApiKeyAuth = new ApiKeyAuth("Location", "Param Name");
    actualApiKeyAuth.setApiKey("Api Key");
    actualApiKeyAuth.setApiKeyPrefix("Api Key Prefix");
    String actualApiKey = actualApiKeyAuth.getApiKey();
    String actualApiKeyPrefix = actualApiKeyAuth.getApiKeyPrefix();
    String actualLocation = actualApiKeyAuth.getLocation();

    // Assert
    assertEquals("Api Key Prefix", actualApiKeyPrefix);
    assertEquals("Api Key", actualApiKey);
    assertEquals("Location", actualLocation);
    assertEquals("Param Name", actualApiKeyAuth.getParamName());
  }
}
