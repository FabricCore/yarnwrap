package yarnwrap.predicate.entity;
public class LightningBoltPredicate { public net.minecraft.predicate.entity.LightningBoltPredicate wrapperContained; public LightningBoltPredicate(net.minecraft.predicate.entity.LightningBoltPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.predicate.entity.LightningBoltPredicate of(Object blocksSetOnFire) { return new yarnwrap.predicate.entity.LightningBoltPredicate(wrapperContained.of(blocksSetOnFire)); }

}