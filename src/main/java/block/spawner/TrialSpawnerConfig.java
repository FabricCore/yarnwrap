package yarnwrap.block.spawner;
public class TrialSpawnerConfig { public net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained; public TrialSpawnerConfig(net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.spawner.TrialSpawnerConfig DEFAULT() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int getTotalMobs(int additionalPlayers) { return wrapperContained.getTotalMobs(additionalPlayers); }
public int getSimultaneousMobs(int additionalPlayers) { return wrapperContained.getSimultaneousMobs(additionalPlayers); }
public long getCooldownLength() { return wrapperContained.getCooldownLength(); }

}