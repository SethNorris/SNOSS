package interfaces;

public interface Instructions {

	public void load(byte[] command);
	public void loadc(byte[] command);
	public void store(byte[] command);
	public void add(byte[] command);
	public void sub(byte[] command);
	public void mul(byte[] command);
	public void div(byte[] command);
	public void eq(byte[] command);
	public void mygoto(byte[] command);
	public void gotoif(byte[] command);
	public void cprint(byte[] command);
	public void cread(byte[] command);
	public void exit(byte[] command);
}
