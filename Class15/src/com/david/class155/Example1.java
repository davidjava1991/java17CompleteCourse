package com.david.class155;

public class Example1 {
	public static void main(String[] args) {
		ProcessHandle currentProcess = ProcessHandle.current();     
        System.out.println("Process Id: "+currentProcess.pid());    
        System.out.println("Direct children: "+ currentProcess.children()); 
        System.out.println("Class name: "+currentProcess.getClass());      
        System.out.println("All processes: "+ProcessHandle.allProcesses());  
        System.out.println("Process info: "+currentProcess.info());      
        System.out.println("Is process alive: "+currentProcess.isAlive());   
        System.out.println("Process's parent "+currentProcess.parent());
	}
}
