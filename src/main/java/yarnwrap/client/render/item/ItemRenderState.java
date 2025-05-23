package yarnwrap.client.render.item;
public class ItemRenderState { public net.minecraft.client.render.item.ItemRenderState wrapperContained; public ItemRenderState(net.minecraft.client.render.item.ItemRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.item.ItemDisplayContext displayContext() { return new yarnwrap.item.ItemDisplayContext(wrapperContained.displayContext); }
// public void displayContext(yarnwrap.item.ItemDisplayContext value) { wrapperContained.displayContext = value.wrapperContained; }
// public static yarnwrap.item.ItemDisplayContext displayContext() { return new yarnwrap.item.ItemDisplayContext(net.minecraft.client.render.item.ItemRenderState.displayContext); }
// public static void displayContext(yarnwrap.item.ItemDisplayContext value, ) { net.minecraft.client.render.item.ItemRenderState.displayContext = value.wrapperContained; }

// public int layerCount() { return wrapperContained.layerCount; }
// public void layerCount(int value) { wrapperContained.layerCount = value; }
// public static int layerCount() { return net.minecraft.client.render.item.ItemRenderState.layerCount; }
// public static void layerCount(int value, ) { net.minecraft.client.render.item.ItemRenderState.layerCount = value; }

// public Object layers() { return wrapperContained.layers; }
// // public void layers(Object value) { wrapperContained.layers = value; }
// // public static Object layers() { return net.minecraft.client.render.item.ItemRenderState.layers; }
// // public static void layers(Object value, ) { net.minecraft.client.render.item.ItemRenderState.layers = value; }

// public boolean animated() { return wrapperContained.animated; }
// public void animated(boolean value) { wrapperContained.animated = value; }
// public static boolean animated() { return net.minecraft.client.render.item.ItemRenderState.animated; }
// public static void animated(boolean value, ) { net.minecraft.client.render.item.ItemRenderState.animated = value; }

// public java.util.List modelKey() { return wrapperContained.modelKey; }
// public void modelKey(java.util.List value) { wrapperContained.modelKey = value; }
// public static java.util.List modelKey() { return net.minecraft.client.render.item.ItemRenderState.modelKey; }
// public static void modelKey(java.util.List value, ) { net.minecraft.client.render.item.ItemRenderState.modelKey = value; }

public Object newLayer() { return wrapperContained.newLayer(); }
// public static Object newLayer() { return net.minecraft.client.render.item.ItemRenderState.newLayer(); }
public void addLayers(int add) { wrapperContained.addLayers(add); }
// public static void addLayers(int add, ) { net.minecraft.client.render.item.ItemRenderState.addLayers(add); }
public yarnwrap.client.texture.Sprite getParticleSprite(yarnwrap.util.math.random.Random random) { return new yarnwrap.client.texture.Sprite(wrapperContained.getParticleSprite(random.wrapperContained)); }
// public static yarnwrap.client.texture.Sprite getParticleSprite(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.item.ItemRenderState.getParticleSprite(random.wrapperContained)); }
public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay, ) { net.minecraft.client.render.item.ItemRenderState.render(matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.client.render.item.ItemRenderState.clear(); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.render.item.ItemRenderState.isEmpty(); }
public boolean isSideLit() { return wrapperContained.isSideLit(); }
// public static boolean isSideLit() { return net.minecraft.client.render.item.ItemRenderState.isSideLit(); }
// public Object getFirstLayer() { return wrapperContained.getFirstLayer(); }
// public static Object getFirstLayer() { return net.minecraft.client.render.item.ItemRenderState.getFirstLayer(); }
public void load(java.util.function.Consumer posConsumer) { wrapperContained.load(posConsumer); }
// public static void load(java.util.function.Consumer posConsumer, ) { net.minecraft.client.render.item.ItemRenderState.load(posConsumer); }
// public void addModelKey(java.lang.Object modelKey) { wrapperContained.addModelKey(modelKey); }
// public static void addModelKey(java.lang.Object modelKey, ) { net.minecraft.client.render.item.ItemRenderState.addModelKey(modelKey); }
// public void markAnimated() { wrapperContained.markAnimated(); }
// public static void markAnimated() { net.minecraft.client.render.item.ItemRenderState.markAnimated(); }
// public boolean isAnimated() { return wrapperContained.isAnimated(); }
// public static boolean isAnimated() { return net.minecraft.client.render.item.ItemRenderState.isAnimated(); }
// public java.lang.Object getModelKey() { return wrapperContained.getModelKey(); }
// public static java.lang.Object getModelKey() { return net.minecraft.client.render.item.ItemRenderState.getModelKey(); }
// public void clearModelKey() { wrapperContained.clearModelKey(); }
// public static void clearModelKey() { net.minecraft.client.render.item.ItemRenderState.clearModelKey(); }

}