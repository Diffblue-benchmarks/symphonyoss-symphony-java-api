package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class FirehoseApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FirehoseApi#FirehoseApi(ApiClient)}
   *   <li>{@link FirehoseApi#setApiClient(ApiClient)}
   *   <li>{@link FirehoseApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FirehoseApi.<init>(ApiClient)",
    "ApiClient FirehoseApi.getApiClient()",
    "void FirehoseApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    FirehoseApi actualFirehoseApi = new FirehoseApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualFirehoseApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualFirehoseApi.getApiClient());
  }
}
