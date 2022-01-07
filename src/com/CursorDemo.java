package com;

import java.util.LinkedList;
import java.util.ListIterator;

public class CursorDemo {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		
		l.add("delhi");
		l.add("mumbai");
		l.add("kerela");
		l.add("manali");
		l.add("pune");
		
		System.out.println(l);
		
		ListIterator list = l.listIterator();
		
		while(list.hasNext()) {
				
			
			String element = (String) list.next();
			
			if(element.equals("delhi")) {
				list.add("kashmir");
			}
			else if(element.equals("kerela")) {
				list.remove();
			}
			else if(element.equals("pune")) {
				list.set("nepal");
			}
			
			
			
		}
		System.out.println(l);
		
		while(list.hasPrevious())
		{
			String last = (String) list.previous();
			if(last.equals("nepal"))
			{
				list.set("china");
				int previousIndex = list.previousIndex();
				System.out.println(previousIndex);
				
			}
		}
		System.out.println(l);
		
		
	}

}
