package yarnwrap.entity;
public class SpawnReason { public net.minecraft.entity.SpawnReason wrapperContained; public SpawnReason(net.minecraft.entity.SpawnReason wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAnySpawner(yarnwrap.entity.SpawnReason reason) { return wrapperContained.isAnySpawner(reason.wrapperContained); }
public boolean isTrialSpawner(yarnwrap.entity.SpawnReason reason) { return wrapperContained.isTrialSpawner(reason.wrapperContained); }

}