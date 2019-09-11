import KaprekarsNumber.ExerciseKeprekarsConstant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {

    @Test
    void exercisKeprekarsConstantTest() {
        ExerciseKeprekarsConstant ex = new ExerciseKeprekarsConstant();
        int a = 3524;
        int a3 = 7000;


        int a1 = 8000;
        assertAll(
                () -> assertEquals(6, ex.returnKeprearsNumber2(a1)),
                () -> assertEquals(3, ex.returnKeprearsNumber2(a)),
                () -> assertEquals(4, ex.returnKeprearsNumber2(a3)));

    }
}
