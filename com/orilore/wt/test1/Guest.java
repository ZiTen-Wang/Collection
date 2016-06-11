package com.orilore.wt.test1;

import java.util.*;
import static java.lang.System.out;

public class Guest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List names =new ArrayList();
        collectNameTo(names);
        out.println("访客名单:");
        printUpperCase(names);
	}
        static void collectNameTo(List names){
        	Scanner s = new Scanner(System.in);
        	boolean flag = true;
        	while(flag){
        	out.println("访客名单:");
        	String name = s.nextLine();
        	if(name.equals("quit")){
        		break;
        	}
        	names.add(name);
        	}
        	}
        static void printUpperCase(List names){
        	for(int i = 0;i<names.size();i++){
        		String name = (String)names.get(i);
        		out.println(name.toUpperCase());
        	}
        }
        }

