package br.fadep.biblioteca.ws;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



@ApplicationPath("rest")

public class AplicationConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
		addRestResourceClasses(resources);
		return super.getClasses();
	}
		
	private void addRestResourceClasses(Set <Class<?>> resources) {
		resources.add(CORS.class);
		resources.add(ClienteWs.class);
	}
}
