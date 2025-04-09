package yarnwrap.datafixer.mapping;
public class LegacyCoralBlockMapping { public net.minecraft.datafixer.mapping.LegacyCoralBlockMapping wrapperContained; public LegacyCoralBlockMapping(net.minecraft.datafixer.mapping.LegacyCoralBlockMapping wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map MAP() { return wrapperContained.MAP; }

}