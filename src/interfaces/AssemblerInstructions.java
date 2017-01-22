package interfaces;

public interface AssemblerInstructions {

	public String load(String dest, String mem);
	public String loadc(String dest, String val);
	public String store(String mem, String src);
	public String add(String dest, String src1, String src2);
	public String sub(String dest, String src1, String src2);
	public String mul(String dest, String src1, String src2);
	public String div(String dest, String src1, String src2);
	public String eq(String dest, String src1, String src2);
	public String mygoto(String jump);
	public String gotoif(String jump, String src);
	public String cprint(String mem);
	public String cread(String mem);
	public String exit();
	
}
