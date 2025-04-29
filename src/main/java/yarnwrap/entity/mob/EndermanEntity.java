package yarnwrap.entity.mob;
public class EndermanEntity { public net.minecraft.entity.mob.EndermanEntity wrapperContained; public EndermanEntity(net.minecraft.entity.mob.EndermanEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData PROVOKED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PROVOKED); }
// public void PROVOKED(yarnwrap.entity.data.TrackedData value) { wrapperContained.PROVOKED = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData PROVOKED() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.EndermanEntity.PROVOKED); }
// public static void PROVOKED(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.EndermanEntity.PROVOKED = value.wrapperContained; }

// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public static int angerTime() { return net.minecraft.entity.mob.EndermanEntity.angerTime; }
// public static void angerTime(int value, ) { net.minecraft.entity.mob.EndermanEntity.angerTime = value; }

// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public static java.util.UUID angryAt() { return net.minecraft.entity.mob.EndermanEntity.angryAt; }
// public static void angryAt(java.util.UUID value, ) { net.minecraft.entity.mob.EndermanEntity.angryAt = value; }

// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(net.minecraft.entity.mob.EndermanEntity.ANGER_TIME_RANGE); }
// public static void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value, ) { net.minecraft.entity.mob.EndermanEntity.ANGER_TIME_RANGE = value.wrapperContained; }

// public yarnwrap.entity.attribute.EntityAttributeModifier ATTACKING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.ATTACKING_SPEED_BOOST); }
// public void ATTACKING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.ATTACKING_SPEED_BOOST = value.wrapperContained; }
// public static yarnwrap.entity.attribute.EntityAttributeModifier ATTACKING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(net.minecraft.entity.mob.EndermanEntity.ATTACKING_SPEED_BOOST); }
// public static void ATTACKING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value, ) { net.minecraft.entity.mob.EndermanEntity.ATTACKING_SPEED_BOOST = value.wrapperContained; }

// public int lastAngrySoundAge() { return wrapperContained.lastAngrySoundAge; }
// public void lastAngrySoundAge(int value) { wrapperContained.lastAngrySoundAge = value; }
// public static int lastAngrySoundAge() { return net.minecraft.entity.mob.EndermanEntity.lastAngrySoundAge; }
// public static void lastAngrySoundAge(int value, ) { net.minecraft.entity.mob.EndermanEntity.lastAngrySoundAge = value; }

// public int ageWhenTargetSet() { return wrapperContained.ageWhenTargetSet; }
// public void ageWhenTargetSet(int value) { wrapperContained.ageWhenTargetSet = value; }
// public static int ageWhenTargetSet() { return net.minecraft.entity.mob.EndermanEntity.ageWhenTargetSet; }
// public static void ageWhenTargetSet(int value, ) { net.minecraft.entity.mob.EndermanEntity.ageWhenTargetSet = value; }

// public yarnwrap.entity.data.TrackedData ANGRY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGRY); }
// public void ANGRY(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGRY = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ANGRY() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.EndermanEntity.ANGRY); }
// public static void ANGRY(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.EndermanEntity.ANGRY = value.wrapperContained; }

// public yarnwrap.util.Identifier ATTACKING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ATTACKING_SPEED_MODIFIER_ID); }
// public void ATTACKING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.ATTACKING_SPEED_MODIFIER_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier ATTACKING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(net.minecraft.entity.mob.EndermanEntity.ATTACKING_SPEED_MODIFIER_ID); }
// public static void ATTACKING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value, ) { net.minecraft.entity.mob.EndermanEntity.ATTACKING_SPEED_MODIFIER_ID = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData CARRIED_BLOCK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CARRIED_BLOCK); }
// public void CARRIED_BLOCK(yarnwrap.entity.data.TrackedData value) { wrapperContained.CARRIED_BLOCK = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CARRIED_BLOCK() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.EndermanEntity.CARRIED_BLOCK); }
// public static void CARRIED_BLOCK(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.EndermanEntity.CARRIED_BLOCK = value.wrapperContained; }

public boolean isProvoked() { return wrapperContained.isProvoked(); }
// public static boolean isProvoked() { return net.minecraft.entity.mob.EndermanEntity.isProvoked(); }
public void setProvoked() { wrapperContained.setProvoked(); }
// public static void setProvoked() { net.minecraft.entity.mob.EndermanEntity.setProvoked(); }
// public Object createEndermanAttributes() { return wrapperContained.createEndermanAttributes(); }
public static Object createEndermanAttributes() { return net.minecraft.entity.mob.EndermanEntity.createEndermanAttributes(); }
// public boolean damageFromPotion(yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.projectile.thrown.PotionEntity potion,float amount) { return wrapperContained.damageFromPotion(source.wrapperContained,potion.wrapperContained,amount); }
// public static boolean damageFromPotion(yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.projectile.thrown.PotionEntity potion,float amount, ) { return net.minecraft.entity.mob.EndermanEntity.damageFromPotion(source.wrapperContained,potion.wrapperContained,amount); }
// public boolean teleportTo(double x,double y,double z) { return wrapperContained.teleportTo(x,y,z); }
// public static boolean teleportTo(double x,double y,double z, ) { return net.minecraft.entity.mob.EndermanEntity.teleportTo(x,y,z); }
// public boolean teleportTo(yarnwrap.entity.Entity entity) { return wrapperContained.teleportTo(entity.wrapperContained); }
// public static boolean teleportTo(yarnwrap.entity.Entity entity, ) { return net.minecraft.entity.mob.EndermanEntity.teleportTo(entity.wrapperContained); }
// public boolean isPlayerStaring(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerStaring(player.wrapperContained); }
// public static boolean isPlayerStaring(yarnwrap.entity.player.PlayerEntity player, ) { return net.minecraft.entity.mob.EndermanEntity.isPlayerStaring(player.wrapperContained); }
public yarnwrap.block.BlockState getCarriedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getCarriedBlock()); }
// public static yarnwrap.block.BlockState getCarriedBlock() { return new yarnwrap.block.BlockState(net.minecraft.entity.mob.EndermanEntity.getCarriedBlock()); }
public boolean isAngry() { return wrapperContained.isAngry(); }
// public static boolean isAngry() { return net.minecraft.entity.mob.EndermanEntity.isAngry(); }
// public boolean teleportRandomly() { return wrapperContained.teleportRandomly(); }
// public static boolean teleportRandomly() { return net.minecraft.entity.mob.EndermanEntity.teleportRandomly(); }
public void playAngrySound() { wrapperContained.playAngrySound(); }
// public static void playAngrySound() { net.minecraft.entity.mob.EndermanEntity.playAngrySound(); }
public void setCarriedBlock(yarnwrap.block.BlockState state) { wrapperContained.setCarriedBlock(state.wrapperContained); }
// public static void setCarriedBlock(yarnwrap.block.BlockState state, ) { net.minecraft.entity.mob.EndermanEntity.setCarriedBlock(state.wrapperContained); }

}