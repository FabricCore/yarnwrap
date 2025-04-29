package yarnwrap.world.gen.feature;
public class TreeFeatureConfig { public net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained; public TreeFeatureConfig(net.minecraft.world.gen.feature.TreeFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.trunkProvider); }
// public void trunkProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.trunkProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.trunkProvider); }
// public static void trunkProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.trunkProvider = value.wrapperContained; }

public java.util.List decorators() { return wrapperContained.decorators; }
// public void decorators(java.util.List value) { wrapperContained.decorators = value; }
// public static java.util.List decorators() { return net.minecraft.world.gen.feature.TreeFeatureConfig.decorators; }
// public static void decorators(java.util.List value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.decorators = value; }

public yarnwrap.world.gen.foliage.FoliagePlacer foliagePlacer() { return new yarnwrap.world.gen.foliage.FoliagePlacer(wrapperContained.foliagePlacer); }
// public void foliagePlacer(yarnwrap.world.gen.foliage.FoliagePlacer value) { wrapperContained.foliagePlacer = value.wrapperContained; }
// public static yarnwrap.world.gen.foliage.FoliagePlacer foliagePlacer() { return new yarnwrap.world.gen.foliage.FoliagePlacer(net.minecraft.world.gen.feature.TreeFeatureConfig.foliagePlacer); }
// public static void foliagePlacer(yarnwrap.world.gen.foliage.FoliagePlacer value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.foliagePlacer = value.wrapperContained; }

public yarnwrap.world.gen.trunk.TrunkPlacer trunkPlacer() { return new yarnwrap.world.gen.trunk.TrunkPlacer(wrapperContained.trunkPlacer); }
// public void trunkPlacer(yarnwrap.world.gen.trunk.TrunkPlacer value) { wrapperContained.trunkPlacer = value.wrapperContained; }
// public static yarnwrap.world.gen.trunk.TrunkPlacer trunkPlacer() { return new yarnwrap.world.gen.trunk.TrunkPlacer(net.minecraft.world.gen.feature.TreeFeatureConfig.trunkPlacer); }
// public static void trunkPlacer(yarnwrap.world.gen.trunk.TrunkPlacer value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.trunkPlacer = value.wrapperContained; }

public yarnwrap.world.gen.feature.size.FeatureSize minimumSize() { return new yarnwrap.world.gen.feature.size.FeatureSize(wrapperContained.minimumSize); }
// public void minimumSize(yarnwrap.world.gen.feature.size.FeatureSize value) { wrapperContained.minimumSize = value.wrapperContained; }
// public static yarnwrap.world.gen.feature.size.FeatureSize minimumSize() { return new yarnwrap.world.gen.feature.size.FeatureSize(net.minecraft.world.gen.feature.TreeFeatureConfig.minimumSize); }
// public static void minimumSize(yarnwrap.world.gen.feature.size.FeatureSize value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.minimumSize = value.wrapperContained; }

public boolean ignoreVines() { return wrapperContained.ignoreVines; }
// public void ignoreVines(boolean value) { wrapperContained.ignoreVines = value; }
// public static boolean ignoreVines() { return net.minecraft.world.gen.feature.TreeFeatureConfig.ignoreVines; }
// public static void ignoreVines(boolean value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.ignoreVines = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.TreeFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.CODEC = value; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider dirtProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.dirtProvider); }
// public void dirtProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.dirtProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider dirtProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.dirtProvider); }
// public static void dirtProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.dirtProvider = value.wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider foliageProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.foliageProvider); }
// public void foliageProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.foliageProvider = value.wrapperContained; }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider foliageProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.foliageProvider); }
// public static void foliageProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.foliageProvider = value.wrapperContained; }

public boolean forceDirt() { return wrapperContained.forceDirt; }
// public void forceDirt(boolean value) { wrapperContained.forceDirt = value; }
// public static boolean forceDirt() { return net.minecraft.world.gen.feature.TreeFeatureConfig.forceDirt; }
// public static void forceDirt(boolean value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.forceDirt = value; }

