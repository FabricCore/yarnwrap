package yarnwrap.predicate.item;
public class JukeboxPlayablePredicate { public net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained; public JukeboxPlayablePredicate(net.minecraft.predicate.item.JukeboxPlayablePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.predicate.item.JukeboxPlayablePredicate empty() { return new yarnwrap.predicate.item.JukeboxPlayablePredicate(wrapperContained.empty()); }

}