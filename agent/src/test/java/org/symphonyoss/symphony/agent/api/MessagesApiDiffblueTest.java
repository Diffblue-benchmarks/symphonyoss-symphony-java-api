package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class MessagesApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link MessagesApi#MessagesApi(ApiClient)}
   *   <li>{@link MessagesApi#setApiClient(ApiClient)}
   *   <li>{@link MessagesApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void MessagesApi.<init>(ApiClient)", "ApiClient MessagesApi.getApiClient()",
      "void MessagesApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    MessagesApi actualMessagesApi = new MessagesApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualMessagesApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualMessagesApi.getApiClient());
  }
}
