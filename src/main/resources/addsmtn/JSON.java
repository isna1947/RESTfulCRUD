import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.URL;
	import java.net.URLConnection;

package addsmtn;

public class JSON {

		
		public static String sendGetRequest(String hosttt, String data,String request) {
			String result = null;
			if (hosttt.startsWith("http://")) {
			try {
			String urlAsString = createGetUrl(hosttt, data,request);
			URL url = new URL(urlAsString);
			URLConnection urlC = url.openConnection();
			result = parseGetResponse(urlC);
			} catch (IOException e) {
			System.out.println("Error" + e.getMessage());
			}
			}
			return result;
			}
			 
		
			
			 
			private static String parseGetResponse(URLConnection urlConnection) {
			String result = "";
			BufferedReader bufferedReader;
			try {
			bufferedReader = new BufferedReader(new InputStreamReader(
			urlConnection.getInputStream()));
			StringBuffer stringBuffer = new StringBuffer();
		
			bufferedReader.close();
			result = stringBuffer.toString();
			}
			catch (IOException e) {
			System.out.println("Error "+ e.getMessage());
			}
			return result;
			}
			private static String createGetUrl(String hostt, String args,String request) {
				String arg=args+request;
				String urll = hostt;
				if (arg != null && arg.length() > 0) {
					urll += "/" + arg;
				}
				return urll;
				}
	}