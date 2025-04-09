package yarnwrap.entity.mob;
public class MobVisibilityCache { public net.minecraft.entity.mob.MobVisibilityCache wrapperContained; public MobVisibilityCache(net.minecraft.entity.mob.MobVisibilityCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntSet invisibleEntities() { return wrapperContained.invisibleEntities; }
// public yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.owner); }
// public it.unimi.dsi.fastutil.ints.IntSet visibleEntities() { return wrapperContained.visibleEntities; }
public boolean canSee(yarnwrap.entity.Entity entity) { return wrapperContained.canSee(entity.wrapperContained); }
public void clear() { wrapperContained.clear(); }

}