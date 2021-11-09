package ch05;

public class Practice {
	
		int height;
		int weight;
		String name;
		int age;
		String s; //성별
	public Practice(int height,int weight,String s,int age,String name) {
		this.height=height;
		this.weight=weight;
		this.s=s;
		this.age=age;
		this.name=name;
			
	}
	
	public String showInfo() {
		return "키가"+height+"이고 몸무게가"+weight+"킬로인"+s+"이 있습니다. 이름은"+name+"이고 나이는"+age+"세 입니다.";
	}
}
