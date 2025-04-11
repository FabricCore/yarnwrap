package yarnwrap.world.gen.feature;
public class GeodeCrackConfig { public net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained; public GeodeCrackConfig(net.minecraft.world.gen.feature.GeodeCrackConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public double generateCrackChance() { return wrapperContained.generateCrackChance; }
// public void generateCrackChance(double value) { wrapperContained.generateCrackChance = value; }
public double baseCrackSize() { return wrapperContained.baseCrackSize; }
// public void baseCrackSize(double value) { wrapperContained.baseCrackSize = value; }
public int crackPointOffset() { return wrapperContained.crackPointOffset; }
// public void crackPointOffset(int value) { wrapperContained.crackPointOffset = value; }

}