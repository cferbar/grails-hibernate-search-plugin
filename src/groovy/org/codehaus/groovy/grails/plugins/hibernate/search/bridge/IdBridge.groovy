package org.codehaus.groovy.grails.plugins.hibernate.search.bridge

/**
* allows bridging trough grails domain id's
* For easy indexing
*/
class IdBridge<Domain> extends AbstractGrailsDomainBridge<Domain>{

	@Override
	String objectToString(Object object) {
		// otherwise it should crash
		return object.id.toString()
	}

	@Override
	Object stringToObject(String stringValue) {
		// should crash if not has method
		return getGrailsDomain().findById(stringValue)
	}
}
