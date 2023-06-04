package com.example.casestudy3.DAO;

import com.example.casestudy3.DAO.connection.MyConnection;

import java.sql.Connection;

public class LikesDAO {

    private final Connection connection;

    private final String SELECT_ALL = "select * from likes where posts_id = ?";
    private final String SELECT_LIKE_COUNT = "select count(*) from likes where post_id = ?";

    private final String INSERT_INTO = "insert into likes (user_id , posts_id) value (?,?)";
    private final String DELETE_BY_ID = "delete from likes  where id = ?";

    public LikesDAO() {
        connection = MyConnection.getConnection();
    }


}
