package cc.ymsoft.test;

import cc.ymsoft.Framework.RpcFramework;

public class GoodByeInvoke {
	public static void main(String[] args) {
		GoodByeService goodByeService=RpcFramework.getObj(GoodByeService.class, "127.0.0.1", 1717);
		System.out.println(goodByeService.sayGoodbye());
	}
}
