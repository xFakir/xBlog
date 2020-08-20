package cn.xfakir.xblog.common.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.bson.types.ObjectId;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @ClassName : ObjectIdSerializer
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/20 10:55
 * @Version : 1.0
 */
@JsonComponent
public class ObjectIdSerializer extends JsonSerializer<ObjectId> {

    @Override
    public void serialize(ObjectId objectId, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeObject(objectId.toString());
    }
}
