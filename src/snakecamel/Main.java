package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		System.out.println(scu.snakeToCamelcase("abc"));
		System.out.println(scu.camelToSnakecase("Abc"));
		System.out.println(scu.capitalize("a"));
		System.out.println(scu.uncapitalize("A"));
		// TODO 自動生成されたメソッド・スタブ

	}

}
