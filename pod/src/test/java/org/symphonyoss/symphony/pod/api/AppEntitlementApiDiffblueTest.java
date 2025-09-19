package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class AppEntitlementApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AppEntitlementApi#AppEntitlementApi(ApiClient)}
   *   <li>{@link AppEntitlementApi#setApiClient(ApiClient)}
   *   <li>{@link AppEntitlementApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AppEntitlementApi.<init>(ApiClient)",
    "ApiClient AppEntitlementApi.getApiClient()",
    "void AppEntitlementApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    AppEntitlementApi actualAppEntitlementApi =
        new AppEntitlementApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualAppEntitlementApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualAppEntitlementApi.getApiClient());
  }
}
