/**
 * ParameterizedWithValueSourceTest class
 *
 * @author David Kariuki
 * @apiNote - This test class contains parameterized test methods for the classes.OddEven.java class
 * @since 12/7/2022
 */

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedWithMethodSourceTest {

    /**
     * ParameterizedTest method to test for null in contents of the parameter provider method
     *
     * @param argument - String
     * @note This will n times based on the parameter provider
     */
    @ParameterizedTest
    @MethodSource("parameterProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    /**
     * Method name is the source to test
     *
     * @return Stream<String>
     */
    static Stream<String> parameterProvider() {
        return Stream.of("parameter1", "parameter2", "parameter3");
    }
}