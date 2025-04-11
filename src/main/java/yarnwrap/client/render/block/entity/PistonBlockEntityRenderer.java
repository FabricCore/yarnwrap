package yarnwrap.client.render.block.entity;
public class PistonBlockEntityRenderer { public net.minecraft.client.render.block.entity.PistonBlockEntityRenderer wrapperContained; public PistonBlockEntityRenderer(net.minecraft.client.render.block.entity.PistonBlockEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.BlockRenderManager manager() { return new yarnwrap.client.render.block.BlockRenderManager(wrapperContained.manager); }
// public void manager(yarnwrap.client.render.block.BlockRenderManager value) { wrapperContained.manager = value.wrapperContained; }
// public PistonBlockEntityRenderer(Object ctx) { this.wrapperContained = new net.minecraft.client.render.block.entity.PistonBlockEntityRenderer(ctx); }
// public void renderModel(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.world.World world,boolean cull,int overlay) { wrapperContained.renderModel(pos.wrapperContained,state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,world.wrapperContained,cull,overlay); }

}