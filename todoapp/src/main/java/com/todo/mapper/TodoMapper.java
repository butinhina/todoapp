package com.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.todo.entity.Todo;

@Mapper
public interface TodoMapper {
	//DBを操作するメソッド
	public List<Todo> selectAll();
	
	public List<Todo> selectIncomplete();
	
	public List<Todo> selectComplete();
	
	public void add(Todo todo);
	
	public void update(Todo todo);
	        
	public void delete();
}
