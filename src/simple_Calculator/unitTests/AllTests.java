package simple_Calculator.unitTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@SuiteClasses({ PowerOfTest.class, AdditionTest.class, SubtractionTest.class, MultiplicationTest.class, SquareTest.class, DecoderTests.class, RootTest.class, DivisionTest.class  })

public class AllTests {

}
