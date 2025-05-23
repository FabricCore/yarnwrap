package yarnwrap.data.report;
public class DataPackStructureProvider { public net.minecraft.data.report.DataPackStructureProvider wrapperContained; public DataPackStructureProvider(net.minecraft.data.report.DataPackStructureProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(wrapperContained.output); }
// public void output(yarnwrap.data.DataOutput value) { wrapperContained.output = value.wrapperContained; }
// public static yarnwrap.data.DataOutput output() { return new yarnwrap.data.DataOutput(net.minecraft.data.report.DataPackStructureProvider.output); }
// public static void output(yarnwrap.data.DataOutput value, ) { net.minecraft.data.report.DataPackStructureProvider.output = value.wrapperContained; }

// public Object RELOADABLE_REGISTRY() { return wrapperContained.RELOADABLE_REGISTRY; }
// // public void RELOADABLE_REGISTRY(Object value) { wrapperContained.RELOADABLE_REGISTRY = value; }
// // public static Object RELOADABLE_REGISTRY() { return net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRY; }
// // public static void RELOADABLE_REGISTRY(Object value, ) { net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRY = value; }

// public Object RELOADABLE_REGISTRY_WITH_TAGS() { return wrapperContained.RELOADABLE_REGISTRY_WITH_TAGS; }
// // public void RELOADABLE_REGISTRY_WITH_TAGS(Object value) { wrapperContained.RELOADABLE_REGISTRY_WITH_TAGS = value; }
// // public static Object RELOADABLE_REGISTRY_WITH_TAGS() { return net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRY_WITH_TAGS; }
// // public static void RELOADABLE_REGISTRY_WITH_TAGS(Object value, ) { net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRY_WITH_TAGS = value; }

// public Object DYNAMIC_REGISTRY() { return wrapperContained.DYNAMIC_REGISTRY; }
// // public void DYNAMIC_REGISTRY(Object value) { wrapperContained.DYNAMIC_REGISTRY = value; }
// // public static Object DYNAMIC_REGISTRY() { return net.minecraft.data.report.DataPackStructureProvider.DYNAMIC_REGISTRY; }
// // public static void DYNAMIC_REGISTRY(Object value, ) { net.minecraft.data.report.DataPackStructureProvider.DYNAMIC_REGISTRY = value; }

// public Object STATIC_REGISTRY() { return wrapperContained.STATIC_REGISTRY; }
// // public void STATIC_REGISTRY(Object value) { wrapperContained.STATIC_REGISTRY = value; }
// // public static Object STATIC_REGISTRY() { return net.minecraft.data.report.DataPackStructureProvider.STATIC_REGISTRY; }
// // public static void STATIC_REGISTRY(Object value, ) { net.minecraft.data.report.DataPackStructureProvider.STATIC_REGISTRY = value; }

// public java.util.Map RELOADABLE_REGISTRIES() { return wrapperContained.RELOADABLE_REGISTRIES; }
// public void RELOADABLE_REGISTRIES(java.util.Map value) { wrapperContained.RELOADABLE_REGISTRIES = value; }
// public static java.util.Map RELOADABLE_REGISTRIES() { return net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRIES; }
// public static void RELOADABLE_REGISTRIES(java.util.Map value, ) { net.minecraft.data.report.DataPackStructureProvider.RELOADABLE_REGISTRIES = value; }

// public java.util.Map FAKE_REGISTRIES() { return wrapperContained.FAKE_REGISTRIES; }
// public void FAKE_REGISTRIES(java.util.Map value) { wrapperContained.FAKE_REGISTRIES = value; }
// public static java.util.Map FAKE_REGISTRIES() { return net.minecraft.data.report.DataPackStructureProvider.FAKE_REGISTRIES; }
// public static void FAKE_REGISTRIES(java.util.Map value, ) { net.minecraft.data.report.DataPackStructureProvider.FAKE_REGISTRIES = value; }

// public com.mojang.serialization.Codec REGISTRY_KEY_CODEC() { return wrapperContained.REGISTRY_KEY_CODEC; }
// public void REGISTRY_KEY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_KEY_CODEC = value; }
// public static com.mojang.serialization.Codec REGISTRY_KEY_CODEC() { return net.minecraft.data.report.DataPackStructureProvider.REGISTRY_KEY_CODEC; }
// public static void REGISTRY_KEY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.data.report.DataPackStructureProvider.REGISTRY_KEY_CODEC = value; }

public DataPackStructureProvider(yarnwrap.data.DataOutput output) { this.wrapperContained = new net.minecraft.data.report.DataPackStructureProvider(output.wrapperContained); }
// public void method_62717(java.util.Map registry) { wrapperContained.method_62717(registry); }
// public static void method_62717(java.util.Map registry, ) { net.minecraft.data.report.DataPackStructureProvider.method_62717(registry); }
// public void addEntry(java.util.Map map,yarnwrap.registry.RegistryKey key,Object entry) { wrapperContained.addEntry(map,key.wrapperContained,entry); }
// public static void addEntry(java.util.Map map,yarnwrap.registry.RegistryKey key,Object entry, ) { net.minecraft.data.report.DataPackStructureProvider.addEntry(map,key.wrapperContained,entry); }
// public void method_62719(java.util.Map registry) { wrapperContained.method_62719(registry); }
// public static void method_62719(java.util.Map registry, ) { net.minecraft.data.report.DataPackStructureProvider.method_62719(registry); }
// public java.util.Map buildEntries() { return wrapperContained.buildEntries(); }
// public static java.util.Map buildEntries() { return net.minecraft.data.report.DataPackStructureProvider.buildEntries(); }
// public void method_62721(java.util.Map registry) { wrapperContained.method_62721(registry); }
// public static void method_62721(java.util.Map registry, ) { net.minecraft.data.report.DataPackStructureProvider.method_62721(registry); }
// public void method_62722(java.util.Map key,yarnwrap.registry.RegistryKey entry) { wrapperContained.method_62722(key,entry.wrapperContained); }
// public static void method_62722(java.util.Map key,yarnwrap.registry.RegistryKey entry, ) { net.minecraft.data.report.DataPackStructureProvider.method_62722(key,entry.wrapperContained); }

}