package hack.utils;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class CONS {

//	// Sort order
//	public static enum SORT_ORDER {
//			ASC, DEC,
//			CREATED_AT,
//	};

	
	

	// Table => show_history
//	public static String tname_show_history = "show_history";
	
//	public static enum MoveMode {
//		// TIListAdapter.java
//		ON, OFF,
//		
//	}//public static enum MoveMode

	public static class DB {

		public static String dPath_Data_Root = "data";
		
		public static String dPath_Log = dPath_Data_Root + "/log";
		
		public final static String fname_Log = "log.txt";
		
		public final static String fname_Log_Trunk = "log";
		
		public final static String fname_Log_ext = ".txt";
		
		public static final long logFile_MaxSize = 40000;
		
	}//public static class DB

	public static class Admin {
		
		////////////////////////////////

		// commons

		////////////////////////////////
		public static final String dirString_UpperDir	= "..";
		
		public static final float DLG_WIDTH_RATIO = 0.8f;
		
		public static final String dName_backup = "cm5_backup";
		
		public static final String char_Space_Half	= " ";
		
		public static final String char_Space_Whole	= "　";
		
		// millseconds; used in Methods_dlg.dlg_ShowMessage_Duration
		public static final int dflt_MessageDialog_Length	= 3000;
		
		// X out of 100
		// Usage => e.g. width = screen_width * 100 / ratio_Dialog_to_Screen_W
		public static final int ratio_Dialog_to_Screen_W = 70;

		public static String[] special_Chars = new String[]{
			
			"()", "[]",
			"（）", "「」", "『』", "〈〉", "【】", "｛｝",
			
		};
		
		////////////////////////////////

		// MainActv.java

		////////////////////////////////
		public static String fname_List = "list.txt";
		
		////////////////////////////////

		// Utilities

		public static final String format_Date = "yyyy/MM/dd HH:mm:ss.SSS";
//		public static final String format_Date = "yyyy/MM/dd hh:mm:ss.SSS";
//		public static final String date_Format = "yyyy/MM/dd hh:mm:ss.SSS";
		
		public static final String format_Clock = "%02d:%02d";
		
	}//public static class Admin

	public static class Paths {
		////////////////////////////////

		// MainActv.java

		////////////////////////////////
		
		public static String dpath_Storage_Sdcard = "/mnt/sdcard-ext";
		
		public static String dpath_Storage_Camera = "/mnt/sdcard-ext/dcim/Camera";
		
		public static String dpath_Storage_Internal = "/mnt/sdcard";
		
		public static String  dname_Base = "ifm11";
		
	}
	
	public static class Remote {
		
		public static enum FtpType {
			
			IMAGE, DB_FILE, IMAGE_MULTIPLE,
			
		}
		
		public static enum HttpType {
			
			IMAGE,
			
		}
		
		////////////////////////////////

		// ftp

		////////////////////////////////
		public static String server_Name = "ftp.benfranklin.chips.jp";
		
		public static String uname = "chips.jp-benfranklin";
		
		public static String passwd = "9x9jh4";
		
		public static String remote_Root_Image = "./cake_apps/images/ifm11";

		public static String remote_Root_DBFile = "./android_app_data/IFM11";
		
		// initialize res:int in Task_FTP.doInBackground()
		public static int initial_IntValue = -100;
		
		////////////////////////////////

		// status code

		////////////////////////////////
		public static final int status_220		= 220;

		public static final int status_Created	= 201;
		
		public static final int status_NOT_CREATED	= -201;
		
		public static final int status_OK		= 200;
		
		public static class Http {
			
			public static final String url_Post_ImageData =
						"http://benfranklin.chips.jp/cake_apps/Cake_IFM11/images/add";
			
		}
		
	}

	
	public static class 
	Enums {
		
		public static enum SortType {
			
			FileName, POSITION, CREATED_AT, WORD, USED,
			
		}

		// Sort order
		public static enum SortOrder {
			
				ASC, 
//				DEC, 
				DESC,
				
		};

		public static enum MoveMode {
			// TIListAdapter.java
			ON, OFF,
			
		}//public static enum MoveMode

		public static enum ListType {
			
			STANDARD, SEARCH, HISTORY, ANY,
			
		}
		
	}//Enums

}//public class CONS
