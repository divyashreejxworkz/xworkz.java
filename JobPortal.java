package com.xworkz.darara1.things;
import com.xworkz.darara1.things.Naukri;
import com.xworkz.darara1.things.Linkdin;
public class JobPortal {
	private String portalName;
	private String place;
	private String jobType;
	private Naukri naukri;
	private Linkdin linkdin;
	public JobPortal()
	{
		System.out.println("No-arguments");
	}
	public JobPortal(String portalName, String place, String jobType, Naukri naukri, Linkdin linkdin) {
		System.out.println("All-arguments");
		this.portalName = portalName;
		this.place = place;
		this.jobType = jobType;
		this.naukri = naukri;
		this.linkdin = linkdin;
	}
	public String getPortalName() {
		return portalName;
	}
	public void setPortalName(String portalName) {
		this.portalName = portalName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public Naukri getNaukri() {
		return naukri;
	}
	public void setNaukri(Naukri naukri) {
		this.naukri = naukri;
	}
	public Linkdin getLinkdin() {
		return linkdin;
	}
	public void setLinkdin(Linkdin linkdin) {
		this.linkdin = linkdin;
	}
}
