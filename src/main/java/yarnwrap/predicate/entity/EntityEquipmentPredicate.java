package yarnwrap.predicate.entity;
public class EntityEquipmentPredicate { public net.minecraft.predicate.entity.EntityEquipmentPredicate wrapperContained; public EntityEquipmentPredicate(net.minecraft.predicate.entity.EntityEquipmentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.entity.EntityEquipmentPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.entity.EntityEquipmentPredicate.CODEC = value; }

public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
// public static boolean test(yarnwrap.entity.Entity entity, ) { return net.minecraft.predicate.entity.EntityEquipmentPredicate.test(entity.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53129(Object instance) { return wrapperContained.method_53129(instance); }
// public static com.mojang.datafixers.kinds.App method_53129(Object instance, ) { return net.minecraft.predicate.entity.EntityEquipmentPredicate.method_53129(instance); }
// public yarnwrap.predicate.entity.EntityEquipmentPredicate ominousBannerOnHead(yarnwrap.registry.RegistryEntryLookup bannerPatternLookup) { return new yarnwrap.predicate.entity.EntityEquipmentPredicate(wrapperContained.ominousBannerOnHead(bannerPatternLookup.wrapperContained)); }
// public static yarnwrap.predicate.entity.EntityEquipmentPredicate ominousBannerOnHead(yarnwrap.registry.RegistryEntryLookup bannerPatternLookup, ) { return new yarnwrap.predicate.entity.EntityEquipmentPredicate(net.minecraft.predicate.entity.EntityEquipmentPredicate.ominousBannerOnHead(bannerPatternLookup.wrapperContained)); }

}