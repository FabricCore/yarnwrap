package yarnwrap.client.render.entity;
public class ItemEntityRenderer { public net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained; public ItemEntityRenderer(net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.render.entity.ItemEntityRenderer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.render.entity.ItemEntityRenderer.random = value.wrapperContained; }

// public yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelManager); }
// public void itemModelManager(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelManager = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.render.entity.ItemEntityRenderer.itemModelManager); }
// public static void itemModelManager(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.render.entity.ItemEntityRenderer.itemModelManager = value.wrapperContained; }

// public void renderStack(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.state.ItemStackEntityRenderState state,yarnwrap.util.math.random.Random random,yarnwrap.util.math.Box box) { wrapperContained.renderStack(matrices.wrapperContained,vertexConsumers.wrapperContained,light,state.wrapperContained,random.wrapperContained,box.wrapperContained); }
// public static void renderStack(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.client.render.entity.state.ItemStackEntityRenderState state,yarnwrap.util.math.random.Random random,yarnwrap.util.math.Box box, ) { net.minecraft.client.render.entity.ItemEntityRenderer.renderStack(matrices.wrapperContained,vertexConsumers.wrapperContained,light,state.wrapperContained,random.wrapperContained,box.wrapperContained); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider provider,int light,yarnwrap.client.render.entity.state.ItemStackEntityRenderState state,yarnwrap.util.math.random.Random random) { wrapperContained.render(matrices.wrapperContained,provider.wrapperContained,light,state.wrapperContained,random.wrapperContained); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider provider,int light,yarnwrap.client.render.entity.state.ItemStackEntityRenderState state,yarnwrap.util.math.random.Random random, ) { net.minecraft.client.render.entity.ItemEntityRenderer.render(matrices.wrapperContained,provider.wrapperContained,light,state.wrapperContained,random.wrapperContained); }
// public yarnwrap.util.math.Box getBoundingBox(yarnwrap.client.render.item.ItemRenderState state) { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox(state.wrapperContained)); }
// public static yarnwrap.util.math.Box getBoundingBox(yarnwrap.client.render.item.ItemRenderState state, ) { return new yarnwrap.util.math.Box(net.minecraft.client.render.entity.ItemEntityRenderer.getBoundingBox(state.wrapperContained)); }

}