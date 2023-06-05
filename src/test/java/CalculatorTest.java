import org.example.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void addTwoNumbers(int sum, int a, int b){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(sum, calculator.add(a, b));
    }
    private static Stream<Arguments> argumentsStream(){
        return Stream.of(
                Arguments.of(3,2,1),
                Arguments.of(6,3,3),
                Arguments.of(8,4,4)
        );
    }
}
