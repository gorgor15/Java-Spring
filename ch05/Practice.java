package ch05;

public class Practice {
	
		int height;
		int weight;
		String name;
		int age;
		String s; //����
	public Practice(int height,int weight,String s,int age,String name) {
		this.height=height;
		this.weight=weight;
		this.s=s;
		this.age=age;
		this.name=name;
			
	}
	
	public String showInfo() {
		return "Ű��"+height+"�̰� �����԰�"+weight+"ų����"+s+"�� �ֽ��ϴ�. �̸���"+name+"�̰� ���̴�"+age+"�� �Դϴ�.";
	}
}
