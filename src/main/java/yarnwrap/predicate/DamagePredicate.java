package yarnwrap.predicate;
public class DamagePredicate { public net.minecraft.predicate.DamagePredicate wrapperContained; public DamagePredicate(net.minecraft.predicate.DamagePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object dealt() { return wrapperContained.dealt; }
// // public void dealt(Object value) { wrapperContained.dealt = value; }
// public Object taken() { return wrapperContained.taken; }
// // public void taken(Object value) { wrapperContained.taken = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public Object dealt() { return wrapperContained.dealt(); }
// public Object taken() { return wrapperContained.taken(); }
public boolean test(yarnwrap.server.network.ServerPlayerEntity player,yarnwrap.entity.damage.DamageSource source,float dealt,float taken,boolean blocked) { return wrapperContained.test(player.wrapperContained,source.wrapperContained,dealt,taken,blocked); }

}