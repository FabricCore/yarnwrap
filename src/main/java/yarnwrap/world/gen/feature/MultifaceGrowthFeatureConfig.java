package yarnwrap.world.gen.feature;
public class MultifaceGrowthFeatureConfig { public net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig wrapperContained; public MultifaceGrowthFeatureConfig(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.CODEC = value; }

public int searchRange() { return wrapperContained.searchRange; }
// public void searchRange(int value) { wrapperContained.searchRange = value; }
// public static int searchRange() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.searchRange; }
// public static void searchRange(int value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.searchRange = value; }

public boolean placeOnFloor() { return wrapperContained.placeOnFloor; }
// public void placeOnFloor(boolean value) { wrapperContained.placeOnFloor = value; }
// public static boolean placeOnFloor() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnFloor; }
// public static void placeOnFloor(boolean value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnFloor = value; }

public boolean placeOnCeiling() { return wrapperContained.placeOnCeiling; }
// public void placeOnCeiling(boolean value) { wrapperContained.placeOnCeiling = value; }
// public static boolean placeOnCeiling() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnCeiling; }
// public static void placeOnCeiling(boolean value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnCeiling = value; }

public boolean placeOnWalls() { return wrapperContained.placeOnWalls; }
// public void placeOnWalls(boolean value) { wrapperContained.placeOnWalls = value; }
// public static boolean placeOnWalls() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnWalls; }
// public static void placeOnWalls(boolean value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.placeOnWalls = value; }

public float spreadChance() { return wrapperContained.spreadChance; }
// public void spreadChance(float value) { wrapperContained.spreadChance = value; }
// public static float spreadChance() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.spreadChance; }
// public static void spreadChance(float value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.spreadChance = value; }

public yarnwrap.registry.entry.RegistryEntryList canPlaceOn() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.canPlaceOn); }
// public void canPlaceOn(yarnwrap.registry.entry.RegistryEntryList value) { wrapperContained.canPlaceOn = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntryList canPlaceOn() { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.canPlaceOn); }
// public static void canPlaceOn(yarnwrap.registry.entry.RegistryEntryList value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.canPlaceOn = value.wrapperContained; }

// public it.unimi.dsi.fastutil.objects.ObjectArrayList directions() { return wrapperContained.directions; }
// public void directions(it.unimi.dsi.fastutil.objects.ObjectArrayList value) { wrapperContained.directions = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectArrayList directions() { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.directions; }
// public static void directions(it.unimi.dsi.fastutil.objects.ObjectArrayList value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.directions = value; }

public yarnwrap.block.MultifaceGrowthBlock block() { return new yarnwrap.block.MultifaceGrowthBlock(wrapperContained.block); }
// public void block(yarnwrap.block.MultifaceGrowthBlock value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.MultifaceGrowthBlock block() { return new yarnwrap.block.MultifaceGrowthBlock(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.block); }
// public static void block(yarnwrap.block.MultifaceGrowthBlock value, ) { net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.block = value.wrapperContained; }

public MultifaceGrowthFeatureConfig(yarnwrap.block.MultifaceGrowthBlock block,int searchRange,boolean placeOnFloor,boolean placeOnCeiling,boolean placeOnWalls,float spreadChance,yarnwrap.registry.entry.RegistryEntryList canPlaceOn) { this.wrapperContained = new net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig(block.wrapperContained,searchRange,placeOnFloor,placeOnCeiling,placeOnWalls,spreadChance,canPlaceOn.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_33398(Object instance) { return wrapperContained.method_33398(instance); }
// public static com.mojang.datafixers.kinds.App method_33398(Object instance, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33398(instance); }
// public yarnwrap.registry.entry.RegistryEntryList method_33399(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.method_33399(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntryList method_33399(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return new yarnwrap.registry.entry.RegistryEntryList(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33399(config.wrapperContained)); }
// public java.lang.Float method_33400(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return wrapperContained.method_33400(config.wrapperContained); }
// public static java.lang.Float method_33400(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33400(config.wrapperContained); }
// public java.lang.Boolean method_33401(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return wrapperContained.method_33401(config.wrapperContained); }
// public static java.lang.Boolean method_33401(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33401(config.wrapperContained); }
// public java.lang.Boolean method_33402(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return wrapperContained.method_33402(config.wrapperContained); }
// public static java.lang.Boolean method_33402(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33402(config.wrapperContained); }
// public java.lang.Boolean method_33403(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return wrapperContained.method_33403(config.wrapperContained); }
// public static java.lang.Boolean method_33403(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33403(config.wrapperContained); }
// public java.lang.Integer method_33404(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return wrapperContained.method_33404(config.wrapperContained); }
// public static java.lang.Integer method_33404(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_33404(config.wrapperContained); }
// public com.mojang.serialization.DataResult validateBlock(yarnwrap.block.Block block) { return wrapperContained.validateBlock(block.wrapperContained); }
// public static com.mojang.serialization.DataResult validateBlock(yarnwrap.block.Block block, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.validateBlock(block.wrapperContained); }
// public yarnwrap.block.MultifaceGrowthBlock method_41574(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config) { return new yarnwrap.block.MultifaceGrowthBlock(wrapperContained.method_41574(config.wrapperContained)); }
// public static yarnwrap.block.MultifaceGrowthBlock method_41574(yarnwrap.world.gen.feature.MultifaceGrowthFeatureConfig config, ) { return new yarnwrap.block.MultifaceGrowthBlock(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_41574(config.wrapperContained)); }
public java.util.List shuffleDirections(yarnwrap.util.math.random.Random random) { return wrapperContained.shuffleDirections(random.wrapperContained); }
// public static java.util.List shuffleDirections(yarnwrap.util.math.random.Random random, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.shuffleDirections(random.wrapperContained); }
public java.util.List shuffleDirections(yarnwrap.util.math.random.Random random,yarnwrap.util.math.Direction excluded) { return wrapperContained.shuffleDirections(random.wrapperContained,excluded.wrapperContained); }
// public static java.util.List shuffleDirections(yarnwrap.util.math.random.Random random,yarnwrap.util.math.Direction excluded, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.shuffleDirections(random.wrapperContained,excluded.wrapperContained); }
// public boolean method_43297(yarnwrap.util.math.Direction direction) { return wrapperContained.method_43297(direction.wrapperContained); }
// public static boolean method_43297(yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig.method_43297(direction.wrapperContained); }

}