package yarnwrap.datafixer.schema;
public class Schema102 { public net.minecraft.datafixer.schema.Schema102 wrapperContained; public Schema102(net.minecraft.datafixer.schema.Schema102 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema102(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema102(versionKey,parent); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }

}