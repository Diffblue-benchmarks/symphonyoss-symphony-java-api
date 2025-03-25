package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class SessionApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SessionApi#SessionApi(ApiClient)}
   *   <li>{@link SessionApi#setApiClient(ApiClient)}
   *   <li>{@link SessionApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void SessionApi.<init>(ApiClient)", "ApiClient SessionApi.getApiClient()",
      "void SessionApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    SessionApi actualSessionApi = new SessionApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualSessionApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualSessionApi.getApiClient());
  }
}
