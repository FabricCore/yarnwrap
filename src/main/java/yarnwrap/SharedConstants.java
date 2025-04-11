package yarnwrap;
public class SharedConstants { public net.minecraft.SharedConstants wrapperContained; public SharedConstants(net.minecraft.SharedConstants wrapperContained) { this.wrapperContained = wrapperContained; }

public Object RESOURCE_LEAK_DETECTOR_DISABLED() { return wrapperContained.RESOURCE_LEAK_DETECTOR_DISABLED; }
// // public void RESOURCE_LEAK_DETECTOR_DISABLED(Object value) { wrapperContained.RESOURCE_LEAK_DETECTOR_DISABLED = value; }
public boolean isDevelopment() { return wrapperContained.isDevelopment; }
public void isDevelopment(boolean value) { wrapperContained.isDevelopment = value; }
public char[] INVALID_CHARS_LEVEL_NAME() { return wrapperContained.INVALID_CHARS_LEVEL_NAME; }
// public void INVALID_CHARS_LEVEL_NAME(char[] value) { wrapperContained.INVALID_CHARS_LEVEL_NAME = value; }
// public yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(wrapperContained.gameVersion); }
// public void gameVersion(yarnwrap.GameVersion value) { wrapperContained.gameVersion = value.wrapperContained; }
public boolean useChoiceTypeRegistrations() { return wrapperContained.useChoiceTypeRegistrations; }
public void useChoiceTypeRegistrations(boolean value) { wrapperContained.useChoiceTypeRegistrations = value; }
public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
// public void TICKS_PER_SECOND(int value) { wrapperContained.TICKS_PER_SECOND = value; }
public int TICKS_PER_MINUTE() { return wrapperContained.TICKS_PER_MINUTE; }
// public void TICKS_PER_MINUTE(int value) { wrapperContained.TICKS_PER_MINUTE = value; }
public int TICKS_PER_IN_GAME_DAY() { return wrapperContained.TICKS_PER_IN_GAME_DAY; }
// public void TICKS_PER_IN_GAME_DAY(int value) { wrapperContained.TICKS_PER_IN_GAME_DAY = value; }
public boolean IS_DEVELOPMENT_VERSION() { return wrapperContained.IS_DEVELOPMENT_VERSION; }
// public void IS_DEVELOPMENT_VERSION(boolean value) { wrapperContained.IS_DEVELOPMENT_VERSION = value; }
public int DEFAULT_PORT() { return wrapperContained.DEFAULT_PORT; }
// public void DEFAULT_PORT(int value) { wrapperContained.DEFAULT_PORT = value; }
public int CHUNK_WIDTH() { return wrapperContained.CHUNK_WIDTH; }
// public void CHUNK_WIDTH(int value) { wrapperContained.CHUNK_WIDTH = value; }
public int DEFAULT_WORLD_HEIGHT() { return wrapperContained.DEFAULT_WORLD_HEIGHT; }
// public void DEFAULT_WORLD_HEIGHT(int value) { wrapperContained.DEFAULT_WORLD_HEIGHT = value; }
public int COMMAND_MAX_LENGTH() { return wrapperContained.COMMAND_MAX_LENGTH; }
// public void COMMAND_MAX_LENGTH(int value) { wrapperContained.COMMAND_MAX_LENGTH = value; }
public int WORLD_VERSION() { return wrapperContained.WORLD_VERSION; }
// public void WORLD_VERSION(int value) { wrapperContained.WORLD_VERSION = value; }
public java.lang.String VERSION_NAME() { return wrapperContained.VERSION_NAME; }
// public void VERSION_NAME(java.lang.String value) { wrapperContained.VERSION_NAME = value; }
public int RELEASE_TARGET_PROTOCOL_VERSION() { return wrapperContained.RELEASE_TARGET_PROTOCOL_VERSION; }
// public void RELEASE_TARGET_PROTOCOL_VERSION(int value) { wrapperContained.RELEASE_TARGET_PROTOCOL_VERSION = value; }
public int SNBT_TOO_OLD_THRESHOLD() { return wrapperContained.SNBT_TOO_OLD_THRESHOLD; }
// public void SNBT_TOO_OLD_THRESHOLD(int value) { wrapperContained.SNBT_TOO_OLD_THRESHOLD = value; }
public int RESOURCE_PACK_VERSION() { return wrapperContained.RESOURCE_PACK_VERSION; }
// public void RESOURCE_PACK_VERSION(int value) { wrapperContained.RESOURCE_PACK_VERSION = value; }
public int DATA_PACK_VERSION() { return wrapperContained.DATA_PACK_VERSION; }
// public void DATA_PACK_VERSION(int value) { wrapperContained.DATA_PACK_VERSION = value; }
public java.lang.String DATA_VERSION_KEY() { return wrapperContained.DATA_VERSION_KEY; }
// public void DATA_VERSION_KEY(java.lang.String value) { wrapperContained.DATA_VERSION_KEY = value; }
public boolean DEBUG_BIOME_SOURCE() { return wrapperContained.DEBUG_BIOME_SOURCE; }
public void DEBUG_BIOME_SOURCE(boolean value) { wrapperContained.DEBUG_BIOME_SOURCE = value; }
public boolean DEBUG_NOISE() { return wrapperContained.DEBUG_NOISE; }
public void DEBUG_NOISE(boolean value) { wrapperContained.DEBUG_NOISE = value; }
public java.lang.String CURRENT_SERIES() { return wrapperContained.CURRENT_SERIES; }
// public void CURRENT_SERIES(java.lang.String value) { wrapperContained.CURRENT_SERIES = value; }
public boolean CRASH_ON_UNCAUGHT_THREAD_EXCEPTION() { return wrapperContained.CRASH_ON_UNCAUGHT_THREAD_EXCEPTION; }
// public void CRASH_ON_UNCAUGHT_THREAD_EXCEPTION(boolean value) { wrapperContained.CRASH_ON_UNCAUGHT_THREAD_EXCEPTION = value; }
public int EXPANDED_MACRO_COMMAND_MAX_LENGTH() { return wrapperContained.EXPANDED_MACRO_COMMAND_MAX_LENGTH; }
// public void EXPANDED_MACRO_COMMAND_MAX_LENGTH(int value) { wrapperContained.EXPANDED_MACRO_COMMAND_MAX_LENGTH = value; }
public yarnwrap.GameVersion getGameVersion() { return new yarnwrap.GameVersion(wrapperContained.getGameVersion()); }
public int getProtocolVersion() { return wrapperContained.getProtocolVersion(); }
public void setGameVersion(yarnwrap.GameVersion gameVersion) { wrapperContained.setGameVersion(gameVersion.wrapperContained); }
public void createGameVersion() { wrapperContained.createGameVersion(); }
public boolean isOutsideGenerationArea(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isOutsideGenerationArea(pos.wrapperContained); }

}