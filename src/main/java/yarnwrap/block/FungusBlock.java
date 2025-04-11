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
// public FungusBlock(yarnwrap.registry.RegistryKey featureKey,yarnwrap.block.Block nylium,Object settings) { this.wrapperContained = new net.minecraft.block.FungusBlock(featureKey.wrapperContained,nylium.wrapperContained,settings); }
// public void method_46682(yarnwrap.server.world.ServerWorld featureEntry) { wrapperContained.method_46682(featureEntry.wrapperContained); }
// public java.util.Optional getFeatureEntry(yarnwrap.world.WorldView world) { return wrapperContained.getFeatureEntry(world.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54019(Object instance) { return wrapperContained.method_54019(instance); }
// public yarnwrap.block.Block method_54020(yarnwrap.block.FungusBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54020(block.wrapperContained)); }
// public yarnwrap.registry.RegistryKey method_54021(yarnwrap.block.FungusBlock block) { return new yarnwrap.registry.RegistryKey(wrapperContained.method_54021(block.wrapperContained)); }

}