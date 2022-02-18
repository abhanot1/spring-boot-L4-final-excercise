package com.lesson4.springbootbasicexample.Mapper;

import com.lesson4.springbootbasicexample.Model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface MessageMapper {

    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getAllMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES(#{username}, #{messageText})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    int addMessage(ChatMessage chatMessage);

}