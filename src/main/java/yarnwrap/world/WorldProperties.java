package yarnwrap.world;
public class WorldProperties { public net.minecraft.world.WorldProperties wrapperContained; public WorldProperties(net.minecraft.world.WorldProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.GameRules getGameRules() { return new yarnwrap.world.GameRules(wrapperContained.getGameRules()); }
public void populateCrashReport(yarnwrap.util.crash.CrashReportSection reportSection,yarnwrap.world.HeightLimitView world) { wrapperContained.populateCrashReport(reportSection.wrapperContained,world.wrapperContained); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
public boolean isRaining() { return wrapperContained.isRaining(); }
public void setRaining(boolean raining) { wrapperContained.setRaining(raining); }
public long getTime() { return wrapperContained.getTime(); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
public boolean isThundering() { return wrapperContained.isThundering(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
public yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPos()); }

}