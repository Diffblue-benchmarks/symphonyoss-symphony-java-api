package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class MessageApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessageApi#MessageApi(ApiClient)}
   *   <li>{@link MessageApi#setApiClient(ApiClient)}
   *   <li>{@link MessageApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void MessageApi.<init>(ApiClient)", "ApiClient MessageApi.getApiClient()",
      "void MessageApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    MessageApi actualMessageApi = new MessageApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualMessageApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualMessageApi.getApiClient());
  }
}
