package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class UsersApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link UsersApi#UsersApi(ApiClient)}
   *   <li>{@link UsersApi#setApiClient(ApiClient)}
   *   <li>{@link UsersApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void UsersApi.<init>(ApiClient)", "ApiClient UsersApi.getApiClient()",
      "void UsersApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    UsersApi actualUsersApi = new UsersApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualUsersApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualUsersApi.getApiClient());
  }
}
