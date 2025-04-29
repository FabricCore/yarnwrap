package yarnwrap.client.render;
public class FpsSmoother { public net.minecraft.client.render.FpsSmoother wrapperContained; public FpsSmoother(net.minecraft.client.render.FpsSmoother wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] times() { return wrapperContained.times; }
// public void times(long[] value) { wrapperContained.times = value; }
// public static long[] times() { return net.minecraft.client.render.FpsSmoother.times; }
// public static void times(long[] value, ) { net.minecraft.client.render.FpsSmoother.times = value; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.client.render.FpsSmoother.size; }
// public static void size(int value, ) { net.minecraft.client.render.FpsSmoother.size = value; }

// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
// public static int index() { return net.minecraft.client.render.FpsSmoother.index; }
// public static void index(int value, ) { net.minecraft.client.render.FpsSmoother.index = value; }

public FpsSmoother(int size) { this.wrapperContained = new net.minecraft.client.render.FpsSmoother(size); }
public long getTargetUsedTime(long time) { return wrapperContained.getTargetUsedTime(time); }
// public static long getTargetUsedTime(long time, ) { return net.minecraft.client.render.FpsSmoother.getTargetUsedTime(time); }

}