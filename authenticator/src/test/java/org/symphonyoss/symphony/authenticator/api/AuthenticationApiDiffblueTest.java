package org.symphonyoss.symphony.authenticator.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.authenticator.invoker.ApiClient;
import org.symphonyoss.symphony.authenticator.invoker.Configuration;

public class AuthenticationApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AuthenticationApi#AuthenticationApi(ApiClient)}
   *   <li>{@link AuthenticationApi#setApiClient(ApiClient)}
   *   <li>{@link AuthenticationApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void AuthenticationApi.<init>(ApiClient)",
    "ApiClient AuthenticationApi.getApiClient()",
    "void AuthenticationApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    AuthenticationApi actualAuthenticationApi =
        new AuthenticationApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualAuthenticationApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualAuthenticationApi.getApiClient());
  }
}
