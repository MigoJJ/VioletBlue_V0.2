// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;				
import je.panse.doro.exec.*;
import java.io.IOException;
import java.nio.file.Path;

public class Enter {
	//--- user directory definition--------------------------
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
	
    //--------------------------------------------------------
	public static void main(String[] args) throws IOException {
		CurrentDate.defineTime();
       System.out.println(currentUsersHomeDir);
// --- File Preparing
       CheckDeleteFile.main(wtf);
       ManageFile.deletefiler(wtf + "/chartplate");
       ManageFile.deletefiler(wtf + "/comment");
       CheckCreateFile.main(wtf);
       FirstPlate.main(null);
// --- File copy to chartplate
       
       
   }
//--------------------------------------------------------
}
