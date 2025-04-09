package yarnwrap.predicate.item;
public class DamagePredicate { public net.minecraft.predicate.item.DamagePredicate wrapperContained; public DamagePredicate(net.minecraft.predicate.item.DamagePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.predicate.item.DamagePredicate durability(Object durability) { return new yarnwrap.predicate.item.DamagePredicate(wrapperContained.durability(durability)); }

}