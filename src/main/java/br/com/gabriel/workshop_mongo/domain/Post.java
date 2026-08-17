package br.com.gabriel.workshop_mongo.domain;

import br.com.gabriel.workshop_mongo.dto.AuthorDTO;
import br.com.gabriel.workshop_mongo.dto.CommentDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;

    private AuthorDTO author;

    private List<CommentDTO> comments = new ArrayList<>();

    public Post() {
    }

    public Post(String id, Date date, String body, String title, AuthorDTO author) {
        this.id = id;
        this.date = date;
        this.body = body;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public AuthorDTO getAuthorDto() {
        return author;
    }

    public void setAuthorDto(AuthorDTO author) {
        this.author = author;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }
}
