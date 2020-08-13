package cn.xfakir.xblog.common.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

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
    private Integer articleId;
    private String title;
    private String author;
    private String tags;
    private String category;
    private String summary;
    private String content;

}
