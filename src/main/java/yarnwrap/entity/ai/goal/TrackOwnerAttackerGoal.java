package yarnwrap.entity.ai.goal;
public class TrackOwnerAttackerGoal { public net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal wrapperContained; public TrackOwnerAttackerGoal(net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lastAttackedTime() { return wrapperContained.lastAttackedTime; }
// public void lastAttackedTime(int value) { wrapperContained.lastAttackedTime = value; }
// public static int lastAttackedTime() { return net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.lastAttackedTime; }
// public static void lastAttackedTime(int value, ) { net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.lastAttackedTime = value; }

// public yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(wrapperContained.tameable); }
// public void tameable(yarnwrap.entity.passive.TameableEntity value) { wrapperContained.tameable = value.wrapperContained; }
// public static yarnwrap.entity.passive.TameableEntity tameable() { return new yarnwrap.entity.passive.TameableEntity(net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.tameable); }
// public static void tameable(yarnwrap.entity.passive.TameableEntity value, ) { net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.tameable = value.wrapperContained; }

// public yarnwrap.entity.LivingEntity attacker() { return new yarnwrap.entity.LivingEntity(wrapperContained.attacker); }
// public void attacker(yarnwrap.entity.LivingEntity value) { wrapperContained.attacker = value.wrapperContained; }
// public static yarnwrap.entity.LivingEntity attacker() { return new yarnwrap.entity.LivingEntity(net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.attacker); }
// public static void attacker(yarnwrap.entity.LivingEntity value, ) { net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal.attacker = value.wrapperContained; }

public TrackOwnerAttackerGoal(yarnwrap.entity.passive.TameableEntity tameable) { this.wrapperContained = new net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal(tameable.wrapperContained); }

}