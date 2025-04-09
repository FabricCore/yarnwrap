package yarnwrap.predicate.entity;
public class FishingHookPredicate { public net.minecraft.predicate.entity.FishingHookPredicate wrapperContained; public FishingHookPredicate(net.minecraft.predicate.entity.FishingHookPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.predicate.entity.FishingHookPredicate ALL() { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.ALL); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.predicate.entity.FishingHookPredicate of(boolean inOpenWater) { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.of(inOpenWater)); }

}