package yarnwrap.client.render.chunk;
public class BlockBufferBuilderPool { public net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained; public BlockBufferBuilderPool(net.minecraft.client.render.chunk.BlockBufferBuilderPool wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Queue availableBuilders() { return wrapperContained.availableBuilders; }
// public int availableBuilderCount() { return wrapperContained.availableBuilderCount; }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage acquire() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.acquire()); }
public yarnwrap.client.render.chunk.BlockBufferBuilderPool allocate(int max) { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.allocate(max)); }
public void release(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage builders) { wrapperContained.release(builders.wrapperContained); }
public boolean hasNoAvailableBuilder() { return wrapperContained.hasNoAvailableBuilder(); }
public int getAvailableBuilderCount() { return wrapperContained.getAvailableBuilderCount(); }

}