package yarnwrap.resource;
public class DataPackSettings { public net.minecraft.resource.DataPackSettings wrapperContained; public DataPackSettings(net.minecraft.resource.DataPackSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.DataPackSettings SAFE_MODE() { return new yarnwrap.resource.DataPackSettings(wrapperContained.SAFE_MODE); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.List enabled() { return wrapperContained.enabled; }
// public java.util.List disabled() { return wrapperContained.disabled; }
public java.util.List getEnabled() { return wrapperContained.getEnabled(); }
public java.util.List getDisabled() { return wrapperContained.getDisabled(); }

}