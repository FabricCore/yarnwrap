package yarnwrap.entity.ai.goal;
public class MoveIntoWaterGoal { public net.minecraft.entity.ai.goal.MoveIntoWaterGoal wrapperContained; public MoveIntoWaterGoal(net.minecraft.entity.ai.goal.MoveIntoWaterGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.mob.PathAwareEntity mob() { return new yarnwrap.entity.mob.PathAwareEntity(wrapperContained.mob); }
// public void mob(yarnwrap.entity.mob.PathAwareEntity value) { wrapperContained.mob = value.wrapperContained; }
public MoveIntoWaterGoal(yarnwrap.entity.mob.PathAwareEntity mob) { this.wrapperContained = new net.minecraft.entity.ai.goal.MoveIntoWaterGoal(mob.wrapperContained); }

}