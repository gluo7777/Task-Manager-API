package org.manager.taskorganizer.repository;

import java.util.List;
import java.util.Locale.Category;

import org.manager.taskorganizer.model.tasks.Note;
import org.manager.taskorganizer.model.tasks.Task;

/**
 * Retrieves tasks for an user
 * Each View will have a list of Task
 * Each Task will have a list of Category
 * @author root
 *
 */
public interface TaskRepository {
	/**
	 * Required functionalities:
	 * 1) Retrieve all tasks related to an userId
	 * 2) Retrieve and label tasks that are repeated
	 * 3) Retrieve and assign tasks to stored categories for an user
	 * 4) Retrieve and assign tasks to stored lists for an user
	 * 5) Retrieve notes for each task
	 * 
	 * Default non-implemented:
	 * Note: Throw unsupported exceptions
	 * 1) Update operations
	 * 2) Insert operations
	 * 3) Delete operations
	 */
	
	/**
	 * Should retrieve from tasks and any 1-1 relationship tables
	 * Includes tasks,repeated,frequence settings, etc.
	 * @param userId
	 * @return
	 */
	List<Task> getTasksForUser(long userId);
	
	/**
	 * 
	 * @param userId account to query tasks and notes for
	 * @param taskIds can be null or a list of task ids to query for
	 * @return list of notes
	 */
	List<Note> getNotesForUserAndTasks(long userId, long...taskIds);
	
	/**
	 * 
	 * @param taskId
	 * @return all Categories mapped to taskId
	 */
	List<Category> getCategoriesForTask(long taskId);
	
	/**
	 * Adds a list of tasks for userId
	 * @param userId
	 * @param tasks
	 * @return true if all tasks added successfully, else false
	 */
	boolean addTasksForUser(long userId, Task...tasks);
	
	/**
	 * Deletes a list of tasks based on their id for userId
	 * @param userId
	 * @param taskIds
	 * @return true if all tasks deleted successfully, else false
	 */
	boolean deleteTasksForUser(long userId, long...taskIds);
	
	/**
	 * Updates a list of tasks based on their id for userId
	 * @param userId
	 * @param tasks
	 * @return true if all tasks updated successfully, else false
	 */
	boolean updateTasksForUser(long userId, Task...tasks);
}
