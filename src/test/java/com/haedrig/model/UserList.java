package com.haedrig.model;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@XmlRootElement
@JsonAutoDetect
@XmlSeeAlso({User.class})
public class UserList extends ArrayList<User>{

	private static final long serialVersionUID = -1084858354842664192L;
	
	public UserList() {
		super();
	}
	@XmlElement(name = "FooBar")
	public List<User> getUserList() {
	    return this;
	}
	
}
