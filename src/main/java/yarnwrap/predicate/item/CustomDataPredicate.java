package yarnwrap.predicate.item;
public class CustomDataPredicate { public net.minecraft.predicate.item.CustomDataPredicate wrapperContained; public CustomDataPredicate(net.minecraft.predicate.item.CustomDataPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.CustomDataPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.CustomDataPredicate.CODEC = value; }

// public yarnwrap.predicate.item.CustomDataPredicate customData(yarnwrap.predicate.NbtPredicate value) { return new yarnwrap.predicate.item.CustomDataPredicate(wrapperContained.customData(value.wrapperContained)); }
// public static yarnwrap.predicate.item.CustomDataPredicate customData(yarnwrap.predicate.NbtPredicate value, ) { return new yarnwrap.predicate.item.CustomDataPredicate(net.minecraft.predicate.item.CustomDataPredicate.customData(value.wrapperContained)); }

}