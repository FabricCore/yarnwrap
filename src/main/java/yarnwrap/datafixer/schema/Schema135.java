package yarnwrap.datafixer.schema;
public class Schema135 { public net.minecraft.datafixer.schema.Schema135 wrapperContained; public Schema135(net.minecraft.datafixer.schema.Schema135 wrapperContained) { this.wrapperContained = wrapperContained; }

public Schema135(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.Schema135(versionKey,parent); }
public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema135.registerTypes(schema,entityTypes,blockEntityTypes); }

}