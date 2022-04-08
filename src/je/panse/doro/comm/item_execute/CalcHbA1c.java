package je.panse.doro.comm.item_execute;

import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.hito.newsub.New7LAB;
import je.panse.doro.main.Enter;
														
public class CalcHbA1c {
	public void main(String args) throws Exception { 
		int Glucose;
		int Fbspp2;
		double HbA1c;
    	String FP = "FBS";
		String  Gluresult;
 
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.print("========= Input FBS/PP2   Glucose  HBA1c(%)   : ");
		        Fbspp2 = input.nextInt();
		        Glucose = input.nextInt();
		        HbA1c = input.nextDouble();
//      input.close();
		        if (Fbspp2 == 0) {FP = "FBS";}
		        else {FP = ("PP"+ Fbspp2);}
		        Gluresult = ("    " + FP + "  [ " + Glucose +  " ] mg/dl"	+ "     HbA1c [ " + HbA1c + " ] %");
			File_cdrw_proc fcp1 = new File_cdrw_proc();
				fcp1.writeliner(Enter.wts + "/7LAB", Gluresult);
			New7LAB.main("");
			
		} catch (NumberFormatException e) {
		e.printStackTrace();
		}
	}
//---------------------------------------------------		
}