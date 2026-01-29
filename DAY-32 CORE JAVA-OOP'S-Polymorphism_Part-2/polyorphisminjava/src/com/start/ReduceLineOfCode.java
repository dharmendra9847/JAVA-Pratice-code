package com.start;

public class ReduceLineOfCode {

	public static void main(String[] args) {
		
		CommonForAll commonForAll = new CommonForAll();
		
		BMW bmw = new BMW();
//		commonForAll.test(bmw);
		commonForAll.test(null); //RUNTIME
		
		Swift swift = new Swift();
		commonForAll.test(swift);
		
		Alto alto = new Alto();
		commonForAll.test(alto);
		
		Thar thar = new Thar();
		commonForAll.test(thar);
		
		Curve curve = new Curve();
		commonForAll.test(curve);
	}

}
