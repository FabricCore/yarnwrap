package yarnwrap.world.level;
public class LevelInfo { public net.minecraft.world.level.LevelInfo wrapperContained; public LevelInfo(net.minecraft.world.level.LevelInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public void gameMode(yarnwrap.world.GameMode value) { wrapperContained.gameMode = value.wrapperContained; }
// public static yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(net.minecraft.world.level.LevelInfo.gameMode); }
// public static void gameMode(yarnwrap.world.GameMode value, ) { net.minecraft.world.level.LevelInfo.gameMode = value.wrapperContained; }

// public boolean allowCommands() { return wrapperContained.allowCommands; }
// public void allowCommands(boolean value) { wrapperContained.allowCommands = value; }
// public static boolean allowCommands() { return net.minecraft.world.level.LevelInfo.allowCommands; }
// public static void allowCommands(boolean value, ) { net.minecraft.world.level.LevelInfo.allowCommands = value; }

// public boolean hardcore() { return wrapperContained.hardcore; }
// public void hardcore(boolean value) { wrapperContained.hardcore = value; }
// public static boolean hardcore() { return net.minecraft.world.level.LevelInfo.hardcore; }
// public static void hardcore(boolean value, ) { net.minecraft.world.level.LevelInfo.hardcore = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.world.level.LevelInfo.name; }
// public static void name(java.lang.String value, ) { net.minecraft.world.level.LevelInfo.name = value; }

// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public void difficulty(yarnwrap.world.Difficulty value) { wrapperContained.difficulty = value.wrapperContained; }
// public static yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.level.LevelInfo.difficulty); }
// public static void difficulty(yarnwrap.world.Difficulty value, ) { net.minecraft.world.level.LevelInfo.difficulty = value.wrapperContained; }

// public yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(wrapperContained.gameRules); }
// public void gameRules(yarnwrap.world.GameRules value) { wrapperContained.gameRules = value.wrapperContained; }
// public static yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(net.minecraft.world.level.LevelInfo.gameRules); }
// public static void gameRules(yarnwrap.world.GameRules value, ) { net.minecraft.world.level.LevelInfo.gameRules = value.wrapperContained; }

// public yarnwrap.resource.DataConfiguration dataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.dataConfiguration); }
// public void dataConfiguration(yarnwrap.resource.DataConfiguration value) { wrapperContained.dataConfiguration = value.wrapperContained; }
// public static yarnwrap.resource.DataConfiguration dataConfiguration() { return new yarnwrap.resource.DataConfiguration(net.minecraft.world.level.LevelInfo.dataConfiguration); }
// public static void dataConfiguration(yarnwrap.resource.DataConfiguration value, ) { net.minecraft.world.level.LevelInfo.dataConfiguration = value.wrapperContained; }

public LevelInfo(java.lang.String name,yarnwrap.world.GameMode gameMode,boolean hardcore,yarnwrap.world.Difficulty difficulty,boolean allowCommands,yarnwrap.world.GameRules gameRules,yarnwrap.resource.DataConfiguration dataConfiguration) { this.wrapperContained = new net.minecraft.world.level.LevelInfo(name,gameMode.wrapperContained,hardcore,difficulty.wrapperContained,allowCommands,gameRules.wrapperContained,dataConfiguration.wrapperContained); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
// public static yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(net.minecraft.world.level.LevelInfo.getGameMode()); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
// public static boolean areCommandsAllowed() { return net.minecraft.world.level.LevelInfo.areCommandsAllowed(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
// public static boolean isHardcore() { return net.minecraft.world.level.LevelInfo.isHardcore(); }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
// public static java.lang.String getLevelName() { return net.minecraft.world.level.LevelInfo.getLevelName(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public static yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.level.LevelInfo.getDifficulty()); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
// public static yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(net.minecraft.world.level.LevelInfo.getGameRules()); }
public yarnwrap.world.level.LevelInfo withDifficulty(yarnwrap.world.Difficulty difficulty) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withDifficulty(difficulty.wrapperContained)); }
// public static yarnwrap.world.level.LevelInfo withDifficulty(yarnwrap.world.Difficulty difficulty, ) { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.LevelInfo.withDifficulty(difficulty.wrapperContained)); }
public yarnwrap.world.level.LevelInfo withGameMode(yarnwrap.world.GameMode mode) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withGameMode(mode.wrapperContained)); }
// public static yarnwrap.world.level.LevelInfo withGameMode(yarnwrap.world.GameMode mode, ) { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.LevelInfo.withGameMode(mode.wrapperContained)); }
// public yarnwrap.world.level.LevelInfo fromDynamic(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration) { return new yarnwrap.world.level.LevelInfo(wrapperContained.fromDynamic(dynamic,dataConfiguration.wrapperContained)); }
// public static yarnwrap.world.level.LevelInfo fromDynamic(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration, ) { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.LevelInfo.fromDynamic(dynamic,dataConfiguration.wrapperContained)); }
// public yarnwrap.world.Difficulty method_28384(java.lang.Number difficulty) { return new yarnwrap.world.Difficulty(wrapperContained.method_28384(difficulty)); }
// public static yarnwrap.world.Difficulty method_28384(java.lang.Number difficulty, ) { return new yarnwrap.world.Difficulty(net.minecraft.world.level.LevelInfo.method_28384(difficulty)); }
public yarnwrap.world.level.LevelInfo withCopiedGameRules() { return new yarnwrap.world.level.LevelInfo(wrapperContained.withCopiedGameRules()); }
// public static yarnwrap.world.level.LevelInfo withCopiedGameRules() { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.LevelInfo.withCopiedGameRules()); }
public yarnwrap.world.level.LevelInfo withDataConfiguration(yarnwrap.resource.DataConfiguration dataConfiguration) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withDataConfiguration(dataConfiguration.wrapperContained)); }
// public static yarnwrap.world.level.LevelInfo withDataConfiguration(yarnwrap.resource.DataConfiguration dataConfiguration, ) { return new yarnwrap.world.level.LevelInfo(net.minecraft.world.level.LevelInfo.withDataConfiguration(dataConfiguration.wrapperContained)); }
public yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.getDataConfiguration()); }
// public static yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(net.minecraft.world.level.LevelInfo.getDataConfiguration()); }

}