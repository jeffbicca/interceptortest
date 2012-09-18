package br.gov.serpro.interceptortest;

import java.io.Serializable;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;

@BusinessController
public class InterceptorCall implements Serializable {

	private static final long serialVersionUID = 8273393716286550004L;

	@DoIntercept(message = "Hello World")
	public void callMethod() {
		System.out.println("Preparing hello world to be displayed by interceptor...");
	}

}
