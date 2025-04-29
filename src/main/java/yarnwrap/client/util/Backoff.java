package yarnwrap.client.util;
public class Backoff { public net.minecraft.client.util.Backoff wrapperContained; public Backoff(net.minecraft.client.util.Backoff wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.util.Backoff ONE_CYCLE() { return new yarnwrap.client.util.Backoff(wrapperContained.ONE_CYCLE); }
// public void ONE_CYCLE(yarnwrap.client.util.Backoff value) { wrapperContained.ONE_CYCLE = value.wrapperContained; }
public static yarnwrap.client.util.Backoff ONE_CYCLE() { return new yarnwrap.client.util.Backoff(net.minecraft.client.util.Backoff.ONE_CYCLE); }
// public static void ONE_CYCLE(yarnwrap.client.util.Backoff value, ) { net.minecraft.client.util.Backoff.ONE_CYCLE = value.wrapperContained; }

public long success() { return wrapperContained.success(); }
// public static long success() { return net.minecraft.client.util.Backoff.success(); }
// public yarnwrap.client.util.Backoff exponential(int maxSkippableCycles) { return new yarnwrap.client.util.Backoff(wrapperContained.exponential(maxSkippableCycles)); }
// public static yarnwrap.client.util.Backoff exponential(int maxSkippableCycles, ) { return new yarnwrap.client.util.Backoff(net.minecraft.client.util.Backoff.exponential(maxSkippableCycles)); }
public long fail() { return wrapperContained.fail(); }
// public static long fail() { return net.minecraft.client.util.Backoff.fail(); }

}