package yarnwrap.entity.mob;
public class WitchEntity { public net.minecraft.entity.mob.WitchEntity wrapperContained; public WitchEntity(net.minecraft.entity.mob.WitchEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.ai.goal.RaidGoal raidGoal() { return new yarnwrap.entity.ai.goal.RaidGoal(wrapperContained.raidGoal); }
// public yarnwrap.entity.ai.goal.DisableableFollowTargetGoal attackPlayerGoal() { return new yarnwrap.entity.ai.goal.DisableableFollowTargetGoal(wrapperContained.attackPlayerGoal); }
// public yarnwrap.entity.attribute.EntityAttributeModifier DRINKING_SPEED_PENALTY_MODIFIER() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER); }
// public int drinkTimeLeft() { return wrapperContained.drinkTimeLeft; }
// public yarnwrap.util.Identifier DRINKING_SPEED_PENALTY_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.DRINKING_SPEED_PENALTY_MODIFIER_ID); }
// public yarnwrap.entity.data.TrackedData DRINKING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DRINKING); }
public Object createWitchAttributes() { return wrapperContained.createWitchAttributes(); }
public void setDrinking(boolean drinking) { wrapperContained.setDrinking(drinking); }
public boolean isDrinking() { return wrapperContained.isDrinking(); }

}