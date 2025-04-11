package yarnwrap.client.util;
public class Backoff { public net.minecraft.client.util.Backoff wrapperContained; public Backoff(net.minecraft.client.util.Backoff wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.Backoff ONE_CYCLE() { return new yarnwrap.client.util.Backoff(wrapperContained.ONE_CYCLE); }
// public void ONE_CYCLE(yarnwrap.client.util.Backoff value) { wrapperContained.ONE_CYCLE = value.wrapperContained; }
public long success() { return wrapperContained.success(); }
// public yarnwrap.client.util.Backoff exponential(int maxSkippableCycles) { return new yarnwrap.client.util.Backoff(wrapperContained.exponential(maxSkippableCycles)); }
public long fail() { return wrapperContained.fail(); }

}