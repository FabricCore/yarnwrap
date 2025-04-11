package yarnwrap.item;
public class MaceItem { public net.minecraft.item.MaceItem wrapperContained; public MaceItem(net.minecraft.item.MaceItem wrapperContained) { this.wrapperContained = wrapperContained; }

public float MINING_SPEED_MULTIPLIER() { return wrapperContained.MINING_SPEED_MULTIPLIER; }
// public void MINING_SPEED_MULTIPLIER(float value) { wrapperContained.MINING_SPEED_MULTIPLIER = value; }
// public int ATTACK_DAMAGE_MODIFIER_VALUE() { return wrapperContained.ATTACK_DAMAGE_MODIFIER_VALUE; }
// public void ATTACK_DAMAGE_MODIFIER_VALUE(int value) { wrapperContained.ATTACK_DAMAGE_MODIFIER_VALUE = value; }
// public float ATTACK_SPEED_MODIFIER_VALUE() { return wrapperContained.ATTACK_SPEED_MODIFIER_VALUE; }
// public void ATTACK_SPEED_MODIFIER_VALUE(float value) { wrapperContained.ATTACK_SPEED_MODIFIER_VALUE = value; }
public float KNOCKBACK_RANGE() { return wrapperContained.KNOCKBACK_RANGE; }
// public void KNOCKBACK_RANGE(float value) { wrapperContained.KNOCKBACK_RANGE = value; }
// public float KNOCKBACK_POWER() { return wrapperContained.KNOCKBACK_POWER; }
// public void KNOCKBACK_POWER(float value) { wrapperContained.KNOCKBACK_POWER = value; }
// public void knockbackNearbyEntities(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity attacked) { wrapperContained.knockbackNearbyEntities(world.wrapperContained,player.wrapperContained,attacked.wrapperContained); }
public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }
public boolean shouldDealAdditionalDamage(yarnwrap.entity.LivingEntity attacker) { return wrapperContained.shouldDealAdditionalDamage(attacker.wrapperContained); }
// public java.util.function.Predicate getKnockbackPredicate(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.Entity attacked) { return wrapperContained.getKnockbackPredicate(player.wrapperContained,attacked.wrapperContained); }
// public double getKnockback(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.LivingEntity attacked,yarnwrap.util.math.Vec3d distance) { return wrapperContained.getKnockback(player.wrapperContained,attacked.wrapperContained,distance.wrapperContained); }
public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers()); }

}