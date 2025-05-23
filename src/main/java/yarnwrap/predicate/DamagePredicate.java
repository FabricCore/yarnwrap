package yarnwrap.predicate;
public class DamagePredicate { public net.minecraft.predicate.DamagePredicate wrapperContained; public DamagePredicate(net.minecraft.predicate.DamagePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object dealt() { return wrapperContained.dealt; }
// // public void dealt(Object value) { wrapperContained.dealt = value; }
// // public static Object dealt() { return net.minecraft.predicate.DamagePredicate.dealt; }
// // public static void dealt(Object value, ) { net.minecraft.predicate.DamagePredicate.dealt = value; }

// public Object taken() { return wrapperContained.taken; }
// // public void taken(Object value) { wrapperContained.taken = value; }
// // public static Object taken() { return net.minecraft.predicate.DamagePredicate.taken; }
// // public static void taken(Object value, ) { net.minecraft.predicate.DamagePredicate.taken = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.predicate.DamagePredicate.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.predicate.DamagePredicate.CODEC = value; }

// public DamagePredicate(Object dealt,Object taken) { this.wrapperContained = new net.minecraft.predicate.DamagePredicate(dealt,taken); }
// public Object dealt() { return wrapperContained.dealt(); }
// // public static Object dealt() { return net.minecraft.predicate.DamagePredicate.dealt(); }
// public Object taken() { return wrapperContained.taken(); }
// // public static Object taken() { return net.minecraft.predicate.DamagePredicate.taken(); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked) { return wrapperContained.test(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }
// public static boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked, ) { return net.minecraft.predicate.DamagePredicate.test(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }
// public com.mojang.datafixers.kinds.App method_54973(Object instance) { return wrapperContained.method_54973(instance); }
// public static com.mojang.datafixers.kinds.App method_54973(Object instance, ) { return net.minecraft.predicate.DamagePredicate.method_54973(instance); }

}