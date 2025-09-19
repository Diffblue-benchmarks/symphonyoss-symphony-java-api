package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class InfoBarriersApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InfoBarriersApi#InfoBarriersApi(ApiClient)}
   *   <li>{@link InfoBarriersApi#setApiClient(ApiClient)}
   *   <li>{@link InfoBarriersApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void InfoBarriersApi.<init>(ApiClient)",
    "ApiClient InfoBarriersApi.getApiClient()",
    "void InfoBarriersApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    InfoBarriersApi actualInfoBarriersApi =
        new InfoBarriersApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualInfoBarriersApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualInfoBarriersApi.getApiClient());
  }
}
