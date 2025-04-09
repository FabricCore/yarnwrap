package yarnwrap.client.session.telemetry;
public class SentTelemetryEvent { public net.minecraft.client.session.telemetry.SentTelemetryEvent wrapperContained; public SentTelemetryEvent(net.minecraft.client.session.telemetry.SentTelemetryEvent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.authlib.minecraft.TelemetryEvent createEvent(com.mojang.authlib.minecraft.TelemetrySession session) { return wrapperContained.createEvent(session); }

}