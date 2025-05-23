package yarnwrap.util;
public class InterpolatedFlipFlop { public net.minecraft.util.InterpolatedFlipFlop wrapperContained; public InterpolatedFlipFlop(net.minecraft.util.InterpolatedFlipFlop wrapperContained) { this.wrapperContained = wrapperContained; }

// public int frames() { return wrapperContained.frames; }
// public void frames(int value) { wrapperContained.frames = value; }
// public static int frames() { return net.minecraft.util.InterpolatedFlipFlop.frames; }
// public static void frames(int value, ) { net.minecraft.util.InterpolatedFlipFlop.frames = value; }

// public Object smoothingFunction() { return wrapperContained.smoothingFunction; }
// // public void smoothingFunction(Object value) { wrapperContained.smoothingFunction = value; }
// // public static Object smoothingFunction() { return net.minecraft.util.InterpolatedFlipFlop.smoothingFunction; }
// // public static void smoothingFunction(Object value, ) { net.minecraft.util.InterpolatedFlipFlop.smoothingFunction = value; }

// public int current() { return wrapperContained.current; }
// public void current(int value) { wrapperContained.current = value; }
// public static int current() { return net.minecraft.util.InterpolatedFlipFlop.current; }
// public static void current(int value, ) { net.minecraft.util.InterpolatedFlipFlop.current = value; }

// public int previous() { return wrapperContained.previous; }
// public void previous(int value) { wrapperContained.previous = value; }
// public static int previous() { return net.minecraft.util.InterpolatedFlipFlop.previous; }
// public static void previous(int value, ) { net.minecraft.util.InterpolatedFlipFlop.previous = value; }

public InterpolatedFlipFlop(int frames) { this.wrapperContained = new net.minecraft.util.InterpolatedFlipFlop(frames); }
// public InterpolatedFlipFlop(int frames,Object smoothingFunction) { this.wrapperContained = new net.minecraft.util.InterpolatedFlipFlop(frames,smoothingFunction); }
public float getValue(float tickProgress) { return wrapperContained.getValue(tickProgress); }
// public static float getValue(float tickProgress, ) { return net.minecraft.util.InterpolatedFlipFlop.getValue(tickProgress); }
public void tick(boolean active) { wrapperContained.tick(active); }
// public static void tick(boolean active, ) { net.minecraft.util.InterpolatedFlipFlop.tick(active); }
// public float method_61341(float tickProgress) { return wrapperContained.method_61341(tickProgress); }
// public static float method_61341(float tickProgress, ) { return net.minecraft.util.InterpolatedFlipFlop.method_61341(tickProgress); }

}