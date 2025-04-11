package yarnwrap.datafixer.schema;
public class Schema1466 { public net.minecraft.datafixer.schema.Schema1466 wrapperContained; public Schema1466(net.minecraft.datafixer.schema.Schema1466 wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map registerBlockEntities(com.mojang.datafixers.schemas.Schema schema) { return wrapperContained.registerBlockEntities(schema); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}