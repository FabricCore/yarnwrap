package yarnwrap.resource;
public class DataPackSettings { public net.minecraft.resource.DataPackSettings wrapperContained; public DataPackSettings(net.minecraft.resource.DataPackSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.DataPackSettings SAFE_MODE() { return new yarnwrap.resource.DataPackSettings(wrapperContained.SAFE_MODE); }
// public void SAFE_MODE(yarnwrap.resource.DataPackSettings value) { wrapperContained.SAFE_MODE = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.List enabled() { return wrapperContained.enabled; }
// public void enabled(java.util.List value) { wrapperContained.enabled = value; }
// public java.util.List disabled() { return wrapperContained.disabled; }
// public void disabled(java.util.List value) { wrapperContained.disabled = value; }
public java.util.List getEnabled() { return wrapperContained.getEnabled(); }
public java.util.List getDisabled() { return wrapperContained.getDisabled(); }

}