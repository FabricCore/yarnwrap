package yarnwrap.server.world;
public class ChunkLevelType { public net.minecraft.server.world.ChunkLevelType wrapperContained; public ChunkLevelType(net.minecraft.server.world.ChunkLevelType wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAfter(yarnwrap.server.world.ChunkLevelType levelType) { return wrapperContained.isAfter(levelType.wrapperContained); }
// public static boolean isAfter(yarnwrap.server.world.ChunkLevelType levelType, ) { return net.minecraft.server.world.ChunkLevelType.isAfter(levelType.wrapperContained); }

}