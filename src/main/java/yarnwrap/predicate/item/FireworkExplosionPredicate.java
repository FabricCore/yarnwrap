package yarnwrap.predicate.item;
public class FireworkExplosionPredicate { public net.minecraft.predicate.item.FireworkExplosionPredicate wrapperContained; public FireworkExplosionPredicate(net.minecraft.predicate.item.FireworkExplosionPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.item.FireworkExplosionPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.item.FireworkExplosionPredicate.CODEC = value; }


}