package in.sachin.beans;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("Constructor::UserDao");
	}
}
