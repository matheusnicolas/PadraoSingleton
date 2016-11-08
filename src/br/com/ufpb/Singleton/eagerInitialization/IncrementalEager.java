package br.com.ufpb.Singleton.eagerInitialization;

public class IncrementalEager {

	private static IncrementalEager uniqueInstance = new IncrementalEager();
	private static int count = 0;
	private int numero;
	
	private IncrementalEager(){
		numero = ++count;
	}
	public static IncrementalEager getInstance(){
		return uniqueInstance;
	}
	public String toString(){
		return "Incremental " + numero;
	}
	
}
