package yarnwrap.client.session.telemetry;
public class TelemetryLogger { public net.minecraft.client.session.telemetry.TelemetryLogger wrapperContained; public TelemetryLogger(net.minecraft.client.session.telemetry.TelemetryLogger wrapperContained) { this.wrapperContained = wrapperContained; }

public void log(yarnwrap.client.session.telemetry.SentTelemetryEvent event) { wrapperContained.log(event.wrapperContained); }
// public static void log(yarnwrap.client.session.telemetry.SentTelemetryEvent event, ) { net.minecraft.client.session.telemetry.TelemetryLogger.log(event.wrapperContained); }

}