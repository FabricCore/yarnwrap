package yarnwrap.world.gen.feature;
public class GeodeCrackConfig { public net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained; public GeodeCrackConfig(net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public double generateCrackChance() { return wrapperContained.generateCrackChance; }
public double baseCrackSize() { return wrapperContained.baseCrackSize; }
public int crackPointOffset() { return wrapperContained.crackPointOffset; }

}