package yarnwrap.client.session.telemetry;
public class TelemetryEventProperty { public net.minecraft.client.session.telemetry.TelemetryEventProperty wrapperContained; public TelemetryEventProperty(net.minecraft.client.session.telemetry.TelemetryEventProperty wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.format.DateTimeFormatter DATE_TIME_FORMATTER() { return wrapperContained.DATE_TIME_FORMATTER; }
// public void DATE_TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.DATE_TIME_FORMATTER = value; }
public yarnwrap.text.MutableText getTitle() { return new yarnwrap.text.MutableText(wrapperContained.getTitle()); }
public void addTo(yarnwrap.client.session.telemetry.PropertyMap map,com.mojang.authlib.minecraft.TelemetryPropertyContainer container) { wrapperContained.addTo(map.wrapperContained,container); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofBoolean(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofBoolean(id,exportKey)); }
// public yarnwrap.client.session.telemetry.TelemetryEventProperty of(java.lang.String id,java.lang.String exportKey,com.mojang.serialization.Codec codec,Object exporter) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.of(id,exportKey,codec,exporter)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofString(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofString(id,exportKey)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofInteger(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofInteger(id,exportKey)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofUuid(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofUuid(id,exportKey)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofLongList(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofLongList(id,exportKey)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofLong(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofLong(id,exportKey)); }
public yarnwrap.client.session.telemetry.TelemetryEventProperty ofTimeMeasurement(java.lang.String id,java.lang.String exportKey) { return new yarnwrap.client.session.telemetry.TelemetryEventProperty(wrapperContained.ofTimeMeasurement(id,exportKey)); }

}