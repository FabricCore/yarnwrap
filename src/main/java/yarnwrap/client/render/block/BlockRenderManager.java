package yarnwrap.client.render.block;
public class BlockRenderManager { public net.minecraft.client.render.block.BlockRenderManager wrapperContained; public BlockRenderManager(net.minecraft.client.render.block.BlockRenderManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.block.FluidRenderer fluidRenderer() { return new yarnwrap.client.render.block.FluidRenderer(wrapperContained.fluidRenderer); }
// public void fluidRenderer(yarnwrap.client.render.block.FluidRenderer value) { wrapperContained.fluidRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.FluidRenderer fluidRenderer() { return new yarnwrap.client.render.block.FluidRenderer(net.minecraft.client.render.block.BlockRenderManager.fluidRenderer); }
// public static void fluidRenderer(yarnwrap.client.render.block.FluidRenderer value, ) { net.minecraft.client.render.block.BlockRenderManager.fluidRenderer = value.wrapperContained; }

// public yarnwrap.client.render.block.BlockModels models() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.models); }
// public void models(yarnwrap.client.render.block.BlockModels value) { wrapperContained.models = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockModels models() { return new yarnwrap.client.render.block.BlockModels(net.minecraft.client.render.block.BlockRenderManager.models); }
// public static void models(yarnwrap.client.render.block.BlockModels value, ) { net.minecraft.client.render.block.BlockRenderManager.models = value.wrapperContained; }

// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(net.minecraft.client.render.block.BlockRenderManager.random); }
// public static void random(yarnwrap.util.math.random.Random value, ) { net.minecraft.client.render.block.BlockRenderManager.random = value.wrapperContained; }

// public yarnwrap.client.render.block.BlockModelRenderer blockModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(wrapperContained.blockModelRenderer); }
// public void blockModelRenderer(yarnwrap.client.render.block.BlockModelRenderer value) { wrapperContained.blockModelRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.block.BlockModelRenderer blockModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(net.minecraft.client.render.block.BlockRenderManager.blockModelRenderer); }
// public static void blockModelRenderer(yarnwrap.client.render.block.BlockModelRenderer value, ) { net.minecraft.client.render.block.BlockRenderManager.blockModelRenderer = value.wrapperContained; }

// public yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.blockColors); }
// public void blockColors(yarnwrap.client.color.block.BlockColors value) { wrapperContained.blockColors = value.wrapperContained; }
// public static yarnwrap.client.color.block.BlockColors blockColors() { return new yarnwrap.client.color.block.BlockColors(net.minecraft.client.render.block.BlockRenderManager.blockColors); }
// public static void blockColors(yarnwrap.client.color.block.BlockColors value, ) { net.minecraft.client.render.block.BlockRenderManager.blockColors = value.wrapperContained; }

// public java.util.function.Supplier blockEntityModelsGetter() { return wrapperContained.blockEntityModelsGetter; }
// public void blockEntityModelsGetter(java.util.function.Supplier value) { wrapperContained.blockEntityModelsGetter = value; }
// public static java.util.function.Supplier blockEntityModelsGetter() { return net.minecraft.client.render.block.BlockRenderManager.blockEntityModelsGetter; }
// public static void blockEntityModelsGetter(java.util.function.Supplier value, ) { net.minecraft.client.render.block.BlockRenderManager.blockEntityModelsGetter = value; }

// public java.util.List parts() { return wrapperContained.parts; }
// public void parts(java.util.List value) { wrapperContained.parts = value; }
// public static java.util.List parts() { return net.minecraft.client.render.block.BlockRenderManager.parts; }
// public static void parts(java.util.List value, ) { net.minecraft.client.render.block.BlockRenderManager.parts = value; }

public BlockRenderManager(yarnwrap.client.render.block.BlockModels models,java.util.function.Supplier blockEntityModelsGetter,yarnwrap.client.color.block.BlockColors blockColors) { this.wrapperContained = new net.minecraft.client.render.block.BlockRenderManager(models.wrapperContained,blockEntityModelsGetter,blockColors.wrapperContained); }
public yarnwrap.client.render.model.BlockStateModel getModel(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.model.BlockStateModel(wrapperContained.getModel(state.wrapperContained)); }
// public static yarnwrap.client.render.model.BlockStateModel getModel(yarnwrap.block.BlockState state, ) { return new yarnwrap.client.render.model.BlockStateModel(net.minecraft.client.render.block.BlockRenderManager.getModel(state.wrapperContained)); }
public yarnwrap.client.render.block.BlockModelRenderer getModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(wrapperContained.getModelRenderer()); }
// public static yarnwrap.client.render.block.BlockModelRenderer getModelRenderer() { return new yarnwrap.client.render.block.BlockModelRenderer(net.minecraft.client.render.block.BlockRenderManager.getModelRenderer()); }
public yarnwrap.client.render.block.BlockModels getModels() { return new yarnwrap.client.render.block.BlockModels(wrapperContained.getModels()); }
// public static yarnwrap.client.render.block.BlockModels getModels() { return new yarnwrap.client.render.block.BlockModels(net.minecraft.client.render.block.BlockRenderManager.getModels()); }
public void renderFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { wrapperContained.renderFluid(pos.wrapperContained,world.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public static void renderFluid(yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState, ) { net.minecraft.client.render.block.BlockRenderManager.renderFluid(pos.wrapperContained,world.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
public void renderBlockAsEntity(yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay) { wrapperContained.renderBlockAsEntity(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
// public static void renderBlockAsEntity(yarnwrap.block.BlockState state,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,int light,int overlay, ) { net.minecraft.client.render.block.BlockRenderManager.renderBlockAsEntity(state.wrapperContained,matrices.wrapperContained,vertexConsumers.wrapperContained,light,overlay); }
public void renderBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,boolean cull,java.util.List parts) { wrapperContained.renderBlock(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained,cull,parts); }
// public static void renderBlock(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,boolean cull,java.util.List parts, ) { net.minecraft.client.render.block.BlockRenderManager.renderBlock(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained,cull,parts); }
public void renderDamage(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer) { wrapperContained.renderDamage(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained); }
// public static void renderDamage(yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos,yarnwrap.world.BlockRenderView world,yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer, ) { net.minecraft.client.render.block.BlockRenderManager.renderDamage(state.wrapperContained,pos.wrapperContained,world.wrapperContained,matrices.wrapperContained,vertexConsumer.wrapperContained); }

}