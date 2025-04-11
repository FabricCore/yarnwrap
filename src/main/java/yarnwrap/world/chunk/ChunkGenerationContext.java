package yarnwrap.world.chunk;
public class ChunkGenerationContext { public net.minecraft.world.chunk.ChunkGenerationContext wrapperContained; public ChunkGenerationContext(net.minecraft.world.chunk.ChunkGenerationContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider); }
// public void lightingProvider(yarnwrap.server.world.ServerLightingProvider value) { wrapperContained.lightingProvider = value.wrapperContained; }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
// public yarnwrap.server.world.ServerLightingProvider lightingProvider() { return new yarnwrap.server.world.ServerLightingProvider(wrapperContained.lightingProvider()); }

}