package yarnwrap.entity.ai.goal;
public class SwimGoal { public net.minecraft.entity.ai.goal.SwimGoal wrapperContained; public SwimGoal(net.minecraft.entity.ai.goal.SwimGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.MobEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.MobEntity mob() { return new yarnwrap.entity.mob.MobEntity(net.minecraft.entity.ai.goal.SwimGoal.mob); }
// public static void mob(yarnwrap.entity.mob.MobEntity value, ) { net.minecraft.entity.ai.goal.SwimGoal.mob = value.wrapperContained; }

public SwimGoal(yarnwrap.entity.mob.MobEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.SwimGoal(mob.wrapperContained); }

}