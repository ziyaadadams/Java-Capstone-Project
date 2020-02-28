
package poised;

import java.io.FileWriter;
import java.io.IOException;


public class Project {
	
	Main objMain = new Main();
    String pro_numString;
    //int proj_num = Integer.parseInt(pro_numString);
    String proj_name;
    String build_type;
    String proj_address;
    String erf_numString;
    String totalFee;
    String totalPaid;
    String start_date;
    String deadline;





public Project(String pro_numString, String proj_name, String build_type, String proj_address, String erf_numString,
			String totalFee, String totalPaid, String start_date, String deadline) {
		super();
		this.pro_numString = pro_numString;
		this.proj_name = proj_name;
		this.build_type = build_type;
		this.proj_address = proj_address;
		this.erf_numString = erf_numString;
		this.totalFee = totalFee;
		this.totalPaid = totalPaid;
		this.start_date = start_date;
		this.deadline = deadline;
	}



public String getTotalFee() {
	return totalFee;
}



public void setTotalFee(String totalFee) {
	this.totalFee = totalFee;
}



public String getTotalPaid() {
	return totalPaid;
}



public void setTotalPaid(String totalPaid) {
	this.totalPaid = totalPaid;
}



public String getPro_numString() {
	return pro_numString;
}

public void setPro_numString(String pro_numString) {
	this.pro_numString = pro_numString;
}

public String getProj_name() {
	return proj_name;
}




public void setProj_name(String proj_name) {
	this.proj_name = proj_name;
}




public String getBuild_type() {
	return build_type;
}




public void setBuild_type(String build_type) {
	this.build_type = build_type;
}




public String getProj_address() {
	return proj_address;
}




public void setProj_address(String proj_address) {
	this.proj_address = proj_address;
}




public String getErf_numString() {
	return erf_numString;
}


public void setErf_numString(String erf_numString) {
	this.erf_numString = erf_numString;
}


public String getStart_date() {
	return start_date;
}


public void setStart_date(String start_date) {
	this.start_date = start_date;
}

public String getDeadline() {
	return deadline;
}




public void setDeadline(String deadline) {
	this.deadline = deadline;
}


public void AddProjToFile() {
	
	try {
	      FileWriter myWriter = new FileWriter("Project.txt");
	      myWriter.write("\n"
	    		  +"Project Number: " +pro_numString +", "
	    		  + "Project Name: " + proj_name+ ", "
	    		  + "Project Building Type: " +build_type+ ", "
	    		  + "Project Fee: "+totalFee + ", "
	    		  + "Total Paid: " +totalPaid +", "
	    		  + "Project Address: " +proj_address+ ", "
	    		  + "ERF Number: " + erf_numString+ ", "
	    		  + "Project Start Date: " + start_date+ ", "
	    		  + "Project Deadline: " + deadline );
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

}

public void ReadFile() throws IOException {
	     
}

	@Override
    public String toString() {
        return "\nProject Details:" +
                "\nProject Number: " + pro_numString
                + "\nTotal Fee: " + totalFee
                + "\nTotal Paid: " + totalPaid
                +"\nName: " + proj_name  
                +"\nBuilding Type: " + build_type
                +"\nAddress: " + proj_address 
                +"\nERF Number: " + erf_numString 
                +"\nStart Date: " + start_date 
                +"\nDeadline: " + deadline;
    }
	
	
	
	
		
		
		
}
