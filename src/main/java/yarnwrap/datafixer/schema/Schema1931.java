package yarnwrap.datafixer.schema;
public class Schema1931 { public net.minecraft.datafixer.schema.Schema1931 wrapperContained; public Schema1931(net.minecraft.datafixer.schema.Schema1931 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerEntities(schema); }
// public static java.util.Map registerEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1931.registerEntities(schema); }

}