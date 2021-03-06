package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(10);
		Scanner sc = new Scanner(System.in);
		System.out.println("\tElements\nadd\nget\nremove");
		String input;
		for(int i = 0;; ++i) {
			
			input = sc.nextLine();
			if(input.equals("exit") == true) break;
			switch(input) {
			case "add" : list.add(sc.nextInt());sc.nextLine();break;
			case "get" : try{
						int x = list.get(sc.nextInt());
						System.out.println("Fetched ELEMENT:"+x);
						sc.nextLine(); 
						
						}
						catch(Exception e) {
							System.out.println("No such element");
							
						}	
						break;
			case "remove": try{
						int x = list.remove(sc.nextInt());
						System.out.println("Removed ELEMENT:"+x);
						sc.nextLine(); 
				
						}
						catch(Exception e) {
							System.out.println("No such element");
					
						}	
						break;
			default: System.out.println("INVALID");break;
			}
		}
		
		System.out.println("Printing Elements:");
		
		for(int i : list) System.out.println(i);
		sc.close();
	}

}
