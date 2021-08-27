import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeTest {
    @Test
    public void isStartWithInclusiveWithKampooShoulBetrue () {
        //Arrange
        Range range = new Range("[1,5]");

        //Act
        String actualResult = range.isStartWithInclusive();

        //Assert
        assertEquals(actualResult, "[");
    }
}