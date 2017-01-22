

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author user
 */
@Named(value = "studentcontroller")
@SessionScoped
public class studentcontroller implements Serializable {
    
    String firstName;
    String lastName;
    String emailAddress;
    String dateoOfBirth;
    String response;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateoOfBirth() {
        return dateoOfBirth;
    }

    public void setDateoOfBirth(String dateoOfBirth) {
        this.dateoOfBirth = dateoOfBirth;
    }

    public String getResponse() {
        response = "";
        if (firstName != null && lastName != null && emailAddress != null && dateoOfBirth != null){
            response = response.concat("<h3>Hello " + firstName + " " + lastName + "</h3>");
            response = response.concat("<h4>Your Email Address is " + emailAddress + "</h4>");
            response = response.concat("<h4>Your Date of Birth is " + dateoOfBirth + "</h4>");
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    

    /**
     * Creates a new instance of studentcontroller
     */
    public studentcontroller() {
    }
    
}
