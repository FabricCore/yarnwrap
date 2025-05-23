package yarnwrap.client.render.chunk;
public class BlockBufferAllocatorStorage { public net.minecraft.client.render.chunk.BlockBufferAllocatorStorage wrapperContained; public BlockBufferAllocatorStorage(net.minecraft.client.render.chunk.BlockBufferAllocatorStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map allocators() { return wrapperContained.allocators; }
// public void allocators(java.util.Map value) { wrapperContained.allocators = value; }
// public static java.util.Map allocators() { return net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.allocators; }
// public static void allocators(java.util.Map value, ) { net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.allocators = value; }

// public int EXPECTED_TOTAL_SIZE() { return wrapperContained.EXPECTED_TOTAL_SIZE; }
// public void EXPECTED_TOTAL_SIZE(int value) { wrapperContained.EXPECTED_TOTAL_SIZE = value; }
public static int EXPECTED_TOTAL_SIZE() { return net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.EXPECTED_TOTAL_SIZE; }
// public static void EXPECTED_TOTAL_SIZE(int value, ) { net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.EXPECTED_TOTAL_SIZE = value; }

// public yarnwrap.client.util.BufferAllocator get() { return new yarnwrap.client.util.BufferAllocator(wrapperContained.get()); }
// public static yarnwrap.client.util.BufferAllocator get() { return new yarnwrap.client.util.BufferAllocator(net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.get()); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.clear(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.chunk.BlockBufferAllocatorStorage.reset(); }

}