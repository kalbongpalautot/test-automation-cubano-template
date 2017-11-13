package org.concordion.cubano.domain;

import java.util.List;

import org.concordion.cubano.data.EntityPool;

/**
 * Supplies a pool of Users available for test automation and manages usage.
 */
public class UserPool extends EntityPool<User> {

	@Override
	protected List<User> getPool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<User> getPoolUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected List<User> getInstanceUsage() {
		// TODO Auto-generated method stub
		return null;
	}
	// public static final User API_USER_PROCESSOR = new User(Role.PROCESSOR,
	// "autoagent1", "Automation Agent 1");
	// /**
	// * !!! API_USER_MANAGER is in the BPM CIPS environment group 'Production
	// Support'
	// * this means that this user can view STP'd or completed Processes (i.e.
	// typically owned by deadmin).
	// * If executing in environments outside of BPM CIPS, API_USER_MANAGER will
	// need to be added to
	// * the 'Production Support' (or equivalent) group
	// */
	// public static final User API_USER_MANAGER = new User(Role.MANAGER,
	// "automanager1", "Automation Manager 1");
	//
	//
	// private static List<User> pool = new ArrayList<User>();
	// private static List<User> poolUsage = Collections.synchronizedList(new
	// ArrayList<User>());
	// private List<User> instanceUsage = new ArrayList<User>();
	//
	// static {
	// pool.add(new User(Role.PROCESSOR, "autoagent1", "Automation Agent 1"));
	// pool.add(new User(Role.PROCESSOR, "autoagent2", "Automation Agent 2"));
	// pool.add(new User(Role.PROCESSOR, "autoagent3", "Automation Agent 3"));
	// pool.add(new User(Role.PROCESSOR, "autoagent4", "Automation Agent 4"));
	// pool.add(new User(Role.PROCESSOR, "autoagent5", "Automation Agent 5"));
	// pool.add(new User(Role.PROCESSOR, "autoagent6", "Automation Agent 6"));
	// pool.add(new User(Role.PROCESSOR, "autoagent7", "Automation Agent 7"));
	// pool.add(new User(Role.PROCESSOR, "autoagent8", "Automation Agent 8"));
	// pool.add(new User(Role.PROCESSOR, "autoagent9", "Automation Agent 9"));
	// pool.add(new User(Role.PROCESSOR, "autoagent10", "Automation Agent 10"));
	// pool.add(new User(Role.OA, "autooperation1", "Automation Operation Analyst
	// 1"));
	// pool.add(new User(Role.OA, "autooperation2", "Automation Operation Analyst
	// 2"));
	// pool.add(new User(Role.MANAGER, "automanager1", "Automation Manager 1"));
	// // available.add(new User(Role.MANAGER, "automanager2", "Automation Manager
	// 2"));
	// pool.add(new User(Role.NONE, "norole1", ""));
	// }
	//
	// /**
	// * Factory method to create new manager user pool manager.
	// *
	// * @return
	// */
	// public static UserPool createManager() {
	// return new UserPool();
	// }
	//
	// /**
	// * Factory method to create new manager user pool manager.
	// *
	// * @param cleanupService Provide data cleanup service to register with to
	// automatically cleanup any requested users
	// * @return
	// */
	// public static UserPool createManager(DataCleanupHelper cleanupService) {
	// UserPool userPool = new UserPool();
	// cleanupService.register(userPool);
	//
	// return userPool;
	// }
	//
	// @Override
	// protected List<User> getPool() {
	// return pool;
	// }
	//
	// @Override
	// protected List<User> getPoolUsage() {
	// return poolUsage;
	// }
	//
	// @Override
	// protected List<User> getInstanceUsage() {
	// return instanceUsage;
	// }
	//
	// /**
	// * Returns user with requested username. Use with care as this does not care
	// if the user
	// * is in use or not.
	// *
	// * @param username Requested username
	// * @return User if found, otherwise null.
	// */
	// public static User getUser(String username) {
	// username = username.trim();
	//
	// for (Object item : pool) {
	// User user = (User) item;
	//
	// if (user.getUsername().equalsIgnoreCase(username)) {
	// return user;
	// }
	// }
	//
	// return null;
	// }
	//
	// @SuppressWarnings("unchecked")
	// public static List<User> getUsers() {
	// return (List<User>) (List<?>) pool;
	// }
	//
	// /**
	// * Find the first free user with the requested role (starting from random
	// point in list of users), if all are in use then will wait for one to become
	// available.
	// *
	// * @param role
	// * @return
	// */
	// public User requestUser(Role role) {
	// List<User> filteredUsers = getPool().stream().filter(user -> user.getRole()
	// == role).collect(Collectors.toList());
	//
	// return request(filteredUsers, String.format("user with '%s' role to become
	// available", role));
	// }
	//
	// @Override
	// public void release(User user) {
	// super.release(user);
	// }
	//
	// public static boolean hasUsersInUse() {
	// return poolUsage.size() > 0;
	// }
}
