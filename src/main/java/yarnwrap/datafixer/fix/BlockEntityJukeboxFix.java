package yarnwrap.datafixer.fix;
public class BlockEntityJukeboxFix { public net.minecraft.datafixer.fix.BlockEntityJukeboxFix wrapperContained; public BlockEntityJukeboxFix(net.minecraft.datafixer.fix.BlockEntityJukeboxFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityJukeboxFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityJukeboxFix(outputSchema,changesType); }

}