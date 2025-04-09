package yarnwrap.client.render;
public class FpsSmoother { public net.minecraft.client.render.FpsSmoother wrapperContained; public FpsSmoother(net.minecraft.client.render.FpsSmoother wrapperContained) { this.wrapperContained = wrapperContained; }

// public long[] times() { return wrapperContained.times; }
// public int size() { return wrapperContained.size; }
// public int index() { return wrapperContained.index; }
public long getTargetUsedTime(long time) { return wrapperContained.getTargetUsedTime(time); }

}