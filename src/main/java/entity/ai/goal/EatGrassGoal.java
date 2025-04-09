package yarnwrap.entity.ai.goal;
public class EatGrassGoal { public net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained; public EatGrassGoal(net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_TIMER() { return wrapperContained.MAX_TIMER; }
// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public int timer() { return wrapperContained.timer; }
// public java.util.function.Predicate SHORT_GRASS_PREDICATE() { return wrapperContained.SHORT_GRASS_PREDICATE; }
// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
public int getTimer() { return wrapperContained.getTimer(); }

}