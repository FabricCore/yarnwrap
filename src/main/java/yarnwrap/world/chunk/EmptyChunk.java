package yarnwrap.world.chunk;
public class EmptyChunk { public net.minecraft.world.chunk.EmptyChunk wrapperContained; public EmptyChunk(net.minecraft.world.chunk.EmptyChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry biomeEntry() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biomeEntry); }
// public void biomeEntry(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.biomeEntry = value.wrapperContained; }
public EmptyChunk(yarnwrap.world.World world,yarnwrap.util.math.ChunkPos pos,yarnwrap.registry.entry.RegistryEntry biomeEntry) { this.wrapperContained = new net.minecraft.world.chunk.EmptyChunk(world.wrapperContained,pos.wrapperContained,biomeEntry.wrapperContained); }

}