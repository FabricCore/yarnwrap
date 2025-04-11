package yarnwrap.client.session.telemetry;
public class TelemetryEventType { public net.minecraft.client.session.telemetry.TelemetryEventType wrapperContained; public TelemetryEventType(net.minecraft.client.session.telemetry.TelemetryEventType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_LOADED() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_LOADED); }
// public void WORLD_LOADED(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.WORLD_LOADED = value.wrapperContained; }
public yarnwrap.client.session.telemetry.TelemetryEventType PERFORMANCE_METRICS() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.PERFORMANCE_METRICS); }
// public void PERFORMANCE_METRICS(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.PERFORMANCE_METRICS = value.wrapperContained; }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_LOAD_TIMES() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_LOAD_TIMES); }
// public void WORLD_LOAD_TIMES(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.WORLD_LOAD_TIMES = value.wrapperContained; }
public yarnwrap.client.session.telemetry.TelemetryEventType WORLD_UNLOADED() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.WORLD_UNLOADED); }
// public void WORLD_UNLOADED(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.WORLD_UNLOADED = value.wrapperContained; }
// public java.util.Map TYPES() { return wrapperContained.TYPES; }
// public void TYPES(java.util.Map value) { wrapperContained.TYPES = value; }
// public java.util.List BASIC_PROPERTIES() { return wrapperContained.BASIC_PROPERTIES; }
// public void BASIC_PROPERTIES(java.util.List value) { wrapperContained.BASIC_PROPERTIES = value; }
// public java.util.List REQUIRED_PROPERTIES() { return wrapperContained.REQUIRED_PROPERTIES; }
// public void REQUIRED_PROPERTIES(java.util.List value) { wrapperContained.REQUIRED_PROPERTIES = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public java.lang.String exportKey() { return wrapperContained.exportKey; }
// public void exportKey(java.lang.String value) { wrapperContained.exportKey = value; }
// public java.util.List properties() { return wrapperContained.properties; }
// public void properties(java.util.List value) { wrapperContained.properties = value; }
// public boolean optional() { return wrapperContained.optional; }
// public void optional(boolean value) { wrapperContained.optional = value; }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
public yarnwrap.client.session.telemetry.TelemetryEventType ADVANCEMENT_MADE() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.ADVANCEMENT_MADE); }
// public void ADVANCEMENT_MADE(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.ADVANCEMENT_MADE = value.wrapperContained; }
public yarnwrap.client.session.telemetry.TelemetryEventType GAME_LOAD_TIMES() { return new yarnwrap.client.session.telemetry.TelemetryEventType(wrapperContained.GAME_LOAD_TIMES); }
// public void GAME_LOAD_TIMES(yarnwrap.client.session.telemetry.TelemetryEventType value) { wrapperContained.GAME_LOAD_TIMES = value.wrapperContained; }
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