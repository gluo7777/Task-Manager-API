package org.manager.taskorganizer.repository;

import java.util.List;

import org.manager.taskorganizer.exception.DefaultHandler;
import org.manager.taskorganizer.model.accounts.Account;
import org.manager.taskorganizer.model.accounts.Category;
import org.manager.taskorganizer.model.accounts.View;

/**
 * Retrieves information for an user.
 * @author root
 *
 */
public interface AccountRepository {
	
	/**
	 * Retrieves account info based on authenticated username
	 * @param username
	 * @return
	 */
	default public Account getAccountForUser(String username) {
		throw DefaultHandler.notSupported();
	}
	
	/**
	 * Retrieves Views (Lists) mapped to an userId
	 * @param userId
	 * @return
	 */
	default public List<View> getViewsForUserId(long userId){
		throw DefaultHandler.notSupported();
	}
	
	/**
	 * Retrieves Categories mapped to an userId
	 * @param userId
	 * @return
	 */
	default public List<Category> getCategoriesForUserId(long userId){
		throw DefaultHandler.notSupported();
	}
}
