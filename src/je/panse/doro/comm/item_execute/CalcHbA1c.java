package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.Key_Iwbb;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Itemcategory;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcHbA1c {
	public void main(String skeys) throws Exception{ 
		int Glucose;
		double Fbspp2;
		double HbA1c;
    	String FP = "FBS";
 
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input FBS/PP2   Glucose  HBA1c(%)   : ");
		        Fbspp2 = input.nextDouble();
		        Glucose = input.nextInt();
		        HbA1c = input.nextDouble();
//      input.close();
		        if (Fbspp2 == 0) {FP = "FBS";}
		        else {FP = ("PP"+ Fbspp2);}
		        
		    String Gluresult = ("\t" + FP + "  [ " + Glucose +  " ] mg/dl" + "\tHbA1c [ " + HbA1c + " ] %");

			double IFCC = ((HbA1c-2.152)/0.09148);
			String s = String.format("%.0f", IFCC);
			System.out.println("\t\tHbA1c-IFCC : [ " + s + " ] mmol/mol");
			
			double eAGg = ((28.7*HbA1c)-46.7);
			String sg = String.format("%.0f", eAGg);
			System.out.println("\t\tHbA1c-eAG : [ " + sg + " ] mg/dl");
			
			double eAGm = (0.0555*eAGg);
			//mg/dL in mmol/L, conversion factor: 1 mg/dL = 0.0555 mmol/L 
			String sm = String.format("%.1f", eAGm);
			System.out.println("\t\tHbA1c-eAG : [ " + sm + " ] mmol/l");
		    
		    File_cdrw_proc fcp1 = new File_cdrw_proc();
	    		fcp1.writeliner(Enter.wts + "/7LAB", Gluresult  + "\n");
		    	fcp1.writeliner(Enter.wts + "/7LAB", "\t\tHbA1c-IFCC : [ " + s + " ] mmol/mol");
		    	fcp1.writeliner(Enter.wts + "/7LAB", "\t\tHbA1c-eAG : [ " + sg + " ] mg/dl");
		    	fcp1.writeliner(Enter.wts + "/7LAB", "\t\tHbA1c-eAG : [ " + sm + " ] mmol/l");

		    	if (skeys == "Itemcategorykey") {
				fcp1.readfiler(Enter.wt + "/singlebeam/ItemMenu");
				Itemcategory.main(null);
			}
			else {
				fcp1.readfiler(Enter.wt + "/singlebeam/subnewmenu/7LAB_List");
				New7LAB nc1 = new New7LAB();
				nc1.main(null);
			}
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
//---------------------------------------------------		
}