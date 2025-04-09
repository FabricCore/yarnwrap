package yarnwrap.world.chunk;
public class WrapperProtoChunk { public net.minecraft.world.chunk.WrapperProtoChunk wrapperContained; public WrapperProtoChunk(net.minecraft.world.chunk.WrapperProtoChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.WorldChunk wrapped() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.wrapped); }
// public boolean propagateToWrapped() { return wrapperContained.propagateToWrapped; }
// public Object transformHeightmapType(Object type) { return wrapperContained.transformHeightmapType(type); }
public yarnwrap.world.chunk.WorldChunk getWrappedChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWrappedChunk()); }

}