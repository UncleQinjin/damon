package com.qinjing.dao;
import java.util.List;

import com.qinjing.pojo.Comment;

public interface CommentDao {
	
	int delete(int id);

    int insert(Comment comment);

    Comment findById(int id);
    
    List<Comment> findAll(int aid);
}