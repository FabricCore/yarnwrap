package yarnwrap.predicate.entity;
public class EntityEffectPredicate { public net.minecraft.predicate.entity.EntityEffectPredicate wrapperContained; public EntityEffectPredicate(net.minecraft.predicate.entity.EntityEffectPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map effects() { return wrapperContained.effects; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.Map effects() { return wrapperContained.effects(); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
public boolean test(java.util.Map effects) { return wrapperContained.test(effects); }
public boolean test(yarnwrap.entity.LivingEntity livingEntity) { return wrapperContained.test(livingEntity.wrapperContained); }

}