package hack.main;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang.StringUtils;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg;
		msg = String.format(Locale.JAPAN, "[%s : %d] main()", Thread
				.currentThread().getStackTrace()[1].getFileName(), Thread
				.currentThread().getStackTrace()[1].getLineNumber());

		System.out.println(msg);
		
		/*
		 * get list
		 */
////		String ipaddress_label = "172.217.26.%d";
//		String ipaddress_label = "200.000.000.%d";
//		int wildcard_value = 153;
//		int numOfItems = 10;
//		
//		get_DomainNames(ipaddress_label, wildcard_value, numOfItems);

		/*
		 * convert: ipaddress ---> to shrtened one
		 * e.g. 200.000.000.153 ----> 200.0.0.153
		 */
		String adr_orig = "200.003.000.153";
		String adr_shortened = get_ShortenedIPAddress(adr_orig);

//		String msg;
		msg = String.format(Locale.JAPAN, "[%s : %d] original address => %s / new => %s", Thread
				.currentThread().getStackTrace()[1].getFileName(), Thread
				.currentThread().getStackTrace()[1].getLineNumber(), 
				adr_orig, adr_shortened);

		System.out.println(msg);
		
		
	}

	private static String 
	get_ShortenedIPAddress(String adr_original) {
		// TODO Auto-generated method stub

		// split
		String[] tokens = adr_original.split("\\.");
		
//		String msg;
//		msg = String.format(Locale.JAPAN, "[%s : %d] tokens.len => %d", Thread
//				.currentThread().getStackTrace()[1].getFileName(), Thread
//				.currentThread().getStackTrace()[1].getLineNumber(), tokens.length);
//
//		System.out.println(msg);
		
		// shorten each token
		List<String> listOfTokens = new ArrayList<String>();
		
		int len = tokens.length;
		
		for (int i = 0; i < len; i++) {
			
			String token = tokens[i];

			// convert
			int num = Integer.parseInt(token);
			
//			String msg;
//			msg = String.format(Locale.JAPAN, "[%s : %d] token => '%s' / num => '%d'", Thread
//					.currentThread().getStackTrace()[1].getFileName(), Thread
//					.currentThread().getStackTrace()[1].getLineNumber(), token, num);
//
//			System.out.println(msg);
			
			// back to string again
			String token_new = String.valueOf(num);
			
			// add to the list
			listOfTokens.add(token_new);
			
		}//for (int i = 0; i < tokens; i++)
		
		// build a new ipaddress string
		int lenOfTokens = listOfTokens.size();
		
		String[] tokens_new = new String[lenOfTokens];
		
		for (int i = 0; i < lenOfTokens; i++) {

			tokens_new[i] = listOfTokens.get(i);
			
		}//for (int i = 0; i < lenOfTokens; i++)
		
		String tokens_new_2 = StringUtils.join(tokens_new, ".");
		
//		String tokens_new_2 = StringUtils.join((Iterator) listOfTokens, ".");
//		Object[] tokens_new = listOfTokens.toArray(new String());
//		Object[] tokens_new = listOfTokens.toArray();
//		String[] tokens_new = (String[]) listOfTokens.toArray();
		
//		String adr_new = String.join(".", listOfTokens);
//		String adr_new = Arrays.toString(tokens_new);
		
//		// report
//		String msg;
//		msg = String.format(Locale.JAPAN, "[%s : %d] adr_original => %s / new => %s", Thread
//				.currentThread().getStackTrace()[1].getFileName(), Thread
//				.currentThread().getStackTrace()[1].getLineNumber(), 
//				adr_original, tokens_new_2);
//
//		System.out.println(msg);
		
		return tokens_new_2;
		
	}//get_ShortenedIPAddress(String adr_original)

	private static void get_DomainNames
	(String ipaddress_label, int wildcard_value, int numOfItems) {
		// TODO Auto-generated method stub
	
		//ref http://stackoverflow.com/questions/3371879/ip-address-to-hostname-in-java
		InetAddress addr1;
		
		for(int i1 = 0; i1 < 10; i1 ++) {
			try {
				
				String ipaddress1;// = "104.71.168.153";
				ipaddress1 = String.format(Locale.JAPAN, "104.000.000.%d", 153 + i1);
//				ipaddress = String.format(Locale.JAPAN, "104.71.168.%d", 153 + i);
//				ipaddress = String.format(Locale.JAPAN, "104.71.168.%d", 153);
				
				System.out.println("ipaddress => " + ipaddress1);
				
				addr1 = InetAddress.getByName(ipaddress1);
				
				String host = addr1.getHostName();
				
				System.out.println("hostname => " + host + "(" + host.length() + ")");
	//			addr = InetAddress.getByName("192.168.190.62");
				
				String host1 = addr1.getHostName();
				
				System.out.println(host1);
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//for(int i = 0; i < 10; i ++)

	}//private static void get_DomainNames
		
}
