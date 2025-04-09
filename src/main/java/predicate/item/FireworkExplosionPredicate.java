package yarnwrap.predicate.item;
public class FireworkExplosionPredicate { public net.minecraft.predicate.item.FireworkExplosionPredicate wrapperContained; public FireworkExplosionPredicate(net.minecraft.predicate.item.FireworkExplosionPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}