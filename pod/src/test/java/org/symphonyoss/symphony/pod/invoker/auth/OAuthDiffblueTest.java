package org.symphonyoss.symphony.pod.invoker.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.Pair;

public class OAuthDiffblueTest {
  /**
   * Test {@link OAuth#applyToParams(List, Map)}.
   * <ul>
   *   <li>Given {@link OAuth} (default constructor) AccessToken is {@code foo}.</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link HashMap#HashMap()} size is one.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuth#applyToParams(List, Map)}
   */
  @Test
  @MethodsUnderTest({"void OAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenOAuthAccessTokenIsFoo_whenArrayList_thenHashMapSizeIsOne() {
    // Arrange
    OAuth oAuth = new OAuth();
    oAuth.setAccessToken("foo");
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuth.applyToParams(queryParams, headerParams);

    // Assert
    assertEquals(1, headerParams.size());
    assertEquals("Bearer foo", headerParams.get("Authorization"));
  }

  /**
   * Test {@link OAuth#applyToParams(List, Map)}.
   * <ul>
   *   <li>Given {@link OAuth} (default constructor).</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then {@link HashMap#HashMap()} Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuth#applyToParams(List, Map)}
   */
  @Test
  @MethodsUnderTest({"void OAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenOAuth_whenArrayList_thenHashMapEmpty() {
    // Arrange
    OAuth oAuth = new OAuth();
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuth.applyToParams(queryParams, headerParams);

    // Assert that nothing has changed
    assertTrue(headerParams.isEmpty());
  }

  /**
   * Test {@link OAuth#applyToParams(List, Map)}.
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuth#applyToParams(List, Map)}
   */
  @Test
  @MethodsUnderTest({"void OAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenPairWithNameAndValueIs42() {
    // Arrange
    OAuth oAuth = new OAuth();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("Name", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuth.applyToParams(queryParams, headerParams);

    // Assert that nothing has changed
    assertTrue(headerParams.isEmpty());
  }

  /**
   * Test {@link OAuth#applyToParams(List, Map)}.
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link OAuth#applyToParams(List, Map)}
   */
  @Test
  @MethodsUnderTest({"void OAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenPairWithNameAndValueIs422() {
    // Arrange
    OAuth oAuth = new OAuth();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("Name", "42"));
    queryParams.add(new Pair("Name", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act
    oAuth.applyToParams(queryParams, headerParams);

    // Assert that nothing has changed
    assertTrue(headerParams.isEmpty());
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link OAuth}
   *   <li>{@link OAuth#setAccessToken(String)}
   *   <li>{@link OAuth#getAccessToken()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void OAuth.<init>()", "String OAuth.getAccessToken()", "void OAuth.setAccessToken(String)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    OAuth actualOAuth = new OAuth();
    actualOAuth.setAccessToken("ABC123");

    // Assert
    assertEquals("ABC123", actualOAuth.getAccessToken());
  }
}
