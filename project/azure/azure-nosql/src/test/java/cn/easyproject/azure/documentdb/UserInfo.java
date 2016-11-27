package cn.easyproject.azure.documentdb;

public class UserInfo {
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	private String id;
    private String name;
    private String email;

    public UserInfo(String id, String name, String email) {
          super();
          this.id = id;
          this.name = name;
          this.email = email;
    }

    public String getEmail() {
          return email;
    }

    public String getId() {
          return id;
    }

    public String getName() {
          return name;
    }

    public void setEmail(String email) {
          this.email = email;
    }

    public void setId(String id) {
          this.id = id;
    }

    public void setName(String name) {
          this.name = name;
    }
    
}
