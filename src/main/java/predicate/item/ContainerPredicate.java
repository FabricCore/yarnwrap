package yarnwrap.predicate.item;
public class ContainerPredicate { public net.minecraft.predicate.item.ContainerPredicate wrapperContained; public ContainerPredicate(net.minecraft.predicate.item.ContainerPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}