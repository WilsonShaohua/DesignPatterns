package structure.bridge;

public abstract class Image {
	protected ImageImp image;
	public void setImageImp(ImageImp image) {
		this.image = image;
	}
	public abstract void parseFile(String fileName);
}
