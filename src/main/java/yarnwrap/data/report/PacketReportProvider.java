package yarnwrap.data.report;
public class PacketReportProvider { public net.minecraft.data.report.PacketReportProvider wrapperContained; public PacketReportProvider(net.minecraft.data.report.PacketReportProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.PacketReportProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.PacketReportProvider.output = value.wrapperContained; }

public PacketReportProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.report.PacketReportProvider(output.wrapperContained); }
// public void method_61083(com.google.gson.JsonObject phase,yarnwrap.network.NetworkPhase states) { wrapperContained.method_61083(phase,states.wrapperContained); }
// public static void method_61083(com.google.gson.JsonObject phase,yarnwrap.network.NetworkPhase states, ) { net.minecraft.data.report.PacketReportProvider.method_61083(phase,states.wrapperContained); }
// public void method_61084(com.google.gson.JsonObject state) { wrapperContained.method_61084(state); }
// public static void method_61084(com.google.gson.JsonObject state, ) { net.minecraft.data.report.PacketReportProvider.method_61084(state); }
// public void method_61085(com.google.gson.JsonObject packetType,yarnwrap.network.packet.PacketType protocolId) { wrapperContained.method_61085(packetType,protocolId.wrapperContained); }
// public static void method_61085(com.google.gson.JsonObject packetType,yarnwrap.network.packet.PacketType protocolId, ) { net.minecraft.data.report.PacketReportProvider.method_61085(packetType,protocolId.wrapperContained); }
// public com.google.gson.JsonElement toJson() { return wrapperContained.toJson(); }
// public static com.google.gson.JsonElement toJson() { return net.minecraft.data.report.PacketReportProvider.toJson(); }

}