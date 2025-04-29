package yarnwrap.datafixer.schema;
public class Schema1451v5 { public net.minecraft.datafixer.schema.Schema1451v5 wrapperContained; public Schema1451v5(net.minecraft.datafixer.schema.Schema1451v5 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
// public static java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema, ) { return net.minecraft.datafixer.schema.Schema1451v5.registerBlockEntities(schema); }

}