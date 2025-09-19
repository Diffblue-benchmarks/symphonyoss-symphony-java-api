package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ApplicationDetailDiffblueTest {
  /**
   * Test {@link ApplicationDetail#addPermissionsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#addPermissionsItem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPermissionsItem(String)"})
  public void testAddPermissionsItem_givenApplicationDetail() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();

    // Act
    ApplicationDetail actualAddPermissionsItemResult =
        applicationDetail.addPermissionsItem("Permissions Item");

    // Assert
    assertSame(applicationDetail, actualAddPermissionsItemResult);
  }

  /**
   * Test {@link ApplicationDetail#addPermissionsItem(String)}.
   *
   * <ul>
   *   <li>Given {@link ApplicationDetail} (default constructor) permissions {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#addPermissionsItem(String)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({"ApplicationDetail ApplicationDetail.addPermissionsItem(String)"})
  public void testAddPermissionsItem_givenApplicationDetailPermissionsArrayList() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.permissions(new ArrayList<>());

    // Act
    ApplicationDetail actualAddPermissionsItemResult =
        applicationDetail.addPermissionsItem("Permissions Item");

    // Assert
    assertSame(applicationDetail, actualAddPermissionsItemResult);
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}, and {@link ApplicationDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApplicationDetail#equals(Object)}
   *   <li>{@link ApplicationDetail#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    ApplicationDetail applicationDetail2 = new ApplicationDetail();

    // Act and Assert
    assertEquals(applicationDetail, applicationDetail2);
    assertEquals(applicationDetail.hashCode(), applicationDetail2.hashCode());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}, and {@link ApplicationDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ApplicationDetail#equals(Object)}
   *   <li>{@link ApplicationDetail#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();

    // Act and Assert
    assertEquals(applicationDetail, applicationDetail);
    int expectedHashCodeResult = applicationDetail.hashCode();
    assertEquals(expectedHashCodeResult, applicationDetail.hashCode());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.applicationInfo(new ApplicationInfo());
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.iconUrl("https://example.org/example");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.description("The characteristics of someone or something");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.allowOrigins("Allow Origins");
    applicationDetail.addPermissionsItem("Permissions Item");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    ApplicationDetail applicationDetail = new ApplicationDetail();
    applicationDetail.cert("Cert");

    // Act and Assert
    assertNotEquals(applicationDetail, new ApplicationDetail());
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationDetail(), null);
  }

  /**
   * Test {@link ApplicationDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ApplicationDetail#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ApplicationDetail.equals(Object)",
    "int ApplicationDetail.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ApplicationDetail(), "Different type to ApplicationDetail");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ApplicationDetail}
   *   <li>{@link ApplicationDetail#allowOrigins(String)}
   *   <li>{@link ApplicationDetail#applicationInfo(ApplicationInfo)}
   *   <li>{@link ApplicationDetail#cert(String)}
   *   <li>{@link ApplicationDetail#description(String)}
   *   <li>{@link ApplicationDetail#iconUrl(String)}
   *   <li>{@link ApplicationDetail#permissions(List)}
   *   <li>{@link ApplicationDetail#setAllowOrigins(String)}
   *   <li>{@link ApplicationDetail#setApplicationInfo(ApplicationInfo)}
   *   <li>{@link ApplicationDetail#setCert(String)}
   *   <li>{@link ApplicationDetail#setDescription(String)}
   *   <li>{@link ApplicationDetail#setIconUrl(String)}
   *   <li>{@link ApplicationDetail#setPermissions(List)}
   *   <li>{@link ApplicationDetail#toString()}
   *   <li>{@link ApplicationDetail#getAllowOrigins()}
   *   <li>{@link ApplicationDetail#getApplicationInfo()}
   *   <li>{@link ApplicationDetail#getCert()}
   *   <li>{@link ApplicationDetail#getDescription()}
   *   <li>{@link ApplicationDetail#getIconUrl()}
   *   <li>{@link ApplicationDetail#getPermissions()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ApplicationDetail.<init>()",
    "ApplicationDetail ApplicationDetail.allowOrigins(String)",
    "ApplicationDetail ApplicationDetail.applicationInfo(ApplicationInfo)",
    "ApplicationDetail ApplicationDetail.cert(String)",
    "ApplicationDetail ApplicationDetail.description(String)",
    "String ApplicationDetail.getAllowOrigins()",
    "ApplicationInfo ApplicationDetail.getApplicationInfo()",
    "String ApplicationDetail.getCert()",
    "String ApplicationDetail.getDescription()",
    "String ApplicationDetail.getIconUrl()",
    "List ApplicationDetail.getPermissions()",
    "ApplicationDetail ApplicationDetail.iconUrl(String)",
    "ApplicationDetail ApplicationDetail.permissions(List)",
    "void ApplicationDetail.setAllowOrigins(String)",
    "void ApplicationDetail.setApplicationInfo(ApplicationInfo)",
    "void ApplicationDetail.setCert(String)",
    "void ApplicationDetail.setDescription(String)",
    "void ApplicationDetail.setIconUrl(String)",
    "void ApplicationDetail.setPermissions(List)",
    "String ApplicationDetail.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    ApplicationDetail actualApplicationDetail = new ApplicationDetail();
    ApplicationDetail actualAllowOriginsResult =
        actualApplicationDetail.allowOrigins("Allow Origins");
    ApplicationDetail actualApplicationInfoResult =
        actualApplicationDetail.applicationInfo(new ApplicationInfo());
    ApplicationDetail actualCertResult = actualApplicationDetail.cert("Cert");
    ApplicationDetail actualDescriptionResult =
        actualApplicationDetail.description("The characteristics of someone or something");
    ApplicationDetail actualIconUrlResult =
        actualApplicationDetail.iconUrl("https://example.org/example");
    ApplicationDetail actualPermissionsResult =
        actualApplicationDetail.permissions(new ArrayList<>());
    actualApplicationDetail.setAllowOrigins("Allow Origins");
    ApplicationInfo applicationInfo = new ApplicationInfo();
    actualApplicationDetail.setApplicationInfo(applicationInfo);
    actualApplicationDetail.setCert("Cert");
    actualApplicationDetail.setDescription("The characteristics of someone or something");
    actualApplicationDetail.setIconUrl("https://example.org/example");
    ArrayList<String> permissions = new ArrayList<>();
    actualApplicationDetail.setPermissions(permissions);
    String actualToStringResult = actualApplicationDetail.toString();
    String actualAllowOrigins = actualApplicationDetail.getAllowOrigins();
    ApplicationInfo actualApplicationInfo = actualApplicationDetail.getApplicationInfo();
    String actualCert = actualApplicationDetail.getCert();
    String actualDescription = actualApplicationDetail.getDescription();
    String actualIconUrl = actualApplicationDetail.getIconUrl();
    List<String> actualPermissions = actualApplicationDetail.getPermissions();

    // Assert
    assertEquals("Allow Origins", actualAllowOrigins);
    assertEquals("Cert", actualCert);
    assertEquals("The characteristics of someone or something", actualDescription);
    assertEquals(
        "class ApplicationDetail {\n"
            + "    applicationInfo: class ApplicationInfo {\n"
            + "        appId: null\n"
            + "        name: null\n"
            + "        appUrl: null\n"
            + "        domain: null\n"
            + "        publisher: null\n"
            + "    }\n"
            + "    iconUrl: https://example.org/example\n"
            + "    description: The characteristics of someone or something\n"
            + "    allowOrigins: Allow Origins\n"
            + "    permissions: []\n"
            + "    cert: Cert\n"
            + "}",
        actualToStringResult);
    assertEquals("https://example.org/example", actualIconUrl);
    assertTrue(actualPermissions.isEmpty());
    assertSame(permissions, actualPermissions);
    assertSame(actualApplicationDetail, actualAllowOriginsResult);
    assertSame(actualApplicationDetail, actualApplicationInfoResult);
    assertSame(actualApplicationDetail, actualCertResult);
    assertSame(actualApplicationDetail, actualDescriptionResult);
    assertSame(actualApplicationDetail, actualIconUrlResult);
    assertSame(actualApplicationDetail, actualPermissionsResult);
    assertSame(applicationInfo, actualApplicationInfo);
  }
}
