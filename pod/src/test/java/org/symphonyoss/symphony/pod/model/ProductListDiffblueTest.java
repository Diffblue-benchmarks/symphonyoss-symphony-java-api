package org.symphonyoss.symphony.pod.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.Test;

public class ProductListDiffblueTest {
  /**
   * Test {@link ProductList#equals(Object)}, and {@link ProductList#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ProductList#equals(Object)}
   *   <li>{@link ProductList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ProductList.equals(Object)", "int ProductList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ProductList productList = new ProductList();
    ProductList productList2 = new ProductList();

    // Act and Assert
    assertEquals(productList, productList2);
    int expectedHashCodeResult = productList.hashCode();
    assertEquals(expectedHashCodeResult, productList2.hashCode());
  }

  /**
   * Test {@link ProductList#equals(Object)}, and {@link ProductList#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link ProductList#equals(Object)}
   *   <li>{@link ProductList#hashCode()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"boolean ProductList.equals(Object)", "int ProductList.hashCode()"})
  public void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ProductList productList = new ProductList();

    // Act and Assert
    assertEquals(productList, productList);
    int expectedHashCodeResult = productList.hashCode();
    assertEquals(expectedHashCodeResult, productList.hashCode());
  }

  /**
   * Test {@link ProductList#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ProductList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ProductList.equals(Object)", "int ProductList.hashCode()"})
  public void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ProductList productList = new ProductList();
    productList.add(new Product());

    // Act and Assert
    assertNotEquals(productList, new ProductList());
  }

  /**
   * Test {@link ProductList#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ProductList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ProductList.equals(Object)", "int ProductList.hashCode()"})
  public void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProductList(), null);
  }

  /**
   * Test {@link ProductList#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link ProductList#equals(Object)}
   */
  @Test
  @MethodsUnderTest({"boolean ProductList.equals(Object)", "int ProductList.hashCode()"})
  public void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ProductList(), "Different type to ProductList");
  }

  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ProductList}
   *   <li>{@link ProductList#toString()}
   * </ul>
   */
  @Test
  @MethodsUnderTest({"void ProductList.<init>()", "java.lang.String ProductList.toString()"})
  public void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("class ProductList {\n    []\n}", (new ProductList()).toString());
  }
}
