package org.manager.taskorganizer.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.util.LinkedList;
import java.util.List;

import org.manager.taskorganizer.constants.Status;
import org.manager.taskorganizer.model.tasks.Task;
import org.manager.taskorganizer.util.Util;

/**
 * This class will obtain a reference to the connection to make queries to the
 * database.
 * 
 * @author root
 *
 */
public class TaskRepositoryImpl implements TaskRepository {

	private Connection con = null;

	private TaskRepositoryImpl() {}

	public static final TaskRepository newInstance(Connection con) {
		TaskRepositoryImpl repo = new TaskRepositoryImpl();
		repo.con = con;
		return repo;
	}

	@Override
	public List<Task> getTasksForUser(long userId) {
		// Not necessary to close ResultSet b/c closed auto by PreparedStatement closing
		try(PreparedStatement pstmt = con.prepareStatement("SELECT * FROM task.tasks T1 WHERE T1.account_id = ?");) {
			List<Task> tasks = new LinkedList<>();
			pstmt.setLong(1, userId);
			ResultSet results = pstmt.executeQuery();
			while(results.next()) {
				Task task = new Task();
				OffsetDateTime dueOffSet = results.getObject("due_timestamp", OffsetDateTime.class);
				task.setId(results.getLong("id"))
				.setName(results.getString("name"))
				.setStatus(Status.fromSqlName(results.getString("status")))
				.setDueTimeStamp(dueOffSet == null ? null : dueOffSet.toLocalDateTime())
				;
				tasks.add(task);
			}
			return tasks;
		} catch (SQLException e) {
			Util.LOG.error("Failed to retrieve tasks with message %s.", e);
			return null;
		}
	}
}
