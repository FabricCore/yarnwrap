package yarnwrap.client.session.telemetry;
public class TelemetrySender { public net.minecraft.client.session.telemetry.TelemetrySender wrapperContained; public TelemetrySender(net.minecraft.client.session.telemetry.TelemetrySender wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.session.telemetry.TelemetrySender NOOP() { return new yarnwrap.client.session.telemetry.TelemetrySender(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.client.session.telemetry.TelemetrySender value) { wrapperContained.NOOP = value.wrapperContained; }

}