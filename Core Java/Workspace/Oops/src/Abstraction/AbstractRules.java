package Abstraction;

public class AbstractRules {

	public static void main(String[] args) {
		SoftwareDevelopment sw = new SoftwareDevelopment();
		CivilDevelopment civil = new CivilDevelopment();
		
		printProjectDetails(civil);
	}
	
	public static void printProjectDetails(Project project) {
		project.compnayName();
		project.designDocumentation();
		project.development();
		project.testing();
		project.delivery();
	}
}

abstract class Project
{
	public void compnayName() {
		System.out.println("Compnay : Abc.pvt.ltd");
	}
	public abstract void designDocumentation();
	public abstract void development();
	public abstract void testing();
	public abstract void delivery();
}

class SoftwareDevelopment extends Project {
	public void designDocumentation() {
		System.out.println("Requ Documents, Dsign Doc. such as UML etc..");
	}
	
	public void development() {
		System.out.println("Development in Java Language..");
	}
	
	public void testing() {
		System.out.println("Test the project Automated Testting");
	}
	
	public void delivery() {
		System.out.println("Deploy the project fo user implementation");
	}
}


class CivilDevelopment extends Project {
	public void designDocumentation() {
		System.out.println("Requ Documents, Blueprint of the design");
	}
	
	public void development() {
		System.out.println("Building for the project");
	}
	
	public void testing() {
		System.out.println("Test the Project");
	}
	
	public void delivery() {
		System.out.println("Handover it to a customer");
	}
}