package yarnwrap.predicate.item;
public class WritableBookContentPredicate { public net.minecraft.predicate.item.WritableBookContentPredicate wrapperContained; public WritableBookContentPredicate(net.minecraft.predicate.item.WritableBookContentPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}