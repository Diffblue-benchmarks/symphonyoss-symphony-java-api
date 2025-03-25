package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class SecurityApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SecurityApi#SecurityApi(ApiClient)}
   *   <li>{@link SecurityApi#setApiClient(ApiClient)}
   *   <li>{@link SecurityApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void SecurityApi.<init>(ApiClient)", "ApiClient SecurityApi.getApiClient()",
      "void SecurityApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    SecurityApi actualSecurityApi = new SecurityApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualSecurityApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualSecurityApi.getApiClient());
  }
}
