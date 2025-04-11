package yarnwrap.predicate.item;
public class ContainerPredicate { public net.minecraft.predicate.item.ContainerPredicate wrapperContained; public ContainerPredicate(net.minecraft.predicate.item.ContainerPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_59674(Object instance) { return wrapperContained.method_59674(instance); }

}