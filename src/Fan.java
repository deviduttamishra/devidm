public class Fan implements Switch,Regulator {
	@Override
	public void switchOn() {
		System.out.println("Switch On the Fan");
	}
	@Override
	public void switchOff() {
		System.out.println("Switch Off the Fan");
	}
	@Override
	public void fast() {
		System.out.println("Fan moves Faster");
	}
	@Override
	public void slow() {
		System.out.println("fan moves Slower");
	}
	public static void main(String[] args) {
		Switch s=new Fan();
		s.switchOn();
		s.switchOff();
		
		Regulator r=new Fan();
		r.fast();
		r.slow();
		
		
	}

}
