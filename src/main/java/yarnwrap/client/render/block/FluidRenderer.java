package yarnwrap.client.render.block;
public class FluidRenderer { public net.minecraft.client.render.block.FluidRenderer wrapperContained; public FluidRenderer(net.minecraft.client.render.block.FluidRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite waterOverlaySprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.waterOverlaySprite); }
// public void waterOverlaySprite(yarnwrap.client.texture.Sprite value) { wrapperContained.waterOverlaySprite = value.wrapperContained; }
// public net.minecraft.client.texture.Sprite[] lavaSprites() { return wrapperContained.lavaSprites; }
// public void lavaSprites(net.minecraft.client.texture.Sprite[] value) { wrapperContained.lavaSprites = value; }
// public net.minecraft.client.texture.Sprite[] waterSprites() { return wrapperContained.waterSprites; }
// public void waterSprites(net.minecraft.client.texture.Sprite[] value) { wrapperContained.waterSprites = value; }
// public void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer) { wrapperContained.vertex(vertexConsumer.wrapperContained); }
public boolean shouldRenderSide(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.fluid.FluidState fluidState,yarnwrap.block.BlockState blockState,yarnwrap.util.math.Direction direction,yarnwrap.fluid.FluidState neighborFluidState) { return wrapperContained.shouldRenderSide(world.wrapperContained,pos.wrapperContained,fluidState.wrapperContained,blockState.wrapperContained,direction.wrapperContained,neighborFluidState.wrapperContained); }
// public boolean isOppositeSideCovered(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.Direction direction) { return wrapperContained.isOppositeSideCovered(world.wrapperContained,pos.wrapperContained,state.wrapperContained,direction.wrapperContained); }
// public boolean isSideCovered(yarnwrap.world.BlockView world,yarnwrap.util.math.Direction direction,float height,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return wrapperContained.isSideCovered(world.wrapperContained,direction.wrapperContained,height,pos.wrapperContained,state.wrapperContained); }
// public int getLight(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLight(world.wrapperContained,pos.wrapperContained); }
// public boolean isSideCovered(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,float maxDeviation,yarnwrap.block.BlockState state) { return wrapperContained.isSideCovered(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,maxDeviation,state.wrapperContained); }
// public void onResourceReload() { wrapperContained.onResourceReload(); }
public void render(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { wrapperContained.render(world.wrapperContained,pos.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public boolean isSameFluid(yarnwrap.fluid.FluidState a,yarnwrap.fluid.FluidState b) { return wrapperContained.isSameFluid(a.wrapperContained,b.wrapperContained); }
// public float calculateFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,float originHeight,float northSouthHeight,float eastWestHeight,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateFluidHeight(world.wrapperContained,fluid.wrapperContained,originHeight,northSouthHeight,eastWestHeight,pos.wrapperContained); }
// public float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained); }
// public float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { return wrapperContained.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public void addHeight(float weightedAverageHeight,float height) { wrapperContained.addHeight(weightedAverageHeight,height); }

}