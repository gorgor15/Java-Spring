//package ch07;
//
//public class MakeReport {
//	TestReport buffer = new TestReport();
//	
//	private String line = "================================\n";
//	private String title = "�̸�\t �ּ�\t\t ��ȭ��ȣ\n";
//	private void makeHeader() {
//		buffer.append(line);
//		buffer.append(title);
//		buffer.append(line);
//	}
//	
//	private void generatorBody() {
//		buffer.append("James\t");
//		buffer.append("Seoul Korea\t");
//		buffer.append("010-2222-3333\n");
//		
//		buffer.append("Tomas\t");
//		buffer.append("NewYork US\t");
//		buffer.append("010-7777-8888\n");
//	}
//	private void makeFooter() {
//		buffer.append(line);
//	}
//	
//	public String getReport() {
//		makeHeader();
//		generatorBody();
//		makeFooter();
//		return buffer.toString();
//	}
//}
