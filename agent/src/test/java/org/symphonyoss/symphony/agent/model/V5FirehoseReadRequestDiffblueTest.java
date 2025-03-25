package org.symphonyoss.symphony.agent.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class V5FirehoseReadRequestDiffblueTest {
  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}, and {@link V5FirehoseReadRequest#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V5FirehoseReadRequest#equals(Object)}
   *   <li>{@link V5FirehoseReadRequest#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    V5FirehoseReadRequest v5FirehoseReadRequest = new V5FirehoseReadRequest();
    V5FirehoseReadRequest v5FirehoseReadRequest2 = new V5FirehoseReadRequest();

    // Act and Assert
    assertEquals(v5FirehoseReadRequest, v5FirehoseReadRequest2);
    int expectedHashCodeResult = v5FirehoseReadRequest.hashCode();
    assertEquals(expectedHashCodeResult, v5FirehoseReadRequest2.hashCode());
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}, and {@link V5FirehoseReadRequest#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link V5FirehoseReadRequest#equals(Object)}
   *   <li>{@link V5FirehoseReadRequest#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    V5FirehoseReadRequest v5FirehoseReadRequest = new V5FirehoseReadRequest();

    // Act and Assert
    assertEquals(v5FirehoseReadRequest, v5FirehoseReadRequest);
    int expectedHashCodeResult = v5FirehoseReadRequest.hashCode();
    assertEquals(expectedHashCodeResult, v5FirehoseReadRequest.hashCode());
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5FirehoseReadRequest(), 1);
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    V5FirehoseReadRequest v5FirehoseReadRequest = new V5FirehoseReadRequest();
    v5FirehoseReadRequest.ackId("42");

    // Act and Assert
    assertNotEquals(v5FirehoseReadRequest, new V5FirehoseReadRequest());
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    V5FirehoseReadRequest v5FirehoseReadRequest = new V5FirehoseReadRequest();
    v5FirehoseReadRequest.maxMsgs(3);

    // Act and Assert
    assertNotEquals(v5FirehoseReadRequest, new V5FirehoseReadRequest());
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    V5FirehoseReadRequest v5FirehoseReadRequest = new V5FirehoseReadRequest();
    v5FirehoseReadRequest.timeout(10);

    // Act and Assert
    assertNotEquals(v5FirehoseReadRequest, new V5FirehoseReadRequest());
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5FirehoseReadRequest(), null);
  }

  /**
   * Test {@link V5FirehoseReadRequest#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link V5FirehoseReadRequest#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean V5FirehoseReadRequest.equals(Object)", "int V5FirehoseReadRequest.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new V5FirehoseReadRequest(), "Different type to V5FirehoseReadRequest");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link V5FirehoseReadRequest}
   *   <li>{@link V5FirehoseReadRequest#ackId(String)}
   *   <li>{@link V5FirehoseReadRequest#maxMsgs(Integer)}
   *   <li>{@link V5FirehoseReadRequest#setAckId(String)}
   *   <li>{@link V5FirehoseReadRequest#setMaxMsgs(Integer)}
   *   <li>{@link V5FirehoseReadRequest#setTimeout(Integer)}
   *   <li>{@link V5FirehoseReadRequest#timeout(Integer)}
   *   <li>{@link V5FirehoseReadRequest#toString()}
   *   <li>{@link V5FirehoseReadRequest#getAckId()}
   *   <li>{@link V5FirehoseReadRequest#getMaxMsgs()}
   *   <li>{@link V5FirehoseReadRequest#getTimeout()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void V5FirehoseReadRequest.<init>()", "V5FirehoseReadRequest V5FirehoseReadRequest.ackId(String)",
      "String V5FirehoseReadRequest.getAckId()", "Integer V5FirehoseReadRequest.getMaxMsgs()",
      "Integer V5FirehoseReadRequest.getTimeout()", "V5FirehoseReadRequest V5FirehoseReadRequest.maxMsgs(Integer)",
      "void V5FirehoseReadRequest.setAckId(String)", "void V5FirehoseReadRequest.setMaxMsgs(Integer)",
      "void V5FirehoseReadRequest.setTimeout(Integer)", "V5FirehoseReadRequest V5FirehoseReadRequest.timeout(Integer)",
      "String V5FirehoseReadRequest.toString()"})
  public void testGettersAndSetters() {
    // Arrange and Act
    V5FirehoseReadRequest actualV5FirehoseReadRequest = new V5FirehoseReadRequest();
    V5FirehoseReadRequest actualAckIdResult = actualV5FirehoseReadRequest.ackId("42");
    V5FirehoseReadRequest actualMaxMsgsResult = actualV5FirehoseReadRequest.maxMsgs(3);
    actualV5FirehoseReadRequest.setAckId("42");
    actualV5FirehoseReadRequest.setMaxMsgs(3);
    actualV5FirehoseReadRequest.setTimeout(10);
    V5FirehoseReadRequest actualTimeoutResult = actualV5FirehoseReadRequest.timeout(10);
    String actualToStringResult = actualV5FirehoseReadRequest.toString();
    String actualAckId = actualV5FirehoseReadRequest.getAckId();
    Integer actualMaxMsgs = actualV5FirehoseReadRequest.getMaxMsgs();

    // Assert
    assertEquals("42", actualAckId);
    assertEquals("class V5FirehoseReadRequest {\n    ackId: 42\n    maxMsgs: 3\n    timeout: 10\n}",
        actualToStringResult);
    assertEquals(10, actualV5FirehoseReadRequest.getTimeout().intValue());
    assertEquals(3, actualMaxMsgs.intValue());
    assertSame(actualV5FirehoseReadRequest, actualAckIdResult);
    assertSame(actualV5FirehoseReadRequest, actualMaxMsgsResult);
    assertSame(actualV5FirehoseReadRequest, actualTimeoutResult);
  }
}
