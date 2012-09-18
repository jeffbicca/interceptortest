package br.gov.serpro.interceptortest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class InterceptorCallTest {

	@Inject
	InterceptorCall interceptorCall;

	@Test
	public void shouldCallInterceptor() {
		interceptorCall.callMethod();
	}

}
