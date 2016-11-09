
package entidades;

public class EntidadeProcesso {

	private int pid;
	private String username;
	private String time;
	private String cpu;
	private int nlwp;
	private String process;

	
	
	public  EntidadeProcesso(int pid, String username, String time, String cpu, int nlwp, String process) {
		this.pid = pid;
		this.username = username;
		this.time = time;
		this.cpu = cpu;
		this.nlwp = nlwp;
		this.process = process;
	}

	public static EntidadeProcesso criarProcesso(int pid, String username, String time, String cpu, int nlwp, String process){
		
		return new EntidadeProcesso(pid,username,time,cpu,nlwp,process);
	}
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getNlwp() {
		return nlwp;
	}

	public void setNlwp(int nlwp) {
		this.nlwp = nlwp;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadeProcesso other = (EntidadeProcesso) obj;
		if (pid != other.pid)
			return false;
		return true;
	}
	
	

}
