package yarnwrap.datafixer.schema;
public class Schema3202 { public net.minecraft.datafixer.schema.Schema3202 wrapperContained; public Schema3202(net.minecraft.datafixer.schema.Schema3202 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema3202.registerBlockEntities(schema); }

}