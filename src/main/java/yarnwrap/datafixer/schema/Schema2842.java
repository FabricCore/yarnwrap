package yarnwrap.datafixer.schema;
public class Schema2842 { public net.minecraft.datafixer.schema.Schema2842 wrapperContained; public Schema2842(net.minecraft.datafixer.schema.Schema2842 wrapperContained) { this.wrapperContained = wrapperContained; }

public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}