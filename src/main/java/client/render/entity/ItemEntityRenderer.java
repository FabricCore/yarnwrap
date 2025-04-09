package yarnwrap.client.render.entity;
public class ItemEntityRenderer { public net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained; public ItemEntityRenderer(net.minecraft.client.render.entity.ItemEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public int getRenderedAmount(int stackSize) { return wrapperContained.getRenderedAmount(stackSize); }
public int getSeed(yarnwrap.item.ItemStack stack) { return wrapperContained.getSeed(stack.wrapperContained); }
public void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random,yarnwrap.world.World world) { wrapperContained.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,random.wrapperContained,world.wrapperContained); }
public void renderStack(yarnwrap.client.render.item.ItemRenderer itemRenderer,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.model.BakedModel model,boolean depth,yarnwrap.util.math.random.Random random) { wrapperContained.renderStack(itemRenderer.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,model.wrapperContained,depth,random.wrapperContained); }

}