package je.panse.doro.exec;

import java.io.IOException;				
import java.util.Scanner;
import je.panse.doro.comm.ManageFile;
import je.panse.doro.exec.input.NewPatientInput;
import je.panse.doro.main.Enter;

public class StartForm {
	public static void main(String args []) throws IOException {
		
		
   			System.out.println("/home/migowj/GDS/git/violetBlue0306/src/je/panse/doro/text/StartMenuList");	
		    ManageFile.readfiler(Enter.wt + "/StartMenuList");
   			
   			try (Scanner d_code = new Scanner(System.in)) {
				System.out.println("Enter selected code number ...   : ");
				String n_code = d_code.nextLine();  // Read user input
				System.out.println("disease code ... is: " + n_code);  // Output user input
				
			switch (n_code) {
						  case "1" : NewPatientInput.main(n_code);  	break;
		//				  case "2" : SOAPInput.main(n_code);  	break;
		//				  case "3" : SOAPInput.main(n_code);  	break;
		//				  case "4" : SOAPInput.main(n_code);  	break;
					}
				}
// --------------------------------------------------------
    }
}