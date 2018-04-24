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
public class f1 implements ActionListener {
	/**
	 * ссылка на родительский класс
	 */
	private f2 parent;
	/**
	 * ѕеременные отвечающие за вычисление:
	 *k1-¬водима¤ максимальна¤ мощность
	 *r1-–езультат вычислений
	 */
	float k1;
	float result;
	float r1;
	/**
	 * ”становление св¤зи между родительским и дочерним классом
	 */
	f1(f2 parent){
        this.parent = parent;
    }
	/**
	 * —обытие дл¤ кнопки "–ассчитать", дл¤ производственных помещений.
	 */
	public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == parent.btnNewButton){
        	k1=Float.parseFloat((String) parent.TxtBox1.getValue());
			parent.label_3.setText(" –езультат: "+ String.format("%.2f",result= sums.sums_rl(kl)+ " јмпер ");
        } 
	}
}