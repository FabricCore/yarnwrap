package yarnwrap.datafixer.schema;
public class Schema1483 { public net.minecraft.datafixer.schema.Schema1483 wrapperContained; public Schema1483(net.minecraft.datafixer.schema.Schema1483 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1483.registerEntities(schema); }

}