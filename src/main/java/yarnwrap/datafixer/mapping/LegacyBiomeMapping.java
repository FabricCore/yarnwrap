package yarnwrap.datafixer.mapping;
public class LegacyBiomeMapping { public net.minecraft.datafixer.mapping.LegacyBiomeMapping wrapperContained; public LegacyBiomeMapping(net.minecraft.datafixer.mapping.LegacyBiomeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableMap MAP() { return wrapperContained.MAP; }
// public void MAP(com.google.common.collect.ImmutableMap value) { wrapperContained.MAP = value; }
public static com.google.common.collect.ImmutableMap MAP() { return net.minecraft.datafixer.mapping.LegacyBiomeMapping.MAP; }
// public static void MAP(com.google.common.collect.ImmutableMap value, ) { net.minecraft.datafixer.mapping.LegacyBiomeMapping.MAP = value; }


}