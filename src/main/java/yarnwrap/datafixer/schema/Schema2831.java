package yarnwrap.datafixer.schema;
public class Schema2831 { public net.minecraft.datafixer.schema.Schema2831 wrapperContained; public Schema2831(net.minecraft.datafixer.schema.Schema2831 wrapperContained) { this.wrapperContained = wrapperContained; }

public void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes) { wrapperContained.registerTypes(schema,entityTypes,blockEntityTypes); }
// public static void registerTypes(com.mojang.datafixers.schemas.Schema schema,java.util.Map entityTypes,java.util.Map blockEntityTypes, ) { net.minecraft.datafixer.schema.Schema2831.registerTypes(schema,entityTypes,blockEntityTypes); }

}