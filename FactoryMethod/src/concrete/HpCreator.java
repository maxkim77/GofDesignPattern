package concrete;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		// TODO Auto-generated method stub
		System.out.println("데이터베이스에서 회복의 물약의 정보를 가져옵니다.!");

	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("회복 물약을 새로 생성 ");

	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
