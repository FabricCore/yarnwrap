package yarnwrap.data.report;
public class PacketReportProvider { public net.minecraft.data.report.PacketReportProvider wrapperContained; public PacketReportProvider(net.minecraft.data.report.PacketReportProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public com.google.gson.JsonElement toJson() { return wrapperContained.toJson(); }

}