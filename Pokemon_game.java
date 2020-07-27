package day08.ch02_homework;

import javax.swing.JOptionPane;

public class Homework {
	public static void main(String[] args) {
		String menu = "1. ���ϸ� �߰� \n"
					+ "2. ���ϸ� ������ \n"
					+ "3. ���ϸ� ���� ���� \n"
					+ "0. ����"; 
		
		Pokemon p = null;
		
		loop:while (true) {
			String select = JOptionPane.showInputDialog(menu);
			switch(select) {
			case "1":
				p = new Pokemon();
				p.name = JOptionPane.showInputDialog("�� ���ϸ� �̸�"); 
				p.level = (int)(Math.random() * 100) + 1;
				p.hp = p.level * (Math.random() < .2 ? 100:200);
				JOptionPane.showMessageDialog(null, "���ϸ� ���� �Ϸ�!");
				break;
			case "2":
				if (p == null) {
					JOptionPane.showMessageDialog(null, "���ϸ��� ������� �ʾҽ��ϴ�.");
					continue loop; 
				}
				p.level++;
				JOptionPane.showMessageDialog(null, "������ �Ϸ�! ���� " + p.name + "�� ���� : " + p.level);
				break;
			case "3":
				if (p == null) {
					JOptionPane.showMessageDialog(null, "���ϸ��� ������� �ʾҽ��ϴ�.");
					continue loop; 
				}
				JOptionPane.showMessageDialog(null, "�̸� : " + p.name + "\n���� : " +  p.level + "\nü�� : " + p.hp);
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				break loop; 
			}
		}
	}
}
