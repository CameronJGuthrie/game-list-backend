package me.cameronguthrie.gamelist.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import me.cameronguthrie.gamelist.model.GameType;

import java.io.IOException;

public class EnumSerializer extends StdSerializer<GameType> {

    public EnumSerializer() {
        super(GameType.class);
    }

    @Override
    public void serialize(GameType type, JsonGenerator generator, SerializerProvider provider) throws IOException {
        generator.writeStartObject();
        generator.writeFieldName("name");
        generator.writeString(type.getName());
        generator.writeFieldName("description");
        generator.writeString(type.getDescription());
        generator.writeEndObject();
    }
}
