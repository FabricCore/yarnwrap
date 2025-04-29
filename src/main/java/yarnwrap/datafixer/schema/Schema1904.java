package yarnwrap.datafixer.schema;
public class Schema1904 { public net.minecraft.datafixer.schema.Schema1904 wrapperContained; public Schema1904(net.minecraft.datafixer.schema.Schema1904 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1904.registerEntities(schema); }

}