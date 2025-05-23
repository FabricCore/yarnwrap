package yarnwrap.text;
public class ParsedSelector { public net.minecraft.text.ParsedSelector wrapperContained; public ParsedSelector(net.minecraft.text.ParsedSelector wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.ParsedSelector.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.ParsedSelector.CODEC = value; }

public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.text.ParsedSelector.equals(o); }
// public com.mojang.serialization.DataResult parse(java.lang.String selector) { return wrapperContained.parse(selector); }
// public static com.mojang.serialization.DataResult parse(java.lang.String selector, ) { return net.minecraft.text.ParsedSelector.parse(selector); }

}