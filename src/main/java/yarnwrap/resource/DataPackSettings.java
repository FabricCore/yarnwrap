package yarnwrap.resource;
public class DataPackSettings { public net.minecraft.resource.DataPackSettings wrapperContained; public DataPackSettings(net.minecraft.resource.DataPackSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.DataPackSettings SAFE_MODE() { return new yarnwrap.resource.DataPackSettings(wrapperContained.SAFE_MODE); }
// public void SAFE_MODE(yarnwrap.resource.DataPackSettings value) { wrapperContained.SAFE_MODE = value.wrapperContained; }
public static yarnwrap.resource.DataPackSettings SAFE_MODE() { return new yarnwrap.resource.DataPackSettings(net.minecraft.resource.DataPackSettings.SAFE_MODE); }
// public static void SAFE_MODE(yarnwrap.resource.DataPackSettings value, ) { net.minecraft.resource.DataPackSettings.SAFE_MODE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.resource.DataPackSettings.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.resource.DataPackSettings.CODEC = value; }

// public java.util.List enabled() { return wrapperContained.enabled; }
// public void enabled(java.util.List value) { wrapperContained.enabled = value; }
// public static java.util.List enabled() { return net.minecraft.resource.DataPackSettings.enabled; }
// public static void enabled(java.util.List value, ) { net.minecraft.resource.DataPackSettings.enabled = value; }

// public java.util.List disabled() { return wrapperContained.disabled; }
// public void disabled(java.util.List value) { wrapperContained.disabled = value; }
// public static java.util.List disabled() { return net.minecraft.resource.DataPackSettings.disabled; }
// public static void disabled(java.util.List value, ) { net.minecraft.resource.DataPackSettings.disabled = value; }

public DataPackSettings(java.util.List enabled,java.util.List disabled) { this.wrapperContained = new net.minecraft.resource.DataPackSettings(enabled,disabled); }
public java.util.List getEnabled() { return wrapperContained.getEnabled(); }
// public static java.util.List getEnabled() { return net.minecraft.resource.DataPackSettings.getEnabled(); }
// public java.util.List method_29548(yarnwrap.resource.DataPackSettings settings) { return wrapperContained.method_29548(settings.wrapperContained); }
// public static java.util.List method_29548(yarnwrap.resource.DataPackSettings settings, ) { return net.minecraft.resource.DataPackSettings.method_29548(settings.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_29549(Object instance) { return wrapperContained.method_29549(instance); }
// public static com.mojang.datafixers.kinds.App method_29549(Object instance, ) { return net.minecraft.resource.DataPackSettings.method_29549(instance); }
public java.util.List getDisabled() { return wrapperContained.getDisabled(); }
// public static java.util.List getDisabled() { return net.minecraft.resource.DataPackSettings.getDisabled(); }
// public java.util.List method_29551(yarnwrap.resource.DataPackSettings settings) { return wrapperContained.method_29551(settings.wrapperContained); }
// public static java.util.List method_29551(yarnwrap.resource.DataPackSettings settings, ) { return net.minecraft.resource.DataPackSettings.method_29551(settings.wrapperContained); }

}