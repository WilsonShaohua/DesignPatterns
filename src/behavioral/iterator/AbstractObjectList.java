package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
	protected List<Object> objects = new ArrayList<Object>();
	
	public AbstractObjectList(List objects) {
		this.objects = objects;
	}
	
	public void addObject(Object object) {
		this.objects.add(object);
	}
	
	public void removeObject(Object object) {
		this.objects.remove(object);
	}
	
	public List getObjects() {
		return this.objects;
	}
	
	public abstract AbstractIterator createIterator();
}
