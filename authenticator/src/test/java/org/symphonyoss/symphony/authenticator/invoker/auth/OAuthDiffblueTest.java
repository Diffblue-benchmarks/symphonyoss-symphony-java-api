package org.symphonyoss.symphony.authenticator.invoker.auth;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.symphonyoss.symphony.authenticator.invoker.Pair;

public class OAuthDiffblueTest {
  /**
   * Test {@link OAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Given {@link OAuth} (default constructor) AccessToken is {@code foo}.
   *   <li>Then {@link HashMap#HashMap()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link OAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void OAuth.applyToParams(List, Map)"})
  public void testApplyToParams_givenOAuthAccessTokenIsFoo_thenHashMapSizeIsOne() {
    // Arrange
    OAuth oAuth = new OAuth();
    oAuth.setAccessToken("foo");
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("Authorization", "Header Params");

    // Act
    oAuth.applyToParams(queryParams, headerParams);

    // Assert
    assertEquals(1, headerParams.size());
    assertEquals("Bearer foo", headerParams.get("Authorization"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link OAuth}
   *   <li>{@link OAuth#setAccessToken(String)}
   *   <li>{@link OAuth#getAccessToken()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void OAuth.<init>()",
    "String OAuth.getAccessToken()",
    "void OAuth.setAccessToken(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    OAuth actualOAuth = new OAuth();
    actualOAuth.setAccessToken("ABC123");

    // Assert
    assertEquals("ABC123", actualOAuth.getAccessToken());
  }
}
