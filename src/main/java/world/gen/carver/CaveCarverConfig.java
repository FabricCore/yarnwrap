package yarnwrap.world.gen.carver;
public class CaveCarverConfig { public net.minecraft.world.gen.carver.CaveCarverConfig wrapperContained; public CaveCarverConfig(net.minecraft.world.gen.carver.CaveCarverConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CAVE_CODEC() { return wrapperContained.CAVE_CODEC; }
public yarnwrap.util.math.floatprovider.FloatProvider horizontalRadiusMultiplier() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.horizontalRadiusMultiplier); }
public yarnwrap.util.math.floatprovider.FloatProvider verticalRadiusMultiplier() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.verticalRadiusMultiplier); }
// public yarnwrap.util.math.floatprovider.FloatProvider floorLevel() { return new yarnwrap.util.math.floatprovider.FloatProvider(wrapperContained.floorLevel); }

}