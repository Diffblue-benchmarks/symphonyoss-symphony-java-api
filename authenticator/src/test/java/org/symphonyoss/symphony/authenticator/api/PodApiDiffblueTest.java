package org.symphonyoss.symphony.authenticator.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.authenticator.invoker.ApiClient;
import org.symphonyoss.symphony.authenticator.invoker.Configuration;

public class PodApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link PodApi#PodApi(ApiClient)}
   *   <li>{@link PodApi#setApiClient(ApiClient)}
   *   <li>{@link PodApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void PodApi.<init>(ApiClient)", "ApiClient PodApi.getApiClient()",
      "void PodApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    PodApi actualPodApi = new PodApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualPodApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualPodApi.getApiClient());
  }
}
