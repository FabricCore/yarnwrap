package yarnwrap.entity.ai.goal;
public class TrackIronGolemTargetGoal { public net.minecraft.entity.ai.goal.TrackIronGolemTargetGoal wrapperContained; public TrackIronGolemTargetGoal(net.minecraft.entity.ai.goal.TrackIronGolemTargetGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.TargetPredicate targetPredicate() { return new yarnwrap.entity.ai.TargetPredicate(wrapperContained.targetPredicate); }
// public void targetPredicate(yarnwrap.entity.ai.TargetPredicate value) { wrapperContained.targetPredicate = value.wrapperContained; }
// public yarnwrap.entity.passive.IronGolemEntity golem() { return new yarnwrap.entity.passive.IronGolemEntity(wrapperContained.golem); }
// public void golem(yarnwrap.entity.passive.IronGolemEntity value) { wrapperContained.golem = value.wrapperContained; }
// public yarnwrap.entity.LivingEntity target() { return new yarnwrap.entity.LivingEntity(wrapperContained.target); }
// public void target(yarnwrap.entity.LivingEntity value) { wrapperContained.target = value.wrapperContained; }
public TrackIronGolemTargetGoal(yarnwrap.entity.passive.IronGolemEntity golem) { this.wrapperContained = new net.minecraft.entity.ai.goal.TrackIronGolemTargetGoal(golem.wrapperContained); }

}