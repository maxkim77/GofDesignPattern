package BuilderPattern;

public class ComputerFactory {
	private BluePrint print;

	public void setBlueprint(BluePrint print) {
		// TODO Auto-generated method stub
		this.print = print;

	}
	
	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	public Computer getComputer() {
		return print.getComputer();
	}

}
