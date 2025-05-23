package yarnwrap.client.render;
public class BufferBuilderStorage { public net.minecraft.client.render.BufferBuilderStorage wrapperContained; public BufferBuilderStorage(net.minecraft.client.render.BufferBuilderStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage blockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.blockBufferBuilders); }
// public void blockBufferBuilders(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value) { wrapperContained.blockBufferBuilders = value.wrapperContained; }
// public static yarnwrap.client.render.chunk.BlockBufferAllocatorStorage blockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(net.minecraft.client.render.BufferBuilderStorage.blockBufferBuilders); }
// public static void blockBufferBuilders(yarnwrap.client.render.chunk.BlockBufferAllocatorStorage value, ) { net.minecraft.client.render.BufferBuilderStorage.blockBufferBuilders = value.wrapperContained; }

// public Object effectVertexConsumers() { return wrapperContained.effectVertexConsumers; }
// // public void effectVertexConsumers(Object value) { wrapperContained.effectVertexConsumers = value; }
// // public static Object effectVertexConsumers() { return net.minecraft.client.render.BufferBuilderStorage.effectVertexConsumers; }
// // public static void effectVertexConsumers(Object value, ) { net.minecraft.client.render.BufferBuilderStorage.effectVertexConsumers = value; }

// public yarnwrap.client.render.OutlineVertexConsumerProvider outlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.outlineVertexConsumers); }
// public void outlineVertexConsumers(yarnwrap.client.render.OutlineVertexConsumerProvider value) { wrapperContained.outlineVertexConsumers = value.wrapperContained; }
// public static yarnwrap.client.render.OutlineVertexConsumerProvider outlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(net.minecraft.client.render.BufferBuilderStorage.outlineVertexConsumers); }
// public static void outlineVertexConsumers(yarnwrap.client.render.OutlineVertexConsumerProvider value, ) { net.minecraft.client.render.BufferBuilderStorage.outlineVertexConsumers = value.wrapperContained; }

// public yarnwrap.client.render.chunk.BlockBufferBuilderPool blockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.blockBufferBuildersPool); }
// public void blockBufferBuildersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value) { wrapperContained.blockBufferBuildersPool = value.wrapperContained; }
// public static yarnwrap.client.render.chunk.BlockBufferBuilderPool blockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(net.minecraft.client.render.BufferBuilderStorage.blockBufferBuildersPool); }
// public static void blockBufferBuildersPool(yarnwrap.client.render.chunk.BlockBufferBuilderPool value, ) { net.minecraft.client.render.BufferBuilderStorage.blockBufferBuildersPool = value.wrapperContained; }

// public Object entityVertexConsumers() { return wrapperContained.entityVertexConsumers; }
// // public void entityVertexConsumers(Object value) { wrapperContained.entityVertexConsumers = value; }
// // public static Object entityVertexConsumers() { return net.minecraft.client.render.BufferBuilderStorage.entityVertexConsumers; }
// // public static void entityVertexConsumers(Object value, ) { net.minecraft.client.render.BufferBuilderStorage.entityVertexConsumers = value; }

public BufferBuilderStorage(int maxBlockBuildersPoolSize) { this.wrapperContained = new net.minecraft.client.render.BufferBuilderStorage(maxBlockBuildersPoolSize); }
public yarnwrap.client.render.chunk.BlockBufferAllocatorStorage getBlockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(wrapperContained.getBlockBufferBuilders()); }
// public static yarnwrap.client.render.chunk.BlockBufferAllocatorStorage getBlockBufferBuilders() { return new yarnwrap.client.render.chunk.BlockBufferAllocatorStorage(net.minecraft.client.render.BufferBuilderStorage.getBlockBufferBuilders()); }
public Object getEntityVertexConsumers() { return wrapperContained.getEntityVertexConsumers(); }
// public static Object getEntityVertexConsumers() { return net.minecraft.client.render.BufferBuilderStorage.getEntityVertexConsumers(); }
public Object getEffectVertexConsumers() { return wrapperContained.getEffectVertexConsumers(); }
// public static Object getEffectVertexConsumers() { return net.minecraft.client.render.BufferBuilderStorage.getEffectVertexConsumers(); }
public yarnwrap.client.render.OutlineVertexConsumerProvider getOutlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(wrapperContained.getOutlineVertexConsumers()); }
// public static yarnwrap.client.render.OutlineVertexConsumerProvider getOutlineVertexConsumers() { return new yarnwrap.client.render.OutlineVertexConsumerProvider(net.minecraft.client.render.BufferBuilderStorage.getOutlineVertexConsumers()); }
// public void assignBufferBuilder(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap builderStorage,yarnwrap.client.render.RenderLayer layer) { wrapperContained.assignBufferBuilder(builderStorage,layer.wrapperContained); }
// public static void assignBufferBuilder(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap builderStorage,yarnwrap.client.render.RenderLayer layer, ) { net.minecraft.client.render.BufferBuilderStorage.assignBufferBuilder(builderStorage,layer.wrapperContained); }
// public void method_54639(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap map) { wrapperContained.method_54639(map); }
// public static void method_54639(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap map, ) { net.minecraft.client.render.BufferBuilderStorage.method_54639(map); }
public yarnwrap.client.render.chunk.BlockBufferBuilderPool getBlockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(wrapperContained.getBlockBufferBuildersPool()); }
// public static yarnwrap.client.render.chunk.BlockBufferBuilderPool getBlockBufferBuildersPool() { return new yarnwrap.client.render.chunk.BlockBufferBuilderPool(net.minecraft.client.render.BufferBuilderStorage.getBlockBufferBuildersPool()); }
// public void method_54641(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap renderLayer) { wrapperContained.method_54641(renderLayer); }
// public static void method_54641(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap renderLayer, ) { net.minecraft.client.render.BufferBuilderStorage.method_54641(renderLayer); }
// public void method_62263(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap objectMap) { wrapperContained.method_62263(objectMap); }
// public static void method_62263(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap objectMap, ) { net.minecraft.client.render.BufferBuilderStorage.method_62263(objectMap); }

}