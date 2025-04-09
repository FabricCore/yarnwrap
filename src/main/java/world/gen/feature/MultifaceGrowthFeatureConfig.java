package yarnwrap.world.gen.feature;
public class MultifaceGrowthFeatureConfig { public net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig wrapperContained; public MultifaceGrowthFeatureConfig(net.minecraft.world.gen.feature.MultifaceGrowthFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int searchRange() { return wrapperContained.searchRange; }
public boolean placeOnFloor() { return wrapperContained.placeOnFloor; }
public boolean placeOnCeiling() { return wrapperContained.placeOnCeiling; }
public boolean placeOnWalls() { return wrapperContained.placeOnWalls; }
public float spreadChance() { return wrapperContained.spreadChance; }
public yarnwrap.registry.entry.RegistryEntryList canPlaceOn() { return new yarnwrap.registry.entry.RegistryEntryList(wrapperContained.canPlaceOn); }
// public it.unimi.dsi.fastutil.objects.ObjectArrayList directions() { return wrapperContained.directions; }
public yarnwrap.block.MultifaceGrowthBlock lichen() { return new yarnwrap.block.MultifaceGrowthBlock(wrapperContained.lichen); }
// public com.mojang.serialization.DataResult validateBlock(yarnwrap.block.Block block) { return wrapperContained.validateBlock(block.wrapperContained); }
public java.util.List shuffleDirections(yarnwrap.util.math.random.Random random) { return wrapperContained.shuffleDirections(random.wrapperContained); }
public java.util.List shuffleDirections(yarnwrap.util.math.random.Random random,yarnwrap.util.math.Direction excluded) { return wrapperContained.shuffleDirections(random.wrapperContained,excluded.wrapperContained); }

}