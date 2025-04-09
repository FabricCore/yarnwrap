package yarnwrap.predicate.entity;
public class SlimePredicate { public net.minecraft.predicate.entity.SlimePredicate wrapperContained; public SlimePredicate(net.minecraft.predicate.entity.SlimePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.predicate.entity.SlimePredicate of(Object size) { return new yarnwrap.predicate.entity.SlimePredicate(wrapperContained.of(size)); }

}