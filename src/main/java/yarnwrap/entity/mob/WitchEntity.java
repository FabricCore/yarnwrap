package yarnwrap.entity.mob;
public class WitchEntity { public net.minecraft.entity.mob.WitchEntity wrapperContained; public WitchEntity(net.minecraft.entity.mob.WitchEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.RaidGoal raidGoal() { return new yarnwrap.entity.ai.goal.RaidGoal(wrapperContained.raidGoal); }
// public void raidGoal(yarnwrap.entity.ai.goal.RaidGoal value) { wrapperContained.raidGoal = value.wrapperContained; }
// public yarnwrap.entity.ai.goal.DisableableFollowTargetGoal attackPlayerGoal() { return new yarnwrap.entity.ai.goal.DisableableFollowTargetGoal(wrapperContained.attackPlayerGoal); }
// public void attackPlayerGoal(yarnwrap.entity.ai.goal.DisableableFollowTargetGoal value) { wrapperContained.attackPlayerGoal = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier DRINKING_SPEED_PENALTY_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER); }
// public void DRINKING_SPEED_PENALTY_MODIFIER(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER = value.wrapperContained; }
// public int drinkTimeLeft() { return wrapperContained.drinkTimeLeft; }
// public void drinkTimeLeft(int value) { wrapperContained.drinkTimeLeft = value; }
// public yarnwrap.util.Identifier DRINKING_SPEED_PENALTY_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER_ID); }
// public void DRINKING_SPEED_PENALTY_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData DRINKING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DRINKING); }
// public void DRINKING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DRINKING = value.wrapperContained; }
// public boolean method_16474(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_16474(entity.wrapperContained); }
public Object createWitchAttributes() { return wrapperContained.createWitchAttributes(); }
public void setDrinking(boolean drinking) { wrapperContained.setDrinking(drinking); }
public boolean isDrinking() { return wrapperContained.isDrinking(); }

}