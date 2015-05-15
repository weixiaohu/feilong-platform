/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.framework.netpay.payment.adaptor.alipay.pconline;

import com.feilong.framework.netpay.payment.adaptor.alipay.wap.AlipayWapForexAdaptor;

/**
 * alipay境外支付接口.<br>
 * 
 * <ol>
 * <li>账号(pid&key)和原来支付宝一样吗? ??</li>
 * <li>功能单独开通申请?需要</li>
 * <li>有测试账号?有</li>
 * <li>是否有其他的不同的流程?配置不同 其他相同</li>
 * <li>文档?有</li>
 * </ol>
 * 
 * <h3>{@link AlipayWapForexAdaptor} VS {@link AlipayOnlineForexPayAdaptor}:</h3>
 * 
 * <blockquote>
 * <p>
 * 目前区别是,交易超时时间max值,mobile是 3d,pc是12h,pc上如果写3d就直接报错
 * </p>
 * </blockquote>
 * 
 * <h3>境外支付 VS 普通支付宝:</h3>
 * 
 * <blockquote>
 * <ul>
 * <li>和 普通的支付宝的区别是, 虽然境外支付也有return_url,但是 这不能作为交易成功的判断依据, 里面参数是不签名的;并且只要交易状态发生改变都会跳转回来, 比如 交易失败等</li>
 * <li>没有防钓鱼时间戳</li>
 * </ul>
 * </blockquote>
 * 
 *
 * @author 冯明雷
 * @author <a href="mailto:venusdrogon@163.com">feilong</a>
 * @version 1.0 2014-9-28 下午3:00:33
 * @version 1.1.2 2015年4月22日 下午5:58:15 删掉了实现代码,修改成 <code>extends AlipayOnlineAdaptor</code>
 * @since 1.1.2
 */
public class AlipayOnlineForexPayAdaptor extends AlipayOnlineAdaptor{

}
