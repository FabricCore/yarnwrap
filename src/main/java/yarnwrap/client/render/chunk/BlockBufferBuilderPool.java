package yarnwrap.client.render.chunk;
public class BlockBufferBuilderPool { public net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained; public BlockBufferBuilderPool(net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.render.chunk.BlockBufferBuilderPool.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.render.chunk.BlockBufferBuilderPool.LOGGER = value; }

// public java.util.Queue availableBuilders() { return wrapperContained.availableBuilders; }
// public void availableBuilders(java.util.Queue value) { wrapperContained.availableBuilders = value; }
// public static java.util.Queue availableBuilders() { return net.minecraft.client.render.chunk.BlockBufferBuilderPool.availableBuilders; }
// public static void availableBuilders(java.util.Queue value, ) { net.minecraft.client.render.chunk.BlockBufferBuilderPool.availableBuilders = value; }

// public int availableBuilderCount() { return wrapperContained.availableBuilderCount; }
// public void availableBuilderCount(int value) { wrapperContained.availableBuilderCount = value; }
// public static int availableBuilderCount() { return net.minecraft.client.render.chunk.BlockBufferBuilderPool.availableBuilderCount; }
// public static void availableBuilderCount(int value, ) { net.minecraft.client.render.chunk.BlockBufferBuilderPool.availableBuilderCount = value; }

// public BlockBufferBuilderPool(java.util.List availableBuilders) { this.wrapperContained = new net.minecraft.client.render.chunk.BlockBufferBuilderPool(availableBuilders); }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage acquire() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.acquire()); }
// public static yarnwrap.client.render.chunk.BlockBufferAllocatorStorage acquire() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(net.minecraft.client.render.chunk.BlockBufferBuilderPool.acquire()); }
// public yarnwrap.client.render.chunk.BlockBufferBuilderPool allocate(int max) { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.allocate(max)); }
// public static yarnwrap.client.render.chunk.BlockBufferBuilderPool allocate(int max, ) { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(net.minecraft.client.render.chunk.BlockBufferBuilderPool.allocate(max)); }
public void release(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage builders) { wrapperContained.release(builders.wrapperContained); }
// public static void release(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage builders, ) { net.minecraft.client.render.chunk.BlockBufferBuilderPool.release(builders.wrapperContained); }
public boolean hasNoAvailableBuilder() { return wrapperContained.hasNoAvailableBuilder(); }
// public static boolean hasNoAvailableBuilder() { return net.minecraft.client.render.chunk.BlockBufferBuilderPool.hasNoAvailableBuilder(); }
public int getAvailableBuilderCount() { return wrapperContained.getAvailableBuilderCount(); }
// public static int getAvailableBuilderCount() { return net.minecraft.client.render.chunk.BlockBufferBuilderPool.getAvailableBuilderCount(); }

}