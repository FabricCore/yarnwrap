package yarnwrap.client.render.block;
public class BlockRenderManager { public net.minecraft.client.render.block.BlockRenderManager wrapperContained; public BlockRenderManager(net.minecraft.client.render.block.BlockRenderManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public yarnwrap.client.render.item.BuiltinModelItemRenderer builtinModelItemRenderer() { return new yarnwrap.client.render.item.BuiltinModelItemRenderer(wrapperContained.builtinModelItemRenderer); }
// public yarnwrap.client.render.block.FluidRenderer fluidRenderer() { return new yarnwrap.client.render.block.FluidRenderer(wrapperContained.fluidRenderer); }
// public yarnwrap.client.render.block.BlockModels models() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.models); }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public yarnwrap.client.render.block.BlockModelRenderer blockModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(wrapperContained.blockModelRenderer); }
public void renderDamage(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer) { wrapperContained.renderDamage(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained); }
public yarnwrap.client.render.model.BakedModel getModel(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.getModel(state.wrapperContained)); }
public yarnwrap.client.render.block.BlockModelRenderer getModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(wrapperContained.getModelRenderer()); }
public yarnwrap.client.render.block.BlockModels getModels() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.getModels()); }
public void renderFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { wrapperContained.renderFluid(pos.wrapperContained,world.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
public void renderBlockAsEntity(yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.renderBlockAsEntity(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
public void renderBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,boolean cull,yarnwrap.util.math.random.Random random) { wrapperContained.renderBlock(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained,cull,random.wrapperContained); }

}