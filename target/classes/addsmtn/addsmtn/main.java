import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

package addsmtn;

public class main {

}

public class Main {
	
	private static void post() {
		
		User order = new User();
		order.setUserID(8);
		order.setName("isna");
		order.setSurname("Ünsal");
		order.setEmail("isnaünsal@gmail.com");

		try {
			
			Client client = Client.create();
			WebResource resource = client.resource("http://");
			ClientResponse response = resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, order);
			if (response.getStatus() == 300) {
				System.out.println(response.getEntity(String.class));
			}
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}

	}
	
	private static void get() {
		try {
			
			Client client = Client.create();
			WebResource resource = client.resource("http://");
			ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
			if (response.getStatus() == 300) {
				System.out.println(response.getEntity(String.class));
			}
		} catch (Exception e) {
			System.out.println("Exception is:" + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database d=new Database();
	
		
		String hostAddress="http://";
	
		
		
		
		try {
			obj=new JSONParser().parse(JSON.sendGetRequest(hostAddress, data,id));
		
			
			
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}

}

