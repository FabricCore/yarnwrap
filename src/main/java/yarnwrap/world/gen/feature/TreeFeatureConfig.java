package yarnwrap.world.gen.feature;
public class TreeFeatureConfig { public net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained; public TreeFeatureConfig(net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.trunkProvider); }
// public void trunkProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.trunkProvider = value.wrapperContained; }
public java.util.List decorators() { return wrapperContained.decorators; }
// public void decorators(java.util.List value) { wrapperContained.decorators = value; }
public yarnwrap.world.gen.foliage.FoliagePlacer foliagePlacer() { return new yarnwrap.world.gen.foliage.FoliagePlacer(wrapperContained.foliagePlacer); }
// public void foliagePlacer(yarnwrap.world.gen.foliage.FoliagePlacer value) { wrapperContained.foliagePlacer = value.wrapperContained; }
public yarnwrap.world.gen.trunk.TrunkPlacer trunkPlacer() { return new yarnwrap.world.gen.trunk.TrunkPlacer(wrapperContained.trunkPlacer); }
// public void trunkPlacer(yarnwrap.world.gen.trunk.TrunkPlacer value) { wrapperContained.trunkPlacer = value.wrapperContained; }
public yarnwrap.world.gen.feature.size.FeatureSize minimumSize() { return new yarnwrap.world.gen.feature.size.FeatureSize(wrapperContained.minimumSize); }
// public void minimumSize(yarnwrap.world.gen.feature.size.FeatureSize value) { wrapperContained.minimumSize = value.wrapperContained; }
public boolean ignoreVines() { return wrapperContained.ignoreVines; }
// public void ignoreVines(boolean value) { wrapperContained.ignoreVines = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider dirtProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.dirtProvider); }
// public void dirtProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.dirtProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider foliageProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.foliageProvider); }
// public void foliageProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.foliageProvider = value.wrapperContained; }
public boolean forceDirt() { return wrapperContained.forceDirt; }
// public void forceDirt(boolean value) { wrapperContained.forceDirt = value; }
public java.util.Optional rootPlacer() { return wrapperContained.rootPlacer; }
// public void rootPlacer(java.util.Optional value) { wrapperContained.rootPlacer = value; }

}