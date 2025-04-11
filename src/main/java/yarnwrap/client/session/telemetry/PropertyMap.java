package yarnwrap.client.session.telemetry;
public class PropertyMap { public net.minecraft.client.session.telemetry.PropertyMap wrapperContained; public PropertyMap(net.minecraft.client.session.telemetry.PropertyMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map backingMap() { return wrapperContained.backingMap; }
// public void backingMap(java.util.Map value) { wrapperContained.backingMap = value; }
public Object builder() { return wrapperContained.builder(); }
public java.lang.Object get(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { return wrapperContained.get(property.wrapperContained); }
public com.mojang.serialization.MapCodec createCodec(java.util.List properties) { return wrapperContained.createCodec(properties); }
public java.util.Set keySet() { return wrapperContained.keySet(); }

}