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
// public GameLoadTimeEvent(com.google.common.base.Ticker ticker) { this.wrapperContained = new net.minecraft.client.session.telemetry.GameLoadTimeEvent(ticker); }
public void setBootstrapTime(long bootstrapTime) { wrapperContained.setBootstrapTime(bootstrapTime); }
// public com.google.common.base.Stopwatch method_51804(com.google.common.base.Stopwatch property) { return wrapperContained.method_51804(property); }
public void send(yarnwrap.client.session.telemetry.TelemetrySender sender) { wrapperContained.send(sender.wrapperContained); }
public void startTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.startTimer(property.wrapperContained); }
public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,com.google.common.base.Stopwatch stopwatch) { wrapperContained.addTimer(property.wrapperContained,stopwatch); }
// public void addTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property,java.util.function.Function stopwatchProvider) { wrapperContained.addTimer(property.wrapperContained,stopwatchProvider); }
// public void method_51809(Object properties) { wrapperContained.method_51809(properties); }
// public void method_51810(Object bootstrapTime) { wrapperContained.method_51810(bootstrapTime); }
// public void method_51811(Object property,yarnwrap.client.session.telemetry.TelemetryEventProperty stopwatch) { wrapperContained.method_51811(property,stopwatch.wrapperContained); }
public void stopTimer(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { wrapperContained.stopTimer(property.wrapperContained); }
// public com.google.common.base.Stopwatch method_51813(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { return wrapperContained.method_51813(property.wrapperContained); }

}