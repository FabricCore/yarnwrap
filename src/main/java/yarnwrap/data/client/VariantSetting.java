package yarnwrap.data.client;
public class VariantSetting { public net.minecraft.data.client.VariantSetting wrapperContained; public VariantSetting(net.minecraft.data.client.VariantSetting wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public static java.lang.String key() { return net.minecraft.data.client.VariantSetting.key; }
// public static void key(java.lang.String value, ) { net.minecraft.data.client.VariantSetting.key = value; }

// public java.util.function.Function writer() { return wrapperContained.writer; }
// public void writer(java.util.function.Function value) { wrapperContained.writer = value; }
// public static java.util.function.Function writer() { return net.minecraft.data.client.VariantSetting.writer; }
// public static void writer(java.util.function.Function value, ) { net.minecraft.data.client.VariantSetting.writer = value; }

public VariantSetting(java.lang.String key,java.util.function.Function writer) { this.wrapperContained = new net.minecraft.data.client.VariantSetting(key,writer); }
public Object evaluate(java.lang.Object value) { return wrapperContained.evaluate(value); }
// public static Object evaluate(java.lang.Object value, ) { return net.minecraft.data.client.VariantSetting.evaluate(value); }

}