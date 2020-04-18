
package com.julyatt.walhomesentinel.fallback;


import com.julyatt.walhomesentinel.feign.TestFeignSerice;

/**
 * @author lengleng
 * @date 2019-08-01
 * <p>
 * sentinel 降级处理
 */
public class EchoServiceFallback implements TestFeignSerice {

	private Throwable throwable;

	EchoServiceFallback(Throwable throwable) {
		this.throwable = throwable;
	}

	/**
	 * 调用服务提供方的输出接口.
	 * @param str 用户输入
	 * @return
	 */
	@Override
	public String echo(String str) {
		return "consumer-fallback-default-str" + throwable.getMessage();
	}

}
