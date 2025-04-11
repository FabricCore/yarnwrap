package yarnwrap.entity.mob;
public class EvokerEntity { public net.minecraft.entity.mob.EvokerEntity wrapperContained; public EvokerEntity(net.minecraft.entity.mob.EvokerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.SheepEntity wololoTarget() { return new yarnwrap.entity.passive.SheepEntity(wrapperContained.wololoTarget); }
// public void wololoTarget(yarnwrap.entity.passive.SheepEntity value) { wrapperContained.wololoTarget = value.wrapperContained; }
public Object createEvokerAttributes() { return wrapperContained.createEvokerAttributes(); }
// public void setWololoTarget(yarnwrap.entity.passive.SheepEntity wololoTarget) { wrapperContained.setWololoTarget(wololoTarget.wrapperContained); }
// public yarnwrap.entity.passive.SheepEntity getWololoTarget() { return new yarnwrap.entity.passive.SheepEntity(wrapperContained.getWololoTarget()); }

}