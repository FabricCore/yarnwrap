package yarnwrap.client.session.telemetry;
public class GameLoadTimeEvent { public net.minecraft.client.session.telemetry.GameLoadTimeEvent wrapperContained; public GameLoadTimeEvent(net.minecraft.client.session.telemetry.GameLoadTimeEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.session.telemetry.GameLoadTimeEvent INSTANCE() { return new yarnwrap.client.session.telemetry.GameLoadTimeEvent(wrapperContained.INSTANCE); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.google.common.base.Ticker ticker() { return wrapperContained.ticker; }
// public java.util.Map stopwatches() { return wrapperContained.stopwatches; }
// public java.util.OptionalLong bootstrapTime() { return wrapperContained.bootstrapTime; }
public void setBootstrapTime(long bootstrapTime) { wrapperContained.setBootstrapTime(bootstrapTime); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
public void startTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.startTimer(property.wrapperContained); }
public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,com.google.common.base.Stopwatch stopwatch) { wrapperContained.addTimer(property.wrapperContained,stopwatch); }
// public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,java.util.function.Function stopwatchProvider) { wrapperContained.addTimer(property.wrapperContained,stopwatchProvider); }
public void stopTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.stopTimer(property.wrapperContained); }

}