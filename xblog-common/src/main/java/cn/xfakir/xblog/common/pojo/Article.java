package cn.xfakir.xblog.common.pojo;

import cn.xfakir.xblog.common.config.ObjectIdSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @ClassName : Article
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/10 14:25
 * @Version : 1.0
 */
@Data
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
    //@DateTimeFormat来控制入参，@JsonFormat来控制出参
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    private Date publishDate;
}
