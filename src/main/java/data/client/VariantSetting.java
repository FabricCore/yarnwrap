package yarnwrap.data.client;
public class VariantSetting { public net.minecraft.data.client.VariantSetting wrapperContained; public VariantSetting(net.minecraft.data.client.VariantSetting wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public java.util.function.Function writer() { return wrapperContained.writer; }
public Object evaluate(java.lang.Object value) { return wrapperContained.evaluate(value); }

}