package yarnwrap.entity.ai.goal;
public class ChaseBoatGoal { public net.minecraft.entity.ai.goal.ChaseBoatGoal wrapperContained; public ChaseBoatGoal(net.minecraft.entity.ai.goal.ChaseBoatGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.ChaseBoatState state() { return new yarnwrap.entity.ai.goal.ChaseBoatState(wrapperContained.state); }
// public void state(yarnwrap.entity.ai.goal.ChaseBoatState value) { wrapperContained.state = value.wrapperContained; }
// public static yarnwrap.entity.ai.goal.ChaseBoatState state() { return new yarnwrap.entity.ai.goal.ChaseBoatState(net.minecraft.entity.ai.goal.ChaseBoatGoal.state); }
// public static void state(yarnwrap.entity.ai.goal.ChaseBoatState value, ) { net.minecraft.entity.ai.goal.ChaseBoatGoal.state = value.wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.ChaseBoatGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.ChaseBoatGoal.mob = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity passenger() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.passenger); }
// public void passenger(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.passenger = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity passenger() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.entity.ai.goal.ChaseBoatGoal.passenger); }
// public static void passenger(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.entity.ai.goal.ChaseBoatGoal.passenger = value.wrapperContained; }

// public int updateCountdownTicks() { return wrapperContained.updateCountdownTicks; }
// public void updateCountdownTicks(int value) { wrapperContained.updateCountdownTicks = value; }
// public static int updateCountdownTicks() { return net.minecraft.entity.ai.goal.ChaseBoatGoal.updateCountdownTicks; }
// public static void updateCountdownTicks(int value, ) { net.minecraft.entity.ai.goal.ChaseBoatGoal.updateCountdownTicks = value; }

public ChaseBoatGoal(yarnwrap.entity.mob.PathAwareEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.ChaseBoatGoal(mob.wrapperContained); }

}