package yarnwrap.client.render.chunk;
public class BlockBufferAllocatorStorage { public net.minecraft.client.render.chunk.BlockBufferAllocatorStorage wrapperContained; public BlockBufferAllocatorStorage(net.minecraft.client.render.chunk.BlockBufferAllocatorStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map allocators() { return wrapperContained.allocators; }
// public void allocators(java.util.Map value) { wrapperContained.allocators = value; }
public int EXPECTED_TOTAL_SIZE() { return wrapperContained.EXPECTED_TOTAL_SIZE; }
// public void EXPECTED_TOTAL_SIZE(int value) { wrapperContained.EXPECTED_TOTAL_SIZE = value; }
// public java.util.List BLOCK_LAYERS() { return wrapperContained.BLOCK_LAYERS; }
// public void BLOCK_LAYERS(java.util.List value) { wrapperContained.BLOCK_LAYERS = value; }
public void clear() { wrapperContained.clear(); }
public void reset() { wrapperContained.reset(); }
public yarnwrap.client.util.BufferAllocator get(yarnwrap.client.render.RenderLayer layer) { return new yarnwrap.client.util.BufferAllocator(wrapperContained.get(layer.wrapperContained)); }
// public void method_60896(it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap map) { wrapperContained.method_60896(map); }

}