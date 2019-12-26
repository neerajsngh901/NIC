package com.nic.oauth2.NicAuthServer.dao;

import com.nic.oauth2.NicAuthServer.model.UserEntity;

public interface OAuthDAOService {
	
	public UserEntity getUserDetails(String emailID);

}
