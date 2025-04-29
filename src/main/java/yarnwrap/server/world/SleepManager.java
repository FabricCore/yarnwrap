package yarnwrap.server.world;
public class SleepManager { public net.minecraft.server.world.SleepManager wrapperContained; public SleepManager(net.minecraft.server.world.SleepManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int total() { return wrapperContained.total; }
// public void total(int value) { wrapperContained.total = value; }
// public static int total() { return net.minecraft.server.world.SleepManager.total; }
// public static void total(int value, ) { net.minecraft.server.world.SleepManager.total = value; }

// public int sleeping() { return wrapperContained.sleeping; }
// public void sleeping(int value) { wrapperContained.sleeping = value; }
// public static int sleeping() { return net.minecraft.server.world.SleepManager.sleeping; }
// public static void sleeping(int value, ) { net.minecraft.server.world.SleepManager.sleeping = value; }

public void clearSleeping() { wrapperContained.clearSleeping(); }
// public static void clearSleeping() { net.minecraft.server.world.SleepManager.clearSleeping(); }
public boolean canSkipNight(int percentage) { return wrapperContained.canSkipNight(percentage); }
// public static boolean canSkipNight(int percentage, ) { return net.minecraft.server.world.SleepManager.canSkipNight(percentage); }
public boolean canResetTime(int percentage,java.util.List players) { return wrapperContained.canResetTime(percentage,players); }
// public static boolean canResetTime(int percentage,java.util.List players, ) { return net.minecraft.server.world.SleepManager.canResetTime(percentage,players); }
public boolean update(java.util.List players) { return wrapperContained.update(players); }
// public static boolean update(java.util.List players, ) { return net.minecraft.server.world.SleepManager.update(players); }
public int getSleeping() { return wrapperContained.getSleeping(); }
// public static int getSleeping() { return net.minecraft.server.world.SleepManager.getSleeping(); }
public int getNightSkippingRequirement(int percentage) { return wrapperContained.getNightSkippingRequirement(percentage); }
// public static int getNightSkippingRequirement(int percentage, ) { return net.minecraft.server.world.SleepManager.getNightSkippingRequirement(percentage); }

}