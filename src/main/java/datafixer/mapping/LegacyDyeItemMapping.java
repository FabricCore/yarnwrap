package yarnwrap.datafixer.mapping;
public class LegacyDyeItemMapping { public net.minecraft.datafixer.mapping.LegacyDyeItemMapping wrapperContained; public LegacyDyeItemMapping(net.minecraft.datafixer.mapping.LegacyDyeItemMapping wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map MAP() { return wrapperContained.MAP; }

}