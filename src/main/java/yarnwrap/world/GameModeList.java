package yarnwrap.world;
public class GameModeList { public net.minecraft.world.GameModeList wrapperContained; public GameModeList(net.minecraft.world.GameModeList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List gameModes() { return wrapperContained.gameModes; }
// public void gameModes(java.util.List value) { wrapperContained.gameModes = value; }
public yarnwrap.world.GameModeList ALL() { return new yarnwrap.world.GameModeList(wrapperContained.ALL); }
// public void ALL(yarnwrap.world.GameModeList value) { wrapperContained.ALL = value.wrapperContained; }
public yarnwrap.world.GameModeList SURVIVAL_LIKE() { return new yarnwrap.world.GameModeList(wrapperContained.SURVIVAL_LIKE); }
// public void SURVIVAL_LIKE(yarnwrap.world.GameModeList value) { wrapperContained.SURVIVAL_LIKE = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.List gameModes() { return wrapperContained.gameModes(); }
public boolean contains(yarnwrap.world.GameMode gameMode) { return wrapperContained.contains(gameMode.wrapperContained); }
public yarnwrap.world.GameModeList of(net.minecraft.world.GameMode[] gameModes) { return new yarnwrap.world.GameModeList(wrapperContained.of(gameModes)); }

}