package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class SystemApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SystemApi#SystemApi(ApiClient)}
   *   <li>{@link SystemApi#setApiClient(ApiClient)}
   *   <li>{@link SystemApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SystemApi.<init>(ApiClient)",
    "ApiClient SystemApi.getApiClient()",
    "void SystemApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    SystemApi actualSystemApi = new SystemApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualSystemApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualSystemApi.getApiClient());
  }
}
