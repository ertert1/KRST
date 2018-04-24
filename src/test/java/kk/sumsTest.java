
package kk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class sumsTest {
	
	 sums testingClass;

	 @BeforeEach
   void setUp() {
        testingClass = new sums();
    }
	/**
	 * Создание тестовых методов.
	 */
	@Test
	void sums_r1() {
		float k1=330;
		 assertEquals(1.8f, sums.sums_rl(k1));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
	}
	/**
	 * Окончание создания класса для расчёта номинала в электрической цепи для жилых помещений.
	 */	
}
