package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class DisclaimerApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link DisclaimerApi#DisclaimerApi(ApiClient)}
   *   <li>{@link DisclaimerApi#setApiClient(ApiClient)}
   *   <li>{@link DisclaimerApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void DisclaimerApi.<init>(ApiClient)", "ApiClient DisclaimerApi.getApiClient()",
      "void DisclaimerApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    DisclaimerApi actualDisclaimerApi = new DisclaimerApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualDisclaimerApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualDisclaimerApi.getApiClient());
  }
}
