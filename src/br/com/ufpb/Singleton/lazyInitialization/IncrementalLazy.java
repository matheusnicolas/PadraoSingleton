package br.com.ufpb.Singleton.lazyInitialization;


public class IncrementalLazy {

	private static IncrementalLazy uniqueInstance;
	private static int count = 0;
	private int numero;
	
	private IncrementalLazy(){
		numero = ++count;
	}
	public static IncrementalLazy getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new IncrementalLazy();
		}
		return uniqueInstance;
	}
	public String toString(){
		return "Incremental " + numero;
	}
}
