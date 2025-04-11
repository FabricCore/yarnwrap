package yarnwrap.predicate.item;
public class TrimPredicate { public net.minecraft.predicate.item.TrimPredicate wrapperContained; public TrimPredicate(net.minecraft.predicate.item.TrimPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}