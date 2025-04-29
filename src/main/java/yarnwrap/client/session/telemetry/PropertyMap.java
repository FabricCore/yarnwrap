package yarnwrap.client.session.telemetry;
public class PropertyMap { public net.minecraft.client.session.telemetry.PropertyMap wrapperContained; public PropertyMap(net.minecraft.client.session.telemetry.PropertyMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map backingMap() { return wrapperContained.backingMap; }
// public void backingMap(java.util.Map value) { wrapperContained.backingMap = value; }
// public static java.util.Map backingMap() { return net.minecraft.client.session.telemetry.PropertyMap.backingMap; }
// public static void backingMap(java.util.Map value, ) { net.minecraft.client.session.telemetry.PropertyMap.backingMap = value; }

// public PropertyMap(java.util.Map backingMap) { this.wrapperContained = new net.minecraft.client.session.telemetry.PropertyMap(backingMap); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.client.session.telemetry.PropertyMap.builder(); }
public java.lang.Object get(yarnwrap.client.session.telemetry.TelemetryEventProperty property) { return wrapperContained.get(property.wrapperContained); }
// public static java.lang.Object get(yarnwrap.client.session.telemetry.TelemetryEventProperty property, ) { return net.minecraft.client.session.telemetry.PropertyMap.get(property.wrapperContained); }
// public com.mojang.serialization.MapCodec createCodec(java.util.List properties) { return wrapperContained.createCodec(properties); }
// public static com.mojang.serialization.MapCodec createCodec(java.util.List properties, ) { return net.minecraft.client.session.telemetry.PropertyMap.createCodec(properties); }
public java.util.Set keySet() { return wrapperContained.keySet(); }
// public static java.util.Set keySet() { return net.minecraft.client.session.telemetry.PropertyMap.keySet(); }

}