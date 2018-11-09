package practice14.common;

public class JavaCourse implements Course{

	//getter
	public String getCourseName() {
		return "【Eラーニング】Java";
	}

	String[] courseUnit = {"制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
	public String[] getCourseUnit() {
		return courseUnit;
	}


}