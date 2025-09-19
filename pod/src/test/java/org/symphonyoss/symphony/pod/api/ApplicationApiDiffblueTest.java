package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class ApplicationApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApplicationApi#ApplicationApi(ApiClient)}
   *   <li>{@link ApplicationApi#setApiClient(ApiClient)}
   *   <li>{@link ApplicationApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApplicationApi.<init>(ApiClient)",
    "ApiClient ApplicationApi.getApiClient()",
    "void ApplicationApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ApplicationApi actualApplicationApi = new ApplicationApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualApplicationApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualApplicationApi.getApiClient());
  }
}
