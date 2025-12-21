package codingPracticedec19;

public class StringReplace {

	
	public static void main(String[] args) {
		String sen="selinumAS 1234@@@@!@@ ";
		String sen1=sen.replace('s', 'f').replace('m', 'g');
		String sen2=sen.replaceAll("\\s+", "[]");
		String sen3=sen.replaceAll("[a-zA-Z]", "d");
		String sen4=sen.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(sen4);
	}
}
