package yarnwrap.predicate.entity;
public class EntityEffectPredicate { public net.minecraft.predicate.entity.EntityEffectPredicate wrapperContained; public EntityEffectPredicate(net.minecraft.predicate.entity.EntityEffectPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map effects() { return wrapperContained.effects; }
// public void effects(java.util.Map value) { wrapperContained.effects = value; }
// public static java.util.Map effects() { return net.minecraft.predicate.entity.EntityEffectPredicate.effects; }
// public static void effects(java.util.Map value, ) { net.minecraft.predicate.entity.EntityEffectPredicate.effects = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntityEffectPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityEffectPredicate.CODEC = value; }

public EntityEffectPredicate(java.util.Map effects) { this.wrapperContained = new net.minecraft.predicate.entity.EntityEffectPredicate(effects); }
// public java.util.Map effects() { return wrapperContained.effects(); }
// // public static java.util.Map effects() { return net.minecraft.predicate.entity.EntityEffectPredicate.effects(); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
// public static boolean test(yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.EntityEffectPredicate.test(entity.wrapperContained); }
public boolean test(java.util.Map effects) { return wrapperContained.test(effects); }
// public static boolean test(java.util.Map effects, ) { return net.minecraft.predicate.entity.EntityEffectPredicate.test(effects); }
public boolean test(yarnwrap.entity.LivingEntity livingEntity) { return wrapperContained.test(livingEntity.wrapperContained); }
// public static boolean test(yarnwrap.entity.LivingEntity livingEntity, ) { return net.minecraft.predicate.entity.EntityEffectPredicate.test(livingEntity.wrapperContained); }

}