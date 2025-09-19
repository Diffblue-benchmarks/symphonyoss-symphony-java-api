package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class PresenceApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PresenceApi#PresenceApi(ApiClient)}
   *   <li>{@link PresenceApi#setApiClient(ApiClient)}
   *   <li>{@link PresenceApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PresenceApi.<init>(ApiClient)",
    "ApiClient PresenceApi.getApiClient()",
    "void PresenceApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    PresenceApi actualPresenceApi = new PresenceApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualPresenceApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualPresenceApi.getApiClient());
  }
}
