package hack.main;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg;
		msg = String.format(Locale.JAPAN, "[%s : %d] main()", Thread
				.currentThread().getStackTrace()[1].getFileName(), Thread
				.currentThread().getStackTrace()[1].getLineNumber());

		System.out.println(msg);
		
		//ref http://stackoverflow.com/questions/3371879/ip-address-to-hostname-in-java
		InetAddress addr;
		
		for(int i = 0; i < 10; i ++) {
			try {
				
				String ipaddress;// = "104.71.168.153";
				ipaddress = String.format(Locale.JAPAN, "104.000.000.%d", 153 + i);
//				ipaddress = String.format(Locale.JAPAN, "104.71.168.%d", 153 + i);
//				ipaddress = String.format(Locale.JAPAN, "104.71.168.%d", 153);
				
				System.out.println("ipaddress => " + ipaddress);
				
				addr = InetAddress.getByName(ipaddress);
	//			addr = InetAddress.getByName("192.168.190.62");
				
				String host = addr.getHostName();
				
				System.out.println(host);
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for(int i = 0; i < 10; i ++)
		
	}

}
