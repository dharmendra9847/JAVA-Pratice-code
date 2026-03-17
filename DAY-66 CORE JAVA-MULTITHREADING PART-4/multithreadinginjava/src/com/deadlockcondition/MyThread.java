
package com.deadlockcondition;

public class MyThread extends Thread{
	
	private String res1 = "r1";
	private String res2 = "r2";
	private String res3 = "r3";                    
	
	@Override
	public void run() {
	
		String name = currentThread().getName();
		
		if(name.equals("Ram")) {
			ramAccess(name);
		}else {
			sitaAccess(name);
		}
	}

	
	private void ramAccess(String name) {
		
		synchronized (res1) {
			System.out.println(name + " using " + res1);
			
			synchronized (res2) {
				System.out.println(name + " using " + res2);
				
				synchronized (res3) {
					System.out.println(name + " using " + res3);
				}
			}
		}
	}
	
	//No-Dead Lock Condition
//	private void sitaAccess(String name) {
//		
//		synchronized (res1) {
//			System.out.println(name + " using " + res1);
//			
//			synchronized (res2) {
//				System.out.println(name + " using " + res2);
//				
//				synchronized (res3) {
//					System.out.println(name + " using " + res3);
//				}
//			}
//		}	
//	}	
	//Dead Lock Condition
	private void sitaAccess(String name) {
		
		synchronized (res3) {
			System.out.println(name + " using " + res3);
			
			synchronized (res2) {
				System.out.println(name + " using " + res2);
				
				synchronized (res1) {
					System.out.println(name + " using " + res1);
				}
			}
		}	
	}	
}




