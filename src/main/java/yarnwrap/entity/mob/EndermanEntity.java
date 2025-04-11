package yarnwrap.entity.mob;
public class EndermanEntity { public net.minecraft.entity.mob.EndermanEntity wrapperContained; public EndermanEntity(net.minecraft.entity.mob.EndermanEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData PROVOKED() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PROVOKED); }
// public void PROVOKED(yarnwrap.entity.data.TrackedData value) { wrapperContained.PROVOKED = value.wrapperContained; }
// public int angerTime() { return wrapperContained.angerTime; }
// public void angerTime(int value) { wrapperContained.angerTime = value; }
// public java.util.UUID angryAt() { return wrapperContained.angryAt; }
// public void angryAt(java.util.UUID value) { wrapperContained.angryAt = value; }
// public yarnwrap.util.math.intprovider.UniformIntProvider ANGER_TIME_RANGE() { return new yarnwrap.util.math.intprovider.UniformIntProvider(wrapperContained.ANGER_TIME_RANGE); }
// public void ANGER_TIME_RANGE(yarnwrap.util.math.intprovider.UniformIntProvider value) { wrapperContained.ANGER_TIME_RANGE = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier ATTACKING_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.ATTACKING_SPEED_BOOST); }
// public void ATTACKING_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.ATTACKING_SPEED_BOOST = value.wrapperContained; }
// public int lastAngrySoundAge() { return wrapperContained.lastAngrySoundAge; }
// public void lastAngrySoundAge(int value) { wrapperContained.lastAngrySoundAge = value; }
// public int ageWhenTargetSet() { return wrapperContained.ageWhenTargetSet; }
// public void ageWhenTargetSet(int value) { wrapperContained.ageWhenTargetSet = value; }
// public yarnwrap.entity.data.TrackedData ANGRY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ANGRY); }
// public void ANGRY(yarnwrap.entity.data.TrackedData value) { wrapperContained.ANGRY = value.wrapperContained; }
// public yarnwrap.util.Identifier ATTACKING_SPEED_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.ATTACKING_SPEED_MODIFIER_ID); }
// public void ATTACKING_SPEED_MODIFIER_ID(yarnwrap.util.Identifier value) { wrapperContained.ATTACKING_SPEED_MODIFIER_ID = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CARRIED_BLOCK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CARRIED_BLOCK); }
// public void CARRIED_BLOCK(yarnwrap.entity.data.TrackedData value) { wrapperContained.CARRIED_BLOCK = value.wrapperContained; }
public boolean isProvoked() { return wrapperContained.isProvoked(); }
public void setProvoked() { wrapperContained.setProvoked(); }
public Object createEndermanAttributes() { return wrapperContained.createEndermanAttributes(); }
// public boolean damageFromPotion(yarnwrap.entity.damage.DamageSource source,yarnwrap.entity.projectile.thrown.PotionEntity potion,float amount) { return wrapperContained.damageFromPotion(source.wrapperContained,potion.wrapperContained,amount); }
// public boolean teleportTo(double x,double y,double z) { return wrapperContained.teleportTo(x,y,z); }
// public boolean teleportTo(yarnwrap.entity.Entity entity) { return wrapperContained.teleportTo(entity.wrapperContained); }
// public boolean isPlayerStaring(yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.isPlayerStaring(player.wrapperContained); }
public yarnwrap.block.BlockState getCarriedBlock() { return new yarnwrap.block.BlockState(wrapperContained.getCarriedBlock()); }
public boolean isAngry() { return wrapperContained.isAngry(); }
// public boolean teleportRandomly() { return wrapperContained.teleportRandomly(); }
public void playAngrySound() { wrapperContained.playAngrySound(); }
public void setCarriedBlock(yarnwrap.block.BlockState state) { wrapperContained.setCarriedBlock(state.wrapperContained); }

}