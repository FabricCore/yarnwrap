package yarnwrap.predicate.item;
public class WrittenBookContentPredicate { public net.minecraft.predicate.item.WrittenBookContentPredicate wrapperContained; public WrittenBookContentPredicate(net.minecraft.predicate.item.WrittenBookContentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}