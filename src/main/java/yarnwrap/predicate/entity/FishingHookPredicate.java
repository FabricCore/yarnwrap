package yarnwrap.predicate.entity;
public class FishingHookPredicate { public net.minecraft.predicate.entity.FishingHookPredicate wrapperContained; public FishingHookPredicate(net.minecraft.predicate.entity.FishingHookPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.predicate.entity.FishingHookPredicate ALL() { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.ALL); }
// public void ALL(yarnwrap.predicate.entity.FishingHookPredicate value) { wrapperContained.ALL = value.wrapperContained; }
public static yarnwrap.predicate.entity.FishingHookPredicate ALL() { return new yarnwrap.predicate.entity.FishingHookPredicate(net.minecraft.predicate.entity.FishingHookPredicate.ALL); }
// public static void ALL(yarnwrap.predicate.entity.FishingHookPredicate value, ) { net.minecraft.predicate.entity.FishingHookPredicate.ALL = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.predicate.entity.FishingHookPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.predicate.entity.FishingHookPredicate.CODEC = value; }

// public yarnwrap.predicate.entity.FishingHookPredicate of(boolean inOpenWater) { return new yarnwrap.predicate.entity.FishingHookPredicate(wrapperContained.of(inOpenWater)); }
// public static yarnwrap.predicate.entity.FishingHookPredicate of(boolean inOpenWater, ) { return new yarnwrap.predicate.entity.FishingHookPredicate(net.minecraft.predicate.entity.FishingHookPredicate.of(inOpenWater)); }
// public com.mojang.datafixers.kinds.App method_53150(Object instance) { return wrapperContained.method_53150(instance); }
// public static com.mojang.datafixers.kinds.App method_53150(Object instance, ) { return net.minecraft.predicate.entity.FishingHookPredicate.method_53150(instance); }

}