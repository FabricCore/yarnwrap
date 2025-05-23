package yarnwrap.predicate.entity;
public class SheepPredicate { public net.minecraft.predicate.entity.SheepPredicate wrapperContained; public SheepPredicate(net.minecraft.predicate.entity.SheepPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.predicate.entity.SheepPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.predicate.entity.SheepPredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_63497(Object instance) { return wrapperContained.method_63497(instance); }
// public static com.mojang.datafixers.kinds.App method_63497(Object instance, ) { return net.minecraft.predicate.entity.SheepPredicate.method_63497(instance); }
// public yarnwrap.predicate.entity.SheepPredicate unsheared() { return new yarnwrap.predicate.entity.SheepPredicate(wrapperContained.unsheared()); }
public static yarnwrap.predicate.entity.SheepPredicate unsheared() { return new yarnwrap.predicate.entity.SheepPredicate(net.minecraft.predicate.entity.SheepPredicate.unsheared()); }

}