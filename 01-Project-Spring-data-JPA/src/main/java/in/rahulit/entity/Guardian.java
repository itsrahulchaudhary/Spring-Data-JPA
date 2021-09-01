package in.rahulit.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Guardian {
	
	@Column(name="guardian_name")
	private String name;
	@Column(name="guardian_email")
	private String email;
	@Column(name="guardian_mobile")
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Guardian [name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	

}
