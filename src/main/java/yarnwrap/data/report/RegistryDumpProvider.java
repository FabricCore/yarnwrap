package yarnwrap.data.report;
public class RegistryDumpProvider { public net.minecraft.data.report.RegistryDumpProvider wrapperContained; public RegistryDumpProvider(net.minecraft.data.report.RegistryDumpProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public com.google.gson.JsonElement toJson(yarnwrap.registry.Registry registry) { return wrapperContained.toJson(registry.wrapperContained); }

}