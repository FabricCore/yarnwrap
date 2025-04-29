package yarnwrap.predicate.entity;
public class LightningBoltPredicate { public net.minecraft.predicate.entity.LightningBoltPredicate wrapperContained; public LightningBoltPredicate(net.minecraft.predicate.entity.LightningBoltPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.predicate.entity.LightningBoltPredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.predicate.entity.LightningBoltPredicate.CODEC = value; }

// public LightningBoltPredicate(Object blocksSetOnFire) { this.wrapperContained = new net.minecraft.predicate.entity.LightningBoltPredicate(blocksSetOnFire); }
// public boolean method_37235(yarnwrap.server.world.ServerWorld struckEntity) { return wrapperContained.method_37235(struckEntity.wrapperContained); }
// public static boolean method_37235(yarnwrap.server.world.ServerWorld struckEntity, ) { return net.minecraft.predicate.entity.LightningBoltPredicate.method_37235(struckEntity.wrapperContained); }
// public yarnwrap.predicate.entity.LightningBoltPredicate of(Object blocksSetOnFire) { return new yarnwrap.predicate.entity.LightningBoltPredicate(wrapperContained.of(blocksSetOnFire)); }
// public static yarnwrap.predicate.entity.LightningBoltPredicate of(Object blocksSetOnFire, ) { return new yarnwrap.predicate.entity.LightningBoltPredicate(net.minecraft.predicate.entity.LightningBoltPredicate.of(blocksSetOnFire)); }
// public com.mojang.datafixers.kinds.App method_53175(Object instance) { return wrapperContained.method_53175(instance); }
// public static com.mojang.datafixers.kinds.App method_53175(Object instance, ) { return net.minecraft.predicate.entity.LightningBoltPredicate.method_53175(instance); }

}