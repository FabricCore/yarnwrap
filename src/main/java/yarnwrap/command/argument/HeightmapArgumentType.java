package yarnwrap.command.argument;
public class HeightmapArgumentType { public net.minecraft.command.argument.HeightmapArgumentType wrapperContained; public HeightmapArgumentType(net.minecraft.command.argument.HeightmapArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec HEIGHTMAP_CODEC() { return wrapperContained.HEIGHTMAP_CODEC; }
// public void HEIGHTMAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.HEIGHTMAP_CODEC = value; }
public yarnwrap.command.argument.HeightmapArgumentType heightmap() { return new yarnwrap.command.argument.HeightmapArgumentType(wrapperContained.heightmap()); }
public Object getHeightmap(com.mojang.brigadier.context.CommandContext context,java.lang.String id) { return wrapperContained.getHeightmap(context,id); }
// public Object getHeightmapTypes() { return wrapperContained.getHeightmapTypes(); }

}