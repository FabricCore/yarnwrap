package yarnwrap.world.gen.foliage;
public class CherryFoliagePlacer { public net.minecraft.world.gen.foliage.CherryFoliagePlacer wrapperContained; public CherryFoliagePlacer(net.minecraft.world.gen.foliage.CherryFoliagePlacer wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.math.intprovider.IntProvider height() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.height); }
// public void height(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.height = value.wrapperContained; }
// public float wideBottomLayerHoleChance() { return wrapperContained.wideBottomLayerHoleChance; }
// public void wideBottomLayerHoleChance(float value) { wrapperContained.wideBottomLayerHoleChance = value; }
// public float cornerHoleChance() { return wrapperContained.cornerHoleChance; }
// public void cornerHoleChance(float value) { wrapperContained.cornerHoleChance = value; }
// public float hangingLeavesChance() { return wrapperContained.hangingLeavesChance; }
// public void hangingLeavesChance(float value) { wrapperContained.hangingLeavesChance = value; }
// public float hangingLeavesExtensionChance() { return wrapperContained.hangingLeavesExtensionChance; }
// public void hangingLeavesExtensionChance(float value) { wrapperContained.hangingLeavesExtensionChance = value; }

}