package yarnwrap.world.level;
public class LevelInfo { public net.minecraft.world.level.LevelInfo wrapperContained; public LevelInfo(net.minecraft.world.level.LevelInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public yarnwrap.world.Difficulty difficulty() { return new yarnwrap.world.Difficulty(wrapperContained.difficulty); }
// public yarnwrap.world.GameRules gameRules() { return new yarnwrap.world.GameRules(wrapperContained.gameRules); }
// public yarnwrap.resource.DataConfiguration dataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.dataConfiguration); }
// public yarnwrap.world.GameMode gameMode() { return new yarnwrap.world.GameMode(wrapperContained.gameMode); }
// public boolean allowCommands() { return wrapperContained.allowCommands; }
// public boolean hardcore() { return wrapperContained.hardcore; }
public java.lang.String getLevelName() { return wrapperContained.getLevelName(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
public yarnwrap.world.level.LevelInfo withDifficulty(yarnwrap.world.Difficulty difficulty) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withDifficulty(difficulty.wrapperContained)); }
public yarnwrap.world.level.LevelInfo withGameMode(yarnwrap.world.GameMode mode) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withGameMode(mode.wrapperContained)); }
public yarnwrap.world.level.LevelInfo fromDynamic(com.mojang.serialization.Dynamic dynamic,yarnwrap.resource.DataConfiguration dataConfiguration) { return new yarnwrap.world.level.LevelInfo(wrapperContained.fromDynamic(dynamic,dataConfiguration.wrapperContained)); }
public yarnwrap.world.level.LevelInfo withCopiedGameRules() { return new yarnwrap.world.level.LevelInfo(wrapperContained.withCopiedGameRules()); }
public yarnwrap.world.level.LevelInfo withDataConfiguration(yarnwrap.resource.DataConfiguration dataConfiguration) { return new yarnwrap.world.level.LevelInfo(wrapperContained.withDataConfiguration(dataConfiguration.wrapperContained)); }
public yarnwrap.resource.DataConfiguration getDataConfiguration() { return new yarnwrap.resource.DataConfiguration(wrapperContained.getDataConfiguration()); }
public yarnwrap.world.GameMode getGameMode() { return new yarnwrap.world.GameMode(wrapperContained.getGameMode()); }
public boolean areCommandsAllowed() { return wrapperContained.areCommandsAllowed(); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }

}