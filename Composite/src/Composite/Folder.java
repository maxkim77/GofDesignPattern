package Composite;
import java.util.List;
import java.util.ArrayList;

public class Folder extends Component {
	
	public Folder(String name) {
		super(name);
	}
	
	List<Component> children = new ArrayList<>();
	public boolean addComponent(Component component) {
		return children.add(component);
	}
	public boolean removeComponent(Component component) {
		return children.remove(component);
	}
	public List<Component> getChildren() {
		return children;
	}
	
}
