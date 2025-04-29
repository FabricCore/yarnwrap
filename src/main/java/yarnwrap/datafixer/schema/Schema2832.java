package yarnwrap.datafixer.schema;
public class Schema2832 { public net.minecraft.datafixer.schema.Schema2832 wrapperContained; public Schema2832(net.minecraft.datafixer.schema.Schema2832 wrapperContained) { this.wrapperContained = wrapperContained; }

public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema2832.registerTypes(schema,entityTypes,blockEntityTypes); }

}