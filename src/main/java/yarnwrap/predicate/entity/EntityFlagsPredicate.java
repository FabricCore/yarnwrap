package yarnwrap.predicate.entity;
public class EntityFlagsPredicate { public net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained; public EntityFlagsPredicate(net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional isSneaking() { return wrapperContained.isSneaking; }
// public void isSneaking(java.util.Optional value) { wrapperContained.isSneaking = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Optional isSneaking() { return wrapperContained.isSneaking(); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }

}