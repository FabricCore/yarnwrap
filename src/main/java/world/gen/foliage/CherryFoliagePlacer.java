package yarnwrap.world.gen.foliage;
public class CherryFoliagePlacer { public net.minecraft.world.gen.foliage.CherryFoliagePlacer wrapperContained; public CherryFoliagePlacer(net.minecraft.world.gen.foliage.CherryFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public float wideBottomLayerHoleChance() { return wrapperContained.wideBottomLayerHoleChance; }
// public float cornerHoleChance() { return wrapperContained.cornerHoleChance; }
// public float hangingLeavesChance() { return wrapperContained.hangingLeavesChance; }
// public float hangingLeavesExtensionChance() { return wrapperContained.hangingLeavesExtensionChance; }

}