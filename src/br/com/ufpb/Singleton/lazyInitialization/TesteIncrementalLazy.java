package br.com.ufpb.Singleton.lazyInitialization;



public class TesteIncrementalLazy {
	public static void main(String[] args){
		for(int x = 0; x < 10; x++){
			
			System.out.println(IncrementalLazy.getInstance());
		}
	}
}
