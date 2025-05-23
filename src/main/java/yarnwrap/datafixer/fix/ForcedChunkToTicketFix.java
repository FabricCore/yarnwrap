package yarnwrap.datafixer.fix;
public class ForcedChunkToTicketFix { public net.minecraft.datafixer.fix.ForcedChunkToTicketFix wrapperContained; public ForcedChunkToTicketFix(net.minecraft.datafixer.fix.ForcedChunkToTicketFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ForcedChunkToTicketFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ForcedChunkToTicketFix(outputSchema); }

}