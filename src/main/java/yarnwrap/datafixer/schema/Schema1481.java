package yarnwrap.datafixer.schema;
public class Schema1481 { public net.minecraft.datafixer.schema.Schema1481 wrapperContained; public Schema1481(net.minecraft.datafixer.schema.Schema1481 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1481.registerBlockEntities(schema); }

}