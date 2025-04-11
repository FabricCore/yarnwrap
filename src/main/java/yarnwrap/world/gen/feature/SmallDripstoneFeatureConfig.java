package yarnwrap.world.gen.feature;
public class SmallDripstoneFeatureConfig { public net.minecraft.world.gen.feature.SmallDripstoneFeatureConfig wrapperContained; public SmallDripstoneFeatureConfig(net.minecraft.world.gen.feature.SmallDripstoneFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public float chanceOfTallerDripstone() { return wrapperContained.chanceOfTallerDripstone; }
// public void chanceOfTallerDripstone(float value) { wrapperContained.chanceOfTallerDripstone = value; }
public float chanceOfDirectionalSpread() { return wrapperContained.chanceOfDirectionalSpread; }
// public void chanceOfDirectionalSpread(float value) { wrapperContained.chanceOfDirectionalSpread = value; }
public float chanceOfSpreadRadius2() { return wrapperContained.chanceOfSpreadRadius2; }
// public void chanceOfSpreadRadius2(float value) { wrapperContained.chanceOfSpreadRadius2 = value; }
public float chanceOfSpreadRadius3() { return wrapperContained.chanceOfSpreadRadius3; }
// public void chanceOfSpreadRadius3(float value) { wrapperContained.chanceOfSpreadRadius3 = value; }

}