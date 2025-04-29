package yarnwrap.client.render.block.entity;
public class VaultBlockEntityRenderer { public net.minecraft.client.render.block.entity.VaultBlockEntityRenderer wrapperContained; public VaultBlockEntityRenderer(net.minecraft.client.render.block.entity.VaultBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.block.entity.VaultBlockEntityRenderer.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.block.entity.VaultBlockEntityRenderer.itemRenderer = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.render.block.entity.VaultBlockEntityRenderer.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.render.block.entity.VaultBlockEntityRenderer.random = value.wrapperContained; }

// public VaultBlockEntityRenderer(Object context) { this.wrapperContained = new net.minecraft.client.render.block.entity.VaultBlockEntityRenderer(context); }
// public void renderDisplayItem(float tickDelta,yarnwrap.world.World world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.item.ItemRenderer itemRenderer,float prevRotation,float rotation,yarnwrap.util.math.random.Random random) { wrapperContained.renderDisplayItem(tickDelta,world.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,itemRenderer.wrapperContained,prevRotation,rotation,random.wrapperContained); }
// public static void renderDisplayItem(float tickDelta,yarnwrap.world.World world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.item.ItemRenderer itemRenderer,float prevRotation,float rotation,yarnwrap.util.math.random.Random random, ) { net.minecraft.client.render.block.entity.VaultBlockEntityRenderer.renderDisplayItem(tickDelta,world.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,itemRenderer.wrapperContained,prevRotation,rotation,random.wrapperContained); }

}