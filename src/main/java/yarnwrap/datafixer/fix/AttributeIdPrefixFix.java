package yarnwrap.datafixer.fix;
public class AttributeIdPrefixFix { public net.minecraft.datafixer.fix.AttributeIdPrefixFix wrapperContained; public AttributeIdPrefixFix(net.minecraft.datafixer.fix.AttributeIdPrefixFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List PREFIXES() { return wrapperContained.PREFIXES; }
// public void PREFIXES(java.util.List value) { wrapperContained.PREFIXES = value; }
// public static java.util.List PREFIXES() { return net.minecraft.datafixer.fix.AttributeIdPrefixFix.PREFIXES; }
// public static void PREFIXES(java.util.List value, ) { net.minecraft.datafixer.fix.AttributeIdPrefixFix.PREFIXES = value; }

public AttributeIdPrefixFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.AttributeIdPrefixFix(outputSchema); }
// public java.lang.String removePrefix(java.lang.String id) { return wrapperContained.removePrefix(id); }
// public static java.lang.String removePrefix(java.lang.String id, ) { return net.minecraft.datafixer.fix.AttributeIdPrefixFix.removePrefix(id); }

}