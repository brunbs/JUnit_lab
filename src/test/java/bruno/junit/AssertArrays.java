package bruno.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrays {

    @Test
    void validateArrays() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {0, 10, 20, 30, 40};


        Assertions.assertNotEquals(firstArray, secondArray);

        int[] thirdArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(firstArray, thirdArray);

    }


}
