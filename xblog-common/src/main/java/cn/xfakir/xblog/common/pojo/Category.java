package cn.xfakir.xblog.common.pojo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName : Category
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/10 16:35
 * @Version : 1.0
 */
@Data
public class Category {
    private Integer categoryId;
    private String categoryName;

}
