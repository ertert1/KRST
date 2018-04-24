/**
 * объ¤вление пакета
 */
package kk;
/**
 * »мпорт библиотек классов, необходимых дл¤ работы.
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * ќбъ¤вление публичного класса, наследующего члены класса JFrame 
 */
public class main extends JFrame {
	/**
	 * ћетод, отвечающий за запуск фрейма
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
				} catch (Exception e) {
					/**
					 * ¬ывод сообщений в случае ошибки дл¤ дальнейшей отладки
					 */
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * ќбъ¤вление метода, в котором объ¤вл¤ютс¤ элементы экранной формы, ее событи¤
	 */
	public main() {
		/**
		 * —оздание главной панели
		 */
		TitledBorder titledBorder = BorderFactory.createTitledBorder(null, "¬ыберите необходимый вам калькул¤тор", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.PLAIN,15), Color.black);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(titledBorder);
		JPanel Panel1 = new JPanel();
		Panel1.setBounds(50,15,500,650);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(5,15,650,650);
		/**
		 * «адание шрифта и размера надписей дл¤ кнопок
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 25);
		/**
		 * —оздание кнопки
		 */
		JButton btnNewButton1 = new JButton("ƒл¤ жилых помещений");
		JButton btnNewButton2 = new JButton("ƒл¤ производственных помещений");
		btnNewButton1.setFont(font);
		btnNewButton1.setBounds(1, 10, 620, 100);
		btnNewButton1.setFocusable(isDisplayable());
		btnNewButton2.setFont(font);
		btnNewButton2.setBounds(1,110, 620, 100);
		btnNewButton2.setFocusable(isDisplayable());
		/**
		 * ƒобавление элементов на панель дл¤ кнопки
		 */
		Panel2.add(btnNewButton1);
		Panel2.add(btnNewButton2);
		/**
		 * ƒобавление элементов на главную панель
		 */
		contentPane.add(Panel2);
		contentPane.add(Panel1);
		/**
		 * ”казание размера, расположени¤, названи¤ экранной формы, добавление на нее главной панели
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("–асчет номинала предохранителей в электрической цепи");
		setContentPane(contentPane);
		setBounds(100, 100, 650, 280);	
		/**
		 * —обытие дл¤ кнопки "ƒл¤ жилых помещений". 
		 */
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("ƒл¤ жилых помещений")) {
					f2 calc = new f2();
				    }
			}
		});
		/**
		 * —обытие дл¤ кнопки "ƒл¤ производственных помещений". 
		 */
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("ƒл¤ производственных помещений")) {
					l2 calc = new l2();
				    }
			}
		});
	}
}