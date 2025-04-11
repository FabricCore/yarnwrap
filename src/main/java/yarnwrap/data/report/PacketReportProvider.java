package yarnwrap.data.report;
public class PacketReportProvider { public net.minecraft.data.report.PacketReportProvider wrapperContained; public PacketReportProvider(net.minecraft.data.report.PacketReportProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
public PacketReportProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.report.PacketReportProvider(output.wrapperContained); }
// public void method_61083(com.google.gson.JsonObject phase,yarnwrap.network.NetworkPhase states) { wrapperContained.method_61083(phase,states.wrapperContained); }
// public void method_61084(com.google.gson.JsonObject state) { wrapperContained.method_61084(state); }
// public void method_61085(com.google.gson.JsonObject packetType,yarnwrap.network.packet.PacketType protocolId) { wrapperContained.method_61085(packetType,protocolId.wrapperContained); }
// public com.google.gson.JsonElement toJson() { return wrapperContained.toJson(); }

}