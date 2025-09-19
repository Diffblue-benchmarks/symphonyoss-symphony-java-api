package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class MessageSuppressionApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MessageSuppressionApi#MessageSuppressionApi(ApiClient)}
   *   <li>{@link MessageSuppressionApi#setApiClient(ApiClient)}
   *   <li>{@link MessageSuppressionApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MessageSuppressionApi.<init>(ApiClient)",
    "ApiClient MessageSuppressionApi.getApiClient()",
    "void MessageSuppressionApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    MessageSuppressionApi actualMessageSuppressionApi =
        new MessageSuppressionApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualMessageSuppressionApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualMessageSuppressionApi.getApiClient());
  }
}
