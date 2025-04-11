package yarnwrap.world.gen.carver;
public class CaveCarverConfig { public net.minecraft.world.gen.carver.CaveCarverConfig wrapperContained; public CaveCarverConfig(net.minecraft.world.gen.carver.CaveCarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CAVE_CODEC() { return wrapperContained.CAVE_CODEC; }
// public void CAVE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.CAVE_CODEC = value; }
public yarnwrap.util.math.floatprovider.FloatProvider horizontalRadiusMultiplier() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.horizontalRadiusMultiplier); }
// public void horizontalRadiusMultiplier(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.horizontalRadiusMultiplier = value.wrapperContained; }
public yarnwrap.util.math.floatprovider.FloatProvider verticalRadiusMultiplier() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.verticalRadiusMultiplier); }
// public void verticalRadiusMultiplier(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.verticalRadiusMultiplier = value.wrapperContained; }
// public yarnwrap.util.math.floatprovider.FloatProvider floorLevel() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.floorLevel); }
// public void floorLevel(yarnwrap.util.math.floatprovider.FloatProvider value) { wrapperContained.floorLevel = value.wrapperContained; }

}