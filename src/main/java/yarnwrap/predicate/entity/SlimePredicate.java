package yarnwrap.predicate.entity;
public class SlimePredicate { public net.minecraft.predicate.entity.SlimePredicate wrapperContained; public SlimePredicate(net.minecraft.predicate.entity.SlimePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.predicate.entity.SlimePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.predicate.entity.SlimePredicate.CODEC = value; }

// public SlimePredicate(Object size) { this.wrapperContained = new net.minecraft.predicate.entity.SlimePredicate(size); }
// public yarnwrap.predicate.entity.SlimePredicate of(Object size) { return new yarnwrap.predicate.entity.SlimePredicate(wrapperContained.of(size)); }
// public static yarnwrap.predicate.entity.SlimePredicate of(Object size, ) { return new yarnwrap.predicate.entity.SlimePredicate(net.minecraft.predicate.entity.SlimePredicate.of(size)); }
// public com.mojang.datafixers.kinds.App method_53234(Object instance) { return wrapperContained.method_53234(instance); }
// public static com.mojang.datafixers.kinds.App method_53234(Object instance, ) { return net.minecraft.predicate.entity.SlimePredicate.method_53234(instance); }

}