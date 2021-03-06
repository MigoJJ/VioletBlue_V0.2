package je.panse.doro.hito.newsub;
	
import java.io.IOException;									
import java.util.Scanner;
import je.panse.doro.aeternum.aete.DiseaseCode;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.Menu_list;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.main.Enter;  

public class New3CC {
	static String a, b, c, f, g;
	File_cdrw_proc 	fcp = new File_cdrw_proc();
	File_cw_chart 	dn1 = new File_cw_chart();
	Newcategory 	cc1 = new Newcategory(); 
	New3PI      	cc2 = new New3PI(); 
	
	public void main(String[] args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println(">>>>>> Enter chief complain :>>>");  	a = s.nextLine();
			
			if (a.startsWith(":")) {
				String aa = a.substring(1, a.length());
				DiseaseCode e = new DiseaseCode();  
				System.out.println(e.code_select(aa));
				a = e.code_select(aa);
			}
			System.out.println(">>>----- Enter duration:>>>");	    	b = s.nextLine();
			Integer bint = Integer.valueOf(b);
			if (bint == 99 | bint >= 1964) {
				simplecc(bint);
				dn1.deuxnine();
				Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu"); 
				cc1.main(null); 	
			}
			System.out.println(">>>----- Enter year/month/day:>>>");	c = s.nextLine();
				yymmdd(c);
			System.out.println("\n>>>----- Enter... state of health E/G/F/P...>>>");
	   		f = s.nextLine().trim();
	   		if (f != null && !f.isEmpty()) {
	   			egfp(f);
	   		}
			System.out.println("\n>>>----- Present Illness : >>>");	g = s.nextLine().trim();
           if (g != null && !g.isEmpty()) {
           cc2.main(null);
            }
			//			s.close();
			dn1.deuxnine();
			Menu_list.main(Enter.wt + "/singlebeam/ChartPopUpMenu");
			cc1.main(null);
		}catch (IOException e) {
		e.printStackTrace();
		}
	}
	//------------------------------------------------
	void yymmdd(String ymd) throws IOException {
		String chartline;
		switch(ymd) {
			case "y": case "ㅛ":  c = " year-ago";			    break;
			case "m": case "ㅡ":  c = " month-ago";			    break;
			case "w": case "ㅈ":  c = " week-ago";			    break; 
			case "d": case "ㅇ":  c = " day-ago";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
		chartline = "\n    " + a + " (onset " + b + c + ")\n";
		fcp.writeliner(Enter.wts + "/3CC", chartline);
		}
	//------------------------------------------------
	void egfp(String state) throws IOException {
		String chartline1;
		switch(state) {
			case "e": case "ㄷ":  f = "-- Excellent";		    break;
			case "g": case "ㅎ":  f = "-- Good";			    break;
			case "f": case "ㄹ":  f = "-- Fair";			    break;  
			case "p": case "ㅔ":  f = "-- Poor";			    break;  
			default :   c = " uncertain ... please check  !!";
		}
//		chartline1 = "\tGeneral state :  " + f + "  (no any significant status )";
		chartline1 = "\tGeneral state :  " + f + "  ";
		fcp.writeliner(Enter.wts + "/3CC", chartline1);
	}
	//------------------------------------------------
	void simplecc(int bint) throws IOException {
		if (bint == 99) {
			String chartline4 = ("\t" + a) ;
			fcp.writeliner(Enter.wts + "/3CC", chartline4);
			fcp.writeliner(Enter.wts + "/8ASS", chartline4);
		}
		else if (bint >= 1900) {
			String chartline3 = ( "\t" + a + "  " + bint + " Dx");
			fcp.writeliner(Enter.wts + "/3CC", chartline3);
			fcp.writeliner(Enter.wts + "/8ASS", chartline3);
		}
		else {
		}
	}
//------------------------------------------------
}