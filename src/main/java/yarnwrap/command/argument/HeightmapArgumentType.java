package yarnwrap.command.argument;
public class HeightmapArgumentType { public net.minecraft.command.argument.HeightmapArgumentType wrapperContained; public HeightmapArgumentType(net.minecraft.command.argument.HeightmapArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec HEIGHTMAP_CODEC() { return wrapperContained.HEIGHTMAP_CODEC; }
// public void HEIGHTMAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.HEIGHTMAP_CODEC = value; }
// public static com.mojang.serialization.Codec HEIGHTMAP_CODEC() { return net.minecraft.command.argument.HeightmapArgumentType.HEIGHTMAP_CODEC; }
// public static void HEIGHTMAP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.command.argument.HeightmapArgumentType.HEIGHTMAP_CODEC = value; }

// public yarnwrap.command.argument.HeightmapArgumentType heightmap() { return new yarnwrap.command.argument.HeightmapArgumentType(wrapperContained.heightmap()); }
public static yarnwrap.command.argument.HeightmapArgumentType heightmap() { return new yarnwrap.command.argument.HeightmapArgumentType(net.minecraft.command.argument.HeightmapArgumentType.heightmap()); }
// public Object getHeightmap(com.mojang.brigadier.context.CommandContext context,java.lang.String id) { return wrapperContained.getHeightmap(context,id); }
// public static Object getHeightmap(com.mojang.brigadier.context.CommandContext context,java.lang.String id, ) { return net.minecraft.command.argument.HeightmapArgumentType.getHeightmap(context,id); }
// public Object getHeightmapTypes() { return wrapperContained.getHeightmapTypes(); }
// public static Object getHeightmapTypes() { return net.minecraft.command.argument.HeightmapArgumentType.getHeightmapTypes(); }
// public java.lang.String method_49547(java.lang.String name) { return wrapperContained.method_49547(name); }
// public static java.lang.String method_49547(java.lang.String name, ) { return net.minecraft.command.argument.HeightmapArgumentType.method_49547(name); }

}