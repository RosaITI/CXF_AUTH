package es.iti.formacion.soap.ws.callback;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ServerPasswordCallback implements CallbackHandler {

	   @Override
	   public void handle(Callback[] callbacks) throws IOException,
	         UnsupportedCallbackException {
	      WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

	      if ("joe".equals(pc.getIdentifier())) {
	           pc.setPassword("joespassword"); 
	        }

	   }
	   
}

