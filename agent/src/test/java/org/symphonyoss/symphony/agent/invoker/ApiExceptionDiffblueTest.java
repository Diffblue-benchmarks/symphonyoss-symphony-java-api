package org.symphonyoss.symphony.agent.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class ApiExceptionDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException()}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_thenReturnMessageIsNull() {
    // Arrange and Act
    ApiException actualApiException = new ApiException();
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertNull(actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getCause());
    assertNull(actualResponseHeaders);
    assertEquals(0, actualCode);
    assertEquals(0, actualApiException.getSuppressed().length);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>Then return ResponseBody is {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(int, String, Map, String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_thenReturnResponseBodyIsNotAllWhoWanderAreLost() {
    // Arrange
    HashMap<String, List<String>> responseHeaders = new HashMap<>();

    // Act
    ApiException actualApiException =
        new ApiException(1, "An error occurred", responseHeaders, "Not all who wander are lost");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("An error occurred", actualApiException.getMessage());
    assertEquals("Not all who wander are lost", actualResponseBody);
    assertNull(actualApiException.getCause());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
    assertTrue(actualResponseHeaders.isEmpty());
    assertSame(responseHeaders, actualResponseHeaders);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>Then return ResponseBody is {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(String, Throwable, int, Map, String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_thenReturnResponseBodyIsNotAllWhoWanderAreLost2() {
    // Arrange
    Throwable throwable = new Throwable();
    HashMap<String, List<String>> responseHeaders = new HashMap<>();

    // Act
    ApiException actualApiException =
        new ApiException(
            "An error occurred", throwable, 1, responseHeaders, "Not all who wander are lost");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("An error occurred", actualApiException.getMessage());
    assertEquals("Not all who wander are lost", actualResponseBody);
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
    assertTrue(actualResponseHeaders.isEmpty());
    assertSame(throwable, actualApiException.getCause());
    assertSame(responseHeaders, actualResponseHeaders);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@code An error occurred}.
   *   <li>Then return Code is zero.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_whenAnErrorOccurred_thenReturnCodeIsZero() {
    // Arrange and Act
    ApiException actualApiException = new ApiException("An error occurred");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("An error occurred", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getCause());
    assertNull(actualResponseHeaders);
    assertEquals(0, actualCode);
    assertEquals(0, actualApiException.getSuppressed().length);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Cause is {@code null}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(int, String)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_whenOne_thenReturnCauseIsNull() {
    // Arrange and Act
    ApiException actualApiException = new ApiException(1, "An error occurred");
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("An error occurred", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualApiException.getCause());
    assertNull(actualResponseHeaders);
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(Throwable)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable throwable = new Throwable();

    // Act
    ApiException actualApiException = new ApiException(throwable);
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("java.lang.Throwable", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertNull(actualResponseHeaders);
    assertEquals(0, actualCode);
    assertEquals(0, actualApiException.getSuppressed().length);
    assertSame(throwable, actualApiException.getCause());
  }

  /**
   * Test getters and setters.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return ResponseHeaders Empty.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApiException#ApiException(String, Throwable, int, Map)}
   *   <li>{@link ApiException#getCode()}
   *   <li>{@link ApiException#getResponseBody()}
   *   <li>{@link ApiException#getResponseHeaders()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApiException.<init>()",
    "void ApiException.<init>(int, String)",
    "void ApiException.<init>(int, String, Map, String)",
    "void ApiException.<init>(String)",
    "void ApiException.<init>(String, Throwable, int, Map)",
    "void ApiException.<init>(String, Throwable, int, Map, String)",
    "void ApiException.<init>(Throwable)",
    "int ApiException.getCode()",
    "String ApiException.getResponseBody()",
    "Map ApiException.getResponseHeaders()"
  })
  public void testGettersAndSetters_whenThrowable_thenReturnResponseHeadersEmpty() {
    // Arrange
    Throwable throwable = new Throwable();
    HashMap<String, List<String>> responseHeaders = new HashMap<>();

    // Act
    ApiException actualApiException =
        new ApiException("An error occurred", throwable, 1, responseHeaders);
    int actualCode = actualApiException.getCode();
    String actualResponseBody = actualApiException.getResponseBody();
    Map<String, List<String>> actualResponseHeaders = actualApiException.getResponseHeaders();

    // Assert
    assertEquals("An error occurred", actualApiException.getMessage());
    assertNull(actualResponseBody);
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualCode);
    assertTrue(actualResponseHeaders.isEmpty());
    assertSame(throwable, actualApiException.getCause());
    assertSame(responseHeaders, actualResponseHeaders);
  }

  /**
   * Test {@link ApiException#ApiException(int, Map, String)}.
   *
   * <p>Method under test: {@link ApiException#ApiException(int, Map, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiException.<init>(int, Map, String)"})
  public void testNewApiException() {
    // Arrange and Act
    ApiException actualApiException =
        new ApiException(1, new HashMap<>(), "Not all who wander are lost");

    // Assert
    assertEquals("Not all who wander are lost", actualApiException.getResponseBody());
    assertNull(actualApiException.getLocalizedMessage());
    assertNull(actualApiException.getMessage());
    assertNull(actualApiException.getCause());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualApiException.getCode());
    assertTrue(actualApiException.getResponseHeaders().isEmpty());
  }

  /**
   * Test {@link ApiException#ApiException(String, int, Map, String)}.
   *
   * <p>Method under test: {@link ApiException#ApiException(String, int, Map, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiException.<init>(String, int, Map, String)"})
  public void testNewApiException2() {
    // Arrange and Act
    ApiException actualApiException =
        new ApiException("An error occurred", 1, new HashMap<>(), "Not all who wander are lost");

    // Assert
    assertEquals("An error occurred", actualApiException.getLocalizedMessage());
    assertEquals("An error occurred", actualApiException.getMessage());
    assertEquals("Not all who wander are lost", actualApiException.getResponseBody());
    assertNull(actualApiException.getCause());
    assertEquals(0, actualApiException.getSuppressed().length);
    assertEquals(1, actualApiException.getCode());
    assertTrue(actualApiException.getResponseHeaders().isEmpty());
  }
}
