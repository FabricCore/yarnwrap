package yarnwrap.predicate.entity;
public class EntityEquipmentPredicate { public net.minecraft.predicate.entity.EntityEquipmentPredicate wrapperContained; public EntityEquipmentPredicate(net.minecraft.predicate.entity.EntityEquipmentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean test(yarnwrap.entity.Entity entity) { return wrapperContained.test(entity.wrapperContained); }
public yarnwrap.predicate.entity.EntityEquipmentPredicate ominousBannerOnHead(yarnwrap.registry.RegistryEntryLookup bannerPatternLookup) { return new yarnwrap.predicate.entity.EntityEquipmentPredicate(wrapperContained.ominousBannerOnHead(bannerPatternLookup.wrapperContained)); }

}