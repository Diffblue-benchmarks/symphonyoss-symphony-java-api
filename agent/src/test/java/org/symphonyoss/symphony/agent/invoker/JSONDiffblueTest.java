package org.symphonyoss.symphony.agent.invoker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.junit.Test;

public class JSONDiffblueTest {
  /**
   * Test {@link JSON#getContext(Class)}.
   *
   * <p>Method under test: {@link JSON#getContext(Class)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ObjectMapper JSON.getContext(Class)"})
  public void testGetContext() {
    // Arrange
    JSON json = new JSON();
    Class<Object> type = Object.class;

    // Act
    ObjectMapper actualContext = json.getContext(type);

    // Assert
    JsonFactory factory = actualContext.getFactory();
    assertTrue(factory instanceof MappingJsonFactory);
    assertTrue(
        actualContext.getDeserializationContext() instanceof DefaultDeserializationContext.Impl);
    assertTrue(actualContext.getVisibilityChecker() instanceof Std);
    assertTrue(actualContext.getSubtypeResolver() instanceof StdSubtypeResolver);
    assertTrue(actualContext.getSerializerFactory() instanceof BeanSerializerFactory);
    assertTrue(actualContext.getSerializerProvider() instanceof Impl);
    assertTrue(actualContext.getSerializerProviderInstance() instanceof Impl);
    assertTrue(actualContext.getDateFormat() instanceof RFC3339DateFormat);
    assertNull(actualContext.getInjectableValues());
    assertNull(actualContext.getPropertyNamingStrategy());
    assertSame(factory, actualContext.getJsonFactory());
  }

  /**
   * Test new {@link JSON} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link JSON}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void JSON.<init>()"})
  public void testNewJson() {
    // Arrange, Act and Assert
    ObjectMapper context = new JSON().getContext(null);
    JsonFactory factory = context.getFactory();
    assertTrue(factory instanceof MappingJsonFactory);
    assertTrue(context.getDeserializationContext() instanceof DefaultDeserializationContext.Impl);
    assertTrue(context.getVisibilityChecker() instanceof Std);
    assertTrue(context.getSubtypeResolver() instanceof StdSubtypeResolver);
    assertTrue(context.getSerializerFactory() instanceof BeanSerializerFactory);
    assertTrue(context.getSerializerProvider() instanceof Impl);
    assertTrue(context.getSerializerProviderInstance() instanceof Impl);
    assertTrue(context.getDateFormat() instanceof RFC3339DateFormat);
    assertNull(context.getInjectableValues());
    assertNull(context.getPropertyNamingStrategy());
    assertSame(factory, context.getJsonFactory());
  }

  /**
   * Test {@link JSON#setDateFormat(DateFormat)}.
   *
   * <p>Method under test: {@link JSON#setDateFormat(DateFormat)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void JSON.setDateFormat(DateFormat)"})
  public void testSetDateFormat() {
    // Arrange
    JSON json = new JSON();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd");

    // Act
    json.setDateFormat(dateFormat);

    // Assert
    ObjectMapper context = json.getContext(null);
    SerializationConfig serializationConfig = context.getSerializationConfig();
    assertEquals(2730172, serializationConfig.getSerializationFeatures());
    assertSame(dateFormat, context.getDateFormat());
    assertSame(dateFormat, context.getDeserializationConfig().getDateFormat());
    assertSame(dateFormat, serializationConfig.getDateFormat());
  }

  /**
   * Test {@link JSON#setDateFormat(DateFormat)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then {@link JSON} (default constructor) Context is {@code null} DateFormat is {@code
   *       null}.
   * </ul>
   *
   * <p>Method under test: {@link JSON#setDateFormat(DateFormat)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"void JSON.setDateFormat(DateFormat)"})
  public void testSetDateFormat_whenNull_thenJsonContextIsNullDateFormatIsNull() {
    // Arrange
    JSON json = new JSON();

    // Act
    json.setDateFormat(null);

    // Assert
    ObjectMapper context = json.getContext(null);
    assertNull(context.getDateFormat());
    assertNull(context.getDeserializationConfig().getDateFormat());
    SerializationConfig serializationConfig = context.getSerializationConfig();
    assertNull(serializationConfig.getDateFormat());
    assertEquals(2730428, serializationConfig.getSerializationFeatures());
  }
}
