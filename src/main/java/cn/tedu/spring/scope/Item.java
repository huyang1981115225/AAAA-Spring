package cn.tedu.spring.scope;

public class Item {
	private static Item item = null;
	private static Object lock = new Object();

	private Item() {
	}

	public static Item getInstance() {
		if (item == null) {
			synchronized (lock) {
				if (item == null) {
					item = new Item();
				}
			}
		}
		return item;
	}
}
