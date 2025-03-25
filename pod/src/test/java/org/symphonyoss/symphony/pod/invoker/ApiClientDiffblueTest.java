package org.symphonyoss.symphony.pod.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Variant;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.media.multipart.MultiPart;
import org.glassfish.jersey.message.internal.OutboundJaxrsResponse;
import org.glassfish.jersey.message.internal.OutboundMessageContext;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.symphonyoss.symphony.pod.invoker.auth.Authentication;

public class ApiClientDiffblueTest {
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link ApiClient#addDefaultHeader(String, String)}.
   * <p>
   * Method under test: {@link ApiClient#addDefaultHeader(String, String)}
   */
  @Test
  @MethodsUnderTest({"ApiClient ApiClient.addDefaultHeader(String, String)"})
  public void testAddDefaultHeader() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertSame(defaultApiClient, defaultApiClient.addDefaultHeader("Key", "42"));
  }

  /**
   * Test {@link ApiClient#deserialize(Response, GenericType)}.
   * <ul>
   *   <li>Given DefaultApiClient TempFolderPath is {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#deserialize(Response, GenericType)}
   */
  @Test
  @MethodsUnderTest({"Object ApiClient.deserialize(Response, GenericType)"})
  public void testDeserialize_givenDefaultApiClientTempFolderPathIsNull_thenReturnNull() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    defaultApiClient.setTempFolderPath(null);

