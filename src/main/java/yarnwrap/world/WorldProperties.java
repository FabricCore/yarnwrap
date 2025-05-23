package yarnwrap.world;
public class WorldProperties { public net.minecraft.world.WorldProperties wrapperContained; public WorldProperties(net.minecraft.world.WorldProperties wrapperContained) { this.wrapperContained = wrapperContained; }

public void populateCrashReport(yarnwrap.util.crash.CrashReportSection reportSection,yarnwrap.world.HeightLimitView world) { wrapperContained.populateCrashReport(reportSection.wrapperContained,world.wrapperContained); }
// public static void populateCrashReport(yarnwrap.util.crash.CrashReportSection reportSection,yarnwrap.world.HeightLimitView world, ) { net.minecraft.world.WorldProperties.populateCrashReport(reportSection.wrapperContained,world.wrapperContained); }
public boolean isHardcore() { return wrapperContained.isHardcore(); }
// public static boolean isHardcore() { return net.minecraft.world.WorldProperties.isHardcore(); }
public boolean isRaining() { return wrapperContained.isRaining(); }
// public static boolean isRaining() { return net.minecraft.world.WorldProperties.isRaining(); }
public void setRaining(boolean raining) { wrapperContained.setRaining(raining); }
// public static void setRaining(boolean raining, ) { net.minecraft.world.WorldProperties.setRaining(raining); }
public long getTime() { return wrapperContained.getTime(); }
// public static long getTime() { return net.minecraft.world.WorldProperties.getTime(); }
public boolean isDifficultyLocked() { return wrapperContained.isDifficultyLocked(); }
// public static boolean isDifficultyLocked() { return net.minecraft.world.WorldProperties.isDifficultyLocked(); }
public boolean isThundering() { return wrapperContained.isThundering(); }
// public static boolean isThundering() { return net.minecraft.world.WorldProperties.isThundering(); }
public yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(wrapperContained.getDifficulty()); }
// public static yarnwrap.world.Difficulty getDifficulty() { return new yarnwrap.world.Difficulty(net.minecraft.world.WorldProperties.getDifficulty()); }
public long getTimeOfDay() { return wrapperContained.getTimeOfDay(); }
// public static long getTimeOfDay() { return net.minecraft.world.WorldProperties.getTimeOfDay(); }
public float getSpawnAngle() { return wrapperContained.getSpawnAngle(); }
// public static float getSpawnAngle() { return net.minecraft.world.WorldProperties.getSpawnAngle(); }
public yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getSpawnPos()); }
// public static yarnwrap.util.math.BlockPos getSpawnPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.WorldProperties.getSpawnPos()); }

}