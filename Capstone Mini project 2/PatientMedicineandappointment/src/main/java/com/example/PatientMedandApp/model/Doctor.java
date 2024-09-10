package com.example.PatientMedandApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "doctors")
public class Doctor {
	
	 @Id
	    private String id;
	    private String name;
	    private String specialty;
	    private String contactDetails;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
		public String getContactDetails() {
			return contactDetails;
		}
		public void setContactDetails(String contactDetails) {
			this.contactDetails = contactDetails;
		}

}
