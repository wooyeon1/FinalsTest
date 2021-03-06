import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Login extends JFrame {// 로그인화면
	Image img = null;

	public Login() {
		JPanel p = new JPanel();
		p.setLayout(null);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\LoginGUI\\123.jpg"));
		add(label);
		Label t1 = new Label("안녕하세요.");
		add(t1);
		Label t2 = new Label("본 작곡 프로그램은 회원이여야만 사용 가능합니다.");
		add(t2);
		Label t3 = new Label("만약 회원이 아니시라면 회원가입을 해주세요 !");
		add(t3);
		Label t4 = new Label("ID입력 후 로그인 버튼을 클릭하세요.");
		add(t4);
		Label b2 = new Label("아이디:");
		add(b2);
		Label b3 = new Label("비밀번호:");
		add(b3);
		TextField b4 = new TextField();
		add(b4);
		TextField b5 = new TextField();
		add(b5);
		b5.setEchoChar('*');// 암호화
		JButton b6 = new JButton("로그인");
		add(b6);
		JButton b7 = new JButton("회원가입");
		add(b7);

		label.setBounds(0, 5, 350, 255);
		t1.setBounds(350, 5, 70, 40);
		t2.setBounds(350, 35, 280, 40);
		t3.setBounds(350, 65, 250, 40);
		t4.setBounds(350, 200, 250, 40);
		b2.setBounds(40, 265, 40, 40);
		b3.setBounds(40, 305, 60, 40);
		b4.setBounds(150, 265, 200, 30);
		b5.setBounds(150, 305, 200, 30);
		b6.setBounds(380, 265, 80, 30);
		b7.setBounds(380, 305, 90, 30);
		add(p);
		setSize(700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("로그인 화면 ");
		setVisible(true);
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// 회원가입창으로 이동
				// TODO Auto-generated method stub
				SignUp f2 = new SignUp();
			}
		});
		;
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {// 로그인 할때
				// TODO Auto-generated method stub
				try {
					String s;
					String[] array;
					BufferedReader bos = new BufferedReader(new FileReader("회원명단.txt"));
					while ((s = bos.readLine()) != null) {
						array = s.split("/");
						if (b4.getText().equals(array[1]) && b5.getText().equals(array[2])) {
							JOptionPane.showMessageDialog(null, "로그인이 되었습니다!!");
							LoginCheck f3 = new LoginCheck();
						} else {
							JOptionPane.showMessageDialog(null, "로그인이 실패하였습니다.");
						}
					}
					bos.close();
					dispose();
				} catch (IOException E10) {
					E10.printStackTrace();
				}
			}
		});
	}
}
