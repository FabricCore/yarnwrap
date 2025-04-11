package yarnwrap.client.render;
public class FpsSmoother { public net.minecraft.client.render.FpsSmoother wrapperContained; public FpsSmoother(net.minecraft.client.render.FpsSmoother wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] times() { return wrapperContained.times; }
// public void times(long[] value) { wrapperContained.times = value; }
// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public int index() { return wrapperContained.index; }
// public void index(int value) { wrapperContained.index = value; }
public long getTargetUsedTime(long time) { return wrapperContained.getTargetUsedTime(time); }

}