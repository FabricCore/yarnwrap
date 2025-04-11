package yarnwrap.client.render;
public class BufferBuilderStorage { public net.minecraft.client.render.BufferBuilderStorage wrapperContained; public BufferBuilderStorage(net.minecraft.client.render.BufferBuilderStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage blockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.blockBufferBuilders); }
// public void blockBufferBuilders(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value) { wrapperContained.blockBufferBuilders = value.wrapperContained; }
// public Object effectVertexConsumers() { return wrapperContained.effectVertexConsumers; }
// // public void effectVertexConsumers(Object value) { wrapperContained.effectVertexConsumers = value; }
// public yarnwrap.client.render.OutlineVertexConsumerProvider outlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.outlineVertexConsumers); }
// public void outlineVertexConsumers(yarnwrap.client.render.OutlineVertexConsumerProvider value) { wrapperContained.outlineVertexConsumers = value.wrapperContained; }
// public yarnwrap.client.render.chunk.BlockBufferBuilderPool blockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.blockBufferBuildersPool); }
// public void blockBufferBuildersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value) { wrapperContained.blockBufferBuildersPool = value.wrapperContained; }
// public Object entityVertexConsumers() { return wrapperContained.entityVertexConsumers; }
// // public void entityVertexConsumers(Object value) { wrapperContained.entityVertexConsumers = value; }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage getBlockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.getBlockBufferBuilders()); }
public Object getEntityVertexConsumers() { return wrapperContained.getEntityVertexConsumers(); }
public Object getEffectVertexConsumers() { return wrapperContained.getEffectVertexConsumers(); }
public yarnwrap.client.render.OutlineVertexConsumerProvider getOutlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.getOutlineVertexConsumers()); }
// public void assignBufferBuilder(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap builderStorage,yarnwrap.client.render.RenderLayer layer) { wrapperContained.assignBufferBuilder(builderStorage,layer.wrapperContained); }
public yarnwrap.client.render.chunk.BlockBufferBuilderPool getBlockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.getBlockBufferBuildersPool()); }

}