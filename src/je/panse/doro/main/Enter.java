// Jae Joon Koh M.D.
package je.panse.doro.main;
import je.panse.doro.comm.*;
import je.panse.doro.exec.StartForm;
import java.io.IOException;

public class Enter {
	// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir + "/src/je/panse/doro");

	public static String wt    = (wd + "/text");
	public static String wtf    = (wd + "/text/form");
	// ------------------------------------------------------file preparing
	public static void main(String[] args) throws IOException {
       System.out.println(currentUsersHomeDir);
		CurrentDate.defineTime();
       System.out.println(currentUsersHomeDir);

		ManageFile.deletefiler(Enter.wtf + "/ChartPlate");
		ManageFile.deletefiler(Enter.wtf + "/Comment");
		ManageFile.checkfiler(Enter.wtf + "/ChartPlate");
		ManageFile.checkfiler(Enter.wtf + "/Comment");
		
<<<<<<< HEAD
       FirstPlatePrepare.main(null);
//       ManageFile.ucopyfiler(wtf);
// ------------------------------------------------------GDStm Program starting
    StartForm.main(null);
    // CategoryList.main(null);

	}
// --------------------------------------------------------
}

=======
       PlatePrepFirst.main(null);
// ------------------------------------------------------GDStm Program starting
       StartForm.main(null);
// --------------------------------------------------------
    }
}
>>>>>>> refs/remotes/origin/feature20220305
