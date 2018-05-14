package testpkg;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelUtilTest {

	@Test
	public void snakeToCamelcaseでスネークケースの文字列をキャメルケースに変換します(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual,is(expected));
		}
	@Test
	public void camelToSnakecaseでキャメルケースの文字列をスネークケースに変換します(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual,is(expected));
		}
	@Test
	public void capitalizeで大文字に変換します(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual,is(expected));
		}
	@Test
	public void uncapitalizeで小文字に変換します(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual,is(expected));
		}





}
