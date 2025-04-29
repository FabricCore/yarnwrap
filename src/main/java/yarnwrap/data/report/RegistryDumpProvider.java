package yarnwrap.data.report;
public class RegistryDumpProvider { public net.minecraft.data.report.RegistryDumpProvider wrapperContained; public RegistryDumpProvider(net.minecraft.data.report.RegistryDumpProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.RegistryDumpProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.RegistryDumpProvider.output = value.wrapperContained; }

public RegistryDumpProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.report.RegistryDumpProvider(output.wrapperContained); }
// public void method_17174(com.google.gson.JsonObject entry) { wrapperContained.method_17174(entry); }
// public static void method_17174(com.google.gson.JsonObject entry, ) { net.minecraft.data.report.RegistryDumpProvider.method_17174(entry); }
// public com.google.gson.JsonElement toJson(yarnwrap.registry.Registry registry) { return wrapperContained.toJson(registry.wrapperContained); }
// public static com.google.gson.JsonElement toJson(yarnwrap.registry.Registry registry, ) { return net.minecraft.data.report.RegistryDumpProvider.toJson(registry.wrapperContained); }
// public void method_40564(yarnwrap.registry.Registry entry) { wrapperContained.method_40564(entry.wrapperContained); }
// public static void method_40564(yarnwrap.registry.Registry entry, ) { net.minecraft.data.report.RegistryDumpProvider.method_40564(entry.wrapperContained); }

}