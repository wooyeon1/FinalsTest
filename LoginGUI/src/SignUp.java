import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {// ȸ������ȭ��
	public SignUp() {
		JPanel p = new JPanel();
		Label l1 = new Label("�̸�");
		Label l2 = new Label("���̵�");
		Label l3 = new Label("�н�����");
		Label l4 = new Label("�ּ�");
		Label l5 = new Label("�߰�����");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		TextField t5 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);		
		JButton j1 = new JButton("����");
		JButton j2 = new JButton("���");
		add(j1);
		add(j2);
		l1.setBounds(40, 10, 40, 40);
		l2.setBounds(40, 50, 40, 40);
		l3.setBounds(40, 90, 60, 40);
		l4.setBounds(40, 130, 40, 40);
		l5.setBounds(40, 170, 60, 40);
		t1.setBounds(120, 10, 200, 30);
		t2.setBounds(120, 50, 200, 30);
		t3.setBounds(120, 90, 200, 30);
		t4.setBounds(120, 130, 280, 30);
		t5.setBounds(120, 180, 280, 120);
		j1.setBounds(125, 330, 80, 30);
		j2.setBounds(240, 330, 80, 30);
		add(p);
		setSize(500, 500);
		setTitle("ȸ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {// ȸ������ ������ ����
				try {
					BufferedWriter bos = new BufferedWriter(new FileWriter("ȸ�����.txt", true));
					bos.write(t1.getText() + "/");
					bos.write(t2.getText() + "/");
					bos.write(t3.getText() + "/");
					bos.write(t4.getText() + "/");
					bos.write(t5.getText() + "\r\n");
					bos.close();
					JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�!!");
					dispose();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "ȸ�����Կ� �����Ͽ����ϴ�.");
				}
			}
		});
	}
	private void add(String string) {
		// TODO Auto-generated method stub
		
	}
}
