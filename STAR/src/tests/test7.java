/**
 * ���������� ������, � ������� ��������� �����.
 */
package tests;
/**
 * ���������� ���������� ��� ������������.
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * ���������� ���������� ��� ������������.
 */
import org.junit.jupiter.api.Test;
/**
 * ���������� ��������� ��� �������� ���������� �����.
 */
import junit.framework.Assert;
/**
 * ���������� ������� ���������� ������� ���������� ��� ����� ���������.
 */
import kk.f1;
/**
 * �������� ������ ��� ������������ �������� ���������� � ������������� ����.
 */
public class test7 {
	/**
	 * �������� �������� �������.
	 */
	@Test
	void test7() {
		/**
		 * ������������ �������� 143.
		 * ���������� ���� 220.
		 * ����������� ����������� ��� ������� 1.2.
		 */
		  float k1=(float)143,r1=(float) ((k1*1.2)/220);
		  /**
		   * result1-�������� �� ������� sums, ������������� � ������ f1.
		   */
			float result1=f1.sums(k1,r1);
			/**
			 * tests -�������� ��������.
			 */
			float tests= (float)0.78;
			/**
			   * �������� ��������, tests � result1 ������������ �� ���������.
			   */
	    Assert.assertEquals(tests, result1);
	   /**
		* ��������� ����� ������� �������� � ������������� ���� ��� ����� ���������.
		*/
	}
	/**
	 * ��������� �������� ������ ��� ������� �������� � ������������� ���� ��� ����� ���������.
	 */	
}
