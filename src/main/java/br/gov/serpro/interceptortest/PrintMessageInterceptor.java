package br.gov.serpro.interceptortest;

import java.lang.reflect.Method;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@DoIntercept
public class PrintMessageInterceptor {

	@AroundInvoke
	public Object intercepts(InvocationContext ctx) throws Exception {
		Object callReturn = ctx.proceed();

		Method m = ctx.getMethod();
		DoIntercept a = m.getAnnotation(DoIntercept.class);

		System.out.println(a.message());

		return callReturn;
	}

}
