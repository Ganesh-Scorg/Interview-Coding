import java.io.*;
import java.net.*;

public class InetDemo {
	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("10.0.2.15");

			System.out.println("Host Name: " + ip.getHostName());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}