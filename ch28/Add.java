package ch28;

@FunctionalInterface
public interface Add {
	// 두개를 선언하면 AddTest에서는 무엇을 구현하는것인지 모르기떄문에 에러가 뜬다.
	int add(int x,int y);
//	int sub(int x,int y);
}
