package yarnwrap.block;
public class FungusBlock { public net.minecraft.block.FungusBlock wrapperContained; public FungusBlock(net.minecraft.block.FungusBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.featureKey); }
// public void featureKey(yarnwrap.registry.RegistryKey value) { wrapperContained.featureKey = value.wrapperContained; }
// public double GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
// public void GROW_CHANCE(double value) { wrapperContained.GROW_CHANCE = value; }
// public yarnwrap.block.Block nylium() { return new yarnwrap.block.Block(wrapperContained.nylium); }
// public void nylium(yarnwrap.block.Block value) { wrapperContained.nylium = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional getFeatureEntry(yarnwrap.world.WorldView world) { return wrapperContained.getFeatureEntry(world.wrapperContained); }

}