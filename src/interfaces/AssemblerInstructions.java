package interfaces;

public interface AssemblerInstructions {

	public byte[] load(String dest, String mem);
	public byte[] loadc(String dest, String val);
	public byte[] store(String mem, String src);
	public byte[] add(String dest, String src1, String src2);
	public byte[] sub(String dest, String src1, String src2);
	public byte[] mul(String dest, String src1, String src2);
	public byte[] div(String dest, String src1, String src2);
	public byte[] eq(String dest, String src1, String src2);
	public byte[] mygoto(String jump);
	public byte[] gotoif(String jump, String src);
	public byte[] cprint(String mem);
	public byte[] cread(String mem);
	public byte[] exit();
	
}
