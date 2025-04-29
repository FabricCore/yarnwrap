package yarnwrap.predicate.item;
public class JukeboxPlayablePredicate { public net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained; public JukeboxPlayablePredicate(net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.JukeboxPlayablePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.JukeboxPlayablePredicate.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_60730(Object instance) { return wrapperContained.method_60730(instance); }
// public static com.mojang.datafixers.kinds.App method_60730(Object instance, ) { return net.minecraft.predicate.item.JukeboxPlayablePredicate.method_60730(instance); }
// public yarnwrap.predicate.item.JukeboxPlayablePredicate empty() { return new yarnwrap.predicate.item.JukeboxPlayablePredicate(wrapperContained.empty()); }
public static yarnwrap.predicate.item.JukeboxPlayablePredicate empty() { return new yarnwrap.predicate.item.JukeboxPlayablePredicate(net.minecraft.predicate.item.JukeboxPlayablePredicate.empty()); }

}