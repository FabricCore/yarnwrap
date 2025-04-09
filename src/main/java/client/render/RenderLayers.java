package yarnwrap.client.render;
public class RenderLayers { public net.minecraft.client.render.RenderLayers wrapperContained; public RenderLayers(net.minecraft.client.render.RenderLayers wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map BLOCKS() { return wrapperContained.BLOCKS; }
// public java.util.Map FLUIDS() { return wrapperContained.FLUIDS; }
// public boolean fancyGraphicsOrBetter() { return wrapperContained.fancyGraphicsOrBetter; }
public yarnwrap.client.render.RenderLayer getItemLayer(yarnwrap.item.ItemStack stack,boolean direct) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getItemLayer(stack.wrapperContained,direct)); }
public yarnwrap.client.render.RenderLayer getBlockLayer(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getBlockLayer(state.wrapperContained)); }
public yarnwrap.client.render.RenderLayer getFluidLayer(yarnwrap.fluid.FluidState state) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getFluidLayer(state.wrapperContained)); }
public void setFancyGraphicsOrBetter(boolean fancyGraphicsOrBetter) { wrapperContained.setFancyGraphicsOrBetter(fancyGraphicsOrBetter); }
public yarnwrap.client.render.RenderLayer getEntityBlockLayer(yarnwrap.block.BlockState state,boolean direct) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getEntityBlockLayer(state.wrapperContained,direct)); }
public yarnwrap.client.render.RenderLayer getMovingBlockLayer(yarnwrap.block.BlockState state) { return new yarnwrap.client.render.RenderLayer(wrapperContained.getMovingBlockLayer(state.wrapperContained)); }

}