/**
 * Объявление пакета, в котором находится класс.
 */
package kk;
/**
 * Добавление библиотеки для тестирования.
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * Добавление библиотеки для тестирования.
 */
import org.junit.jupiter.api.Test;
/**
 * Добавление библиотек пря проверки результата теста.
 */
import org.junit.jupiter.api.BeforeEach;
/**
 * Добавление классов выполнения расчёта напряжения для жилых помещений.
 */
/**
 * Создание класса для тестирования номинала напряжения в электрической цепи.
 */
class test1 {
	
	 f1 testingClass;

	 @BeforeEach
   void setUp() {
        testingClass = new f1();
    }
	/**
	 * Создание тестовых методов.
	 */
	@Test
	void f1() {

		 assertEquals(2.8, sums.sums_rl((float)330));
	   /**
		* Окончание теста расчёта номинала в электрической цепи для жилых помещений.
		*/
	}
	/**
	 * Окончание создания класса для расчёта номинала в электрической цепи для жилых помещений.
	 */	
}