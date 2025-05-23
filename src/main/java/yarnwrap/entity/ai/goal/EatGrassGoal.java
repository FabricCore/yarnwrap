package yarnwrap.entity.ai.goal;
public class EatGrassGoal { public net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained; public EatGrassGoal(net.minecraft.entity.ai.goal.EatGrassGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.World world() { return new yarnwrap.world.World(wrapperContained.world); }
// public void world(yarnwrap.world.World value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.World world() { return new yarnwrap.world.World(net.minecraft.entity.ai.goal.EatGrassGoal.world); }
// public static void world(yarnwrap.world.World value, ) { net.minecraft.entity.ai.goal.EatGrassGoal.world = value.wrapperContained; }

// public int timer() { return wrapperContained.timer; }
// public void timer(int value) { wrapperContained.timer = value; }
// public static int timer() { return net.minecraft.entity.ai.goal.EatGrassGoal.timer; }
// public static void timer(int value, ) { net.minecraft.entity.ai.goal.EatGrassGoal.timer = value; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.EatGrassGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.EatGrassGoal.mob = value.wrapperContained; }

// public int MAX_TIMER() { return wrapperContained.MAX_TIMER; }
// public void MAX_TIMER(int value) { wrapperContained.MAX_TIMER = value; }
// public static int MAX_TIMER() { return net.minecraft.entity.ai.goal.EatGrassGoal.MAX_TIMER; }
// public static void MAX_TIMER(int value, ) { net.minecraft.entity.ai.goal.EatGrassGoal.MAX_TIMER = value; }

// public java.util.function.Predicate EDIBLE_PREDICATE() { return wrapperContained.EDIBLE_PREDICATE; }
// public void EDIBLE_PREDICATE(java.util.function.Predicate value) { wrapperContained.EDIBLE_PREDICATE = value; }
// public static java.util.function.Predicate EDIBLE_PREDICATE() { return net.minecraft.entity.ai.goal.EatGrassGoal.EDIBLE_PREDICATE; }
// public static void EDIBLE_PREDICATE(java.util.function.Predicate value, ) { net.minecraft.entity.ai.goal.EatGrassGoal.EDIBLE_PREDICATE = value; }

public EatGrassGoal(yarnwrap.entity.mob.MobEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.EatGrassGoal(mob.wrapperContained); }
public int getTimer() { return wrapperContained.getTimer(); }
// public static int getTimer() { return net.minecraft.entity.ai.goal.EatGrassGoal.getTimer(); }
// public boolean method_67520(yarnwrap.block.BlockState state) { return wrapperContained.method_67520(state.wrapperContained); }
// public static boolean method_67520(yarnwrap.block.BlockState state, ) { return net.minecraft.entity.ai.goal.EatGrassGoal.method_67520(state.wrapperContained); }

}