    // Act and Assert
    assertNull(defaultApiClient.deserialize(null, null));
  }

  /**
   * Test {@link ApiClient#deserialize(Response, GenericType)}.
   * <ul>
   *   <li>Given DefaultApiClient TempFolderPath is {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#deserialize(Response, GenericType)}
   */
  @Test
  @MethodsUnderTest({"Object ApiClient.deserialize(Response, GenericType)"})
  public void testDeserialize_givenDefaultApiClientTempFolderPathIsNull_thenReturnNull2() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    defaultApiClient.setTempFolderPath(null);

    // Act and Assert
    assertNull(defaultApiClient.deserialize(new OutboundJaxrsResponse(null, new OutboundMessageContext()), null));
  }

  /**
   * Test {@link ApiClient#escapeString(String)}.
   * <p>
   * Method under test: {@link ApiClient#escapeString(String)}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.escapeString(String)"})
  public void testEscapeString() {
    // Arrange, Act and Assert
    assertEquals("Str", Configuration.getDefaultApiClient().escapeString("Str"));
  }

  /**
   * Test {@link ApiClient#formatDate(Date)}.
   * <ul>
   *   <li>Then return {@code 1970-01-01T00:00:00.000Z}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#formatDate(java.util.Date)}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.formatDate(java.util.Date)"})
  public void testFormatDate_thenReturn19700101t000000000z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertEquals("1970-01-01T00:00:00.000Z", defaultApiClient
        .formatDate(java.util.Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())));
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ApiClient#setBasePath(String)}
   *   <li>{@link ApiClient#setHttpClient(Client)}
   *   <li>{@link ApiClient#setTempFolderPath(String)}
   *   <li>{@link ApiClient#getAuthentications()}
   *   <li>{@link ApiClient#getBasePath()}
   *   <li>{@link ApiClient#getConnectTimeout()}
   *   <li>{@link ApiClient#getDateFormat()}
   *   <li>{@link ApiClient#getHttpClient()}
   *   <li>{@link ApiClient#getJSON()}
   *   <li>{@link ApiClient#getResponseHeaders()}
   *   <li>{@link ApiClient#getStatusCode()}
   *   <li>{@link ApiClient#getTempFolderPath()}
   *   <li>{@link ApiClient#isDebugging()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"Map ApiClient.getAuthentications()", "String ApiClient.getBasePath()",
      "int ApiClient.getConnectTimeout()", "DateFormat ApiClient.getDateFormat()", "Client ApiClient.getHttpClient()",
      "org.symphonyoss.symphony.pod.invoker.JSON ApiClient.getJSON()", "Map ApiClient.getResponseHeaders()",
      "int ApiClient.getStatusCode()", "String ApiClient.getTempFolderPath()", "boolean ApiClient.isDebugging()",
      "ApiClient ApiClient.setBasePath(String)", "ApiClient ApiClient.setHttpClient(Client)",
      "ApiClient ApiClient.setTempFolderPath(String)"})
  public void testGettersAndSetters() {
    // Arrange
    ApiClient apiClient = new ApiClient();

    // Act
    ApiClient actualSetBasePathResult = apiClient.setBasePath("Base Path");
    ApiClient actualSetHttpClientResult = apiClient.setHttpClient(null);
    ApiClient actualSetTempFolderPathResult = apiClient.setTempFolderPath("Temp Folder Path");
    Map<String, Authentication> actualAuthentications = apiClient.getAuthentications();
    String actualBasePath = apiClient.getBasePath();
    int actualConnectTimeout = apiClient.getConnectTimeout();
    DateFormat actualDateFormat = apiClient.getDateFormat();
    Client actualHttpClient = apiClient.getHttpClient();
    apiClient.getJSON();
    Map<String, List<String>> actualResponseHeaders = apiClient.getResponseHeaders();
    int actualStatusCode = apiClient.getStatusCode();
    String actualTempFolderPath = apiClient.getTempFolderPath();

    // Assert
    assertTrue(actualDateFormat instanceof RFC3339DateFormat);
    assertEquals("Base Path", actualBasePath);
    assertEquals("Temp Folder Path", actualTempFolderPath);
    assertNull(actualResponseHeaders);
    assertNull(actualHttpClient);
    assertEquals(0, actualConnectTimeout);
    assertEquals(0, actualStatusCode);
    assertFalse(apiClient.isDebugging());
    assertTrue(actualAuthentications.isEmpty());
    assertSame(apiClient, actualSetBasePathResult);
    assertSame(apiClient, actualSetHttpClientResult);
    assertSame(apiClient, actualSetTempFolderPathResult);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).</li>
   *   <li>When {@link ArrayList#ArrayList()}.</li>
   *   <li>Then throw {@link ApiException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_givenApiClient_whenArrayList_thenThrowApiException() throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept", "text/plain",
        new String[]{}, null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>Given {@code multipart/form-data}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_givenMultipartFormData() throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("multipart/form-data", "multipart/form-data");

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept", "text/plain",
        new String[]{}, null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code Authentication undefined:} and value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_givenPairWithNameIsAuthenticationUndefinedAndValueIs42() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("Authentication undefined: ", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(RuntimeException.class);
    defaultApiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept",
        "text/plain", new String[]{"Auth Names"}, null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code Authentication undefined:} and value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_givenPairWithNameIsAuthenticationUndefinedAndValueIs422() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("Authentication undefined: ", "42"));
    queryParams.add(new Pair("Authentication undefined: ", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(RuntimeException.class);
    defaultApiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept",
        "text/plain", new String[]{"Auth Names"}, null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code multipart/form-data} and value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_givenPairWithNameIsMultipartFormDataAndValueIs42() throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("multipart/form-data", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept", "text/plain",
        new String[]{}, null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}.
   * <ul>
   *   <li>When array of {@link String} with {@code Auth Names}.</li>
   *   <li>Then throw {@link RuntimeException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)}
   */
  @Test
  @MethodsUnderTest({
      "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"})
  public void testInvokeAPI_whenArrayOfStringWithAuthNames_thenThrowRuntimeException() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(RuntimeException.class);
    defaultApiClient.invokeAPI("Path", "Method", queryParams, "Body", headerParams, new HashMap<>(), "Accept",
        "text/plain", new String[]{"Auth Names"}, null);
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json-patch+json}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonPatchJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json-patch+json"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xx42}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx42"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xx(?i)^(application/json|[^;/ ]+/[^;/ ]+[+]json)[ ]*(;.*)?$}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxIApplicationJsonJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient()
        .isJsonMime("application/json  ;xx(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xxMime}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxMime_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xxMime"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xx}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xx,}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx_thenReturnTrue2() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx,"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xx-}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx_thenReturnTrue3() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx-"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xxapplication/json-patch+json}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxapplicationJsonPatchJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xxapplication/json-patch+json"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code application/json ;xxapplication/json ;xx}.</li>
   *   <li>Then return {@code true}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxapplicationJsonXx_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xxapplication/json  ;xx"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code Mime}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenMime_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Configuration.getDefaultApiClient().isJsonMime("Mime"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return {@code false}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Configuration.getDefaultApiClient().isJsonMime(null));
  }

  /**
   * Test new {@link ApiClient} (default constructor).
   * <p>
   * Method under test: default or parameterless constructor of {@link ApiClient}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.<init>()"})
  public void testNewApiClient() {
    // Arrange and Act
    ApiClient actualApiClient = new ApiClient();

    // Assert
    assertTrue(actualApiClient.getHttpClient() instanceof JerseyClient);
    assertTrue(actualApiClient.getDateFormat() instanceof RFC3339DateFormat);
    assertEquals("https://localhost", actualApiClient.getBasePath());
    assertNull(actualApiClient.getTempFolderPath());
    assertNull(actualApiClient.getResponseHeaders());
    assertEquals(0, actualApiClient.getConnectTimeout());
    assertEquals(0, actualApiClient.getStatusCode());
    assertFalse(actualApiClient.isDebugging());
    assertTrue(actualApiClient.getAuthentications().isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return first Value is {@code 42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayListAdd42_thenReturnFirstValueIs42() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(objectList);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("42", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code 42}.</li>
   *   <li>Then return first Value is {@code 42,42}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayListAdd42_thenReturnFirstValueIs4242() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(objectList);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("42,42", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link ArrayList#ArrayList()}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayList_whenLinkedHashSetAddArrayList() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@code ,}.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenComma_thenReturnFirstValueIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs(",", "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When empty string.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs("", "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given {@code null}.</li>
   *   <li>When {@code multi}.</li>
   *   <li>Then return first Value is empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs("multi", "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>Then return first Value is {@code 1970-01-01T00:00:00.010Z}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenTen_thenReturnFirstValueIs19700101t000000010z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    Date date = mock(Date.class);
    when(date.getTime()).thenReturn(10L);

    // Act
    List<Pair> actualParameterToPairsResult = defaultApiClient.parameterToPairs("Collection Format", "Name", date);

    // Assert
    verify(date).getTime();
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("1970-01-01T00:00:00.010Z", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When empty string.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, "", null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, null, null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return Empty.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, "Name", null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   * <ul>
   *   <li>When {@code Value}.</li>
   *   <li>Then return first Value is {@code Value}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange and Act
    List<Pair> actualParameterToPairsResult = Configuration.getDefaultApiClient()
        .parameterToPairs("Collection Format", "Name", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Name", getResult.getName());
    assertEquals("Value", getResult.getValue());
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   * <ul>
   *   <li>Given ten.</li>
   *   <li>Then return {@code 1970-01-01T00:00:00.010Z}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_givenTen_thenReturn19700101t000000010z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    Date date = mock(Date.class);
    when(date.getTime()).thenReturn(10L);

    // Act
    String actualParameterToStringResult = defaultApiClient.parameterToString(date);

    // Assert
    verify(date).getTime();
    assertEquals("1970-01-01T00:00:00.010Z", actualParameterToStringResult);
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code null}.</li>
   *   <li>Then return empty string.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", Configuration.getDefaultApiClient().parameterToString(null));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   * <ul>
   *   <li>When {@code Param}.</li>
   *   <li>Then return {@code Param}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_whenParam_thenReturnParam() {
    // Arrange, Act and Assert
    assertEquals("Param", Configuration.getDefaultApiClient().parameterToString("Param"));
  }

  /**
   * Test {@link ApiClient#parseDate(String)}.
   * <p>
   * Method under test: {@link ApiClient#parseDate(String)}
   */
  @Test
  @MethodsUnderTest({"java.util.Date ApiClient.parseDate(String)"})
  public void testParseDate() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().parseDate("Str");
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code Accepts,(?i)^(application/json|[^;/ ]+/[^;/ ]+[+]json)[ ]*(;.*)?$}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnAcceptsIApplicationJsonJson() {
    // Arrange, Act and Assert
    assertEquals("Accepts,(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$",
        Configuration.getDefaultApiClient()
            .selectHeaderAccept(
                new String[]{"Accepts", "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code application/json-patch+json}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnApplicationJsonPatchJson() {
    // Arrange, Act and Assert
    assertEquals("application/json-patch+json",
        Configuration.getDefaultApiClient().selectHeaderAccept(new String[]{"application/json-patch+json"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;xx}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnApplicationJsonXx() {
    // Arrange, Act and Assert
    assertEquals("application/json  ;xx",
        Configuration.getDefaultApiClient().selectHeaderAccept(new String[]{"application/json  ;xx"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code Accepts}.</li>
   *   <li>Then return {@code Accepts}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenArrayOfStringWithAccepts_thenReturnAccepts() {
    // Arrange, Act and Assert
    assertEquals("Accepts", Configuration.getDefaultApiClient().selectHeaderAccept(new String[]{"Accepts"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertEquals("null", Configuration.getDefaultApiClient().selectHeaderAccept(new String[]{null}));
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Configuration.getDefaultApiClient().selectHeaderAccept(new String[]{}));
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code application/json-patch+json}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_thenReturnApplicationJsonPatchJson() {
    // Arrange, Act and Assert
    assertEquals("application/json-patch+json",
        Configuration.getDefaultApiClient().selectHeaderContentType(new String[]{"application/json-patch+json"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>Then return {@code application/json ;xx}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_thenReturnApplicationJsonXx() {
    // Arrange, Act and Assert
    assertEquals("application/json  ;xx",
        Configuration.getDefaultApiClient().selectHeaderContentType(new String[]{"application/json  ;xx"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code null}.</li>
   *   <li>Then return {@code null}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Configuration.getDefaultApiClient().selectHeaderContentType(new String[]{null}));
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.</li>
   *   <li>Then return {@code text/plain}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange, Act and Assert
    assertEquals("text/plain", Configuration.getDefaultApiClient().selectHeaderContentType(new String[]{"text/plain"}));
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   * <ul>
   *   <li>When empty array of {@link String}.</li>
   *   <li>Then return {@code application/json}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange, Act and Assert
    assertEquals("application/json", Configuration.getDefaultApiClient().selectHeaderContentType(new String[]{}));
  }

  /**
   * Test {@link ApiClient#serialize(Object, Map, String)}.
   * <ul>
   *   <li>Then return MediaType Type is {@code application}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_thenReturnMediaTypeTypeIsApplication() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult = defaultApiClient.serialize("Obj", new HashMap<>(),
        "application/x-www-form-urlencoded");

    // Assert
    MediaType mediaType = actualSerializeResult.getMediaType();
    assertEquals("application", mediaType.getType());
    assertEquals("x-www-form-urlencoded", mediaType.getSubtype());
    assertNull(actualSerializeResult.getEncoding());
    Variant variant = actualSerializeResult.getVariant();
    assertNull(variant.getEncoding());
    assertNull(variant.getLanguageString());
    assertNull(actualSerializeResult.getLanguage());
    assertNull(variant.getLanguage());
    assertEquals(0, actualSerializeResult.getAnnotations().length);
    assertFalse(mediaType.isWildcardSubtype());
    assertFalse(mediaType.isWildcardType());
    assertTrue(mediaType.getParameters().isEmpty());
    assertSame(mediaType, variant.getMediaType());
  }

  /**
   * Test {@link ApiClient#serialize(Object, Map, String)}.
   * <ul>
   *   <li>When {@code multipart/form-data}.</li>
   *   <li>Then Entity return {@link MultiPart}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_whenMultipartFormData_thenEntityReturnMultiPart() throws ParseException, ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult = defaultApiClient.serialize("Obj", new HashMap<>(), "multipart/form-data");

    // Assert
    Object entity = actualSerializeResult.getEntity();
    assertTrue(entity instanceof MultiPart);
    MediaType mediaType = actualSerializeResult.getMediaType();
    assertEquals("form-data", mediaType.getSubtype());
    assertEquals("multipart", mediaType.getType());
    assertNull(((MultiPart) entity).getProviders());
    assertNull(((MultiPart) entity).getContentDisposition());
    assertNull(((MultiPart) entity).getParent());
    assertNull(((MultiPart) entity).messageBodyWorkers);
    assertTrue(((MultiPart) entity).getBodyParts().isEmpty());
    assertTrue(((MultiPart) entity).getHeaders().isEmpty());
    assertTrue(((MultiPart) entity).getParameterizedHeaders().isEmpty());
    assertSame(mediaType, actualSerializeResult.getVariant().getMediaType());
  }

  /**
   * Test {@link ApiClient#serialize(Object, Map, String)}.
   * <ul>
   *   <li>When {@code text/plain}.</li>
   *   <li>Then return Entity is {@code Obj}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_whenTextPlain_thenReturnEntityIsObj() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult = defaultApiClient.serialize("Obj", new HashMap<>(), "text/plain");

    // Assert
    assertEquals("Obj", actualSerializeResult.getEntity());
    MediaType mediaType = actualSerializeResult.getMediaType();
    assertEquals("plain", mediaType.getSubtype());
    assertEquals("text", mediaType.getType());
    assertSame(mediaType, actualSerializeResult.getVariant().getMediaType());
  }

  /**
   * Test {@link ApiClient#setAccessToken(String)}.
   * <p>
   * Method under test: {@link ApiClient#setAccessToken(String)}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.setAccessToken(String)"})
  public void testSetAccessToken() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setAccessToken("ABC123");
  }

  /**
   * Test {@link ApiClient#setApiKey(String)}.
   * <p>
   * Method under test: {@link ApiClient#setApiKey(String)}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.setApiKey(String)"})
  public void testSetApiKey() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setApiKey("Api Key");
  }

  /**
   * Test {@link ApiClient#setApiKeyPrefix(String)}.
   * <p>
   * Method under test: {@link ApiClient#setApiKeyPrefix(String)}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.setApiKeyPrefix(String)"})
  public void testSetApiKeyPrefix() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setApiKeyPrefix("Api Key Prefix");
  }

  /**
   * Test {@link ApiClient#setConnectTimeout(int)}.
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).</li>
   *   <li>Then {@link ApiClient} (default constructor) ConnectTimeout is ten.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#setConnectTimeout(int)}
   */
  @Test
  @MethodsUnderTest({"ApiClient ApiClient.setConnectTimeout(int)"})
  public void testSetConnectTimeout_givenApiClient_thenApiClientConnectTimeoutIsTen() {
    // Arrange
    ApiClient apiClient = new ApiClient();

    // Act
    ApiClient actualSetConnectTimeoutResult = apiClient.setConnectTimeout(10);

    // Assert
    assertEquals(10, apiClient.getConnectTimeout());
    assertSame(apiClient, actualSetConnectTimeoutResult);
  }

  /**
   * Test {@link ApiClient#setDateFormat(DateFormat)}.
   * <ul>
   *   <li>Then DefaultApiClient DateFormat is {@link SimpleDateFormat#SimpleDateFormat(String)} with {@code yyyy/mm/dd}.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#setDateFormat(DateFormat)}
   */
  @Test
  @MethodsUnderTest({"ApiClient ApiClient.setDateFormat(DateFormat)"})
  public void testSetDateFormat_thenDefaultApiClientDateFormatIsSimpleDateFormatWithYyyyMmDd() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");

    // Act
    ApiClient actualSetDateFormatResult = defaultApiClient.setDateFormat(dateFormat);

    // Assert
    assertSame(dateFormat, defaultApiClient.getDateFormat());
    assertSame(defaultApiClient, actualSetDateFormatResult);
  }

  /**
   * Test {@link ApiClient#setDebugging(boolean)}.
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).</li>
   *   <li>When {@code true}.</li>
   *   <li>Then {@link ApiClient} (default constructor) Debugging.</li>
   * </ul>
   * <p>
   * Method under test: {@link ApiClient#setDebugging(boolean)}
   */
  @Test
  @MethodsUnderTest({"ApiClient ApiClient.setDebugging(boolean)"})
  public void testSetDebugging_givenApiClient_whenTrue_thenApiClientDebugging() {
    // Arrange
    ApiClient apiClient = new ApiClient();

    // Act
    ApiClient actualSetDebuggingResult = apiClient.setDebugging(true);

    // Assert
    assertTrue(apiClient.isDebugging());
    assertSame(apiClient, actualSetDebuggingResult);
  }

  /**
   * Test {@link ApiClient#setPassword(String)}.
   * <p>
   * Method under test: {@link ApiClient#setPassword(String)}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.setPassword(String)"})
  public void testSetPassword() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setPassword("iloveyou");
  }

  /**
   * Test {@link ApiClient#setUserAgent(String)}.
   * <p>
   * Method under test: {@link ApiClient#setUserAgent(String)}
   */
  @Test
  @MethodsUnderTest({"ApiClient ApiClient.setUserAgent(String)"})
  public void testSetUserAgent() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertSame(defaultApiClient, defaultApiClient.setUserAgent("User Agent"));
  }

  /**
   * Test {@link ApiClient#setUsername(String)}.
   * <p>
   * Method under test: {@link ApiClient#setUsername(String)}
   */
  @Test
  @MethodsUnderTest({"void ApiClient.setUsername(String)"})
  public void testSetUsername() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setUsername("janedoe");
  }
}
