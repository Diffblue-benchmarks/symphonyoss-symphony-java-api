package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class ConnectionApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConnectionApi#ConnectionApi(ApiClient)}
   *   <li>{@link ConnectionApi#setApiClient(ApiClient)}
   *   <li>{@link ConnectionApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ConnectionApi.<init>(ApiClient)",
    "ApiClient ConnectionApi.getApiClient()",
    "void ConnectionApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ConnectionApi actualConnectionApi = new ConnectionApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualConnectionApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualConnectionApi.getApiClient());
  }
}
