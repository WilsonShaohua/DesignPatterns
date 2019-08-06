package structure.bridge;

public class UnixImp implements ImageImp {

	@Override
	public void doPaint(Matrix m) {
			System.out.print("在Unix操作系统中显示图像：");
	}

}
