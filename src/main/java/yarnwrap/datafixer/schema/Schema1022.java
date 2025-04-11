package yarnwrap.datafixer.schema;
public class Schema1022 { public net.minecraft.datafixer.schema.Schema1022 wrapperContained; public Schema1022(net.minecraft.datafixer.schema.Schema1022 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema1022(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema1022(versionKey,parent); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}