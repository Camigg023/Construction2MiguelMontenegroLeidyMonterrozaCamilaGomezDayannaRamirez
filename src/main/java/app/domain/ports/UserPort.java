package src.main.java.app.domain.ports;

import src.main.java.app.domain.model.User;

import java.util.List;

public interface UserPort {
    public User findByIdentification(User user) throws Exception;
    public User findByUserName(String user) throws Exception;
    public User update (User user) throws Exception;
	public void save(User user) throws Exception;
    public void delete(User id) throws Exception;
    public List<User> findAll()  throws Exception;


}

