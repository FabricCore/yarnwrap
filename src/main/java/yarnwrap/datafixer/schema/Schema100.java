package yarnwrap.datafixer.schema;
public class Schema100 { public net.minecraft.datafixer.schema.Schema100 wrapperContained; public Schema100(net.minecraft.datafixer.schema.Schema100 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema100(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema100(versionKey,parent); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema100.registerTypes(schema,entityTypes,blockEntityTypes); }

}