package yarnwrap.world.gen.feature;
public class SmallDripstoneFeatureConfig { public net.minecraft.world.gen.feature.SmallDripstoneFeatureConfig wrapperContained; public SmallDripstoneFeatureConfig(net.minecraft.world.gen.feature.SmallDripstoneFeatureConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public float chanceOfTallerDripstone() { return wrapperContained.chanceOfTallerDripstone; }
public float chanceOfDirectionalSpread() { return wrapperContained.chanceOfDirectionalSpread; }
public float chanceOfSpreadRadius2() { return wrapperContained.chanceOfSpreadRadius2; }
public float chanceOfSpreadRadius3() { return wrapperContained.chanceOfSpreadRadius3; }

}