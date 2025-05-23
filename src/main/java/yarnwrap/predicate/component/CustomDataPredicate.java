package yarnwrap.predicate.component;
public class CustomDataPredicate { public net.minecraft.predicate.component.CustomDataPredicate wrapperContained; public CustomDataPredicate(net.minecraft.predicate.component.CustomDataPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.component.CustomDataPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.component.CustomDataPredicate.CODEC = value; }

// public yarnwrap.predicate.component.CustomDataPredicate customData(yarnwrap.predicate.NbtPredicate value) { return new yarnwrap.predicate.component.CustomDataPredicate(wrapperContained.customData(value.wrapperContained)); }
// public static yarnwrap.predicate.component.CustomDataPredicate customData(yarnwrap.predicate.NbtPredicate value, ) { return new yarnwrap.predicate.component.CustomDataPredicate(net.minecraft.predicate.component.CustomDataPredicate.customData(value.wrapperContained)); }

}