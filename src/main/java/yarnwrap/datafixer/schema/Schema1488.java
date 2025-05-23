package yarnwrap.datafixer.schema;
public class Schema1488 { public net.minecraft.datafixer.schema.Schema1488 wrapperContained; public Schema1488(net.minecraft.datafixer.schema.Schema1488 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1488.registerBlockEntities(schema); }

}