package yarnwrap.client.render.block.entity;
public class VaultBlockEntityRenderer { public net.minecraft.client.render.block.entity.VaultBlockEntityRenderer wrapperContained; public VaultBlockEntityRenderer(net.minecraft.client.render.block.entity.VaultBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
public void renderDisplayItem(float tickDelta,yarnwrap.world.World world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,yarnwrap.item.ItemStack stack,yarnwrap.client.render.item.ItemRenderer itemRenderer,float prevRotation,float rotation,yarnwrap.util.math.random.Random random) { wrapperContained.renderDisplayItem(tickDelta,world.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,stack.wrapperContained,itemRenderer.wrapperContained,prevRotation,rotation,random.wrapperContained); }

}