package yarnwrap.client.session.telemetry;
public class SampleEvent { public net.minecraft.client.session.telemetry.SampleEvent wrapperContained; public SampleEvent(net.minecraft.client.session.telemetry.SampleEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INTERVAL_IN_MILLIS() { return wrapperContained.INTERVAL_IN_MILLIS; }
// public void INTERVAL_IN_MILLIS(int value) { wrapperContained.INTERVAL_IN_MILLIS = value; }
// public int BATCH_SIZE() { return wrapperContained.BATCH_SIZE; }
// public void BATCH_SIZE(int value) { wrapperContained.BATCH_SIZE = value; }
// public int sampleCount() { return wrapperContained.sampleCount; }
// public void sampleCount(int value) { wrapperContained.sampleCount = value; }
// public boolean enabled() { return wrapperContained.enabled; }
// public void enabled(boolean value) { wrapperContained.enabled = value; }
// public java.time.Instant lastSampleTime() { return wrapperContained.lastSampleTime; }
// public void lastSampleTime(java.time.Instant value) { wrapperContained.lastSampleTime = value; }
public void start() { wrapperContained.start(); }
public void tick(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.tick(sender.wrapperContained); }
public boolean shouldSample() { return wrapperContained.shouldSample(); }
public boolean shouldSend() { return wrapperContained.shouldSend(); }
public void disableSampling() { wrapperContained.disableSampling(); }
// public int getSampleCount() { return wrapperContained.getSampleCount(); }
public void sample() { wrapperContained.sample(); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }

}