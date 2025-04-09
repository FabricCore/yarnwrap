package yarnwrap.world.chunk.light;
public class ChunkLightingView { public net.minecraft.world.chunk.light.ChunkLightingView wrapperContained; public ChunkLightingView(net.minecraft.world.chunk.light.ChunkLightingView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getLightLevel(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLightLevel(pos.wrapperContained); }
public yarnwrap.world.chunk.ChunkNibbleArray getLightSection(yarnwrap.util.math.ChunkSectionPos pos) { return new yarnwrap.world.chunk.ChunkNibbleArray(wrapperContained.getLightSection(pos.wrapperContained)); }

}