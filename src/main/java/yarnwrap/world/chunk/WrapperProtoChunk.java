package yarnwrap.world.chunk;
public class WrapperProtoChunk { public net.minecraft.world.chunk.WrapperProtoChunk wrapperContained; public WrapperProtoChunk(net.minecraft.world.chunk.WrapperProtoChunk wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.WorldChunk wrapped() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.wrapped); }
// public void wrapped(yarnwrap.world.chunk.WorldChunk value) { wrapperContained.wrapped = value.wrapperContained; }
// public boolean propagateToWrapped() { return wrapperContained.propagateToWrapped; }
// public void propagateToWrapped(boolean value) { wrapperContained.propagateToWrapped = value; }
public WrapperProtoChunk(yarnwrap.world.chunk.WorldChunk wrapped,boolean propagateToWrapped) { this.wrapperContained = new net.minecraft.world.chunk.WrapperProtoChunk(wrapped.wrapperContained,propagateToWrapped); }
// public Object transformHeightmapType(Object type) { return wrapperContained.transformHeightmapType(type); }
public yarnwrap.world.chunk.WorldChunk getWrappedChunk() { return new yarnwrap.world.chunk.WorldChunk(wrapperContained.getWrappedChunk()); }

}