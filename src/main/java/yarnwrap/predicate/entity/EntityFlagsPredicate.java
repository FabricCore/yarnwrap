package yarnwrap.predicate.entity;
public class EntityFlagsPredicate { public net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained; public EntityFlagsPredicate(net.minecraft.predicate.entity.EntityFlagsPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional isSneaking() { return wrapperContained.isSneaking; }
// public void isSneaking(java.util.Optional value) { wrapperContained.isSneaking = value; }
// public static java.util.Optional isSneaking() { return net.minecraft.predicate.entity.EntityFlagsPredicate.isSneaking; }
// public static void isSneaking(java.util.Optional value, ) { net.minecraft.predicate.entity.EntityFlagsPredicate.isSneaking = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntityFlagsPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityFlagsPredicate.CODEC = value; }

// public java.util.Optional isSneaking() { return wrapperContained.isSneaking(); }
// // public static java.util.Optional isSneaking() { return net.minecraft.predicate.entity.EntityFlagsPredicate.isSneaking(); }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
// public static boolean test(yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.EntityFlagsPredicate.test(entity.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53131(Object instance) { return wrapperContained.method_53131(instance); }
// public static com.mojang.datafixers.kinds.App method_53131(Object instance, ) { return net.minecraft.predicate.entity.EntityFlagsPredicate.method_53131(instance); }

}