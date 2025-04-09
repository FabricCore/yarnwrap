package yarnwrap.client.render.entity;
public class MinecartEntityRenderer { public net.minecraft.client.render.entity.MinecartEntityRenderer wrapperContained; public MinecartEntityRenderer(net.minecraft.client.render.entity.MinecartEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager blockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.blockRenderManager); }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public yarnwrap.client.render.entity.model.EntityModel model() { return new yarnwrap.client.render.entity.model.EntityModel(wrapperContained.model); }
// public void renderBlock(yarnwrap.entity.vehicle.AbstractMinecartEntity entity,float delta,yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light) { wrapperContained.renderBlock(entity.wrapperContained,delta,state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light); }

}