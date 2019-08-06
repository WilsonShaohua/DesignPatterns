package structure.bridge;

public class LinuxImp implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
		System.out.print("在Linux操作系统中显示图像：");
	}

}
