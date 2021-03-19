import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlRootElement;


package addsmtn;

public class user {
	

	
	@XmlRootElement(name = "user")
	@XmlAccessorType(XmlAccessType.FIELD)


		    private int userID;
		    private String name;
		    private String surname;
		    private String email;
		 
		    public user(int userID) {
		        this.userID = userID;
		    }
		 
		    public user() {
		    }
		 
		    public user(int userID, String name, String surname, String email) {
		        this.userID = userID;
		        this.name = name;
		        this.surname = surname;
		        this.email=email;
		    }

		 
		    @Override
		    public boolean equals(Object obje) {
		        if (this == obje)
		            return true;
		        if (obje == null)
		            return false;
		        if (getClass() != obj.getClass())
		            return false;
		        User other = (User) obje;
		        if (userID != other.userID)
		            return false;
		        return true;
		    }

			public int getUserID() {
				return userID;
			}

			public void setUserID(int userID) {
				this.userID = userID;
			}

			

			public void setName(String name) {
				this.name = name;
			}
			public String getName() {
				return name;
			}
			public void setEmail(String email) {
				this.email = email;
			}  
			public String getSurname() {
				return surname;
			}
			
			public String getEmail() {
				return email;
			}
			public void setSurname(String surname) {
				this.surname = surname;
			}

			

		
		    
		    
	}

}
