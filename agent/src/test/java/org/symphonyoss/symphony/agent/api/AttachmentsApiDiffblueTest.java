package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class AttachmentsApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AttachmentsApi#AttachmentsApi(ApiClient)}
   *   <li>{@link AttachmentsApi#setApiClient(ApiClient)}
   *   <li>{@link AttachmentsApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void AttachmentsApi.<init>(ApiClient)", "ApiClient AttachmentsApi.getApiClient()",
      "void AttachmentsApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    AttachmentsApi actualAttachmentsApi = new AttachmentsApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualAttachmentsApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualAttachmentsApi.getApiClient());
  }
}
