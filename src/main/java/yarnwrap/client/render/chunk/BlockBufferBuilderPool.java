package yarnwrap.client.render.chunk;
public class BlockBufferBuilderPool { public net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained; public BlockBufferBuilderPool(net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Queue availableBuilders() { return wrapperContained.availableBuilders; }
// public void availableBuilders(java.util.Queue value) { wrapperContained.availableBuilders = value; }
// public int availableBuilderCount() { return wrapperContained.availableBuilderCount; }
// public void availableBuilderCount(int value) { wrapperContained.availableBuilderCount = value; }
// public BlockBufferBuilderPool(java.util.List availableBuilders) { this.wrapperContained = new net.minecraft.client.render.chunk.BlockBufferBuilderPool(availableBuilders); }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage acquire() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.acquire()); }
public yarnwrap.client.render.chunk.BlockBufferBuilderPool allocate(int max) { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.allocate(max)); }
public void release(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage builders) { wrapperContained.release(builders.wrapperContained); }
public boolean hasNoAvailableBuilder() { return wrapperContained.hasNoAvailableBuilder(); }
public int getAvailableBuilderCount() { return wrapperContained.getAvailableBuilderCount(); }

}