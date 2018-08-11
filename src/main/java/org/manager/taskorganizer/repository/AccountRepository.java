package org.manager.taskorganizer.repository;

import java.util.List;

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
	Account getAccountForUser(String username);
	
	/**
	 * Retrieves Views (Lists) mapped to an userId
	 * @param userId
	 * @return
	 */
	List<View> getViewsForUserId(long userId);
	
	/**
	 * Retrieves Categories mapped to an userId
	 * @param userId
	 * @return
	 */
	List<Category> getCategoriesForUserId(long userId);
	
	/**
	 * Adds categories for an userId
	 * @param categories
	 * @param userId
	 * @return
	 */
	boolean addCategoriesForUserId(long userId, Category...categories);
	
	/**
	 * Adds views for an userId
	 * @param views
	 * @param userId
	 * @return
	 */
	boolean addAccountViewsForUserId(long userId, View...views);
}
