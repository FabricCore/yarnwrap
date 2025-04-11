package yarnwrap.datafixer.fix;
public class RemoveFilteredBookTextFix { public net.minecraft.datafixer.fix.RemoveFilteredBookTextFix wrapperContained; public RemoveFilteredBookTextFix(net.minecraft.datafixer.fix.RemoveFilteredBookTextFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RemoveFilteredBookTextFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RemoveFilteredBookTextFix(outputSchema); }
// public boolean method_44189(java.lang.String itemId) { return wrapperContained.method_44189(itemId); }

}