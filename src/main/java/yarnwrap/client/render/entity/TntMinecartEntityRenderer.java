package yarnwrap.client.render.entity;
public class TntMinecartEntityRenderer { public net.minecraft.client.render.entity.TntMinecartEntityRenderer wrapperContained; public TntMinecartEntityRenderer(net.minecraft.client.render.entity.TntMinecartEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager tntBlockRenderManager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.tntBlockRenderManager); }
// public void tntBlockRenderManager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.tntBlockRenderManager = value.wrapperContained; }
public void renderFlashingBlock(yarnwrap.client.render.block.BlockRenderManager blockRenderManager,yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,boolean drawFlash) { wrapperContained.renderFlashingBlock(blockRenderManager.wrapperContained,state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,drawFlash); }

}