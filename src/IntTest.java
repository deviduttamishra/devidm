
public class IntTest implements Int1,Int2 {
	@Override
	public void work() {
		System.out.println("Work");
	}
	public static void main(String[] args) {
		Int1 i1=new IntTest();
		i1.work();
		
		Int2 i2=new IntTest();
		i2.work();
	}

}
