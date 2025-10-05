public enum Enum {
	
	Ramu, Bharath, Rev, JOO;
	
}

enum methods{
	
	Success(200), Error(400), NotFound(201);
	
	private int code;
	
	methods(int code) {
		this.code = code;
	}
	
	public int getcode() {
		return code;
	}
}

enum str{
	name("bharath"),age("25"), gender("male");
	private String s;
	str(String s)
	{
		this.s = s;
	}
	public String getvalue() {
		return s;
	}
}