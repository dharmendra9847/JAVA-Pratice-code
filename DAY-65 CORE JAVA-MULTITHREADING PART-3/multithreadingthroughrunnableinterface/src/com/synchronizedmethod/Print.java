package com.synchronizedmethod;

public class Print implements Runnable{

	private Resource res;
	
	public Print(Resource res) {
		this.res = res;
	}
	
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		
		if(name.equals("Arjun")) {
			res.printer(name);
		}else {
			res.printer(name);
		}
	}

}
