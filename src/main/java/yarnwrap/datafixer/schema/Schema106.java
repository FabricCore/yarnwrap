package yarnwrap.datafixer.schema;
public class Schema106 { public net.minecraft.datafixer.schema.Schema106 wrapperContained; public Schema106(net.minecraft.datafixer.schema.Schema106 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema106(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema106(versionKey,parent); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}