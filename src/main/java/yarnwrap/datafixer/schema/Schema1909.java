package yarnwrap.datafixer.schema;
public class Schema1909 { public net.minecraft.datafixer.schema.Schema1909 wrapperContained; public Schema1909(net.minecraft.datafixer.schema.Schema1909 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1909.registerBlockEntities(schema); }

}