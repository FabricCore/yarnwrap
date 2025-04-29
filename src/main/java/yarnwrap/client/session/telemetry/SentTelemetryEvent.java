package yarnwrap.client.session.telemetry;
public class SentTelemetryEvent { public net.minecraft.client.session.telemetry.SentTelemetryEvent wrapperContained; public SentTelemetryEvent(net.minecraft.client.session.telemetry.SentTelemetryEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.session.telemetry.SentTelemetryEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.session.telemetry.SentTelemetryEvent.CODEC = value; }

public com.mojang.authlib.minecraft.TelemetryEvent createEvent(com.mojang.authlib.minecraft.TelemetrySession session) { return wrapperContained.createEvent(session); }
// public static com.mojang.authlib.minecraft.TelemetryEvent createEvent(com.mojang.authlib.minecraft.TelemetrySession session, ) { return net.minecraft.client.session.telemetry.SentTelemetryEvent.createEvent(session); }
// public void method_47712(yarnwrap.client.session.telemetry.TelemetryEventType property) { wrapperContained.method_47712(property.wrapperContained); }
// public static void method_47712(yarnwrap.client.session.telemetry.TelemetryEventType property, ) { net.minecraft.client.session.telemetry.SentTelemetryEvent.method_47712(property.wrapperContained); }

}