package yarnwrap.client.color.block;
public class BlockColors { public net.minecraft.client.color.block.BlockColors wrapperContained; public BlockColors(net.minecraft.client.color.block.BlockColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IdList providers() { return new yarnwrap.util.collection.IdList(wrapperContained.providers); }
// public java.util.Map properties() { return wrapperContained.properties; }
// public int NO_COLOR() { return wrapperContained.NO_COLOR; }
public yarnwrap.client.color.block.BlockColors create() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.create()); }
public void registerColorProvider(yarnwrap.client.color.block.BlockColorProvider provider,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProvider(provider.wrapperContained,blocks); }
public int getParticleColor(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getParticleColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
public int getColor(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.getColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
public java.util.Set getProperties(yarnwrap.block.Block block) { return wrapperContained.getProperties(block.wrapperContained); }
// public void registerColorProperty(yarnwrap.state.property.Property property,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProperty(property.wrapperContained,blocks); }
// public void registerColorProperties(java.util.Set properties,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProperties(properties,blocks); }

}