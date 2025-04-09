package yarnwrap.client.session.telemetry;
public class TelemetryEventType { public net.minecraft.client.session.telemetry.TelemetryEventType wrapperContained; public TelemetryEventType(net.minecraft.client.session.telemetry.TelemetryEventType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_LOADED() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_LOADED); }
public yarnwrap.client.session.telemetry.TelemetryEventType PERFORMANCE_METRICS() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.PERFORMANCE_METRICS); }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_LOAD_TIMES() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_LOAD_TIMES); }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_UNLOADED() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_UNLOADED); }
// public java.util.Map TYPES() { return wrapperContained.TYPES; }
// public java.util.List BASIC_PROPERTIES() { return wrapperContained.BASIC_PROPERTIES; }
// public java.util.List REQUIRED_PROPERTIES() { return wrapperContained.REQUIRED_PROPERTIES; }
// public java.lang.String id() { return wrapperContained.id; }
// public java.lang.String exportKey() { return wrapperContained.exportKey; }
// public java.util.List properties() { return wrapperContained.properties; }
// public boolean optional() { return wrapperContained.optional; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
public yarnwrap.client.session.telemetry.TelemetryEventType ADVANCEMENT_MADE() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.ADVANCEMENT_MADE); }
public yarnwrap.client.session.telemetry.TelemetryEventType GAME_LOAD_TIMES() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.GAME_LOAD_TIMES); }
public java.lang.String getId() { return wrapperContained.getId(); }
public com.mojang.authlib.minecraft.TelemetryEvent createEvent(com.mojang.authlib.minecraft.TelemetrySession session,yarnwrap.client.session.telemetry.PropertyMap properties) { return wrapperContained.createEvent(session,properties.wrapperContained); }
public boolean hasProperty(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { return wrapperContained.hasProperty(property.wrapperContained); }
// public yarnwrap.text.MutableText getText(java.lang.String key) { return new yarnwrap.text.MutableText(wrapperContained.getText(key)); }
public Object builder(java.lang.String id,java.lang.String sentEventId) { return wrapperContained.builder(id,sentEventId); }
public java.util.List getProperties() { return wrapperContained.getProperties(); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public boolean isOptional() { return wrapperContained.isOptional(); }
public yarnwrap.text.MutableText getTitle() { return new yarnwrap.text.MutableText(wrapperContained.getTitle()); }
public yarnwrap.text.MutableText getDescription() { return new yarnwrap.text.MutableText(wrapperContained.getDescription()); }
public java.util.List getTypes() { return wrapperContained.getTypes(); }

}