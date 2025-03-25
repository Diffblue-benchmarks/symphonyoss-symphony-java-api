package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class ShareApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ShareApi#ShareApi(ApiClient)}
   *   <li>{@link ShareApi#setApiClient(ApiClient)}
   *   <li>{@link ShareApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void ShareApi.<init>(ApiClient)", "ApiClient ShareApi.getApiClient()",
      "void ShareApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    ShareApi actualShareApi = new ShareApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualShareApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualShareApi.getApiClient());
  }
}
