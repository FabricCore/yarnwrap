package yarnwrap.predicate.item;
public class WrittenBookContentPredicate { public net.minecraft.predicate.item.WrittenBookContentPredicate wrapperContained; public WrittenBookContentPredicate(net.minecraft.predicate.item.WrittenBookContentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_59696(Object instance) { return wrapperContained.method_59696(instance); }

}