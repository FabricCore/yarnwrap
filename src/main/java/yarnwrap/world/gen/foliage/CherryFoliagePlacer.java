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
public CherryFoliagePlacer(yarnwrap.util.math.intprovider.IntProvider radius,yarnwrap.util.math.intprovider.IntProvider offset,yarnwrap.util.math.intprovider.IntProvider height,float wideBottomLayerHoleChance,float cornerHoleChance,float hangingLeavesChance,float hangingLeavesExtensionChance) { this.wrapperContained = new net.minecraft.world.gen.foliage.CherryFoliagePlacer(radius.wrapperContained,offset.wrapperContained,height.wrapperContained,wideBottomLayerHoleChance,cornerHoleChance,hangingLeavesChance,hangingLeavesExtensionChance); }
// public java.lang.Float method_49242(yarnwrap.world.gen.foliage.CherryFoliagePlacer foliagePlacer) { return wrapperContained.method_49242(foliagePlacer.wrapperContained); }
// public java.lang.Float method_49243(yarnwrap.world.gen.foliage.CherryFoliagePlacer foliagePlacer) { return wrapperContained.method_49243(foliagePlacer.wrapperContained); }
// public java.lang.Float method_49244(yarnwrap.world.gen.foliage.CherryFoliagePlacer foliagePlacer) { return wrapperContained.method_49244(foliagePlacer.wrapperContained); }
// public java.lang.Float method_49245(yarnwrap.world.gen.foliage.CherryFoliagePlacer foliagePlacer) { return wrapperContained.method_49245(foliagePlacer.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_49246(yarnwrap.world.gen.foliage.CherryFoliagePlacer foliagePlacer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_49246(foliagePlacer.wrapperContained)); }

}