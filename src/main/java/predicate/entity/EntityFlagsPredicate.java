package yarnwrap.predicate.entity;
public class EntityFlagsPredicate { public net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained; public EntityFlagsPredicate(net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional isSneaking() { return wrapperContained.isSneaking; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional isSneaking() { return wrapperContained.isSneaking(); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }

}