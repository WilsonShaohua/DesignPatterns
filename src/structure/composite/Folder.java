package structure.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {
	private String name;
	private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();
	public Folder(String name) {
		this.name=name;
	}

	@Override
	public void add(AbstractFile file) {
		fileList.add(file);
	}

	@Override
	public void remove(AbstractFile file) {
		fileList.remove(file);
	}

	@Override
	public AbstractFile getChild(int location) {
		return (AbstractFile)fileList.get(location);
	}

	@Override
	public void killVirus() {
		System.out.println("****对文件夹‘" + name + "’进行杀毒");
		
		for(Object object : fileList) {
			((AbstractFile)object).killVirus();
		}
	}

}
