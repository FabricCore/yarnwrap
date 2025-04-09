package yarnwrap.block;
public class FungusBlock { public net.minecraft.block.FungusBlock wrapperContained; public FungusBlock(net.minecraft.block.FungusBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.registry.RegistryKey featureKey() { return new yarnwrap.registry.RegistryKey(wrapperContained.featureKey); }
// public double GROW_CHANCE() { return wrapperContained.GROW_CHANCE; }
// public yarnwrap.block.Block nylium() { return new yarnwrap.block.Block(wrapperContained.nylium); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional getFeatureEntry(yarnwrap.world.WorldView world) { return wrapperContained.getFeatureEntry(world.wrapperContained); }

}