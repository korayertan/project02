package firstPackage;

public class firstClass {
	
	public static void main(String args[]) {
		System.out.println("first commit from local master branch");
		System.out.println("second commit from local master branch");
		System.out.println("third commit from local master branch");
		System.out.println("first commit from remote master branch");
<<<<<<< HEAD
		
		
		System.out.println("Here is a merge conflict I create from local master");
=======
		System.out.println("Second commit from remote master branch");
		System.out.println("Third commit from remote master branch");
		System.out.println("Here is the conflict we have from remote master branch");

>>>>>>> refs/remotes/origin/master
	}
}