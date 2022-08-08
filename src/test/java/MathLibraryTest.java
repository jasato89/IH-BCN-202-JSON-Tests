import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathLibraryTest {

    int[] array1;
    int[] array2;
    MathLibrary mathLibrary = new MathLibrary();
    MathLibrary mathLibrary1;


    @BeforeEach
    void setUp() {
        mathLibrary1 = new MathLibrary(10);
    }

    @AfterEach
    void tearDown() {

    }



    @Test
    @DisplayName("Given a positive number, multiplies it by the saved multiplier")
    void multiply_positiveNumbers_multiply() {
        assertEquals(30, mathLibrary1.multiply(3));
        mathLibrary1.setMultiplier(20);
        assertEquals(60, mathLibrary1.multiply(3));
    }

    @Test
    @DisplayName("Given a negative number, multiplies it by the saved multiplier")
    void multiply_negativeNumbers_multiply() {
        assertEquals(-30, mathLibrary1.multiply(-3));

    }




    @Test //Anotación de test
    @DisplayName("Dado un array con solo positivos, nos devuelva una suma correcta")
    void sum_positiveNumbers_sum() {
        array1 = new int[]{1, 2, 3 ,4 ,5};
        array2 = new int[]{25, 35, 45, 74};
        int number = mathLibrary.sum(array1);
        assertEquals(15, number);
        assertEquals(179, mathLibrary.sum(array2));

    }
    @Test
    @DisplayName("Dado un array con solo numeros negativos, nos devuelva una suma correcta")
    void sum_negativeNumbers_sum() {
        array1 = new int[]{-1, -2, -3, -4, -5};
        int number = mathLibrary.sum(array1);
        assertEquals(-15, number);

    }
    @Test
    @DisplayName("Dado un array con numeros negativos y positivos nos devuleva una suma correcta")
    void sum_mixedNumbers_sum() {
        array1 = new int[]{-1, 2, -3, 4, -5};
        assertEquals(-3, mathLibrary.sum(array1));
    }

    @Test
    @DisplayName("Dado un array vacío, nos devuelva cero")
    void sum_emptyArray_zero() {
        array1 = new int[10];
        assertEquals(0, mathLibrary.sum(array1));
    }


}
