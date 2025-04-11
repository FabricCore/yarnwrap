package yarnwrap.server.world;
public class SleepManager { public net.minecraft.server.world.SleepManager wrapperContained; public SleepManager(net.minecraft.server.world.SleepManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int total() { return wrapperContained.total; }
// public void total(int value) { wrapperContained.total = value; }
// public int sleeping() { return wrapperContained.sleeping; }
// public void sleeping(int value) { wrapperContained.sleeping = value; }
public void clearSleeping() { wrapperContained.clearSleeping(); }
public boolean canSkipNight(int percentage) { return wrapperContained.canSkipNight(percentage); }
public boolean canResetTime(int percentage,java.util.List players) { return wrapperContained.canResetTime(percentage,players); }
public boolean update(java.util.List players) { return wrapperContained.update(players); }
public int getSleeping() { return wrapperContained.getSleeping(); }
public int getNightSkippingRequirement(int percentage) { return wrapperContained.getNightSkippingRequirement(percentage); }

}