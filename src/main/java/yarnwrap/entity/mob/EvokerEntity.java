package yarnwrap.entity.mob;
public class EvokerEntity { public net.minecraft.entity.mob.EvokerEntity wrapperContained; public EvokerEntity(net.minecraft.entity.mob.EvokerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.SheepEntity wololoTarget() { return new yarnwrap.entity.passive.SheepEntity(wrapperContained.wololoTarget); }
// public void wololoTarget(yarnwrap.entity.passive.SheepEntity value) { wrapperContained.wololoTarget = value.wrapperContained; }
// public static yarnwrap.entity.passive.SheepEntity wololoTarget() { return new yarnwrap.entity.passive.SheepEntity(net.minecraft.entity.mob.EvokerEntity.wololoTarget); }
// public static void wololoTarget(yarnwrap.entity.passive.SheepEntity value, ) { net.minecraft.entity.mob.EvokerEntity.wololoTarget = value.wrapperContained; }

// public Object createEvokerAttributes() { return wrapperContained.createEvokerAttributes(); }
public static Object createEvokerAttributes() { return net.minecraft.entity.mob.EvokerEntity.createEvokerAttributes(); }
// public void setWololoTarget(yarnwrap.entity.passive.SheepEntity wololoTarget) { wrapperContained.setWololoTarget(wololoTarget.wrapperContained); }
// public static void setWololoTarget(yarnwrap.entity.passive.SheepEntity wololoTarget, ) { net.minecraft.entity.mob.EvokerEntity.setWololoTarget(wololoTarget.wrapperContained); }
// public yarnwrap.entity.passive.SheepEntity getWololoTarget() { return new yarnwrap.entity.passive.SheepEntity(wrapperContained.getWololoTarget()); }
// public static yarnwrap.entity.passive.SheepEntity getWololoTarget() { return new yarnwrap.entity.passive.SheepEntity(net.minecraft.entity.mob.EvokerEntity.getWololoTarget()); }

}