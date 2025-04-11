package yarnwrap.predicate.entity;
public class FishingHookPredicate { public net.minecraft.predicate.entity.FishingHookPredicate wrapperContained; public FishingHookPredicate(net.minecraft.predicate.entity.FishingHookPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.predicate.entity.FishingHookPredicate ALL() { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.ALL); }
// public void ALL(yarnwrap.predicate.entity.FishingHookPredicate value) { wrapperContained.ALL = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.predicate.entity.FishingHookPredicate of(boolean inOpenWater) { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.of(inOpenWater)); }
// public com.mojang.datafixers.kinds.App method_53150(Object instance) { return wrapperContained.method_53150(instance); }

}