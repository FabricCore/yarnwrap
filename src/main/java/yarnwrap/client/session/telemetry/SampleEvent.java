package yarnwrap.client.session.telemetry;
public class SampleEvent { public net.minecraft.client.session.telemetry.SampleEvent wrapperContained; public SampleEvent(net.minecraft.client.session.telemetry.SampleEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INTERVAL_IN_MILLIS() { return wrapperContained.INTERVAL_IN_MILLIS; }
// public void INTERVAL_IN_MILLIS(int value) { wrapperContained.INTERVAL_IN_MILLIS = value; }
// public static int INTERVAL_IN_MILLIS() { return net.minecraft.client.session.telemetry.SampleEvent.INTERVAL_IN_MILLIS; }
// public static void INTERVAL_IN_MILLIS(int value, ) { net.minecraft.client.session.telemetry.SampleEvent.INTERVAL_IN_MILLIS = value; }

// public int BATCH_SIZE() { return wrapperContained.BATCH_SIZE; }
// public void BATCH_SIZE(int value) { wrapperContained.BATCH_SIZE = value; }
// public static int BATCH_SIZE() { return net.minecraft.client.session.telemetry.SampleEvent.BATCH_SIZE; }
// public static void BATCH_SIZE(int value, ) { net.minecraft.client.session.telemetry.SampleEvent.BATCH_SIZE = value; }

// public int sampleCount() { return wrapperContained.sampleCount; }
// public void sampleCount(int value) { wrapperContained.sampleCount = value; }
// public static int sampleCount() { return net.minecraft.client.session.telemetry.SampleEvent.sampleCount; }
// public static void sampleCount(int value, ) { net.minecraft.client.session.telemetry.SampleEvent.sampleCount = value; }

// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public static boolean enabled() { return net.minecraft.client.session.telemetry.SampleEvent.enabled; }
// public static void enabled(boolean value, ) { net.minecraft.client.session.telemetry.SampleEvent.enabled = value; }

// public java.time.Instant lastSampleTime() { return wrapperContained.lastSampleTime; }
// public void lastSampleTime(java.time.Instant value) { wrapperContained.lastSampleTime = value; }
// public static java.time.Instant lastSampleTime() { return net.minecraft.client.session.telemetry.SampleEvent.lastSampleTime; }
// public static void lastSampleTime(java.time.Instant value, ) { net.minecraft.client.session.telemetry.SampleEvent.lastSampleTime = value; }

public void start() { wrapperContained.start(); }
// public static void start() { net.minecraft.client.session.telemetry.SampleEvent.start(); }
public void tick(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.tick(sender.wrapperContained); }
// public static void tick(yarnwrap.client.session.telemetry.TelemetrySender sender, ) { net.minecraft.client.session.telemetry.SampleEvent.tick(sender.wrapperContained); }
public boolean shouldSample() { return wrapperContained.shouldSample(); }
// public static boolean shouldSample() { return net.minecraft.client.session.telemetry.SampleEvent.shouldSample(); }
public boolean shouldSend() { return wrapperContained.shouldSend(); }
// public static boolean shouldSend() { return net.minecraft.client.session.telemetry.SampleEvent.shouldSend(); }
public void disableSampling() { wrapperContained.disableSampling(); }
// public static void disableSampling() { net.minecraft.client.session.telemetry.SampleEvent.disableSampling(); }
// public int getSampleCount() { return wrapperContained.getSampleCount(); }
// public static int getSampleCount() { return net.minecraft.client.session.telemetry.SampleEvent.getSampleCount(); }
public void sample() { wrapperContained.sample(); }
// public static void sample() { net.minecraft.client.session.telemetry.SampleEvent.sample(); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
// public static void send(yarnwrap.client.session.telemetry.TelemetrySender sender, ) { net.minecraft.client.session.telemetry.SampleEvent.send(sender.wrapperContained); }

}