package com.demo.patterns.state;

public class ClientTestMain {
	public static void main(String[] args) {
		Work emergencyProjects = new Work();

		emergencyProjects.setHour(9);
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(10);
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(12);
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(13);
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(14);
		emergencyProjects.writeProgram();
		
		
		emergencyProjects.setHour(17);
		
		emergencyProjects.setFinish(false);
		
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(19);
		emergencyProjects.writeProgram();
		
		emergencyProjects.setHour(22);
		emergencyProjects.writeProgram();
		
	}
}
