package je.panse.doro.hito.newsub;

import java.io.IOException;			
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item_exec.CalcACC;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class New8ACC {
	public static void main(String args) throws Exception { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/subnewmenu/8ACC_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;
			while (true) {
				System.out.println("Enter selected code number ...   : ");
				select_code = Integer.valueOf(new_code.nextLine().trim());
	
				switch (select_code) {
					case 1 : CalcACC ob3 = new CalcACC();	 ob3.main(null);break;

			   		case 9 : NineDeux.deuxnine(); 
						Newcategory.main(null); break;
			   		case 99 : NineDeux.unnine(); 
						StartForm.main(null); break;
			   		case 999 :
			   			Key_Iwbb st999 = new Key_Iwbb(); 
			   			st999.Key_Iwbb_Page(select_code); break;
					default :System.out.println(" uncertain ... please check  !!");
				}
				StartForm.main(null);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}
