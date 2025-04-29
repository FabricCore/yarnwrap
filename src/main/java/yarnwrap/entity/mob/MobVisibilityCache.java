package yarnwrap.entity.mob;
public class MobVisibilityCache { public net.minecraft.entity.mob.MobVisibilityCache wrapperContained; public MobVisibilityCache(net.minecraft.entity.mob.MobVisibilityCache wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntSet invisibleEntities() { return wrapperContained.invisibleEntities; }
// public void invisibleEntities(it.unimi.dsi.fastutil.ints.IntSet value) { wrapperContained.invisibleEntities = value; }
// public static it.unimi.dsi.fastutil.ints.IntSet invisibleEntities() { return net.minecraft.entity.mob.MobVisibilityCache.invisibleEntities; }
// public static void invisibleEntities(it.unimi.dsi.fastutil.ints.IntSet value, ) { net.minecraft.entity.mob.MobVisibilityCache.invisibleEntities = value; }

// public yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.owner); }
// public void owner(yarnwrap.entity.mob.MobEntity value) { wrapperContained.owner = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity owner() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.mob.MobVisibilityCache.owner); }
// public static void owner(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.mob.MobVisibilityCache.owner = value.wrapperContained; }

// public it.unimi.dsi.fastutil.ints.IntSet visibleEntities() { return wrapperContained.visibleEntities; }
// public void visibleEntities(it.unimi.dsi.fastutil.ints.IntSet value) { wrapperContained.visibleEntities = value; }
// public static it.unimi.dsi.fastutil.ints.IntSet visibleEntities() { return net.minecraft.entity.mob.MobVisibilityCache.visibleEntities; }
// public static void visibleEntities(it.unimi.dsi.fastutil.ints.IntSet value, ) { net.minecraft.entity.mob.MobVisibilityCache.visibleEntities = value; }

public MobVisibilityCache(yarnwrap.entity.mob.MobEntity owner) { this.wrapperContained = new net.minecraft.entity.mob.MobVisibilityCache(owner.wrapperContained); }
public boolean canSee(yarnwrap.entity.Entity entity) { return wrapperContained.canSee(entity.wrapperContained); }
// public static boolean canSee(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.mob.MobVisibilityCache.canSee(entity.wrapperContained); }
public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.entity.mob.MobVisibilityCache.clear(); }

}