package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class RoleDiffblueTest {
  /**
   * Test {@link Role#equals(Object)}, and {@link Role#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Role#equals(Object)}
   *   <li>{@link Role#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Role role = new Role();
    Role role2 = new Role();

    // Act and Assert
    assertEquals(role, role2);
    assertEquals(role.hashCode(), role2.hashCode());
  }

  /**
   * Test {@link Role#equals(Object)}, and {@link Role#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Role#equals(Object)}
   *   <li>{@link Role#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Role role = new Role();

    // Act and Assert
    assertEquals(role, role);
    int expectedHashCodeResult = role.hashCode();
    assertEquals(expectedHashCodeResult, role.hashCode());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), 1);
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Role role = new Role();
    role.id("42");

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Role role = new Role();
    role.name("Name");

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Role role = new Role();
    role.description("The characteristics of someone or something");

    // Act and Assert
    assertNotEquals(role, new Role());
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), null);
  }

  /**
   * Test {@link Role#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Role#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Role.equals(Object)", "int Role.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Role(), "Different type to Role");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link Role}
   *   <li>{@link Role#description(String)}
   *   <li>{@link Role#id(String)}
   *   <li>{@link Role#name(String)}
   *   <li>{@link Role#setDescription(String)}
   *   <li>{@link Role#setId(String)}
   *   <li>{@link Role#setName(String)}
   *   <li>{@link Role#toString()}
   *   <li>{@link Role#getDescription()}
   *   <li>{@link Role#getId()}
   *   <li>{@link Role#getName()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Role.<init>()",
    "Role Role.description(String)",
    "String Role.getDescription()",
    "String Role.getId()",
    "String Role.getName()",
    "Role Role.id(String)",
    "Role Role.name(String)",
    "void Role.setDescription(String)",
    "void Role.setId(String)",
    "void Role.setName(String)",
    "String Role.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    Role actualRole = new Role();
    Role actualDescriptionResult =
        actualRole.description("The characteristics of someone or something");
    Role actualIdResult = actualRole.id("42");
    Role actualNameResult = actualRole.name("Name");
    actualRole.setDescription("The characteristics of someone or something");
    actualRole.setId("42");
    actualRole.setName("Name");
    String actualToStringResult = actualRole.toString();
    String actualDescription = actualRole.getDescription();
    String actualId = actualRole.getId();

    // Assert
    assertEquals("42", actualId);
    assertEquals("Name", actualRole.getName());
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class Role {\n"
            + "    id: 42\n"
            + "    name: Name\n"
            + "    description: The characteristics of someone or something\n"
            + "}",
        actualToStringResult);
    assertSame(actualRole, actualDescriptionResult);
    assertSame(actualRole, actualIdResult);
    assertSame(actualRole, actualNameResult);
  }
}
