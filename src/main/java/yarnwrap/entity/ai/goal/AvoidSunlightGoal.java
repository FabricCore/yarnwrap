package yarnwrap.entity.ai.goal;
public class AvoidSunlightGoal { public net.minecraft.entity.ai.goal.AvoidSunlightGoal wrapperContained; public AvoidSunlightGoal(net.minecraft.entity.ai.goal.AvoidSunlightGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
// public static yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(net.minecraft.entity.ai.goal.AvoidSunlightGoal.mob); }
// public static void mob(yarnwrap.entity.mob.PathAwareEntity value, ) { net.minecraft.entity.ai.goal.AvoidSunlightGoal.mob = value.wrapperContained; }

public AvoidSunlightGoal(yarnwrap.entity.mob.PathAwareEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.AvoidSunlightGoal(mob.wrapperContained); }

}