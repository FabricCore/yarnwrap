package yarnwrap.world.gen.feature;
public class TreeFeatureConfig { public net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained; public TreeFeatureConfig(net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.trunkProvider); }
public java.util.List decorators() { return wrapperContained.decorators; }
public yarnwrap.world.gen.foliage.FoliagePlacer foliagePlacer() { return new yarnwrap.world.gen.foliage.FoliagePlacer(wrapperContained.foliagePlacer); }
public yarnwrap.world.gen.trunk.TrunkPlacer trunkPlacer() { return new yarnwrap.world.gen.trunk.TrunkPlacer(wrapperContained.trunkPlacer); }
public yarnwrap.world.gen.feature.size.FeatureSize minimumSize() { return new yarnwrap.world.gen.feature.size.FeatureSize(wrapperContained.minimumSize); }
public boolean ignoreVines() { return wrapperContained.ignoreVines; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider dirtProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.dirtProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider foliageProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.foliageProvider); }
public boolean forceDirt() { return wrapperContained.forceDirt; }
public java.util.Optional rootPlacer() { return wrapperContained.rootPlacer; }

}