package yarnwrap.client.session.telemetry;
public class SampleEvent { public net.minecraft.client.session.telemetry.SampleEvent wrapperContained; public SampleEvent(net.minecraft.client.session.telemetry.SampleEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public int INTERVAL_IN_MILLIS() { return wrapperContained.INTERVAL_IN_MILLIS; }
// public int BATCH_SIZE() { return wrapperContained.BATCH_SIZE; }
// public int sampleCount() { return wrapperContained.sampleCount; }
// public boolean enabled() { return wrapperContained.enabled; }
// public java.time.Instant lastSampleTime() { return wrapperContained.lastSampleTime; }
public void start() { wrapperContained.start(); }
public void tick(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.tick(sender.wrapperContained); }
public boolean shouldSample() { return wrapperContained.shouldSample(); }
public boolean shouldSend() { return wrapperContained.shouldSend(); }
public void disableSampling() { wrapperContained.disableSampling(); }
// public int getSampleCount() { return wrapperContained.getSampleCount(); }
public void sample() { wrapperContained.sample(); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }

}