package yarnwrap.client.render.block;
public class FluidRenderer { public net.minecraft.client.render.block.FluidRenderer wrapperContained; public FluidRenderer(net.minecraft.client.render.block.FluidRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.texture.Sprite waterOverlaySprite() { return new yarnwrap.client.texture.Sprite(wrapperContained.waterOverlaySprite); }
// public void waterOverlaySprite(yarnwrap.client.texture.Sprite value) { wrapperContained.waterOverlaySprite = value.wrapperContained; }
// public static yarnwrap.client.texture.Sprite waterOverlaySprite() { return new yarnwrap.client.texture.Sprite(net.minecraft.client.render.block.FluidRenderer.waterOverlaySprite); }
// public static void waterOverlaySprite(yarnwrap.client.texture.Sprite value, ) { net.minecraft.client.render.block.FluidRenderer.waterOverlaySprite = value.wrapperContained; }

// public net.minecraft.client.texture.Sprite[] lavaSprites() { return wrapperContained.lavaSprites; }
// public void lavaSprites(net.minecraft.client.texture.Sprite[] value) { wrapperContained.lavaSprites = value; }
// public static net.minecraft.client.texture.Sprite[] lavaSprites() { return net.minecraft.client.render.block.FluidRenderer.lavaSprites; }
// public static void lavaSprites(net.minecraft.client.texture.Sprite[] value, ) { net.minecraft.client.render.block.FluidRenderer.lavaSprites = value; }

// public net.minecraft.client.texture.Sprite[] waterSprites() { return wrapperContained.waterSprites; }
// public void waterSprites(net.minecraft.client.texture.Sprite[] value) { wrapperContained.waterSprites = value; }
// public static net.minecraft.client.texture.Sprite[] waterSprites() { return net.minecraft.client.render.block.FluidRenderer.waterSprites; }
// public static void waterSprites(net.minecraft.client.texture.Sprite[] value, ) { net.minecraft.client.render.block.FluidRenderer.waterSprites = value; }

// public int getLight(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLight(world.wrapperContained,pos.wrapperContained); }
// public static int getLight(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.block.FluidRenderer.getLight(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldSkipRendering(yarnwrap.util.math.Direction side,float height,yarnwrap.block.BlockState state) { return wrapperContained.shouldSkipRendering(side.wrapperContained,height,state.wrapperContained); }
// public static boolean shouldSkipRendering(yarnwrap.util.math.Direction side,float height,yarnwrap.block.BlockState state, ) { return net.minecraft.client.render.block.FluidRenderer.shouldSkipRendering(side.wrapperContained,height,state.wrapperContained); }
// public void onResourceReload() { wrapperContained.onResourceReload(); }
// public static void onResourceReload() { net.minecraft.client.render.block.FluidRenderer.onResourceReload(); }
public void render(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { wrapperContained.render(world.wrapperContained,pos.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public static void render(yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState, ) { net.minecraft.client.render.block.FluidRenderer.render(world.wrapperContained,pos.wrapperContained,vertexConsumer.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public boolean isSameFluid(yarnwrap.fluid.FluidState a,yarnwrap.fluid.FluidState b) { return wrapperContained.isSameFluid(a.wrapperContained,b.wrapperContained); }
// public static boolean isSameFluid(yarnwrap.fluid.FluidState a,yarnwrap.fluid.FluidState b, ) { return net.minecraft.client.render.block.FluidRenderer.isSameFluid(a.wrapperContained,b.wrapperContained); }
// public void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,float x,float y,float z,float red,float green,float blue,float u,float v,int light) { wrapperContained.vertex(vertexConsumer.wrapperContained,x,y,z,red,green,blue,u,v,light); }
// public static void vertex(yarnwrap.client.render.VertexConsumer vertexConsumer,float x,float y,float z,float red,float green,float blue,float u,float v,int light, ) { net.minecraft.client.render.block.FluidRenderer.vertex(vertexConsumer.wrapperContained,x,y,z,red,green,blue,u,v,light); }
// public boolean shouldRenderSide(yarnwrap.fluid.FluidState fluid,yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side,yarnwrap.fluid.FluidState fluidFromSide) { return wrapperContained.shouldRenderSide(fluid.wrapperContained,state.wrapperContained,side.wrapperContained,fluidFromSide.wrapperContained); }
// public static boolean shouldRenderSide(yarnwrap.fluid.FluidState fluid,yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side,yarnwrap.fluid.FluidState fluidFromSide, ) { return net.minecraft.client.render.block.FluidRenderer.shouldRenderSide(fluid.wrapperContained,state.wrapperContained,side.wrapperContained,fluidFromSide.wrapperContained); }
// public boolean isOppositeSideCovered(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side) { return wrapperContained.isOppositeSideCovered(state.wrapperContained,side.wrapperContained); }
// public static boolean isOppositeSideCovered(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side, ) { return net.minecraft.client.render.block.FluidRenderer.isOppositeSideCovered(state.wrapperContained,side.wrapperContained); }
// public boolean isSideCovered(yarnwrap.util.math.Direction side,float height,yarnwrap.block.BlockState state) { return wrapperContained.isSideCovered(side.wrapperContained,height,state.wrapperContained); }
// public static boolean isSideCovered(yarnwrap.util.math.Direction side,float height,yarnwrap.block.BlockState state, ) { return net.minecraft.client.render.block.FluidRenderer.isSideCovered(side.wrapperContained,height,state.wrapperContained); }
// public float calculateFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,float originHeight,float northSouthHeight,float eastWestHeight,yarnwrap.util.math.BlockPos pos) { return wrapperContained.calculateFluidHeight(world.wrapperContained,fluid.wrapperContained,originHeight,northSouthHeight,eastWestHeight,pos.wrapperContained); }
// public static float calculateFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,float originHeight,float northSouthHeight,float eastWestHeight,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.block.FluidRenderer.calculateFluidHeight(world.wrapperContained,fluid.wrapperContained,originHeight,northSouthHeight,eastWestHeight,pos.wrapperContained); }
// public float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained); }
// public static float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.client.render.block.FluidRenderer.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained); }
// public float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState) { return wrapperContained.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public static float getFluidHeight(yarnwrap.world.BlockRenderView world,yarnwrap.fluid.Fluid fluid,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState blockState,yarnwrap.fluid.FluidState fluidState, ) { return net.minecraft.client.render.block.FluidRenderer.getFluidHeight(world.wrapperContained,fluid.wrapperContained,pos.wrapperContained,blockState.wrapperContained,fluidState.wrapperContained); }
// public void addHeight(float weightedAverageHeight,float height) { wrapperContained.addHeight(weightedAverageHeight,height); }
// public static void addHeight(float weightedAverageHeight,float height, ) { net.minecraft.client.render.block.FluidRenderer.addHeight(weightedAverageHeight,height); }

}