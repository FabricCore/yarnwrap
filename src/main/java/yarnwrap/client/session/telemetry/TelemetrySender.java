package yarnwrap.client.session.telemetry;
public class TelemetrySender { public net.minecraft.client.session.telemetry.TelemetrySender wrapperContained; public TelemetrySender(net.minecraft.client.session.telemetry.TelemetrySender wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.session.telemetry.TelemetrySender NOOP() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.client.session.telemetry.TelemetrySender value) { wrapperContained.NOOP = value.wrapperContained; }
public static yarnwrap.client.session.telemetry.TelemetrySender NOOP() { return new yarnwrap.client.session.telemetry.TelemetrySender(net.minecraft.client.session.telemetry.TelemetrySender.NOOP); }
// public static void NOOP(yarnwrap.client.session.telemetry.TelemetrySender value, ) { net.minecraft.client.session.telemetry.TelemetrySender.NOOP = value.wrapperContained; }

public yarnwrap.client.session.telemetry.TelemetrySender decorate(java.util.function.Consumer decorationAdder) { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.decorate(decorationAdder)); }
// public static yarnwrap.client.session.telemetry.TelemetrySender decorate(java.util.function.Consumer decorationAdder, ) { return new yarnwrap.client.session.telemetry.TelemetrySender(net.minecraft.client.session.telemetry.TelemetrySender.decorate(decorationAdder)); }
// public void method_47717(yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer propertyAdder) { wrapperContained.method_47717(eventType.wrapperContained,propertyAdder); }
// public static void method_47717(yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer propertyAdder, ) { net.minecraft.client.session.telemetry.TelemetrySender.method_47717(eventType.wrapperContained,propertyAdder); }
// public void method_47718(java.util.function.Consumer eventType,yarnwrap.client.session.telemetry.TelemetryEventType propertyAdder) { wrapperContained.method_47718(eventType,propertyAdder.wrapperContained); }
// public static void method_47718(java.util.function.Consumer eventType,yarnwrap.client.session.telemetry.TelemetryEventType propertyAdder, ) { net.minecraft.client.session.telemetry.TelemetrySender.method_47718(eventType,propertyAdder.wrapperContained); }
// public void method_47719(java.util.function.Consumer builder) { wrapperContained.method_47719(builder); }
// public static void method_47719(java.util.function.Consumer builder, ) { net.minecraft.client.session.telemetry.TelemetrySender.method_47719(builder); }
public void send(yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer propertyAdder) { wrapperContained.send(eventType.wrapperContained,propertyAdder); }
// public static void send(yarnwrap.client.session.telemetry.TelemetryEventType eventType,java.util.function.Consumer propertyAdder, ) { net.minecraft.client.session.telemetry.TelemetrySender.send(eventType.wrapperContained,propertyAdder); }

}