public java.util.Optional rootPlacer() { return wrapperContained.rootPlacer; }
// public void rootPlacer(java.util.Optional value) { wrapperContained.rootPlacer = value; }
// public static java.util.Optional rootPlacer() { return net.minecraft.world.gen.feature.TreeFeatureConfig.rootPlacer; }
// public static void rootPlacer(java.util.Optional value, ) { net.minecraft.world.gen.feature.TreeFeatureConfig.rootPlacer = value; }

// public TreeFeatureConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider trunkProvider,yarnwrap.world.gen.trunk.TrunkPlacer trunkPlacer,yarnwrap.world.gen.stateprovider.BlockStateProvider foliageProvider,yarnwrap.world.gen.foliage.FoliagePlacer foliagePlacer,java.util.Optional rootPlacer,yarnwrap.world.gen.stateprovider.BlockStateProvider dirtProvider,yarnwrap.world.gen.feature.size.FeatureSize minimumSize,java.util.List decorators,boolean ignoreVines,boolean forceDirt) { this.wrapperContained = new net.minecraft.world.gen.feature.TreeFeatureConfig(trunkProvider.wrapperContained,trunkPlacer.wrapperContained,foliageProvider.wrapperContained,foliagePlacer.wrapperContained,rootPlacer,dirtProvider.wrapperContained,minimumSize.wrapperContained,decorators,ignoreVines,forceDirt); }
// public com.mojang.datafixers.kinds.App method_28811(Object instance) { return wrapperContained.method_28811(instance); }
// public static com.mojang.datafixers.kinds.App method_28811(Object instance, ) { return net.minecraft.world.gen.feature.TreeFeatureConfig.method_28811(instance); }
// public yarnwrap.world.gen.feature.size.FeatureSize method_28814(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.feature.size.FeatureSize(wrapperContained.method_28814(config.wrapperContained)); }
// public static yarnwrap.world.gen.feature.size.FeatureSize method_28814(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.feature.size.FeatureSize(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28814(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28815(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28815(config.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28815(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28815(config.wrapperContained)); }
// public yarnwrap.world.gen.foliage.FoliagePlacer method_28816(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.foliage.FoliagePlacer(wrapperContained.method_28816(config.wrapperContained)); }
// public static yarnwrap.world.gen.foliage.FoliagePlacer method_28816(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.foliage.FoliagePlacer(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28816(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28817(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28817(config.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28817(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28817(config.wrapperContained)); }
// public yarnwrap.world.gen.trunk.TrunkPlacer method_28818(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.trunk.TrunkPlacer(wrapperContained.method_28818(config.wrapperContained)); }
// public static yarnwrap.world.gen.trunk.TrunkPlacer method_28818(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.trunk.TrunkPlacer(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28818(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_28819(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_28819(config.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProvider method_28819(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(net.minecraft.world.gen.feature.TreeFeatureConfig.method_28819(config.wrapperContained)); }
// public java.lang.Boolean method_34344(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.method_34344(config.wrapperContained); }
// public static java.lang.Boolean method_34344(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.feature.TreeFeatureConfig.method_34344(config.wrapperContained); }
// public java.util.List method_34345(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.method_34345(config.wrapperContained); }
// public static java.util.List method_34345(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.feature.TreeFeatureConfig.method_34345(config.wrapperContained); }
// public java.lang.Boolean method_37261(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.method_37261(config.wrapperContained); }
// public static java.lang.Boolean method_37261(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.feature.TreeFeatureConfig.method_37261(config.wrapperContained); }
// public java.util.Optional method_43164(yarnwrap.world.gen.feature.TreeFeatureConfig config) { return wrapperContained.method_43164(config.wrapperContained); }
// public static java.util.Optional method_43164(yarnwrap.world.gen.feature.TreeFeatureConfig config, ) { return net.minecraft.world.gen.feature.TreeFeatureConfig.method_43164(config.wrapperContained); }

}