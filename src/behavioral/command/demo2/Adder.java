package behavioral.command.demo2;

import java.math.BigInteger;

public class Adder {
	private int num=0;
	public int add(int value) {
		num+=value;
		return num;
	}
	public int sub(int value) {
		num-=value;
		return num;		
	}
	
	public int mul(int value) {
		num*=value;
		return num;
	}
	
	public int div(int value) {
		if(value==0) {
			return 0x3f3f3f3f;
		}
		num/=value;
		return num;
	
	}
}
