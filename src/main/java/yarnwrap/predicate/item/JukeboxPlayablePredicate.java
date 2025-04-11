package yarnwrap.predicate.item;
public class JukeboxPlayablePredicate { public net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained; public JukeboxPlayablePredicate(net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_60730(Object instance) { return wrapperContained.method_60730(instance); }
public yarnwrap.predicate.item.JukeboxPlayablePredicate empty() { return new yarnwrap.predicate.item.JukeboxPlayablePredicate(wrapperContained.empty()); }

}