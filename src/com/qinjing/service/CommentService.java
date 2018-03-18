package com.qinjing.service;
import java.util.List;

import com.qinjing.pojo.Comment;

public interface CommentService {
	
	String delete(int id);

    String insert(Comment comment);

    Comment findById(int id);
    
    List<Comment> findAll(int aid);
}