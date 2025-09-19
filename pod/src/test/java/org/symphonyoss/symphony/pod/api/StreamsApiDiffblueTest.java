package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class StreamsApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StreamsApi#StreamsApi(ApiClient)}
   *   <li>{@link StreamsApi#setApiClient(ApiClient)}
   *   <li>{@link StreamsApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void StreamsApi.<init>(ApiClient)",
    "ApiClient StreamsApi.getApiClient()",
    "void StreamsApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    StreamsApi actualStreamsApi = new StreamsApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualStreamsApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualStreamsApi.getApiClient());
  }
}
