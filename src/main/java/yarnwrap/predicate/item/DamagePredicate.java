package yarnwrap.predicate.item;
public class DamagePredicate { public net.minecraft.predicate.item.DamagePredicate wrapperContained; public DamagePredicate(net.minecraft.predicate.item.DamagePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_58164(Object instance) { return wrapperContained.method_58164(instance); }
// public yarnwrap.predicate.item.DamagePredicate durability(Object durability) { return new yarnwrap.predicate.item.DamagePredicate(wrapperContained.durability(durability)); }

}