package dao;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
    public User selectUser(int id);
    public List<User> selectAllUsers();
    public void insertUser(User user) throws SQLException;
    public void edit(User user);
    public void delete(int id);
    public List<User> findByCountry(String countryName);
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;
}
