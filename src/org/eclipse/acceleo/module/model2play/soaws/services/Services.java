package org.eclipse.acceleo.module.model2play.soaws.services;


import java.util.HashMap;
import java.util.TreeMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.obeonetwork.dsl.soa.Operation;
import org.eclipse.acceleo.module.model2play.soaws.*;

public class Services {
	
	public final String DEFAULT_PROTOCOL = "GET";

	HashMap<String,String> _protocols = new HashMap<String, String>() {/**
		 * 
		 */
		private static final long serialVersionUID = -7504100133787271366L;

	{
		   put("constructor", "POST");
		   put("destructor", "DELETE");
		   put("setter", "PUT");
		   put("getter","GET");
		}};

	
	public String get_protocol_method( String operation_type ) {
		
		if ( _protocols.containsKey( operation_type ) ) {
			return _protocols.get(operation_type);
		}
		else {
			return DEFAULT_PROTOCOL;
		}
		
	}
	
};
