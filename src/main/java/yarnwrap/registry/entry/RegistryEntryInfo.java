package yarnwrap.registry.entry;
public class RegistryEntryInfo { public net.minecraft.registry.entry.RegistryEntryInfo wrapperContained; public RegistryEntryInfo(net.minecraft.registry.entry.RegistryEntryInfo wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntryInfo DEFAULT() { return new yarnwrap.registry.entry.RegistryEntryInfo(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.registry.entry.RegistryEntryInfo value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.registry.entry.RegistryEntryInfo DEFAULT() { return new yarnwrap.registry.entry.RegistryEntryInfo(net.minecraft.registry.entry.RegistryEntryInfo.DEFAULT); }
// public static void DEFAULT(yarnwrap.registry.entry.RegistryEntryInfo value, ) { net.minecraft.registry.entry.RegistryEntryInfo.DEFAULT = value.wrapperContained; }


}