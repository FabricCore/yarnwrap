package yarnwrap.world;
public class GameModeList { public net.minecraft.world.GameModeList wrapperContained; public GameModeList(net.minecraft.world.GameModeList wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List gameModes() { return wrapperContained.gameModes; }
// public void gameModes(java.util.List value) { wrapperContained.gameModes = value; }
// public static java.util.List gameModes() { return net.minecraft.world.GameModeList.gameModes; }
// public static void gameModes(java.util.List value, ) { net.minecraft.world.GameModeList.gameModes = value; }

// public yarnwrap.world.GameModeList ALL() { return new yarnwrap.world.GameModeList(wrapperContained.ALL); }
// public void ALL(yarnwrap.world.GameModeList value) { wrapperContained.ALL = value.wrapperContained; }
public static yarnwrap.world.GameModeList ALL() { return new yarnwrap.world.GameModeList(net.minecraft.world.GameModeList.ALL); }
// public static void ALL(yarnwrap.world.GameModeList value, ) { net.minecraft.world.GameModeList.ALL = value.wrapperContained; }

// public yarnwrap.world.GameModeList SURVIVAL_LIKE() { return new yarnwrap.world.GameModeList(wrapperContained.SURVIVAL_LIKE); }
// public void SURVIVAL_LIKE(yarnwrap.world.GameModeList value) { wrapperContained.SURVIVAL_LIKE = value.wrapperContained; }
public static yarnwrap.world.GameModeList SURVIVAL_LIKE() { return new yarnwrap.world.GameModeList(net.minecraft.world.GameModeList.SURVIVAL_LIKE); }
// public static void SURVIVAL_LIKE(yarnwrap.world.GameModeList value, ) { net.minecraft.world.GameModeList.SURVIVAL_LIKE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.GameModeList.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.GameModeList.CODEC = value; }

// public java.util.List gameModes() { return wrapperContained.gameModes(); }
// // public static java.util.List gameModes() { return net.minecraft.world.GameModeList.gameModes(); }
public boolean contains(yarnwrap.world.GameMode gameMode) { return wrapperContained.contains(gameMode.wrapperContained); }
// public static boolean contains(yarnwrap.world.GameMode gameMode, ) { return net.minecraft.world.GameModeList.contains(gameMode.wrapperContained); }
// public yarnwrap.world.GameModeList of(net.minecraft.world.GameMode[] gameModes) { return new yarnwrap.world.GameModeList(wrapperContained.of(gameModes)); }
// public static yarnwrap.world.GameModeList of(net.minecraft.world.GameMode[] gameModes, ) { return new yarnwrap.world.GameModeList(net.minecraft.world.GameModeList.of(gameModes)); }

}