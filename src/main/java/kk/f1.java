/**
 * объявление пакета
 */
package kk;
/**
 * Библиотеки необходимые для работы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Объявление публичного класса для создания зависимости между классами и выполнение вычислений 
 */
public class f1 implements ActionListener {
	/**
	 * ссылка на родительский класс
	 */
	private f2 parent;
	/**
	 * Переменные отвечающие за вычисление:
	 *k1-Вводимая максимальная мощность
	 *r1-Результат вычислений
	 */
	float k1;
	float result;
	float r1;
	/**
	 * Установление связи между родительским и дочерним классом
	 */
	f1(f2 parent){
        this.parent = parent;
    }
	/**
	 * Событие для кнопки "Рассчитать", для производственных помещений.
	 */
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.btnNewButton){
        	k1=Float.parseFloat((String) parent.TxtBox1.getValue());
			parent.label_3.setText(" Результат: "+ String.format("%.2f",result= sums.sums_rl(kl)+ " Ампер ");
        } 
	}
}