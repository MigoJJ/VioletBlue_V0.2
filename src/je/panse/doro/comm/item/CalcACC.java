package je.panse.doro.comm.item;

import java.io.BufferedWriter;	
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import je.panse.doro.hito.newsub.New8ACC;
import je.panse.doro.main.Enter;

public class CalcACC {
    public static void main(String args[]) throws IOException{
        Scanner scanner=new Scanner(System.in);
//        System.out.println("Insert disease code : ");
        while (true) {
            System.out.println("Insert disease code : ");
            String question = scanner.nextLine();
        	code_select(question);
                if(question.equals("quit")){
	            	System.out.println("Inserted code finished  !!!.: ");
	            	New8ACC ob6 = new New8ACC(); 
					ob6.main(null); 	
	            	break;
	            }
//            System.out.println("Insert answer code:");
//            String answer = scanner.nextLine();
//	            
//            	if(answer.equals("quit")){
//	                break;
//	            }
        }
    	System.out.println("Success");
    	scanner.close();
    }
//------------------------------------------------     
	static void code_select(String dcode) throws IOException {
		switch (dcode) {
			case "d" : accessInsert("  #  DM without complications	");break;
					case "dr" : accessInsert("  #  DM with Retinopathy ");break;
					case "dn" : accessInsert("  #  DM with Nephropathy");break;
					case "dp" : accessInsert("  #  DM with Peripheral Neuropathy");break;
					case "da" : accessInsert("  #  DM with Autonomic Neuropathy");break;
					
			case "t" : accessInsert("  #  Hypertension ")	;break;
			
			case "c" : accessInsert("  #  Hypercholesterolemia ");break;
			case "ctg" : accessInsert("  #  HyperTriGlyceridemia ");break;

	
			case "te" : accessInsert("  #  Hyperthyroidism : Graves' disease")	;break;
				case "to" : accessInsert("  #  Hypothyroidism : Hashimoto's thyroiditis")	;break;
				case "ts" : accessInsert("  #  Subacute Thyroiditis ")		;break;
				case "tn" : accessInsert("  #  Thyroid nodule ")		;break;
				case "tsg" : accessInsert("  #  Simple Goiter")		;break;
				case "nti" : accessInsert("  #  Non-Thyroidal illness ");break;


				case "tep" : accessInsert("  #  Hyperthyroidism with Pregnancy ")		;break;
				case "top" : accessInsert("  #  Hypothyroidism with Pregnancy ")		;break;
		
			case "ospo" : accessInsert("  #  Osteoporosis ");break;
			case "ospe" : accessInsert("  #  Osteopenia ");break;
			
			case "ap" : accessInsert("  #  Angina Pectoris");break;
			case "af" : accessInsert("  #  Atrial Fibrillation ");break;
			// ----------------------------------------------진료 보조
			case "oc" : accessInsert("  #  Cholecystectomy d/t GB stone	")		;break;
			case "oa" : accessInsert("  #  Appendectomy ")		;break;
			case "oh" : accessInsert("  #  TAH : Total Abdominal Hysterectomy ")		;break;	
			case "pb" : accessInsert("  #  BPH ");break;
				
			case "hf" : accessInsert("  #  Fatty Liver ")		;break;
			case "hc" : accessInsert("  #  Hepatic Cyst ")		;break;
			case "hn" : accessInsert("  #  Hepatic Nodule ")		;break;
			case "hb" : accessInsert("  #  Hepatis B Infection   HBsAg(+)")		;break;
			
			case "rc" : accessInsert("  #  Renal Cyst ")		;break;
			case "rn" : accessInsert("  #  Renal Nodule ")	;break;
			
			case "bc" : accessInsert("  #  Breast Cyst ")		;break;
			case "bn" : accessInsert("  #  Breast Nodule ")	;break;
			// ----------------------------------------------이찬주원장님
			case "pa" : accessInsert("  #  Bronchial Asthma ")	;break;
			case "pc" : accessInsert("  #  Chronic Cough ")	;break;
			case "pp" : accessInsert("  #  Pneumonia ")	;break;
			case "pt" : accessInsert("  #  Pulmonary Tuberculosis ")	;break;
		}
		}
//------------------------------------------------ 
	   static void writecoding(String writec) throws IOException {
			File file_acc = new File(Enter.wts + "/8ACC");
			System.out.println(file_acc);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_acc,true));
				try {
					bufferedWriter.write(writec);
				} catch (IOException e) {
					e.printStackTrace();
			}
			bufferedWriter.newLine();
			bufferedWriter.flush();
			bufferedWriter.close();
}
//------------------------------------------------
	   static void accessInsert(String diaease_description) throws IOException {
				try {
					System.out.println(diaease_description);
					writecoding(diaease_description);
				} catch (IOException e) {
					e.printStackTrace();
			}
}
//------------------------------------------------
}
