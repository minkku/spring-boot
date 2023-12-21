
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitTest {
    @DisplayName("1+2는 3이다") // name of the test
    @Test // method of test
    public void junitTest() {
        int a = 1;
        int b = 2;
        int sum = 3;

        // Check if result same
        Assertions.assertEquals(a + b, sum);
    }

//    @DisplayName("1+2는 4이다")
//    @Test
//    public void junitFailedTest() {
//        int a = 1;
//        int b = 2;
//        int sum = 4;
//
//        Assertions.assertEquals(a + b, sum);
//    }

    //Junit의 테스트 값이 하나라도 틀리면 전체가 틀린것으로 보여준다.
}
