package behavioral.mediator.demo1;

public class TextBox extends Component {

	@Override
	public void update() {
		System.out.println("客户信息增加成功文本框清空。");
	}

	public void setText() {
		System.out.println("文本框显示小龙女。");
	}
}
