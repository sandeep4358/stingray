package in.co.stl.manageBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "userdetail", eager = true)
@RequestScoped
public class UserDetail {
	/*String name;*/
	String userName;
	/*String password;
	String phonenumer;
	String gender;
	Date dob;
*/
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
*/
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/*public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumer() {
		return phonenumer;
	}

	public void setPhonenumer(String phonenumer) {
		this.phonenumer = phonenumer;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}*/

}
