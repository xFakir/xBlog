package cn.xfakir.xblog.common.pojo;

import cn.xfakir.xblog.common.config.ObjectIdSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @ClassName : Article
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/10 14:25
 * @Version : 1.0
 */
@Document(collection = "article")
public class Article {
    @Id
    // @JsonSerialize(using = ObjectIdSerializer.class,as = String.class)
    private ObjectId articleId;
    private String title;
    private String author;
    private List<Tag> tags;
    private Category category;
    private String summary;
    private String content;

    public ObjectId getArticleId() {
        return articleId;
    }

    public void setArticleId(ObjectId articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
