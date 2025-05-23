package yarnwrap.item;
public class MaceItem { public net.minecraft.item.MaceItem wrapperContained; public MaceItem(net.minecraft.item.MaceItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public float MINING_SPEED_MULTIPLIER() { return wrapperContained.MINING_SPEED_MULTIPLIER; }
// public void MINING_SPEED_MULTIPLIER(float value) { wrapperContained.MINING_SPEED_MULTIPLIER = value; }
public static float MINING_SPEED_MULTIPLIER() { return net.minecraft.item.MaceItem.MINING_SPEED_MULTIPLIER; }
// public static void MINING_SPEED_MULTIPLIER(float value, ) { net.minecraft.item.MaceItem.MINING_SPEED_MULTIPLIER = value; }

// public int ATTACK_DAMAGE_MODIFIER_VALUE() { return wrapperContained.ATTACK_DAMAGE_MODIFIER_VALUE; }
// public void ATTACK_DAMAGE_MODIFIER_VALUE(int value) { wrapperContained.ATTACK_DAMAGE_MODIFIER_VALUE = value; }
// public static int ATTACK_DAMAGE_MODIFIER_VALUE() { return net.minecraft.item.MaceItem.ATTACK_DAMAGE_MODIFIER_VALUE; }
// public static void ATTACK_DAMAGE_MODIFIER_VALUE(int value, ) { net.minecraft.item.MaceItem.ATTACK_DAMAGE_MODIFIER_VALUE = value; }

// public float ATTACK_SPEED_MODIFIER_VALUE() { return wrapperContained.ATTACK_SPEED_MODIFIER_VALUE; }
// public void ATTACK_SPEED_MODIFIER_VALUE(float value) { wrapperContained.ATTACK_SPEED_MODIFIER_VALUE = value; }
// public static float ATTACK_SPEED_MODIFIER_VALUE() { return net.minecraft.item.MaceItem.ATTACK_SPEED_MODIFIER_VALUE; }
// public static void ATTACK_SPEED_MODIFIER_VALUE(float value, ) { net.minecraft.item.MaceItem.ATTACK_SPEED_MODIFIER_VALUE = value; }

// public float KNOCKBACK_RANGE() { return wrapperContained.KNOCKBACK_RANGE; }
// public void KNOCKBACK_RANGE(float value) { wrapperContained.KNOCKBACK_RANGE = value; }
public static float KNOCKBACK_RANGE() { return net.minecraft.item.MaceItem.KNOCKBACK_RANGE; }
// public static void KNOCKBACK_RANGE(float value, ) { net.minecraft.item.MaceItem.KNOCKBACK_RANGE = value; }

// public float KNOCKBACK_POWER() { return wrapperContained.KNOCKBACK_POWER; }
// public void KNOCKBACK_POWER(float value) { wrapperContained.KNOCKBACK_POWER = value; }
// public static float KNOCKBACK_POWER() { return net.minecraft.item.MaceItem.KNOCKBACK_POWER; }
// public static void KNOCKBACK_POWER(float value, ) { net.minecraft.item.MaceItem.KNOCKBACK_POWER = value; }

// public float HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD() { return wrapperContained.HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD; }
// public void HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD(float value) { wrapperContained.HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD = value; }
// public static float HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD() { return net.minecraft.item.MaceItem.HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD; }
// public static void HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD(float value, ) { net.minecraft.item.MaceItem.HEAVY_SMASH_SOUND_FALL_DISTANCE_THRESHOLD = value; }

// public void method_58409(yarnwrap.entity.Entity entity) { wrapperContained.method_58409(entity.wrapperContained); }
// public static void method_58409(yarnwrap.entity.Entity entity, ) { net.minecraft.item.MaceItem.method_58409(entity.wrapperContained); }
// public void knockbackNearbyEntities(yarnwrap.world.World world,yarnwrap.entity.Entity attacker,yarnwrap.entity.Entity attacked) { wrapperContained.knockbackNearbyEntities(world.wrapperContained,attacker.wrapperContained,attacked.wrapperContained); }
// public static void knockbackNearbyEntities(yarnwrap.world.World world,yarnwrap.entity.Entity attacker,yarnwrap.entity.Entity attacked, ) { net.minecraft.item.MaceItem.knockbackNearbyEntities(world.wrapperContained,attacker.wrapperContained,attacked.wrapperContained); }
// public yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(wrapperContained.createToolComponent()); }
public static yarnwrap.component.type.ToolComponent createToolComponent() { return new yarnwrap.component.type.ToolComponent(net.minecraft.item.MaceItem.createToolComponent()); }
// public boolean shouldDealAdditionalDamage(yarnwrap.entity.LivingEntity attacker) { return wrapperContained.shouldDealAdditionalDamage(attacker.wrapperContained); }
// public static boolean shouldDealAdditionalDamage(yarnwrap.entity.LivingEntity attacker, ) { return net.minecraft.item.MaceItem.shouldDealAdditionalDamage(attacker.wrapperContained); }
// public java.util.function.Predicate getKnockbackPredicate(yarnwrap.entity.Entity attacker,yarnwrap.entity.Entity attacked) { return wrapperContained.getKnockbackPredicate(attacker.wrapperContained,attacked.wrapperContained); }
// public static java.util.function.Predicate getKnockbackPredicate(yarnwrap.entity.Entity attacker,yarnwrap.entity.Entity attacked, ) { return net.minecraft.item.MaceItem.getKnockbackPredicate(attacker.wrapperContained,attacked.wrapperContained); }
// public boolean method_58661(yarnwrap.entity.Entity entity) { return wrapperContained.method_58661(entity.wrapperContained); }
// public static boolean method_58661(yarnwrap.entity.Entity entity, ) { return net.minecraft.item.MaceItem.method_58661(entity.wrapperContained); }
// public double getKnockback(yarnwrap.entity.Entity attacker,yarnwrap.entity.LivingEntity attacked,yarnwrap.util.math.Vec3d distance) { return wrapperContained.getKnockback(attacker.wrapperContained,attacked.wrapperContained,distance.wrapperContained); }
// public static double getKnockback(yarnwrap.entity.Entity attacker,yarnwrap.entity.LivingEntity attacked,yarnwrap.util.math.Vec3d distance, ) { return net.minecraft.item.MaceItem.getKnockback(attacker.wrapperContained,attacked.wrapperContained,distance.wrapperContained); }
// public yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(wrapperContained.createAttributeModifiers()); }
public static yarnwrap.component.type.AttributeModifiersComponent createAttributeModifiers() { return new yarnwrap.component.type.AttributeModifiersComponent(net.minecraft.item.MaceItem.createAttributeModifiers()); }
// public yarnwrap.util.math.Vec3d getCurrentExplosionImpactPos(yarnwrap.server.network.ServerPlayerEntity player) { return new yarnwrap.util.math.Vec3d(wrapperContained.getCurrentExplosionImpactPos(player.wrapperContained)); }
// public static yarnwrap.util.math.Vec3d getCurrentExplosionImpactPos(yarnwrap.server.network.ServerPlayerEntity player, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.item.MaceItem.getCurrentExplosionImpactPos(player.wrapperContained)); }

}