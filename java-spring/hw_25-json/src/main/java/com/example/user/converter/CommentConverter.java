package com.example.user.converter;

import com.example.user.dto.CommentDto;
import com.example.user.entity.Comment;
import com.example.user.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CommentConverter {
    public Comment toLocal(User user, CommentDto dto) {
        if (dto == null) {
            return null;
        }
        Comment comment = new Comment();
        comment.setText(dto.text());
        comment.setUsers(user);

        return comment;
    }

    public CommentDto toFront(Comment comment) {
        if (comment == null) {
            return null;
        }

        return new CommentDto(comment.getId(), comment.getText());
    }

    public List<Comment> toLocal(User user, List<CommentDto> commentDtos) {
        if (commentDtos == null) {
            return null;
        }

        return commentDtos.stream()
                .map(dto -> toLocal(user, dto))
                .toList();
    }

    public List<CommentDto> toFront(List<Comment> comments) {
        if (comments == null) {
            return null;
        }

        return comments.stream()
                .map(this::toFront)
                .toList();
    }
}
