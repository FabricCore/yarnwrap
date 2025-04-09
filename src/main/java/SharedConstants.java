package yarnwrap;
public class SharedConstants { public net.minecraft.SharedConstants wrapperContained; public SharedConstants(net.minecraft.SharedConstants wrapperContained) { this.wrapperContained = wrapperContained; }

public Object RESOURCE_LEAK_DETECTOR_DISABLED() { return wrapperContained.RESOURCE_LEAK_DETECTOR_DISABLED; }
public boolean isDevelopment() { return wrapperContained.isDevelopment; }
public char[] INVALID_CHARS_LEVEL_NAME() { return wrapperContained.INVALID_CHARS_LEVEL_NAME; }
// public yarnwrap.GameVersion gameVersion() { return new yarnwrap.GameVersion(wrapperContained.gameVersion); }
public boolean useChoiceTypeRegistrations() { return wrapperContained.useChoiceTypeRegistrations; }
public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
public int TICKS_PER_MINUTE() { return wrapperContained.TICKS_PER_MINUTE; }
public int TICKS_PER_IN_GAME_DAY() { return wrapperContained.TICKS_PER_IN_GAME_DAY; }
public boolean IS_DEVELOPMENT_VERSION() { return wrapperContained.IS_DEVELOPMENT_VERSION; }
public int DEFAULT_PORT() { return wrapperContained.DEFAULT_PORT; }
public int CHUNK_WIDTH() { return wrapperContained.CHUNK_WIDTH; }
public int DEFAULT_WORLD_HEIGHT() { return wrapperContained.DEFAULT_WORLD_HEIGHT; }
public int COMMAND_MAX_LENGTH() { return wrapperContained.COMMAND_MAX_LENGTH; }
public int WORLD_VERSION() { return wrapperContained.WORLD_VERSION; }
public java.lang.String VERSION_NAME() { return wrapperContained.VERSION_NAME; }
public int RELEASE_TARGET_PROTOCOL_VERSION() { return wrapperContained.RELEASE_TARGET_PROTOCOL_VERSION; }
public int SNBT_TOO_OLD_THRESHOLD() { return wrapperContained.SNBT_TOO_OLD_THRESHOLD; }
public int RESOURCE_PACK_VERSION() { return wrapperContained.RESOURCE_PACK_VERSION; }
public int DATA_PACK_VERSION() { return wrapperContained.DATA_PACK_VERSION; }
public java.lang.String DATA_VERSION_KEY() { return wrapperContained.DATA_VERSION_KEY; }
public boolean DEBUG_BIOME_SOURCE() { return wrapperContained.DEBUG_BIOME_SOURCE; }
public boolean DEBUG_NOISE() { return wrapperContained.DEBUG_NOISE; }
public java.lang.String CURRENT_SERIES() { return wrapperContained.CURRENT_SERIES; }
public boolean CRASH_ON_UNCAUGHT_THREAD_EXCEPTION() { return wrapperContained.CRASH_ON_UNCAUGHT_THREAD_EXCEPTION; }
public int EXPANDED_MACRO_COMMAND_MAX_LENGTH() { return wrapperContained.EXPANDED_MACRO_COMMAND_MAX_LENGTH; }
public yarnwrap.GameVersion getGameVersion() { return new yarnwrap.GameVersion(wrapperContained.getGameVersion()); }
public int getProtocolVersion() { return wrapperContained.getProtocolVersion(); }
public void setGameVersion(yarnwrap.GameVersion gameVersion) { wrapperContained.setGameVersion(gameVersion.wrapperContained); }
public void createGameVersion() { wrapperContained.createGameVersion(); }
public boolean isOutsideGenerationArea(yarnwrap.util.math.ChunkPos pos) { return wrapperContained.isOutsideGenerationArea(pos.wrapperContained); }

}