package concrete;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("데이터베이스에서 마의 물약의 정보를 가져옵니다.!");

	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("마력   물약을 새로 생성 ");

	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new MpPotion();
	}

}
