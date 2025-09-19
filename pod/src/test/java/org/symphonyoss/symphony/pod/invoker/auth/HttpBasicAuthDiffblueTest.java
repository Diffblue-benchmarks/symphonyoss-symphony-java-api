package org.symphonyoss.symphony.pod.invoker.auth;

import static org.junit.Assert.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.Pair;

public class HttpBasicAuthDiffblueTest {
  /**
   * Test {@link HttpBasicAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} {@code Authorization} is {@code Basic OmZvbw==}.
   * </ul>
   *
   * <p>Method under test: {@link HttpBasicAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void HttpBasicAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenHashMapAuthorizationIsBasicOmZvbw() {
    // Arrange
    HttpBasicAuth httpBasicAuth = new HttpBasicAuth();
    httpBasicAuth.setUsername(null);
    httpBasicAuth.setPassword("foo");
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("Authorization", "https://example.org/example");

    // Act
    httpBasicAuth.applyToParams(queryParams, headerParams);

    // Assert
    assertEquals(1, headerParams.size());
    assertEquals("Basic OmZvbw==", headerParams.get("Authorization"));
  }

  /**
   * Test {@link HttpBasicAuth#applyToParams(List, Map)}.
   *
   * <ul>
   *   <li>Then {@link HashMap#HashMap()} {@code Authorization} is {@code Basic Zm9vOg==}.
   * </ul>
   *
   * <p>Method under test: {@link HttpBasicAuth#applyToParams(List, Map)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void HttpBasicAuth.applyToParams(List, Map)"})
  public void testApplyToParams_thenHashMapAuthorizationIsBasicZm9vOg() {
    // Arrange
    HttpBasicAuth httpBasicAuth = new HttpBasicAuth();
    httpBasicAuth.setUsername("foo");
    httpBasicAuth.setPassword(null);
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("Authorization", "https://example.org/example");

    // Act
    httpBasicAuth.applyToParams(queryParams, headerParams);

    // Assert
    assertEquals(1, headerParams.size());
    assertEquals("Basic Zm9vOg==", headerParams.get("Authorization"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link HttpBasicAuth}
   *   <li>{@link HttpBasicAuth#setPassword(String)}
   *   <li>{@link HttpBasicAuth#setUsername(String)}
   *   <li>{@link HttpBasicAuth#getPassword()}
   *   <li>{@link HttpBasicAuth#getUsername()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void HttpBasicAuth.<init>()",
    "String HttpBasicAuth.getPassword()",
    "String HttpBasicAuth.getUsername()",
    "void HttpBasicAuth.setPassword(String)",
    "void HttpBasicAuth.setUsername(String)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    HttpBasicAuth actualHttpBasicAuth = new HttpBasicAuth();
    actualHttpBasicAuth.setPassword("https://example.org/example");
    actualHttpBasicAuth.setUsername("janedoe");
    String actualPassword = actualHttpBasicAuth.getPassword();

    // Assert
    assertEquals("https://example.org/example", actualPassword);
    assertEquals("janedoe", actualHttpBasicAuth.getUsername());
  }
}
