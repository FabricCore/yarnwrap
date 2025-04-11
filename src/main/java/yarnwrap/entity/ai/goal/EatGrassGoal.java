package yarnwrap.entity.ai.goal;
public class EatGrassGoal { public net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained; public EatGrassGoal(net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_TIMER() { return wrapperContained.MAX_TIMER; }
// public void MAX_TIMER(int value) { wrapperContained.MAX_TIMER = value; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public java.util.function.Predicate SHORT_GRASS_PREDICATE() { return wrapperContained.SHORT_GRASS_PREDICATE; }
// public void SHORT_GRASS_PREDICATE(java.util.function.Predicate value) { wrapperContained.SHORT_GRASS_PREDICATE = value; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
public int getTimer() { return wrapperContained.getTimer(); }

}