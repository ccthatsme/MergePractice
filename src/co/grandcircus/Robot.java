package co.grandcircus;

public class Robot {
	private String name;
	private String job;

	public Robot(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", job=" + job + "]";
	}

}
