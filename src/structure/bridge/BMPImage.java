package structure.bridge;

public class BMPImage extends Image {
	@Override
	public void parseFile(String fileName) {
		Matrix m = new Matrix();
		image.doPaint(m);
		System.out.println(fileName + "����ʽΪBMP��");
	}
}
