package yarnwrap.predicate.entity;
public class PlayerPredicate { public net.minecraft.predicate.entity.PlayerPredicate wrapperContained; public PlayerPredicate(net.minecraft.predicate.entity.PlayerPredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object experienceLevel() { return wrapperContained.experienceLevel; }
// // public void experienceLevel(Object value) { wrapperContained.experienceLevel = value; }
// public yarnwrap.world.GameModeList gameMode() { return new yarnwrap.world.GameModeList(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameModeList value) { wrapperContained.gameMode = value.wrapperContained; }
public int LOOKING_AT_DISTANCE() { return wrapperContained.LOOKING_AT_DISTANCE; }
// public void LOOKING_AT_DISTANCE(int value) { wrapperContained.LOOKING_AT_DISTANCE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public PlayerPredicate(Object experienceLevel,yarnwrap.world.GameModeList recipes,java.util.List advancements) { this.wrapperContained = new net.minecraft.predicate.entity.PlayerPredicate(experienceLevel,recipes.wrapperContained,advancements); }
// public Object experienceLevel() { return wrapperContained.experienceLevel(); }
// public yarnwrap.world.GameModeList gameMode() { return new yarnwrap.world.GameModeList(wrapperContained.gameMode()); }
// public boolean method_37250(yarnwrap.entity.Entity hitEntity) { return wrapperContained.method_37250(hitEntity.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53219(Object instance) { return wrapperContained.method_53219(instance); }

}