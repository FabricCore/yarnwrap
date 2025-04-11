package yarnwrap.entity.mob;
public class ZombieEntity { public net.minecraft.entity.mob.ZombieEntity wrapperContained; public ZombieEntity(net.minecraft.entity.mob.ZombieEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate DOOR_BREAK_DIFFICULTY_CHECKER() { return wrapperContained.DOOR_BREAK_DIFFICULTY_CHECKER; }
// public void DOOR_BREAK_DIFFICULTY_CHECKER(java.util.function.Predicate value) { wrapperContained.DOOR_BREAK_DIFFICULTY_CHECKER = value; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier REINFORCEMENT_CALLEE_CHARGE_REINFORCEMENT_BONUS() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.REINFORCEMENT_CALLEE_CHARGE_REINFORCEMENT_BONUS); }
// public void REINFORCEMENT_CALLEE_CHARGE_REINFORCEMENT_BONUS(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.REINFORCEMENT_CALLEE_CHARGE_REINFORCEMENT_BONUS = value.wrapperContained; }
// public yarnwrap.util.Identifier LEADER_ZOMBIE_BONUS_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.LEADER_ZOMBIE_BONUS_MODIFIER_ID); }
// public void LEADER_ZOMBIE_BONUS_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.LEADER_ZOMBIE_BONUS_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.util.Identifier REINFORCEMENT_CALLER_CHARGE_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.REINFORCEMENT_CALLER_CHARGE_MODIFIER_ID); }
// public void REINFORCEMENT_CALLER_CHARGE_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.REINFORCEMENT_CALLER_CHARGE_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.util.Identifier ZOMBIE_RANDOM_SPAWN_BONUS_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ZOMBIE_RANDOM_SPAWN_BONUS_MODIFIER_ID); }
// public void ZOMBIE_RANDOM_SPAWN_BONUS_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.ZOMBIE_RANDOM_SPAWN_BONUS_MODIFIER_ID = value.wrapperContained; }
// public int ticksUntilWaterConversion() { return wrapperContained.ticksUntilWaterConversion; }
// public void ticksUntilWaterConversion(int value) { wrapperContained.ticksUntilWaterConversion = value; }
// public yarnwrap.entity.data.TrackedData CONVERTING_IN_WATER() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING_IN_WATER); }
// public void CONVERTING_IN_WATER(yarnwrap.entity.data.TrackedData value) { wrapperContained.CONVERTING_IN_WATER = value.wrapperContained; }
// public int inWaterTime() { return wrapperContained.inWaterTime; }
// public void inWaterTime(int value) { wrapperContained.inWaterTime = value; }
// public yarnwrap.entity.data.TrackedData ZOMBIE_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ZOMBIE_TYPE); }
// public void ZOMBIE_TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.ZOMBIE_TYPE = value.wrapperContained; }
// public yarnwrap.util.Identifier BABY_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.BABY_SPEED_MODIFIER_ID); }
// public void BABY_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.BABY_SPEED_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier BABY_SPEED_BONUS() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.BABY_SPEED_BONUS); }
// public void BABY_SPEED_BONUS(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.BABY_SPEED_BONUS = value.wrapperContained; }
// public boolean canBreakDoors() { return wrapperContained.canBreakDoors; }
// public void canBreakDoors(boolean value) { wrapperContained.canBreakDoors = value; }
// public yarnwrap.entity.ai.goal.BreakDoorGoal breakDoorsGoal() { return new yarnwrap.entity.ai.goal.BreakDoorGoal(wrapperContained.breakDoorsGoal); }
// public void breakDoorsGoal(yarnwrap.entity.ai.goal.BreakDoorGoal value) { wrapperContained.breakDoorsGoal = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData BABY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BABY); }
// public void BABY(yarnwrap.entity.data.TrackedData value) { wrapperContained.BABY = value.wrapperContained; }
public Object createZombieAttributes() { return wrapperContained.createZombieAttributes(); }
public boolean shouldBeBaby(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldBeBaby(random.wrapperContained); }
// public void initAttributes() { wrapperContained.initAttributes(); }
// public void convertTo(yarnwrap.entity.EntityType entityType) { wrapperContained.convertTo(entityType.wrapperContained); }
public void setCanBreakDoors(boolean canBreakDoors) { wrapperContained.setCanBreakDoors(canBreakDoors); }
// public void applyAttributeModifiers(float chanceMultiplier) { wrapperContained.applyAttributeModifiers(chanceMultiplier); }
public boolean isConvertingInWater() { return wrapperContained.isConvertingInWater(); }
// public yarnwrap.sound.SoundEvent getStepSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getStepSound()); }
// public void initCustomGoals() { wrapperContained.initCustomGoals(); }
// public boolean canConvertInWater() { return wrapperContained.canConvertInWater(); }
// public boolean canBreakDoors() { return wrapperContained.canBreakDoors(); }
// public boolean shouldBreakDoors() { return wrapperContained.shouldBreakDoors(); }
// public void setTicksUntilWaterConversion(int ticksUntilWaterConversion) { wrapperContained.setTicksUntilWaterConversion(ticksUntilWaterConversion); }
// public yarnwrap.item.ItemStack getSkull() { return new yarnwrap.item.ItemStack(wrapperContained.getSkull()); }
// public boolean burnsInDaylight() { return wrapperContained.burnsInDaylight(); }
// public void convertInWater() { wrapperContained.convertInWater(); }

}