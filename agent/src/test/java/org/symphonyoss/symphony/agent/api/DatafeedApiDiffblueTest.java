package org.symphonyoss.symphony.agent.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.agent.invoker.ApiClient;
import org.symphonyoss.symphony.agent.invoker.Configuration;

public class DatafeedApiDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DatafeedApi#DatafeedApi(ApiClient)}
   *   <li>{@link DatafeedApi#setApiClient(ApiClient)}
   *   <li>{@link DatafeedApi#getApiClient()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DatafeedApi.<init>(ApiClient)",
    "ApiClient DatafeedApi.getApiClient()",
    "void DatafeedApi.setApiClient(ApiClient)"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    DatafeedApi actualDatafeedApi = new DatafeedApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualDatafeedApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualDatafeedApi.getApiClient());
  }
}
