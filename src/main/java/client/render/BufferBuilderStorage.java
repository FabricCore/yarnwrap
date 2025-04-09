package yarnwrap.client.render;
public class BufferBuilderStorage { public net.minecraft.client.render.BufferBuilderStorage wrapperContained; public BufferBuilderStorage(net.minecraft.client.render.BufferBuilderStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage blockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.blockBufferBuilders); }
// public Object effectVertexConsumers() { return wrapperContained.effectVertexConsumers; }
// public yarnwrap.client.render.OutlineVertexConsumerProvider outlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.outlineVertexConsumers); }
// public yarnwrap.client.render.chunk.BlockBufferBuilderPool blockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.blockBufferBuildersPool); }
// public Object entityVertexConsumers() { return wrapperContained.entityVertexConsumers; }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage getBlockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.getBlockBufferBuilders()); }
public Object getEntityVertexConsumers() { return wrapperContained.getEntityVertexConsumers(); }
public Object getEffectVertexConsumers() { return wrapperContained.getEffectVertexConsumers(); }
public yarnwrap.client.render.OutlineVertexConsumerProvider getOutlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.getOutlineVertexConsumers()); }
// public void assignBufferBuilder(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap builderStorage,yarnwrap.client.render.RenderLayer layer) { wrapperContained.assignBufferBuilder(builderStorage,layer.wrapperContained); }
public yarnwrap.client.render.chunk.BlockBufferBuilderPool getBlockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.getBlockBufferBuildersPool()); }

}