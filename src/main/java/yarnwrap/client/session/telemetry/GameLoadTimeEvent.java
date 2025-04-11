package yarnwrap.client.session.telemetry;
public class GameLoadTimeEvent { public net.minecraft.client.session.telemetry.GameLoadTimeEvent wrapperContained; public GameLoadTimeEvent(net.minecraft.client.session.telemetry.GameLoadTimeEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.session.telemetry.GameLoadTimeEvent INSTANCE() { return new yarnwrap.client.session.telemetry.GameLoadTimeEvent(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.session.telemetry.GameLoadTimeEvent value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.google.common.base.Ticker ticker() { return wrapperContained.ticker; }
// public void ticker(com.google.common.base.Ticker value) { wrapperContained.ticker = value; }
// public java.util.Map stopwatches() { return wrapperContained.stopwatches; }
// public void stopwatches(java.util.Map value) { wrapperContained.stopwatches = value; }
// public java.util.OptionalLong bootstrapTime() { return wrapperContained.bootstrapTime; }
// public void bootstrapTime(java.util.OptionalLong value) { wrapperContained.bootstrapTime = value; }
public void setBootstrapTime(long bootstrapTime) { wrapperContained.setBootstrapTime(bootstrapTime); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
public void startTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.startTimer(property.wrapperContained); }
public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,com.google.common.base.Stopwatch stopwatch) { wrapperContained.addTimer(property.wrapperContained,stopwatch); }
// public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,java.util.function.Function stopwatchProvider) { wrapperContained.addTimer(property.wrapperContained,stopwatchProvider); }
public void stopTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.stopTimer(property.wrapperContained); }

}