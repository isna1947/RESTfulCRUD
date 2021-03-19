import java.util.ArrayList;
	import java.util.List;


package addsmtn;

public class create {

		
		private static create yeni;
	    private static List<user> data = new ArrayList<user>();
	     
	    static {
	        data.add(new user(1, "isna", "ünsal","isna.unsal@tedu.edu.tr"));
	        data.add(new user(2, "ahmet", "saim","a.saim@tedu.edu.tr"));     
	    }
	     
	   
	     
	    public static create getInstance() {
	        if (yeni == null) {
	        	yeni = new create();
	        }
	         
	        return instance;               
	    }
	     
	    public List<User> listAll() {
	        return new ArrayList<User>(data);
	    }
	    
	    
	    public int add(user user) {
	        int newId = user.getUserID();
	        user.setUserID(newId);
	        data.add(user);
	         
	        return newId;
	    }
	    
	     
	    public user get(int id) {
	        User u = new User(id);
	        int index = data.indexOf(u);
	        if (index >= 0) {
	            return data.get(index);
	        }
	        return null;
	    }
	     
	    public boolean delete(int id) {
	        User u = new User(id);
	        int index = data.indexOf(u);
	        if (index >= 0) {
	            data.remove(index);
	            return true;
	        }
	         
	        return false;
	    }
	     
	    public boolean update(user user) {
	        int index = data.indexOf(user);
	        if (index >= 0) {
	            data.set(index, user);
	            return true;
	        }
	        return false;
	    }

	}

}
