package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class SignalsApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SignalsApi#SignalsApi(ApiClient)}
   *   <li>{@link SignalsApi#setApiClient(ApiClient)}
   *   <li>{@link SignalsApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SignalsApi.<init>(ApiClient)",
    "ApiClient SignalsApi.getApiClient()",
    "void SignalsApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    SignalsApi actualSignalsApi = new SignalsApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualSignalsApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualSignalsApi.getApiClient());
  }
}
