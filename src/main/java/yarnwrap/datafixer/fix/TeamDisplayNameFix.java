package yarnwrap.datafixer.fix;
public class TeamDisplayNameFix { public net.minecraft.datafixer.fix.TeamDisplayNameFix wrapperContained; public TeamDisplayNameFix(net.minecraft.datafixer.fix.TeamDisplayNameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public TeamDisplayNameFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.TeamDisplayNameFix(outputSchema,changesType); }

}