package homeassignment.wk3;

public class Automation extends MultipleLangauge {

	@Override
	public void Java() {
		System.out.println("Java method from Interface 1");
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium method from Interface 2");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby - Abstract method from Abstract Class");
		
	}
	
public static void main(String[] args) {
	Automation atm = new Automation();
	System.out.println("/** Sample for Abstract class and Interface **/");
	atm.Java();
	atm.Selenium();
	atm.python();
	atm.ruby();
}

}
