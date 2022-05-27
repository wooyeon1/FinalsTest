import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PianoMainGUI extends JFrame implements ActionListener {
	PianoMainGUI() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(1, 3));
		BorderLayout bl = new BorderLayout(10, 10);
		GridLayout note_layout = new GridLayout(7, 1, 10, 10);
		GridLayout check_layout = new GridLayout(7, 20, 10, 10);
//		BorderLayout check_layout = new BorderLayout(1, 7);

		JPanel northP, jp1_1, jp2, jp2_1, jp4, jp5;
		String note_str[] = { "도", "레", "미", "파", "솔", "라", "시" };
		String mi_str[] = { "Save", "Open", "Reset", "Logout" };
		JMenuItem mi[] = new JMenuItem[4];
		JButton note_button[] = new JButton[7];
		JCheckBox note_check[] = new JCheckBox[7];

		// 메뉴바
		JMenuBar menu = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		for (int i = 0; i < mi.length; i++) {
			mi[i] = new JMenuItem(mi_str[i]);
			mi[i].addActionListener(this);
			fileMenu.add(mi[i]);
		}
		menu.add(fileMenu);
		setJMenuBar(menu);

		// 메인 (버튼)
		northP = new JPanel();
		northP.setLayout(new BorderLayout(1, 2));

		jp1_1 = new JPanel();
		jp1_1.setLayout(note_layout);
		for (int i = 0; i < note_button.length; i++) {
			note_button[i] = new JButton(note_str[i]);
			note_button[i].setPreferredSize(new Dimension(200, 60));
			;
			note_button[i].addActionListener(this);
			jp1_1.add(note_button[i]);
		}
		northP.add(jp1_1, BorderLayout.WEST);

		// 메인 (체크박스)
		jp2 = new JPanel();
		jp2.setLayout(new BorderLayout(1, 20));
		jp2_1 = new JPanel();
		jp2_1.setLayout(check_layout);

//		for (int i = 0; i < 20; i++) {
//			for (int j = 0; j < 7; j++) {
//				note_check[i][j] = new JCheckBox(note_str[j]);
//				jp3.add(note_check[i][j]);
//			}
//		}
//		jp1.add(jp3, BorderLayout.CENTER);
//		for(int j = 0; j < 20; j++) {
//		}
		for (int i = 0; i < 7; i++) {
			note_check[i] = new JCheckBox(note_str[i]);
			jp2_1.add(note_check[i]);
		}
//		jp1_2.setLayout();
		jp2.add(jp1_1);
		northP.add(jp2, BorderLayout.CENTER);

		ct.add(northP, BorderLayout.NORTH);

		northP.setBackground(Color.blue); // 지우기
		jp1_1.setBackground(Color.cyan);
		jp2.setBackground(Color.pink);
		jp2_1.setBackground(Color.red);
//		jp3.setBackground(Color.GRAY);
		ct.setBackground(Color.MAGENTA); // 지우기

		// 기본설정
		setTitle("Piano");
		setSize(1280, 700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		// 메뉴바 이벤트
		if (action.equals("Save")) {
			JOptionPane.showMessageDialog(null, "Save Test");
		} else if (action == "Open") {
			JOptionPane.showMessageDialog(null, "Open Test");
		} else if (action == "Reset") {
			JOptionPane.showMessageDialog(null, "Reset Test");
		} else if (action == "Logout") {
			JOptionPane.showMessageDialog(null, "Logout Test");
		}

		// note버튼 이벤트
		if (action.equals("도")) {
			JOptionPane.showMessageDialog(null, "도 Test");
		} else if (action == "레") {
			JOptionPane.showMessageDialog(null, "레 Test");
		} else if (action == "미") {
			JOptionPane.showMessageDialog(null, "미 Test");
		} else if (action == "파") {
			JOptionPane.showMessageDialog(null, "파 Test");
		} else if (action == "솔") {
			JOptionPane.showMessageDialog(null, "솔 Test");
		} else if (action == "라") {
			JOptionPane.showMessageDialog(null, "라 Test");
		} else if (action == "시") {
			JOptionPane.showMessageDialog(null, "시 Test");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PianoMainGUI p = new PianoMainGUI();

	}
}
