package org.symphonyoss.symphony.pod.api;

import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;
import org.symphonyoss.symphony.pod.invoker.ApiClient;
import org.symphonyoss.symphony.pod.invoker.Configuration;

public class RoomMembershipApiDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link RoomMembershipApi#RoomMembershipApi(ApiClient)}
   *   <li>{@link RoomMembershipApi#setApiClient(ApiClient)}
   *   <li>{@link RoomMembershipApi#getApiClient()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void RoomMembershipApi.<init>(ApiClient)", "ApiClient RoomMembershipApi.getApiClient()",
      "void RoomMembershipApi.setApiClient(ApiClient)"})
  public void testGettersAndSetters() {
    // Arrange and Act
    RoomMembershipApi actualRoomMembershipApi = new RoomMembershipApi(Configuration.getDefaultApiClient());
    ApiClient apiClient = Configuration.getDefaultApiClient();
    actualRoomMembershipApi.setApiClient(apiClient);

    // Assert
    assertSame(apiClient, actualRoomMembershipApi.getApiClient());
  }
}
