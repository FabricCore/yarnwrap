package yarnwrap.datafixer.schema;
public class Schema1125 { public net.minecraft.datafixer.schema.Schema1125 wrapperContained; public Schema1125(net.minecraft.datafixer.schema.Schema1125 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}