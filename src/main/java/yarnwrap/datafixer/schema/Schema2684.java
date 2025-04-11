package yarnwrap.datafixer.schema;
public class Schema2684 { public net.minecraft.datafixer.schema.Schema2684 wrapperContained; public Schema2684(net.minecraft.datafixer.schema.Schema2684 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}