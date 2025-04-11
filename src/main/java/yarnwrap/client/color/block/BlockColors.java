package yarnwrap.client.color.block;
public class BlockColors { public net.minecraft.client.color.block.BlockColors wrapperContained; public BlockColors(net.minecraft.client.color.block.BlockColors wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.IdList providers() { return new yarnwrap.util.collection.IdList(wrapperContained.providers); }
// public void providers(yarnwrap.util.collection.IdList value) { wrapperContained.providers = value.wrapperContained; }
// public java.util.Map properties() { return wrapperContained.properties; }
// public void properties(java.util.Map value) { wrapperContained.properties = value; }
// public int NO_COLOR() { return wrapperContained.NO_COLOR; }
// public void NO_COLOR(int value) { wrapperContained.NO_COLOR = value; }
// public int method_1684(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1684(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1685(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1685(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1686(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1686(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1687(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1687(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1688(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1688(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
public yarnwrap.client.color.block.BlockColors create() { return new yarnwrap.client.color.block.BlockColors(wrapperContained.create()); }
public void registerColorProvider(yarnwrap.client.color.block.BlockColorProvider provider,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProvider(provider.wrapperContained,blocks); }
public int getParticleColor(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getParticleColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public int method_1692(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1692(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1693(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1693(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1694(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1694(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1695(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1695(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1696(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1696(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
public int getColor(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.getColor(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
// public int method_1698(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_1698(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }
public java.util.Set getProperties(yarnwrap.block.Block block) { return wrapperContained.getProperties(block.wrapperContained); }
// public void registerColorProperty(yarnwrap.state.property.Property property,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProperty(property.wrapperContained,blocks); }
// public void registerColorProperties(java.util.Set properties,net.minecraft.block.Block[] blocks) { wrapperContained.registerColorProperties(properties,blocks); }
// public int method_49295(yarnwrap.block.BlockState state,yarnwrap.world.BlockRenderView world,yarnwrap.util.math.BlockPos pos,int tintIndex) { return wrapperContained.method_49295(state.wrapperContained,world.wrapperContained,pos.wrapperContained,tintIndex); }

}