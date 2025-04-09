package yarnwrap.predicate.item;
public class CustomDataPredicate { public net.minecraft.predicate.item.CustomDataPredicate wrapperContained; public CustomDataPredicate(net.minecraft.predicate.item.CustomDataPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.predicate.item.CustomDataPredicate customData(yarnwrap.predicate.NbtPredicate value) { return new yarnwrap.predicate.item.CustomDataPredicate(wrapperContained.customData(value.wrapperContained)); }

}