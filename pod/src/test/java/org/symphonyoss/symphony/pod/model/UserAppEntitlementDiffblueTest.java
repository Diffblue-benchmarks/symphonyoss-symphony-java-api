package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class UserAppEntitlementDiffblueTest {
  /**
   * Test {@link UserAppEntitlement#equals(Object)}, and {@link UserAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlement#equals(Object)}
   *   <li>{@link UserAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    UserAppEntitlement userAppEntitlement2 = new UserAppEntitlement();

    // Act and Assert
    assertEquals(userAppEntitlement, userAppEntitlement2);
    assertEquals(userAppEntitlement.hashCode(), userAppEntitlement2.hashCode());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}, and {@link UserAppEntitlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UserAppEntitlement#equals(Object)}
   *   <li>{@link UserAppEntitlement#hashCode()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();

    // Act and Assert
    assertEquals(userAppEntitlement, userAppEntitlement);
    int expectedHashCodeResult = userAppEntitlement.hashCode();
    assertEquals(expectedHashCodeResult, userAppEntitlement.hashCode());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlement(), 1);
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.appId("42");

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.appName("App Name");

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.listed(true);

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.install(true);

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    UserAppEntitlement userAppEntitlement = new UserAppEntitlement();
    userAppEntitlement.products(new ProductList());

    // Act and Assert
    assertNotEquals(userAppEntitlement, new UserAppEntitlement());
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlement(), null);
  }

  /**
   * Test {@link UserAppEntitlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UserAppEntitlement#equals(Object)}
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UserAppEntitlement.equals(Object)",
    "int UserAppEntitlement.hashCode()"
  })
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new UserAppEntitlement(), "Different type to UserAppEntitlement");
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link UserAppEntitlement}
   *   <li>{@link UserAppEntitlement#appId(String)}
   *   <li>{@link UserAppEntitlement#appName(String)}
   *   <li>{@link UserAppEntitlement#install(Boolean)}
   *   <li>{@link UserAppEntitlement#listed(Boolean)}
   *   <li>{@link UserAppEntitlement#products(ProductList)}
   *   <li>{@link UserAppEntitlement#setAppId(String)}
   *   <li>{@link UserAppEntitlement#setAppName(String)}
   *   <li>{@link UserAppEntitlement#setInstall(Boolean)}
   *   <li>{@link UserAppEntitlement#setListed(Boolean)}
   *   <li>{@link UserAppEntitlement#setProducts(ProductList)}
   *   <li>{@link UserAppEntitlement#toString()}
   *   <li>{@link UserAppEntitlement#getAppId()}
   *   <li>{@link UserAppEntitlement#getAppName()}
   *   <li>{@link UserAppEntitlement#getInstall()}
   *   <li>{@link UserAppEntitlement#getListed()}
   *   <li>{@link UserAppEntitlement#getProducts()}
   * </ul>
   */
  @Test
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UserAppEntitlement.<init>()",
    "UserAppEntitlement UserAppEntitlement.appId(String)",
    "UserAppEntitlement UserAppEntitlement.appName(String)",
    "String UserAppEntitlement.getAppId()",
    "String UserAppEntitlement.getAppName()",
    "Boolean UserAppEntitlement.getInstall()",
    "Boolean UserAppEntitlement.getListed()",
    "ProductList UserAppEntitlement.getProducts()",
    "UserAppEntitlement UserAppEntitlement.install(Boolean)",
    "UserAppEntitlement UserAppEntitlement.listed(Boolean)",
    "UserAppEntitlement UserAppEntitlement.products(ProductList)",
    "void UserAppEntitlement.setAppId(String)",
    "void UserAppEntitlement.setAppName(String)",
    "void UserAppEntitlement.setInstall(Boolean)",
    "void UserAppEntitlement.setListed(Boolean)",
    "void UserAppEntitlement.setProducts(ProductList)",
    "String UserAppEntitlement.toString()"
  })
  public void testGettersAndSetters() {
    // Arrange and Act
    UserAppEntitlement actualUserAppEntitlement = new UserAppEntitlement();
    UserAppEntitlement actualAppIdResult = actualUserAppEntitlement.appId("42");
    UserAppEntitlement actualAppNameResult = actualUserAppEntitlement.appName("App Name");
    UserAppEntitlement actualInstallResult = actualUserAppEntitlement.install(true);
    UserAppEntitlement actualListedResult = actualUserAppEntitlement.listed(true);
    UserAppEntitlement actualProductsResult = actualUserAppEntitlement.products(new ProductList());
    actualUserAppEntitlement.setAppId("42");
    actualUserAppEntitlement.setAppName("App Name");
    actualUserAppEntitlement.setInstall(true);
    actualUserAppEntitlement.setListed(true);
    ProductList products = new ProductList();
    actualUserAppEntitlement.setProducts(products);
    String actualToStringResult = actualUserAppEntitlement.toString();
    String actualAppId = actualUserAppEntitlement.getAppId();
    String actualAppName = actualUserAppEntitlement.getAppName();
    Boolean actualInstall = actualUserAppEntitlement.getInstall();
    Boolean actualListed = actualUserAppEntitlement.getListed();

    // Assert
    assertEquals("42", actualAppId);
    assertEquals("App Name", actualAppName);
    assertEquals(
        "class UserAppEntitlement {\n"
            + "    appId: 42\n"
            + "    appName: App Name\n"
            + "    listed: true\n"
            + "    install: true\n"
            + "    products: class ProductList {\n"
            + "        []\n"
            + "    }\n"
            + "}",
        actualToStringResult);
    assertTrue(actualInstall);
    assertTrue(actualListed);
    assertSame(products, actualUserAppEntitlement.getProducts());
    assertSame(actualUserAppEntitlement, actualAppIdResult);
    assertSame(actualUserAppEntitlement, actualAppNameResult);
    assertSame(actualUserAppEntitlement, actualInstallResult);
    assertSame(actualUserAppEntitlement, actualListedResult);
    assertSame(actualUserAppEntitlement, actualProductsResult);
  }
}
