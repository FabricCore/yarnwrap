package yarnwrap.client.render.entity;
public class ItemEntityRenderer { public net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained; public ItemEntityRenderer(net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.render.entity.ItemEntityRenderer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.render.entity.ItemEntityRenderer.random = value.wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.entity.ItemEntityRenderer.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.entity.ItemEntityRenderer.itemRenderer = value.wrapperContained; }

// public int getRenderedAmount(int stackSize) { return wrapperContained.getRenderedAmount(stackSize); }
// public static int getRenderedAmount(int stackSize, ) { return net.minecraft.client.render.entity.ItemEntityRenderer.getRenderedAmount(stackSize); }
// public int getSeed(yarnwrap.item.ItemStack stack) { return wrapperContained.getSeed(stack.wrapperContained); }
// public static int getSeed(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.render.entity.ItemEntityRenderer.getSeed(stack.wrapperContained); }
// public void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random,yarnwrap.world.World world) { wrapperContained.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,random.wrapperContained,world.wrapperContained); }
// public static void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random,yarnwrap.world.World world, ) { net.minecraft.client.render.entity.ItemEntityRenderer.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,random.wrapperContained,world.wrapperContained); }
// public void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.BakedModel model,boolean depth,yarnwrap.util.math.random.Random random) { wrapperContained.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,model.wrapperContained,depth,random.wrapperContained); }
// public static void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.BakedModel model,boolean depth,yarnwrap.util.math.random.Random random, ) { net.minecraft.client.render.entity.ItemEntityRenderer.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,model.wrapperContained,depth,random.wrapperContained); }

}