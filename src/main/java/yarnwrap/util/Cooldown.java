package yarnwrap.util;
public class Cooldown { public net.minecraft.util.Cooldown wrapperContained; public Cooldown(net.minecraft.util.Cooldown wrapperContained) { this.wrapperContained = wrapperContained; }

// public int increment() { return wrapperContained.increment; }
// public void increment(int value) { wrapperContained.increment = value; }
// public static int increment() { return net.minecraft.util.Cooldown.increment; }
// public static void increment(int value, ) { net.minecraft.util.Cooldown.increment = value; }

// public int threshold() { return wrapperContained.threshold; }
// public void threshold(int value) { wrapperContained.threshold = value; }
// public static int threshold() { return net.minecraft.util.Cooldown.threshold; }
// public static void threshold(int value, ) { net.minecraft.util.Cooldown.threshold = value; }

// public int current() { return wrapperContained.current; }
// public void current(int value) { wrapperContained.current = value; }
// public static int current() { return net.minecraft.util.Cooldown.current; }
// public static void current(int value, ) { net.minecraft.util.Cooldown.current = value; }

public Cooldown(int increment,int threshold) { this.wrapperContained = new net.minecraft.util.Cooldown(increment,threshold); }
// public void increment() { wrapperContained.increment(); }
// // public static void increment() { net.minecraft.util.Cooldown.increment(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.util.Cooldown.tick(); }
public boolean canUse() { return wrapperContained.canUse(); }
// public static boolean canUse() { return net.minecraft.util.Cooldown.canUse(); }

}