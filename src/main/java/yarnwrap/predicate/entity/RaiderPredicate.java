package yarnwrap.predicate.entity;
public class RaiderPredicate { public net.minecraft.predicate.entity.RaiderPredicate wrapperContained; public RaiderPredicate(net.minecraft.predicate.entity.RaiderPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.predicate.entity.RaiderPredicate CAPTAIN_WITHOUT_RAID() { return new yarnwrap.predicate.entity.RaiderPredicate(wrapperContained.CAPTAIN_WITHOUT_RAID); }
// public void CAPTAIN_WITHOUT_RAID(yarnwrap.predicate.entity.RaiderPredicate value) { wrapperContained.CAPTAIN_WITHOUT_RAID = value.wrapperContained; }

}