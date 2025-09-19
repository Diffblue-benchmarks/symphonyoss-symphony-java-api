package org.symphonyoss.symphony.agent.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
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
import org.symphonyoss.symphony.agent.invoker.auth.Authentication;

public class ApiClientDiffblueTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  /**
   * Test {@link ApiClient#addDefaultHeader(String, String)}.
   *
   * <p>Method under test: {@link ApiClient#addDefaultHeader(String, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClient.addDefaultHeader(String, String)"})
  public void testAddDefaultHeader() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    ApiClient actualAddDefaultHeaderResult = defaultApiClient.addDefaultHeader("Key", "42");

    // Assert
    assertSame(defaultApiClient, actualAddDefaultHeaderResult);
  }

  /**
   * Test {@link ApiClient#deserialize(Response, GenericType)}.
   *
   * <ul>
   *   <li>Given DefaultApiClient TempFolderPath is {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#deserialize(Response, GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ApiClient.deserialize(Response, GenericType)"})
  public void testDeserialize_givenDefaultApiClientTempFolderPathIsNull_thenReturnNull()
      throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    defaultApiClient.setTempFolderPath(null);

    // Act and Assert
    assertNull(defaultApiClient.deserialize(null, null));
  }

  /**
   * Test {@link ApiClient#deserialize(Response, GenericType)}.
   *
   * <ul>
   *   <li>Given DefaultApiClient TempFolderPath is {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#deserialize(Response, GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ApiClient.deserialize(Response, GenericType)"})
  public void testDeserialize_givenDefaultApiClientTempFolderPathIsNull_thenReturnNull2()
      throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    defaultApiClient.setTempFolderPath(null);
    OutboundJaxrsResponse response = new OutboundJaxrsResponse(null, new OutboundMessageContext());

    // Act and Assert
    assertNull(defaultApiClient.deserialize(response, null));
  }

  /**
   * Test {@link ApiClient#escapeString(String)}.
   *
   * <p>Method under test: {@link ApiClient#escapeString(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.escapeString(String)"})
  public void testEscapeString() {
    // Arrange, Act and Assert
    assertEquals("Str", Configuration.getDefaultApiClient().escapeString("Str"));
  }

  /**
   * Test {@link ApiClient#formatDate(Date)}.
   *
   * <ul>
   *   <li>Then return {@code 1970-01-01T00:00:00.000Z}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#formatDate(Date)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.formatDate(Date)"})
  public void testFormatDate_thenReturn19700101t000000000z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertEquals(
        "1970-01-01T00:00:00.000Z",
        defaultApiClient.formatDate(
            Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())));
  }

  /**
   * Test {@link ApiClient#getAuthentication(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#getAuthentication(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Authentication ApiClient.getAuthentication(String)"})
  public void testGetAuthentication_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Configuration.getDefaultApiClient().getAuthentication("Auth Name"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
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
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Map ApiClient.getAuthentications()",
    "String ApiClient.getBasePath()",
    "int ApiClient.getConnectTimeout()",
    "DateFormat ApiClient.getDateFormat()",
    "Client ApiClient.getHttpClient()",
    "org.symphonyoss.symphony.agent.invoker.JSON ApiClient.getJSON()",
    "Map ApiClient.getResponseHeaders()",
    "int ApiClient.getStatusCode()",
    "String ApiClient.getTempFolderPath()",
    "boolean ApiClient.isDebugging()",
    "ApiClient ApiClient.setBasePath(String)",
    "ApiClient ApiClient.setHttpClient(Client)",
    "ApiClient ApiClient.setTempFolderPath(String)"
  })
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
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String,
   * String[], GenericType)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link ApiException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map,
   * String, String, String[], GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"
  })
  public void testInvokeAPI_givenApiClient_whenArrayList_thenThrowApiException()
      throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI(
        "Path",
        "Method",
        queryParams,
        "Body",
        headerParams,
        new HashMap<>(),
        "Accept",
        "text/plain",
        new String[] {},
        null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String,
   * String[], GenericType)}.
   *
   * <ul>
   *   <li>Given {@code application/x-www-form-urlencoded}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map,
   * String, String, String[], GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"
  })
  public void testInvokeAPI_givenApplicationXWwwFormUrlencoded() throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();

    HashMap<String, String> headerParams = new HashMap<>();
    headerParams.put("application/x-www-form-urlencoded", "application/x-www-form-urlencoded");

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI(
        "Path",
        "Method",
        queryParams,
        "Body",
        headerParams,
        new HashMap<>(),
        "Accept",
        "text/plain",
        new String[] {},
        null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String,
   * String[], GenericType)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code multipart/form-data} and
   *       value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map,
   * String, String, String[], GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"
  })
  public void testInvokeAPI_givenPairWithNameIsMultipartFormDataAndValueIs42() throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("multipart/form-data", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI(
        "Path",
        "Method",
        queryParams,
        "Body",
        headerParams,
        new HashMap<>(),
        "Accept",
        "text/plain",
        new String[] {},
        null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String,
   * String[], GenericType)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with name is {@code multipart/form-data} and
   *       value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map,
   * String, String, String[], GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"
  })
  public void testInvokeAPI_givenPairWithNameIsMultipartFormDataAndValueIs422()
      throws ApiException {
    // Arrange
    ApiClient apiClient = new ApiClient();

    ArrayList<Pair> queryParams = new ArrayList<>();
    queryParams.add(new Pair("multipart/form-data", "42"));
    queryParams.add(new Pair("multipart/form-data", "42"));
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(ApiException.class);
    apiClient.invokeAPI(
        "Path",
        "Method",
        queryParams,
        "Body",
        headerParams,
        new HashMap<>(),
        "Accept",
        "text/plain",
        new String[] {},
        null);
  }

  /**
   * Test {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map, String, String,
   * String[], GenericType)}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Auth Names}.
   *   <li>Then throw {@link RuntimeException}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#invokeAPI(String, String, List, Object, Map, Map,
   * String, String, String[], GenericType)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Object ApiClient.invokeAPI(String, String, List, Object, Map, Map, String, String, String[], GenericType)"
  })
  public void testInvokeAPI_whenArrayOfStringWithAuthNames_thenThrowRuntimeException()
      throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();
    ArrayList<Pair> queryParams = new ArrayList<>();
    HashMap<String, String> headerParams = new HashMap<>();

    // Act and Assert
    thrown.expect(RuntimeException.class);
    defaultApiClient.invokeAPI(
        "Path",
        "Method",
        queryParams,
        "Body",
        headerParams,
        new HashMap<>(),
        "Accept",
        "text/plain",
        new String[] {"Auth Names"},
        null);
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json-patch+json}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonPatchJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json-patch+json"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xx42}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx42_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx42"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xx(?i)^(application/json|[^;/ ]+/[^;/ ]+[+]json)[
   *       ]*(;.*)?$}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxIApplicationJsonJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        Configuration.getDefaultApiClient()
            .isJsonMime(
                "application/json  ;xx(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xxMime}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxMime_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xxMime"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xx}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xx,}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXx_thenReturnTrue2() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().isJsonMime("application/json  ;xx,"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xxapplication/json-patch+json}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxapplicationJsonPatchJson_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        Configuration.getDefaultApiClient()
            .isJsonMime("application/json  ;xxapplication/json-patch+json"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code application/json ;xxapplication/json ;xx}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenApplicationJsonXxapplicationJsonXx_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        Configuration.getDefaultApiClient()
            .isJsonMime("application/json  ;xxapplication/json  ;xx"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code Mime}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenMime_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Configuration.getDefaultApiClient().isJsonMime("Mime"));
  }

  /**
   * Test {@link ApiClient#isJsonMime(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#isJsonMime(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ApiClient.isJsonMime(String)"})
  public void testIsJsonMime_whenNull_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Configuration.getDefaultApiClient().isJsonMime(null));
  }

  /**
   * Test new {@link ApiClient} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link ApiClient}
   */
  @Test
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Pair#Pair(String, String)} with {@code
   *       Name} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayListAddPairWithNameAndValueIs42() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link Pair#Pair(String, String)} with name is
   *       {@code multi} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayListAddPairWithNameIsMultiAndValueIs42() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("multi", "42"));
    pairList.add(new Pair("Name", "42"));

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(pairList);

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenArrayList_whenLinkedHashSetAddArrayList() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(new ArrayList<>());

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When empty string.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenEmptyString_thenReturnFirstValueIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("", "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenLinkedHashSetAddNull() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs(null, "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@code multi}.
   *   <li>Then return first Value is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenNull_whenMulti_thenReturnFirstValueIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add(null);

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("multi", "Name", objectSet);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.
   *   <li>When {@code Collection Format}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenPairWithNameAndValueIs42_whenCollectionFormat() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("Collection Format", "Name", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.
   *   <li>When {@code pipes}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenPairWithNameAndValueIs42_whenPipes() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("pipes", "Name", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.
   *   <li>When {@code ssv}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenPairWithNameAndValueIs42_whenSsv() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("ssv", "Name", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Given {@link Pair#Pair(String, String)} with {@code Name} and value is {@code 42}.
   *   <li>When {@code tsv}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_givenPairWithNameAndValueIs42_whenTsv() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("tsv", "Name", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("Name", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>Then return first Value is {@code 1970-01-01T00:00:00.000Z}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_thenReturnFirstValueIs19700101t000000000z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs(
            "Collection Format",
            "Name",
            Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant()));

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("1970-01-01T00:00:00.000Z", getResult.getValue());
    assertEquals("Name", getResult.getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenArrayList_thenReturnEmpty() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertTrue(
        defaultApiClient
            .parameterToPairs("Collection Format", "Name", new ArrayList<>())
            .isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenEmptyString_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, "", null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenNull_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, null, null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenNull_thenReturnEmpty2() {
    // Arrange, Act and Assert
    assertTrue(Configuration.getDefaultApiClient().parameterToPairs(null, "Name", null).isEmpty());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When space.
   *   <li>Then return first Name is empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenSpace_thenReturnFirstNameIsEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Pair> pairList = new ArrayList<>();
    pairList.add(new Pair("Name", "42"));

    // Act
    List<Pair> actualParameterToPairsResult =
        defaultApiClient.parameterToPairs("ssv", " ", pairList);

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    assertEquals("", actualParameterToPairsResult.get(0).getName());
  }

  /**
   * Test {@link ApiClient#parameterToPairs(String, String, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return first Value is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToPairs(String, String, Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"List ApiClient.parameterToPairs(String, String, Object)"})
  public void testParameterToPairs_whenValue_thenReturnFirstValueIsValue() {
    // Arrange and Act
    List<Pair> actualParameterToPairsResult =
        Configuration.getDefaultApiClient().parameterToPairs("Collection Format", "Name", "Value");

    // Assert
    assertEquals(1, actualParameterToPairsResult.size());
    Pair getResult = actualParameterToPairsResult.get(0);
    assertEquals("Name", getResult.getName());
    assertEquals("Value", getResult.getValue());
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_given42_whenArrayListAdd42_thenReturn42() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act and Assert
    assertEquals("42", defaultApiClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@code 42,42}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_given42_whenArrayListAdd42_thenReturn4242() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act and Assert
    assertEquals("42,42", defaultApiClient.parameterToString(objectList));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>Then return {@code 1970-01-01T00:00:00.000Z}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_thenReturn19700101t000000000z() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertEquals(
        "1970-01-01T00:00:00.000Z",
        defaultApiClient.parameterToString(
            Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_whenArrayList_thenReturnEmptyString() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act and Assert
    assertEquals("", defaultApiClient.parameterToString(new ArrayList<>()));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_whenNull_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", Configuration.getDefaultApiClient().parameterToString(null));
  }

  /**
   * Test {@link ApiClient#parameterToString(Object)}.
   *
   * <ul>
   *   <li>When {@code Param}.
   *   <li>Then return {@code Param}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#parameterToString(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.parameterToString(Object)"})
  public void testParameterToString_whenParam_thenReturnParam() {
    // Arrange, Act and Assert
    assertEquals("Param", Configuration.getDefaultApiClient().parameterToString("Param"));
  }

  /**
   * Test {@link ApiClient#parseDate(String)}.
   *
   * <p>Method under test: {@link ApiClient#parseDate(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Date ApiClient.parseDate(String)"})
  public void testParseDate() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().parseDate("Str");
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return a string.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnAString() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient()
            .selectHeaderAccept(
                new String[] {
                  "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$",
                  "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"
                });

    // Assert
    assertEquals(
        "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$,(?i)^(application/json|[^;/ \t]+/[^;/ "
            + "\t]+[+]json)[ \t]*(;.*)?$",
        actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json-patch+json}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnApplicationJsonPatchJson() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient()
            .selectHeaderAccept(new String[] {"application/json-patch+json"});

    // Assert
    assertEquals("application/json-patch+json", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;xx}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_thenReturnApplicationJsonXx() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient()
            .selectHeaderAccept(
                new String[] {
                  "application/json  ;xx",
                  "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$"
                });

    // Assert
    assertEquals("application/json  ;xx", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code Accepts}.
   *   <li>Then return {@code Accepts}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenArrayOfStringWithAccepts_thenReturnAccepts() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient().selectHeaderAccept(new String[] {"Accepts"});

    // Assert
    assertEquals("Accepts", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient().selectHeaderAccept(new String[] {null});

    // Assert
    assertEquals("null", actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderAccept(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderAccept(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderAccept(String[])"})
  public void testSelectHeaderAccept_whenEmptyArrayOfString_thenReturnNull() {
    // Arrange and Act
    String actualSelectHeaderAcceptResult =
        Configuration.getDefaultApiClient().selectHeaderAccept(new String[] {});

    // Assert
    assertNull(actualSelectHeaderAcceptResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json-patch+json}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_thenReturnApplicationJsonPatchJson() {
    // Arrange and Act
    String actualSelectHeaderContentTypeResult =
        Configuration.getDefaultApiClient()
            .selectHeaderContentType(new String[] {"application/json-patch+json"});

    // Assert
    assertEquals("application/json-patch+json", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>Then return {@code application/json ;xx}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_thenReturnApplicationJsonXx() {
    // Arrange and Act
    String actualSelectHeaderContentTypeResult =
        Configuration.getDefaultApiClient()
            .selectHeaderContentType(new String[] {"application/json  ;xx"});

    // Assert
    assertEquals("application/json  ;xx", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenArrayOfStringWithNull_thenReturnNull() {
    // Arrange and Act
    String actualSelectHeaderContentTypeResult =
        Configuration.getDefaultApiClient().selectHeaderContentType(new String[] {null});

    // Assert
    assertNull(actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When array of {@link String} with {@code text/plain}.
   *   <li>Then return {@code text/plain}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenArrayOfStringWithTextPlain_thenReturnTextPlain() {
    // Arrange and Act
    String actualSelectHeaderContentTypeResult =
        Configuration.getDefaultApiClient().selectHeaderContentType(new String[] {"text/plain"});

    // Assert
    assertEquals("text/plain", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClient#selectHeaderContentType(String[])}.
   *
   * <ul>
   *   <li>When empty array of {@link String}.
   *   <li>Then return {@code application/json}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#selectHeaderContentType(String[])}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"String ApiClient.selectHeaderContentType(String[])"})
  public void testSelectHeaderContentType_whenEmptyArrayOfString_thenReturnApplicationJson() {
    // Arrange and Act
    String actualSelectHeaderContentTypeResult =
        Configuration.getDefaultApiClient().selectHeaderContentType(new String[] {});

    // Assert
    assertEquals("application/json", actualSelectHeaderContentTypeResult);
  }

  /**
   * Test {@link ApiClient#serialize(Object, Map, String)}.
   *
   * <ul>
   *   <li>Then return MediaType Type is {@code application}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_thenReturnMediaTypeTypeIsApplication() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult =
        defaultApiClient.serialize("Obj", new HashMap<>(), "application/x-www-form-urlencoded");

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
   *
   * <ul>
   *   <li>When {@code multipart/form-data}.
   *   <li>Then Entity return {@link MultiPart}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_whenMultipartFormData_thenEntityReturnMultiPart()
      throws ParseException, ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult =
        defaultApiClient.serialize("Obj", new HashMap<>(), "multipart/form-data");

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
   *
   * <ul>
   *   <li>When {@code text/plain}.
   *   <li>Then return Entity is {@code Obj}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#serialize(Object, Map, String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"Entity ApiClient.serialize(Object, Map, String)"})
  public void testSerialize_whenTextPlain_thenReturnEntityIsObj() throws ApiException {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    Entity<?> actualSerializeResult =
        defaultApiClient.serialize("Obj", new HashMap<>(), "text/plain");

    // Assert
    assertEquals("Obj", actualSerializeResult.getEntity());
    MediaType mediaType = actualSerializeResult.getMediaType();
    assertEquals("plain", mediaType.getSubtype());
    assertEquals("text", mediaType.getType());
    assertSame(mediaType, actualSerializeResult.getVariant().getMediaType());
  }

  /**
   * Test {@link ApiClient#setAccessToken(String)}.
   *
   * <p>Method under test: {@link ApiClient#setAccessToken(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClient.setAccessToken(String)"})
  public void testSetAccessToken() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setAccessToken("ABC123");
  }

  /**
   * Test {@link ApiClient#setApiKey(String)}.
   *
   * <p>Method under test: {@link ApiClient#setApiKey(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClient.setApiKey(String)"})
  public void testSetApiKey() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setApiKey("Api Key");
  }

  /**
   * Test {@link ApiClient#setApiKeyPrefix(String)}.
   *
   * <p>Method under test: {@link ApiClient#setApiKeyPrefix(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClient.setApiKeyPrefix(String)"})
  public void testSetApiKeyPrefix() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setApiKeyPrefix("Api Key Prefix");
  }

  /**
   * Test {@link ApiClient#setConnectTimeout(int)}.
   *
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).
   *   <li>Then {@link ApiClient} (default constructor) ConnectTimeout is ten.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#setConnectTimeout(int)}
   */
  @Test
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Then DefaultApiClient DateFormat is {@link SimpleDateFormat#SimpleDateFormat(String)}
   *       with {@code yyyy/mm/dd}.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#setDateFormat(DateFormat)}
   */
  @Test
  @ManagedByDiffblue
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
   *
   * <ul>
   *   <li>Given {@link ApiClient} (default constructor).
   *   <li>When {@code true}.
   *   <li>Then {@link ApiClient} (default constructor) Debugging.
   * </ul>
   *
   * <p>Method under test: {@link ApiClient#setDebugging(boolean)}
   */
  @Test
  @ManagedByDiffblue
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
   *
   * <p>Method under test: {@link ApiClient#setPassword(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClient.setPassword(String)"})
  public void testSetPassword() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setPassword("iloveyou");
  }

  /**
   * Test {@link ApiClient#setUserAgent(String)}.
   *
   * <p>Method under test: {@link ApiClient#setUserAgent(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ApiClient ApiClient.setUserAgent(String)"})
  public void testSetUserAgent() {
    // Arrange
    ApiClient defaultApiClient = Configuration.getDefaultApiClient();

    // Act
    ApiClient actualSetUserAgentResult = defaultApiClient.setUserAgent("User Agent");

    // Assert
    assertSame(defaultApiClient, actualSetUserAgentResult);
  }

  /**
   * Test {@link ApiClient#setUsername(String)}.
   *
   * <p>Method under test: {@link ApiClient#setUsername(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void ApiClient.setUsername(String)"})
  public void testSetUsername() {
    // Arrange, Act and Assert
    thrown.expect(RuntimeException.class);
    Configuration.getDefaultApiClient().setUsername("janedoe");
  }
}
