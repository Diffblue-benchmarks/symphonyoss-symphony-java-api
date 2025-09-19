package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class UserApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserApi#UserApi(ApiClient)}
   *   <li>{@link UserApi#setApiClient(ApiClient)}
   *   <li>{@link UserApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserApi.<init>(ApiClient)",
    "ApiClient UserApi.getApiClient()",
    "void UserApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserApi actualUserApi = new UserApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualUserApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualUserApi.getApiClient());
  }
}
