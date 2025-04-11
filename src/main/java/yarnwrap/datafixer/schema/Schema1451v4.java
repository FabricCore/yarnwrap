package yarnwrap.datafixer.schema;
public class Schema1451v4 { public net.minecraft.datafixer.schema.Schema1451v4 wrapperContained; public Schema1451v4(net.minecraft.datafixer.schema.Schema1451v4 wrapperContained) { this.wrapperContained = wrapperContained; }

public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}