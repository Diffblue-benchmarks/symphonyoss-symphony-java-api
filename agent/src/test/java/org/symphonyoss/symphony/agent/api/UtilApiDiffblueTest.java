package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class UtilApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UtilApi#UtilApi(ApiClient)}
   *   <li>{@link UtilApi#setApiClient(ApiClient)}
   *   <li>{@link UtilApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UtilApi.<init>(ApiClient)", "ApiClient UtilApi.getApiClient()",
      "void UtilApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UtilApi actualUtilApi = new UtilApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualUtilApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualUtilApi.getApiClient());
  }
}
