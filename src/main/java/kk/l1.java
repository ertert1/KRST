/**
 * объ¤вление пакета
 */
package kk;
/**
 * Ѕиблиотеки необходимые дл¤ работы
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * ќбъ¤вление публичного класса дл¤ создани¤ зависимости между классами и выполнение вычислений 
 */
public class l1 implements ActionListener {
	/**
	 * ссылка на родительский класс
	 */
	l2 parent; 
	/**
	 * ѕеременные отвечающие за вычисление:
	 *k1-¬водима¤ максимальна¤ мощность
	 *r1-–езультат вычислений
	 */
	float k1;
	float result;
	/**
	 * ”становление св¤зи между родительским и дочерним классом
	 */
	l1(l2 parent){
        this.parent = parent;
    }
	/**
	 * —обытие дл¤ кнопки "–ассчитать", дл¤ производственных помещений.
	 */
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.btnNewButton){
        	Float k1=Float.parseFloat((parent.TxtBox1.getText( )));
			parent.label_3.setText(" –езультат: "+ String.format("%.2f",result= sums.sums_rl1(k1)+ " јмпер "));
        }  
	}
}