package yarnwrap.block.spawner;
public class TrialSpawnerConfig { public net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained; public TrialSpawnerConfig(net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.spawner.TrialSpawnerConfig DEFAULT() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.block.spawner.TrialSpawnerConfig value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int getTotalMobs(int additionalPlayers) { return wrapperContained.getTotalMobs(additionalPlayers); }
// public com.mojang.datafixers.kinds.App method_55180(Object instance) { return wrapperContained.method_55180(instance); }
public int getSimultaneousMobs(int additionalPlayers) { return wrapperContained.getSimultaneousMobs(additionalPlayers); }
public long getCooldownLength() { return wrapperContained.getCooldownLength(); }

}