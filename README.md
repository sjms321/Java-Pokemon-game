# Java
# 포켓몬 문제

```java
package day08.ch02_homework;

import javax.swing.JOptionPane;

public class Homework {
	public static void main(String[] args) {
		String menu = "1. 포켓몬 추가 \n"
					+ "2. 포켓몬 레벨업 \n"
					+ "3. 포켓몬 정보 보기 \n"
					+ "0. 종료"; 
		
		Pokemon p = null;
		
		loop:while (true) {
			String select = JOptionPane.showInputDialog(menu);
			switch(select) {
			case "1":
				p = new Pokemon();
				p.name = JOptionPane.showInputDialog("새 포켓몬 이름"); 
				p.level = (int)(Math.random() * 100) + 1;
				p.hp = p.level * (Math.random() < .2 ? 100:200);
				JOptionPane.showMessageDialog(null, "포켓몬 생성 완료!");
				break;
			case "2":
				if (p == null) {
					JOptionPane.showMessageDialog(null, "포켓몬을 등록하지 않았습니다.");
					continue loop; 
				}
				p.level++;
				JOptionPane.showMessageDialog(null, "레벨업 완료! 현재 " + p.name + "의 레벨 : " + p.level);
				break;
			case "3":
				if (p == null) {
					JOptionPane.showMessageDialog(null, "포켓몬을 등록하지 않았습니다.");
					continue loop; 
				}
				JOptionPane.showMessageDialog(null, "이름 : " + p.name + "\n레벨 : " +  p.level + "\n체력 : " + p.hp);
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break loop; // 혹은 return; 
			}
		}
	}
}
```

![_](https://user-images.githubusercontent.com/67422547/88557481-38b6cd80-d065-11ea-894e-bec8d546730f.png)

실행시 첫 메뉴창

![포켓몬 문제 6f61a7582abe441eb38ebaf397f34b20](https://user-images.githubusercontent.com/67422547/88557453-2dfc3880-d065-11ea-8e16-8959e47a128e.png)

![Untitled](https://user-images.githubusercontent.com/67422547/88557534-49ffda00-d065-11ea-92dd-2746459ba650.png)

포켓몬을 추가 하지 않은 채로 2,3번을 누를시 발생 되는 문구와 해당 코드부분.
