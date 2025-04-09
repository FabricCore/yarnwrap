package yarnwrap.predicate.entity;
public class PlayerPredicate { public net.minecraft.predicate.entity.PlayerPredicate wrapperContained; public PlayerPredicate(net.minecraft.predicate.entity.PlayerPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object experienceLevel() { return wrapperContained.experienceLevel; }
// public yarnwrap.world.GameModeList gameMode() { return new yarnwrap.world.GameModeList(wrapperContained.gameMode); }
public int LOOKING_AT_DISTANCE() { return wrapperContained.LOOKING_AT_DISTANCE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object experienceLevel() { return wrapperContained.experienceLevel(); }
// public yarnwrap.world.GameModeList gameMode() { return new yarnwrap.world.GameModeList(wrapperContained.gameMode()); }

}